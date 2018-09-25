/**
 * ArcotRiskFortAdminSvcPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl;

public interface ArcotRiskFortAdminSvcPortType extends java.rmi.Remote {
    public void addUserToExceptionList(java.lang.String userName, java.lang.String groupName, java.util.Date startDate, java.util.Date endDate, java.lang.String reason, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId) throws java.rmi.RemoteException;
    public void deleteUserFromExceptionList(java.lang.String userName, java.lang.String groupName, java.lang.String moveReason, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId) throws java.rmi.RemoteException;
    public void getUserProfile(javax.xml.rpc.holders.StringHolder userName, java.lang.String groupName, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId, javax.xml.rpc.holders.StringHolder firstName, javax.xml.rpc.holders.StringHolder lastName, javax.xml.rpc.holders.StringHolder emailAddress, javax.xml.rpc.holders.BooleanHolder isExceptionUser, org.apache.axis.holders.DateHolder exceptionStartDate, org.apache.axis.holders.DateHolder exceptionEndDate) throws java.rmi.RemoteException;
    public void getLocationAndConnectionInfo(java.lang.String ip, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId, com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.holders.LocationAndConnectionInfoHolder locationAndConnectionInfo) throws java.rmi.RemoteException;
}
