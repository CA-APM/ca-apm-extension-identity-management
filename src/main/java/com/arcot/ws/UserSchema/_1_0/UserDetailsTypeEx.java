/**
 * UserDetailsTypeEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * This is Extended User Details Type which in addition holds User
 * Account
 * 				Information.
 */
public class UserDetailsTypeEx  extends com.arcot.ws.UserSchema._1_0.UserDetailsType  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserAccountType[] account;

    public UserDetailsTypeEx() {
    }

    public UserDetailsTypeEx(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType userId,
           java.util.Calendar dateCreated,
           java.util.Calendar dateModified,
           com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId[] emailId,
           com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber[] telephoneNumber,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String pam,
           java.lang.String pamImageURL,
           byte[] image,
           com.arcot.ws.UserSchema._1_0.UserStatusType status,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute,
           java.util.Calendar startLockTime,
           java.util.Calendar endLockTime,
           com.arcot.ws.UserSchema._1_0.UserAccountType[] account) {
        super(
            userId,
            dateCreated,
            dateModified,
            emailId,
            telephoneNumber,
            firstName,
            middleName,
            lastName,
            pam,
            pamImageURL,
            image,
            status,
            customAttribute,
            startLockTime,
            endLockTime);
        this.account = account;
    }


    /**
     * Gets the account value for this UserDetailsTypeEx.
     * 
     * @return account
     */
    public com.arcot.ws.UserSchema._1_0.UserAccountType[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UserDetailsTypeEx.
     * 
     * @param account
     */
    public void setAccount(com.arcot.ws.UserSchema._1_0.UserAccountType[] account) {
        this.account = account;
    }

    public com.arcot.ws.UserSchema._1_0.UserAccountType getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, com.arcot.ws.UserSchema._1_0.UserAccountType _value) {
        this.account[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDetailsTypeEx)) return false;
        UserDetailsTypeEx other = (UserDetailsTypeEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount())));
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
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
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
        new org.apache.axis.description.TypeDesc(UserDetailsTypeEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsTypeEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserAccountType"));
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
