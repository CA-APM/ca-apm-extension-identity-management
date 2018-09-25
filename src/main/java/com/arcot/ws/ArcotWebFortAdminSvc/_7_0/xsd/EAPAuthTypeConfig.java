/**
 * EAPAuthTypeConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * "Configuration elements for EAP authentication."
 */
public class EAPAuthTypeConfig  implements java.io.Serializable {
    /* Server certificate and password. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair serverCertKeyPair;

    public EAPAuthTypeConfig() {
    }

    public EAPAuthTypeConfig(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair serverCertKeyPair) {
           this.serverCertKeyPair = serverCertKeyPair;
    }


    /**
     * Gets the serverCertKeyPair value for this EAPAuthTypeConfig.
     * 
     * @return serverCertKeyPair   * Server certificate and password.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair getServerCertKeyPair() {
        return serverCertKeyPair;
    }


    /**
     * Sets the serverCertKeyPair value for this EAPAuthTypeConfig.
     * 
     * @param serverCertKeyPair   * Server certificate and password.
     */
    public void setServerCertKeyPair(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair serverCertKeyPair) {
        this.serverCertKeyPair = serverCertKeyPair;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EAPAuthTypeConfig)) return false;
        EAPAuthTypeConfig other = (EAPAuthTypeConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverCertKeyPair==null && other.getServerCertKeyPair()==null) || 
             (this.serverCertKeyPair!=null &&
              this.serverCertKeyPair.equals(other.getServerCertKeyPair())));
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
        if (getServerCertKeyPair() != null) {
            _hashCode += getServerCertKeyPair().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EAPAuthTypeConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EAPAuthTypeConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverCertKeyPair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverCertKeyPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair"));
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
