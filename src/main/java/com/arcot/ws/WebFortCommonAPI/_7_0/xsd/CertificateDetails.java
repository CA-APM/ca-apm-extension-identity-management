/**
 * CertificateDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * CertificateCoordinates provides information
 * 				about a
 * 				certificate that has been loaded on the
 * 				server in a human readable
 * 				form. certSubject is
 * 				the full Distinguished Name of the certificate.
 * 				validityBegin is the date and time the
 * 				certificate may be used.
 * 				validityEnd is the date
 * 				and time of the certificate expiration.
 */
public class CertificateDetails  implements java.io.Serializable {
    private java.lang.String certSubject;

    private java.lang.String issuerName;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity;

    private boolean keyInHSM;

    public CertificateDetails() {
    }

    public CertificateDetails(
           java.lang.String certSubject,
           java.lang.String issuerName,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           boolean keyInHSM) {
           this.certSubject = certSubject;
           this.issuerName = issuerName;
           this.validity = validity;
           this.keyInHSM = keyInHSM;
    }


    /**
     * Gets the certSubject value for this CertificateDetails.
     * 
     * @return certSubject
     */
    public java.lang.String getCertSubject() {
        return certSubject;
    }


    /**
     * Sets the certSubject value for this CertificateDetails.
     * 
     * @param certSubject
     */
    public void setCertSubject(java.lang.String certSubject) {
        this.certSubject = certSubject;
    }


    /**
     * Gets the issuerName value for this CertificateDetails.
     * 
     * @return issuerName
     */
    public java.lang.String getIssuerName() {
        return issuerName;
    }


    /**
     * Sets the issuerName value for this CertificateDetails.
     * 
     * @param issuerName
     */
    public void setIssuerName(java.lang.String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets the validity value for this CertificateDetails.
     * 
     * @return validity
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this CertificateDetails.
     * 
     * @param validity
     */
    public void setValidity(com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity) {
        this.validity = validity;
    }


    /**
     * Gets the keyInHSM value for this CertificateDetails.
     * 
     * @return keyInHSM
     */
    public boolean isKeyInHSM() {
        return keyInHSM;
    }


    /**
     * Sets the keyInHSM value for this CertificateDetails.
     * 
     * @param keyInHSM
     */
    public void setKeyInHSM(boolean keyInHSM) {
        this.keyInHSM = keyInHSM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificateDetails)) return false;
        CertificateDetails other = (CertificateDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certSubject==null && other.getCertSubject()==null) || 
             (this.certSubject!=null &&
              this.certSubject.equals(other.getCertSubject()))) &&
            ((this.issuerName==null && other.getIssuerName()==null) || 
             (this.issuerName!=null &&
              this.issuerName.equals(other.getIssuerName()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            this.keyInHSM == other.isKeyInHSM();
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
        if (getCertSubject() != null) {
            _hashCode += getCertSubject().hashCode();
        }
        if (getIssuerName() != null) {
            _hashCode += getIssuerName().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        _hashCode += (isKeyInHSM() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "certSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "issuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "Validity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyInHSM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "keyInHSM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
