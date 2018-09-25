/**
 * CertKeyPairKeyPairInP12.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;

public class CertKeyPairKeyPairInP12  implements java.io.Serializable {
    private byte[] certKeyP12;

    private java.lang.String certKeyP12Password;

    public CertKeyPairKeyPairInP12() {
    }

    public CertKeyPairKeyPairInP12(
           byte[] certKeyP12,
           java.lang.String certKeyP12Password) {
           this.certKeyP12 = certKeyP12;
           this.certKeyP12Password = certKeyP12Password;
    }


    /**
     * Gets the certKeyP12 value for this CertKeyPairKeyPairInP12.
     * 
     * @return certKeyP12
     */
    public byte[] getCertKeyP12() {
        return certKeyP12;
    }


    /**
     * Sets the certKeyP12 value for this CertKeyPairKeyPairInP12.
     * 
     * @param certKeyP12
     */
    public void setCertKeyP12(byte[] certKeyP12) {
        this.certKeyP12 = certKeyP12;
    }


    /**
     * Gets the certKeyP12Password value for this CertKeyPairKeyPairInP12.
     * 
     * @return certKeyP12Password
     */
    public java.lang.String getCertKeyP12Password() {
        return certKeyP12Password;
    }


    /**
     * Sets the certKeyP12Password value for this CertKeyPairKeyPairInP12.
     * 
     * @param certKeyP12Password
     */
    public void setCertKeyP12Password(java.lang.String certKeyP12Password) {
        this.certKeyP12Password = certKeyP12Password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertKeyPairKeyPairInP12)) return false;
        CertKeyPairKeyPairInP12 other = (CertKeyPairKeyPairInP12) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certKeyP12==null && other.getCertKeyP12()==null) || 
             (this.certKeyP12!=null &&
              java.util.Arrays.equals(this.certKeyP12, other.getCertKeyP12()))) &&
            ((this.certKeyP12Password==null && other.getCertKeyP12Password()==null) || 
             (this.certKeyP12Password!=null &&
              this.certKeyP12Password.equals(other.getCertKeyP12Password())));
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
        if (getCertKeyP12() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertKeyP12());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertKeyP12(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertKeyP12Password() != null) {
            _hashCode += getCertKeyP12Password().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertKeyPairKeyPairInP12.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInP12"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKeyP12");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "certKeyP12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certKeyP12Password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "certKeyP12Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
