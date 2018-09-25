/**
 * EAPAuthTypeDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * "Certificate details for EAP authentication."
 */
public class EAPAuthTypeDetails  implements java.io.Serializable {
    /* Server certificate details. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certificateDetails;

    public EAPAuthTypeDetails() {
    }

    public EAPAuthTypeDetails(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certificateDetails) {
           this.certificateDetails = certificateDetails;
    }


    /**
     * Gets the certificateDetails value for this EAPAuthTypeDetails.
     * 
     * @return certificateDetails   * Server certificate details.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails getCertificateDetails() {
        return certificateDetails;
    }


    /**
     * Sets the certificateDetails value for this EAPAuthTypeDetails.
     * 
     * @param certificateDetails   * Server certificate details.
     */
    public void setCertificateDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certificateDetails) {
        this.certificateDetails = certificateDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EAPAuthTypeDetails)) return false;
        EAPAuthTypeDetails other = (EAPAuthTypeDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateDetails==null && other.getCertificateDetails()==null) || 
             (this.certificateDetails!=null &&
              this.certificateDetails.equals(other.getCertificateDetails())));
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
        if (getCertificateDetails() != null) {
            _hashCode += getCertificateDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EAPAuthTypeDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EAPAuthTypeDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "certificateDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails"));
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
