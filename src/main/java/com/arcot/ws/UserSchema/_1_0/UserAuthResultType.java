/**
 * UserAuthResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;

public class UserAuthResultType  implements java.io.Serializable {
    private java.lang.String authenticationToken;

    private com.arcot.ws.UserSchema._1_0.UserAuthResultTypeStatus status;  // attribute

    private java.lang.String mechanism;  // attribute

    public UserAuthResultType() {
    }

    public UserAuthResultType(
           java.lang.String authenticationToken,
           com.arcot.ws.UserSchema._1_0.UserAuthResultTypeStatus status,
           java.lang.String mechanism) {
           this.authenticationToken = authenticationToken;
           this.status = status;
           this.mechanism = mechanism;
    }


    /**
     * Gets the authenticationToken value for this UserAuthResultType.
     * 
     * @return authenticationToken
     */
    public java.lang.String getAuthenticationToken() {
        return authenticationToken;
    }


    /**
     * Sets the authenticationToken value for this UserAuthResultType.
     * 
     * @param authenticationToken
     */
    public void setAuthenticationToken(java.lang.String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }


    /**
     * Gets the status value for this UserAuthResultType.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.UserAuthResultTypeStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserAuthResultType.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.UserAuthResultTypeStatus status) {
        this.status = status;
    }


    /**
     * Gets the mechanism value for this UserAuthResultType.
     * 
     * @return mechanism
     */
    public java.lang.String getMechanism() {
        return mechanism;
    }


    /**
     * Sets the mechanism value for this UserAuthResultType.
     * 
     * @param mechanism
     */
    public void setMechanism(java.lang.String mechanism) {
        this.mechanism = mechanism;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAuthResultType)) return false;
        UserAuthResultType other = (UserAuthResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authenticationToken==null && other.getAuthenticationToken()==null) || 
             (this.authenticationToken!=null &&
              this.authenticationToken.equals(other.getAuthenticationToken()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.mechanism==null && other.getMechanism()==null) || 
             (this.mechanism!=null &&
              this.mechanism.equals(other.getMechanism())));
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
        if (getAuthenticationToken() != null) {
            _hashCode += getAuthenticationToken().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMechanism() != null) {
            _hashCode += getMechanism().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAuthResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAuthResultType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserAuthResultType>status"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mechanism");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mechanism"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "authenticationToken"));
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
