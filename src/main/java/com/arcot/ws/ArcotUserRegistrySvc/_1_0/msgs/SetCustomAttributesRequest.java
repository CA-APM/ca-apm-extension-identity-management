/**
 * SetCustomAttributesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class SetCustomAttributesRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserIdentifierType userId;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    private java.lang.String clientTxId;

    public SetCustomAttributesRequest() {
    }

    public SetCustomAttributesRequest(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType userId,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute,
           java.lang.String clientTxId) {
           this.userId = userId;
           this.customAttribute = customAttribute;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the userId value for this SetCustomAttributesRequest.
     * 
     * @return userId
     */
    public com.arcot.ws.UserSchema._1_0.UserIdentifierType getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SetCustomAttributesRequest.
     * 
     * @param userId
     */
    public void setUserId(com.arcot.ws.UserSchema._1_0.UserIdentifierType userId) {
        this.userId = userId;
    }


    /**
     * Gets the customAttribute value for this SetCustomAttributesRequest.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this SetCustomAttributesRequest.
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


    /**
     * Gets the clientTxId value for this SetCustomAttributesRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this SetCustomAttributesRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetCustomAttributesRequest)) return false;
        SetCustomAttributesRequest other = (SetCustomAttributesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute()))) &&
            ((this.clientTxId==null && other.getClientTxId()==null) || 
             (this.clientTxId!=null &&
              this.clientTxId.equals(other.getClientTxId())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
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
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomAttributesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setCustomAttributesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "clientTxId"));
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
