/**
 * ConfigurationObjectListKeyConfigs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;

public class ConfigurationObjectListKeyConfigs  implements java.io.Serializable {
    /* These configurations are configured at global
     * 									level, but associated to the organization. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] globalConfigs;

    /* These configurations are configured and
     * 									associated to the organization. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] orgLevelConfigs;

    public ConfigurationObjectListKeyConfigs() {
    }

    public ConfigurationObjectListKeyConfigs(
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] globalConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] orgLevelConfigs) {
           this.globalConfigs = globalConfigs;
           this.orgLevelConfigs = orgLevelConfigs;
    }


    /**
     * Gets the globalConfigs value for this ConfigurationObjectListKeyConfigs.
     * 
     * @return globalConfigs   * These configurations are configured at global
     * 									level, but associated to the organization.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] getGlobalConfigs() {
        return globalConfigs;
    }


    /**
     * Sets the globalConfigs value for this ConfigurationObjectListKeyConfigs.
     * 
     * @param globalConfigs   * These configurations are configured at global
     * 									level, but associated to the organization.
     */
    public void setGlobalConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] globalConfigs) {
        this.globalConfigs = globalConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig getGlobalConfigs(int i) {
        return this.globalConfigs[i];
    }

    public void setGlobalConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig _value) {
        this.globalConfigs[i] = _value;
    }


    /**
     * Gets the orgLevelConfigs value for this ConfigurationObjectListKeyConfigs.
     * 
     * @return orgLevelConfigs   * These configurations are configured and
     * 									associated to the organization.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] getOrgLevelConfigs() {
        return orgLevelConfigs;
    }


    /**
     * Sets the orgLevelConfigs value for this ConfigurationObjectListKeyConfigs.
     * 
     * @param orgLevelConfigs   * These configurations are configured and
     * 									associated to the organization.
     */
    public void setOrgLevelConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] orgLevelConfigs) {
        this.orgLevelConfigs = orgLevelConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig getOrgLevelConfigs(int i) {
        return this.orgLevelConfigs[i];
    }

    public void setOrgLevelConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig _value) {
        this.orgLevelConfigs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationObjectListKeyConfigs)) return false;
        ConfigurationObjectListKeyConfigs other = (ConfigurationObjectListKeyConfigs) obj;
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
              java.util.Arrays.equals(this.orgLevelConfigs, other.getOrgLevelConfigs())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationObjectListKeyConfigs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>keyConfigs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "globalConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "KeyConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgLevelConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgLevelConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "KeyConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
