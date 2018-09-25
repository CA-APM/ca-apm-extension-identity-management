/**
 * PasswordIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * PasswordIssuanceConfig is the structure used to
 * 				represent Password issuance configuration. These
 * 				configuration settings will be used while
 * 				issuing a new password credential to user.
 */
public class PasswordIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig  implements java.io.Serializable {
    /* Flag that indicates the uniqueness across usage
     * 								types. */
    private java.lang.Boolean enforceUniquenessAcrossUsageTypes;

    /* Flag that indicates the generation of the
     * 								password
     * 								at server side or not. */
    private java.lang.Boolean generatePassword;

    /* Strength parameters of the password. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters passwordStrengthParameters;

    /* History configuration of the password. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig historyConfig;

    public PasswordIssuanceConfig() {
    }

    public PasswordIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes,
           java.lang.Boolean enforceUniquenessAcrossUsageTypes,
           java.lang.Boolean generatePassword,
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
        this.enforceUniquenessAcrossUsageTypes = enforceUniquenessAcrossUsageTypes;
        this.generatePassword = generatePassword;
        this.passwordStrengthParameters = passwordStrengthParameters;
        this.historyConfig = historyConfig;
    }


    /**
     * Gets the enforceUniquenessAcrossUsageTypes value for this PasswordIssuanceConfig.
     * 
     * @return enforceUniquenessAcrossUsageTypes   * Flag that indicates the uniqueness across usage
     * 								types.
     */
    public java.lang.Boolean getEnforceUniquenessAcrossUsageTypes() {
        return enforceUniquenessAcrossUsageTypes;
    }


    /**
     * Sets the enforceUniquenessAcrossUsageTypes value for this PasswordIssuanceConfig.
     * 
     * @param enforceUniquenessAcrossUsageTypes   * Flag that indicates the uniqueness across usage
     * 								types.
     */
    public void setEnforceUniquenessAcrossUsageTypes(java.lang.Boolean enforceUniquenessAcrossUsageTypes) {
        this.enforceUniquenessAcrossUsageTypes = enforceUniquenessAcrossUsageTypes;
    }


    /**
     * Gets the generatePassword value for this PasswordIssuanceConfig.
     * 
     * @return generatePassword   * Flag that indicates the generation of the
     * 								password
     * 								at server side or not.
     */
    public java.lang.Boolean getGeneratePassword() {
        return generatePassword;
    }


    /**
     * Sets the generatePassword value for this PasswordIssuanceConfig.
     * 
     * @param generatePassword   * Flag that indicates the generation of the
     * 								password
     * 								at server side or not.
     */
    public void setGeneratePassword(java.lang.Boolean generatePassword) {
        this.generatePassword = generatePassword;
    }


    /**
     * Gets the passwordStrengthParameters value for this PasswordIssuanceConfig.
     * 
     * @return passwordStrengthParameters   * Strength parameters of the password.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters getPasswordStrengthParameters() {
        return passwordStrengthParameters;
    }


    /**
     * Sets the passwordStrengthParameters value for this PasswordIssuanceConfig.
     * 
     * @param passwordStrengthParameters   * Strength parameters of the password.
     */
    public void setPasswordStrengthParameters(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordStrengthParameters passwordStrengthParameters) {
        this.passwordStrengthParameters = passwordStrengthParameters;
    }


    /**
     * Gets the historyConfig value for this PasswordIssuanceConfig.
     * 
     * @return historyConfig   * History configuration of the password.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig getHistoryConfig() {
        return historyConfig;
    }


    /**
     * Sets the historyConfig value for this PasswordIssuanceConfig.
     * 
     * @param historyConfig   * History configuration of the password.
     */
    public void setHistoryConfig(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredentialHistoryConfig historyConfig) {
        this.historyConfig = historyConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordIssuanceConfig)) return false;
        PasswordIssuanceConfig other = (PasswordIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enforceUniquenessAcrossUsageTypes==null && other.getEnforceUniquenessAcrossUsageTypes()==null) || 
             (this.enforceUniquenessAcrossUsageTypes!=null &&
              this.enforceUniquenessAcrossUsageTypes.equals(other.getEnforceUniquenessAcrossUsageTypes()))) &&
            ((this.generatePassword==null && other.getGeneratePassword()==null) || 
             (this.generatePassword!=null &&
              this.generatePassword.equals(other.getGeneratePassword()))) &&
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
        if (getEnforceUniquenessAcrossUsageTypes() != null) {
            _hashCode += getEnforceUniquenessAcrossUsageTypes().hashCode();
        }
        if (getGeneratePassword() != null) {
            _hashCode += getGeneratePassword().hashCode();
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
        new org.apache.axis.description.TypeDesc(PasswordIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceUniquenessAcrossUsageTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "enforceUniquenessAcrossUsageTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generatePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "generatePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
