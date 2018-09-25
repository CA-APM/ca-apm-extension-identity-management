/**
 * ListRepositoryAttributesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class ListRepositoryAttributesRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails;

    private java.lang.String clientTxId;

    public ListRepositoryAttributesRequest() {
    }

    public ListRepositoryAttributesRequest(
           com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails,
           java.lang.String clientTxId) {
           this.repositoryDetails = repositoryDetails;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the repositoryDetails value for this ListRepositoryAttributesRequest.
     * 
     * @return repositoryDetails
     */
    public com.arcot.ws.UserSchema._1_0.RepositoryDetailsType getRepositoryDetails() {
        return repositoryDetails;
    }


    /**
     * Sets the repositoryDetails value for this ListRepositoryAttributesRequest.
     * 
     * @param repositoryDetails
     */
    public void setRepositoryDetails(com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails) {
        this.repositoryDetails = repositoryDetails;
    }


    /**
     * Gets the clientTxId value for this ListRepositoryAttributesRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this ListRepositoryAttributesRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListRepositoryAttributesRequest)) return false;
        ListRepositoryAttributesRequest other = (ListRepositoryAttributesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repositoryDetails==null && other.getRepositoryDetails()==null) || 
             (this.repositoryDetails!=null &&
              this.repositoryDetails.equals(other.getRepositoryDetails()))) &&
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
        if (getRepositoryDetails() != null) {
            _hashCode += getRepositoryDetails().hashCode();
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListRepositoryAttributesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositoryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryDetailsType"));
        elemField.setNillable(false);
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
