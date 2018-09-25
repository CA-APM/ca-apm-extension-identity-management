/**
 * AttributeMappingsTypeMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;

public class AttributeMappingsTypeMapping  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String repositoryattribute;  // attribute

    private java.lang.String arcotattribute;  // attribute

    public AttributeMappingsTypeMapping() {
    }

    // Simple Types must have a String constructor
    public AttributeMappingsTypeMapping(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this AttributeMappingsTypeMapping.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this AttributeMappingsTypeMapping.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the repositoryattribute value for this AttributeMappingsTypeMapping.
     * 
     * @return repositoryattribute
     */
    public java.lang.String getRepositoryattribute() {
        return repositoryattribute;
    }


    /**
     * Sets the repositoryattribute value for this AttributeMappingsTypeMapping.
     * 
     * @param repositoryattribute
     */
    public void setRepositoryattribute(java.lang.String repositoryattribute) {
        this.repositoryattribute = repositoryattribute;
    }


    /**
     * Gets the arcotattribute value for this AttributeMappingsTypeMapping.
     * 
     * @return arcotattribute
     */
    public java.lang.String getArcotattribute() {
        return arcotattribute;
    }


    /**
     * Sets the arcotattribute value for this AttributeMappingsTypeMapping.
     * 
     * @param arcotattribute
     */
    public void setArcotattribute(java.lang.String arcotattribute) {
        this.arcotattribute = arcotattribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeMappingsTypeMapping)) return false;
        AttributeMappingsTypeMapping other = (AttributeMappingsTypeMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.repositoryattribute==null && other.getRepositoryattribute()==null) || 
             (this.repositoryattribute!=null &&
              this.repositoryattribute.equals(other.getRepositoryattribute()))) &&
            ((this.arcotattribute==null && other.getArcotattribute()==null) || 
             (this.arcotattribute!=null &&
              this.arcotattribute.equals(other.getArcotattribute())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getRepositoryattribute() != null) {
            _hashCode += getRepositoryattribute().hashCode();
        }
        if (getArcotattribute() != null) {
            _hashCode += getArcotattribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeMappingsTypeMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">AttributeMappingsType>mapping"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("repositoryattribute");
        attrField.setXmlName(new javax.xml.namespace.QName("", "repositoryattribute"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arcotattribute");
        attrField.setXmlName(new javax.xml.namespace.QName("", "arcotattribute"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
