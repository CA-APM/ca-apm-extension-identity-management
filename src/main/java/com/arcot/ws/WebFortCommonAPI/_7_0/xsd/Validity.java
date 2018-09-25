/**
 * Validity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;

public class Validity  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityBegin;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEnd;

    public Validity() {
    }

    public Validity(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityBegin,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEnd) {
           this.validityBegin = validityBegin;
           this.validityEnd = validityEnd;
    }


    /**
     * Gets the validityBegin value for this Validity.
     * 
     * @return validityBegin
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getValidityBegin() {
        return validityBegin;
    }


    /**
     * Sets the validityBegin value for this Validity.
     * 
     * @param validityBegin
     */
    public void setValidityBegin(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityBegin) {
        this.validityBegin = validityBegin;
    }


    /**
     * Gets the validityEnd value for this Validity.
     * 
     * @return validityEnd
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getValidityEnd() {
        return validityEnd;
    }


    /**
     * Sets the validityEnd value for this Validity.
     * 
     * @param validityEnd
     */
    public void setValidityEnd(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEnd) {
        this.validityEnd = validityEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Validity)) return false;
        Validity other = (Validity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validityBegin==null && other.getValidityBegin()==null) || 
             (this.validityBegin!=null &&
              this.validityBegin.equals(other.getValidityBegin()))) &&
            ((this.validityEnd==null && other.getValidityEnd()==null) || 
             (this.validityEnd!=null &&
              this.validityEnd.equals(other.getValidityEnd())));
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
        if (getValidityBegin() != null) {
            _hashCode += getValidityBegin().hashCode();
        }
        if (getValidityEnd() != null) {
            _hashCode += getValidityEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Validity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "Validity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "validityBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "validityEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
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
