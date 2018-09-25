/**
 * ArcotIDKeyBagAddElementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class ArcotIDKeyBagAddElementsResponse  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails[] certificates;

    public ArcotIDKeyBagAddElementsResponse() {
    }

    public ArcotIDKeyBagAddElementsResponse(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails[] certificates) {
           this.transactionDetails = transactionDetails;
           this.certificates = certificates;
    }


    /**
     * Gets the transactionDetails value for this ArcotIDKeyBagAddElementsResponse.
     * 
     * @return transactionDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType getTransactionDetails() {
        return transactionDetails;
    }


    /**
     * Sets the transactionDetails value for this ArcotIDKeyBagAddElementsResponse.
     * 
     * @param transactionDetails
     */
    public void setTransactionDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails) {
        this.transactionDetails = transactionDetails;
    }


    /**
     * Gets the certificates value for this ArcotIDKeyBagAddElementsResponse.
     * 
     * @return certificates
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails[] getCertificates() {
        return certificates;
    }


    /**
     * Sets the certificates value for this ArcotIDKeyBagAddElementsResponse.
     * 
     * @param certificates
     */
    public void setCertificates(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails[] certificates) {
        this.certificates = certificates;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails getCertificates(int i) {
        return this.certificates[i];
    }

    public void setCertificates(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagCertAndDetails _value) {
        this.certificates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagAddElementsResponse)) return false;
        ArcotIDKeyBagAddElementsResponse other = (ArcotIDKeyBagAddElementsResponse) obj;
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
              this.transactionDetails.equals(other.getTransactionDetails()))) &&
            ((this.certificates==null && other.getCertificates()==null) || 
             (this.certificates!=null &&
              java.util.Arrays.equals(this.certificates, other.getCertificates())));
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
        if (getCertificates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificates(), i);
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
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagAddElementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "transactionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "TransactionDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "certificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertAndDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
