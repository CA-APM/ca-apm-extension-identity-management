/**
 * ListOrgsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class ListOrgsRequest  implements java.io.Serializable {
    private java.lang.String namePattern;

    private java.lang.String[] orgName;

    private com.arcot.ws.UserSchema._1_0.OrgStatusType[] orgStatus;

    private java.lang.String clientTxId;

    public ListOrgsRequest() {
    }

    public ListOrgsRequest(
           java.lang.String namePattern,
           java.lang.String[] orgName,
           com.arcot.ws.UserSchema._1_0.OrgStatusType[] orgStatus,
           java.lang.String clientTxId) {
           this.namePattern = namePattern;
           this.orgName = orgName;
           this.orgStatus = orgStatus;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the namePattern value for this ListOrgsRequest.
     * 
     * @return namePattern
     */
    public java.lang.String getNamePattern() {
        return namePattern;
    }


    /**
     * Sets the namePattern value for this ListOrgsRequest.
     * 
     * @param namePattern
     */
    public void setNamePattern(java.lang.String namePattern) {
        this.namePattern = namePattern;
    }


    /**
     * Gets the orgName value for this ListOrgsRequest.
     * 
     * @return orgName
     */
    public java.lang.String[] getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this ListOrgsRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String[] orgName) {
        this.orgName = orgName;
    }

    public java.lang.String getOrgName(int i) {
        return this.orgName[i];
    }

    public void setOrgName(int i, java.lang.String _value) {
        this.orgName[i] = _value;
    }


    /**
     * Gets the orgStatus value for this ListOrgsRequest.
     * 
     * @return orgStatus
     */
    public com.arcot.ws.UserSchema._1_0.OrgStatusType[] getOrgStatus() {
        return orgStatus;
    }


    /**
     * Sets the orgStatus value for this ListOrgsRequest.
     * 
     * @param orgStatus
     */
    public void setOrgStatus(com.arcot.ws.UserSchema._1_0.OrgStatusType[] orgStatus) {
        this.orgStatus = orgStatus;
    }

    public com.arcot.ws.UserSchema._1_0.OrgStatusType getOrgStatus(int i) {
        return this.orgStatus[i];
    }

    public void setOrgStatus(int i, com.arcot.ws.UserSchema._1_0.OrgStatusType _value) {
        this.orgStatus[i] = _value;
    }


    /**
     * Gets the clientTxId value for this ListOrgsRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this ListOrgsRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListOrgsRequest)) return false;
        ListOrgsRequest other = (ListOrgsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namePattern==null && other.getNamePattern()==null) || 
             (this.namePattern!=null &&
              this.namePattern.equals(other.getNamePattern()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              java.util.Arrays.equals(this.orgName, other.getOrgName()))) &&
            ((this.orgStatus==null && other.getOrgStatus()==null) || 
             (this.orgStatus!=null &&
              java.util.Arrays.equals(this.orgStatus, other.getOrgStatus()))) &&
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
        if (getNamePattern() != null) {
            _hashCode += getNamePattern().hashCode();
        }
        if (getOrgName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrgStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgStatus(), i);
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
        new org.apache.axis.description.TypeDesc(ListOrgsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listOrgsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namePattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namePattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrgStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrgStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientTxId"));
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
