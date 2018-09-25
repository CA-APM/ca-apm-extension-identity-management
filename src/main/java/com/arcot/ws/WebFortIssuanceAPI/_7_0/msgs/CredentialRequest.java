/**
 * CredentialRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class CredentialRequest  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceRequestType  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String orgName;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDInputType arcotIDInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPInputType otpInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPInputType oathInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPInputType arcotOTPInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVInputType emvInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAInputType qnaInput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPInputType upInput;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput;

    public CredentialRequest() {
    }

    public CredentialRequest(
           java.lang.String clientTxnId,
           java.lang.String userName,
           java.lang.String orgName,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDInputType arcotIDInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPInputType otpInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPInputType oathInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPInputType arcotOTPInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVInputType emvInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAInputType qnaInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPInputType upInput,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        super(
            clientTxnId);
        this.userName = userName;
        this.orgName = orgName;
        this.arcotIDInput = arcotIDInput;
        this.otpInput = otpInput;
        this.oathInput = oathInput;
        this.arcotOTPInput = arcotOTPInput;
        this.emvInput = emvInput;
        this.qnaInput = qnaInput;
        this.upInput = upInput;
        this.additionalInput = additionalInput;
    }


    /**
     * Gets the userName value for this CredentialRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CredentialRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the orgName value for this CredentialRequest.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this CredentialRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the arcotIDInput value for this CredentialRequest.
     * 
     * @return arcotIDInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDInputType getArcotIDInput() {
        return arcotIDInput;
    }


    /**
     * Sets the arcotIDInput value for this CredentialRequest.
     * 
     * @param arcotIDInput
     */
    public void setArcotIDInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDInputType arcotIDInput) {
        this.arcotIDInput = arcotIDInput;
    }


    /**
     * Gets the otpInput value for this CredentialRequest.
     * 
     * @return otpInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPInputType getOtpInput() {
        return otpInput;
    }


    /**
     * Sets the otpInput value for this CredentialRequest.
     * 
     * @param otpInput
     */
    public void setOtpInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPInputType otpInput) {
        this.otpInput = otpInput;
    }


    /**
     * Gets the oathInput value for this CredentialRequest.
     * 
     * @return oathInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPInputType getOathInput() {
        return oathInput;
    }


    /**
     * Sets the oathInput value for this CredentialRequest.
     * 
     * @param oathInput
     */
    public void setOathInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPInputType oathInput) {
        this.oathInput = oathInput;
    }


    /**
     * Gets the arcotOTPInput value for this CredentialRequest.
     * 
     * @return arcotOTPInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPInputType getArcotOTPInput() {
        return arcotOTPInput;
    }


    /**
     * Sets the arcotOTPInput value for this CredentialRequest.
     * 
     * @param arcotOTPInput
     */
    public void setArcotOTPInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPInputType arcotOTPInput) {
        this.arcotOTPInput = arcotOTPInput;
    }


    /**
     * Gets the emvInput value for this CredentialRequest.
     * 
     * @return emvInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVInputType getEmvInput() {
        return emvInput;
    }


    /**
     * Sets the emvInput value for this CredentialRequest.
     * 
     * @param emvInput
     */
    public void setEmvInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVInputType emvInput) {
        this.emvInput = emvInput;
    }


    /**
     * Gets the qnaInput value for this CredentialRequest.
     * 
     * @return qnaInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAInputType getQnaInput() {
        return qnaInput;
    }


    /**
     * Sets the qnaInput value for this CredentialRequest.
     * 
     * @param qnaInput
     */
    public void setQnaInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAInputType qnaInput) {
        this.qnaInput = qnaInput;
    }


    /**
     * Gets the upInput value for this CredentialRequest.
     * 
     * @return upInput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPInputType getUpInput() {
        return upInput;
    }


    /**
     * Sets the upInput value for this CredentialRequest.
     * 
     * @param upInput
     */
    public void setUpInput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPInputType upInput) {
        this.upInput = upInput;
    }


    /**
     * Gets the additionalInput value for this CredentialRequest.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this CredentialRequest.
     * 
     * @param additionalInput
     */
    public void setAdditionalInput(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        this.additionalInput = additionalInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialRequest)) return false;
        CredentialRequest other = (CredentialRequest) obj;
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
            ((this.arcotIDInput==null && other.getArcotIDInput()==null) || 
             (this.arcotIDInput!=null &&
              this.arcotIDInput.equals(other.getArcotIDInput()))) &&
            ((this.otpInput==null && other.getOtpInput()==null) || 
             (this.otpInput!=null &&
              this.otpInput.equals(other.getOtpInput()))) &&
            ((this.oathInput==null && other.getOathInput()==null) || 
             (this.oathInput!=null &&
              this.oathInput.equals(other.getOathInput()))) &&
            ((this.arcotOTPInput==null && other.getArcotOTPInput()==null) || 
             (this.arcotOTPInput!=null &&
              this.arcotOTPInput.equals(other.getArcotOTPInput()))) &&
            ((this.emvInput==null && other.getEmvInput()==null) || 
             (this.emvInput!=null &&
              this.emvInput.equals(other.getEmvInput()))) &&
            ((this.qnaInput==null && other.getQnaInput()==null) || 
             (this.qnaInput!=null &&
              this.qnaInput.equals(other.getQnaInput()))) &&
            ((this.upInput==null && other.getUpInput()==null) || 
             (this.upInput!=null &&
              this.upInput.equals(other.getUpInput()))) &&
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
        if (getArcotIDInput() != null) {
            _hashCode += getArcotIDInput().hashCode();
        }
        if (getOtpInput() != null) {
            _hashCode += getOtpInput().hashCode();
        }
        if (getOathInput() != null) {
            _hashCode += getOathInput().hashCode();
        }
        if (getArcotOTPInput() != null) {
            _hashCode += getArcotOTPInput().hashCode();
        }
        if (getEmvInput() != null) {
            _hashCode += getEmvInput().hashCode();
        }
        if (getQnaInput() != null) {
            _hashCode += getQnaInput().hashCode();
        }
        if (getUpInput() != null) {
            _hashCode += getUpInput().hashCode();
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
        new org.apache.axis.description.TypeDesc(CredentialRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "arcotIDInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "otpInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OTPInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "oathInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OATHOTPInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "arcotOTPInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotOTPInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "emvInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "EMVInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "qnaInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "upInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "UPInputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "additionalInput"));
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
