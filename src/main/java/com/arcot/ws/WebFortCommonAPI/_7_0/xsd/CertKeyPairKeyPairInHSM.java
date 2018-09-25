/**
 * CertKeyPairKeyPairInHSM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;

public class CertKeyPairKeyPairInHSM  implements java.io.Serializable {
    private java.lang.String certChainPEM;

    public CertKeyPairKeyPairInHSM() {
    }

    public CertKeyPairKeyPairInHSM(
           java.lang.String certChainPEM) {
           this.certChainPEM = certChainPEM;
    }


    /**
     * Gets the certChainPEM value for this CertKeyPairKeyPairInHSM.
     * 
     * @return certChainPEM
     */
    public java.lang.String getCertChainPEM() {
        return certChainPEM;
    }


    /**
     * Sets the certChainPEM value for this CertKeyPairKeyPairInHSM.
     * 
     * @param certChainPEM
     */
    public void setCertChainPEM(java.lang.String certChainPEM) {
        this.certChainPEM = certChainPEM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertKeyPairKeyPairInHSM)) return false;
        CertKeyPairKeyPairInHSM other = (CertKeyPairKeyPairInHSM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certChainPEM==null && other.getCertChainPEM()==null) || 
             (this.certChainPEM!=null &&
              this.certChainPEM.equals(other.getCertChainPEM())));
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
        if (getCertChainPEM() != null) {
            _hashCode += getCertChainPEM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertKeyPairKeyPairInHSM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInHSM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certChainPEM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "certChainPEM"));
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
