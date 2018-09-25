/**
 * ArcotIDKeyBagDeleteElementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class ArcotIDKeyBagDeleteElementsResponse  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails;

    public ArcotIDKeyBagDeleteElementsResponse() {
    }

    public ArcotIDKeyBagDeleteElementsResponse(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
           this.transactionDetails = transactionDetails;
    }


    /**
     * Gets the transactionDetails value for this ArcotIDKeyBagDeleteElementsResponse.
     * 
     * @return transactionDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType getTransactionDetails() {
        return transactionDetails;
    }


    /**
     * Sets the transactionDetails value for this ArcotIDKeyBagDeleteElementsResponse.
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagDeleteElementsResponse)) return false;
        ArcotIDKeyBagDeleteElementsResponse other = (ArcotIDKeyBagDeleteElementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        int _hashCode = 1;
        if (getTransactionDetails() != null) {
            _hashCode += getTransactionDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagDeleteElementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
