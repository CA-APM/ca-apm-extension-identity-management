/**
 * DeviceRequestAttrs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * This type holds the minimal user device details.
 */
public class DeviceRequestAttrs  implements java.io.Serializable {
    private java.lang.String deviceToken;

    private java.lang.String deviceID;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    public DeviceRequestAttrs() {
    }

    public DeviceRequestAttrs(
           java.lang.String deviceToken,
           java.lang.String deviceID,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute) {
           this.deviceToken = deviceToken;
           this.deviceID = deviceID;
           this.customAttribute = customAttribute;
    }


    /**
     * Gets the deviceToken value for this DeviceRequestAttrs.
     * 
     * @return deviceToken
     */
    public java.lang.String getDeviceToken() {
        return deviceToken;
    }


    /**
     * Sets the deviceToken value for this DeviceRequestAttrs.
     * 
     * @param deviceToken
     */
    public void setDeviceToken(java.lang.String deviceToken) {
        this.deviceToken = deviceToken;
    }


    /**
     * Gets the deviceID value for this DeviceRequestAttrs.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceRequestAttrs.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the customAttribute value for this DeviceRequestAttrs.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this DeviceRequestAttrs.
     * 
     * @param customAttribute
     */
    public void setCustomAttribute(com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute) {
        this.customAttribute = customAttribute;
    }

    public com.arcot.ws.UserSchema._1_0.CustomAttributeType getCustomAttribute(int i) {
        return this.customAttribute[i];
    }

    public void setCustomAttribute(int i, com.arcot.ws.UserSchema._1_0.CustomAttributeType _value) {
        this.customAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceRequestAttrs)) return false;
        DeviceRequestAttrs other = (DeviceRequestAttrs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceToken==null && other.getDeviceToken()==null) || 
             (this.deviceToken!=null &&
              this.deviceToken.equals(other.getDeviceToken()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute())));
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
        if (getDeviceToken() != null) {
            _hashCode += getDeviceToken().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getCustomAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceRequestAttrs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "DeviceRequestAttrs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "deviceToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
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
