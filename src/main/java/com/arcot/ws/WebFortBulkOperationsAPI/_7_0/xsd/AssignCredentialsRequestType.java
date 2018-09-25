/**
 * AssignCredentialsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Request object used in AssignCredentials.
 */
public class AssignCredentialsRequestType  extends com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BaseBulkOperationsRequestType  implements java.io.Serializable {
    private com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkCredentialsType bulkCredentials;

    public AssignCredentialsRequestType() {
    }

    public AssignCredentialsRequestType(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkCredentialsType bulkCredentials) {
        super(
            clientTxnId,
            additionalInput);
        this.bulkCredentials = bulkCredentials;
    }


    /**
     * Gets the bulkCredentials value for this AssignCredentialsRequestType.
     * 
     * @return bulkCredentials
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkCredentialsType getBulkCredentials() {
        return bulkCredentials;
    }


    /**
     * Sets the bulkCredentials value for this AssignCredentialsRequestType.
     * 
     * @param bulkCredentials
     */
    public void setBulkCredentials(com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BulkCredentialsType bulkCredentials) {
        this.bulkCredentials = bulkCredentials;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignCredentialsRequestType)) return false;
        AssignCredentialsRequestType other = (AssignCredentialsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bulkCredentials==null && other.getBulkCredentials()==null) || 
             (this.bulkCredentials!=null &&
              this.bulkCredentials.equals(other.getBulkCredentials())));
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
        if (getBulkCredentials() != null) {
            _hashCode += getBulkCredentials().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignCredentialsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "AssignCredentialsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "bulkCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "BulkCredentialsType"));
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
