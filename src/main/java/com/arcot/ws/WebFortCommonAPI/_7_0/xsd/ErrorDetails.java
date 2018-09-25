/**
 * ErrorDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * This type includes error parameter name
 * 				to the ResponseDetails.
 */
public class ErrorDetails  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.ResponseDetails  implements java.io.Serializable {
    /* Invalid parameter name. */
    private java.lang.String paramName;

    public ErrorDetails() {
    }

    public ErrorDetails(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String paramName) {
        super(
            message,
            reasonCode,
            responseCode);
        this.paramName = paramName;
    }


    /**
     * Gets the paramName value for this ErrorDetails.
     * 
     * @return paramName   * Invalid parameter name.
     */
    public java.lang.String getParamName() {
        return paramName;
    }


    /**
     * Sets the paramName value for this ErrorDetails.
     * 
     * @param paramName   * Invalid parameter name.
     */
    public void setParamName(java.lang.String paramName) {
        this.paramName = paramName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorDetails)) return false;
        ErrorDetails other = (ErrorDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paramName==null && other.getParamName()==null) || 
             (this.paramName!=null &&
              this.paramName.equals(other.getParamName())));
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
        if (getParamName() != null) {
            _hashCode += getParamName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ErrorDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "paramName"));
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
