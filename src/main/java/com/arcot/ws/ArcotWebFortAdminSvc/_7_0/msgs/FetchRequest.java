/**
 * FetchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class FetchRequest  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq  implements java.io.Serializable {
    /* Configuration names for a particular organization, that are
     * going to be fetched. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames;

    /* This flag is to indicate that fetch only names and
     * 									not to include entire configuration object. This can
     * 									be used while fetching all configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequestIsFetchOnlyNames isFetchOnlyNames;

    public FetchRequest() {
    }

    public FetchRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequestIsFetchOnlyNames isFetchOnlyNames) {
        super(
            clientTxnId,
            additionalInput);
        this.configurationNames = configurationNames;
        this.isFetchOnlyNames = isFetchOnlyNames;
    }


    /**
     * Gets the configurationNames value for this FetchRequest.
     * 
     * @return configurationNames   * Configuration names for a particular organization, that are
     * going to be fetched.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames getConfigurationNames() {
        return configurationNames;
    }


    /**
     * Sets the configurationNames value for this FetchRequest.
     * 
     * @param configurationNames   * Configuration names for a particular organization, that are
     * going to be fetched.
     */
    public void setConfigurationNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames) {
        this.configurationNames = configurationNames;
    }


    /**
     * Gets the isFetchOnlyNames value for this FetchRequest.
     * 
     * @return isFetchOnlyNames   * This flag is to indicate that fetch only names and
     * 									not to include entire configuration object. This can
     * 									be used while fetching all configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequestIsFetchOnlyNames getIsFetchOnlyNames() {
        return isFetchOnlyNames;
    }


    /**
     * Sets the isFetchOnlyNames value for this FetchRequest.
     * 
     * @param isFetchOnlyNames   * This flag is to indicate that fetch only names and
     * 									not to include entire configuration object. This can
     * 									be used while fetching all configurations.
     */
    public void setIsFetchOnlyNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs.FetchRequestIsFetchOnlyNames isFetchOnlyNames) {
        this.isFetchOnlyNames = isFetchOnlyNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchRequest)) return false;
        FetchRequest other = (FetchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configurationNames==null && other.getConfigurationNames()==null) || 
             (this.configurationNames!=null &&
              this.configurationNames.equals(other.getConfigurationNames()))) &&
            ((this.isFetchOnlyNames==null && other.getIsFetchOnlyNames()==null) || 
             (this.isFetchOnlyNames!=null &&
              this.isFetchOnlyNames.equals(other.getIsFetchOnlyNames())));
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
        if (getConfigurationNames() != null) {
            _hashCode += getConfigurationNames().hashCode();
        }
        if (getIsFetchOnlyNames() != null) {
            _hashCode += getIsFetchOnlyNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "configurationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNames"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFetchOnlyNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "isFetchOnlyNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">>FetchRequest>isFetchOnlyNames"));
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
