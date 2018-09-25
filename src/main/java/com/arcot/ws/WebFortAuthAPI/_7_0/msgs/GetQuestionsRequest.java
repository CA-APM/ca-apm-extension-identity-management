/**
 * GetQuestionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.msgs;

public class GetQuestionsRequest  extends com.arcot.ws.WebFortAuthAPI._7_0.xsd.BaseAuthRequestType  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String orgName;

    private java.lang.Boolean fetchAnswers;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput;

    public GetQuestionsRequest() {
    }

    public GetQuestionsRequest(
           java.lang.String clientTxnId,
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.Boolean fetchAnswers,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        super(
            clientTxnId);
        this.userName = userName;
        this.orgName = orgName;
        this.fetchAnswers = fetchAnswers;
        this.additionalInput = additionalInput;
    }


    /**
     * Gets the userName value for this GetQuestionsRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetQuestionsRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the orgName value for this GetQuestionsRequest.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this GetQuestionsRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the fetchAnswers value for this GetQuestionsRequest.
     * 
     * @return fetchAnswers
     */
    public java.lang.Boolean getFetchAnswers() {
        return fetchAnswers;
    }


    /**
     * Sets the fetchAnswers value for this GetQuestionsRequest.
     * 
     * @param fetchAnswers
     */
    public void setFetchAnswers(java.lang.Boolean fetchAnswers) {
        this.fetchAnswers = fetchAnswers;
    }


    /**
     * Gets the additionalInput value for this GetQuestionsRequest.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this GetQuestionsRequest.
     * 
     * @param additionalInput
     */
    public void setAdditionalInput(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        this.additionalInput = additionalInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQuestionsRequest)) return false;
        GetQuestionsRequest other = (GetQuestionsRequest) obj;
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
            ((this.fetchAnswers==null && other.getFetchAnswers()==null) || 
             (this.fetchAnswers!=null &&
              this.fetchAnswers.equals(other.getFetchAnswers()))) &&
            ((this.additionalInput==null && other.getAdditionalInput()==null) || 
             (this.additionalInput!=null &&
              java.util.Arrays.equals(this.additionalInput, other.getAdditionalInput())));
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
        if (getFetchAnswers() != null) {
            _hashCode += getFetchAnswers().hashCode();
        }
        if (getAdditionalInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInput(), i);
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
        new org.apache.axis.description.TypeDesc(GetQuestionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", ">GetQuestionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "fetchAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/msgs", "additionalInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "pairs"));
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
