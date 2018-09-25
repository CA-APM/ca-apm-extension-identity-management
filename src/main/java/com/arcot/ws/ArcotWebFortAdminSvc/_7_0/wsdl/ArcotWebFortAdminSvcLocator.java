/**
 * ArcotWebFortAdminSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl;

public class ArcotWebFortAdminSvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvc {

    public ArcotWebFortAdminSvcLocator() {
    }


    public ArcotWebFortAdminSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArcotWebFortAdminSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArcotWebFortAdminSvcSOAP12port_http
    private java.lang.String ArcotWebFortAdminSvcSOAP12port_http_address = "http://ws.arcot.com/services/WebFortAdminSvc";

    public java.lang.String getArcotWebFortAdminSvcSOAP12port_httpAddress() {
        return ArcotWebFortAdminSvcSOAP12port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName = "ArcotWebFortAdminSvcSOAP12port_http";

    public java.lang.String getArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName() {
        return ArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName;
    }

    public void setArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName(java.lang.String name) {
        ArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName = name;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcPortType getArcotWebFortAdminSvcSOAP12port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArcotWebFortAdminSvcSOAP12port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArcotWebFortAdminSvcSOAP12port_http(endpoint);
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcPortType getArcotWebFortAdminSvcSOAP12port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcSOAP12BindingStub _stub = new com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcSOAP12BindingStub(portAddress, this);
            _stub.setPortName(getArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArcotWebFortAdminSvcSOAP12port_httpEndpointAddress(java.lang.String address) {
        ArcotWebFortAdminSvcSOAP12port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcSOAP12BindingStub _stub = new com.arcot.ws.ArcotWebFortAdminSvc._7_0.wsdl.ArcotWebFortAdminSvcSOAP12BindingStub(new java.net.URL(ArcotWebFortAdminSvcSOAP12port_http_address), this);
                _stub.setPortName(getArcotWebFortAdminSvcSOAP12port_httpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ArcotWebFortAdminSvcSOAP12port_http".equals(inputPortName)) {
            return getArcotWebFortAdminSvcSOAP12port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/wsdl", "ArcotWebFortAdminSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/wsdl", "ArcotWebFortAdminSvcSOAP12port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArcotWebFortAdminSvcSOAP12port_http".equals(portName)) {
            setArcotWebFortAdminSvcSOAP12port_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
