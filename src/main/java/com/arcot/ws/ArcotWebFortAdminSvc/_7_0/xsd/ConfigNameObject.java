/**
 * ConfigNameObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigNameObject is the structure used to represent
 * 				configuration details that are used while
 * 				fetching configuration names.
 */
public class ConfigNameObject  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Specifies whether the config is assigned
     * 								from global. */
    private boolean isAssignedFromGlobal;

    public ConfigNameObject() {
    }

    public ConfigNameObject(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           boolean isAssignedFromGlobal) {
        super(
            name,
            status);
        this.isAssignedFromGlobal = isAssignedFromGlobal;
    }


    /**
     * Gets the isAssignedFromGlobal value for this ConfigNameObject.
     * 
     * @return isAssignedFromGlobal   * Specifies whether the config is assigned
     * 								from global.
     */
    public boolean isIsAssignedFromGlobal() {
        return isAssignedFromGlobal;
    }


    /**
     * Sets the isAssignedFromGlobal value for this ConfigNameObject.
     * 
     * @param isAssignedFromGlobal   * Specifies whether the config is assigned
     * 								from global.
     */
    public void setIsAssignedFromGlobal(boolean isAssignedFromGlobal) {
        this.isAssignedFromGlobal = isAssignedFromGlobal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigNameObject)) return false;
        ConfigNameObject other = (ConfigNameObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.isAssignedFromGlobal == other.isIsAssignedFromGlobal();
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
        _hashCode += (isIsAssignedFromGlobal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigNameObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAssignedFromGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isAssignedFromGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
