/**
 * OATHTokenInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Contains OATH token information.
 */
public class OATHTokenInfoType  extends com.arcot.www.ArWFTokenExchangeFormat._1_0.Token  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* Identifier for the current batch of tokens
     * 										being uploaded. */
    private java.lang.String batchID;

    /* Status of the Token, this is returned in
     * 										output for FetchOATHTokens call. Not considered
     * 										in input.
     * 										1  - FREE
     * 										2  - ASSIGNED
     * 										3  - ABANDONED
     * 										4  - FAILED */
    private int status;

    /* Remark if any for the current batch of tokens
     * 										being uploaded. */
    private java.lang.String remark;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails processingStatus;

    public OATHTokenInfoType() {
    }

    public OATHTokenInfoType(
           com.arcot.www.ArWFTokenExchangeFormat._1_0.TokenInfo tokenInfo,
           com.arcot.www.ArWFTokenExchangeFormat._1_0.Key key,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           java.lang.String batchID,
           int status,
           java.lang.String remark,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails processingStatus) {
        super(
            tokenInfo,
            key);
        this.orgDetails = orgDetails;
        this.batchID = batchID;
        this.status = status;
        this.remark = remark;
        this.processingStatus = processingStatus;
    }


    /**
     * Gets the orgDetails value for this OATHTokenInfoType.
     * 
     * @return orgDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this OATHTokenInfoType.
     * 
     * @param orgDetails
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the batchID value for this OATHTokenInfoType.
     * 
     * @return batchID   * Identifier for the current batch of tokens
     * 										being uploaded.
     */
    public java.lang.String getBatchID() {
        return batchID;
    }


    /**
     * Sets the batchID value for this OATHTokenInfoType.
     * 
     * @param batchID   * Identifier for the current batch of tokens
     * 										being uploaded.
     */
    public void setBatchID(java.lang.String batchID) {
        this.batchID = batchID;
    }


    /**
     * Gets the status value for this OATHTokenInfoType.
     * 
     * @return status   * Status of the Token, this is returned in
     * 										output for FetchOATHTokens call. Not considered
     * 										in input.
     * 										1  - FREE
     * 										2  - ASSIGNED
     * 										3  - ABANDONED
     * 										4  - FAILED
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OATHTokenInfoType.
     * 
     * @param status   * Status of the Token, this is returned in
     * 										output for FetchOATHTokens call. Not considered
     * 										in input.
     * 										1  - FREE
     * 										2  - ASSIGNED
     * 										3  - ABANDONED
     * 										4  - FAILED
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the remark value for this OATHTokenInfoType.
     * 
     * @return remark   * Remark if any for the current batch of tokens
     * 										being uploaded.
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OATHTokenInfoType.
     * 
     * @param remark   * Remark if any for the current batch of tokens
     * 										being uploaded.
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the processingStatus value for this OATHTokenInfoType.
     * 
     * @return processingStatus
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails getProcessingStatus() {
        return processingStatus;
    }


    /**
     * Sets the processingStatus value for this OATHTokenInfoType.
     * 
     * @param processingStatus
     */
    public void setProcessingStatus(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ErrorDetails processingStatus) {
        this.processingStatus = processingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OATHTokenInfoType)) return false;
        OATHTokenInfoType other = (OATHTokenInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orgDetails==null && other.getOrgDetails()==null) || 
             (this.orgDetails!=null &&
              this.orgDetails.equals(other.getOrgDetails()))) &&
            ((this.batchID==null && other.getBatchID()==null) || 
             (this.batchID!=null &&
              this.batchID.equals(other.getBatchID()))) &&
            this.status == other.getStatus() &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.processingStatus==null && other.getProcessingStatus()==null) || 
             (this.processingStatus!=null &&
              this.processingStatus.equals(other.getProcessingStatus())));
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
        if (getOrgDetails() != null) {
            _hashCode += getOrgDetails().hashCode();
        }
        if (getBatchID() != null) {
            _hashCode += getBatchID().hashCode();
        }
        _hashCode += getStatus();
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getProcessingStatus() != null) {
            _hashCode += getProcessingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OATHTokenInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "OATHTokenInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "batchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "processingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ErrorDetails"));
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
