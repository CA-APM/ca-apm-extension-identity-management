/**
 * RADIUSServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * RADIUSServer is the structure used to represent
 * 				the
 * 				information about RADIUS server.
 */
public class RADIUSServer  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSDetails  implements java.io.Serializable {
    /* The IP address of the RADIUS server. */
    private java.lang.String ipAddress;

    /* Port of the RADIUS server. */
    private java.lang.Integer port;

    /* Read timeout of RADIUS server. */
    private java.lang.Integer readTimeout;

    /* Retry count with RADIUS server. */
    private java.lang.Integer retryCount;

    /* Failover order of RADIUS servers. */
    private java.lang.Integer failoverOrder;

    public RADIUSServer() {
    }

    public RADIUSServer(
           java.lang.Integer authType,
           java.lang.String description,
           java.lang.Integer maxPacketSize,
           java.lang.String protocolVersion,
           java.lang.String sharedSecret,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList additionalRADIUSAttributes,
           java.lang.String ipAddress,
           java.lang.Integer port,
           java.lang.Integer readTimeout,
           java.lang.Integer retryCount,
           java.lang.Integer failoverOrder) {
        super(
            authType,
            description,
            maxPacketSize,
            protocolVersion,
            sharedSecret,
            additionalRADIUSAttributes);
        this.ipAddress = ipAddress;
        this.port = port;
        this.readTimeout = readTimeout;
        this.retryCount = retryCount;
        this.failoverOrder = failoverOrder;
    }


    /**
     * Gets the ipAddress value for this RADIUSServer.
     * 
     * @return ipAddress   * The IP address of the RADIUS server.
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this RADIUSServer.
     * 
     * @param ipAddress   * The IP address of the RADIUS server.
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the port value for this RADIUSServer.
     * 
     * @return port   * Port of the RADIUS server.
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this RADIUSServer.
     * 
     * @param port   * Port of the RADIUS server.
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the readTimeout value for this RADIUSServer.
     * 
     * @return readTimeout   * Read timeout of RADIUS server.
     */
    public java.lang.Integer getReadTimeout() {
        return readTimeout;
    }


    /**
     * Sets the readTimeout value for this RADIUSServer.
     * 
     * @param readTimeout   * Read timeout of RADIUS server.
     */
    public void setReadTimeout(java.lang.Integer readTimeout) {
        this.readTimeout = readTimeout;
    }


    /**
     * Gets the retryCount value for this RADIUSServer.
     * 
     * @return retryCount   * Retry count with RADIUS server.
     */
    public java.lang.Integer getRetryCount() {
        return retryCount;
    }


    /**
     * Sets the retryCount value for this RADIUSServer.
     * 
     * @param retryCount   * Retry count with RADIUS server.
     */
    public void setRetryCount(java.lang.Integer retryCount) {
        this.retryCount = retryCount;
    }


    /**
     * Gets the failoverOrder value for this RADIUSServer.
     * 
     * @return failoverOrder   * Failover order of RADIUS servers.
     */
    public java.lang.Integer getFailoverOrder() {
        return failoverOrder;
    }


    /**
     * Sets the failoverOrder value for this RADIUSServer.
     * 
     * @param failoverOrder   * Failover order of RADIUS servers.
     */
    public void setFailoverOrder(java.lang.Integer failoverOrder) {
        this.failoverOrder = failoverOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSServer)) return false;
        RADIUSServer other = (RADIUSServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.readTimeout==null && other.getReadTimeout()==null) || 
             (this.readTimeout!=null &&
              this.readTimeout.equals(other.getReadTimeout()))) &&
            ((this.retryCount==null && other.getRetryCount()==null) || 
             (this.retryCount!=null &&
              this.retryCount.equals(other.getRetryCount()))) &&
            ((this.failoverOrder==null && other.getFailoverOrder()==null) || 
             (this.failoverOrder!=null &&
              this.failoverOrder.equals(other.getFailoverOrder())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getReadTimeout() != null) {
            _hashCode += getReadTimeout().hashCode();
        }
        if (getRetryCount() != null) {
            _hashCode += getRetryCount().hashCode();
        }
        if (getFailoverOrder() != null) {
            _hashCode += getFailoverOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("readTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "readTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "retryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failoverOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "failoverOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
