/**
 * QnARequestAttributeAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;

public class QnARequestAttributeAttribute  implements java.io.Serializable {
    private java.lang.String attrName;  // attribute

    private java.lang.String attrValue;  // attribute

    public QnARequestAttributeAttribute() {
    }

    public QnARequestAttributeAttribute(
           java.lang.String attrName,
           java.lang.String attrValue) {
           this.attrName = attrName;
           this.attrValue = attrValue;
    }


    /**
     * Gets the attrName value for this QnARequestAttributeAttribute.
     * 
     * @return attrName
     */
    public java.lang.String getAttrName() {
        return attrName;
    }


    /**
     * Sets the attrName value for this QnARequestAttributeAttribute.
     * 
     * @param attrName
     */
    public void setAttrName(java.lang.String attrName) {
        this.attrName = attrName;
    }


    /**
     * Gets the attrValue value for this QnARequestAttributeAttribute.
     * 
     * @return attrValue
     */
    public java.lang.String getAttrValue() {
        return attrValue;
    }


    /**
     * Sets the attrValue value for this QnARequestAttributeAttribute.
     * 
     * @param attrValue
     */
    public void setAttrValue(java.lang.String attrValue) {
        this.attrValue = attrValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QnARequestAttributeAttribute)) return false;
        QnARequestAttributeAttribute other = (QnARequestAttributeAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attrName==null && other.getAttrName()==null) || 
             (this.attrName!=null &&
              this.attrName.equals(other.getAttrName()))) &&
            ((this.attrValue==null && other.getAttrValue()==null) || 
             (this.attrValue!=null &&
              this.attrValue.equals(other.getAttrValue())));
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
        if (getAttrName() != null) {
            _hashCode += getAttrName().hashCode();
        }
        if (getAttrValue() != null) {
            _hashCode += getAttrValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QnARequestAttributeAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">QnARequestAttribute>attribute"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attrName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attrName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("attrValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "attrValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
