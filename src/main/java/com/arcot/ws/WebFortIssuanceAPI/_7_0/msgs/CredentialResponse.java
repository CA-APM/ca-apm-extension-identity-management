/**
 * CredentialResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class CredentialResponse  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceResponseType  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDOutputType arcotIDOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPOutputType otpOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPOutputType oathOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPOutputType arcotOTPOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVOutputType emvOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAOutputType qnaOutput;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPOutputType upOutput;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails;

    public CredentialResponse() {
    }

    public CredentialResponse(
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDOutputType arcotIDOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPOutputType otpOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPOutputType oathOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPOutputType arcotOTPOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVOutputType emvOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAOutputType qnaOutput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPOutputType upOutput,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.arcotIDOutput = arcotIDOutput;
        this.otpOutput = otpOutput;
        this.oathOutput = oathOutput;
        this.arcotOTPOutput = arcotOTPOutput;
        this.emvOutput = emvOutput;
        this.qnaOutput = qnaOutput;
        this.upOutput = upOutput;
        this.transactionDetails = transactionDetails;
    }


    /**
     * Gets the arcotIDOutput value for this CredentialResponse.
     * 
     * @return arcotIDOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDOutputType getArcotIDOutput() {
        return arcotIDOutput;
    }


    /**
     * Sets the arcotIDOutput value for this CredentialResponse.
     * 
     * @param arcotIDOutput
     */
    public void setArcotIDOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDOutputType arcotIDOutput) {
        this.arcotIDOutput = arcotIDOutput;
    }


    /**
     * Gets the otpOutput value for this CredentialResponse.
     * 
     * @return otpOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPOutputType getOtpOutput() {
        return otpOutput;
    }


    /**
     * Sets the otpOutput value for this CredentialResponse.
     * 
     * @param otpOutput
     */
    public void setOtpOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OTPOutputType otpOutput) {
        this.otpOutput = otpOutput;
    }


    /**
     * Gets the oathOutput value for this CredentialResponse.
     * 
     * @return oathOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPOutputType getOathOutput() {
        return oathOutput;
    }


    /**
     * Sets the oathOutput value for this CredentialResponse.
     * 
     * @param oathOutput
     */
    public void setOathOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.OATHOTPOutputType oathOutput) {
        this.oathOutput = oathOutput;
    }


    /**
     * Gets the arcotOTPOutput value for this CredentialResponse.
     * 
     * @return arcotOTPOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPOutputType getArcotOTPOutput() {
        return arcotOTPOutput;
    }


    /**
     * Sets the arcotOTPOutput value for this CredentialResponse.
     * 
     * @param arcotOTPOutput
     */
    public void setArcotOTPOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotOTPOutputType arcotOTPOutput) {
        this.arcotOTPOutput = arcotOTPOutput;
    }


    /**
     * Gets the emvOutput value for this CredentialResponse.
     * 
     * @return emvOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVOutputType getEmvOutput() {
        return emvOutput;
    }


    /**
     * Sets the emvOutput value for this CredentialResponse.
     * 
     * @param emvOutput
     */
    public void setEmvOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.EMVOutputType emvOutput) {
        this.emvOutput = emvOutput;
    }


    /**
     * Gets the qnaOutput value for this CredentialResponse.
     * 
     * @return qnaOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAOutputType getQnaOutput() {
        return qnaOutput;
    }


    /**
     * Sets the qnaOutput value for this CredentialResponse.
     * 
     * @param qnaOutput
     */
    public void setQnaOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAOutputType qnaOutput) {
        this.qnaOutput = qnaOutput;
    }


    /**
     * Gets the upOutput value for this CredentialResponse.
     * 
     * @return upOutput
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPOutputType getUpOutput() {
        return upOutput;
    }


    /**
     * Sets the upOutput value for this CredentialResponse.
     * 
     * @param upOutput
     */
    public void setUpOutput(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.UPOutputType upOutput) {
        this.upOutput = upOutput;
    }


    /**
     * Gets the transactionDetails value for this CredentialResponse.
     * 
     * @return transactionDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType getTransactionDetails() {
        return transactionDetails;
    }


    /**
     * Sets the transactionDetails value for this CredentialResponse.
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialResponse)) return false;
        CredentialResponse other = (CredentialResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.arcotIDOutput==null && other.getArcotIDOutput()==null) || 
             (this.arcotIDOutput!=null &&
              this.arcotIDOutput.equals(other.getArcotIDOutput()))) &&
            ((this.otpOutput==null && other.getOtpOutput()==null) || 
             (this.otpOutput!=null &&
              this.otpOutput.equals(other.getOtpOutput()))) &&
            ((this.oathOutput==null && other.getOathOutput()==null) || 
             (this.oathOutput!=null &&
              this.oathOutput.equals(other.getOathOutput()))) &&
            ((this.arcotOTPOutput==null && other.getArcotOTPOutput()==null) || 
             (this.arcotOTPOutput!=null &&
              this.arcotOTPOutput.equals(other.getArcotOTPOutput()))) &&
            ((this.emvOutput==null && other.getEmvOutput()==null) || 
             (this.emvOutput!=null &&
              this.emvOutput.equals(other.getEmvOutput()))) &&
            ((this.qnaOutput==null && other.getQnaOutput()==null) || 
             (this.qnaOutput!=null &&
              this.qnaOutput.equals(other.getQnaOutput()))) &&
            ((this.upOutput==null && other.getUpOutput()==null) || 
             (this.upOutput!=null &&
              this.upOutput.equals(other.getUpOutput()))) &&
            ((this.transactionDetails==null && other.getTransactionDetails()==null) || 
             (this.transactionDetails!=null &&
              this.transactionDetails.equals(other.getTransactionDetails())));
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
        if (getArcotIDOutput() != null) {
            _hashCode += getArcotIDOutput().hashCode();
        }
        if (getOtpOutput() != null) {
            _hashCode += getOtpOutput().hashCode();
        }
        if (getOathOutput() != null) {
            _hashCode += getOathOutput().hashCode();
        }
        if (getArcotOTPOutput() != null) {
            _hashCode += getArcotOTPOutput().hashCode();
        }
        if (getEmvOutput() != null) {
            _hashCode += getEmvOutput().hashCode();
        }
        if (getQnaOutput() != null) {
            _hashCode += getQnaOutput().hashCode();
        }
        if (getUpOutput() != null) {
            _hashCode += getUpOutput().hashCode();
        }
        if (getTransactionDetails() != null) {
            _hashCode += getTransactionDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredentialResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "arcotIDOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "otpOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OTPOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "oathOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OATHOTPOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "arcotOTPOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotOTPOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "emvOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "EMVOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "qnaOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "upOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "UPOutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "transactionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType"));
        elemField.setNillable(false);
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
