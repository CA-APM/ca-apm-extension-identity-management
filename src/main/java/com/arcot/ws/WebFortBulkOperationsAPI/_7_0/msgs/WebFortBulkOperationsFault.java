/**
 * WebFortBulkOperationsFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs;

public class WebFortBulkOperationsFault  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.WebFortFault  implements java.io.Serializable {
    private com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.AssignCredentialsRequestType errCredmgmt;

    public WebFortBulkOperationsFault() {
    }

    public WebFortBulkOperationsFault(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String transactionID,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput,
           java.lang.String paramName,
           com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.AssignCredentialsRequestType errCredmgmt) {
        super(
            message,
            reasonCode,
            responseCode,
            transactionID,
            additionalOutput,
            paramName);
        this.errCredmgmt = errCredmgmt;
    }


    /**
     * Gets the errCredmgmt value for this WebFortBulkOperationsFault.
     * 
     * @return errCredmgmt
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.AssignCredentialsRequestType getErrCredmgmt() {
        return errCredmgmt;
    }


    /**
     * Sets the errCredmgmt value for this WebFortBulkOperationsFault.
     * 
     * @param errCredmgmt
     */
    public void setErrCredmgmt(com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.AssignCredentialsRequestType errCredmgmt) {
        this.errCredmgmt = errCredmgmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebFortBulkOperationsFault)) return false;
        WebFortBulkOperationsFault other = (WebFortBulkOperationsFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errCredmgmt==null && other.getErrCredmgmt()==null) || 
             (this.errCredmgmt!=null &&
              this.errCredmgmt.equals(other.getErrCredmgmt())));
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
        if (getErrCredmgmt() != null) {
            _hashCode += getErrCredmgmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebFortBulkOperationsFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">WebFortBulkOperationsFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errCredmgmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "errCredmgmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "AssignCredentialsRequestType"));
        elemField.setMinOccurs(0);
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
