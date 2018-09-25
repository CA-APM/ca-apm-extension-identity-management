/**
 * ArcotWebFortBulkOperationsAPIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl;

public interface ArcotWebFortBulkOperationsAPIPortType extends java.rmi.Remote {

    /**
     * Uploads OATH Tokens to WebFort server registry.
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensResponse uploadOATHTokens(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.UploadOATHTokensRequest uploadOATHTokensRequest) throws java.rmi.RemoteException;

    /**
     * Assign credentials to Specified Users.
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.CommonBulkOperationsResponse assignCredentials(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.AssignCredentialsRequest assignCredentialsRequest) throws java.rmi.RemoteException;

    /**
     * Fetches OATH Tokens matching the given criteria.
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensResponse fetchOATHTokens(com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs.FetchOATHTokensRequest fetchOATHTokensRequest) throws java.rmi.RemoteException;
}
