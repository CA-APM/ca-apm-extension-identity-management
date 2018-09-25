/**
 * WebFortAuthFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.msgs;

public class WebFortAuthFault  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.WebFortFault  implements java.io.Serializable {
    private int credType;

    public WebFortAuthFault() {
    }

    public WebFortAuthFault(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String transactionID,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput,
           java.lang.String paramName,
           int credType) {
        super(
            message,
            reasonCode,
            responseCode,
            transactionID,
            additionalOutput,
            paramName);
        this.credType = credType;
    }


    /**
     * Gets the credType value for this WebFortAuthFault.
     * 
     * @return credType
     */
    public int getCredType() {
        return credType;
    }


    /**
     * Sets the credType value for this WebFortAuthFault.
     * 
     * @param credType
     */
    public void setCredType(int credType) {
        this.credType = credType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebFortAuthFault)) return false;
        WebFortAuthFault other = (WebFortAuthFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.credType == other.getCredType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getCredType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebFortAuthFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">WebFortAuthFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "credType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
