/**
 * RADIUSServerConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * RADIUSServerConfig is the structure used to
 * 				represent RADIUS server configuration.
 */
public class RADIUSServerConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Flag indicates that whether proxy feature is
     * 								enabled or not. */
    private java.lang.Boolean isEnabled;

    /* Flag that indicates whether use system
     * 								configuration or organization level configuration. */
    private java.lang.Boolean useSystemConfig;

    /* RADIUS servers information. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerList radiusServers;

    public RADIUSServerConfig() {
    }

    public RADIUSServerConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Boolean isEnabled,
           java.lang.Boolean useSystemConfig,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerList radiusServers) {
        super(
            name,
            status);
        this.isEnabled = isEnabled;
        this.useSystemConfig = useSystemConfig;
        this.radiusServers = radiusServers;
    }


    /**
     * Gets the isEnabled value for this RADIUSServerConfig.
     * 
     * @return isEnabled   * Flag indicates that whether proxy feature is
     * 								enabled or not.
     */
    public java.lang.Boolean getIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this RADIUSServerConfig.
     * 
     * @param isEnabled   * Flag indicates that whether proxy feature is
     * 								enabled or not.
     */
    public void setIsEnabled(java.lang.Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the useSystemConfig value for this RADIUSServerConfig.
     * 
     * @return useSystemConfig   * Flag that indicates whether use system
     * 								configuration or organization level configuration.
     */
    public java.lang.Boolean getUseSystemConfig() {
        return useSystemConfig;
    }


    /**
     * Sets the useSystemConfig value for this RADIUSServerConfig.
     * 
     * @param useSystemConfig   * Flag that indicates whether use system
     * 								configuration or organization level configuration.
     */
    public void setUseSystemConfig(java.lang.Boolean useSystemConfig) {
        this.useSystemConfig = useSystemConfig;
    }


    /**
     * Gets the radiusServers value for this RADIUSServerConfig.
     * 
     * @return radiusServers   * RADIUS servers information.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerList getRadiusServers() {
        return radiusServers;
    }


    /**
     * Sets the radiusServers value for this RADIUSServerConfig.
     * 
     * @param radiusServers   * RADIUS servers information.
     */
    public void setRadiusServers(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerList radiusServers) {
        this.radiusServers = radiusServers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSServerConfig)) return false;
        RADIUSServerConfig other = (RADIUSServerConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isEnabled==null && other.getIsEnabled()==null) || 
             (this.isEnabled!=null &&
              this.isEnabled.equals(other.getIsEnabled()))) &&
            ((this.useSystemConfig==null && other.getUseSystemConfig()==null) || 
             (this.useSystemConfig!=null &&
              this.useSystemConfig.equals(other.getUseSystemConfig()))) &&
            ((this.radiusServers==null && other.getRadiusServers()==null) || 
             (this.radiusServers!=null &&
              this.radiusServers.equals(other.getRadiusServers())));
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
        if (getIsEnabled() != null) {
            _hashCode += getIsEnabled().hashCode();
        }
        if (getUseSystemConfig() != null) {
            _hashCode += getUseSystemConfig().hashCode();
        }
        if (getRadiusServers() != null) {
            _hashCode += getRadiusServers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSServerConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSystemConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "useSystemConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerList"));
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
