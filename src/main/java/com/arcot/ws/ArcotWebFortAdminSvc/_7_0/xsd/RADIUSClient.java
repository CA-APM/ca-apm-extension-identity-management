/**
 * RADIUSClient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * RADIUSClient is the structure used to represent
 * 				the
 * 				information about RADIUS client.
 */
public class RADIUSClient  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSDetails  implements java.io.Serializable {
    /* Default organization at global level. */
    private java.lang.String defaultOrg;

    /* Organizations supported. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList orgsSupported;

    /* The set of WebFort response codes for which
     * 								WebFort server will drop the RADIUS response. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList packetDropConditions;

    /* Enables RADIUS retry feature. */
    private java.lang.Boolean enableRetry;

    /* Time in seconds after which a retry
     * 								will be treated invalid. */
    private java.lang.Integer retryWindow;

    public RADIUSClient() {
    }

    public RADIUSClient(
           java.lang.Integer authType,
           java.lang.String description,
           java.lang.Integer maxPacketSize,
           java.lang.String protocolVersion,
           java.lang.String sharedSecret,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList additionalRADIUSAttributes,
           java.lang.String defaultOrg,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList orgsSupported,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList packetDropConditions,
           java.lang.Boolean enableRetry,
           java.lang.Integer retryWindow) {
        super(
            authType,
            description,
            maxPacketSize,
            protocolVersion,
            sharedSecret,
            additionalRADIUSAttributes);
        this.defaultOrg = defaultOrg;
        this.orgsSupported = orgsSupported;
        this.packetDropConditions = packetDropConditions;
        this.enableRetry = enableRetry;
        this.retryWindow = retryWindow;
    }


    /**
     * Gets the defaultOrg value for this RADIUSClient.
     * 
     * @return defaultOrg   * Default organization at global level.
     */
    public java.lang.String getDefaultOrg() {
        return defaultOrg;
    }


    /**
     * Sets the defaultOrg value for this RADIUSClient.
     * 
     * @param defaultOrg   * Default organization at global level.
     */
    public void setDefaultOrg(java.lang.String defaultOrg) {
        this.defaultOrg = defaultOrg;
    }


    /**
     * Gets the orgsSupported value for this RADIUSClient.
     * 
     * @return orgsSupported   * Organizations supported.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList getOrgsSupported() {
        return orgsSupported;
    }


    /**
     * Sets the orgsSupported value for this RADIUSClient.
     * 
     * @param orgsSupported   * Organizations supported.
     */
    public void setOrgsSupported(com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList orgsSupported) {
        this.orgsSupported = orgsSupported;
    }


    /**
     * Gets the packetDropConditions value for this RADIUSClient.
     * 
     * @return packetDropConditions   * The set of WebFort response codes for which
     * 								WebFort server will drop the RADIUS response.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList getPacketDropConditions() {
        return packetDropConditions;
    }


    /**
     * Sets the packetDropConditions value for this RADIUSClient.
     * 
     * @param packetDropConditions   * The set of WebFort response codes for which
     * 								WebFort server will drop the RADIUS response.
     */
    public void setPacketDropConditions(com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList packetDropConditions) {
        this.packetDropConditions = packetDropConditions;
    }


    /**
     * Gets the enableRetry value for this RADIUSClient.
     * 
     * @return enableRetry   * Enables RADIUS retry feature.
     */
    public java.lang.Boolean getEnableRetry() {
        return enableRetry;
    }


    /**
     * Sets the enableRetry value for this RADIUSClient.
     * 
     * @param enableRetry   * Enables RADIUS retry feature.
     */
    public void setEnableRetry(java.lang.Boolean enableRetry) {
        this.enableRetry = enableRetry;
    }


    /**
     * Gets the retryWindow value for this RADIUSClient.
     * 
     * @return retryWindow   * Time in seconds after which a retry
     * 								will be treated invalid.
     */
    public java.lang.Integer getRetryWindow() {
        return retryWindow;
    }


    /**
     * Sets the retryWindow value for this RADIUSClient.
     * 
     * @param retryWindow   * Time in seconds after which a retry
     * 								will be treated invalid.
     */
    public void setRetryWindow(java.lang.Integer retryWindow) {
        this.retryWindow = retryWindow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSClient)) return false;
        RADIUSClient other = (RADIUSClient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultOrg==null && other.getDefaultOrg()==null) || 
             (this.defaultOrg!=null &&
              this.defaultOrg.equals(other.getDefaultOrg()))) &&
            ((this.orgsSupported==null && other.getOrgsSupported()==null) || 
             (this.orgsSupported!=null &&
              this.orgsSupported.equals(other.getOrgsSupported()))) &&
            ((this.packetDropConditions==null && other.getPacketDropConditions()==null) || 
             (this.packetDropConditions!=null &&
              this.packetDropConditions.equals(other.getPacketDropConditions()))) &&
            ((this.enableRetry==null && other.getEnableRetry()==null) || 
             (this.enableRetry!=null &&
              this.enableRetry.equals(other.getEnableRetry()))) &&
            ((this.retryWindow==null && other.getRetryWindow()==null) || 
             (this.retryWindow!=null &&
              this.retryWindow.equals(other.getRetryWindow())));
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
        if (getDefaultOrg() != null) {
            _hashCode += getDefaultOrg().hashCode();
        }
        if (getOrgsSupported() != null) {
            _hashCode += getOrgsSupported().hashCode();
        }
        if (getPacketDropConditions() != null) {
            _hashCode += getPacketDropConditions().hashCode();
        }
        if (getEnableRetry() != null) {
            _hashCode += getEnableRetry().hashCode();
        }
        if (getRetryWindow() != null) {
            _hashCode += getRetryWindow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSClient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "defaultOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "StringList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetDropConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "packetDropConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "IntegerList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRetry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "enableRetry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "retryWindow"));
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
