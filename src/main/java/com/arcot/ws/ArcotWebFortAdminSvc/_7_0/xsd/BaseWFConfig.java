/**
 * BaseWFConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * BaseWFConfig is base class of all admin
 * 				configuration
 * 				data structures like profiles and policies, etc.
 */
public class BaseWFConfig  implements java.io.Serializable {
    /* Configuration name */
    private java.lang.String name;

    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status;

    public BaseWFConfig() {
    }

    public BaseWFConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status) {
           this.name = name;
           this.status = status;
    }


    /**
     * Gets the name value for this BaseWFConfig.
     * 
     * @return name   * Configuration name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BaseWFConfig.
     * 
     * @param name   * Configuration name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this BaseWFConfig.
     * 
     * @return status
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BaseWFConfig.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseWFConfig)) return false;
        BaseWFConfig other = (BaseWFConfig) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseWFConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigStatus"));
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
