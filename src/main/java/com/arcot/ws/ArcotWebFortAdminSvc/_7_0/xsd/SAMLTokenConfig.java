/**
 * SAMLTokenConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * SAMLTokenConfig is the structure used to
 * 				represent
 * 				SAML token configuration.
 */
public class SAMLTokenConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* SAML token signing certificate and key details. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair tokenSigningCertKeyPair;

    /* Digest method. */
    private java.lang.String digestMethod;

    /* Signature method. */
    private java.lang.String signatureMethod;

    /* SAML token attributes. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes;

    /* Subject format for SAML1.1. */
    private java.lang.String subjectFormatSAML11;

    /* Subject format for SAML2.0. */
    private java.lang.String subjectFormatSAML20;

    /* SAML additional attributes. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttributeList additionalAttributes;

    public SAMLTokenConfig() {
    }

    public SAMLTokenConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair tokenSigningCertKeyPair,
           java.lang.String digestMethod,
           java.lang.String signatureMethod,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes,
           java.lang.String subjectFormatSAML11,
           java.lang.String subjectFormatSAML20,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttributeList additionalAttributes) {
        super(
            name,
            status);
        this.tokenSigningCertKeyPair = tokenSigningCertKeyPair;
        this.digestMethod = digestMethod;
        this.signatureMethod = signatureMethod;
        this.samlTokenAttributes = samlTokenAttributes;
        this.subjectFormatSAML11 = subjectFormatSAML11;
        this.subjectFormatSAML20 = subjectFormatSAML20;
        this.additionalAttributes = additionalAttributes;
    }


    /**
     * Gets the tokenSigningCertKeyPair value for this SAMLTokenConfig.
     * 
     * @return tokenSigningCertKeyPair   * SAML token signing certificate and key details.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair getTokenSigningCertKeyPair() {
        return tokenSigningCertKeyPair;
    }


    /**
     * Sets the tokenSigningCertKeyPair value for this SAMLTokenConfig.
     * 
     * @param tokenSigningCertKeyPair   * SAML token signing certificate and key details.
     */
    public void setTokenSigningCertKeyPair(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair tokenSigningCertKeyPair) {
        this.tokenSigningCertKeyPair = tokenSigningCertKeyPair;
    }


    /**
     * Gets the digestMethod value for this SAMLTokenConfig.
     * 
     * @return digestMethod   * Digest method.
     */
    public java.lang.String getDigestMethod() {
        return digestMethod;
    }


    /**
     * Sets the digestMethod value for this SAMLTokenConfig.
     * 
     * @param digestMethod   * Digest method.
     */
    public void setDigestMethod(java.lang.String digestMethod) {
        this.digestMethod = digestMethod;
    }


    /**
     * Gets the signatureMethod value for this SAMLTokenConfig.
     * 
     * @return signatureMethod   * Signature method.
     */
    public java.lang.String getSignatureMethod() {
        return signatureMethod;
    }


    /**
     * Sets the signatureMethod value for this SAMLTokenConfig.
     * 
     * @param signatureMethod   * Signature method.
     */
    public void setSignatureMethod(java.lang.String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }


    /**
     * Gets the samlTokenAttributes value for this SAMLTokenConfig.
     * 
     * @return samlTokenAttributes   * SAML token attributes.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes getSamlTokenAttributes() {
        return samlTokenAttributes;
    }


    /**
     * Sets the samlTokenAttributes value for this SAMLTokenConfig.
     * 
     * @param samlTokenAttributes   * SAML token attributes.
     */
    public void setSamlTokenAttributes(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes) {
        this.samlTokenAttributes = samlTokenAttributes;
    }


    /**
     * Gets the subjectFormatSAML11 value for this SAMLTokenConfig.
     * 
     * @return subjectFormatSAML11   * Subject format for SAML1.1.
     */
    public java.lang.String getSubjectFormatSAML11() {
        return subjectFormatSAML11;
    }


    /**
     * Sets the subjectFormatSAML11 value for this SAMLTokenConfig.
     * 
     * @param subjectFormatSAML11   * Subject format for SAML1.1.
     */
    public void setSubjectFormatSAML11(java.lang.String subjectFormatSAML11) {
        this.subjectFormatSAML11 = subjectFormatSAML11;
    }


    /**
     * Gets the subjectFormatSAML20 value for this SAMLTokenConfig.
     * 
     * @return subjectFormatSAML20   * Subject format for SAML2.0.
     */
    public java.lang.String getSubjectFormatSAML20() {
        return subjectFormatSAML20;
    }


    /**
     * Sets the subjectFormatSAML20 value for this SAMLTokenConfig.
     * 
     * @param subjectFormatSAML20   * Subject format for SAML2.0.
     */
    public void setSubjectFormatSAML20(java.lang.String subjectFormatSAML20) {
        this.subjectFormatSAML20 = subjectFormatSAML20;
    }


    /**
     * Gets the additionalAttributes value for this SAMLTokenConfig.
     * 
     * @return additionalAttributes   * SAML additional attributes.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttributeList getAdditionalAttributes() {
        return additionalAttributes;
    }


    /**
     * Sets the additionalAttributes value for this SAMLTokenConfig.
     * 
     * @param additionalAttributes   * SAML additional attributes.
     */
    public void setAdditionalAttributes(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLAdditionalAttributeList additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAMLTokenConfig)) return false;
        SAMLTokenConfig other = (SAMLTokenConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenSigningCertKeyPair==null && other.getTokenSigningCertKeyPair()==null) || 
             (this.tokenSigningCertKeyPair!=null &&
              this.tokenSigningCertKeyPair.equals(other.getTokenSigningCertKeyPair()))) &&
            ((this.digestMethod==null && other.getDigestMethod()==null) || 
             (this.digestMethod!=null &&
              this.digestMethod.equals(other.getDigestMethod()))) &&
            ((this.signatureMethod==null && other.getSignatureMethod()==null) || 
             (this.signatureMethod!=null &&
              this.signatureMethod.equals(other.getSignatureMethod()))) &&
            ((this.samlTokenAttributes==null && other.getSamlTokenAttributes()==null) || 
             (this.samlTokenAttributes!=null &&
              this.samlTokenAttributes.equals(other.getSamlTokenAttributes()))) &&
            ((this.subjectFormatSAML11==null && other.getSubjectFormatSAML11()==null) || 
             (this.subjectFormatSAML11!=null &&
              this.subjectFormatSAML11.equals(other.getSubjectFormatSAML11()))) &&
            ((this.subjectFormatSAML20==null && other.getSubjectFormatSAML20()==null) || 
             (this.subjectFormatSAML20!=null &&
              this.subjectFormatSAML20.equals(other.getSubjectFormatSAML20()))) &&
            ((this.additionalAttributes==null && other.getAdditionalAttributes()==null) || 
             (this.additionalAttributes!=null &&
              this.additionalAttributes.equals(other.getAdditionalAttributes())));
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
        if (getTokenSigningCertKeyPair() != null) {
            _hashCode += getTokenSigningCertKeyPair().hashCode();
        }
        if (getDigestMethod() != null) {
            _hashCode += getDigestMethod().hashCode();
        }
        if (getSignatureMethod() != null) {
            _hashCode += getSignatureMethod().hashCode();
        }
        if (getSamlTokenAttributes() != null) {
            _hashCode += getSamlTokenAttributes().hashCode();
        }
        if (getSubjectFormatSAML11() != null) {
            _hashCode += getSubjectFormatSAML11().hashCode();
        }
        if (getSubjectFormatSAML20() != null) {
            _hashCode += getSubjectFormatSAML20().hashCode();
        }
        if (getAdditionalAttributes() != null) {
            _hashCode += getAdditionalAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAMLTokenConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenSigningCertKeyPair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "tokenSigningCertKeyPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "digestMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "signatureMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectFormatSAML11");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "subjectFormatSAML11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectFormatSAML20");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "subjectFormatSAML20"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "additionalAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLAdditionalAttributeList"));
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
