/**
 * BulkOATHTokensType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Possible ways of specifying oath tokens to upload.
 */
public class BulkOATHTokensType  implements java.io.Serializable {
    private com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensType tokens;

    private java.lang.String inputXml;

    public BulkOATHTokensType() {
    }

    public BulkOATHTokensType(
           com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensType tokens,
           java.lang.String inputXml) {
           this.tokens = tokens;
           this.inputXml = inputXml;
    }


    /**
     * Gets the tokens value for this BulkOATHTokensType.
     * 
     * @return tokens
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensType getTokens() {
        return tokens;
    }


    /**
     * Sets the tokens value for this BulkOATHTokensType.
     * 
     * @param tokens
     */
    public void setTokens(com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.UploadOATHTokensType tokens) {
        this.tokens = tokens;
    }


    /**
     * Gets the inputXml value for this BulkOATHTokensType.
     * 
     * @return inputXml
     */
    public java.lang.String getInputXml() {
        return inputXml;
    }


    /**
     * Sets the inputXml value for this BulkOATHTokensType.
     * 
     * @param inputXml
     */
    public void setInputXml(java.lang.String inputXml) {
        this.inputXml = inputXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkOATHTokensType)) return false;
        BulkOATHTokensType other = (BulkOATHTokensType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokens==null && other.getTokens()==null) || 
             (this.tokens!=null &&
              this.tokens.equals(other.getTokens()))) &&
            ((this.inputXml==null && other.getInputXml()==null) || 
             (this.inputXml!=null &&
              this.inputXml.equals(other.getInputXml())));
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
        if (getTokens() != null) {
            _hashCode += getTokens().hashCode();
        }
        if (getInputXml() != null) {
            _hashCode += getInputXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkOATHTokensType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BulkOATHTokensType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "UploadOATHTokensType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "inputXml"));
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
