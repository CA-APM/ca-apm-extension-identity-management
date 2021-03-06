/**
 * DeviceContextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;


/**
 * Contains deviceID and signature generated by
 * 						Arcot RiskFort fingerprinting client script and
 * 						server components. Only one of AggregatorID or
 * 						DeviceIDs should be specified. Aggegator ID
 * 						should be specified if the call is being made in
 * 						the context of an aggregator's request;
 * 						otherwise DeviceId(s) should be supplied if
 * 						available from the client.
 */
public class DeviceContextType  implements java.io.Serializable {
    private java.lang.String aggregatorID;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem[] deviceIDs;

    /* The signature for the device as returned
     * 								by Arcot RiskFort fingerprinting client
     * 								script. */
    private java.lang.String deviceSignature;

    private java.lang.String shortDeviceSignature;

    public DeviceContextType() {
    }

    public DeviceContextType(
           java.lang.String aggregatorID,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem[] deviceIDs,
           java.lang.String deviceSignature,
           java.lang.String shortDeviceSignature) {
           this.aggregatorID = aggregatorID;
           this.deviceIDs = deviceIDs;
           this.deviceSignature = deviceSignature;
           this.shortDeviceSignature = shortDeviceSignature;
    }


    /**
     * Gets the aggregatorID value for this DeviceContextType.
     * 
     * @return aggregatorID
     */
    public java.lang.String getAggregatorID() {
        return aggregatorID;
    }


    /**
     * Sets the aggregatorID value for this DeviceContextType.
     * 
     * @param aggregatorID
     */
    public void setAggregatorID(java.lang.String aggregatorID) {
        this.aggregatorID = aggregatorID;
    }


    /**
     * Gets the deviceIDs value for this DeviceContextType.
     * 
     * @return deviceIDs
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem[] getDeviceIDs() {
        return deviceIDs;
    }


    /**
     * Sets the deviceIDs value for this DeviceContextType.
     * 
     * @param deviceIDs
     */
    public void setDeviceIDs(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem[] deviceIDs) {
        this.deviceIDs = deviceIDs;
    }


    /**
     * Gets the deviceSignature value for this DeviceContextType.
     * 
     * @return deviceSignature   * The signature for the device as returned
     * 								by Arcot RiskFort fingerprinting client
     * 								script.
     */
    public java.lang.String getDeviceSignature() {
        return deviceSignature;
    }


    /**
     * Sets the deviceSignature value for this DeviceContextType.
     * 
     * @param deviceSignature   * The signature for the device as returned
     * 								by Arcot RiskFort fingerprinting client
     * 								script.
     */
    public void setDeviceSignature(java.lang.String deviceSignature) {
        this.deviceSignature = deviceSignature;
    }


    /**
     * Gets the shortDeviceSignature value for this DeviceContextType.
     * 
     * @return shortDeviceSignature
     */
    public java.lang.String getShortDeviceSignature() {
        return shortDeviceSignature;
    }


    /**
     * Sets the shortDeviceSignature value for this DeviceContextType.
     * 
     * @param shortDeviceSignature
     */
    public void setShortDeviceSignature(java.lang.String shortDeviceSignature) {
        this.shortDeviceSignature = shortDeviceSignature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceContextType)) return false;
        DeviceContextType other = (DeviceContextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregatorID==null && other.getAggregatorID()==null) || 
             (this.aggregatorID!=null &&
              this.aggregatorID.equals(other.getAggregatorID()))) &&
            ((this.deviceIDs==null && other.getDeviceIDs()==null) || 
             (this.deviceIDs!=null &&
              java.util.Arrays.equals(this.deviceIDs, other.getDeviceIDs()))) &&
            ((this.deviceSignature==null && other.getDeviceSignature()==null) || 
             (this.deviceSignature!=null &&
              this.deviceSignature.equals(other.getDeviceSignature()))) &&
            ((this.shortDeviceSignature==null && other.getShortDeviceSignature()==null) || 
             (this.shortDeviceSignature!=null &&
              this.shortDeviceSignature.equals(other.getShortDeviceSignature())));
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
        if (getAggregatorID() != null) {
            _hashCode += getAggregatorID().hashCode();
        }
        if (getDeviceIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceSignature() != null) {
            _hashCode += getDeviceSignature().hashCode();
        }
        if (getShortDeviceSignature() != null) {
            _hashCode += getShortDeviceSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceContextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeviceContextType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "aggregatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", ">DeviceIDItemType>deviceIDItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceIDItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDeviceSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "shortDeviceSignature"));
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
