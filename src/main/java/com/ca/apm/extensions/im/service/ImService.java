package com.ca.apm.extensions.im.service;

import com.ca.apm.extensions.base.service.ADynamicService;
import com.ca.apm.extensions.base.service.IConstants;
import com.ca.apm.extensions.utils.CommonEncryptionProvider;

import tews6.wsdl.Tews6Locator;
import tews6.wsdl.Tews6PortType;
import tews6.wsdl.TaskContext;

import com.google.common.base.Throwables;
import com.wily.introscope.agent.IAgent;
import com.wily.util.heartbeat.IRegisteredBehavior;

import org.apache.axis.client.Stub;
import org.apache.axis.client.Call;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImService extends ADynamicService {

    // handles for the registered tasks
    private List<IRegisteredBehavior> registeredBehaviorList;

    // encryption provider
    private CommonEncryptionProvider cep;

    // task context for SOAP calls
    private TaskContext context;

    // stub for SOAP calls
    private Tews6PortType soapService;

    public static final String kImUrl = "im.url";
    public static final String kImAuthUser = "im.authorization.user";
    public static final String kImAuthPassword = "im.authorization.password";
    public static final String kImAdminUser = "im.admin.user";
    public static final String kImAdminPassword = "im.admin.password";

    public static final int kSoapTimeoutSecs = 10;

    /**
     * Encrypt password.
     *
     */
    public static void main(String[] argv) {

        if (argv.length < 1) {
            System.err.println("Usage: java -jar <jarfile> <password to encrypt>");
            System.exit(1);
        }

        try {
            CommonEncryptionProvider cep = new CommonEncryptionProvider();
            System.out.println(cep.encrypt(argv[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void propertyValueChanged(String name, boolean value) {
        // do nothing
    }

    @Override
    public void propertyValueChanged(String name, Object object) {
        // do nothing
    }

    @Override
    public void propertyValueChanged(String name, int newValue) {
        // do nothing
    }

    @Override
    public int getPollingInterval() {
        return 60 * 1000;
    }

    @Override
    public boolean getCleanAttributes() {
        return false;
    }

    @Override
    public boolean isSustainabilityEnabled() {
        return true;
    }

    @Override
    public boolean isConnected() {
        return isRunning();
    }

    @Override
    public String getAtcVertexType() {
        return "IdentityManager";
    }

    @Override
    public String getAtcPrefix() {
        return "im_";
    }

    @Override
    public String getServiceName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void IAgentService_startService(IAgent agent, Map parameters) throws Exception {
        super.IAgentService_startService(agent, parameters);

        cep = new CommonEncryptionProvider();

        soapService = initServiceStub();

        // create task context
        String adminUser = getProperty(kImAdminUser);
        String adminPwd = getProperty(kImAdminPassword);

        context = new TaskContext();
        context.setAdmin_id(adminUser);

        if (null != adminPwd && adminPwd.length() > 0) {
            context.setAdmin_password(adminPwd);
        } else {
            log.info("adminPwd is empty and not sent");
        }

        // configure and start the tasks
        registeredBehaviorList = new ArrayList<IRegisteredBehavior>();

        try {
            registerTasks(agent);
        } catch (Exception e) {
            log.error("exception in startService(): " + Throwables.getStackTraceAsString(e), e);
        }
    }

    @Override
    public void IAgentService_stopService(IAgent agent) throws Exception {
        super.IAgentService_stopService(agent);

        // remove all registered tasks
        for (IRegisteredBehavior behavior: registeredBehaviorList) {
            agent.IAgent_getCommonHeartbeat().removeBehavior(behavior);
        }
    }

    /**
     * Register the tasks.
     * @param agent the agent
     */
    public void registerTasks(IAgent agent) {

        // configure and start reset user password task
        if (IConstants.TRUE.equals(getProperty(
                ResetUserPasswordTask.kImResetUserPasswordEnabled).toLowerCase())) {

            long interval = Long.parseLong(getProperty(
                    ResetUserPasswordTask.kImResetUserPasswordInterval));

            IRegisteredBehavior behavior = agent.IAgent_getCommonHeartbeat().addBehavior(
                    new ResetUserPasswordTask(agent, this, log),
                    "IM Reset User Password Task", true, interval, false);
            registeredBehaviorList.add(behavior);

            log.info("IM Reset User Password Task started with interval = " + interval);
        }
    }

    public Tews6PortType getSoapService() {
        return soapService;
    }

    public TaskContext getTaskContext() {
        return context;
    }

    protected Tews6PortType initServiceStub() {
        try {
            String url = getProperty(kImUrl);
            //registerProperty(kImUrl, url, false, false, getAgent().IAgent_getStringLocalizer());

            // get the SOAP service
            Tews6Locator locator = new Tews6Locator();
            URL portAddress = new URL(url);
            Tews6PortType service = locator.getTews6Port(portAddress);

            // If authorization is required
            String authUser = getProperty(kImAuthUser);

            if ((null != authUser) && (authUser.length() > 0)) {
                String authPassword = getProperty(kImAuthPassword);

                if ((null != authUser) && (authUser.length() > 0)) {
                    authPassword = cep.decrypt(authPassword);

                    //((Tews6SoapBindingStub)service).setUsername(authUser);
                    //((Tews6SoapBindingStub)service).setPassword(authPassword);

                    // use Basic HTTP Authentication:
                    ((Stub) service)._setProperty(Call.USERNAME_PROPERTY, authUser);
                    ((Stub) service)._setProperty(Call.PASSWORD_PROPERTY, authPassword);
                } else {
                    log.warn(kImAuthPassword + " is empty, cannot set basic authorizationn");
                    log.warn("supply either both user and password or neither");
                }
            }

            ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

            return service;

        } catch (Exception ex) {
            getLog().error("Error initalizing " + getServiceName(), ex);
        }
        return null;
    }
}

