/**
 * DeleteAssociationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class DeleteAssociationResponseType  implements java.io.Serializable {
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskfortSuccess;

    public DeleteAssociationResponseType() {
    }

    public DeleteAssociationResponseType(
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskfortSuccess) {
           this.riskfortSuccess = riskfortSuccess;
    }


    /**
     * Gets the riskfortSuccess value for this DeleteAssociationResponseType.
     * 
     * @return riskfortSuccess
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess getRiskfortSuccess() {
        return riskfortSuccess;
    }


    /**
     * Sets the riskfortSuccess value for this DeleteAssociationResponseType.
     * 
     * @param riskfortSuccess
     */
    public void setRiskfortSuccess(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskfortSuccess) {
        this.riskfortSuccess = riskfortSuccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAssociationResponseType)) return false;
        DeleteAssociationResponseType other = (DeleteAssociationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riskfortSuccess==null && other.getRiskfortSuccess()==null) || 
             (this.riskfortSuccess!=null &&
              this.riskfortSuccess.equals(other.getRiskfortSuccess())));
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
        if (getRiskfortSuccess() != null) {
            _hashCode += getRiskfortSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteAssociationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskfortSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "riskfortSuccess"));
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
