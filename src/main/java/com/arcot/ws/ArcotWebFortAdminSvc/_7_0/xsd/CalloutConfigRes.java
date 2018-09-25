/**
 * CalloutConfigRes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * CalloutConfigRes is the structure used to
 * 				represent
 * 				callout response configuration.
 */
public class CalloutConfigRes  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig  implements java.io.Serializable {
    /* Server certificate details. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails serverCertDetails;

    /* Client certificate details. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails clientCertDetails;

    public CalloutConfigRes() {
    }

    public CalloutConfigRes(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.String transport,
           java.lang.String host,
           java.lang.Integer port,
           java.lang.String uri,
           java.lang.Integer connectionTimeout,
           java.lang.Integer readTimeout,
           java.lang.Integer idleTimeout,
           java.lang.Integer minConnections,
           java.lang.Integer maxConnections,
           java.lang.String serverRootCACert,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair clientCertKeyPair,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ExtModuleEvents events,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails serverCertDetails,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails clientCertDetails) {
        super(
            name,
            status,
            transport,
            host,
            port,
            uri,
            connectionTimeout,
            readTimeout,
            idleTimeout,
            minConnections,
            maxConnections,
            serverRootCACert,
            clientCertKeyPair,
            events);
        this.serverCertDetails = serverCertDetails;
        this.clientCertDetails = clientCertDetails;
    }


    /**
     * Gets the serverCertDetails value for this CalloutConfigRes.
     * 
     * @return serverCertDetails   * Server certificate details.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails getServerCertDetails() {
        return serverCertDetails;
    }


    /**
     * Sets the serverCertDetails value for this CalloutConfigRes.
     * 
     * @param serverCertDetails   * Server certificate details.
     */
    public void setServerCertDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails serverCertDetails) {
        this.serverCertDetails = serverCertDetails;
    }


    /**
     * Gets the clientCertDetails value for this CalloutConfigRes.
     * 
     * @return clientCertDetails   * Client certificate details.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails getClientCertDetails() {
        return clientCertDetails;
    }


    /**
     * Sets the clientCertDetails value for this CalloutConfigRes.
     * 
     * @param clientCertDetails   * Client certificate details.
     */
    public void setClientCertDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails clientCertDetails) {
        this.clientCertDetails = clientCertDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalloutConfigRes)) return false;
        CalloutConfigRes other = (CalloutConfigRes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serverCertDetails==null && other.getServerCertDetails()==null) || 
             (this.serverCertDetails!=null &&
              this.serverCertDetails.equals(other.getServerCertDetails()))) &&
            ((this.clientCertDetails==null && other.getClientCertDetails()==null) || 
             (this.clientCertDetails!=null &&
              this.clientCertDetails.equals(other.getClientCertDetails())));
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
        if (getServerCertDetails() != null) {
            _hashCode += getServerCertDetails().hashCode();
        }
        if (getClientCertDetails() != null) {
            _hashCode += getClientCertDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalloutConfigRes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CalloutConfigRes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverCertDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverCertDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCertDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "clientCertDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
