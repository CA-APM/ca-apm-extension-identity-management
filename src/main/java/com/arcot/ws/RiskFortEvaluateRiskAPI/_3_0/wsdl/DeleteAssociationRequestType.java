/**
 * DeleteAssociationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class DeleteAssociationRequestType  implements java.io.Serializable {
    /* Identifier passed by the application to co-relate multiple
     * API calls. */
    private java.lang.String callerId;

    /* User Contextual Information. */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext;

    /* Descriptive name for an association of a
     * 								user with a device. */
    private java.lang.String associationName;

    /* AdminContext defination */
    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType;

    private com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput;

    public DeleteAssociationRequestType() {
    }

    public DeleteAssociationRequestType(
           java.lang.String callerId,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext,
           java.lang.String associationName,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType,
           com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] additionalInput) {
           this.callerId = callerId;
           this.userContext = userContext;
           this.associationName = associationName;
           this.adminContextType = adminContextType;
           this.additionalInput = additionalInput;
    }


    /**
     * Gets the callerId value for this DeleteAssociationRequestType.
     * 
     * @return callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public java.lang.String getCallerId() {
        return callerId;
    }


    /**
     * Sets the callerId value for this DeleteAssociationRequestType.
     * 
     * @param callerId   * Identifier passed by the application to co-relate multiple
     * API calls.
     */
    public void setCallerId(java.lang.String callerId) {
        this.callerId = callerId;
    }


    /**
     * Gets the userContext value for this DeleteAssociationRequestType.
     * 
     * @return userContext   * User Contextual Information.
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType getUserContext() {
        return userContext;
    }


    /**
     * Sets the userContext value for this DeleteAssociationRequestType.
     * 
     * @param userContext   * User Contextual Information.
     */
    public void setUserContext(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType userContext) {
        this.userContext = userContext;
    }


    /**
     * Gets the associationName value for this DeleteAssociationRequestType.
     * 
     * @return associationName   * Descriptive name for an association of a
     * 								user with a device.
     */
    public java.lang.String getAssociationName() {
        return associationName;
    }


    /**
     * Sets the associationName value for this DeleteAssociationRequestType.
     * 
     * @param associationName   * Descriptive name for an association of a
     * 								user with a device.
     */
    public void setAssociationName(java.lang.String associationName) {
        this.associationName = associationName;
    }


    /**
     * Gets the adminContextType value for this DeleteAssociationRequestType.
     * 
     * @return adminContextType   * AdminContext defination
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType getAdminContextType() {
        return adminContextType;
    }


    /**
     * Sets the adminContextType value for this DeleteAssociationRequestType.
     * 
     * @param adminContextType   * AdminContext defination
     */
    public void setAdminContextType(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType adminContextType) {
        this.adminContextType = adminContextType;
    }


    /**
     * Gets the additionalInput value for this DeleteAssociationRequestType.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this DeleteAssociationRequestType.
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
        if (!(obj instanceof DeleteAssociationRequestType)) return false;
        DeleteAssociationRequestType other = (DeleteAssociationRequestType) obj;
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
            ((this.userContext==null && other.getUserContext()==null) || 
             (this.userContext!=null &&
              this.userContext.equals(other.getUserContext()))) &&
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
        if (getUserContext() != null) {
            _hashCode += getUserContext().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(DeleteAssociationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "callerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "userContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserContextType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "associationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
