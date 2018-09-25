/**
 * ArcotWebFortAdminSvcPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl;

public interface ArcotWebFortAdminSvcPortType extends java.rmi.Remote {
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response create(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.CreateRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response update(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.UpdateRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchResponse fetch(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response delete(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.DeleteRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response assignDefault(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.AssignDefaultRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsResponse fetchEventDetails(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchEventDetailsRequest parameters) throws java.rmi.RemoteException;
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.Response isKeyAvailableInHSM(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.IsKeyAvailableInHSMRequest parameters) throws java.rmi.RemoteException;
}
