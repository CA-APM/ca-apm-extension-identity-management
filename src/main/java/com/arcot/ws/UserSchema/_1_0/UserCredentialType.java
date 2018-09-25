/**
 * UserCredentialType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;

public class UserCredentialType  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserIdentifierType userId;

    private com.arcot.ws.UserSchema._1_0.UserCredentialTypeUserCredential userCredential;

    public UserCredentialType() {
    }

    public UserCredentialType(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType userId,
           com.arcot.ws.UserSchema._1_0.UserCredentialTypeUserCredential userCredential) {
           this.userId = userId;
           this.userCredential = userCredential;
    }


    /**
     * Gets the userId value for this UserCredentialType.
     * 
     * @return userId
     */
    public com.arcot.ws.UserSchema._1_0.UserIdentifierType getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserCredentialType.
     * 
     * @param userId
     */
    public void setUserId(com.arcot.ws.UserSchema._1_0.UserIdentifierType userId) {
        this.userId = userId;
    }


    /**
     * Gets the userCredential value for this UserCredentialType.
     * 
     * @return userCredential
     */
    public com.arcot.ws.UserSchema._1_0.UserCredentialTypeUserCredential getUserCredential() {
        return userCredential;
    }


    /**
     * Sets the userCredential value for this UserCredentialType.
     * 
     * @param userCredential
     */
    public void setUserCredential(com.arcot.ws.UserSchema._1_0.UserCredentialTypeUserCredential userCredential) {
        this.userCredential = userCredential;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCredentialType)) return false;
        UserCredentialType other = (UserCredentialType) obj;
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
            ((this.userCredential==null && other.getUserCredential()==null) || 
             (this.userCredential!=null &&
              this.userCredential.equals(other.getUserCredential())));
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
        if (getUserCredential() != null) {
            _hashCode += getUserCredential().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCredentialType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserCredentialType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "userCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserCredentialType>userCredential"));
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
