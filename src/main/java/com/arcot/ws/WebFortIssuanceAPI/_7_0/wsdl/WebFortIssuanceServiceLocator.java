/**
 * WebFortIssuanceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl;

public class WebFortIssuanceServiceLocator extends org.apache.axis.client.Service implements com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.WebFortIssuanceService {

    public WebFortIssuanceServiceLocator() {
    }


    public WebFortIssuanceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebFortIssuanceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IssuanceAPISOAP12Port
    private java.lang.String IssuanceAPISOAP12Port_address = "http://ws.arcot.com/services/WebFortIssuanceSvc";

    public java.lang.String getIssuanceAPISOAP12PortAddress() {
        return IssuanceAPISOAP12Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IssuanceAPISOAP12PortWSDDServiceName = "IssuanceAPISOAP12Port";

    public java.lang.String getIssuanceAPISOAP12PortWSDDServiceName() {
        return IssuanceAPISOAP12PortWSDDServiceName;
    }

    public void setIssuanceAPISOAP12PortWSDDServiceName(java.lang.String name) {
        IssuanceAPISOAP12PortWSDDServiceName = name;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPIPortType getIssuanceAPISOAP12Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IssuanceAPISOAP12Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIssuanceAPISOAP12Port(endpoint);
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPIPortType getIssuanceAPISOAP12Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPISOAP12BindingStub(portAddress, this);
            _stub.setPortName(getIssuanceAPISOAP12PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIssuanceAPISOAP12PortEndpointAddress(java.lang.String address) {
        IssuanceAPISOAP12Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortIssuanceAPI._7_0.wsdl.IssuanceAPISOAP12BindingStub(new java.net.URL(IssuanceAPISOAP12Port_address), this);
                _stub.setPortName(getIssuanceAPISOAP12PortWSDDServiceName());
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
        if ("IssuanceAPISOAP12Port".equals(inputPortName)) {
            return getIssuanceAPISOAP12Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/wsdl", "WebFortIssuanceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/wsdl", "IssuanceAPISOAP12Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IssuanceAPISOAP12Port".equals(portName)) {
            setIssuanceAPISOAP12PortEndpointAddress(address);
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
