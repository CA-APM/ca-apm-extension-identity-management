/**
 * ArcotConfigRegistrySvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotConfigRegistrySvc._1_0;

public class ArcotConfigRegistrySvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvc {

    public ArcotConfigRegistrySvcLocator() {
    }


    public ArcotConfigRegistrySvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArcotConfigRegistrySvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArcotConfigRegistrySvcBinding
    private java.lang.String ArcotConfigRegistrySvcBinding_address = "http://localhost:8080/arcotuds/services/ArcotConfigRegistrySvc";

    public java.lang.String getArcotConfigRegistrySvcBindingAddress() {
        return ArcotConfigRegistrySvcBinding_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArcotConfigRegistrySvcBindingWSDDServiceName = "ArcotConfigRegistrySvcBinding";

    public java.lang.String getArcotConfigRegistrySvcBindingWSDDServiceName() {
        return ArcotConfigRegistrySvcBindingWSDDServiceName;
    }

    public void setArcotConfigRegistrySvcBindingWSDDServiceName(java.lang.String name) {
        ArcotConfigRegistrySvcBindingWSDDServiceName = name;
    }

    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcPortType getArcotConfigRegistrySvcBinding() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArcotConfigRegistrySvcBinding_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArcotConfigRegistrySvcBinding(endpoint);
    }

    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcPortType getArcotConfigRegistrySvcBinding(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcBindingStub _stub = new com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcBindingStub(portAddress, this);
            _stub.setPortName(getArcotConfigRegistrySvcBindingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArcotConfigRegistrySvcBindingEndpointAddress(java.lang.String address) {
        ArcotConfigRegistrySvcBinding_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcBindingStub _stub = new com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcBindingStub(new java.net.URL(ArcotConfigRegistrySvcBinding_address), this);
                _stub.setPortName(getArcotConfigRegistrySvcBindingWSDDServiceName());
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
        if ("ArcotConfigRegistrySvcBinding".equals(inputPortName)) {
            return getArcotConfigRegistrySvcBinding();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0", "ArcotConfigRegistrySvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0", "ArcotConfigRegistrySvcBinding"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArcotConfigRegistrySvcBinding".equals(portName)) {
            setArcotConfigRegistrySvcBindingEndpointAddress(address);
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
