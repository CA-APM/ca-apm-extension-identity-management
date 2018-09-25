/**
 * UpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class UpdateRequest  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq  implements java.io.Serializable {
    /* Configurations for a particular organization, that are going
     * to be updated. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationsInput configurations;

    public UpdateRequest() {
    }

    public UpdateRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationsInput configurations) {
        super(
            clientTxnId,
            additionalInput);
        this.configurations = configurations;
    }


    /**
     * Gets the configurations value for this UpdateRequest.
     * 
     * @return configurations   * Configurations for a particular organization, that are going
     * to be updated.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationsInput getConfigurations() {
        return configurations;
    }


    /**
     * Sets the configurations value for this UpdateRequest.
     * 
     * @param configurations   * Configurations for a particular organization, that are going
     * to be updated.
     */
    public void setConfigurations(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationsInput configurations) {
        this.configurations = configurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRequest)) return false;
        UpdateRequest other = (UpdateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configurations==null && other.getConfigurations()==null) || 
             (this.configurations!=null &&
              this.configurations.equals(other.getConfigurations())));
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
        if (getConfigurations() != null) {
            _hashCode += getConfigurations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">UpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "configurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationsInput"));
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
