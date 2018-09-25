/**
 * DeviceIDItemTypeDeviceIDItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class DeviceIDItemTypeDeviceIDItem  implements java.io.Serializable {
    private java.lang.String deviceIDType;

    private java.lang.String deviceIDValue;

    public DeviceIDItemTypeDeviceIDItem() {
    }

    public DeviceIDItemTypeDeviceIDItem(
           java.lang.String deviceIDType,
           java.lang.String deviceIDValue) {
           this.deviceIDType = deviceIDType;
           this.deviceIDValue = deviceIDValue;
    }


    /**
     * Gets the deviceIDType value for this DeviceIDItemTypeDeviceIDItem.
     * 
     * @return deviceIDType
     */
    public java.lang.String getDeviceIDType() {
        return deviceIDType;
    }


    /**
     * Sets the deviceIDType value for this DeviceIDItemTypeDeviceIDItem.
     * 
     * @param deviceIDType
     */
    public void setDeviceIDType(java.lang.String deviceIDType) {
        this.deviceIDType = deviceIDType;
    }


    /**
     * Gets the deviceIDValue value for this DeviceIDItemTypeDeviceIDItem.
     * 
     * @return deviceIDValue
     */
    public java.lang.String getDeviceIDValue() {
        return deviceIDValue;
    }


    /**
     * Sets the deviceIDValue value for this DeviceIDItemTypeDeviceIDItem.
     * 
     * @param deviceIDValue
     */
    public void setDeviceIDValue(java.lang.String deviceIDValue) {
        this.deviceIDValue = deviceIDValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceIDItemTypeDeviceIDItem)) return false;
        DeviceIDItemTypeDeviceIDItem other = (DeviceIDItemTypeDeviceIDItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceIDType==null && other.getDeviceIDType()==null) || 
             (this.deviceIDType!=null &&
              this.deviceIDType.equals(other.getDeviceIDType()))) &&
            ((this.deviceIDValue==null && other.getDeviceIDValue()==null) || 
             (this.deviceIDValue!=null &&
              this.deviceIDValue.equals(other.getDeviceIDValue())));
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
        if (getDeviceIDType() != null) {
            _hashCode += getDeviceIDType().hashCode();
        }
        if (getDeviceIDValue() != null) {
            _hashCode += getDeviceIDValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceIDItemTypeDeviceIDItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", ">DeviceIDItemType>deviceIDItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceIDValue"));
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
