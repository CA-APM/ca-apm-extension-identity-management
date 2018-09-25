/**
 * EvaluateResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class EvaluateResponseType  implements java.io.Serializable {
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess;

    public EvaluateResponseType() {
    }

    public EvaluateResponseType(
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
           this.riskAssessment = riskAssessment;
           this.riskFortSuccess = riskFortSuccess;
    }


    /**
     * Gets the riskAssessment value for this EvaluateResponseType.
     * 
     * @return riskAssessment
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType getRiskAssessment() {
        return riskAssessment;
    }


    /**
     * Sets the riskAssessment value for this EvaluateResponseType.
     * 
     * @param riskAssessment
     */
    public void setRiskAssessment(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType riskAssessment) {
        this.riskAssessment = riskAssessment;
    }


    /**
     * Gets the riskFortSuccess value for this EvaluateResponseType.
     * 
     * @return riskFortSuccess
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess getRiskFortSuccess() {
        return riskFortSuccess;
    }


    /**
     * Sets the riskFortSuccess value for this EvaluateResponseType.
     * 
     * @param riskFortSuccess
     */
    public void setRiskFortSuccess(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
        this.riskFortSuccess = riskFortSuccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EvaluateResponseType)) return false;
        EvaluateResponseType other = (EvaluateResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riskAssessment==null && other.getRiskAssessment()==null) || 
             (this.riskAssessment!=null &&
              this.riskAssessment.equals(other.getRiskAssessment()))) &&
            ((this.riskFortSuccess==null && other.getRiskFortSuccess()==null) || 
             (this.riskFortSuccess!=null &&
              this.riskFortSuccess.equals(other.getRiskFortSuccess())));
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
        if (getRiskAssessment() != null) {
            _hashCode += getRiskAssessment().hashCode();
        }
        if (getRiskFortSuccess() != null) {
            _hashCode += getRiskFortSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EvaluateResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskAssessment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "riskAssessment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskAssessmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskFortSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "riskFortSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskFortSuccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
