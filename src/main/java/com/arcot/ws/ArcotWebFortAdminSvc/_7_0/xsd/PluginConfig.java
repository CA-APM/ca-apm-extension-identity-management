/**
 * PluginConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * PluginConfig is the structure used to
 * 				represent
 * 				plugin configuration.
 */
public class PluginConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Information related to plugin element. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElementList pluginConfigElements;

    /* Events related to plugin. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events;

    /* Specifies whether this is template or data. */
    private java.lang.Boolean isTemplate;

    public PluginConfig() {
    }

    public PluginConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElementList pluginConfigElements,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events,
           java.lang.Boolean isTemplate) {
        super(
            name,
            status);
        this.pluginConfigElements = pluginConfigElements;
        this.events = events;
        this.isTemplate = isTemplate;
    }


    /**
     * Gets the pluginConfigElements value for this PluginConfig.
     * 
     * @return pluginConfigElements   * Information related to plugin element.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElementList getPluginConfigElements() {
        return pluginConfigElements;
    }


    /**
     * Sets the pluginConfigElements value for this PluginConfig.
     * 
     * @param pluginConfigElements   * Information related to plugin element.
     */
    public void setPluginConfigElements(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfigElementList pluginConfigElements) {
        this.pluginConfigElements = pluginConfigElements;
    }


    /**
     * Gets the events value for this PluginConfig.
     * 
     * @return events   * Events related to plugin.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents getEvents() {
        return events;
    }


    /**
     * Sets the events value for this PluginConfig.
     * 
     * @param events   * Events related to plugin.
     */
    public void setEvents(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events) {
        this.events = events;
    }


    /**
     * Gets the isTemplate value for this PluginConfig.
     * 
     * @return isTemplate   * Specifies whether this is template or data.
     */
    public java.lang.Boolean getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this PluginConfig.
     * 
     * @param isTemplate   * Specifies whether this is template or data.
     */
    public void setIsTemplate(java.lang.Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PluginConfig)) return false;
        PluginConfig other = (PluginConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pluginConfigElements==null && other.getPluginConfigElements()==null) || 
             (this.pluginConfigElements!=null &&
              this.pluginConfigElements.equals(other.getPluginConfigElements()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              this.isTemplate.equals(other.getIsTemplate())));
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
        if (getPluginConfigElements() != null) {
            _hashCode += getPluginConfigElements().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getIsTemplate() != null) {
            _hashCode += getIsTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PluginConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigElements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfigElementList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ExtModuleEvents"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
