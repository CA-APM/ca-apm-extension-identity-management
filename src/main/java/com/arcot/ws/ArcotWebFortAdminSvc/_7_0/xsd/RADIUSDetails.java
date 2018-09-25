/**
 * RADIUSDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * RADIUSDetails is the structure used to represent
 * 				Radius client/Server configuration.
 */
public class RADIUSDetails  implements java.io.Serializable {
    /* Type of authentication associted with given
     * 						host.
     * 						Here Radius host can be configured
     * 						for following types of
     * 						authentications. "OTT"
     * 						"INBAND" */
    private java.lang.Integer authType;

    /* The comments asscoiated with particular host. */
    private java.lang.String description;

    /* The maximum packet size used while communication. */
    private java.lang.Integer maxPacketSize;

    /* RADIUS packet version to be used for given host.
     * 						It may be one of following. "1.0" represents
     * 						RADIUS version 1.0, and "2.0" represents RADIUS
     * 						version 2.0. */
    private java.lang.String protocolVersion;

    /* Symmetric shared secret key to be used while
     * 						communication. */
    private java.lang.String sharedSecret;

    /* Additional RADIUS attributes. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList additionalRADIUSAttributes;

    public RADIUSDetails() {
    }

    public RADIUSDetails(
           java.lang.Integer authType,
           java.lang.String description,
           java.lang.Integer maxPacketSize,
           java.lang.String protocolVersion,
           java.lang.String sharedSecret,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList additionalRADIUSAttributes) {
           this.authType = authType;
           this.description = description;
           this.maxPacketSize = maxPacketSize;
           this.protocolVersion = protocolVersion;
           this.sharedSecret = sharedSecret;
           this.additionalRADIUSAttributes = additionalRADIUSAttributes;
    }


    /**
     * Gets the authType value for this RADIUSDetails.
     * 
     * @return authType   * Type of authentication associted with given
     * 						host.
     * 						Here Radius host can be configured
     * 						for following types of
     * 						authentications. "OTT"
     * 						"INBAND"
     */
    public java.lang.Integer getAuthType() {
        return authType;
    }


    /**
     * Sets the authType value for this RADIUSDetails.
     * 
     * @param authType   * Type of authentication associted with given
     * 						host.
     * 						Here Radius host can be configured
     * 						for following types of
     * 						authentications. "OTT"
     * 						"INBAND"
     */
    public void setAuthType(java.lang.Integer authType) {
        this.authType = authType;
    }


    /**
     * Gets the description value for this RADIUSDetails.
     * 
     * @return description   * The comments asscoiated with particular host.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RADIUSDetails.
     * 
     * @param description   * The comments asscoiated with particular host.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the maxPacketSize value for this RADIUSDetails.
     * 
     * @return maxPacketSize   * The maximum packet size used while communication.
     */
    public java.lang.Integer getMaxPacketSize() {
        return maxPacketSize;
    }


    /**
     * Sets the maxPacketSize value for this RADIUSDetails.
     * 
     * @param maxPacketSize   * The maximum packet size used while communication.
     */
    public void setMaxPacketSize(java.lang.Integer maxPacketSize) {
        this.maxPacketSize = maxPacketSize;
    }


    /**
     * Gets the protocolVersion value for this RADIUSDetails.
     * 
     * @return protocolVersion   * RADIUS packet version to be used for given host.
     * 						It may be one of following. "1.0" represents
     * 						RADIUS version 1.0, and "2.0" represents RADIUS
     * 						version 2.0.
     */
    public java.lang.String getProtocolVersion() {
        return protocolVersion;
    }


    /**
     * Sets the protocolVersion value for this RADIUSDetails.
     * 
     * @param protocolVersion   * RADIUS packet version to be used for given host.
     * 						It may be one of following. "1.0" represents
     * 						RADIUS version 1.0, and "2.0" represents RADIUS
     * 						version 2.0.
     */
    public void setProtocolVersion(java.lang.String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }


    /**
     * Gets the sharedSecret value for this RADIUSDetails.
     * 
     * @return sharedSecret   * Symmetric shared secret key to be used while
     * 						communication.
     */
    public java.lang.String getSharedSecret() {
        return sharedSecret;
    }


    /**
     * Sets the sharedSecret value for this RADIUSDetails.
     * 
     * @param sharedSecret   * Symmetric shared secret key to be used while
     * 						communication.
     */
    public void setSharedSecret(java.lang.String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }


    /**
     * Gets the additionalRADIUSAttributes value for this RADIUSDetails.
     * 
     * @return additionalRADIUSAttributes   * Additional RADIUS attributes.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getAdditionalRADIUSAttributes() {
        return additionalRADIUSAttributes;
    }


    /**
     * Sets the additionalRADIUSAttributes value for this RADIUSDetails.
     * 
     * @param additionalRADIUSAttributes   * Additional RADIUS attributes.
     */
    public void setAdditionalRADIUSAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList additionalRADIUSAttributes) {
        this.additionalRADIUSAttributes = additionalRADIUSAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSDetails)) return false;
        RADIUSDetails other = (RADIUSDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authType==null && other.getAuthType()==null) || 
             (this.authType!=null &&
              this.authType.equals(other.getAuthType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.maxPacketSize==null && other.getMaxPacketSize()==null) || 
             (this.maxPacketSize!=null &&
              this.maxPacketSize.equals(other.getMaxPacketSize()))) &&
            ((this.protocolVersion==null && other.getProtocolVersion()==null) || 
             (this.protocolVersion!=null &&
              this.protocolVersion.equals(other.getProtocolVersion()))) &&
            ((this.sharedSecret==null && other.getSharedSecret()==null) || 
             (this.sharedSecret!=null &&
              this.sharedSecret.equals(other.getSharedSecret()))) &&
            ((this.additionalRADIUSAttributes==null && other.getAdditionalRADIUSAttributes()==null) || 
             (this.additionalRADIUSAttributes!=null &&
              this.additionalRADIUSAttributes.equals(other.getAdditionalRADIUSAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuthType() != null) {
            _hashCode += getAuthType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMaxPacketSize() != null) {
            _hashCode += getMaxPacketSize().hashCode();
        }
        if (getProtocolVersion() != null) {
            _hashCode += getProtocolVersion().hashCode();
        }
        if (getSharedSecret() != null) {
            _hashCode += getSharedSecret().hashCode();
        }
        if (getAdditionalRADIUSAttributes() != null) {
            _hashCode += getAdditionalRADIUSAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "authType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPacketSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "maxPacketSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "protocolVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "sharedSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalRADIUSAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "additionalRADIUSAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
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
