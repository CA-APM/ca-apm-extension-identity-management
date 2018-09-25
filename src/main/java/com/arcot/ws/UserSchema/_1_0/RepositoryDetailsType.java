/**
 * RepositoryDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * Following repository types are supported:
 */
public class RepositoryDetailsType  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.LDAPRepositoryType ldapDetails;

    private java.lang.String repositoryType;  // attribute

    public RepositoryDetailsType() {
    }

    public RepositoryDetailsType(
           com.arcot.ws.UserSchema._1_0.LDAPRepositoryType ldapDetails,
           java.lang.String repositoryType) {
           this.ldapDetails = ldapDetails;
           this.repositoryType = repositoryType;
    }


    /**
     * Gets the ldapDetails value for this RepositoryDetailsType.
     * 
     * @return ldapDetails
     */
    public com.arcot.ws.UserSchema._1_0.LDAPRepositoryType getLdapDetails() {
        return ldapDetails;
    }


    /**
     * Sets the ldapDetails value for this RepositoryDetailsType.
     * 
     * @param ldapDetails
     */
    public void setLdapDetails(com.arcot.ws.UserSchema._1_0.LDAPRepositoryType ldapDetails) {
        this.ldapDetails = ldapDetails;
    }


    /**
     * Gets the repositoryType value for this RepositoryDetailsType.
     * 
     * @return repositoryType
     */
    public java.lang.String getRepositoryType() {
        return repositoryType;
    }


    /**
     * Sets the repositoryType value for this RepositoryDetailsType.
     * 
     * @param repositoryType
     */
    public void setRepositoryType(java.lang.String repositoryType) {
        this.repositoryType = repositoryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepositoryDetailsType)) return false;
        RepositoryDetailsType other = (RepositoryDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ldapDetails==null && other.getLdapDetails()==null) || 
             (this.ldapDetails!=null &&
              this.ldapDetails.equals(other.getLdapDetails()))) &&
            ((this.repositoryType==null && other.getRepositoryType()==null) || 
             (this.repositoryType!=null &&
              this.repositoryType.equals(other.getRepositoryType())));
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
        if (getLdapDetails() != null) {
            _hashCode += getLdapDetails().hashCode();
        }
        if (getRepositoryType() != null) {
            _hashCode += getRepositoryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepositoryDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryDetailsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("repositoryType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "repositoryType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "ldapDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "LDAPRepositoryType"));
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
