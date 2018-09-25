/**
 * ArcotUserRegistrySvcPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0;

public interface ArcotUserRegistrySvcPortType extends java.rmi.Remote {

    /**
     * This service is used to authenticate a user with a given authentication
     * 				mechanism
     * 				Eg: Users belonging to LDAP can be authenticated against their
     * LDAP
     * 				user-password credential.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserResponse authenticateUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AuthenticateUserRequest param) throws java.rmi.RemoteException;

    /**
     * This service searches for the required number of users with
     * the given
     * 				search expression in the
     * 				given Organizations identified by the Organization pattern. Returns
     * the
     * 				obtained user details.
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[] searchUsers(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SearchUsersRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service lists all the users except deleted in the given
     * 				organization between the startIndex and endIndex.
     * 				If organization name is not specified, default organization is
     * 				assumed.
     * 				ListUserRequest: orgName, startIndex and endIndex.
     * 				ListUserResponse: SearchResult with user details, requestId, count
     * 				Page Size: Page size is endIndex-startIndex. The max pagesize
     * allowed is
     * 				same as the configured DefaultSearchRetCount
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsType[] listUsers(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service lists the users with the given
     * 				organization and account information.
     * 				If organization name is not
     * 				passed, configured default organization is assumed.
     * 				Following filters are allowed to be set:
     * 				1)
     * 				If includeImage is set to true, user's image information is also
     * 				retrieved if present.
     * 				2) If includeAccounts is set is true, user
     * 				account information is also retrieved if present.
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx[] listUsersForAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUsersForAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service retrieves the user details in the
     * 				given organization.
     * 				The user details include account information if
     * 				any. If organization name is not passed,
     * 				configured default
     * 				organization is assumed.
     * 				Following filters are allowed to be set:
     * 				1)
     * 				If includeImage is set to true, user's image information is also
     * 				retrieved if present.
     * 				2) If includeAccounts is set is true, user
     * 				account information is also retrieved if present.
     * 				3) If deepSearch is set to true, the given user identifier is
     * first
     * 				searched against UserName;
     * 				On no match, it would search against AccountID; On no match it
     * would
     * 				further search against AccountIDAttribute.
     * 				If deepSearch is set to false, search will be restricted to UserName.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserResponse retrieveUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service retrieves the user account details
     * 				for the given user name, organization and account specified.
     * 				If
     * 				organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountResponse retrieveUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.RetrieveUserAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service lists the user account details for
     * 				the given user name, organization and account specified.
     * 				If
     * 				organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.UserSchema._1_0.UserAccountType[] listUserAccounts(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.ListUserAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service deletes the user identified by the given Organization.
     * 				If organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserResponse deleteUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service deletes the user account identified
     * 				by the given userId, organization and user account information.
     * 				If
     * 				organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountResponse deleteUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service updates the user account identified
     * 				by the given userId, organization and user account information.
     * 				If
     * 				organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountResponse updateUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service creates the given user in the given
     * 				organization with
     * 				extended information like user account. If user status is not
     * passed, default status is ACTIVE.
     * 				If organization name is not passed,
     * 				configured default organization is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserResponse createUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.CreateUserRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service adds an account for the given user
     * 				in the given organization.
     * 				If organization name is not passed,
     * 				configured default organization is assumed.
     * 				More than one account can be added using this service.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountResponse addUserAccount(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserAccountRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service updates the given user with the
     * 				given user details. Existing details can not be made null.
     * 				This
     * 				service should be used to add or update user account information.
     * 				If
     * 				organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserResponse updateUser(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service should be used to add or update user
     * 				custom attribute information.
     * 				Existing details can be made null by
     * 				passing a null or empty list.
     * 				If organization name is not passed,
     * 				configured default organization is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesResponse setCustomAttributes(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetCustomAttributesRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service sets the PAM for the given user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMResponse setPAM(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.SetPAMRequest param) throws java.rmi.RemoteException;

    /**
     * This service gets the PAM for the given user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMResponse getPAM(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetPAMRequest param) throws java.rmi.RemoteException;

    /**
     * This service updates the given user's status with the given
     * status.
     * 				If organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusResponse updateUserStatus(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserStatusRequest parameters) throws java.rmi.RemoteException;

    /**
     * This service gets the status of the given user.
     * 				If organization name is not passed, configured default organization
     * is
     * 				assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusResponse getUserStatus(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserStatusRequest param) throws java.rmi.RemoteException;

    /**
     * Query QnA Attributes from the LDAP repository
     */
    public java.lang.String[] getQnAAttributes(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAAttributesRequest input) throws java.rmi.RemoteException;

    /**
     * Perform user data verification against the values
     * 				stored in LDAP.
     * 				Will return map of attribute-name and verification status.
     * 				There are 4 values of status defined
     * 				1. MATCHED
     * 				2. NOT_MATCHED
     * 				3. NOT_FOUND
     * 				4. NOT_VERIFIED
     */
    public com.arcot.ws.UserSchema._1_0.QnAResponseAttribute[] performQnAVerification(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.PerformQnAVerificationRequest input) throws java.rmi.RemoteException;

    /**
     * Retrieve values for specific set of attributes as
     * 				stored in the LDAP repository
     */
    public com.arcot.ws.UserSchema._1_0.QnAValuesAttribute[] getQnAValues(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetQnAValuesRequest input) throws java.rmi.RemoteException;

    /**
     * This service returns the device info for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.UserSchema._1_0.DeviceResponseAttrs[] getUserDevices(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.GetUserDevicesRequest input) throws java.rmi.RemoteException;

    /**
     * This service add the device information for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceResponse addUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.AddUserDeviceRequest input) throws java.rmi.RemoteException;

    /**
     * This service updates the device information for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceResponse updateUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.UpdateUserDeviceRequest input) throws java.rmi.RemoteException;

    /**
     * This service deletes the device information for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceResponse deleteUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DeleteUserDeviceRequest input) throws java.rmi.RemoteException;

    /**
     * This service disables the device from receiving push notifications
     * for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceResponse disableUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.DisableUserDeviceRequest input) throws java.rmi.RemoteException;

    /**
     * This service enables the device to receive push notifications
     * for the given
     * 				user in the given organization.
     * 				If organization name is not passed, configured default organization
     * 				is assumed.
     */
    public com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceResponse enableUserDevice(com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs.EnableUserDeviceRequest input) throws java.rmi.RemoteException;
}
