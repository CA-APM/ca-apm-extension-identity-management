/**
 * ListAssociationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class ListAssociationResponseType  implements java.io.Serializable {
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType[] association;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess;

    public ListAssociationResponseType() {
    }

    public ListAssociationResponseType(
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType[] association,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
           this.association = association;
           this.riskFortSuccess = riskFortSuccess;
    }


    /**
     * Gets the association value for this ListAssociationResponseType.
     * 
     * @return association
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType[] getAssociation() {
        return association;
    }


    /**
     * Sets the association value for this ListAssociationResponseType.
     * 
     * @param association
     */
    public void setAssociation(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType[] association) {
        this.association = association;
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType getAssociation(int i) {
        return this.association[i];
    }

    public void setAssociation(int i, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType _value) {
        this.association[i] = _value;
    }


    /**
     * Gets the riskFortSuccess value for this ListAssociationResponseType.
     * 
     * @return riskFortSuccess
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess getRiskFortSuccess() {
        return riskFortSuccess;
    }


    /**
     * Sets the riskFortSuccess value for this ListAssociationResponseType.
     * 
     * @param riskFortSuccess
     */
    public void setRiskFortSuccess(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess riskFortSuccess) {
        this.riskFortSuccess = riskFortSuccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListAssociationResponseType)) return false;
        ListAssociationResponseType other = (ListAssociationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.association==null && other.getAssociation()==null) || 
             (this.association!=null &&
              java.util.Arrays.equals(this.association, other.getAssociation()))) &&
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
        if (getAssociation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRiskFortSuccess() != null) {
            _hashCode += getRiskFortSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListAssociationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("association");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "association"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserDeviceAssociationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
