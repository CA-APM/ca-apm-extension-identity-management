/**
 * ASSPConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ASSPConfig is the structure used to represent
 * 				ASSP
 * 				configuration.
 */
public class ASSPConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Token server name. */
    private java.lang.String tokenServer;

    /* Roaming URL. */
    private java.lang.String roamingURL;

    /* Mechanisms information that are used by ASSP. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanismList mechanisms;

    /* SAML token signing certificate and key
     * 								information. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair samlTokenSigningCertKeyPair;

    /* SAML token attributes. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes;

    /* Flag that indicates the kerberos use process
     * 								credentials. */
    private java.lang.Boolean kerberosUseProcessCredentials;

    /* Kerberos user name. */
    private java.lang.String kerberosUserName;

    /* Kerberos user password. */
    private java.lang.String kerberosPassword;

    /* Kerberos domain name. */
    private java.lang.String kerberosDomainName;

    public ASSPConfig() {
    }

    public ASSPConfig(
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
           java.lang.String kerberosDomainName) {
        super(
            name,
            status);
        this.tokenServer = tokenServer;
        this.roamingURL = roamingURL;
        this.mechanisms = mechanisms;
        this.samlTokenSigningCertKeyPair = samlTokenSigningCertKeyPair;
        this.samlTokenAttributes = samlTokenAttributes;
        this.kerberosUseProcessCredentials = kerberosUseProcessCredentials;
        this.kerberosUserName = kerberosUserName;
        this.kerberosPassword = kerberosPassword;
        this.kerberosDomainName = kerberosDomainName;
    }


    /**
     * Gets the tokenServer value for this ASSPConfig.
     * 
     * @return tokenServer   * Token server name.
     */
    public java.lang.String getTokenServer() {
        return tokenServer;
    }


    /**
     * Sets the tokenServer value for this ASSPConfig.
     * 
     * @param tokenServer   * Token server name.
     */
    public void setTokenServer(java.lang.String tokenServer) {
        this.tokenServer = tokenServer;
    }


    /**
     * Gets the roamingURL value for this ASSPConfig.
     * 
     * @return roamingURL   * Roaming URL.
     */
    public java.lang.String getRoamingURL() {
        return roamingURL;
    }


    /**
     * Sets the roamingURL value for this ASSPConfig.
     * 
     * @param roamingURL   * Roaming URL.
     */
    public void setRoamingURL(java.lang.String roamingURL) {
        this.roamingURL = roamingURL;
    }


    /**
     * Gets the mechanisms value for this ASSPConfig.
     * 
     * @return mechanisms   * Mechanisms information that are used by ASSP.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanismList getMechanisms() {
        return mechanisms;
    }


    /**
     * Sets the mechanisms value for this ASSPConfig.
     * 
     * @param mechanisms   * Mechanisms information that are used by ASSP.
     */
    public void setMechanisms(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPMechanismList mechanisms) {
        this.mechanisms = mechanisms;
    }


    /**
     * Gets the samlTokenSigningCertKeyPair value for this ASSPConfig.
     * 
     * @return samlTokenSigningCertKeyPair   * SAML token signing certificate and key
     * 								information.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair getSamlTokenSigningCertKeyPair() {
        return samlTokenSigningCertKeyPair;
    }


    /**
     * Sets the samlTokenSigningCertKeyPair value for this ASSPConfig.
     * 
     * @param samlTokenSigningCertKeyPair   * SAML token signing certificate and key
     * 								information.
     */
    public void setSamlTokenSigningCertKeyPair(com.arcot.ws.WebFortCommonAPI._7_0.xsd.CertKeyPair samlTokenSigningCertKeyPair) {
        this.samlTokenSigningCertKeyPair = samlTokenSigningCertKeyPair;
    }


    /**
     * Gets the samlTokenAttributes value for this ASSPConfig.
     * 
     * @return samlTokenAttributes   * SAML token attributes.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes getSamlTokenAttributes() {
        return samlTokenAttributes;
    }


    /**
     * Sets the samlTokenAttributes value for this ASSPConfig.
     * 
     * @param samlTokenAttributes   * SAML token attributes.
     */
    public void setSamlTokenAttributes(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenAttributes samlTokenAttributes) {
        this.samlTokenAttributes = samlTokenAttributes;
    }


    /**
     * Gets the kerberosUseProcessCredentials value for this ASSPConfig.
     * 
     * @return kerberosUseProcessCredentials   * Flag that indicates the kerberos use process
     * 								credentials.
     */
    public java.lang.Boolean getKerberosUseProcessCredentials() {
        return kerberosUseProcessCredentials;
    }


    /**
     * Sets the kerberosUseProcessCredentials value for this ASSPConfig.
     * 
     * @param kerberosUseProcessCredentials   * Flag that indicates the kerberos use process
     * 								credentials.
     */
    public void setKerberosUseProcessCredentials(java.lang.Boolean kerberosUseProcessCredentials) {
        this.kerberosUseProcessCredentials = kerberosUseProcessCredentials;
    }


    /**
     * Gets the kerberosUserName value for this ASSPConfig.
     * 
     * @return kerberosUserName   * Kerberos user name.
     */
    public java.lang.String getKerberosUserName() {
        return kerberosUserName;
    }


    /**
     * Sets the kerberosUserName value for this ASSPConfig.
     * 
     * @param kerberosUserName   * Kerberos user name.
     */
    public void setKerberosUserName(java.lang.String kerberosUserName) {
        this.kerberosUserName = kerberosUserName;
    }


    /**
     * Gets the kerberosPassword value for this ASSPConfig.
     * 
     * @return kerberosPassword   * Kerberos user password.
     */
    public java.lang.String getKerberosPassword() {
        return kerberosPassword;
    }


    /**
     * Sets the kerberosPassword value for this ASSPConfig.
     * 
     * @param kerberosPassword   * Kerberos user password.
     */
    public void setKerberosPassword(java.lang.String kerberosPassword) {
        this.kerberosPassword = kerberosPassword;
    }


    /**
     * Gets the kerberosDomainName value for this ASSPConfig.
     * 
     * @return kerberosDomainName   * Kerberos domain name.
     */
    public java.lang.String getKerberosDomainName() {
        return kerberosDomainName;
    }


    /**
     * Sets the kerberosDomainName value for this ASSPConfig.
     * 
     * @param kerberosDomainName   * Kerberos domain name.
     */
    public void setKerberosDomainName(java.lang.String kerberosDomainName) {
        this.kerberosDomainName = kerberosDomainName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASSPConfig)) return false;
        ASSPConfig other = (ASSPConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenServer==null && other.getTokenServer()==null) || 
             (this.tokenServer!=null &&
              this.tokenServer.equals(other.getTokenServer()))) &&
            ((this.roamingURL==null && other.getRoamingURL()==null) || 
             (this.roamingURL!=null &&
              this.roamingURL.equals(other.getRoamingURL()))) &&
            ((this.mechanisms==null && other.getMechanisms()==null) || 
             (this.mechanisms!=null &&
              this.mechanisms.equals(other.getMechanisms()))) &&
            ((this.samlTokenSigningCertKeyPair==null && other.getSamlTokenSigningCertKeyPair()==null) || 
             (this.samlTokenSigningCertKeyPair!=null &&
              this.samlTokenSigningCertKeyPair.equals(other.getSamlTokenSigningCertKeyPair()))) &&
            ((this.samlTokenAttributes==null && other.getSamlTokenAttributes()==null) || 
             (this.samlTokenAttributes!=null &&
              this.samlTokenAttributes.equals(other.getSamlTokenAttributes()))) &&
            ((this.kerberosUseProcessCredentials==null && other.getKerberosUseProcessCredentials()==null) || 
             (this.kerberosUseProcessCredentials!=null &&
              this.kerberosUseProcessCredentials.equals(other.getKerberosUseProcessCredentials()))) &&
            ((this.kerberosUserName==null && other.getKerberosUserName()==null) || 
             (this.kerberosUserName!=null &&
              this.kerberosUserName.equals(other.getKerberosUserName()))) &&
            ((this.kerberosPassword==null && other.getKerberosPassword()==null) || 
             (this.kerberosPassword!=null &&
              this.kerberosPassword.equals(other.getKerberosPassword()))) &&
            ((this.kerberosDomainName==null && other.getKerberosDomainName()==null) || 
             (this.kerberosDomainName!=null &&
              this.kerberosDomainName.equals(other.getKerberosDomainName())));
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
        if (getTokenServer() != null) {
            _hashCode += getTokenServer().hashCode();
        }
        if (getRoamingURL() != null) {
            _hashCode += getRoamingURL().hashCode();
        }
        if (getMechanisms() != null) {
            _hashCode += getMechanisms().hashCode();
        }
        if (getSamlTokenSigningCertKeyPair() != null) {
            _hashCode += getSamlTokenSigningCertKeyPair().hashCode();
        }
        if (getSamlTokenAttributes() != null) {
            _hashCode += getSamlTokenAttributes().hashCode();
        }
        if (getKerberosUseProcessCredentials() != null) {
            _hashCode += getKerberosUseProcessCredentials().hashCode();
        }
        if (getKerberosUserName() != null) {
            _hashCode += getKerberosUserName().hashCode();
        }
        if (getKerberosPassword() != null) {
            _hashCode += getKerberosPassword().hashCode();
        }
        if (getKerberosDomainName() != null) {
            _hashCode += getKerberosDomainName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASSPConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "tokenServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "roamingURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mechanisms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "mechanisms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPMechanismList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenSigningCertKeyPair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenSigningCertKeyPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "CertKeyPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerberosUseProcessCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "kerberosUseProcessCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerberosUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "kerberosUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerberosPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "kerberosPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kerberosDomainName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "kerberosDomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
