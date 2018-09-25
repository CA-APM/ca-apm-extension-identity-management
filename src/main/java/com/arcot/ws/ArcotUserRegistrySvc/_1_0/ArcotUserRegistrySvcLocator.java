/**
 * ArcotUserRegistrySvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0;

public class ArcotUserRegistrySvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvc {

    public ArcotUserRegistrySvcLocator() {
    }


    public ArcotUserRegistrySvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArcotUserRegistrySvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArcotUserRegistrySvcBinding
    private java.lang.String ArcotUserRegistrySvcBinding_address = "http://localhost:8080/arcotuds/services/ArcotUserRegistrySvc";

    public java.lang.String getArcotUserRegistrySvcBindingAddress() {
        return ArcotUserRegistrySvcBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArcotUserRegistrySvcBindingWSDDServiceName = "ArcotUserRegistrySvcBinding";

    public java.lang.String getArcotUserRegistrySvcBindingWSDDServiceName() {
        return ArcotUserRegistrySvcBindingWSDDServiceName;
    }

    public void setArcotUserRegistrySvcBindingWSDDServiceName(java.lang.String name) {
        ArcotUserRegistrySvcBindingWSDDServiceName = name;
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcPortType getArcotUserRegistrySvcBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArcotUserRegistrySvcBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArcotUserRegistrySvcBinding(endpoint);
    }

    public com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcPortType getArcotUserRegistrySvcBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcBindingStub _stub = new com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcBindingStub(portAddress, this);
            _stub.setPortName(getArcotUserRegistrySvcBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArcotUserRegistrySvcBindingEndpointAddress(java.lang.String address) {
        ArcotUserRegistrySvcBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcBindingStub _stub = new com.arcot.ws.ArcotUserRegistrySvc._1_0.ArcotUserRegistrySvcBindingStub(new java.net.URL(ArcotUserRegistrySvcBinding_address), this);
                _stub.setPortName(getArcotUserRegistrySvcBindingWSDDServiceName());
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
        if ("ArcotUserRegistrySvcBinding".equals(inputPortName)) {
            return getArcotUserRegistrySvcBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0", "ArcotUserRegistrySvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0", "ArcotUserRegistrySvcBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArcotUserRegistrySvcBinding".equals(portName)) {
            setArcotUserRegistrySvcBindingEndpointAddress(address);
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
