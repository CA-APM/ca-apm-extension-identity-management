/**
 * DeleteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class DeleteRequest  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq  implements java.io.Serializable {
    /* Configuration names for a particular organization, that are
     * going to be deleted. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames;

    public DeleteRequest() {
    }

    public DeleteRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames) {
        super(
            clientTxnId,
            additionalInput);
        this.configurationNames = configurationNames;
    }


    /**
     * Gets the configurationNames value for this DeleteRequest.
     * 
     * @return configurationNames   * Configuration names for a particular organization, that are
     * going to be deleted.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames getConfigurationNames() {
        return configurationNames;
    }


    /**
     * Sets the configurationNames value for this DeleteRequest.
     * 
     * @param configurationNames   * Configuration names for a particular organization, that are
     * going to be deleted.
     */
    public void setConfigurationNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationNames configurationNames) {
        this.configurationNames = configurationNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteRequest)) return false;
        DeleteRequest other = (DeleteRequest) obj;
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
        int _hashCode = super.hashCode();
        if (getConfigurationNames() != null) {
            _hashCode += getConfigurationNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">DeleteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "configurationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNames"));
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
