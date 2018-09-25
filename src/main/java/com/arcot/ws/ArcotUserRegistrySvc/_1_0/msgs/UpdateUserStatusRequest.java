/**
 * UpdateUserStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class UpdateUserStatusRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserIdentifierType[] userId;

    private com.arcot.ws.UserSchema._1_0.UserStatusType status;

    private java.util.Calendar startLockTime;

    private java.util.Calendar endLockTime;

    private java.lang.String clientTxId;

    public UpdateUserStatusRequest() {
    }

    public UpdateUserStatusRequest(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType[] userId,
           com.arcot.ws.UserSchema._1_0.UserStatusType status,
           java.util.Calendar startLockTime,
           java.util.Calendar endLockTime,
           java.lang.String clientTxId) {
           this.userId = userId;
           this.status = status;
           this.startLockTime = startLockTime;
           this.endLockTime = endLockTime;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the userId value for this UpdateUserStatusRequest.
     * 
     * @return userId
     */
    public com.arcot.ws.UserSchema._1_0.UserIdentifierType[] getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UpdateUserStatusRequest.
     * 
     * @param userId
     */
    public void setUserId(com.arcot.ws.UserSchema._1_0.UserIdentifierType[] userId) {
        this.userId = userId;
    }

    public com.arcot.ws.UserSchema._1_0.UserIdentifierType getUserId(int i) {
        return this.userId[i];
    }

    public void setUserId(int i, com.arcot.ws.UserSchema._1_0.UserIdentifierType _value) {
        this.userId[i] = _value;
    }


    /**
     * Gets the status value for this UpdateUserStatusRequest.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.UserStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateUserStatusRequest.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.UserStatusType status) {
        this.status = status;
    }


    /**
     * Gets the startLockTime value for this UpdateUserStatusRequest.
     * 
     * @return startLockTime
     */
    public java.util.Calendar getStartLockTime() {
        return startLockTime;
    }


    /**
     * Sets the startLockTime value for this UpdateUserStatusRequest.
     * 
     * @param startLockTime
     */
    public void setStartLockTime(java.util.Calendar startLockTime) {
        this.startLockTime = startLockTime;
    }


    /**
     * Gets the endLockTime value for this UpdateUserStatusRequest.
     * 
     * @return endLockTime
     */
    public java.util.Calendar getEndLockTime() {
        return endLockTime;
    }


    /**
     * Sets the endLockTime value for this UpdateUserStatusRequest.
     * 
     * @param endLockTime
     */
    public void setEndLockTime(java.util.Calendar endLockTime) {
        this.endLockTime = endLockTime;
    }


    /**
     * Gets the clientTxId value for this UpdateUserStatusRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this UpdateUserStatusRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserStatusRequest)) return false;
        UpdateUserStatusRequest other = (UpdateUserStatusRequest) obj;
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
              java.util.Arrays.equals(this.userId, other.getUserId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startLockTime==null && other.getStartLockTime()==null) || 
             (this.startLockTime!=null &&
              this.startLockTime.equals(other.getStartLockTime()))) &&
            ((this.endLockTime==null && other.getEndLockTime()==null) || 
             (this.endLockTime!=null &&
              this.endLockTime.equals(other.getEndLockTime()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartLockTime() != null) {
            _hashCode += getStartLockTime().hashCode();
        }
        if (getEndLockTime() != null) {
            _hashCode += getEndLockTime().hashCode();
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "startLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "endLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
