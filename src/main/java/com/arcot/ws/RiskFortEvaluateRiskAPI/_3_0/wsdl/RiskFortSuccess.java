/**
 * RiskFortSuccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;


/**
 * RiskFortSuccess is an empty structure that defines
 * 						a successful response to a request. It is used
 * 						whenever a response message is only required to
 * 						indicate that the request was fulfilled.
 * 						Typically it is used in conjunction with
 * 						RiskFortFault which is handled as a fault message
 * 						instead of a response message.
 */
public class RiskFortSuccess  implements java.io.Serializable {
    /* Success message from RiskFort Server. */
    private java.lang.String successMessage;

    /* Transaction Identifier for this transaction. */
    private java.lang.String transactionID;

    public RiskFortSuccess() {
    }

    public RiskFortSuccess(
           java.lang.String successMessage,
           java.lang.String transactionID) {
           this.successMessage = successMessage;
           this.transactionID = transactionID;
    }


    /**
     * Gets the successMessage value for this RiskFortSuccess.
     * 
     * @return successMessage   * Success message from RiskFort Server.
     */
    public java.lang.String getSuccessMessage() {
        return successMessage;
    }


    /**
     * Sets the successMessage value for this RiskFortSuccess.
     * 
     * @param successMessage   * Success message from RiskFort Server.
     */
    public void setSuccessMessage(java.lang.String successMessage) {
        this.successMessage = successMessage;
    }


    /**
     * Gets the transactionID value for this RiskFortSuccess.
     * 
     * @return transactionID   * Transaction Identifier for this transaction.
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RiskFortSuccess.
     * 
     * @param transactionID   * Transaction Identifier for this transaction.
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskFortSuccess)) return false;
        RiskFortSuccess other = (RiskFortSuccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.successMessage==null && other.getSuccessMessage()==null) || 
             (this.successMessage!=null &&
              this.successMessage.equals(other.getSuccessMessage()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID())));
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
        if (getSuccessMessage() != null) {
            _hashCode += getSuccessMessage().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskFortSuccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskFortSuccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "successMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
