/**
 * FetchOATHTokensResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs;

public class FetchOATHTokensResponse  extends com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BaseBulkOperationsResponseType  implements java.io.Serializable {
    private com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType[] tokenInfo;

    public FetchOATHTokensResponse() {
    }

    public FetchOATHTokensResponse(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails,
           com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType[] tokenInfo) {
        super(
            transactionDetails);
        this.tokenInfo = tokenInfo;
    }


    /**
     * Gets the tokenInfo value for this FetchOATHTokensResponse.
     * 
     * @return tokenInfo
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType[] getTokenInfo() {
        return tokenInfo;
    }


    /**
     * Sets the tokenInfo value for this FetchOATHTokensResponse.
     * 
     * @param tokenInfo
     */
    public void setTokenInfo(com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType[] tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType getTokenInfo(int i) {
        return this.tokenInfo[i];
    }

    public void setTokenInfo(int i, com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.OATHTokenInfoType _value) {
        this.tokenInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchOATHTokensResponse)) return false;
        FetchOATHTokensResponse other = (FetchOATHTokensResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenInfo==null && other.getTokenInfo()==null) || 
             (this.tokenInfo!=null &&
              java.util.Arrays.equals(this.tokenInfo, other.getTokenInfo())));
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
        if (getTokenInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokenInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokenInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FetchOATHTokensResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "tokenInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "OATHTokenInfoType"));
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
