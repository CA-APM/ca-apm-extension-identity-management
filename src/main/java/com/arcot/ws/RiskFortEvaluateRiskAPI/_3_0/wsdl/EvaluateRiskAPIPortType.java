/**
 * EvaluateRiskAPIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public interface EvaluateRiskAPIPortType extends java.rmi.Remote {

    /**
     * Deletes user-device association(s).
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType deleteAssociation(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Evaluate risk immediately after a username/password
     * 				login has succeeded.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType evaluateRisk(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskRequestType parameters) throws java.rmi.RemoteException;

    /**
     * List out all the associations for the given user.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType listAssociations(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationsRequestType parameters) throws java.rmi.RemoteException;

    /**
     * Feedback API provided by the system to keep its
     * 				information uptodate. The calls and actual updates
     * 				might be real-time or offline. This can be used to
     * 				create/update user-device risk attribute
     * 				information. Responce from Evalute Risk will be
     * 				passed to Post Evalutaion.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType postEvaluate(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateRequestType parameters) throws java.rmi.RemoteException;
}
