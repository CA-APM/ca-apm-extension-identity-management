/**
 * PostEvaluateRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class PostEvaluateRequestType  implements java.io.Serializable {
    /* Identifier passed by the application to co-relate multiple
     * API calls. */
    private java.lang.String callerId;

    /* The output from evaluateRisk call is
     * 								passed as an argument to postEvaluate
     * 								call */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment;

    /* The boolean value from the secondary
     * 								authentication mechanism. True if the
     * 								secondary authentication is successful,
     * 								otherwise false. */
    private boolean secondaryAuthenticationStatus;

    /* Descriptive association name for user's device.
     * 								eg: "Office PC". */
    private java.lang.String associationName;

    /* AdminContext defination */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput;

    public PostEvaluateRequestType() {
    }

    public PostEvaluateRequestType(
           java.lang.String callerId,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment,
           boolean secondaryAuthenticationStatus,
           java.lang.String associationName,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput) {
           this.callerId = callerId;
           this.riskAssessment = riskAssessment;
           this.secondaryAuthenticationStatus = secondaryAuthenticationStatus;
           this.associationName = associationName;
           this.adminContextType = adminContextType;
           this.additionalInput = additionalInput;
    }


    /**
     * Gets the callerId value for this PostEvaluateRequestType.
     * 
     * @return callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public java.lang.String getCallerId() {
        return callerId;
    }


    /**
     * Sets the callerId value for this PostEvaluateRequestType.
     * 
     * @param callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public void setCallerId(java.lang.String callerId) {
        this.callerId = callerId;
    }


    /**
     * Gets the riskAssessment value for this PostEvaluateRequestType.
     * 
     * @return riskAssessment   * The output from evaluateRisk call is
     * 								passed as an argument to postEvaluate
     * 								call
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType getRiskAssessment() {
        return riskAssessment;
    }


    /**
     * Sets the riskAssessment value for this PostEvaluateRequestType.
     * 
     * @param riskAssessment   * The output from evaluateRisk call is
     * 								passed as an argument to postEvaluate
     * 								call
     */
    public void setRiskAssessment(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment) {
        this.riskAssessment = riskAssessment;
    }


    /**
     * Gets the secondaryAuthenticationStatus value for this PostEvaluateRequestType.
     * 
     * @return secondaryAuthenticationStatus   * The boolean value from the secondary
     * 								authentication mechanism. True if the
     * 								secondary authentication is successful,
     * 								otherwise false.
     */
    public boolean isSecondaryAuthenticationStatus() {
        return secondaryAuthenticationStatus;
    }


    /**
     * Sets the secondaryAuthenticationStatus value for this PostEvaluateRequestType.
     * 
     * @param secondaryAuthenticationStatus   * The boolean value from the secondary
     * 								authentication mechanism. True if the
     * 								secondary authentication is successful,
     * 								otherwise false.
     */
    public void setSecondaryAuthenticationStatus(boolean secondaryAuthenticationStatus) {
        this.secondaryAuthenticationStatus = secondaryAuthenticationStatus;
    }


    /**
     * Gets the associationName value for this PostEvaluateRequestType.
     * 
     * @return associationName   * Descriptive association name for user's device.
     * 								eg: "Office PC".
     */
    public java.lang.String getAssociationName() {
        return associationName;
    }


    /**
     * Sets the associationName value for this PostEvaluateRequestType.
     * 
     * @param associationName   * Descriptive association name for user's device.
     * 								eg: "Office PC".
     */
    public void setAssociationName(java.lang.String associationName) {
        this.associationName = associationName;
    }


    /**
     * Gets the adminContextType value for this PostEvaluateRequestType.
     * 
     * @return adminContextType   * AdminContext defination
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType getAdminContextType() {
        return adminContextType;
    }


    /**
     * Sets the adminContextType value for this PostEvaluateRequestType.
     * 
     * @param adminContextType   * AdminContext defination
     */
    public void setAdminContextType(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType) {
        this.adminContextType = adminContextType;
    }


    /**
     * Gets the additionalInput value for this PostEvaluateRequestType.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this PostEvaluateRequestType.
     * 
     * @param additionalInput
     */
    public void setAdditionalInput(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput) {
        this.additionalInput = additionalInput;
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType getAdditionalInput(int i) {
        return this.additionalInput[i];
    }

    public void setAdditionalInput(int i, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType _value) {
        this.additionalInput[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostEvaluateRequestType)) return false;
        PostEvaluateRequestType other = (PostEvaluateRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callerId==null && other.getCallerId()==null) || 
             (this.callerId!=null &&
              this.callerId.equals(other.getCallerId()))) &&
            ((this.riskAssessment==null && other.getRiskAssessment()==null) || 
             (this.riskAssessment!=null &&
              this.riskAssessment.equals(other.getRiskAssessment()))) &&
            this.secondaryAuthenticationStatus == other.isSecondaryAuthenticationStatus() &&
            ((this.associationName==null && other.getAssociationName()==null) || 
             (this.associationName!=null &&
              this.associationName.equals(other.getAssociationName()))) &&
            ((this.adminContextType==null && other.getAdminContextType()==null) || 
             (this.adminContextType!=null &&
              this.adminContextType.equals(other.getAdminContextType()))) &&
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
        int _hashCode = 1;
        if (getCallerId() != null) {
            _hashCode += getCallerId().hashCode();
        }
        if (getRiskAssessment() != null) {
            _hashCode += getRiskAssessment().hashCode();
        }
        _hashCode += (isSecondaryAuthenticationStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAssociationName() != null) {
            _hashCode += getAssociationName().hashCode();
        }
        if (getAdminContextType() != null) {
            _hashCode += getAdminContextType().hashCode();
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
        new org.apache.axis.description.TypeDesc(PostEvaluateRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "callerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskAssessment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "riskAssessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskAssessmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryAuthenticationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "secondaryAuthenticationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "associationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminContextType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "adminContextType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "AdminContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "additionalInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "NameValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
