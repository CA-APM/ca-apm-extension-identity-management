/**
 * ArKeyContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFTokenExchangeFormat._1_0;


/**
 * Describes the container that carries file level EncryptionMethod
 * 			  and a list of Tokens.
 */
public class ArKeyContainer  implements java.io.Serializable {
    private com.arcot.www.ArWFTokenExchangeFormat._1_0.EncryptionMethod encryptionMethod;

    private com.arcot.www.ArWFTokenExchangeFormat._1_0.Token[] token;

    private java.lang.String version;  // attribute

    public ArKeyContainer() {
    }

    public ArKeyContainer(
           com.arcot.www.ArWFTokenExchangeFormat._1_0.EncryptionMethod encryptionMethod,
           com.arcot.www.ArWFTokenExchangeFormat._1_0.Token[] token,
           java.lang.String version) {
           this.encryptionMethod = encryptionMethod;
           this.token = token;
           this.version = version;
    }


    /**
     * Gets the encryptionMethod value for this ArKeyContainer.
     * 
     * @return encryptionMethod
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.EncryptionMethod getEncryptionMethod() {
        return encryptionMethod;
    }


    /**
     * Sets the encryptionMethod value for this ArKeyContainer.
     * 
     * @param encryptionMethod
     */
    public void setEncryptionMethod(com.arcot.www.ArWFTokenExchangeFormat._1_0.EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }


    /**
     * Gets the token value for this ArKeyContainer.
     * 
     * @return token
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.Token[] getToken() {
        return token;
    }


    /**
     * Sets the token value for this ArKeyContainer.
     * 
     * @param token
     */
    public void setToken(com.arcot.www.ArWFTokenExchangeFormat._1_0.Token[] token) {
        this.token = token;
    }

    public com.arcot.www.ArWFTokenExchangeFormat._1_0.Token getToken(int i) {
        return this.token[i];
    }

    public void setToken(int i, com.arcot.www.ArWFTokenExchangeFormat._1_0.Token _value) {
        this.token[i] = _value;
    }


    /**
     * Gets the version value for this ArKeyContainer.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ArKeyContainer.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArKeyContainer)) return false;
        ArKeyContainer other = (ArKeyContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptionMethod==null && other.getEncryptionMethod()==null) || 
             (this.encryptionMethod!=null &&
              this.encryptionMethod.equals(other.getEncryptionMethod()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              java.util.Arrays.equals(this.token, other.getToken()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getEncryptionMethod() != null) {
            _hashCode += getEncryptionMethod().hashCode();
        }
        if (getToken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArKeyContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "ArKeyContainer"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "EncryptionMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "EncryptionMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Token"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
