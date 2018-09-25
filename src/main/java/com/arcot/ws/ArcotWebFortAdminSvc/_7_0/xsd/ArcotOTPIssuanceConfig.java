/**
 * ArcotOTPIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ArcotOTPIssuanceConfig is the structure used to
 * 				represent ARCOTOTP issuance configuration. These
 * 				configuration settings will be used while
 * 				issuing a new ArcotOTP credential to user.
 */
public class ArcotOTPIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig  implements java.io.Serializable {
    /* Length of the ArcotOTP. */
    private java.lang.Integer length;

    /* Type of the ArcotOTP which can be either of
     * 								following two types 1. HOTP 2. TOTP. */
    private java.lang.Integer type;

    /* Provisioning attributes are used for ArcotOTP. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes;

    /* Custom card attributes are used in ArcotOTP
     * 								card. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes;

    public ArcotOTPIssuanceConfig() {
    }

    public ArcotOTPIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes,
           java.lang.Integer length,
           java.lang.Integer type,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes) {
        super(
            name,
            status,
            multipleUsageCount,
            usageType,
            validity,
            userCheck,
            customAttributes);
        this.length = length;
        this.type = type;
        this.provisioningAttributes = provisioningAttributes;
        this.customCardAttributes = customCardAttributes;
    }


    /**
     * Gets the length value for this ArcotOTPIssuanceConfig.
     * 
     * @return length   * Length of the ArcotOTP.
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this ArcotOTPIssuanceConfig.
     * 
     * @param length   * Length of the ArcotOTP.
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the type value for this ArcotOTPIssuanceConfig.
     * 
     * @return type   * Type of the ArcotOTP which can be either of
     * 								following two types 1. HOTP 2. TOTP.
     */
    public java.lang.Integer getType() {
        return type;
    }


    /**
     * Sets the type value for this ArcotOTPIssuanceConfig.
     * 
     * @param type   * Type of the ArcotOTP which can be either of
     * 								following two types 1. HOTP 2. TOTP.
     */
    public void setType(java.lang.Integer type) {
        this.type = type;
    }


    /**
     * Gets the provisioningAttributes value for this ArcotOTPIssuanceConfig.
     * 
     * @return provisioningAttributes   * Provisioning attributes are used for ArcotOTP.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getProvisioningAttributes() {
        return provisioningAttributes;
    }


    /**
     * Sets the provisioningAttributes value for this ArcotOTPIssuanceConfig.
     * 
     * @param provisioningAttributes   * Provisioning attributes are used for ArcotOTP.
     */
    public void setProvisioningAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes) {
        this.provisioningAttributes = provisioningAttributes;
    }


    /**
     * Gets the customCardAttributes value for this ArcotOTPIssuanceConfig.
     * 
     * @return customCardAttributes   * Custom card attributes are used in ArcotOTP
     * 								card.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getCustomCardAttributes() {
        return customCardAttributes;
    }


    /**
     * Sets the customCardAttributes value for this ArcotOTPIssuanceConfig.
     * 
     * @param customCardAttributes   * Custom card attributes are used in ArcotOTP
     * 								card.
     */
    public void setCustomCardAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes) {
        this.customCardAttributes = customCardAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotOTPIssuanceConfig)) return false;
        ArcotOTPIssuanceConfig other = (ArcotOTPIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.provisioningAttributes==null && other.getProvisioningAttributes()==null) || 
             (this.provisioningAttributes!=null &&
              this.provisioningAttributes.equals(other.getProvisioningAttributes()))) &&
            ((this.customCardAttributes==null && other.getCustomCardAttributes()==null) || 
             (this.customCardAttributes!=null &&
              this.customCardAttributes.equals(other.getCustomCardAttributes())));
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
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getProvisioningAttributes() != null) {
            _hashCode += getProvisioningAttributes().hashCode();
        }
        if (getCustomCardAttributes() != null) {
            _hashCode += getCustomCardAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotOTPIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "provisioningAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCardAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "customCardAttributes"));
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
