package com.ca.apm.extensions.arcot.service;

import com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusRequest;
import com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse;
import com.arcot.ws.UserSchema._1_0.UserIdentifierType;
import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;

import java.rmi.RemoteException;

/**
 * Call Reset User Password API.
 */
public class GetUserStatusTask extends AAdvancedAuthenticationTask {

    public static final String kArcotGetUserStatusEnabled = "arcot.getUserStatus.enabled";
    public static final String kArcotGetUserStatusInterval = "arcot.getUserStatus.interval";

    public static final String kArcotGetUserStatusOrgName     = "arcot.getUserStatus.orgName";
    public static final String kArcotGetUserStatusUserName = "arcot.getUserStatus.userName";
    public static final String kArcotGetUserStatusUserRefId = "arcot.getUserStatus.userRefId";

    public static final String kArcotGetUserStatus = "Get User Status";

    public static final String ACTIVE = "ACTIVE";

    /**
     * Create a new ResetUserPasswordTask.
     * @param agent the agent
     * @param service the service
     * @param log the logger
     */
    public GetUserStatusTask(IAgent agent, ArcotService service, IModuleFeedbackChannel log) {
        super(agent, log, service);

    }

    @Override
    public String getTaskName() {
        return kArcotGetUserStatus;
    }

    @Override
    public Status makeRequest() throws RemoteException {

        if (null == service
                || null == service.getUserRegistryService())  {
            log.warn("Advanced Authentication User Registry Service is null");
            return null;
        }

        // populate get user request

        // create UserIdentifierType
        UserIdentifierType uid = new UserIdentifierType(
                service.getProperty(kArcotGetUserStatusOrgName),
                service.getProperty(kArcotGetUserStatusUserName),
                Integer.parseInt(service.getProperty(kArcotGetUserStatusUserRefId)));

        // create GetUserStatusRequest from the above
        GetUserStatusRequest request = new GetUserStatusRequest();
        request.setUserId(uid);

        // execute the request
        GetUserStatusResponse response = service.getUserRegistryService().getUserStatus(request);

        return new Status(STATUS_OK, 0, response.getStatus().getValue(), null);
    }
}
