/**
 * ArcotUserRegistryMgmtSvcPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0;

public interface ArcotUserRegistryMgmtSvcPortType extends java.rmi.Remote {

    /**
     * This service is used to create organizations with the mandatory
     * parameters
     * 		  organization name, organization display name.
     * 		  If organization status is not passed, default status is INITIAL.
     * 		  If key label is not set, it defaults to global key.
     * 		  If storage is not set, it defaults to the default HSMDevice configured
     * in arcotcommon.ini
     * 		  Supported Storage Types: SOFTWARE, HARDWARE
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgResponse createOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.CreateOrgRequest param) throws java.rmi.RemoteException;

    /**
     * This service is used to delete the given organization.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgResponse deleteOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.DeleteOrgRequest input) throws java.rmi.RemoteException;

    /**
     * This service lists the supported Arcot Attributes.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesResponse listArcotAttributes(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListArcotAttributesRequest param) throws java.rmi.RemoteException;

    /**
     * This service retrieves the details of the given organization.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgResponse retrieveOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveOrgRequest param) throws java.rmi.RemoteException;

    /**
     * This service refreshes the UDS configuration cache.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheResponse refreshCache(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RefreshCacheRequest param) throws java.rmi.RemoteException;

    /**
     * This service lists the attributes for the given repository.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesResponse listRepositoryAttributes(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListRepositoryAttributesRequest param) throws java.rmi.RemoteException;

    /**
     * This service updates the status of the given organization.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusResponse updateOrgStatus(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgStatusRequest param) throws java.rmi.RemoteException;

    /**
     * This service updates the given organization with the updated
     * organization details like attribute mappings
     * 		and custom attributes.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgResponse updateOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.UpdateOrgRequest param) throws java.rmi.RemoteException;

    /**
     * This service returns the organization details of all the organizations
     * matching the given organization name pattern 'or' the organization
     * names.
     * 		The pattern supports '*' to obtain all organizations.
     */
    public com.arcot.ws.UserSchema._1_0.OrganizationType[] listOrgs(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.ListOrgsRequest param) throws java.rmi.RemoteException;

    /**
     * This service retrieves the configured default organization
     * details.
     */
    public com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgResponse retrieveDefaultOrg(com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs.RetrieveDefaultOrgRequest param) throws java.rmi.RemoteException;
}
