/**
 * RiskAssessmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class RiskAssessmentType  implements java.io.Serializable {
    /* Advice is the response given by RiskFort to indicate the risk
     * associated
     * 								with the transaction and the corresponding action to be taken
     * by the application.
     * 								Possible advices are :
     * 								ALLOW		 - Allow transaction to proceed
     * 								ALERT		 - User is not a known user, enroll the user
     * 								INCREASEAUTH - Perform Additional Authentication
     * 								DENY		 - Deny the	transaction */
    private java.lang.String advice;

    /* This is the output deviceID genarated by the RiskFort. */
    private java.lang.String outputDeviceID;

    /* Risk score is information in addition to advice that gives
     * accurate score for the
     * 								transaction. */
    private java.math.BigInteger score;

    /* The matched rule mnemonic (server-generated). */
    private java.lang.String matchedRuleMnemonic;

    /* Annotation string for the rules result (server-generated). */
    private java.lang.String ruleAnnotation;

    /* Unique identifier for transaction (server-generated). */
    private java.lang.String transactionID;

    /* Client Device Context. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext;

    /* Client's geo-location information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext;

    /* User Contextual Information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext;

    /* Client's transaction information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalOutput;

    public RiskAssessmentType() {
    }

    public RiskAssessmentType(
           java.lang.String advice,
           java.lang.String outputDeviceID,
           java.math.BigInteger score,
           java.lang.String matchedRuleMnemonic,
           java.lang.String ruleAnnotation,
           java.lang.String transactionID,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalOutput) {
           this.advice = advice;
           this.outputDeviceID = outputDeviceID;
           this.score = score;
           this.matchedRuleMnemonic = matchedRuleMnemonic;
           this.ruleAnnotation = ruleAnnotation;
           this.transactionID = transactionID;
           this.deviceContext = deviceContext;
           this.locationContext = locationContext;
           this.userContext = userContext;
           this.transactionContext = transactionContext;
           this.additionalOutput = additionalOutput;
    }


    /**
     * Gets the advice value for this RiskAssessmentType.
     * 
     * @return advice   * Advice is the response given by RiskFort to indicate the risk
     * associated
     * 								with the transaction and the corresponding action to be taken
     * by the application.
     * 								Possible advices are :
     * 								ALLOW		 - Allow transaction to proceed
     * 								ALERT		 - User is not a known user, enroll the user
     * 								INCREASEAUTH - Perform Additional Authentication
     * 								DENY		 - Deny the	transaction
     */
    public java.lang.String getAdvice() {
        return advice;
    }


    /**
     * Sets the advice value for this RiskAssessmentType.
     * 
     * @param advice   * Advice is the response given by RiskFort to indicate the risk
     * associated
     * 								with the transaction and the corresponding action to be taken
     * by the application.
     * 								Possible advices are :
     * 								ALLOW		 - Allow transaction to proceed
     * 								ALERT		 - User is not a known user, enroll the user
     * 								INCREASEAUTH - Perform Additional Authentication
     * 								DENY		 - Deny the	transaction
     */
    public void setAdvice(java.lang.String advice) {
        this.advice = advice;
    }


    /**
     * Gets the outputDeviceID value for this RiskAssessmentType.
     * 
     * @return outputDeviceID   * This is the output deviceID genarated by the RiskFort.
     */
    public java.lang.String getOutputDeviceID() {
        return outputDeviceID;
    }


    /**
     * Sets the outputDeviceID value for this RiskAssessmentType.
     * 
     * @param outputDeviceID   * This is the output deviceID genarated by the RiskFort.
     */
    public void setOutputDeviceID(java.lang.String outputDeviceID) {
        this.outputDeviceID = outputDeviceID;
    }


    /**
     * Gets the score value for this RiskAssessmentType.
     * 
     * @return score   * Risk score is information in addition to advice that gives
     * accurate score for the
     * 								transaction.
     */
    public java.math.BigInteger getScore() {
        return score;
    }


    /**
     * Sets the score value for this RiskAssessmentType.
     * 
     * @param score   * Risk score is information in addition to advice that gives
     * accurate score for the
     * 								transaction.
     */
    public void setScore(java.math.BigInteger score) {
        this.score = score;
    }


    /**
     * Gets the matchedRuleMnemonic value for this RiskAssessmentType.
     * 
     * @return matchedRuleMnemonic   * The matched rule mnemonic (server-generated).
     */
    public java.lang.String getMatchedRuleMnemonic() {
        return matchedRuleMnemonic;
    }


    /**
     * Sets the matchedRuleMnemonic value for this RiskAssessmentType.
     * 
     * @param matchedRuleMnemonic   * The matched rule mnemonic (server-generated).
     */
    public void setMatchedRuleMnemonic(java.lang.String matchedRuleMnemonic) {
        this.matchedRuleMnemonic = matchedRuleMnemonic;
    }


    /**
     * Gets the ruleAnnotation value for this RiskAssessmentType.
     * 
     * @return ruleAnnotation   * Annotation string for the rules result (server-generated).
     */
    public java.lang.String getRuleAnnotation() {
        return ruleAnnotation;
    }


    /**
     * Sets the ruleAnnotation value for this RiskAssessmentType.
     * 
     * @param ruleAnnotation   * Annotation string for the rules result (server-generated).
     */
    public void setRuleAnnotation(java.lang.String ruleAnnotation) {
        this.ruleAnnotation = ruleAnnotation;
    }


    /**
     * Gets the transactionID value for this RiskAssessmentType.
     * 
     * @return transactionID   * Unique identifier for transaction (server-generated).
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RiskAssessmentType.
     * 
     * @param transactionID   * Unique identifier for transaction (server-generated).
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the deviceContext value for this RiskAssessmentType.
     * 
     * @return deviceContext   * Client Device Context.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType getDeviceContext() {
        return deviceContext;
    }


    /**
     * Sets the deviceContext value for this RiskAssessmentType.
     * 
     * @param deviceContext   * Client Device Context.
     */
    public void setDeviceContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext) {
        this.deviceContext = deviceContext;
    }


    /**
     * Gets the locationContext value for this RiskAssessmentType.
     * 
     * @return locationContext   * Client's geo-location information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType getLocationContext() {
        return locationContext;
    }


    /**
     * Sets the locationContext value for this RiskAssessmentType.
     * 
     * @param locationContext   * Client's geo-location information.
     */
    public void setLocationContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext) {
        this.locationContext = locationContext;
    }


    /**
     * Gets the userContext value for this RiskAssessmentType.
     * 
     * @return userContext   * User Contextual Information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType getUserContext() {
        return userContext;
    }


    /**
     * Sets the userContext value for this RiskAssessmentType.
     * 
     * @param userContext   * User Contextual Information.
     */
    public void setUserContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext) {
        this.userContext = userContext;
    }


    /**
     * Gets the transactionContext value for this RiskAssessmentType.
     * 
     * @return transactionContext   * Client's transaction information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType getTransactionContext() {
        return transactionContext;
    }


    /**
     * Sets the transactionContext value for this RiskAssessmentType.
     * 
     * @param transactionContext   * Client's transaction information.
     */
    public void setTransactionContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext) {
        this.transactionContext = transactionContext;
    }


    /**
     * Gets the additionalOutput value for this RiskAssessmentType.
     * 
     * @return additionalOutput
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] getAdditionalOutput() {
        return additionalOutput;
    }


    /**
     * Sets the additionalOutput value for this RiskAssessmentType.
     * 
     * @param additionalOutput
     */
    public void setAdditionalOutput(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalOutput) {
        this.additionalOutput = additionalOutput;
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType getAdditionalOutput(int i) {
        return this.additionalOutput[i];
    }

    public void setAdditionalOutput(int i, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType _value) {
        this.additionalOutput[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskAssessmentType)) return false;
        RiskAssessmentType other = (RiskAssessmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advice==null && other.getAdvice()==null) || 
             (this.advice!=null &&
              this.advice.equals(other.getAdvice()))) &&
            ((this.outputDeviceID==null && other.getOutputDeviceID()==null) || 
             (this.outputDeviceID!=null &&
              this.outputDeviceID.equals(other.getOutputDeviceID()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.matchedRuleMnemonic==null && other.getMatchedRuleMnemonic()==null) || 
             (this.matchedRuleMnemonic!=null &&
              this.matchedRuleMnemonic.equals(other.getMatchedRuleMnemonic()))) &&
            ((this.ruleAnnotation==null && other.getRuleAnnotation()==null) || 
             (this.ruleAnnotation!=null &&
              this.ruleAnnotation.equals(other.getRuleAnnotation()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.deviceContext==null && other.getDeviceContext()==null) || 
             (this.deviceContext!=null &&
              this.deviceContext.equals(other.getDeviceContext()))) &&
            ((this.locationContext==null && other.getLocationContext()==null) || 
             (this.locationContext!=null &&
              this.locationContext.equals(other.getLocationContext()))) &&
            ((this.userContext==null && other.getUserContext()==null) || 
             (this.userContext!=null &&
              this.userContext.equals(other.getUserContext()))) &&
            ((this.transactionContext==null && other.getTransactionContext()==null) || 
             (this.transactionContext!=null &&
              this.transactionContext.equals(other.getTransactionContext()))) &&
            ((this.additionalOutput==null && other.getAdditionalOutput()==null) || 
             (this.additionalOutput!=null &&
              java.util.Arrays.equals(this.additionalOutput, other.getAdditionalOutput())));
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
        if (getAdvice() != null) {
            _hashCode += getAdvice().hashCode();
        }
        if (getOutputDeviceID() != null) {
            _hashCode += getOutputDeviceID().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getMatchedRuleMnemonic() != null) {
            _hashCode += getMatchedRuleMnemonic().hashCode();
        }
        if (getRuleAnnotation() != null) {
            _hashCode += getRuleAnnotation().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getDeviceContext() != null) {
            _hashCode += getDeviceContext().hashCode();
        }
        if (getLocationContext() != null) {
            _hashCode += getLocationContext().hashCode();
        }
        if (getUserContext() != null) {
            _hashCode += getUserContext().hashCode();
        }
        if (getTransactionContext() != null) {
            _hashCode += getTransactionContext().hashCode();
        }
        if (getAdditionalOutput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalOutput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalOutput(), i);
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
        new org.apache.axis.description.TypeDesc(RiskAssessmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskAssessmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "advice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "outputDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedRuleMnemonic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "matchedRuleMnemonic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleAnnotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ruleAnnotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeviceContextType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "locationContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "LocationContextType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "userContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserContextType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "transactionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "TransactionContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "additionalOutput"));
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
