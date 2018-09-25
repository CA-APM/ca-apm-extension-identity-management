/**
 * ConfigFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigFilter is the structure used to represent
 * 				configuration details that are used as filter
 * 				in fetching the configurations.
 */
public class ConfigFilter  implements java.io.Serializable {
    /* Configuration names used as filter. */
    private java.lang.String[] configNames;

    /* isAllConfigs represents the fetch all configuration flag. If
     * this element is
     * 	                    exist then server will consider fetch all is
     * true, 
     * 	                    otherwise fetch all is false. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilterIsAllConfigs isAllConfigs;

    public ConfigFilter() {
    }

    public ConfigFilter(
           java.lang.String[] configNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilterIsAllConfigs isAllConfigs) {
           this.configNames = configNames;
           this.isAllConfigs = isAllConfigs;
    }


    /**
     * Gets the configNames value for this ConfigFilter.
     * 
     * @return configNames   * Configuration names used as filter.
     */
    public java.lang.String[] getConfigNames() {
        return configNames;
    }


    /**
     * Sets the configNames value for this ConfigFilter.
     * 
     * @param configNames   * Configuration names used as filter.
     */
    public void setConfigNames(java.lang.String[] configNames) {
        this.configNames = configNames;
    }

    public java.lang.String getConfigNames(int i) {
        return this.configNames[i];
    }

    public void setConfigNames(int i, java.lang.String _value) {
        this.configNames[i] = _value;
    }


    /**
     * Gets the isAllConfigs value for this ConfigFilter.
     * 
     * @return isAllConfigs   * isAllConfigs represents the fetch all configuration flag. If
     * this element is
     * 	                    exist then server will consider fetch all is
     * true, 
     * 	                    otherwise fetch all is false.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilterIsAllConfigs getIsAllConfigs() {
        return isAllConfigs;
    }


    /**
     * Sets the isAllConfigs value for this ConfigFilter.
     * 
     * @param isAllConfigs   * isAllConfigs represents the fetch all configuration flag. If
     * this element is
     * 	                    exist then server will consider fetch all is
     * true, 
     * 	                    otherwise fetch all is false.
     */
    public void setIsAllConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilterIsAllConfigs isAllConfigs) {
        this.isAllConfigs = isAllConfigs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigFilter)) return false;
        ConfigFilter other = (ConfigFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configNames==null && other.getConfigNames()==null) || 
             (this.configNames!=null &&
              java.util.Arrays.equals(this.configNames, other.getConfigNames()))) &&
            ((this.isAllConfigs==null && other.getIsAllConfigs()==null) || 
             (this.isAllConfigs!=null &&
              this.isAllConfigs.equals(other.getIsAllConfigs())));
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
        if (getConfigNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAllConfigs() != null) {
            _hashCode += getIsAllConfigs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "configNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "isAllConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigFilter>isAllConfigs"));
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
