/**
 * CertKeyPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * Defines a key pair.
 */
public class CertKeyPair  implements java.io.Serializable {
    /* Use this when the key pair is in HSM. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInHSM keyPairInHSM;

    /* Use this when the key pair is in P12. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInP12 keyPairInP12;

    public CertKeyPair() {
    }

    public CertKeyPair(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInHSM keyPairInHSM,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInP12 keyPairInP12) {
           this.keyPairInHSM = keyPairInHSM;
           this.keyPairInP12 = keyPairInP12;
    }


    /**
     * Gets the keyPairInHSM value for this CertKeyPair.
     * 
     * @return keyPairInHSM   * Use this when the key pair is in HSM.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInHSM getKeyPairInHSM() {
        return keyPairInHSM;
    }


    /**
     * Sets the keyPairInHSM value for this CertKeyPair.
     * 
     * @param keyPairInHSM   * Use this when the key pair is in HSM.
     */
    public void setKeyPairInHSM(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInHSM keyPairInHSM) {
        this.keyPairInHSM = keyPairInHSM;
    }


    /**
     * Gets the keyPairInP12 value for this CertKeyPair.
     * 
     * @return keyPairInP12   * Use this when the key pair is in P12.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInP12 getKeyPairInP12() {
        return keyPairInP12;
    }


    /**
     * Sets the keyPairInP12 value for this CertKeyPair.
     * 
     * @param keyPairInP12   * Use this when the key pair is in P12.
     */
    public void setKeyPairInP12(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPairKeyPairInP12 keyPairInP12) {
        this.keyPairInP12 = keyPairInP12;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertKeyPair)) return false;
        CertKeyPair other = (CertKeyPair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyPairInHSM==null && other.getKeyPairInHSM()==null) || 
             (this.keyPairInHSM!=null &&
              this.keyPairInHSM.equals(other.getKeyPairInHSM()))) &&
            ((this.keyPairInP12==null && other.getKeyPairInP12()==null) || 
             (this.keyPairInP12!=null &&
              this.keyPairInP12.equals(other.getKeyPairInP12())));
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
        if (getKeyPairInHSM() != null) {
            _hashCode += getKeyPairInHSM().hashCode();
        }
        if (getKeyPairInP12() != null) {
            _hashCode += getKeyPairInP12().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertKeyPair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPairInHSM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "keyPairInHSM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInHSM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPairInP12");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "keyPairInP12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">CertKeyPair>keyPairInP12"));
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
