/**
 * UpdateOrgStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class UpdateOrgStatusRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.OrgStatusType status;

    private java.lang.String[] orgName;

    private java.lang.String clientTxId;

    public UpdateOrgStatusRequest() {
    }

    public UpdateOrgStatusRequest(
           com.arcot.ws.UserSchema._1_0.OrgStatusType status,
           java.lang.String[] orgName,
           java.lang.String clientTxId) {
           this.status = status;
           this.orgName = orgName;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the status value for this UpdateOrgStatusRequest.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.OrgStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateOrgStatusRequest.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.OrgStatusType status) {
        this.status = status;
    }


    /**
     * Gets the orgName value for this UpdateOrgStatusRequest.
     * 
     * @return orgName
     */
    public java.lang.String[] getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this UpdateOrgStatusRequest.
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
     * Gets the clientTxId value for this UpdateOrgStatusRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this UpdateOrgStatusRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrgStatusRequest)) return false;
        UpdateOrgStatusRequest other = (UpdateOrgStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              java.util.Arrays.equals(this.orgName, other.getOrgName()))) &&
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrgStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrgStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
