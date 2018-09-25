/**
 * ArcotIDIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ArcotIDIssuanceConfig is the structure used to
 * 				represent ArcotID issuance configuration.
 * 				These configuration
 * 				settings will be used while
 * 				issuing a new ArcotID credential to user.
 */
public class ArcotIDIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig  implements java.io.Serializable {
    /* The length of the arcot key of the ArcotID. */
    private java.lang.Integer keyLength;

    /* Unsigned attributes that are used in ArcotID. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList unsignedAttributes;

    /* Strength parameters of the ArcotID password. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters passwordStrengthParameters;

    /* History configuration of the ArcotID. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig historyConfig;

    public ArcotIDIssuanceConfig() {
    }

    public ArcotIDIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes,
           java.lang.Integer keyLength,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList unsignedAttributes,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters passwordStrengthParameters,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig historyConfig) {
        super(
            name,
            status,
            multipleUsageCount,
            usageType,
            validity,
            userCheck,
            customAttributes);
        this.keyLength = keyLength;
        this.unsignedAttributes = unsignedAttributes;
        this.passwordStrengthParameters = passwordStrengthParameters;
        this.historyConfig = historyConfig;
    }


    /**
     * Gets the keyLength value for this ArcotIDIssuanceConfig.
     * 
     * @return keyLength   * The length of the arcot key of the ArcotID.
     */
    public java.lang.Integer getKeyLength() {
        return keyLength;
    }


    /**
     * Sets the keyLength value for this ArcotIDIssuanceConfig.
     * 
     * @param keyLength   * The length of the arcot key of the ArcotID.
     */
    public void setKeyLength(java.lang.Integer keyLength) {
        this.keyLength = keyLength;
    }


    /**
     * Gets the unsignedAttributes value for this ArcotIDIssuanceConfig.
     * 
     * @return unsignedAttributes   * Unsigned attributes that are used in ArcotID.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getUnsignedAttributes() {
        return unsignedAttributes;
    }


    /**
     * Sets the unsignedAttributes value for this ArcotIDIssuanceConfig.
     * 
     * @param unsignedAttributes   * Unsigned attributes that are used in ArcotID.
     */
    public void setUnsignedAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList unsignedAttributes) {
        this.unsignedAttributes = unsignedAttributes;
    }


    /**
     * Gets the passwordStrengthParameters value for this ArcotIDIssuanceConfig.
     * 
     * @return passwordStrengthParameters   * Strength parameters of the ArcotID password.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters getPasswordStrengthParameters() {
        return passwordStrengthParameters;
    }


    /**
     * Sets the passwordStrengthParameters value for this ArcotIDIssuanceConfig.
     * 
     * @param passwordStrengthParameters   * Strength parameters of the ArcotID password.
     */
    public void setPasswordStrengthParameters(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters passwordStrengthParameters) {
        this.passwordStrengthParameters = passwordStrengthParameters;
    }


    /**
     * Gets the historyConfig value for this ArcotIDIssuanceConfig.
     * 
     * @return historyConfig   * History configuration of the ArcotID.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig getHistoryConfig() {
        return historyConfig;
    }


    /**
     * Sets the historyConfig value for this ArcotIDIssuanceConfig.
     * 
     * @param historyConfig   * History configuration of the ArcotID.
     */
    public void setHistoryConfig(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig historyConfig) {
        this.historyConfig = historyConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDIssuanceConfig)) return false;
        ArcotIDIssuanceConfig other = (ArcotIDIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyLength==null && other.getKeyLength()==null) || 
             (this.keyLength!=null &&
              this.keyLength.equals(other.getKeyLength()))) &&
            ((this.unsignedAttributes==null && other.getUnsignedAttributes()==null) || 
             (this.unsignedAttributes!=null &&
              this.unsignedAttributes.equals(other.getUnsignedAttributes()))) &&
            ((this.passwordStrengthParameters==null && other.getPasswordStrengthParameters()==null) || 
             (this.passwordStrengthParameters!=null &&
              this.passwordStrengthParameters.equals(other.getPasswordStrengthParameters()))) &&
            ((this.historyConfig==null && other.getHistoryConfig()==null) || 
             (this.historyConfig!=null &&
              this.historyConfig.equals(other.getHistoryConfig())));
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
        if (getKeyLength() != null) {
            _hashCode += getKeyLength().hashCode();
        }
        if (getUnsignedAttributes() != null) {
            _hashCode += getUnsignedAttributes().hashCode();
        }
        if (getPasswordStrengthParameters() != null) {
            _hashCode += getPasswordStrengthParameters().hashCode();
        }
        if (getHistoryConfig() != null) {
            _hashCode += getHistoryConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsignedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "unsignedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordStrengthParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordStrengthParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordStrengthParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "historyConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredentialHistoryConfig"));
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
