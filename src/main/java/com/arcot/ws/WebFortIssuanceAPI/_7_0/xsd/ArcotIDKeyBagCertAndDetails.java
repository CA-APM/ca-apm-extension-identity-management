/**
 * ArcotIDKeyBagCertAndDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * A structure to hold both certEncoding and certDetails. Used in
 * responses.
 * 			certEncoding is the certificate encoding and certDetails are the
 * details of the certificate.
 */
public class ArcotIDKeyBagCertAndDetails  implements java.io.Serializable {
    private byte[] certEncoding;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertDetails certsDetails;

    public ArcotIDKeyBagCertAndDetails() {
    }

    public ArcotIDKeyBagCertAndDetails(
           byte[] certEncoding,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertDetails certsDetails) {
           this.certEncoding = certEncoding;
           this.certsDetails = certsDetails;
    }


    /**
     * Gets the certEncoding value for this ArcotIDKeyBagCertAndDetails.
     * 
     * @return certEncoding
     */
    public byte[] getCertEncoding() {
        return certEncoding;
    }


    /**
     * Sets the certEncoding value for this ArcotIDKeyBagCertAndDetails.
     * 
     * @param certEncoding
     */
    public void setCertEncoding(byte[] certEncoding) {
        this.certEncoding = certEncoding;
    }


    /**
     * Gets the certsDetails value for this ArcotIDKeyBagCertAndDetails.
     * 
     * @return certsDetails
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertDetails getCertsDetails() {
        return certsDetails;
    }


    /**
     * Sets the certsDetails value for this ArcotIDKeyBagCertAndDetails.
     * 
     * @param certsDetails
     */
    public void setCertsDetails(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertDetails certsDetails) {
        this.certsDetails = certsDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagCertAndDetails)) return false;
        ArcotIDKeyBagCertAndDetails other = (ArcotIDKeyBagCertAndDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certEncoding==null && other.getCertEncoding()==null) || 
             (this.certEncoding!=null &&
              java.util.Arrays.equals(this.certEncoding, other.getCertEncoding()))) &&
            ((this.certsDetails==null && other.getCertsDetails()==null) || 
             (this.certsDetails!=null &&
              this.certsDetails.equals(other.getCertsDetails())));
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
        if (getCertEncoding() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertEncoding());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertEncoding(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertsDetails() != null) {
            _hashCode += getCertsDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagCertAndDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertAndDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "certEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certsDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "certsDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertDetails"));
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
