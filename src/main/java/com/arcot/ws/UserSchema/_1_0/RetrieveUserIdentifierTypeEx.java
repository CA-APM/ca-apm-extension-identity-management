/**
 * RetrieveUserIdentifierTypeEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * This is Extended User Details Type which in addition holds user
 * account ID and account type attributes.
 */
public class RetrieveUserIdentifierTypeEx  extends com.arcot.ws.UserSchema._1_0.UserIdentifierType  implements java.io.Serializable {
    private java.lang.String accountID;

    private java.lang.String accountTypeAttribute;

    public RetrieveUserIdentifierTypeEx() {
    }

    public RetrieveUserIdentifierTypeEx(
           java.lang.String orgName,
           java.lang.String userName,
           java.lang.Integer userRefId,
           java.lang.String accountID,
           java.lang.String accountTypeAttribute) {
        super(
            orgName,
            userName,
            userRefId);
        this.accountID = accountID;
        this.accountTypeAttribute = accountTypeAttribute;
    }


    /**
     * Gets the accountID value for this RetrieveUserIdentifierTypeEx.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this RetrieveUserIdentifierTypeEx.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the accountTypeAttribute value for this RetrieveUserIdentifierTypeEx.
     * 
     * @return accountTypeAttribute
     */
    public java.lang.String getAccountTypeAttribute() {
        return accountTypeAttribute;
    }


    /**
     * Sets the accountTypeAttribute value for this RetrieveUserIdentifierTypeEx.
     * 
     * @param accountTypeAttribute
     */
    public void setAccountTypeAttribute(java.lang.String accountTypeAttribute) {
        this.accountTypeAttribute = accountTypeAttribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveUserIdentifierTypeEx)) return false;
        RetrieveUserIdentifierTypeEx other = (RetrieveUserIdentifierTypeEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.accountTypeAttribute==null && other.getAccountTypeAttribute()==null) || 
             (this.accountTypeAttribute!=null &&
              this.accountTypeAttribute.equals(other.getAccountTypeAttribute())));
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getAccountTypeAttribute() != null) {
            _hashCode += getAccountTypeAttribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveUserIdentifierTypeEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RetrieveUserIdentifierTypeEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTypeAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "accountTypeAttribute"));
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
