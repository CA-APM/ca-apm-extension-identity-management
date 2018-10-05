package com.ca.apm.extensions.arcot.service;

import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType;
import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskRequestType;
import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess;
import com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType;
import com.wily.introscope.agent.IAgent;
import com.wily.util.feedback.IModuleFeedbackChannel;

import java.rmi.RemoteException;

/**
 * Call Reset User Password API.
 */
public class EvaluateRiskTask extends AAdvancedAuthenticationTask {

    public static final String kArcotEvaluateRiskEnabled   = "arcot.evaluateRisk.enabled";
    public static final String kArcotEvaluateRiskInterval  = "arcot.evaluateRisk.interval";

    public static final String kArcotEvaluateRiskOrgName   = "arcot.evaluateRisk.orgName";
    public static final String kArcotEvaluateRiskUserName  = "arcot.evaluateRisk.userName";

    public static final String kArcotEvaluateRisk = "Evaluate Risk";

    public static final String ACTIVE = "ACTIVE";

    /**
     * Create a new EvaluateRiskTask.
     * @param agent the agent
     * @param service the service
     * @param log the logger
     */
    public EvaluateRiskTask(IAgent agent, ArcotService service, IModuleFeedbackChannel log) {
        super(agent, log, service);

    }

    @Override
    public String getTaskName() {
        return kArcotEvaluateRisk;
    }

    @Override
    public Status makeRequest() throws RemoteException {

        if (null == service
                || null == service.getEvaluateRiskService())  {
            log.warn("Advanced Authentication Evaluate Risk Service is null");
            return null;
        }

        // populate evaluate risk request

        // create UserContextType
        UserContextType ctx = new UserContextType(
                service.getProperty(kArcotEvaluateRiskOrgName),
                service.getProperty(kArcotEvaluateRiskUserName));

        // create EvaluateRiskRequest from the above
        EvaluateRiskRequestType request = new EvaluateRiskRequestType();
        request.setUserContext(ctx);

        // execute the request
        EvaluateResponseType response = service.getEvaluateRiskService().evaluateRisk(request);
        RiskFortSuccess success = response.getRiskFortSuccess();

        return new Status(STATUS_OK,
                0,
                success.getSuccessMessage(),
                success.getTransactionID());
    }
}
