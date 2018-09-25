/**
 * EncryptionMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFTokenExchangeFormat._1_0;


/**
 * Describes the encryption scheme used for sensitive 
 * 			  information in the file. For example the data element 
 * 			  'Secret' is encrypted.
 */
public class EncryptionMethod  implements java.io.Serializable {
    /* Base64 encoded value of the Initialization Vector 
     * 					used in the encryption scheme. This is required only 
     * 					for "AES128-CBC" among the supported algorithms. */
    private java.lang.String IV;

    private java.lang.String algorithm;  // attribute

    public EncryptionMethod() {
    }

    public EncryptionMethod(
           java.lang.String IV,
           java.lang.String algorithm) {
           this.IV = IV;
           this.algorithm = algorithm;
    }


    /**
     * Gets the IV value for this EncryptionMethod.
     * 
     * @return IV   * Base64 encoded value of the Initialization Vector 
     * 					used in the encryption scheme. This is required only 
     * 					for "AES128-CBC" among the supported algorithms.
     */
    public java.lang.String getIV() {
        return IV;
    }


    /**
     * Sets the IV value for this EncryptionMethod.
     * 
     * @param IV   * Base64 encoded value of the Initialization Vector 
     * 					used in the encryption scheme. This is required only 
     * 					for "AES128-CBC" among the supported algorithms.
     */
    public void setIV(java.lang.String IV) {
        this.IV = IV;
    }


    /**
     * Gets the algorithm value for this EncryptionMethod.
     * 
     * @return algorithm
     */
    public java.lang.String getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this EncryptionMethod.
     * 
     * @param algorithm
     */
    public void setAlgorithm(java.lang.String algorithm) {
        this.algorithm = algorithm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncryptionMethod)) return false;
        EncryptionMethod other = (EncryptionMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IV==null && other.getIV()==null) || 
             (this.IV!=null &&
              this.IV.equals(other.getIV()))) &&
            ((this.algorithm==null && other.getAlgorithm()==null) || 
             (this.algorithm!=null &&
              this.algorithm.equals(other.getAlgorithm())));
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
        if (getIV() != null) {
            _hashCode += getIV().hashCode();
        }
        if (getAlgorithm() != null) {
            _hashCode += getAlgorithm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EncryptionMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "EncryptionMethod"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("algorithm");
        attrField.setXmlName(new javax.xml.namespace.QName("", "algorithm"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "IV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
