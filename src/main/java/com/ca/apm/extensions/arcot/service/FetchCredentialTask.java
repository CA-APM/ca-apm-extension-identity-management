package com.ca.apm.extensions.arcot.service;

import com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType;
import com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest;
import com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse;
import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;

import java.rmi.RemoteException;

/**
 * Call Reset User Password API.
 */
public class FetchCredentialTask extends AAdvancedAuthenticationTask {

    public static final String kArcotFetchCredentialEnabled   = "arcot.fetchCredential.enabled";
    public static final String kArcotFetchCredentialInterval  = "arcot.fetchCredential.interval";

    public static final String kArcotFetchCredentialOrgName   = "arcot.fetchCredential.orgName";
    public static final String kArcotFetchCredentialUserName  = "arcot.fetchCredential.userName";

    public static final String kArcotFetchCredential = "Fetch Credential";

    public static final String ACTIVE = "ACTIVE";

    /**
     * Create a new FetchCredentialTask.
     * @param agent the agent
     * @param service the service
     * @param log the logger
     */
    public FetchCredentialTask(IAgent agent, ArcotService service, IModuleFeedbackChannel log) {
        super(agent, log, service);

    }

    @Override
    public String getTaskName() {
        return kArcotFetchCredential;
    }

    @Override
    public Status makeRequest() throws RemoteException {

        if (null == service
                || null == service.getWebFortIssuanceService())  {
            log.warn("Advanced Authentication Issuance Service is null");
            return null;
        }

        // populate fetch credential request

        // create CredentialRequest
        CredentialRequest request = new CredentialRequest();
        request.setUserName(service.getProperty(kArcotFetchCredentialUserName));
        request.setOrgName(service.getProperty(kArcotFetchCredentialOrgName));

        // execute the request
        CredentialResponse response = service.getWebFortIssuanceService().fetchCredential(request);
        TransactionDetailsType details = response.getTransactionDetails();

        return new Status(0 == details.getResponseCode() ? STATUS_OK : STATUS_WARN,
                details.getResponseCode(),
                details.getMessage(),
                details.getTransactionID());
    }
}
