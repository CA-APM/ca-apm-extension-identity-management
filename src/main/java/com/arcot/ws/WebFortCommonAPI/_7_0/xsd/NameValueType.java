/**
 * NameValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * Used as basic container for holding name value
 * 				pairs.
 * 				name - Name of the parameter.
 * 				strValue - String value of the
 * 				parameter.
 * 				binValue - Binary value of the parameter.
 * 				Only one value is
 * 				possible at a time.
 */
public class NameValueType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String strValue;

    private byte[] binValue;

    public NameValueType() {
    }

    public NameValueType(
           java.lang.String name,
           java.lang.String strValue,
           byte[] binValue) {
           this.name = name;
           this.strValue = strValue;
           this.binValue = binValue;
    }


    /**
     * Gets the name value for this NameValueType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NameValueType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the strValue value for this NameValueType.
     * 
     * @return strValue
     */
    public java.lang.String getStrValue() {
        return strValue;
    }


    /**
     * Sets the strValue value for this NameValueType.
     * 
     * @param strValue
     */
    public void setStrValue(java.lang.String strValue) {
        this.strValue = strValue;
    }


    /**
     * Gets the binValue value for this NameValueType.
     * 
     * @return binValue
     */
    public byte[] getBinValue() {
        return binValue;
    }


    /**
     * Sets the binValue value for this NameValueType.
     * 
     * @param binValue
     */
    public void setBinValue(byte[] binValue) {
        this.binValue = binValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameValueType)) return false;
        NameValueType other = (NameValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.strValue==null && other.getStrValue()==null) || 
             (this.strValue!=null &&
              this.strValue.equals(other.getStrValue()))) &&
            ((this.binValue==null && other.getBinValue()==null) || 
             (this.binValue!=null &&
              java.util.Arrays.equals(this.binValue, other.getBinValue())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStrValue() != null) {
            _hashCode += getStrValue().hashCode();
        }
        if (getBinValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "NameValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "strValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "binValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
