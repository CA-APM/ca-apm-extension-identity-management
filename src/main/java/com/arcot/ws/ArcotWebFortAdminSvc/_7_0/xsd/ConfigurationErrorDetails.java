/**
 * ConfigurationErrorDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigurationErrorDetails is the structure used for
 * 				holding the admin
 * 				transaction failure details per configuration.
 */
public class ConfigurationErrorDetails  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails  implements java.io.Serializable {
    /* Configuration name to which the transaction is failed. */
    private java.lang.String configName;

    public ConfigurationErrorDetails() {
    }

    public ConfigurationErrorDetails(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String paramName,
           java.lang.String configName) {
        super(
            message,
            reasonCode,
            responseCode,
            paramName);
        this.configName = configName;
    }


    /**
     * Gets the configName value for this ConfigurationErrorDetails.
     * 
     * @return configName   * Configuration name to which the transaction is failed.
     */
    public java.lang.String getConfigName() {
        return configName;
    }


    /**
     * Sets the configName value for this ConfigurationErrorDetails.
     * 
     * @param configName   * Configuration name to which the transaction is failed.
     */
    public void setConfigName(java.lang.String configName) {
        this.configName = configName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationErrorDetails)) return false;
        ConfigurationErrorDetails other = (ConfigurationErrorDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configName==null && other.getConfigName()==null) || 
             (this.configName!=null &&
              this.configName.equals(other.getConfigName())));
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
        if (getConfigName() != null) {
            _hashCode += getConfigName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationErrorDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "configName"));
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
