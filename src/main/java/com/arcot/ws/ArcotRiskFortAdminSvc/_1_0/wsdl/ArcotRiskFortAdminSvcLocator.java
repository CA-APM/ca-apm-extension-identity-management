/**
 * ArcotRiskFortAdminSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl;

public class ArcotRiskFortAdminSvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvc {

    public ArcotRiskFortAdminSvcLocator() {
    }


    public ArcotRiskFortAdminSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArcotRiskFortAdminSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArcotRiskFortAdminSvcSOAP12port_http
    private java.lang.String ArcotRiskFortAdminSvcSOAP12port_http_address = "http://localhost:8080/axis2/services/ArcotRiskFortAdminSvc";

    public java.lang.String getArcotRiskFortAdminSvcSOAP12port_httpAddress() {
        return ArcotRiskFortAdminSvcSOAP12port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName = "ArcotRiskFortAdminSvcSOAP12port_http";

    public java.lang.String getArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName() {
        return ArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName;
    }

    public void setArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName(java.lang.String name) {
        ArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName = name;
    }

    public com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcPortType getArcotRiskFortAdminSvcSOAP12port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArcotRiskFortAdminSvcSOAP12port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArcotRiskFortAdminSvcSOAP12port_http(endpoint);
    }

    public com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcPortType getArcotRiskFortAdminSvcSOAP12port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcSOAP12BindingStub _stub = new com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcSOAP12BindingStub(portAddress, this);
            _stub.setPortName(getArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArcotRiskFortAdminSvcSOAP12port_httpEndpointAddress(java.lang.String address) {
        ArcotRiskFortAdminSvcSOAP12port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcSOAP12BindingStub _stub = new com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcSOAP12BindingStub(new java.net.URL(ArcotRiskFortAdminSvcSOAP12port_http_address), this);
                _stub.setPortName(getArcotRiskFortAdminSvcSOAP12port_httpWSDDServiceName());
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
        if ("ArcotRiskFortAdminSvcSOAP12port_http".equals(inputPortName)) {
            return getArcotRiskFortAdminSvcSOAP12port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/wsdl", "ArcotRiskFortAdminSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/wsdl", "ArcotRiskFortAdminSvcSOAP12port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArcotRiskFortAdminSvcSOAP12port_http".equals(portName)) {
            setArcotRiskFortAdminSvcSOAP12port_httpEndpointAddress(address);
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
