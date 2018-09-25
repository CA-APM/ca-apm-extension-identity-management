/**
 * CalloutConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * CalloutDetailElements is the structure used to
 * 				represent callout configuration.
 */
public class CalloutConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Transport that is used for communication. */
    private java.lang.String transport;

    /* Host name of the callout. */
    private java.lang.String host;

    /* Port of the callout. */
    private java.lang.Integer port;

    /* URI of the callout. */
    private java.lang.String uri;

    /* Connection timeout of callout. */
    private java.lang.Integer connectionTimeout;

    /* Read timeout of callout. */
    private java.lang.Integer readTimeout;

    /* Idle timeout of callout. */
    private java.lang.Integer idleTimeout;

    /* Minimum connections to be established with
     * 								callout. */
    private java.lang.Integer minConnections;

    /* Maximum connections to be established with
     * 								callout. */
    private java.lang.Integer maxConnections;

    /* Server root SSL certificate. */
    private java.lang.String serverRootCACert;

    /* Client SSL certificate. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair clientCertKeyPair;

    /* Events related to callout. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events;

    public CalloutConfig() {
    }

    public CalloutConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.String transport,
           java.lang.String host,
           java.lang.Integer port,
           java.lang.String uri,
           java.lang.Integer connectionTimeout,
           java.lang.Integer readTimeout,
           java.lang.Integer idleTimeout,
           java.lang.Integer minConnections,
           java.lang.Integer maxConnections,
           java.lang.String serverRootCACert,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair clientCertKeyPair,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events) {
        super(
            name,
            status);
        this.transport = transport;
        this.host = host;
        this.port = port;
        this.uri = uri;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
        this.idleTimeout = idleTimeout;
        this.minConnections = minConnections;
        this.maxConnections = maxConnections;
        this.serverRootCACert = serverRootCACert;
        this.clientCertKeyPair = clientCertKeyPair;
        this.events = events;
    }


    /**
     * Gets the transport value for this CalloutConfig.
     * 
     * @return transport   * Transport that is used for communication.
     */
    public java.lang.String getTransport() {
        return transport;
    }


    /**
     * Sets the transport value for this CalloutConfig.
     * 
     * @param transport   * Transport that is used for communication.
     */
    public void setTransport(java.lang.String transport) {
        this.transport = transport;
    }


    /**
     * Gets the host value for this CalloutConfig.
     * 
     * @return host   * Host name of the callout.
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this CalloutConfig.
     * 
     * @param host   * Host name of the callout.
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the port value for this CalloutConfig.
     * 
     * @return port   * Port of the callout.
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this CalloutConfig.
     * 
     * @param port   * Port of the callout.
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the uri value for this CalloutConfig.
     * 
     * @return uri   * URI of the callout.
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this CalloutConfig.
     * 
     * @param uri   * URI of the callout.
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the connectionTimeout value for this CalloutConfig.
     * 
     * @return connectionTimeout   * Connection timeout of callout.
     */
    public java.lang.Integer getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this CalloutConfig.
     * 
     * @param connectionTimeout   * Connection timeout of callout.
     */
    public void setConnectionTimeout(java.lang.Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the readTimeout value for this CalloutConfig.
     * 
     * @return readTimeout   * Read timeout of callout.
     */
    public java.lang.Integer getReadTimeout() {
        return readTimeout;
    }


    /**
     * Sets the readTimeout value for this CalloutConfig.
     * 
     * @param readTimeout   * Read timeout of callout.
     */
    public void setReadTimeout(java.lang.Integer readTimeout) {
        this.readTimeout = readTimeout;
    }


    /**
     * Gets the idleTimeout value for this CalloutConfig.
     * 
     * @return idleTimeout   * Idle timeout of callout.
     */
    public java.lang.Integer getIdleTimeout() {
        return idleTimeout;
    }


    /**
     * Sets the idleTimeout value for this CalloutConfig.
     * 
     * @param idleTimeout   * Idle timeout of callout.
     */
    public void setIdleTimeout(java.lang.Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }


    /**
     * Gets the minConnections value for this CalloutConfig.
     * 
     * @return minConnections   * Minimum connections to be established with
     * 								callout.
     */
    public java.lang.Integer getMinConnections() {
        return minConnections;
    }


    /**
     * Sets the minConnections value for this CalloutConfig.
     * 
     * @param minConnections   * Minimum connections to be established with
     * 								callout.
     */
    public void setMinConnections(java.lang.Integer minConnections) {
        this.minConnections = minConnections;
    }


    /**
     * Gets the maxConnections value for this CalloutConfig.
     * 
     * @return maxConnections   * Maximum connections to be established with
     * 								callout.
     */
    public java.lang.Integer getMaxConnections() {
        return maxConnections;
    }


    /**
     * Sets the maxConnections value for this CalloutConfig.
     * 
     * @param maxConnections   * Maximum connections to be established with
     * 								callout.
     */
    public void setMaxConnections(java.lang.Integer maxConnections) {
        this.maxConnections = maxConnections;
    }


    /**
     * Gets the serverRootCACert value for this CalloutConfig.
     * 
     * @return serverRootCACert   * Server root SSL certificate.
     */
    public java.lang.String getServerRootCACert() {
        return serverRootCACert;
    }


    /**
     * Sets the serverRootCACert value for this CalloutConfig.
     * 
     * @param serverRootCACert   * Server root SSL certificate.
     */
    public void setServerRootCACert(java.lang.String serverRootCACert) {
        this.serverRootCACert = serverRootCACert;
    }


    /**
     * Gets the clientCertKeyPair value for this CalloutConfig.
     * 
     * @return clientCertKeyPair   * Client SSL certificate.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair getClientCertKeyPair() {
        return clientCertKeyPair;
    }


    /**
     * Sets the clientCertKeyPair value for this CalloutConfig.
     * 
     * @param clientCertKeyPair   * Client SSL certificate.
     */
    public void setClientCertKeyPair(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair clientCertKeyPair) {
        this.clientCertKeyPair = clientCertKeyPair;
    }


    /**
     * Gets the events value for this CalloutConfig.
     * 
     * @return events   * Events related to callout.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CalloutConfig.
     * 
     * @param events   * Events related to callout.
     */
    public void setEvents(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalloutConfig)) return false;
        CalloutConfig other = (CalloutConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transport==null && other.getTransport()==null) || 
             (this.transport!=null &&
              this.transport.equals(other.getTransport()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.connectionTimeout==null && other.getConnectionTimeout()==null) || 
             (this.connectionTimeout!=null &&
              this.connectionTimeout.equals(other.getConnectionTimeout()))) &&
            ((this.readTimeout==null && other.getReadTimeout()==null) || 
             (this.readTimeout!=null &&
              this.readTimeout.equals(other.getReadTimeout()))) &&
            ((this.idleTimeout==null && other.getIdleTimeout()==null) || 
             (this.idleTimeout!=null &&
              this.idleTimeout.equals(other.getIdleTimeout()))) &&
            ((this.minConnections==null && other.getMinConnections()==null) || 
             (this.minConnections!=null &&
              this.minConnections.equals(other.getMinConnections()))) &&
            ((this.maxConnections==null && other.getMaxConnections()==null) || 
             (this.maxConnections!=null &&
              this.maxConnections.equals(other.getMaxConnections()))) &&
            ((this.serverRootCACert==null && other.getServerRootCACert()==null) || 
             (this.serverRootCACert!=null &&
              this.serverRootCACert.equals(other.getServerRootCACert()))) &&
            ((this.clientCertKeyPair==null && other.getClientCertKeyPair()==null) || 
             (this.clientCertKeyPair!=null &&
              this.clientCertKeyPair.equals(other.getClientCertKeyPair()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTransport() != null) {
            _hashCode += getTransport().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getConnectionTimeout() != null) {
            _hashCode += getConnectionTimeout().hashCode();
        }
        if (getReadTimeout() != null) {
            _hashCode += getReadTimeout().hashCode();
        }
        if (getIdleTimeout() != null) {
            _hashCode += getIdleTimeout().hashCode();
        }
        if (getMinConnections() != null) {
            _hashCode += getMinConnections().hashCode();
        }
        if (getMaxConnections() != null) {
            _hashCode += getMaxConnections().hashCode();
        }
        if (getServerRootCACert() != null) {
            _hashCode += getServerRootCACert().hashCode();
        }
        if (getClientCertKeyPair() != null) {
            _hashCode += getClientCertKeyPair().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalloutConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CalloutConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "transport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "connectionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "readTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "idleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "maxConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverRootCACert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverRootCACert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCertKeyPair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "clientCertKeyPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ExtModuleEvents"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
