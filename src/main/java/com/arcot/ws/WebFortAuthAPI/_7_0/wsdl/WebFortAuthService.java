/**
 * WebFortAuthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.wsdl;

public interface WebFortAuthService extends javax.xml.rpc.Service {
    public java.lang.String getAuthAPISOAP11PortAddress();

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP11Port() throws javax.xml.rpc.ServiceException;

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP11Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getAuthAPISOAP12PortAddress();

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP12Port() throws javax.xml.rpc.ServiceException;

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP12Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
