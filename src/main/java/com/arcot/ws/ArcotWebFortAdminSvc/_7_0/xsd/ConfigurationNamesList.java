/**
 * ConfigurationNamesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigurationNamesList is the structure used as
 * 				the output of the fetch response.
 */
public class ConfigurationNamesList  implements java.io.Serializable {
    /* Organization details of the configuration names. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDIssuanceConfigs;

    /* QnA issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaIssuanceConfigs;

    /* Password issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordIssuanceConfigs;

    /* Server OTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPIssuanceConfigs;

    /* OATH issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathIssuanceConfigs;

    /* ArcotOTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPIssuanceConfigs;

    /* EMV issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvIssuanceConfigs;

    /* ArcotID authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDAuthConfigs;

    /* QnA authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaAuthConfigs;

    /* Password authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordAuthConfigs;

    /* Server OTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPAuthConfigs;

    /* OATH authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathAuthConfigs;

    /* ArcotOTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPAuthConfigs;

    /* EMV authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvAuthConfigs;

    /* Miscellaneous configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] miscellaneousConfigs;

    /* Key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] keyConfigs;

    /* ArcotID Domain key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDDomainKeyConfigs;

    /* OATH-OTP Master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathOTPMasterKeyConfigs;

    /* ArcotOTP-OATH Master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPMasterKeyConfigs;

    /* ArcotOTP-EMV Master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvOTPMasterKeyConfigs;

    /* RADIUS client configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusClientConfigs;

    /* RADIUS server configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusServerConfigs;

    /* ASSP configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspConfigs;

    /* SAML token configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] samlTokenConfigs;

    /* Credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] credTypeResolutionConfigs;

    /* RADIUS credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusCredTypeResolutionConfigs;

    /* ASSP credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspCredTypeResolutionConfigs;

    /* Plugin configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] pluginConfigs;

    /* Callout configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] calloutConfigs;

    public ConfigurationNamesList() {
    }

    public ConfigurationNamesList(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] miscellaneousConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] keyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDDomainKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusClientConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusServerConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] samlTokenConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] credTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusCredTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspCredTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] pluginConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] calloutConfigs) {
           this.orgDetails = orgDetails;
           this.arcotIDIssuanceConfigs = arcotIDIssuanceConfigs;
           this.qnaIssuanceConfigs = qnaIssuanceConfigs;
           this.passwordIssuanceConfigs = passwordIssuanceConfigs;
           this.serverOTPIssuanceConfigs = serverOTPIssuanceConfigs;
           this.oathIssuanceConfigs = oathIssuanceConfigs;
           this.arcotOTPIssuanceConfigs = arcotOTPIssuanceConfigs;
           this.emvIssuanceConfigs = emvIssuanceConfigs;
           this.arcotIDAuthConfigs = arcotIDAuthConfigs;
           this.qnaAuthConfigs = qnaAuthConfigs;
           this.passwordAuthConfigs = passwordAuthConfigs;
           this.serverOTPAuthConfigs = serverOTPAuthConfigs;
           this.oathAuthConfigs = oathAuthConfigs;
           this.arcotOTPAuthConfigs = arcotOTPAuthConfigs;
           this.emvAuthConfigs = emvAuthConfigs;
           this.miscellaneousConfigs = miscellaneousConfigs;
           this.keyConfigs = keyConfigs;
           this.arcotIDDomainKeyConfigs = arcotIDDomainKeyConfigs;
           this.oathOTPMasterKeyConfigs = oathOTPMasterKeyConfigs;
           this.arcotOTPMasterKeyConfigs = arcotOTPMasterKeyConfigs;
           this.emvOTPMasterKeyConfigs = emvOTPMasterKeyConfigs;
           this.radiusClientConfigs = radiusClientConfigs;
           this.radiusServerConfigs = radiusServerConfigs;
           this.asspConfigs = asspConfigs;
           this.samlTokenConfigs = samlTokenConfigs;
           this.credTypeResolutionConfigs = credTypeResolutionConfigs;
           this.radiusCredTypeResolutionConfigs = radiusCredTypeResolutionConfigs;
           this.asspCredTypeResolutionConfigs = asspCredTypeResolutionConfigs;
           this.pluginConfigs = pluginConfigs;
           this.calloutConfigs = calloutConfigs;
    }


    /**
     * Gets the orgDetails value for this ConfigurationNamesList.
     * 
     * @return orgDetails   * Organization details of the configuration names.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this ConfigurationNamesList.
     * 
     * @param orgDetails   * Organization details of the configuration names.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotIDIssuanceConfigs() {
        return arcotIDIssuanceConfigs;
    }


    /**
     * Sets the arcotIDIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public void setArcotIDIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDIssuanceConfigs) {
        this.arcotIDIssuanceConfigs = arcotIDIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotIDIssuanceConfigs(int i) {
        return this.arcotIDIssuanceConfigs[i];
    }

    public void setArcotIDIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotIDIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the qnaIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return qnaIssuanceConfigs   * QnA issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getQnaIssuanceConfigs() {
        return qnaIssuanceConfigs;
    }


    /**
     * Sets the qnaIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param qnaIssuanceConfigs   * QnA issuance configurations.
     */
    public void setQnaIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaIssuanceConfigs) {
        this.qnaIssuanceConfigs = qnaIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getQnaIssuanceConfigs(int i) {
        return this.qnaIssuanceConfigs[i];
    }

    public void setQnaIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.qnaIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the passwordIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return passwordIssuanceConfigs   * Password issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getPasswordIssuanceConfigs() {
        return passwordIssuanceConfigs;
    }


    /**
     * Sets the passwordIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param passwordIssuanceConfigs   * Password issuance configurations.
     */
    public void setPasswordIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordIssuanceConfigs) {
        this.passwordIssuanceConfigs = passwordIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getPasswordIssuanceConfigs(int i) {
        return this.passwordIssuanceConfigs[i];
    }

    public void setPasswordIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.passwordIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the serverOTPIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getServerOTPIssuanceConfigs() {
        return serverOTPIssuanceConfigs;
    }


    /**
     * Sets the serverOTPIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public void setServerOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPIssuanceConfigs) {
        this.serverOTPIssuanceConfigs = serverOTPIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getServerOTPIssuanceConfigs(int i) {
        return this.serverOTPIssuanceConfigs[i];
    }

    public void setServerOTPIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.serverOTPIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the oathIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return oathIssuanceConfigs   * OATH issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getOathIssuanceConfigs() {
        return oathIssuanceConfigs;
    }


    /**
     * Sets the oathIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param oathIssuanceConfigs   * OATH issuance configurations.
     */
    public void setOathIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathIssuanceConfigs) {
        this.oathIssuanceConfigs = oathIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getOathIssuanceConfigs(int i) {
        return this.oathIssuanceConfigs[i];
    }

    public void setOathIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.oathIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the arcotOTPIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotOTPIssuanceConfigs() {
        return arcotOTPIssuanceConfigs;
    }


    /**
     * Sets the arcotOTPIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public void setArcotOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPIssuanceConfigs) {
        this.arcotOTPIssuanceConfigs = arcotOTPIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotOTPIssuanceConfigs(int i) {
        return this.arcotOTPIssuanceConfigs[i];
    }

    public void setArcotOTPIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotOTPIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the emvIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @return emvIssuanceConfigs   * EMV issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getEmvIssuanceConfigs() {
        return emvIssuanceConfigs;
    }


    /**
     * Sets the emvIssuanceConfigs value for this ConfigurationNamesList.
     * 
     * @param emvIssuanceConfigs   * EMV issuance configurations.
     */
    public void setEmvIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvIssuanceConfigs) {
        this.emvIssuanceConfigs = emvIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getEmvIssuanceConfigs(int i) {
        return this.emvIssuanceConfigs[i];
    }

    public void setEmvIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.emvIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the arcotIDAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotIDAuthConfigs() {
        return arcotIDAuthConfigs;
    }


    /**
     * Sets the arcotIDAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public void setArcotIDAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDAuthConfigs) {
        this.arcotIDAuthConfigs = arcotIDAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotIDAuthConfigs(int i) {
        return this.arcotIDAuthConfigs[i];
    }

    public void setArcotIDAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotIDAuthConfigs[i] = _value;
    }


    /**
     * Gets the qnaAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return qnaAuthConfigs   * QnA authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getQnaAuthConfigs() {
        return qnaAuthConfigs;
    }


    /**
     * Sets the qnaAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param qnaAuthConfigs   * QnA authentication configurations.
     */
    public void setQnaAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] qnaAuthConfigs) {
        this.qnaAuthConfigs = qnaAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getQnaAuthConfigs(int i) {
        return this.qnaAuthConfigs[i];
    }

    public void setQnaAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.qnaAuthConfigs[i] = _value;
    }


    /**
     * Gets the passwordAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return passwordAuthConfigs   * Password authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getPasswordAuthConfigs() {
        return passwordAuthConfigs;
    }


    /**
     * Sets the passwordAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param passwordAuthConfigs   * Password authentication configurations.
     */
    public void setPasswordAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] passwordAuthConfigs) {
        this.passwordAuthConfigs = passwordAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getPasswordAuthConfigs(int i) {
        return this.passwordAuthConfigs[i];
    }

    public void setPasswordAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.passwordAuthConfigs[i] = _value;
    }


    /**
     * Gets the serverOTPAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getServerOTPAuthConfigs() {
        return serverOTPAuthConfigs;
    }


    /**
     * Sets the serverOTPAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public void setServerOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] serverOTPAuthConfigs) {
        this.serverOTPAuthConfigs = serverOTPAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getServerOTPAuthConfigs(int i) {
        return this.serverOTPAuthConfigs[i];
    }

    public void setServerOTPAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.serverOTPAuthConfigs[i] = _value;
    }


    /**
     * Gets the oathAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return oathAuthConfigs   * OATH authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getOathAuthConfigs() {
        return oathAuthConfigs;
    }


    /**
     * Sets the oathAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param oathAuthConfigs   * OATH authentication configurations.
     */
    public void setOathAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathAuthConfigs) {
        this.oathAuthConfigs = oathAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getOathAuthConfigs(int i) {
        return this.oathAuthConfigs[i];
    }

    public void setOathAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.oathAuthConfigs[i] = _value;
    }


    /**
     * Gets the arcotOTPAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotOTPAuthConfigs() {
        return arcotOTPAuthConfigs;
    }


    /**
     * Sets the arcotOTPAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public void setArcotOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPAuthConfigs) {
        this.arcotOTPAuthConfigs = arcotOTPAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotOTPAuthConfigs(int i) {
        return this.arcotOTPAuthConfigs[i];
    }

    public void setArcotOTPAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotOTPAuthConfigs[i] = _value;
    }


    /**
     * Gets the emvAuthConfigs value for this ConfigurationNamesList.
     * 
     * @return emvAuthConfigs   * EMV authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getEmvAuthConfigs() {
        return emvAuthConfigs;
    }


    /**
     * Sets the emvAuthConfigs value for this ConfigurationNamesList.
     * 
     * @param emvAuthConfigs   * EMV authentication configurations.
     */
    public void setEmvAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvAuthConfigs) {
        this.emvAuthConfigs = emvAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getEmvAuthConfigs(int i) {
        return this.emvAuthConfigs[i];
    }

    public void setEmvAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.emvAuthConfigs[i] = _value;
    }


    /**
     * Gets the miscellaneousConfigs value for this ConfigurationNamesList.
     * 
     * @return miscellaneousConfigs   * Miscellaneous configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getMiscellaneousConfigs() {
        return miscellaneousConfigs;
    }


    /**
     * Sets the miscellaneousConfigs value for this ConfigurationNamesList.
     * 
     * @param miscellaneousConfigs   * Miscellaneous configurations.
     */
    public void setMiscellaneousConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] miscellaneousConfigs) {
        this.miscellaneousConfigs = miscellaneousConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getMiscellaneousConfigs(int i) {
        return this.miscellaneousConfigs[i];
    }

    public void setMiscellaneousConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.miscellaneousConfigs[i] = _value;
    }


    /**
     * Gets the keyConfigs value for this ConfigurationNamesList.
     * 
     * @return keyConfigs   * Key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getKeyConfigs() {
        return keyConfigs;
    }


    /**
     * Sets the keyConfigs value for this ConfigurationNamesList.
     * 
     * @param keyConfigs   * Key configurations.
     */
    public void setKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] keyConfigs) {
        this.keyConfigs = keyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getKeyConfigs(int i) {
        return this.keyConfigs[i];
    }

    public void setKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.keyConfigs[i] = _value;
    }


    /**
     * Gets the arcotIDDomainKeyConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotIDDomainKeyConfigs   * ArcotID Domain key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotIDDomainKeyConfigs() {
        return arcotIDDomainKeyConfigs;
    }


    /**
     * Sets the arcotIDDomainKeyConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotIDDomainKeyConfigs   * ArcotID Domain key configurations.
     */
    public void setArcotIDDomainKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotIDDomainKeyConfigs) {
        this.arcotIDDomainKeyConfigs = arcotIDDomainKeyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotIDDomainKeyConfigs(int i) {
        return this.arcotIDDomainKeyConfigs[i];
    }

    public void setArcotIDDomainKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotIDDomainKeyConfigs[i] = _value;
    }


    /**
     * Gets the oathOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @return oathOTPMasterKeyConfigs   * OATH-OTP Master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getOathOTPMasterKeyConfigs() {
        return oathOTPMasterKeyConfigs;
    }


    /**
     * Sets the oathOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @param oathOTPMasterKeyConfigs   * OATH-OTP Master key configurations.
     */
    public void setOathOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] oathOTPMasterKeyConfigs) {
        this.oathOTPMasterKeyConfigs = oathOTPMasterKeyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getOathOTPMasterKeyConfigs(int i) {
        return this.oathOTPMasterKeyConfigs[i];
    }

    public void setOathOTPMasterKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.oathOTPMasterKeyConfigs[i] = _value;
    }


    /**
     * Gets the arcotOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @return arcotOTPMasterKeyConfigs   * ArcotOTP-OATH Master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getArcotOTPMasterKeyConfigs() {
        return arcotOTPMasterKeyConfigs;
    }


    /**
     * Sets the arcotOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @param arcotOTPMasterKeyConfigs   * ArcotOTP-OATH Master key configurations.
     */
    public void setArcotOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] arcotOTPMasterKeyConfigs) {
        this.arcotOTPMasterKeyConfigs = arcotOTPMasterKeyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getArcotOTPMasterKeyConfigs(int i) {
        return this.arcotOTPMasterKeyConfigs[i];
    }

    public void setArcotOTPMasterKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.arcotOTPMasterKeyConfigs[i] = _value;
    }


    /**
     * Gets the emvOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @return emvOTPMasterKeyConfigs   * ArcotOTP-EMV Master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getEmvOTPMasterKeyConfigs() {
        return emvOTPMasterKeyConfigs;
    }


    /**
     * Sets the emvOTPMasterKeyConfigs value for this ConfigurationNamesList.
     * 
     * @param emvOTPMasterKeyConfigs   * ArcotOTP-EMV Master key configurations.
     */
    public void setEmvOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] emvOTPMasterKeyConfigs) {
        this.emvOTPMasterKeyConfigs = emvOTPMasterKeyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getEmvOTPMasterKeyConfigs(int i) {
        return this.emvOTPMasterKeyConfigs[i];
    }

    public void setEmvOTPMasterKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.emvOTPMasterKeyConfigs[i] = _value;
    }


    /**
     * Gets the radiusClientConfigs value for this ConfigurationNamesList.
     * 
     * @return radiusClientConfigs   * RADIUS client configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getRadiusClientConfigs() {
        return radiusClientConfigs;
    }


    /**
     * Sets the radiusClientConfigs value for this ConfigurationNamesList.
     * 
     * @param radiusClientConfigs   * RADIUS client configurations.
     */
    public void setRadiusClientConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusClientConfigs) {
        this.radiusClientConfigs = radiusClientConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getRadiusClientConfigs(int i) {
        return this.radiusClientConfigs[i];
    }

    public void setRadiusClientConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.radiusClientConfigs[i] = _value;
    }


    /**
     * Gets the radiusServerConfigs value for this ConfigurationNamesList.
     * 
     * @return radiusServerConfigs   * RADIUS server configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getRadiusServerConfigs() {
        return radiusServerConfigs;
    }


    /**
     * Sets the radiusServerConfigs value for this ConfigurationNamesList.
     * 
     * @param radiusServerConfigs   * RADIUS server configurations.
     */
    public void setRadiusServerConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusServerConfigs) {
        this.radiusServerConfigs = radiusServerConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getRadiusServerConfigs(int i) {
        return this.radiusServerConfigs[i];
    }

    public void setRadiusServerConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.radiusServerConfigs[i] = _value;
    }


    /**
     * Gets the asspConfigs value for this ConfigurationNamesList.
     * 
     * @return asspConfigs   * ASSP configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getAsspConfigs() {
        return asspConfigs;
    }


    /**
     * Sets the asspConfigs value for this ConfigurationNamesList.
     * 
     * @param asspConfigs   * ASSP configurations.
     */
    public void setAsspConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspConfigs) {
        this.asspConfigs = asspConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getAsspConfigs(int i) {
        return this.asspConfigs[i];
    }

    public void setAsspConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.asspConfigs[i] = _value;
    }


    /**
     * Gets the samlTokenConfigs value for this ConfigurationNamesList.
     * 
     * @return samlTokenConfigs   * SAML token configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getSamlTokenConfigs() {
        return samlTokenConfigs;
    }


    /**
     * Sets the samlTokenConfigs value for this ConfigurationNamesList.
     * 
     * @param samlTokenConfigs   * SAML token configurations.
     */
    public void setSamlTokenConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] samlTokenConfigs) {
        this.samlTokenConfigs = samlTokenConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getSamlTokenConfigs(int i) {
        return this.samlTokenConfigs[i];
    }

    public void setSamlTokenConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.samlTokenConfigs[i] = _value;
    }


    /**
     * Gets the credTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @return credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getCredTypeResolutionConfigs() {
        return credTypeResolutionConfigs;
    }


    /**
     * Sets the credTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @param credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public void setCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] credTypeResolutionConfigs) {
        this.credTypeResolutionConfigs = credTypeResolutionConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getCredTypeResolutionConfigs(int i) {
        return this.credTypeResolutionConfigs[i];
    }

    public void setCredTypeResolutionConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.credTypeResolutionConfigs[i] = _value;
    }


    /**
     * Gets the radiusCredTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @return radiusCredTypeResolutionConfigs   * RADIUS credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getRadiusCredTypeResolutionConfigs() {
        return radiusCredTypeResolutionConfigs;
    }


    /**
     * Sets the radiusCredTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @param radiusCredTypeResolutionConfigs   * RADIUS credential type resolution configurations.
     */
    public void setRadiusCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] radiusCredTypeResolutionConfigs) {
        this.radiusCredTypeResolutionConfigs = radiusCredTypeResolutionConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getRadiusCredTypeResolutionConfigs(int i) {
        return this.radiusCredTypeResolutionConfigs[i];
    }

    public void setRadiusCredTypeResolutionConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.radiusCredTypeResolutionConfigs[i] = _value;
    }


    /**
     * Gets the asspCredTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @return asspCredTypeResolutionConfigs   * ASSP credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getAsspCredTypeResolutionConfigs() {
        return asspCredTypeResolutionConfigs;
    }


    /**
     * Sets the asspCredTypeResolutionConfigs value for this ConfigurationNamesList.
     * 
     * @param asspCredTypeResolutionConfigs   * ASSP credential type resolution configurations.
     */
    public void setAsspCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] asspCredTypeResolutionConfigs) {
        this.asspCredTypeResolutionConfigs = asspCredTypeResolutionConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getAsspCredTypeResolutionConfigs(int i) {
        return this.asspCredTypeResolutionConfigs[i];
    }

    public void setAsspCredTypeResolutionConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.asspCredTypeResolutionConfigs[i] = _value;
    }


    /**
     * Gets the pluginConfigs value for this ConfigurationNamesList.
     * 
     * @return pluginConfigs   * Plugin configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getPluginConfigs() {
        return pluginConfigs;
    }


    /**
     * Sets the pluginConfigs value for this ConfigurationNamesList.
     * 
     * @param pluginConfigs   * Plugin configurations.
     */
    public void setPluginConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getPluginConfigs(int i) {
        return this.pluginConfigs[i];
    }

    public void setPluginConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.pluginConfigs[i] = _value;
    }


    /**
     * Gets the calloutConfigs value for this ConfigurationNamesList.
     * 
     * @return calloutConfigs   * Callout configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] getCalloutConfigs() {
        return calloutConfigs;
    }


    /**
     * Sets the calloutConfigs value for this ConfigurationNamesList.
     * 
     * @param calloutConfigs   * Callout configurations.
     */
    public void setCalloutConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject[] calloutConfigs) {
        this.calloutConfigs = calloutConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject getCalloutConfigs(int i) {
        return this.calloutConfigs[i];
    }

    public void setCalloutConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigNameObject _value) {
        this.calloutConfigs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationNamesList)) return false;
        ConfigurationNamesList other = (ConfigurationNamesList) obj;
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
            ((this.arcotIDIssuanceConfigs==null && other.getArcotIDIssuanceConfigs()==null) || 
             (this.arcotIDIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.arcotIDIssuanceConfigs, other.getArcotIDIssuanceConfigs()))) &&
            ((this.qnaIssuanceConfigs==null && other.getQnaIssuanceConfigs()==null) || 
             (this.qnaIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.qnaIssuanceConfigs, other.getQnaIssuanceConfigs()))) &&
            ((this.passwordIssuanceConfigs==null && other.getPasswordIssuanceConfigs()==null) || 
             (this.passwordIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.passwordIssuanceConfigs, other.getPasswordIssuanceConfigs()))) &&
            ((this.serverOTPIssuanceConfigs==null && other.getServerOTPIssuanceConfigs()==null) || 
             (this.serverOTPIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.serverOTPIssuanceConfigs, other.getServerOTPIssuanceConfigs()))) &&
            ((this.oathIssuanceConfigs==null && other.getOathIssuanceConfigs()==null) || 
             (this.oathIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.oathIssuanceConfigs, other.getOathIssuanceConfigs()))) &&
            ((this.arcotOTPIssuanceConfigs==null && other.getArcotOTPIssuanceConfigs()==null) || 
             (this.arcotOTPIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.arcotOTPIssuanceConfigs, other.getArcotOTPIssuanceConfigs()))) &&
            ((this.emvIssuanceConfigs==null && other.getEmvIssuanceConfigs()==null) || 
             (this.emvIssuanceConfigs!=null &&
              java.util.Arrays.equals(this.emvIssuanceConfigs, other.getEmvIssuanceConfigs()))) &&
            ((this.arcotIDAuthConfigs==null && other.getArcotIDAuthConfigs()==null) || 
             (this.arcotIDAuthConfigs!=null &&
              java.util.Arrays.equals(this.arcotIDAuthConfigs, other.getArcotIDAuthConfigs()))) &&
            ((this.qnaAuthConfigs==null && other.getQnaAuthConfigs()==null) || 
             (this.qnaAuthConfigs!=null &&
              java.util.Arrays.equals(this.qnaAuthConfigs, other.getQnaAuthConfigs()))) &&
            ((this.passwordAuthConfigs==null && other.getPasswordAuthConfigs()==null) || 
             (this.passwordAuthConfigs!=null &&
              java.util.Arrays.equals(this.passwordAuthConfigs, other.getPasswordAuthConfigs()))) &&
            ((this.serverOTPAuthConfigs==null && other.getServerOTPAuthConfigs()==null) || 
             (this.serverOTPAuthConfigs!=null &&
              java.util.Arrays.equals(this.serverOTPAuthConfigs, other.getServerOTPAuthConfigs()))) &&
            ((this.oathAuthConfigs==null && other.getOathAuthConfigs()==null) || 
             (this.oathAuthConfigs!=null &&
              java.util.Arrays.equals(this.oathAuthConfigs, other.getOathAuthConfigs()))) &&
            ((this.arcotOTPAuthConfigs==null && other.getArcotOTPAuthConfigs()==null) || 
             (this.arcotOTPAuthConfigs!=null &&
              java.util.Arrays.equals(this.arcotOTPAuthConfigs, other.getArcotOTPAuthConfigs()))) &&
            ((this.emvAuthConfigs==null && other.getEmvAuthConfigs()==null) || 
             (this.emvAuthConfigs!=null &&
              java.util.Arrays.equals(this.emvAuthConfigs, other.getEmvAuthConfigs()))) &&
            ((this.miscellaneousConfigs==null && other.getMiscellaneousConfigs()==null) || 
             (this.miscellaneousConfigs!=null &&
              java.util.Arrays.equals(this.miscellaneousConfigs, other.getMiscellaneousConfigs()))) &&
            ((this.keyConfigs==null && other.getKeyConfigs()==null) || 
             (this.keyConfigs!=null &&
              java.util.Arrays.equals(this.keyConfigs, other.getKeyConfigs()))) &&
            ((this.arcotIDDomainKeyConfigs==null && other.getArcotIDDomainKeyConfigs()==null) || 
             (this.arcotIDDomainKeyConfigs!=null &&
              java.util.Arrays.equals(this.arcotIDDomainKeyConfigs, other.getArcotIDDomainKeyConfigs()))) &&
            ((this.oathOTPMasterKeyConfigs==null && other.getOathOTPMasterKeyConfigs()==null) || 
             (this.oathOTPMasterKeyConfigs!=null &&
              java.util.Arrays.equals(this.oathOTPMasterKeyConfigs, other.getOathOTPMasterKeyConfigs()))) &&
            ((this.arcotOTPMasterKeyConfigs==null && other.getArcotOTPMasterKeyConfigs()==null) || 
             (this.arcotOTPMasterKeyConfigs!=null &&
              java.util.Arrays.equals(this.arcotOTPMasterKeyConfigs, other.getArcotOTPMasterKeyConfigs()))) &&
            ((this.emvOTPMasterKeyConfigs==null && other.getEmvOTPMasterKeyConfigs()==null) || 
             (this.emvOTPMasterKeyConfigs!=null &&
              java.util.Arrays.equals(this.emvOTPMasterKeyConfigs, other.getEmvOTPMasterKeyConfigs()))) &&
            ((this.radiusClientConfigs==null && other.getRadiusClientConfigs()==null) || 
             (this.radiusClientConfigs!=null &&
              java.util.Arrays.equals(this.radiusClientConfigs, other.getRadiusClientConfigs()))) &&
            ((this.radiusServerConfigs==null && other.getRadiusServerConfigs()==null) || 
             (this.radiusServerConfigs!=null &&
              java.util.Arrays.equals(this.radiusServerConfigs, other.getRadiusServerConfigs()))) &&
            ((this.asspConfigs==null && other.getAsspConfigs()==null) || 
             (this.asspConfigs!=null &&
              java.util.Arrays.equals(this.asspConfigs, other.getAsspConfigs()))) &&
            ((this.samlTokenConfigs==null && other.getSamlTokenConfigs()==null) || 
             (this.samlTokenConfigs!=null &&
              java.util.Arrays.equals(this.samlTokenConfigs, other.getSamlTokenConfigs()))) &&
            ((this.credTypeResolutionConfigs==null && other.getCredTypeResolutionConfigs()==null) || 
             (this.credTypeResolutionConfigs!=null &&
              java.util.Arrays.equals(this.credTypeResolutionConfigs, other.getCredTypeResolutionConfigs()))) &&
            ((this.radiusCredTypeResolutionConfigs==null && other.getRadiusCredTypeResolutionConfigs()==null) || 
             (this.radiusCredTypeResolutionConfigs!=null &&
              java.util.Arrays.equals(this.radiusCredTypeResolutionConfigs, other.getRadiusCredTypeResolutionConfigs()))) &&
            ((this.asspCredTypeResolutionConfigs==null && other.getAsspCredTypeResolutionConfigs()==null) || 
             (this.asspCredTypeResolutionConfigs!=null &&
              java.util.Arrays.equals(this.asspCredTypeResolutionConfigs, other.getAsspCredTypeResolutionConfigs()))) &&
            ((this.pluginConfigs==null && other.getPluginConfigs()==null) || 
             (this.pluginConfigs!=null &&
              java.util.Arrays.equals(this.pluginConfigs, other.getPluginConfigs()))) &&
            ((this.calloutConfigs==null && other.getCalloutConfigs()==null) || 
             (this.calloutConfigs!=null &&
              java.util.Arrays.equals(this.calloutConfigs, other.getCalloutConfigs())));
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
        if (getArcotIDIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQnaIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQnaIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQnaIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPasswordIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPasswordIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPasswordIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServerOTPIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerOTPIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerOTPIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvIssuanceConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvIssuanceConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvIssuanceConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotIDAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQnaAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQnaAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQnaAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPasswordAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPasswordAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPasswordAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServerOTPAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerOTPAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerOTPAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvAuthConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvAuthConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvAuthConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiscellaneousConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiscellaneousConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiscellaneousConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotIDDomainKeyConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDDomainKeyConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDDomainKeyConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathOTPMasterKeyConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathOTPMasterKeyConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathOTPMasterKeyConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPMasterKeyConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPMasterKeyConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPMasterKeyConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvOTPMasterKeyConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvOTPMasterKeyConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvOTPMasterKeyConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusClientConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusClientConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusClientConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusServerConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusServerConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusServerConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsspConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsspConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsspConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlTokenConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlTokenConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlTokenConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredTypeResolutionConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredTypeResolutionConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredTypeResolutionConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusCredTypeResolutionConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusCredTypeResolutionConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusCredTypeResolutionConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsspCredTypeResolutionConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsspCredTypeResolutionConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsspCredTypeResolutionConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPluginConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluginConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluginConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalloutConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalloutConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalloutConfigs(), i);
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
        new org.apache.axis.description.TypeDesc(ConfigurationNamesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNamesList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneousConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscellaneousConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDDomainKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDDomainKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClientConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClientConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusCredTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusCredTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspCredTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspCredTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "calloutConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigNameObject"));
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
