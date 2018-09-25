/**
 * EvaluateRiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class EvaluateRiskRequestType  implements java.io.Serializable {
    /* Identifier passed by the application to co-relate multiple
     * API calls. */
    private java.lang.String callerId;

    /* Client device information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext;

    /* Client's geo-location information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext;

    /* User information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext;

    /* Client's transaction information information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext;

    /* AdminContext defination */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput;

    public EvaluateRiskRequestType() {
    }

    public EvaluateRiskRequestType(
           java.lang.String callerId,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput) {
           this.callerId = callerId;
           this.deviceContext = deviceContext;
           this.locationContext = locationContext;
           this.userContext = userContext;
           this.transactionContext = transactionContext;
           this.adminContextType = adminContextType;
           this.additionalInput = additionalInput;
    }


    /**
     * Gets the callerId value for this EvaluateRiskRequestType.
     * 
     * @return callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public java.lang.String getCallerId() {
        return callerId;
    }


    /**
     * Sets the callerId value for this EvaluateRiskRequestType.
     * 
     * @param callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public void setCallerId(java.lang.String callerId) {
        this.callerId = callerId;
    }


    /**
     * Gets the deviceContext value for this EvaluateRiskRequestType.
     * 
     * @return deviceContext   * Client device information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType getDeviceContext() {
        return deviceContext;
    }


    /**
     * Sets the deviceContext value for this EvaluateRiskRequestType.
     * 
     * @param deviceContext   * Client device information.
     */
    public void setDeviceContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType deviceContext) {
        this.deviceContext = deviceContext;
    }


    /**
     * Gets the locationContext value for this EvaluateRiskRequestType.
     * 
     * @return locationContext   * Client's geo-location information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType getLocationContext() {
        return locationContext;
    }


    /**
     * Sets the locationContext value for this EvaluateRiskRequestType.
     * 
     * @param locationContext   * Client's geo-location information.
     */
    public void setLocationContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType locationContext) {
        this.locationContext = locationContext;
    }


    /**
     * Gets the userContext value for this EvaluateRiskRequestType.
     * 
     * @return userContext   * User information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType getUserContext() {
        return userContext;
    }


    /**
     * Sets the userContext value for this EvaluateRiskRequestType.
     * 
     * @param userContext   * User information.
     */
    public void setUserContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext) {
        this.userContext = userContext;
    }


    /**
     * Gets the transactionContext value for this EvaluateRiskRequestType.
     * 
     * @return transactionContext   * Client's transaction information information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType getTransactionContext() {
        return transactionContext;
    }


    /**
     * Sets the transactionContext value for this EvaluateRiskRequestType.
     * 
     * @param transactionContext   * Client's transaction information information.
     */
    public void setTransactionContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType transactionContext) {
        this.transactionContext = transactionContext;
    }


    /**
     * Gets the adminContextType value for this EvaluateRiskRequestType.
     * 
     * @return adminContextType   * AdminContext defination
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType getAdminContextType() {
        return adminContextType;
    }


    /**
     * Sets the adminContextType value for this EvaluateRiskRequestType.
     * 
     * @param adminContextType   * AdminContext defination
     */
    public void setAdminContextType(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType) {
        this.adminContextType = adminContextType;
    }


    /**
     * Gets the additionalInput value for this EvaluateRiskRequestType.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this EvaluateRiskRequestType.
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
        if (!(obj instanceof EvaluateRiskRequestType)) return false;
        EvaluateRiskRequestType other = (EvaluateRiskRequestType) obj;
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
        new org.apache.axis.description.TypeDesc(EvaluateRiskRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "callerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeviceContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "locationContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "LocationContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "userContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserContextType"));
        elemField.setMinOccurs(0);
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
