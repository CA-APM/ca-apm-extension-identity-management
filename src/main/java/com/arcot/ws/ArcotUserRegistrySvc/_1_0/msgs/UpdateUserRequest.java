/**
 * UpdateUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class UpdateUserRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx userDetailsEx;

    private com.arcot.ws.UserSchema._1_0.UpdateUserFlagType updateUserFlags;

    private java.lang.String clientTxId;

    public UpdateUserRequest() {
    }

    public UpdateUserRequest(
           com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx userDetailsEx,
           com.arcot.ws.UserSchema._1_0.UpdateUserFlagType updateUserFlags,
           java.lang.String clientTxId) {
           this.userDetailsEx = userDetailsEx;
           this.updateUserFlags = updateUserFlags;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the userDetailsEx value for this UpdateUserRequest.
     * 
     * @return userDetailsEx
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx getUserDetailsEx() {
        return userDetailsEx;
    }


    /**
     * Sets the userDetailsEx value for this UpdateUserRequest.
     * 
     * @param userDetailsEx
     */
    public void setUserDetailsEx(com.arcot.ws.UserSchema._1_0.UserDetailsTypeEx userDetailsEx) {
        this.userDetailsEx = userDetailsEx;
    }


    /**
     * Gets the updateUserFlags value for this UpdateUserRequest.
     * 
     * @return updateUserFlags
     */
    public com.arcot.ws.UserSchema._1_0.UpdateUserFlagType getUpdateUserFlags() {
        return updateUserFlags;
    }


    /**
     * Sets the updateUserFlags value for this UpdateUserRequest.
     * 
     * @param updateUserFlags
     */
    public void setUpdateUserFlags(com.arcot.ws.UserSchema._1_0.UpdateUserFlagType updateUserFlags) {
        this.updateUserFlags = updateUserFlags;
    }


    /**
     * Gets the clientTxId value for this UpdateUserRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this UpdateUserRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserRequest)) return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userDetailsEx==null && other.getUserDetailsEx()==null) || 
             (this.userDetailsEx!=null &&
              this.userDetailsEx.equals(other.getUserDetailsEx()))) &&
            ((this.updateUserFlags==null && other.getUpdateUserFlags()==null) || 
             (this.updateUserFlags!=null &&
              this.updateUserFlags.equals(other.getUpdateUserFlags()))) &&
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
        if (getUserDetailsEx() != null) {
            _hashCode += getUserDetailsEx().hashCode();
        }
        if (getUpdateUserFlags() != null) {
            _hashCode += getUpdateUserFlags().hashCode();
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDetailsEx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "userDetailsEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsTypeEx"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateUserFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "updateUserFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UpdateUserFlagType"));
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
