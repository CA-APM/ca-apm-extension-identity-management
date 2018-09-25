/**
 * CredContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFCredMgmt._7_0;


/**
 * Single credential object.
 */
public class CredContainer  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest credentialRequest;

    /* Will be used by webfort when generating the
     * 						failed credentials file, for giving the
     * 						failure details. It is
     * 						ignored in input. So that
     * 						the generated output can directly be fed
     * 						for retry. */
    private com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.WebFortIssuanceFault webFortIssuanceFault;

    public CredContainer() {
    }

    public CredContainer(
           com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest credentialRequest,
           com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.WebFortIssuanceFault webFortIssuanceFault) {
           this.credentialRequest = credentialRequest;
           this.webFortIssuanceFault = webFortIssuanceFault;
    }


    /**
     * Gets the credentialRequest value for this CredContainer.
     * 
     * @return credentialRequest
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest getCredentialRequest() {
        return credentialRequest;
    }


    /**
     * Sets the credentialRequest value for this CredContainer.
     * 
     * @param credentialRequest
     */
    public void setCredentialRequest(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.CredentialRequest credentialRequest) {
        this.credentialRequest = credentialRequest;
    }


    /**
     * Gets the webFortIssuanceFault value for this CredContainer.
     * 
     * @return webFortIssuanceFault   * Will be used by webfort when generating the
     * 						failed credentials file, for giving the
     * 						failure details. It is
     * 						ignored in input. So that
     * 						the generated output can directly be fed
     * 						for retry.
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.WebFortIssuanceFault getWebFortIssuanceFault() {
        return webFortIssuanceFault;
    }


    /**
     * Sets the webFortIssuanceFault value for this CredContainer.
     * 
     * @param webFortIssuanceFault   * Will be used by webfort when generating the
     * 						failed credentials file, for giving the
     * 						failure details. It is
     * 						ignored in input. So that
     * 						the generated output can directly be fed
     * 						for retry.
     */
    public void setWebFortIssuanceFault(com.arcot.ws.WebFortIssuanceAPI._7_0.msgs.WebFortIssuanceFault webFortIssuanceFault) {
        this.webFortIssuanceFault = webFortIssuanceFault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredContainer)) return false;
        CredContainer other = (CredContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credentialRequest==null && other.getCredentialRequest()==null) || 
             (this.credentialRequest!=null &&
              this.credentialRequest.equals(other.getCredentialRequest()))) &&
            ((this.webFortIssuanceFault==null && other.getWebFortIssuanceFault()==null) || 
             (this.webFortIssuanceFault!=null &&
              this.webFortIssuanceFault.equals(other.getWebFortIssuanceFault())));
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
        if (getCredentialRequest() != null) {
            _hashCode += getCredentialRequest().hashCode();
        }
        if (getWebFortIssuanceFault() != null) {
            _hashCode += getWebFortIssuanceFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFCredMgmt/7.0", "CredContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "CredentialRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">CredentialRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webFortIssuanceFault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "WebFortIssuanceFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">WebFortIssuanceFault"));
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
