/**
 * RiskFortEvaluateRiskSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class RiskFortEvaluateRiskSvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortEvaluateRiskSvc {

    public RiskFortEvaluateRiskSvcLocator() {
    }


    public RiskFortEvaluateRiskSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RiskFortEvaluateRiskSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EvaluateRiskAPISOAP11Port
    private java.lang.String EvaluateRiskAPISOAP11Port_address = "http://ws.arcot.com/services/RiskFortEvaluateRiskSvc";

    public java.lang.String getEvaluateRiskAPISOAP11PortAddress() {
        return EvaluateRiskAPISOAP11Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EvaluateRiskAPISOAP11PortWSDDServiceName = "EvaluateRiskAPISOAP11Port";

    public java.lang.String getEvaluateRiskAPISOAP11PortWSDDServiceName() {
        return EvaluateRiskAPISOAP11PortWSDDServiceName;
    }

    public void setEvaluateRiskAPISOAP11PortWSDDServiceName(java.lang.String name) {
        EvaluateRiskAPISOAP11PortWSDDServiceName = name;
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType getEvaluateRiskAPISOAP11Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EvaluateRiskAPISOAP11Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEvaluateRiskAPISOAP11Port(endpoint);
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType getEvaluateRiskAPISOAP11Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP11BindingStub _stub = new com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP11BindingStub(portAddress, this);
            _stub.setPortName(getEvaluateRiskAPISOAP11PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEvaluateRiskAPISOAP11PortEndpointAddress(java.lang.String address) {
        EvaluateRiskAPISOAP11Port_address = address;
    }


    // Use to get a proxy class for EvaluateRiskAPISOAP12Port
    private java.lang.String EvaluateRiskAPISOAP12Port_address = "http://ws.arcot.com/services/RiskFortEvaluateRiskSvc";

    public java.lang.String getEvaluateRiskAPISOAP12PortAddress() {
        return EvaluateRiskAPISOAP12Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EvaluateRiskAPISOAP12PortWSDDServiceName = "EvaluateRiskAPISOAP12Port";

    public java.lang.String getEvaluateRiskAPISOAP12PortWSDDServiceName() {
        return EvaluateRiskAPISOAP12PortWSDDServiceName;
    }

    public void setEvaluateRiskAPISOAP12PortWSDDServiceName(java.lang.String name) {
        EvaluateRiskAPISOAP12PortWSDDServiceName = name;
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType getEvaluateRiskAPISOAP12Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EvaluateRiskAPISOAP12Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEvaluateRiskAPISOAP12Port(endpoint);
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType getEvaluateRiskAPISOAP12Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP12BindingStub _stub = new com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP12BindingStub(portAddress, this);
            _stub.setPortName(getEvaluateRiskAPISOAP12PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEvaluateRiskAPISOAP12PortEndpointAddress(java.lang.String address) {
        EvaluateRiskAPISOAP12Port_address = address;
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
            if (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP11BindingStub _stub = new com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP11BindingStub(new java.net.URL(EvaluateRiskAPISOAP11Port_address), this);
                _stub.setPortName(getEvaluateRiskAPISOAP11PortWSDDServiceName());
                return _stub;
            }
            if (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP12BindingStub _stub = new com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPISOAP12BindingStub(new java.net.URL(EvaluateRiskAPISOAP12Port_address), this);
                _stub.setPortName(getEvaluateRiskAPISOAP12PortWSDDServiceName());
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
        if ("EvaluateRiskAPISOAP11Port".equals(inputPortName)) {
            return getEvaluateRiskAPISOAP11Port();
        }
        else if ("EvaluateRiskAPISOAP12Port".equals(inputPortName)) {
            return getEvaluateRiskAPISOAP12Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskFortEvaluateRiskSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskAPISOAP11Port"));
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskAPISOAP12Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EvaluateRiskAPISOAP11Port".equals(portName)) {
            setEvaluateRiskAPISOAP11PortEndpointAddress(address);
        }
        else 
if ("EvaluateRiskAPISOAP12Port".equals(portName)) {
            setEvaluateRiskAPISOAP12PortEndpointAddress(address);
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
