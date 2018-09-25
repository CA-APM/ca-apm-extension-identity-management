/**
 * AssignDefault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * AssignDefault is the structure used to represent
 * 				configuration names that are used for assigning
 * 				configurations as default.
 */
public class AssignDefault  implements java.io.Serializable {
    /* Organization for which the configurations are
     * 						assigned as default. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configuration name. */
    private java.lang.String arcotIDIssuanceConfigName;

    /* QnA issuance configuration name. */
    private java.lang.String qnaIssuanceConfigName;

    /* Password issuance configuration name. */
    private java.lang.String passwordIssuanceConfigName;

    /* Server OTP issuance configuration name. */
    private java.lang.String serverOTPIssuanceConfigName;

    /* OATH issuance configuration name. */
    private java.lang.String oathIssuanceConfigName;

    /* ArcotOTP issuance configuration name. */
    private java.lang.String arcotOTPIssuanceConfigName;

    /* EMV issuance configuration name. */
    private java.lang.String emvIssuanceConfigName;

    /* ArcotID authentication configuration name. */
    private java.lang.String arcotIDAuthConfigName;

    /* QnA authentication configuration name. */
    private java.lang.String qnaAuthConfigName;

    /* Password authentication configuration name. */
    private java.lang.String passwordAuthConfigName;

    /* Server OTP authentication configuration name. */
    private java.lang.String serverOTPAuthConfigName;

    /* OATH authentication configuration name. */
    private java.lang.String oathAuthConfigName;

    /* ArcotOTP authentication configuration name. */
    private java.lang.String arcotOTPAuthConfigName;

    /* EMV authentication configuration name. */
    private java.lang.String emvAuthConfigName;

    /* RADIUS server configuration name. */
    private java.lang.String radiusServerConfigName;

    /* ArcotID domain key configuration name. */
    private java.lang.String arcotIDDomainKeyConfigName;

    /* OATH OTP master key configuration name. */
    private java.lang.String oathOTPMasterKeyConfig;

    /* ArcotOTP master key configuration name. */
    private java.lang.String arcotOTPMasterKeyConfig;

    /* EMV OTP master key configuration name. */
    private java.lang.String emvOTPMasterKeyConfig;

    /* ASSP configuration name. */
    private java.lang.String asspConfigName;

    /* SAML token configuration name. */
    private java.lang.String samlTokenConfigName;

    /* Credential type resolution configuration name. */
    private java.lang.String credTypeResolutionConfigName;

    /* RADIUS credential type resolution configuration name. */
    private java.lang.String radiusCredTypeResolutionConfigName;

    /* ASSP credential type resolution configuration name. */
    private java.lang.String asspCredTypeResolutionConfigName;

    /* Miscellenious configuration name. */
    private java.lang.String miscConfigName;

    public AssignDefault() {
    }

    public AssignDefault(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           java.lang.String arcotIDIssuanceConfigName,
           java.lang.String qnaIssuanceConfigName,
           java.lang.String passwordIssuanceConfigName,
           java.lang.String serverOTPIssuanceConfigName,
           java.lang.String oathIssuanceConfigName,
           java.lang.String arcotOTPIssuanceConfigName,
           java.lang.String emvIssuanceConfigName,
           java.lang.String arcotIDAuthConfigName,
           java.lang.String qnaAuthConfigName,
           java.lang.String passwordAuthConfigName,
           java.lang.String serverOTPAuthConfigName,
           java.lang.String oathAuthConfigName,
           java.lang.String arcotOTPAuthConfigName,
           java.lang.String emvAuthConfigName,
           java.lang.String radiusServerConfigName,
           java.lang.String arcotIDDomainKeyConfigName,
           java.lang.String oathOTPMasterKeyConfig,
           java.lang.String arcotOTPMasterKeyConfig,
           java.lang.String emvOTPMasterKeyConfig,
           java.lang.String asspConfigName,
           java.lang.String samlTokenConfigName,
           java.lang.String credTypeResolutionConfigName,
           java.lang.String radiusCredTypeResolutionConfigName,
           java.lang.String asspCredTypeResolutionConfigName,
           java.lang.String miscConfigName) {
           this.orgDetails = orgDetails;
           this.arcotIDIssuanceConfigName = arcotIDIssuanceConfigName;
           this.qnaIssuanceConfigName = qnaIssuanceConfigName;
           this.passwordIssuanceConfigName = passwordIssuanceConfigName;
           this.serverOTPIssuanceConfigName = serverOTPIssuanceConfigName;
           this.oathIssuanceConfigName = oathIssuanceConfigName;
           this.arcotOTPIssuanceConfigName = arcotOTPIssuanceConfigName;
           this.emvIssuanceConfigName = emvIssuanceConfigName;
           this.arcotIDAuthConfigName = arcotIDAuthConfigName;
           this.qnaAuthConfigName = qnaAuthConfigName;
           this.passwordAuthConfigName = passwordAuthConfigName;
           this.serverOTPAuthConfigName = serverOTPAuthConfigName;
           this.oathAuthConfigName = oathAuthConfigName;
           this.arcotOTPAuthConfigName = arcotOTPAuthConfigName;
           this.emvAuthConfigName = emvAuthConfigName;
           this.radiusServerConfigName = radiusServerConfigName;
           this.arcotIDDomainKeyConfigName = arcotIDDomainKeyConfigName;
           this.oathOTPMasterKeyConfig = oathOTPMasterKeyConfig;
           this.arcotOTPMasterKeyConfig = arcotOTPMasterKeyConfig;
           this.emvOTPMasterKeyConfig = emvOTPMasterKeyConfig;
           this.asspConfigName = asspConfigName;
           this.samlTokenConfigName = samlTokenConfigName;
           this.credTypeResolutionConfigName = credTypeResolutionConfigName;
           this.radiusCredTypeResolutionConfigName = radiusCredTypeResolutionConfigName;
           this.asspCredTypeResolutionConfigName = asspCredTypeResolutionConfigName;
           this.miscConfigName = miscConfigName;
    }


    /**
     * Gets the orgDetails value for this AssignDefault.
     * 
     * @return orgDetails   * Organization for which the configurations are
     * 						assigned as default.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this AssignDefault.
     * 
     * @param orgDetails   * Organization for which the configurations are
     * 						assigned as default.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigName value for this AssignDefault.
     * 
     * @return arcotIDIssuanceConfigName   * ArcotID issuance configuration name.
     */
    public java.lang.String getArcotIDIssuanceConfigName() {
        return arcotIDIssuanceConfigName;
    }


    /**
     * Sets the arcotIDIssuanceConfigName value for this AssignDefault.
     * 
     * @param arcotIDIssuanceConfigName   * ArcotID issuance configuration name.
     */
    public void setArcotIDIssuanceConfigName(java.lang.String arcotIDIssuanceConfigName) {
        this.arcotIDIssuanceConfigName = arcotIDIssuanceConfigName;
    }


    /**
     * Gets the qnaIssuanceConfigName value for this AssignDefault.
     * 
     * @return qnaIssuanceConfigName   * QnA issuance configuration name.
     */
    public java.lang.String getQnaIssuanceConfigName() {
        return qnaIssuanceConfigName;
    }


    /**
     * Sets the qnaIssuanceConfigName value for this AssignDefault.
     * 
     * @param qnaIssuanceConfigName   * QnA issuance configuration name.
     */
    public void setQnaIssuanceConfigName(java.lang.String qnaIssuanceConfigName) {
        this.qnaIssuanceConfigName = qnaIssuanceConfigName;
    }


    /**
     * Gets the passwordIssuanceConfigName value for this AssignDefault.
     * 
     * @return passwordIssuanceConfigName   * Password issuance configuration name.
     */
    public java.lang.String getPasswordIssuanceConfigName() {
        return passwordIssuanceConfigName;
    }


    /**
     * Sets the passwordIssuanceConfigName value for this AssignDefault.
     * 
     * @param passwordIssuanceConfigName   * Password issuance configuration name.
     */
    public void setPasswordIssuanceConfigName(java.lang.String passwordIssuanceConfigName) {
        this.passwordIssuanceConfigName = passwordIssuanceConfigName;
    }


    /**
     * Gets the serverOTPIssuanceConfigName value for this AssignDefault.
     * 
     * @return serverOTPIssuanceConfigName   * Server OTP issuance configuration name.
     */
    public java.lang.String getServerOTPIssuanceConfigName() {
        return serverOTPIssuanceConfigName;
    }


    /**
     * Sets the serverOTPIssuanceConfigName value for this AssignDefault.
     * 
     * @param serverOTPIssuanceConfigName   * Server OTP issuance configuration name.
     */
    public void setServerOTPIssuanceConfigName(java.lang.String serverOTPIssuanceConfigName) {
        this.serverOTPIssuanceConfigName = serverOTPIssuanceConfigName;
    }


    /**
     * Gets the oathIssuanceConfigName value for this AssignDefault.
     * 
     * @return oathIssuanceConfigName   * OATH issuance configuration name.
     */
    public java.lang.String getOathIssuanceConfigName() {
        return oathIssuanceConfigName;
    }


    /**
     * Sets the oathIssuanceConfigName value for this AssignDefault.
     * 
     * @param oathIssuanceConfigName   * OATH issuance configuration name.
     */
    public void setOathIssuanceConfigName(java.lang.String oathIssuanceConfigName) {
        this.oathIssuanceConfigName = oathIssuanceConfigName;
    }


    /**
     * Gets the arcotOTPIssuanceConfigName value for this AssignDefault.
     * 
     * @return arcotOTPIssuanceConfigName   * ArcotOTP issuance configuration name.
     */
    public java.lang.String getArcotOTPIssuanceConfigName() {
        return arcotOTPIssuanceConfigName;
    }


    /**
     * Sets the arcotOTPIssuanceConfigName value for this AssignDefault.
     * 
     * @param arcotOTPIssuanceConfigName   * ArcotOTP issuance configuration name.
     */
    public void setArcotOTPIssuanceConfigName(java.lang.String arcotOTPIssuanceConfigName) {
        this.arcotOTPIssuanceConfigName = arcotOTPIssuanceConfigName;
    }


    /**
     * Gets the emvIssuanceConfigName value for this AssignDefault.
     * 
     * @return emvIssuanceConfigName   * EMV issuance configuration name.
     */
    public java.lang.String getEmvIssuanceConfigName() {
        return emvIssuanceConfigName;
    }


    /**
     * Sets the emvIssuanceConfigName value for this AssignDefault.
     * 
     * @param emvIssuanceConfigName   * EMV issuance configuration name.
     */
    public void setEmvIssuanceConfigName(java.lang.String emvIssuanceConfigName) {
        this.emvIssuanceConfigName = emvIssuanceConfigName;
    }


    /**
     * Gets the arcotIDAuthConfigName value for this AssignDefault.
     * 
     * @return arcotIDAuthConfigName   * ArcotID authentication configuration name.
     */
    public java.lang.String getArcotIDAuthConfigName() {
        return arcotIDAuthConfigName;
    }


    /**
     * Sets the arcotIDAuthConfigName value for this AssignDefault.
     * 
     * @param arcotIDAuthConfigName   * ArcotID authentication configuration name.
     */
    public void setArcotIDAuthConfigName(java.lang.String arcotIDAuthConfigName) {
        this.arcotIDAuthConfigName = arcotIDAuthConfigName;
    }


    /**
     * Gets the qnaAuthConfigName value for this AssignDefault.
     * 
     * @return qnaAuthConfigName   * QnA authentication configuration name.
     */
    public java.lang.String getQnaAuthConfigName() {
        return qnaAuthConfigName;
    }


    /**
     * Sets the qnaAuthConfigName value for this AssignDefault.
     * 
     * @param qnaAuthConfigName   * QnA authentication configuration name.
     */
    public void setQnaAuthConfigName(java.lang.String qnaAuthConfigName) {
        this.qnaAuthConfigName = qnaAuthConfigName;
    }


    /**
     * Gets the passwordAuthConfigName value for this AssignDefault.
     * 
     * @return passwordAuthConfigName   * Password authentication configuration name.
     */
    public java.lang.String getPasswordAuthConfigName() {
        return passwordAuthConfigName;
    }


    /**
     * Sets the passwordAuthConfigName value for this AssignDefault.
     * 
     * @param passwordAuthConfigName   * Password authentication configuration name.
     */
    public void setPasswordAuthConfigName(java.lang.String passwordAuthConfigName) {
        this.passwordAuthConfigName = passwordAuthConfigName;
    }


    /**
     * Gets the serverOTPAuthConfigName value for this AssignDefault.
     * 
     * @return serverOTPAuthConfigName   * Server OTP authentication configuration name.
     */
    public java.lang.String getServerOTPAuthConfigName() {
        return serverOTPAuthConfigName;
    }


    /**
     * Sets the serverOTPAuthConfigName value for this AssignDefault.
     * 
     * @param serverOTPAuthConfigName   * Server OTP authentication configuration name.
     */
    public void setServerOTPAuthConfigName(java.lang.String serverOTPAuthConfigName) {
        this.serverOTPAuthConfigName = serverOTPAuthConfigName;
    }


    /**
     * Gets the oathAuthConfigName value for this AssignDefault.
     * 
     * @return oathAuthConfigName   * OATH authentication configuration name.
     */
    public java.lang.String getOathAuthConfigName() {
        return oathAuthConfigName;
    }


    /**
     * Sets the oathAuthConfigName value for this AssignDefault.
     * 
     * @param oathAuthConfigName   * OATH authentication configuration name.
     */
    public void setOathAuthConfigName(java.lang.String oathAuthConfigName) {
        this.oathAuthConfigName = oathAuthConfigName;
    }


    /**
     * Gets the arcotOTPAuthConfigName value for this AssignDefault.
     * 
     * @return arcotOTPAuthConfigName   * ArcotOTP authentication configuration name.
     */
    public java.lang.String getArcotOTPAuthConfigName() {
        return arcotOTPAuthConfigName;
    }


    /**
     * Sets the arcotOTPAuthConfigName value for this AssignDefault.
     * 
     * @param arcotOTPAuthConfigName   * ArcotOTP authentication configuration name.
     */
    public void setArcotOTPAuthConfigName(java.lang.String arcotOTPAuthConfigName) {
        this.arcotOTPAuthConfigName = arcotOTPAuthConfigName;
    }


    /**
     * Gets the emvAuthConfigName value for this AssignDefault.
     * 
     * @return emvAuthConfigName   * EMV authentication configuration name.
     */
    public java.lang.String getEmvAuthConfigName() {
        return emvAuthConfigName;
    }


    /**
     * Sets the emvAuthConfigName value for this AssignDefault.
     * 
     * @param emvAuthConfigName   * EMV authentication configuration name.
     */
    public void setEmvAuthConfigName(java.lang.String emvAuthConfigName) {
        this.emvAuthConfigName = emvAuthConfigName;
    }


    /**
     * Gets the radiusServerConfigName value for this AssignDefault.
     * 
     * @return radiusServerConfigName   * RADIUS server configuration name.
     */
    public java.lang.String getRadiusServerConfigName() {
        return radiusServerConfigName;
    }


    /**
     * Sets the radiusServerConfigName value for this AssignDefault.
     * 
     * @param radiusServerConfigName   * RADIUS server configuration name.
     */
    public void setRadiusServerConfigName(java.lang.String radiusServerConfigName) {
        this.radiusServerConfigName = radiusServerConfigName;
    }


    /**
     * Gets the arcotIDDomainKeyConfigName value for this AssignDefault.
     * 
     * @return arcotIDDomainKeyConfigName   * ArcotID domain key configuration name.
     */
    public java.lang.String getArcotIDDomainKeyConfigName() {
        return arcotIDDomainKeyConfigName;
    }


    /**
     * Sets the arcotIDDomainKeyConfigName value for this AssignDefault.
     * 
     * @param arcotIDDomainKeyConfigName   * ArcotID domain key configuration name.
     */
    public void setArcotIDDomainKeyConfigName(java.lang.String arcotIDDomainKeyConfigName) {
        this.arcotIDDomainKeyConfigName = arcotIDDomainKeyConfigName;
    }


    /**
     * Gets the oathOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @return oathOTPMasterKeyConfig   * OATH OTP master key configuration name.
     */
    public java.lang.String getOathOTPMasterKeyConfig() {
        return oathOTPMasterKeyConfig;
    }


    /**
     * Sets the oathOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @param oathOTPMasterKeyConfig   * OATH OTP master key configuration name.
     */
    public void setOathOTPMasterKeyConfig(java.lang.String oathOTPMasterKeyConfig) {
        this.oathOTPMasterKeyConfig = oathOTPMasterKeyConfig;
    }


    /**
     * Gets the arcotOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @return arcotOTPMasterKeyConfig   * ArcotOTP master key configuration name.
     */
    public java.lang.String getArcotOTPMasterKeyConfig() {
        return arcotOTPMasterKeyConfig;
    }


    /**
     * Sets the arcotOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @param arcotOTPMasterKeyConfig   * ArcotOTP master key configuration name.
     */
    public void setArcotOTPMasterKeyConfig(java.lang.String arcotOTPMasterKeyConfig) {
        this.arcotOTPMasterKeyConfig = arcotOTPMasterKeyConfig;
    }


    /**
     * Gets the emvOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @return emvOTPMasterKeyConfig   * EMV OTP master key configuration name.
     */
    public java.lang.String getEmvOTPMasterKeyConfig() {
        return emvOTPMasterKeyConfig;
    }


    /**
     * Sets the emvOTPMasterKeyConfig value for this AssignDefault.
     * 
     * @param emvOTPMasterKeyConfig   * EMV OTP master key configuration name.
     */
    public void setEmvOTPMasterKeyConfig(java.lang.String emvOTPMasterKeyConfig) {
        this.emvOTPMasterKeyConfig = emvOTPMasterKeyConfig;
    }


    /**
     * Gets the asspConfigName value for this AssignDefault.
     * 
     * @return asspConfigName   * ASSP configuration name.
     */
    public java.lang.String getAsspConfigName() {
        return asspConfigName;
    }


    /**
     * Sets the asspConfigName value for this AssignDefault.
     * 
     * @param asspConfigName   * ASSP configuration name.
     */
    public void setAsspConfigName(java.lang.String asspConfigName) {
        this.asspConfigName = asspConfigName;
    }


    /**
     * Gets the samlTokenConfigName value for this AssignDefault.
     * 
     * @return samlTokenConfigName   * SAML token configuration name.
     */
    public java.lang.String getSamlTokenConfigName() {
        return samlTokenConfigName;
    }


    /**
     * Sets the samlTokenConfigName value for this AssignDefault.
     * 
     * @param samlTokenConfigName   * SAML token configuration name.
     */
    public void setSamlTokenConfigName(java.lang.String samlTokenConfigName) {
        this.samlTokenConfigName = samlTokenConfigName;
    }


    /**
     * Gets the credTypeResolutionConfigName value for this AssignDefault.
     * 
     * @return credTypeResolutionConfigName   * Credential type resolution configuration name.
     */
    public java.lang.String getCredTypeResolutionConfigName() {
        return credTypeResolutionConfigName;
    }


    /**
     * Sets the credTypeResolutionConfigName value for this AssignDefault.
     * 
     * @param credTypeResolutionConfigName   * Credential type resolution configuration name.
     */
    public void setCredTypeResolutionConfigName(java.lang.String credTypeResolutionConfigName) {
        this.credTypeResolutionConfigName = credTypeResolutionConfigName;
    }


    /**
     * Gets the radiusCredTypeResolutionConfigName value for this AssignDefault.
     * 
     * @return radiusCredTypeResolutionConfigName   * RADIUS credential type resolution configuration name.
     */
    public java.lang.String getRadiusCredTypeResolutionConfigName() {
        return radiusCredTypeResolutionConfigName;
    }


    /**
     * Sets the radiusCredTypeResolutionConfigName value for this AssignDefault.
     * 
     * @param radiusCredTypeResolutionConfigName   * RADIUS credential type resolution configuration name.
     */
    public void setRadiusCredTypeResolutionConfigName(java.lang.String radiusCredTypeResolutionConfigName) {
        this.radiusCredTypeResolutionConfigName = radiusCredTypeResolutionConfigName;
    }


    /**
     * Gets the asspCredTypeResolutionConfigName value for this AssignDefault.
     * 
     * @return asspCredTypeResolutionConfigName   * ASSP credential type resolution configuration name.
     */
    public java.lang.String getAsspCredTypeResolutionConfigName() {
        return asspCredTypeResolutionConfigName;
    }


    /**
     * Sets the asspCredTypeResolutionConfigName value for this AssignDefault.
     * 
     * @param asspCredTypeResolutionConfigName   * ASSP credential type resolution configuration name.
     */
    public void setAsspCredTypeResolutionConfigName(java.lang.String asspCredTypeResolutionConfigName) {
        this.asspCredTypeResolutionConfigName = asspCredTypeResolutionConfigName;
    }


    /**
     * Gets the miscConfigName value for this AssignDefault.
     * 
     * @return miscConfigName   * Miscellenious configuration name.
     */
    public java.lang.String getMiscConfigName() {
        return miscConfigName;
    }


    /**
     * Sets the miscConfigName value for this AssignDefault.
     * 
     * @param miscConfigName   * Miscellenious configuration name.
     */
    public void setMiscConfigName(java.lang.String miscConfigName) {
        this.miscConfigName = miscConfigName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignDefault)) return false;
        AssignDefault other = (AssignDefault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgDetails==null && other.getOrgDetails()==null) || 
             (this.orgDetails!=null &&
              this.orgDetails.equals(other.getOrgDetails()))) &&
            ((this.arcotIDIssuanceConfigName==null && other.getArcotIDIssuanceConfigName()==null) || 
             (this.arcotIDIssuanceConfigName!=null &&
              this.arcotIDIssuanceConfigName.equals(other.getArcotIDIssuanceConfigName()))) &&
            ((this.qnaIssuanceConfigName==null && other.getQnaIssuanceConfigName()==null) || 
             (this.qnaIssuanceConfigName!=null &&
              this.qnaIssuanceConfigName.equals(other.getQnaIssuanceConfigName()))) &&
            ((this.passwordIssuanceConfigName==null && other.getPasswordIssuanceConfigName()==null) || 
             (this.passwordIssuanceConfigName!=null &&
              this.passwordIssuanceConfigName.equals(other.getPasswordIssuanceConfigName()))) &&
            ((this.serverOTPIssuanceConfigName==null && other.getServerOTPIssuanceConfigName()==null) || 
             (this.serverOTPIssuanceConfigName!=null &&
              this.serverOTPIssuanceConfigName.equals(other.getServerOTPIssuanceConfigName()))) &&
            ((this.oathIssuanceConfigName==null && other.getOathIssuanceConfigName()==null) || 
             (this.oathIssuanceConfigName!=null &&
              this.oathIssuanceConfigName.equals(other.getOathIssuanceConfigName()))) &&
            ((this.arcotOTPIssuanceConfigName==null && other.getArcotOTPIssuanceConfigName()==null) || 
             (this.arcotOTPIssuanceConfigName!=null &&
              this.arcotOTPIssuanceConfigName.equals(other.getArcotOTPIssuanceConfigName()))) &&
            ((this.emvIssuanceConfigName==null && other.getEmvIssuanceConfigName()==null) || 
             (this.emvIssuanceConfigName!=null &&
              this.emvIssuanceConfigName.equals(other.getEmvIssuanceConfigName()))) &&
            ((this.arcotIDAuthConfigName==null && other.getArcotIDAuthConfigName()==null) || 
             (this.arcotIDAuthConfigName!=null &&
              this.arcotIDAuthConfigName.equals(other.getArcotIDAuthConfigName()))) &&
            ((this.qnaAuthConfigName==null && other.getQnaAuthConfigName()==null) || 
             (this.qnaAuthConfigName!=null &&
              this.qnaAuthConfigName.equals(other.getQnaAuthConfigName()))) &&
            ((this.passwordAuthConfigName==null && other.getPasswordAuthConfigName()==null) || 
             (this.passwordAuthConfigName!=null &&
              this.passwordAuthConfigName.equals(other.getPasswordAuthConfigName()))) &&
            ((this.serverOTPAuthConfigName==null && other.getServerOTPAuthConfigName()==null) || 
             (this.serverOTPAuthConfigName!=null &&
              this.serverOTPAuthConfigName.equals(other.getServerOTPAuthConfigName()))) &&
            ((this.oathAuthConfigName==null && other.getOathAuthConfigName()==null) || 
             (this.oathAuthConfigName!=null &&
              this.oathAuthConfigName.equals(other.getOathAuthConfigName()))) &&
            ((this.arcotOTPAuthConfigName==null && other.getArcotOTPAuthConfigName()==null) || 
             (this.arcotOTPAuthConfigName!=null &&
              this.arcotOTPAuthConfigName.equals(other.getArcotOTPAuthConfigName()))) &&
            ((this.emvAuthConfigName==null && other.getEmvAuthConfigName()==null) || 
             (this.emvAuthConfigName!=null &&
              this.emvAuthConfigName.equals(other.getEmvAuthConfigName()))) &&
            ((this.radiusServerConfigName==null && other.getRadiusServerConfigName()==null) || 
             (this.radiusServerConfigName!=null &&
              this.radiusServerConfigName.equals(other.getRadiusServerConfigName()))) &&
            ((this.arcotIDDomainKeyConfigName==null && other.getArcotIDDomainKeyConfigName()==null) || 
             (this.arcotIDDomainKeyConfigName!=null &&
              this.arcotIDDomainKeyConfigName.equals(other.getArcotIDDomainKeyConfigName()))) &&
            ((this.oathOTPMasterKeyConfig==null && other.getOathOTPMasterKeyConfig()==null) || 
             (this.oathOTPMasterKeyConfig!=null &&
              this.oathOTPMasterKeyConfig.equals(other.getOathOTPMasterKeyConfig()))) &&
            ((this.arcotOTPMasterKeyConfig==null && other.getArcotOTPMasterKeyConfig()==null) || 
             (this.arcotOTPMasterKeyConfig!=null &&
              this.arcotOTPMasterKeyConfig.equals(other.getArcotOTPMasterKeyConfig()))) &&
            ((this.emvOTPMasterKeyConfig==null && other.getEmvOTPMasterKeyConfig()==null) || 
             (this.emvOTPMasterKeyConfig!=null &&
              this.emvOTPMasterKeyConfig.equals(other.getEmvOTPMasterKeyConfig()))) &&
            ((this.asspConfigName==null && other.getAsspConfigName()==null) || 
             (this.asspConfigName!=null &&
              this.asspConfigName.equals(other.getAsspConfigName()))) &&
            ((this.samlTokenConfigName==null && other.getSamlTokenConfigName()==null) || 
             (this.samlTokenConfigName!=null &&
              this.samlTokenConfigName.equals(other.getSamlTokenConfigName()))) &&
            ((this.credTypeResolutionConfigName==null && other.getCredTypeResolutionConfigName()==null) || 
             (this.credTypeResolutionConfigName!=null &&
              this.credTypeResolutionConfigName.equals(other.getCredTypeResolutionConfigName()))) &&
            ((this.radiusCredTypeResolutionConfigName==null && other.getRadiusCredTypeResolutionConfigName()==null) || 
             (this.radiusCredTypeResolutionConfigName!=null &&
              this.radiusCredTypeResolutionConfigName.equals(other.getRadiusCredTypeResolutionConfigName()))) &&
            ((this.asspCredTypeResolutionConfigName==null && other.getAsspCredTypeResolutionConfigName()==null) || 
             (this.asspCredTypeResolutionConfigName!=null &&
              this.asspCredTypeResolutionConfigName.equals(other.getAsspCredTypeResolutionConfigName()))) &&
            ((this.miscConfigName==null && other.getMiscConfigName()==null) || 
             (this.miscConfigName!=null &&
              this.miscConfigName.equals(other.getMiscConfigName())));
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
        if (getOrgDetails() != null) {
            _hashCode += getOrgDetails().hashCode();
        }
        if (getArcotIDIssuanceConfigName() != null) {
            _hashCode += getArcotIDIssuanceConfigName().hashCode();
        }
        if (getQnaIssuanceConfigName() != null) {
            _hashCode += getQnaIssuanceConfigName().hashCode();
        }
        if (getPasswordIssuanceConfigName() != null) {
            _hashCode += getPasswordIssuanceConfigName().hashCode();
        }
        if (getServerOTPIssuanceConfigName() != null) {
            _hashCode += getServerOTPIssuanceConfigName().hashCode();
        }
        if (getOathIssuanceConfigName() != null) {
            _hashCode += getOathIssuanceConfigName().hashCode();
        }
        if (getArcotOTPIssuanceConfigName() != null) {
            _hashCode += getArcotOTPIssuanceConfigName().hashCode();
        }
        if (getEmvIssuanceConfigName() != null) {
            _hashCode += getEmvIssuanceConfigName().hashCode();
        }
        if (getArcotIDAuthConfigName() != null) {
            _hashCode += getArcotIDAuthConfigName().hashCode();
        }
        if (getQnaAuthConfigName() != null) {
            _hashCode += getQnaAuthConfigName().hashCode();
        }
        if (getPasswordAuthConfigName() != null) {
            _hashCode += getPasswordAuthConfigName().hashCode();
        }
        if (getServerOTPAuthConfigName() != null) {
            _hashCode += getServerOTPAuthConfigName().hashCode();
        }
        if (getOathAuthConfigName() != null) {
            _hashCode += getOathAuthConfigName().hashCode();
        }
        if (getArcotOTPAuthConfigName() != null) {
            _hashCode += getArcotOTPAuthConfigName().hashCode();
        }
        if (getEmvAuthConfigName() != null) {
            _hashCode += getEmvAuthConfigName().hashCode();
        }
        if (getRadiusServerConfigName() != null) {
            _hashCode += getRadiusServerConfigName().hashCode();
        }
        if (getArcotIDDomainKeyConfigName() != null) {
            _hashCode += getArcotIDDomainKeyConfigName().hashCode();
        }
        if (getOathOTPMasterKeyConfig() != null) {
            _hashCode += getOathOTPMasterKeyConfig().hashCode();
        }
        if (getArcotOTPMasterKeyConfig() != null) {
            _hashCode += getArcotOTPMasterKeyConfig().hashCode();
        }
        if (getEmvOTPMasterKeyConfig() != null) {
            _hashCode += getEmvOTPMasterKeyConfig().hashCode();
        }
        if (getAsspConfigName() != null) {
            _hashCode += getAsspConfigName().hashCode();
        }
        if (getSamlTokenConfigName() != null) {
            _hashCode += getSamlTokenConfigName().hashCode();
        }
        if (getCredTypeResolutionConfigName() != null) {
            _hashCode += getCredTypeResolutionConfigName().hashCode();
        }
        if (getRadiusCredTypeResolutionConfigName() != null) {
            _hashCode += getRadiusCredTypeResolutionConfigName().hashCode();
        }
        if (getAsspCredTypeResolutionConfigName() != null) {
            _hashCode += getAsspCredTypeResolutionConfigName().hashCode();
        }
        if (getMiscConfigName() != null) {
            _hashCode += getMiscConfigName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignDefault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "AssignDefault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDDomainKeyConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDDomainKeyConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathOTPMasterKeyConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathOTPMasterKeyConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPMasterKeyConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPMasterKeyConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvOTPMasterKeyConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvOTPMasterKeyConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusCredTypeResolutionConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusCredTypeResolutionConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspCredTypeResolutionConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspCredTypeResolutionConfigName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscConfigName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscConfigName"));
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
