/**
 * ConfigurationObjectListArcotOTPAuthConfigs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;

public class ConfigurationObjectListArcotOTPAuthConfigs  implements java.io.Serializable {
    /* These configurations are configured at global
     * 									level, but associated to the organization. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] globalConfigs;

    /* These configurations are configured and
     * 									associated to the organization. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] orgLevelConfigs;

    /* Default arcotOTP authentication configuration
     * 									name to
     * 									the organization.
     * 									The default configuration is present in
     * 									either globalConfigs or
     * 									orgLevelConfigs. */
    private java.lang.String defaultConfigName;

    public ConfigurationObjectListArcotOTPAuthConfigs() {
    }

    public ConfigurationObjectListArcotOTPAuthConfigs(
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] globalConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] orgLevelConfigs,
           java.lang.String defaultConfigName) {
           this.globalConfigs = globalConfigs;
           this.orgLevelConfigs = orgLevelConfigs;
           this.defaultConfigName = defaultConfigName;
    }


    /**
     * Gets the globalConfigs value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @return globalConfigs   * These configurations are configured at global
     * 									level, but associated to the organization.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] getGlobalConfigs() {
        return globalConfigs;
    }


    /**
     * Sets the globalConfigs value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @param globalConfigs   * These configurations are configured at global
     * 									level, but associated to the organization.
     */
    public void setGlobalConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] globalConfigs) {
        this.globalConfigs = globalConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig getGlobalConfigs(int i) {
        return this.globalConfigs[i];
    }

    public void setGlobalConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig _value) {
        this.globalConfigs[i] = _value;
    }


    /**
     * Gets the orgLevelConfigs value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @return orgLevelConfigs   * These configurations are configured and
     * 									associated to the organization.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] getOrgLevelConfigs() {
        return orgLevelConfigs;
    }


    /**
     * Sets the orgLevelConfigs value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @param orgLevelConfigs   * These configurations are configured and
     * 									associated to the organization.
     */
    public void setOrgLevelConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] orgLevelConfigs) {
        this.orgLevelConfigs = orgLevelConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig getOrgLevelConfigs(int i) {
        return this.orgLevelConfigs[i];
    }

    public void setOrgLevelConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig _value) {
        this.orgLevelConfigs[i] = _value;
    }


    /**
     * Gets the defaultConfigName value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @return defaultConfigName   * Default arcotOTP authentication configuration
     * 									name to
     * 									the organization.
     * 									The default configuration is present in
     * 									either globalConfigs or
     * 									orgLevelConfigs.
     */
    public java.lang.String getDefaultConfigName() {
        return defaultConfigName;
    }


    /**
     * Sets the defaultConfigName value for this ConfigurationObjectListArcotOTPAuthConfigs.
     * 
     * @param defaultConfigName   * Default arcotOTP authentication configuration
     * 									name to
     * 									the organization.
     * 									The default configuration is present in
     * 									either globalConfigs or
     * 									orgLevelConfigs.
     */
    public void setDefaultConfigName(java.lang.String defaultConfigName) {
        this.defaultConfigName = defaultConfigName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationObjectListArcotOTPAuthConfigs)) return false;
        ConfigurationObjectListArcotOTPAuthConfigs other = (ConfigurationObjectListArcotOTPAuthConfigs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.globalConfigs==null && other.getGlobalConfigs()==null) || 
             (this.globalConfigs!=null &&
              java.util.Arrays.equals(this.globalConfigs, other.getGlobalConfigs()))) &&
            ((this.orgLevelConfigs==null && other.getOrgLevelConfigs()==null) || 
             (this.orgLevelConfigs!=null &&
              java.util.Arrays.equals(this.orgLevelConfigs, other.getOrgLevelConfigs()))) &&
            ((this.defaultConfigName==null && other.getDefaultConfigName()==null) || 
             (this.defaultConfigName!=null &&
              this.defaultConfigName.equals(other.getDefaultConfigName())));
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
        if (getGlobalConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrgLevelConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgLevelConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgLevelConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultConfigName() != null) {
            _hashCode += getDefaultConfigName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationObjectListArcotOTPAuthConfigs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPAuthConfigs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "globalConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgLevelConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgLevelConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "defaultConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
