package com.ca.apm.extensions.arcot.service;

import com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcLocator;
import com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcPortType;
import com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcLocator;
import com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcPortType;
import com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.ArcotUserRegistryMgmtSvcLocator;
import com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.ArcotUserRegistryMgmtSvcPortType;
import com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcLocator;
import com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcPortType;
import com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcLocator;
import com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcPortType;
import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType;
import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortEvaluateRiskSvcLocator;
import com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType;
import com.arcot.ws.WebFortAuthAPI._7_0.wsdl.WebFortAuthServiceLocator;
import com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPIPortType;
import com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsSvcLocator;
import com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPIPortType;
import com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.WebFortIssuanceServiceLocator;

import com.ca.apm.extensions.base.service.ADynamicService;
import com.ca.apm.extensions.base.service.IConstants;
import com.ca.apm.extensions.utils.CommonEncryptionProvider;

import com.google.common.base.Throwables;

import com.wily.introscope.agent.IAgent;
import com.wily.util.heartbeat.IRegisteredBehavior;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArcotService extends ADynamicService {

    // handles for the registered tasks
    private List<IRegisteredBehavior> registeredBehaviorList;

    // encryption provider
    private CommonEncryptionProvider cep;

    // stubs for SOAP calls
    private ArcotConfigRegistrySvcPortType          configRegistryService;
    private ArcotUserRegistrySvcPortType            userRegistryService;
    private ArcotUserRegistryMgmtSvcPortType        userRegistryManagementService;

    private ArcotRiskFortAdminSvcPortType           riskFortAdminService;
    private EvaluateRiskAPIPortType                 evaluateRiskService;

    private ArcotWebFortAdminSvcPortType            webFortAdminService;
    private AuthAPIPortType                         webFortAuthService;
    private ArcotWebFortBulkOperationsAPIPortType   webFortBulkOperationsService;
    private IssuanceAPIPortType                     webFortIssuanceService;

    // constants for reading properties fron bundle.profile
    public static final String kArcotConfigRegistryUrl = "arcot.configRegistry.url";
    public static final String kArcotUserRegistryUrl = "arcot.userRegistry.url";
    public static final String kArcotUserRegistryManagementUrl = "arcot.userRegistryMgmt.url";
    public static final String kRiskFortAdminUrl = "arcot.riskFort.admin.url";
    public static final String kRiskFortEvaluateRiskUrl = "arcot.riskFort.evaluate.url";
    public static final String kWebFortAdminUrl = "arcot.webfort.admin.url";
    public static final String kWebFortAuthUrl = "arcot.webfort.auth.url";
    public static final String kWebFortBulkOpUrl = "arcot.webfort.bulk.url";
    public static final String kWebFortIssuanceUrl = "arcot.webfort.issuance.url";

    public static final String kArcotAuthUser = "arcot.authorization.user";
    public static final String kArcotAuthPassword = "arcot.authorization.password";

    public static final int kSoapTimeoutSecs = 10;

    @Override
    public void IAgentService_startService(IAgent agent, Map parameters) throws Exception {
        super.IAgentService_startService(agent, parameters);

        cep = new CommonEncryptionProvider();

        // initalize services
        initServices();

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

        // register the get user status task
        if (IConstants.TRUE.equals(getProperty(
                GetUserStatusTask.kArcotGetUserStatusEnabled).toLowerCase())) {

            long interval = Long.parseLong(getProperty(
                    GetUserStatusTask.kArcotGetUserStatusInterval));

            IRegisteredBehavior behavior = agent.IAgent_getCommonHeartbeat().addBehavior(
                    new GetUserStatusTask(agent, this, log),
                    "AA Get User Status Task", true, interval, false);
            registeredBehaviorList.add(behavior);

            log.info("AA Get User Status Task started with interval = " + interval);
        }
    }

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
        return "AdvancedAuth";
    }

    @Override
    public String getAtcPrefix() {
        return "arcot_";
    }

    @Override
    public String getServiceName() {
        return this.getClass().getSimpleName();
    }

    /**
     * Initialize the Advanced Authentication services.
     */
    protected void initServices() {
        configRegistryService           = initConfigRegistryService();
        userRegistryService             = initUserRegistryService();
        userRegistryManagementService   = initUserRegistryManagementService();

        riskFortAdminService            = initRiskFortAdminService();
        evaluateRiskService             = initEvaluateRiskService();

        webFortAdminService             = initWebFortAdminService();
        webFortAuthService              = initWebFortAuthService();
        webFortBulkOperationsService    = initWebFortBulkOperationsService();
        webFortIssuanceService          = initWebFortIssuanceService();
    }

    /**
     * Add basic authentication to the Axis service stub.
     * @param service the service stub
     * @param authUserProperty the name of the user property
     * @param authPasswordProperty the name of the password property
     * @return the service with authorization
     */
    protected Stub addAuthorization(Stub service,
                                    String authUserProperty,
                                    String authPasswordProperty) {

        String authUser = getProperty(authUserProperty);

        if ((null != authUser) && (authUser.length() > 0)) {

            String authPassword = null;
            try {
                authPassword = cep.decrypt(getProperty(authPasswordProperty));
            } catch (Exception e) {
                log.error("cannot decrypt password " + authPasswordProperty);
                return null;
            }

            // use Basic HTTP Authentication:
            service._setProperty(Call.USERNAME_PROPERTY, authUser);
            service._setProperty(Call.PASSWORD_PROPERTY, authPassword);
        }

        return service;
    }


    /**
     * Initialize the WebFort Issuance service.
     * @return the service
     */
    protected IssuanceAPIPortType initWebFortIssuanceService() {
        try {
            String url = getProperty(kWebFortIssuanceUrl);

            if (null != url) {

                // get the SOAP service
                WebFortIssuanceServiceLocator locator = new WebFortIssuanceServiceLocator();
                URL portAddress = new URL(url);
                IssuanceAPIPortType service =
                        locator.getIssuanceAPISOAP12Port(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kWebFortIssuanceUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the WebFort bulk operations service.
     * @return the service
     */
    protected ArcotWebFortBulkOperationsAPIPortType initWebFortBulkOperationsService() {
        try {
            String url = getProperty(kWebFortBulkOpUrl);

            if (null != url) {

                // get the SOAP service
                ArcotWebFortBulkOperationsSvcLocator locator =
                        new ArcotWebFortBulkOperationsSvcLocator();
                URL portAddress = new URL(url);
                ArcotWebFortBulkOperationsAPIPortType service =
                        locator.getArcotWebFortBulkOperationsAPIPort(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kWebFortBulkOpUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the WebFort auth API service.
     * @return the service
     */
    protected AuthAPIPortType initWebFortAuthService() {
        try {
            String url = getProperty(kWebFortAuthUrl);

            if (null != url) {

                // get the SOAP service
                WebFortAuthServiceLocator locator =
                        new WebFortAuthServiceLocator();
                URL portAddress = new URL(url);
                AuthAPIPortType service = locator.getAuthAPISOAP11Port(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kWebFortAuthUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the WebFort admin service.
     * @return the service
     */
    protected ArcotWebFortAdminSvcPortType initWebFortAdminService() {
        try {
            String url = getProperty(kWebFortAdminUrl);

            if (null != url) {

                // get the SOAP service
                ArcotWebFortAdminSvcLocator locator =
                        new ArcotWebFortAdminSvcLocator();
                URL portAddress = new URL(url);
                ArcotWebFortAdminSvcPortType service =
                        locator.getArcotWebFortAdminSvcSOAP12port_http(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kWebFortAdminUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the RiskFort evaluate risk service.
     * @return the service
     */
    protected EvaluateRiskAPIPortType initEvaluateRiskService() {
        try {
            String url = getProperty(kRiskFortEvaluateRiskUrl);

            if (null != url) {

                // get the SOAP service
                RiskFortEvaluateRiskSvcLocator locator =
                        new RiskFortEvaluateRiskSvcLocator();
                URL portAddress = new URL(url);
                EvaluateRiskAPIPortType service =
                        locator.getEvaluateRiskAPISOAP11Port(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kRiskFortEvaluateRiskUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the RiskFort admin service.
     * @return the service
     */
    protected ArcotRiskFortAdminSvcPortType initRiskFortAdminService() {
        try {
            String url = getProperty(kRiskFortAdminUrl);

            if (null != url) {

                // get the SOAP service
                ArcotRiskFortAdminSvcLocator locator =
                        new ArcotRiskFortAdminSvcLocator();
                URL portAddress = new URL(url);
                ArcotRiskFortAdminSvcPortType service =
                        locator.getArcotRiskFortAdminSvcSOAP12port_http(portAddress);

                addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

                ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

                return service;
            }
        } catch (Exception ex) {
            getLog().error("Error initalizing " + kRiskFortAdminUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the Advanced Authentication user registry management service.
     * @return the service stub
     */
    protected ArcotUserRegistryMgmtSvcPortType initUserRegistryManagementService() {
        try {
            String url = getProperty(kArcotUserRegistryManagementUrl);

            if (null == url) {
                return null;
            }

            // get the SOAP service
            ArcotUserRegistryMgmtSvcLocator locator = new ArcotUserRegistryMgmtSvcLocator();
            URL portAddress = new URL(url);
            ArcotUserRegistryMgmtSvcPortType service =
                    locator.getArcotUserRegistryMgmtSvcBinding(portAddress);

            addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

            ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

            return service;

        } catch (Exception ex) {
            getLog().error("Error initalizing " + kArcotUserRegistryManagementUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the Advanced Authentication config registry service.
     * @return the service stub
     */
    protected ArcotConfigRegistrySvcPortType initConfigRegistryService() {
        try {
            String url = getProperty(kArcotConfigRegistryUrl);

            if (null == url) {
                return null;
            }

            // get the SOAP service
            ArcotConfigRegistrySvcLocator locator = new ArcotConfigRegistrySvcLocator();
            URL portAddress = new URL(url);
            ArcotConfigRegistrySvcPortType service =
                    locator.getArcotConfigRegistrySvcBinding(portAddress);

            addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

            ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

            return service;

        } catch (Exception ex) {
            getLog().error("Error initalizing " + kArcotConfigRegistryUrl, ex);
        }
        return null;
    }

    /**
     * Initialize the Advanced Authentication user registry service.
     * @return the service stub
     */
    protected ArcotUserRegistrySvcPortType initUserRegistryService() {
        try {
            String url = getProperty(kArcotUserRegistryUrl);

            if (null == url) {
                return null;
            }

            // get the SOAP service
            ArcotUserRegistrySvcLocator locator = new ArcotUserRegistrySvcLocator();
            URL portAddress = new URL(url);
            ArcotUserRegistrySvcPortType service =
                    locator.getArcotUserRegistrySvcBinding(portAddress);

            addAuthorization((Stub) service, kArcotAuthUser, kArcotAuthPassword);

            ((Stub) service).setTimeout(kSoapTimeoutSecs * 1000);

            return service;

        } catch (Exception ex) {
            getLog().error("Error initalizing " + kArcotUserRegistryUrl, ex);
        }
        return null;
    }


    public ArcotConfigRegistrySvcPortType getConfigRegistryService() {
        return configRegistryService;
    }

    public ArcotUserRegistrySvcPortType getUserRegistryService() {
        return userRegistryService;
    }

    public ArcotUserRegistryMgmtSvcPortType getUserRegistryManagementService() {
        return userRegistryManagementService;
    }

    public ArcotRiskFortAdminSvcPortType getRiskFortAdminService() {
        return riskFortAdminService;
    }

    public EvaluateRiskAPIPortType getEvaluateRiskService() {
        return evaluateRiskService;
    }

    public ArcotWebFortAdminSvcPortType getWebFortAdminService() {
        return webFortAdminService;
    }

    public AuthAPIPortType getWebFortAuthService() {
        return webFortAuthService;
    }

    public ArcotWebFortBulkOperationsAPIPortType getWebFortBulkOperationsService() {
        return webFortBulkOperationsService;
    }

    public IssuanceAPIPortType getWebFortIssuanceService() {
        return webFortIssuanceService;
    }
}

