/**
 * IssuanceAPIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl;

public interface IssuanceAPIPortType extends java.rmi.Remote {

    /**
     * This function creates one or more credentials for
     * 				a
     * 				user. The operation is atomic, which implies that either
     * 				the
     * 				operation succeeds for all credentials or fails for
     * 				all.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse createCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest createCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function deletes one or more credentials for
     * 				a
     * 				given user. The operation is atomic, which implies that
     * 				either the
     * 				operation succeeds for all credentials or
     * 				fails for all.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse deleteCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest deleteCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function disables one or more credentials
     * 				for a
     * 				given user. The operation is atomic, which implies that
     * 				either
     * 				the operation succeeds for all credentials or
     * 				fails for all.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse disableCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest disableCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function enables one or more credentials for
     * 				a
     * 				given user. The operation is atomic, which implies that
     * 				either the
     * 				operation succeeds for all credentials or
     * 				fails.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse enableCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest enableCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function can fetch one or more credentials
     * 				for a
     * 				given user. If one or more credentials are specified ,
     * 				then the
     * 				call succeeds if all the requested credentials
     * 				are found. Otherwise
     * 				fails. Returns all available
     * 				credentials if no credential is
     * 				specified in the
     * 				request.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse fetchCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest fetchCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function can download one or more credentials
     * 				for a
     * 				given user. If one or more credentials are specified ,
     * 				then the
     * 				call succeeds if all the requested credentials
     * 				are found. Otherwise
     * 				fails.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse downloadCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest downloadCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function re-creates one or more credentials
     * 				for a
     * 				given user. The operation is atomic, which implies that
     * 				either
     * 				the operation succeeds for all credentials or
     * 				fails for all.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse reissueCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest reissueCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function resets the password for one or more
     * 				credentials for a given user. The operation is atomic,
     * 				which implies
     * 				that either the operation succeeds for all
     * 				credentials or fails.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function resets the custom attributes for
     * 				one or
     * 				more credentials for a given user. The operation is
     * 				atomic,
     * 				which implies that either the operation succeeds
     * 				for all credentials
     * 				or fails.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredentialNotes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialNotesRequest) throws java.rmi.RemoteException;

    /**
     * This function resets the validity for one or more
     * 				credentials for a given user. The operation is atomic,
     * 				which implies
     * 				that either the operation succeeds for all
     * 				credentials or fails.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialResponse resetCredentialValidity(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest resetCredentialValidityRequest) throws java.rmi.RemoteException;

    /**
     * This function deletes unsigned attributes in the
     * 				ArcotID
     * 				for a given user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails deleteArcotIDUnsignedAttributes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.DeleteArcotIDUnsignedAttributes deleteArcotIDUnsignedAttributesRequest) throws java.rmi.RemoteException;

    /**
     * This function sets unsigned attributes in the
     * 				ArcotID
     * 				for a given user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.TransactionDetails setArcotIDUnsignedAttributes(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.SetArcotIDUnsignedAttributes setArcotIDUnsignedAttributesRequest) throws java.rmi.RemoteException;

    /**
     * This function fetches the QnA Configuration for
     * 				the
     * 				specified organization with the given profileName. If
     * 				the
     * 				profileName is not specified, then the default
     * 				profile will be
     * 				applied.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationResponse fetchQnAConfiguration(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.FetchQnAConfigurationRequest fetchQnAConfigurationRequest) throws java.rmi.RemoteException;

    /**
     * This function creates custom credential for a
     * 				given
     * 				user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse createCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest createCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function deletes the custom credential for a
     * 				given
     * 				user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse deleteCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest deleteCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function disables the custom credential for
     * 				a given
     * 				user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse disableCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest disableCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function enables custom credential for a
     * 				given
     * 				user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse enableCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest enableCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function fetches the details for custom
     * 				credential
     * 				for a given user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse fetchCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest fetchCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function re-creates custom credential for a
     * 				given
     * 				user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse reissueCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest reissueCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function resets password for the custom
     * 				credential
     * 				for the given user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse resetCustomCredential(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest resetCustomCredentialRequest) throws java.rmi.RemoteException;

    /**
     * This function resets the validity for custom
     * 				credential
     * 				for a given user.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomResponse resetCustomCredentialValidity(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CustomRequest resetCustomCredentialValidityRequest) throws java.rmi.RemoteException;

    /**
     * This function gets list retrievable elements from the ArcotID-Keybag.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsResponse arcotIDKeyBagGetElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagGetElementsRequest arcotIDKeyBagGetElementsRequest) throws java.rmi.RemoteException;

    /**
     * This function adds a list of lelements to the ArcotID-Keybag.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsResponse arcotIDKeyBagAddElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagAddElementsRequest arcotIDKeyBagAddElementsRequest) throws java.rmi.RemoteException;

    /**
     * This function deleted a list of lelements from the ArcotID-Keybag.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsResponse arcotIDKeyBagDeleteElements(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.ArcotIDKeyBagDeleteElementsRequest arcotIDKeyBagDeleteElementsRequest) throws java.rmi.RemoteException;
}
