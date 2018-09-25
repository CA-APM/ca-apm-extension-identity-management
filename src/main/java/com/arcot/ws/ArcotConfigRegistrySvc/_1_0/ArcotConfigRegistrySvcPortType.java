/**
 * ArcotConfigRegistrySvcPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotConfigRegistrySvc._1_0;

public interface ArcotConfigRegistrySvcPortType extends java.rmi.Remote {

    /**
     * This service lists the account types configured for the given
     * organization.
     */
    public com.arcot.ws.UserSchema._1_0.AccountType[] listAccountTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListAccountTypeRequest param) throws java.rmi.RemoteException;

    /**
     * This service lists the email types configured for the given
     * organization.
     * 		If no email types are configured for the given organization, email
     * types configured at global level are returned.
     */
    public com.arcot.ws.UserSchema._1_0.EmailType[] listEmailTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListEmailTypeRequest param) throws java.rmi.RemoteException;

    /**
     * This service lists the telephone types configured for the given
     * organization.
     * 		If no telephone types are configured for the given organization,
     * telephone types configured at global level are returned.
     */
    public com.arcot.ws.UserSchema._1_0.TelephoneType[] listTelephoneTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListTelephoneTypeRequest param) throws java.rmi.RemoteException;

    /**
     * This service lists the arcot attributes configured for encryption
     * for the given organization.
     * 		If there are no arcot attributes configured for encryption for the
     * given organization, global arcot attributes configured for encryption
     * are returned.
     */
    public java.lang.String[] listConfiguredAttributesForEncryption(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListConfiguredAttributesForEncryptionRequest param) throws java.rmi.RemoteException;

    /**
     * This service is used to delete the specified account type.
     * 			Account type is deleted only if no accounts are created for this
     * account type in any of the organizations.
     */
    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse deleteAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeRequest input) throws java.rmi.RemoteException;

    /**
     * This service is used to create account type.
     * 		  The account type will be available to all organizations if the
     * flag 'targetAllOrgs' is set to true else it is assigned to the provided
     * list of organizations.
     * 		  By default targetAllOrgs is set to false.
     */
    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse createAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeRequest input) throws java.rmi.RemoteException;

    /**
     * This service updates the given account type with account type
     * display name,
     * 		  custom attributes and the organizations assigned to the account
     * type.
     */
    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse updateAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeRequest input) throws java.rmi.RemoteException;
}
