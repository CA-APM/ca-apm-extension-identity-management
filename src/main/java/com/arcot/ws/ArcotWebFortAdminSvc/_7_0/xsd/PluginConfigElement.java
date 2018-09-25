/**
 * PluginConfigElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * PluginConfigElement is the structure used to
 * 				represent plugin configuration elements.
 */
public class PluginConfigElement  implements java.io.Serializable {
    /* Configuration element name. */
    private java.lang.String name;

    /* Type of the configuration element. */
    private java.lang.String type;

    /* Description of configuration element. */
    private java.lang.String description;

    /* Default value of configuration element. */
    private java.lang.String defaultValue;

    /* Assigned value of configuration element. */
    private java.lang.String assignedValue;

    /* Possible values of configuration element */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList listValues;

    /* Assigned value of configuration element in bytes. */
    private byte[] assignedValueBytes;

    public PluginConfigElement() {
    }

    public PluginConfigElement(
           java.lang.String name,
           java.lang.String type,
           java.lang.String description,
           java.lang.String defaultValue,
           java.lang.String assignedValue,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList listValues,
           byte[] assignedValueBytes) {
           this.name = name;
           this.type = type;
           this.description = description;
           this.defaultValue = defaultValue;
           this.assignedValue = assignedValue;
           this.listValues = listValues;
           this.assignedValueBytes = assignedValueBytes;
    }


    /**
     * Gets the name value for this PluginConfigElement.
     * 
     * @return name   * Configuration element name.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PluginConfigElement.
     * 
     * @param name   * Configuration element name.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this PluginConfigElement.
     * 
     * @return type   * Type of the configuration element.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PluginConfigElement.
     * 
     * @param type   * Type of the configuration element.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the description value for this PluginConfigElement.
     * 
     * @return description   * Description of configuration element.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PluginConfigElement.
     * 
     * @param description   * Description of configuration element.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the defaultValue value for this PluginConfigElement.
     * 
     * @return defaultValue   * Default value of configuration element.
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this PluginConfigElement.
     * 
     * @param defaultValue   * Default value of configuration element.
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the assignedValue value for this PluginConfigElement.
     * 
     * @return assignedValue   * Assigned value of configuration element.
     */
    public java.lang.String getAssignedValue() {
        return assignedValue;
    }


    /**
     * Sets the assignedValue value for this PluginConfigElement.
     * 
     * @param assignedValue   * Assigned value of configuration element.
     */
    public void setAssignedValue(java.lang.String assignedValue) {
        this.assignedValue = assignedValue;
    }


    /**
     * Gets the listValues value for this PluginConfigElement.
     * 
     * @return listValues   * Possible values of configuration element
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList getListValues() {
        return listValues;
    }


    /**
     * Sets the listValues value for this PluginConfigElement.
     * 
     * @param listValues   * Possible values of configuration element
     */
    public void setListValues(com.arcot.ws.WebFortCommonAPI._7_0.xsd.StringList listValues) {
        this.listValues = listValues;
    }


    /**
     * Gets the assignedValueBytes value for this PluginConfigElement.
     * 
     * @return assignedValueBytes   * Assigned value of configuration element in bytes.
     */
    public byte[] getAssignedValueBytes() {
        return assignedValueBytes;
    }


    /**
     * Sets the assignedValueBytes value for this PluginConfigElement.
     * 
     * @param assignedValueBytes   * Assigned value of configuration element in bytes.
     */
    public void setAssignedValueBytes(byte[] assignedValueBytes) {
        this.assignedValueBytes = assignedValueBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PluginConfigElement)) return false;
        PluginConfigElement other = (PluginConfigElement) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.assignedValue==null && other.getAssignedValue()==null) || 
             (this.assignedValue!=null &&
              this.assignedValue.equals(other.getAssignedValue()))) &&
            ((this.listValues==null && other.getListValues()==null) || 
             (this.listValues!=null &&
              this.listValues.equals(other.getListValues()))) &&
            ((this.assignedValueBytes==null && other.getAssignedValueBytes()==null) || 
             (this.assignedValueBytes!=null &&
              java.util.Arrays.equals(this.assignedValueBytes, other.getAssignedValueBytes())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getAssignedValue() != null) {
            _hashCode += getAssignedValue().hashCode();
        }
        if (getListValues() != null) {
            _hashCode += getListValues().hashCode();
        }
        if (getAssignedValueBytes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedValueBytes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedValueBytes(), i);
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
        new org.apache.axis.description.TypeDesc(PluginConfigElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfigElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "assignedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "listValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "StringList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedValueBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "assignedValueBytes"));
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
