/**
 * PostEvaluateResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class PostEvaluateResponseType  implements java.io.Serializable {
    /* isAllowAdvised is true if the final
     * 								access to the user is allowed and false
     * 								in all other cases. */
    private boolean isAllowAdvised;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess;

    public PostEvaluateResponseType() {
    }

    public PostEvaluateResponseType(
           boolean isAllowAdvised,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
           this.isAllowAdvised = isAllowAdvised;
           this.riskFortSuccess = riskFortSuccess;
    }


    /**
     * Gets the isAllowAdvised value for this PostEvaluateResponseType.
     * 
     * @return isAllowAdvised   * isAllowAdvised is true if the final
     * 								access to the user is allowed and false
     * 								in all other cases.
     */
    public boolean isIsAllowAdvised() {
        return isAllowAdvised;
    }


    /**
     * Sets the isAllowAdvised value for this PostEvaluateResponseType.
     * 
     * @param isAllowAdvised   * isAllowAdvised is true if the final
     * 								access to the user is allowed and false
     * 								in all other cases.
     */
    public void setIsAllowAdvised(boolean isAllowAdvised) {
        this.isAllowAdvised = isAllowAdvised;
    }


    /**
     * Gets the riskFortSuccess value for this PostEvaluateResponseType.
     * 
     * @return riskFortSuccess
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess getRiskFortSuccess() {
        return riskFortSuccess;
    }


    /**
     * Sets the riskFortSuccess value for this PostEvaluateResponseType.
     * 
     * @param riskFortSuccess
     */
    public void setRiskFortSuccess(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
        this.riskFortSuccess = riskFortSuccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostEvaluateResponseType)) return false;
        PostEvaluateResponseType other = (PostEvaluateResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isAllowAdvised == other.isIsAllowAdvised() &&
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
        _hashCode += (isIsAllowAdvised() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRiskFortSuccess() != null) {
            _hashCode += getRiskFortSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostEvaluateResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllowAdvised");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "isAllowAdvised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
