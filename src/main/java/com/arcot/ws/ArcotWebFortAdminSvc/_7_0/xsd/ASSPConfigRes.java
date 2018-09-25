/**
 * ASSPConfigRes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ASSPConfigResp is the structure used to represent
 * 				ASSP configuration response.
 */
public class ASSPConfigRes  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig  implements java.io.Serializable {
    /* Certificate details. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certDetails;

    public ASSPConfigRes() {
    }

    public ASSPConfigRes(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.String tokenServer,
           java.lang.String roamingURL,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanismList mechanisms,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair samlTokenSigningCertKeyPair,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes,
           java.lang.Boolean kerberosUseProcessCredentials,
           java.lang.String kerberosUserName,
           java.lang.String kerberosPassword,
           java.lang.String kerberosDomainName,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certDetails) {
        super(
            name,
            status,
            tokenServer,
            roamingURL,
            mechanisms,
            samlTokenSigningCertKeyPair,
            samlTokenAttributes,
            kerberosUseProcessCredentials,
            kerberosUserName,
            kerberosPassword,
            kerberosDomainName);
        this.certDetails = certDetails;
    }


    /**
     * Gets the certDetails value for this ASSPConfigRes.
     * 
     * @return certDetails   * Certificate details.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails getCertDetails() {
        return certDetails;
    }


    /**
     * Sets the certDetails value for this ASSPConfigRes.
     * 
     * @param certDetails   * Certificate details.
     */
    public void setCertDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertificateDetails certDetails) {
        this.certDetails = certDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASSPConfigRes)) return false;
        ASSPConfigRes other = (ASSPConfigRes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.certDetails==null && other.getCertDetails()==null) || 
             (this.certDetails!=null &&
              this.certDetails.equals(other.getCertDetails())));
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
        if (getCertDetails() != null) {
            _hashCode += getCertDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASSPConfigRes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPConfigRes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "certDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertificateDetails"));
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
