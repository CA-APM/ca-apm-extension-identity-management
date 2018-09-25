/**
 * FetchQnAConfigurationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class FetchQnAConfigurationResponse  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceResponseType  implements java.io.Serializable {
    private java.lang.String orgName;

    private java.lang.String profileName;

    private int minQuestions;

    private int maxQuestions;

    private java.lang.String[] questions;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails;

    public FetchQnAConfigurationResponse() {
    }

    public FetchQnAConfigurationResponse(
           java.lang.String orgName,
           java.lang.String profileName,
           int minQuestions,
           int maxQuestions,
           java.lang.String[] questions,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.orgName = orgName;
        this.profileName = profileName;
        this.minQuestions = minQuestions;
        this.maxQuestions = maxQuestions;
        this.questions = questions;
        this.transactionDetails = transactionDetails;
    }


    /**
     * Gets the orgName value for this FetchQnAConfigurationResponse.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this FetchQnAConfigurationResponse.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the profileName value for this FetchQnAConfigurationResponse.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this FetchQnAConfigurationResponse.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the minQuestions value for this FetchQnAConfigurationResponse.
     * 
     * @return minQuestions
     */
    public int getMinQuestions() {
        return minQuestions;
    }


    /**
     * Sets the minQuestions value for this FetchQnAConfigurationResponse.
     * 
     * @param minQuestions
     */
    public void setMinQuestions(int minQuestions) {
        this.minQuestions = minQuestions;
    }


    /**
     * Gets the maxQuestions value for this FetchQnAConfigurationResponse.
     * 
     * @return maxQuestions
     */
    public int getMaxQuestions() {
        return maxQuestions;
    }


    /**
     * Sets the maxQuestions value for this FetchQnAConfigurationResponse.
     * 
     * @param maxQuestions
     */
    public void setMaxQuestions(int maxQuestions) {
        this.maxQuestions = maxQuestions;
    }


    /**
     * Gets the questions value for this FetchQnAConfigurationResponse.
     * 
     * @return questions
     */
    public java.lang.String[] getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this FetchQnAConfigurationResponse.
     * 
     * @param questions
     */
    public void setQuestions(java.lang.String[] questions) {
        this.questions = questions;
    }

    public java.lang.String getQuestions(int i) {
        return this.questions[i];
    }

    public void setQuestions(int i, java.lang.String _value) {
        this.questions[i] = _value;
    }


    /**
     * Gets the transactionDetails value for this FetchQnAConfigurationResponse.
     * 
     * @return transactionDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType getTransactionDetails() {
        return transactionDetails;
    }


    /**
     * Sets the transactionDetails value for this FetchQnAConfigurationResponse.
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchQnAConfigurationResponse)) return false;
        FetchQnAConfigurationResponse other = (FetchQnAConfigurationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            this.minQuestions == other.getMinQuestions() &&
            this.maxQuestions == other.getMaxQuestions() &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              java.util.Arrays.equals(this.questions, other.getQuestions()))) &&
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
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        _hashCode += getMinQuestions();
        _hashCode += getMaxQuestions();
        if (getQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetails() != null) {
            _hashCode += getTransactionDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchQnAConfigurationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">FetchQnAConfigurationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "minQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "maxQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
