/**
 * Tews6Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class Tews6Locator extends org.apache.axis.client.Service implements tews6.wsdl.Tews6 {

    public Tews6Locator() {
    }


    public Tews6Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Tews6Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Tews6PublicPort
    private java.lang.String Tews6PublicPort_address = "http://10.130.139.214:8080/iam/im/TEWS6/pubidentityEnv";

    public java.lang.String getTews6PublicPortAddress() {
        return Tews6PublicPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Tews6PublicPortWSDDServiceName = "Tews6PublicPort";

    public java.lang.String getTews6PublicPortWSDDServiceName() {
        return Tews6PublicPortWSDDServiceName;
    }

    public void setTews6PublicPortWSDDServiceName(java.lang.String name) {
        Tews6PublicPortWSDDServiceName = name;
    }

    public tews6.wsdl.Tews6PublicPortType getTews6PublicPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Tews6PublicPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTews6PublicPort(endpoint);
    }

    public tews6.wsdl.Tews6PublicPortType getTews6PublicPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tews6.wsdl.Tews6PublicSoapBindingStub _stub = new tews6.wsdl.Tews6PublicSoapBindingStub(portAddress, this);
            _stub.setPortName(getTews6PublicPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTews6PublicPortEndpointAddress(java.lang.String address) {
        Tews6PublicPort_address = address;
    }


    // Use to get a proxy class for Tews6Port
    private java.lang.String Tews6Port_address = "http://10.130.139.214:8080/iam/im/TEWS6/identityEnv";

    public java.lang.String getTews6PortAddress() {
        return Tews6Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Tews6PortWSDDServiceName = "Tews6Port";

    public java.lang.String getTews6PortWSDDServiceName() {
        return Tews6PortWSDDServiceName;
    }

    public void setTews6PortWSDDServiceName(java.lang.String name) {
        Tews6PortWSDDServiceName = name;
    }

    public tews6.wsdl.Tews6PortType getTews6Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Tews6Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTews6Port(endpoint);
    }

    public tews6.wsdl.Tews6PortType getTews6Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tews6.wsdl.Tews6SoapBindingStub _stub = new tews6.wsdl.Tews6SoapBindingStub(portAddress, this);
            _stub.setPortName(getTews6PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTews6PortEndpointAddress(java.lang.String address) {
        Tews6Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tews6.wsdl.Tews6PublicPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                tews6.wsdl.Tews6PublicSoapBindingStub _stub = new tews6.wsdl.Tews6PublicSoapBindingStub(new java.net.URL(Tews6PublicPort_address), this);
                _stub.setPortName(getTews6PublicPortWSDDServiceName());
                return _stub;
            }
            if (tews6.wsdl.Tews6PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                tews6.wsdl.Tews6SoapBindingStub _stub = new tews6.wsdl.Tews6SoapBindingStub(new java.net.URL(Tews6Port_address), this);
                _stub.setPortName(getTews6PortWSDDServiceName());
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
        if ("Tews6PublicPort".equals(inputPortName)) {
            return getTews6PublicPort();
        }
        else if ("Tews6Port".equals(inputPortName)) {
            return getTews6Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tews6/wsdl", "Tews6");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tews6/wsdl", "Tews6PublicPort"));
            ports.add(new javax.xml.namespace.QName("http://tews6/wsdl", "Tews6Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Tews6PublicPort".equals(portName)) {
            setTews6PublicPortEndpointAddress(address);
        }
        else 
if ("Tews6Port".equals(portName)) {
            setTews6PortEndpointAddress(address);
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
