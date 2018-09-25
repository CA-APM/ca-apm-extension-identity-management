/**
 * PerformQnAVerificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class PerformQnAVerificationRequest  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String orgname;

    private com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute[] attributes;

    private boolean ignorecase;

    private java.lang.String clientTxId;

    public PerformQnAVerificationRequest() {
    }

    public PerformQnAVerificationRequest(
           java.lang.String username,
           java.lang.String orgname,
           com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute[] attributes,
           boolean ignorecase,
           java.lang.String clientTxId) {
           this.username = username;
           this.orgname = orgname;
           this.attributes = attributes;
           this.ignorecase = ignorecase;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the username value for this PerformQnAVerificationRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this PerformQnAVerificationRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the orgname value for this PerformQnAVerificationRequest.
     * 
     * @return orgname
     */
    public java.lang.String getOrgname() {
        return orgname;
    }


    /**
     * Sets the orgname value for this PerformQnAVerificationRequest.
     * 
     * @param orgname
     */
    public void setOrgname(java.lang.String orgname) {
        this.orgname = orgname;
    }


    /**
     * Gets the attributes value for this PerformQnAVerificationRequest.
     * 
     * @return attributes
     */
    public com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PerformQnAVerificationRequest.
     * 
     * @param attributes
     */
    public void setAttributes(com.arcot.ws.UserSchema._1_0.QnARequestAttributeAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the ignorecase value for this PerformQnAVerificationRequest.
     * 
     * @return ignorecase
     */
    public boolean isIgnorecase() {
        return ignorecase;
    }


    /**
     * Sets the ignorecase value for this PerformQnAVerificationRequest.
     * 
     * @param ignorecase
     */
    public void setIgnorecase(boolean ignorecase) {
        this.ignorecase = ignorecase;
    }


    /**
     * Gets the clientTxId value for this PerformQnAVerificationRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this PerformQnAVerificationRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformQnAVerificationRequest)) return false;
        PerformQnAVerificationRequest other = (PerformQnAVerificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.orgname==null && other.getOrgname()==null) || 
             (this.orgname!=null &&
              this.orgname.equals(other.getOrgname()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            this.ignorecase == other.isIgnorecase() &&
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getOrgname() != null) {
            _hashCode += getOrgname().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIgnorecase() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformQnAVerificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">performQnAVerificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "orgname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">QnARequestAttribute>attribute"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignorecase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "ignorecase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
