/**
 * WebFortAuthServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.wsdl;

public class WebFortAuthServiceLocator extends org.apache.axis.client.Service implements com.arcot.ws.WebFortAuthAPI._7_0.wsdl.WebFortAuthService {

    public WebFortAuthServiceLocator() {
    }


    public WebFortAuthServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebFortAuthServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AuthAPISOAP11Port
    private java.lang.String AuthAPISOAP11Port_address = "http://ws.arcot.com/services/WebFortAuthSvc";

    public java.lang.String getAuthAPISOAP11PortAddress() {
        return AuthAPISOAP11Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AuthAPISOAP11PortWSDDServiceName = "AuthAPISOAP11Port";

    public java.lang.String getAuthAPISOAP11PortWSDDServiceName() {
        return AuthAPISOAP11PortWSDDServiceName;
    }

    public void setAuthAPISOAP11PortWSDDServiceName(java.lang.String name) {
        AuthAPISOAP11PortWSDDServiceName = name;
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP11Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AuthAPISOAP11Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAuthAPISOAP11Port(endpoint);
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP11Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP11BindingStub _stub = new com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP11BindingStub(portAddress, this);
            _stub.setPortName(getAuthAPISOAP11PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAuthAPISOAP11PortEndpointAddress(java.lang.String address) {
        AuthAPISOAP11Port_address = address;
    }


    // Use to get a proxy class for AuthAPISOAP12Port
    private java.lang.String AuthAPISOAP12Port_address = "http://ws.arcot.com/services/WebFortAuthSvc";

    public java.lang.String getAuthAPISOAP12PortAddress() {
        return AuthAPISOAP12Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AuthAPISOAP12PortWSDDServiceName = "AuthAPISOAP12Port";

    public java.lang.String getAuthAPISOAP12PortWSDDServiceName() {
        return AuthAPISOAP12PortWSDDServiceName;
    }

    public void setAuthAPISOAP12PortWSDDServiceName(java.lang.String name) {
        AuthAPISOAP12PortWSDDServiceName = name;
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP12Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AuthAPISOAP12Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAuthAPISOAP12Port(endpoint);
    }

    public com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType getAuthAPISOAP12Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP12BindingStub(portAddress, this);
            _stub.setPortName(getAuthAPISOAP12PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAuthAPISOAP12PortEndpointAddress(java.lang.String address) {
        AuthAPISOAP12Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP11BindingStub _stub = new com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP11BindingStub(new java.net.URL(AuthAPISOAP11Port_address), this);
                _stub.setPortName(getAuthAPISOAP11PortWSDDServiceName());
                return _stub;
            }
            if (com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortAuthAPI._7_0.wsdl.AuthAPISOAP12BindingStub(new java.net.URL(AuthAPISOAP12Port_address), this);
                _stub.setPortName(getAuthAPISOAP12PortWSDDServiceName());
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
        if ("AuthAPISOAP11Port".equals(inputPortName)) {
            return getAuthAPISOAP11Port();
        }
        else if ("AuthAPISOAP12Port".equals(inputPortName)) {
            return getAuthAPISOAP12Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/wsdl", "WebFortAuthService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/wsdl", "AuthAPISOAP11Port"));
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/wsdl", "AuthAPISOAP12Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AuthAPISOAP11Port".equals(portName)) {
            setAuthAPISOAP11PortEndpointAddress(address);
        }
        else 
if ("AuthAPISOAP12Port".equals(portName)) {
            setAuthAPISOAP12PortEndpointAddress(address);
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
