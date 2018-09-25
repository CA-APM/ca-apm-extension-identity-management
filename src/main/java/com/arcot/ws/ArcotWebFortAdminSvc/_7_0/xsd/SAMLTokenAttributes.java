/**
 * SAMLTokenAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * SAMLTokenAttributes is the structure used to
 * 				represent SAML token attributes.
 */
public class SAMLTokenAttributes  implements java.io.Serializable {
    /* SAML Issuer name. */
    private java.lang.String issuerName;

    /* Flag for one time use. */
    private java.lang.Boolean oneTimeUse;

    /* Assertion timeOut. */
    private java.lang.Integer assertionTimeOut;

    /* Audiences. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList audiences;

    public SAMLTokenAttributes() {
    }

    public SAMLTokenAttributes(
           java.lang.String issuerName,
           java.lang.Boolean oneTimeUse,
           java.lang.Integer assertionTimeOut,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList audiences) {
           this.issuerName = issuerName;
           this.oneTimeUse = oneTimeUse;
           this.assertionTimeOut = assertionTimeOut;
           this.audiences = audiences;
    }


    /**
     * Gets the issuerName value for this SAMLTokenAttributes.
     * 
     * @return issuerName   * SAML Issuer name.
     */
    public java.lang.String getIssuerName() {
        return issuerName;
    }


    /**
     * Sets the issuerName value for this SAMLTokenAttributes.
     * 
     * @param issuerName   * SAML Issuer name.
     */
    public void setIssuerName(java.lang.String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets the oneTimeUse value for this SAMLTokenAttributes.
     * 
     * @return oneTimeUse   * Flag for one time use.
     */
    public java.lang.Boolean getOneTimeUse() {
        return oneTimeUse;
    }


    /**
     * Sets the oneTimeUse value for this SAMLTokenAttributes.
     * 
     * @param oneTimeUse   * Flag for one time use.
     */
    public void setOneTimeUse(java.lang.Boolean oneTimeUse) {
        this.oneTimeUse = oneTimeUse;
    }


    /**
     * Gets the assertionTimeOut value for this SAMLTokenAttributes.
     * 
     * @return assertionTimeOut   * Assertion timeOut.
     */
    public java.lang.Integer getAssertionTimeOut() {
        return assertionTimeOut;
    }


    /**
     * Sets the assertionTimeOut value for this SAMLTokenAttributes.
     * 
     * @param assertionTimeOut   * Assertion timeOut.
     */
    public void setAssertionTimeOut(java.lang.Integer assertionTimeOut) {
        this.assertionTimeOut = assertionTimeOut;
    }


    /**
     * Gets the audiences value for this SAMLTokenAttributes.
     * 
     * @return audiences   * Audiences.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList getAudiences() {
        return audiences;
    }


    /**
     * Sets the audiences value for this SAMLTokenAttributes.
     * 
     * @param audiences   * Audiences.
     */
    public void setAudiences(com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList audiences) {
        this.audiences = audiences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAMLTokenAttributes)) return false;
        SAMLTokenAttributes other = (SAMLTokenAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issuerName==null && other.getIssuerName()==null) || 
             (this.issuerName!=null &&
              this.issuerName.equals(other.getIssuerName()))) &&
            ((this.oneTimeUse==null && other.getOneTimeUse()==null) || 
             (this.oneTimeUse!=null &&
              this.oneTimeUse.equals(other.getOneTimeUse()))) &&
            ((this.assertionTimeOut==null && other.getAssertionTimeOut()==null) || 
             (this.assertionTimeOut!=null &&
              this.assertionTimeOut.equals(other.getAssertionTimeOut()))) &&
            ((this.audiences==null && other.getAudiences()==null) || 
             (this.audiences!=null &&
              this.audiences.equals(other.getAudiences())));
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
        if (getIssuerName() != null) {
            _hashCode += getIssuerName().hashCode();
        }
        if (getOneTimeUse() != null) {
            _hashCode += getOneTimeUse().hashCode();
        }
        if (getAssertionTimeOut() != null) {
            _hashCode += getAssertionTimeOut().hashCode();
        }
        if (getAudiences() != null) {
            _hashCode += getAudiences().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAMLTokenAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "issuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeUse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oneTimeUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "assertionTimeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audiences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "audiences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "StringList"));
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
