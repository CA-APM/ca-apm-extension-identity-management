/**
 * Token.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFTokenExchangeFormat._1_0;


/**
 * Describes the information about each token including
 * 		    vendor information, identity, shared secret and 
 * 		    other parameters like initial state(counter/time), 
 * 		    length of the OTP etc. Some of the values are either in 
 * 	        encrypted form (for example for data element 'Secret') or
 * 
 * 		    plain text (for example the data element 'Counter')
 */
public class Token  implements java.io.Serializable {
    private com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo tokenInfo;

    private com.arcot.www.ArWFTokenExchangeFormat._1_0.Key key;

    public Token() {
    }

    public Token(
           com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo tokenInfo,
           com.arcot.www.ArWFTokenExchangeFormat._1_0.Key key) {
           this.tokenInfo = tokenInfo;
           this.key = key;
    }


    /**
     * Gets the tokenInfo value for this Token.
     * 
     * @return tokenInfo
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo getTokenInfo() {
        return tokenInfo;
    }


    /**
     * Sets the tokenInfo value for this Token.
     * 
     * @param tokenInfo
     */
    public void setTokenInfo(com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }


    /**
     * Gets the key value for this Token.
     * 
     * @return key
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.Key getKey() {
        return key;
    }


    /**
     * Sets the key value for this Token.
     * 
     * @param key
     */
    public void setKey(com.arcot.www.ArWFTokenExchangeFormat._1_0.Key key) {
        this.key = key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Token)) return false;
        Token other = (Token) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokenInfo==null && other.getTokenInfo()==null) || 
             (this.tokenInfo!=null &&
              this.tokenInfo.equals(other.getTokenInfo()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey())));
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
        if (getTokenInfo() != null) {
            _hashCode += getTokenInfo().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Token.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Token"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "TokenInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "TokenInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Key"));
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
