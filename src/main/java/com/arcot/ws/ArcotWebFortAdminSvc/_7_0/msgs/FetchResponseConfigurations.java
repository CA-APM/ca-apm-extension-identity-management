/**
 * FetchResponseConfigurations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class FetchResponseConfigurations  implements java.io.Serializable {
    /* Configurations for a particular organization, that are fetched. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectList configurationObjects;

    /* Configuration names output for a particular organization, that
     * are fetched. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNamesList configurationNames;

    public FetchResponseConfigurations() {
    }

    public FetchResponseConfigurations(
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectList configurationObjects,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNamesList configurationNames) {
           this.configurationObjects = configurationObjects;
           this.configurationNames = configurationNames;
    }


    /**
     * Gets the configurationObjects value for this FetchResponseConfigurations.
     * 
     * @return configurationObjects   * Configurations for a particular organization, that are fetched.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectList getConfigurationObjects() {
        return configurationObjects;
    }


    /**
     * Sets the configurationObjects value for this FetchResponseConfigurations.
     * 
     * @param configurationObjects   * Configurations for a particular organization, that are fetched.
     */
    public void setConfigurationObjects(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectList configurationObjects) {
        this.configurationObjects = configurationObjects;
    }


    /**
     * Gets the configurationNames value for this FetchResponseConfigurations.
     * 
     * @return configurationNames   * Configuration names output for a particular organization, that
     * are fetched.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNamesList getConfigurationNames() {
        return configurationNames;
    }


    /**
     * Sets the configurationNames value for this FetchResponseConfigurations.
     * 
     * @param configurationNames   * Configuration names output for a particular organization, that
     * are fetched.
     */
    public void setConfigurationNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNamesList configurationNames) {
        this.configurationNames = configurationNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchResponseConfigurations)) return false;
        FetchResponseConfigurations other = (FetchResponseConfigurations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configurationObjects==null && other.getConfigurationObjects()==null) || 
             (this.configurationObjects!=null &&
              this.configurationObjects.equals(other.getConfigurationObjects()))) &&
            ((this.configurationNames==null && other.getConfigurationNames()==null) || 
             (this.configurationNames!=null &&
              this.configurationNames.equals(other.getConfigurationNames())));
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
        if (getConfigurationObjects() != null) {
            _hashCode += getConfigurationObjects().hashCode();
        }
        if (getConfigurationNames() != null) {
            _hashCode += getConfigurationNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchResponseConfigurations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">>FetchResponse>configurations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "configurationObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationObjectList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "configurationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNamesList"));
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
