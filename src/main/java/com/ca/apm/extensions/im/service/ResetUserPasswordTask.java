package com.ca.apm.extensions.im.service;

import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;
import tews6.wsdl.ImsException;
import tews6.wsdl.ImsStatus;
import tews6.wsdl.ResetUserPassword;
import tews6.wsdl.ResetUserPasswordProfileTab;
import tews6.wsdl.ResetUserPasswordSearch;
import tews6.wsdl.ResetUserPasswordSearchSubject;

import java.rmi.RemoteException;

/**
 * Call Reset User Password API.
 */
public class ResetUserPasswordTask extends AIdentityManagerTask {

    public static final String kImResetUserPasswordEnabled  = "im.resetUserPassword.enabled";
    public static final String kImResetUserPasswordUser     = "im.resetUserPassword.user";
    public static final String kImResetUserPasswordPassword = "im.resetUserPassword.password";
    public static final String kImResetUserPasswordInterval = "im.resetUserPassword.interval";
    public static final String kImResetUserPasswordCheckPause =
            "im.resetUserPassword.pause.before.transaction.check";

    public static final String kImResetUser = "Reset User Password";

    /**
     * Create a new ResetUserPasswordTask.
     * @param agent the agent
     * @param imService the service
     * @param log the logger
     */
    public ResetUserPasswordTask(IAgent agent, ImService imService, IModuleFeedbackChannel log) {
        super(agent, log, imService);

    }

    @Override
    public String getTaskName() {
        return kImResetUser;
    }

    @Override
    public ImsStatus makeRequest() throws ImsException, RemoteException {

        if (null == service
                || null == service.getSoapService()) {
            return null;
        }

        String checkPause = service.getProperty(kImResetUserPasswordCheckPause);
        log.debug(kImResetUserPasswordCheckPause + " = " + checkPause);
        if (null != checkPause) {
            setPauseBeforeCheck(Long.parseLong(checkPause));
        }

        // populate reset user request
        // create subject
        ResetUserPasswordSearchSubject subject = new ResetUserPasswordSearchSubject();
        subject.setUID(service.getProperty(kImResetUserPasswordUser));

        // create ResetUserPasswordSearch
        ResetUserPasswordSearch search = new ResetUserPasswordSearch();
        ResetUserPasswordSearchSubject[] subjectArray = { subject };
        search.setSubject(subjectArray);

        // create ResetUserPasswordProfileTab
        ResetUserPasswordProfileTab tab = new ResetUserPasswordProfileTab();
        tab.set_PCT_PASSWORD_PCT_(service.getProperty(kImResetUserPasswordPassword));
        tab.set_BAR_passwordConfirm_BAR_(service.getProperty(kImResetUserPasswordPassword));

        // create ResetUserPassword from the above
        ResetUserPassword request = new ResetUserPassword(search, tab);

        // execute the request
        return service.getSoapService().resetUserPassword(service.getTaskContext(), request);
    }
}
