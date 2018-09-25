/**
 * ArcotWebFortBulkOperationsSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl;

public class ArcotWebFortBulkOperationsSvcLocator extends org.apache.axis.client.Service implements com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsSvc {

    public ArcotWebFortBulkOperationsSvcLocator() {
    }


    public ArcotWebFortBulkOperationsSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArcotWebFortBulkOperationsSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArcotWebFortBulkOperationsAPIPort
    private java.lang.String ArcotWebFortBulkOperationsAPIPort_address = "http://ws.arcot.com/services/WebFortBulkOperationsSvc";

    public java.lang.String getArcotWebFortBulkOperationsAPIPortAddress() {
        return ArcotWebFortBulkOperationsAPIPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArcotWebFortBulkOperationsAPIPortWSDDServiceName = "ArcotWebFortBulkOperationsAPIPort";

    public java.lang.String getArcotWebFortBulkOperationsAPIPortWSDDServiceName() {
        return ArcotWebFortBulkOperationsAPIPortWSDDServiceName;
    }

    public void setArcotWebFortBulkOperationsAPIPortWSDDServiceName(java.lang.String name) {
        ArcotWebFortBulkOperationsAPIPortWSDDServiceName = name;
    }

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPIPortType getArcotWebFortBulkOperationsAPIPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArcotWebFortBulkOperationsAPIPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArcotWebFortBulkOperationsAPIPort(endpoint);
    }

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPIPortType getArcotWebFortBulkOperationsAPIPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPISOAP12BindingStub(portAddress, this);
            _stub.setPortName(getArcotWebFortBulkOperationsAPIPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArcotWebFortBulkOperationsAPIPortEndpointAddress(java.lang.String address) {
        ArcotWebFortBulkOperationsAPIPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPISOAP12BindingStub _stub = new com.arcot.ws.WebFortBulkOperationsAPI._7_0.wsdl.ArcotWebFortBulkOperationsAPISOAP12BindingStub(new java.net.URL(ArcotWebFortBulkOperationsAPIPort_address), this);
                _stub.setPortName(getArcotWebFortBulkOperationsAPIPortWSDDServiceName());
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
        if ("ArcotWebFortBulkOperationsAPIPort".equals(inputPortName)) {
            return getArcotWebFortBulkOperationsAPIPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/wsdl", "ArcotWebFortBulkOperationsSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/wsdl", "ArcotWebFortBulkOperationsAPIPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArcotWebFortBulkOperationsAPIPort".equals(portName)) {
            setArcotWebFortBulkOperationsAPIPortEndpointAddress(address);
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
