/**
 * TransactionDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * This type encapsulates the details associated
 * 				with
 * 				the transaction, such as response code,
 * 				reason code, a unique
 * 				transaction identifier,
 * 				localized transaction message, and so on.
 */
public class TransactionDetailsType  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.ResponseDetails  implements java.io.Serializable {
    private java.lang.String transactionID;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput;

    public TransactionDetailsType() {
    }

    public TransactionDetailsType(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String transactionID,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput) {
        super(
            message,
            reasonCode,
            responseCode);
        this.transactionID = transactionID;
        this.additionalOutput = additionalOutput;
    }


    /**
     * Gets the transactionID value for this TransactionDetailsType.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this TransactionDetailsType.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the additionalOutput value for this TransactionDetailsType.
     * 
     * @return additionalOutput
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getAdditionalOutput() {
        return additionalOutput;
    }


    /**
     * Sets the additionalOutput value for this TransactionDetailsType.
     * 
     * @param additionalOutput
     */
    public void setAdditionalOutput(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput) {
        this.additionalOutput = additionalOutput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionDetailsType)) return false;
        TransactionDetailsType other = (TransactionDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
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
        int _hashCode = super.hashCode();
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
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
        new org.apache.axis.description.TypeDesc(TransactionDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "additionalOutput"));
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
