/**
 * BulkCredentialsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Possible ways of specifying credentials to assign.
 */
public class BulkCredentialsType  implements java.io.Serializable {
    private com.arcot.www.ArWFCredMgmt._7_0.CredContainer[] credentials;

    private java.lang.String inputXml;

    public BulkCredentialsType() {
    }

    public BulkCredentialsType(
           com.arcot.www.ArWFCredMgmt._7_0.CredContainer[] credentials,
           java.lang.String inputXml) {
           this.credentials = credentials;
           this.inputXml = inputXml;
    }


    /**
     * Gets the credentials value for this BulkCredentialsType.
     * 
     * @return credentials
     */
    public com.arcot.www.ArWFCredMgmt._7_0.CredContainer[] getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this BulkCredentialsType.
     * 
     * @param credentials
     */
    public void setCredentials(com.arcot.www.ArWFCredMgmt._7_0.CredContainer[] credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the inputXml value for this BulkCredentialsType.
     * 
     * @return inputXml
     */
    public java.lang.String getInputXml() {
        return inputXml;
    }


    /**
     * Sets the inputXml value for this BulkCredentialsType.
     * 
     * @param inputXml
     */
    public void setInputXml(java.lang.String inputXml) {
        this.inputXml = inputXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkCredentialsType)) return false;
        BulkCredentialsType other = (BulkCredentialsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              java.util.Arrays.equals(this.credentials, other.getCredentials()))) &&
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
        if (getCredentials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredentials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredentials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInputXml() != null) {
            _hashCode += getInputXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkCredentialsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BulkCredentialsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "CredContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "credContainer"));
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
