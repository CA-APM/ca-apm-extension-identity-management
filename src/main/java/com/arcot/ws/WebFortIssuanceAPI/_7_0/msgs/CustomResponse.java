/**
 * CustomResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class CustomResponse  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceResponseType  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String orgName;

    private java.lang.Integer status;

    private java.util.Calendar createTime;

    private java.util.Calendar lastUpdatedTime;

    private java.util.Calendar validityStartTime;

    private java.util.Calendar validityEndTime;

    private java.lang.Integer numberOfFailedAuthAttempts;

    private java.util.Calendar lastSuccessAuthAttemptTime;

    private java.util.Calendar lastFailedAuthAttemptTime;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails;

    public CustomResponse() {
    }

    public CustomResponse(
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.Integer status,
           java.util.Calendar createTime,
           java.util.Calendar lastUpdatedTime,
           java.util.Calendar validityStartTime,
           java.util.Calendar validityEndTime,
           java.lang.Integer numberOfFailedAuthAttempts,
           java.util.Calendar lastSuccessAuthAttemptTime,
           java.util.Calendar lastFailedAuthAttemptTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.userName = userName;
        this.orgName = orgName;
        this.status = status;
        this.createTime = createTime;
        this.lastUpdatedTime = lastUpdatedTime;
        this.validityStartTime = validityStartTime;
        this.validityEndTime = validityEndTime;
        this.numberOfFailedAuthAttempts = numberOfFailedAuthAttempts;
        this.lastSuccessAuthAttemptTime = lastSuccessAuthAttemptTime;
        this.lastFailedAuthAttemptTime = lastFailedAuthAttemptTime;
        this.transactionDetails = transactionDetails;
    }


    /**
     * Gets the userName value for this CustomResponse.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CustomResponse.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the orgName value for this CustomResponse.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this CustomResponse.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the status value for this CustomResponse.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CustomResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the createTime value for this CustomResponse.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this CustomResponse.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the lastUpdatedTime value for this CustomResponse.
     * 
     * @return lastUpdatedTime
     */
    public java.util.Calendar getLastUpdatedTime() {
        return lastUpdatedTime;
    }


    /**
     * Sets the lastUpdatedTime value for this CustomResponse.
     * 
     * @param lastUpdatedTime
     */
    public void setLastUpdatedTime(java.util.Calendar lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }


    /**
     * Gets the validityStartTime value for this CustomResponse.
     * 
     * @return validityStartTime
     */
    public java.util.Calendar getValidityStartTime() {
        return validityStartTime;
    }


    /**
     * Sets the validityStartTime value for this CustomResponse.
     * 
     * @param validityStartTime
     */
    public void setValidityStartTime(java.util.Calendar validityStartTime) {
        this.validityStartTime = validityStartTime;
    }


    /**
     * Gets the validityEndTime value for this CustomResponse.
     * 
     * @return validityEndTime
     */
    public java.util.Calendar getValidityEndTime() {
        return validityEndTime;
    }


    /**
     * Sets the validityEndTime value for this CustomResponse.
     * 
     * @param validityEndTime
     */
    public void setValidityEndTime(java.util.Calendar validityEndTime) {
        this.validityEndTime = validityEndTime;
    }


    /**
     * Gets the numberOfFailedAuthAttempts value for this CustomResponse.
     * 
     * @return numberOfFailedAuthAttempts
     */
    public java.lang.Integer getNumberOfFailedAuthAttempts() {
        return numberOfFailedAuthAttempts;
    }


    /**
     * Sets the numberOfFailedAuthAttempts value for this CustomResponse.
     * 
     * @param numberOfFailedAuthAttempts
     */
    public void setNumberOfFailedAuthAttempts(java.lang.Integer numberOfFailedAuthAttempts) {
        this.numberOfFailedAuthAttempts = numberOfFailedAuthAttempts;
    }


    /**
     * Gets the lastSuccessAuthAttemptTime value for this CustomResponse.
     * 
     * @return lastSuccessAuthAttemptTime
     */
    public java.util.Calendar getLastSuccessAuthAttemptTime() {
        return lastSuccessAuthAttemptTime;
    }


    /**
     * Sets the lastSuccessAuthAttemptTime value for this CustomResponse.
     * 
     * @param lastSuccessAuthAttemptTime
     */
    public void setLastSuccessAuthAttemptTime(java.util.Calendar lastSuccessAuthAttemptTime) {
        this.lastSuccessAuthAttemptTime = lastSuccessAuthAttemptTime;
    }


    /**
     * Gets the lastFailedAuthAttemptTime value for this CustomResponse.
     * 
     * @return lastFailedAuthAttemptTime
     */
    public java.util.Calendar getLastFailedAuthAttemptTime() {
        return lastFailedAuthAttemptTime;
    }


    /**
     * Sets the lastFailedAuthAttemptTime value for this CustomResponse.
     * 
     * @param lastFailedAuthAttemptTime
     */
    public void setLastFailedAuthAttemptTime(java.util.Calendar lastFailedAuthAttemptTime) {
        this.lastFailedAuthAttemptTime = lastFailedAuthAttemptTime;
    }


    /**
     * Gets the transactionDetails value for this CustomResponse.
     * 
     * @return transactionDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType getTransactionDetails() {
        return transactionDetails;
    }


    /**
     * Sets the transactionDetails value for this CustomResponse.
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomResponse)) return false;
        CustomResponse other = (CustomResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.lastUpdatedTime==null && other.getLastUpdatedTime()==null) || 
             (this.lastUpdatedTime!=null &&
              this.lastUpdatedTime.equals(other.getLastUpdatedTime()))) &&
            ((this.validityStartTime==null && other.getValidityStartTime()==null) || 
             (this.validityStartTime!=null &&
              this.validityStartTime.equals(other.getValidityStartTime()))) &&
            ((this.validityEndTime==null && other.getValidityEndTime()==null) || 
             (this.validityEndTime!=null &&
              this.validityEndTime.equals(other.getValidityEndTime()))) &&
            ((this.numberOfFailedAuthAttempts==null && other.getNumberOfFailedAuthAttempts()==null) || 
             (this.numberOfFailedAuthAttempts!=null &&
              this.numberOfFailedAuthAttempts.equals(other.getNumberOfFailedAuthAttempts()))) &&
            ((this.lastSuccessAuthAttemptTime==null && other.getLastSuccessAuthAttemptTime()==null) || 
             (this.lastSuccessAuthAttemptTime!=null &&
              this.lastSuccessAuthAttemptTime.equals(other.getLastSuccessAuthAttemptTime()))) &&
            ((this.lastFailedAuthAttemptTime==null && other.getLastFailedAuthAttemptTime()==null) || 
             (this.lastFailedAuthAttemptTime!=null &&
              this.lastFailedAuthAttemptTime.equals(other.getLastFailedAuthAttemptTime()))) &&
            ((this.transactionDetails==null && other.getTransactionDetails()==null) || 
             (this.transactionDetails!=null &&
              this.transactionDetails.equals(other.getTransactionDetails())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getLastUpdatedTime() != null) {
            _hashCode += getLastUpdatedTime().hashCode();
        }
        if (getValidityStartTime() != null) {
            _hashCode += getValidityStartTime().hashCode();
        }
        if (getValidityEndTime() != null) {
            _hashCode += getValidityEndTime().hashCode();
        }
        if (getNumberOfFailedAuthAttempts() != null) {
            _hashCode += getNumberOfFailedAuthAttempts().hashCode();
        }
        if (getLastSuccessAuthAttemptTime() != null) {
            _hashCode += getLastSuccessAuthAttemptTime().hashCode();
        }
        if (getLastFailedAuthAttemptTime() != null) {
            _hashCode += getLastFailedAuthAttemptTime().hashCode();
        }
        if (getTransactionDetails() != null) {
            _hashCode += getTransactionDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CustomResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "lastUpdatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "validityStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "validityEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfFailedAuthAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "numberOfFailedAuthAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSuccessAuthAttemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "lastSuccessAuthAttemptTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFailedAuthAttemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "lastFailedAuthAttemptTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "transactionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType"));
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
