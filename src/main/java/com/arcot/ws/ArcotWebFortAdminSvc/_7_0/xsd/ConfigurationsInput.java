/**
 * ConfigurationsInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigurationsInput is the structure used to
 * 				represent configurations for a particulat
 * 				organization in request.
 */
public class ConfigurationsInput  implements java.io.Serializable {
    /* Organization details of the configurations. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig[] arcotIDIssuanceConfigs;

    /* QNA issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig[] qnaIssuanceConfigs;

    /* Password issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig[] passwordIssuanceConfigs;

    /* Server OTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig[] serverOTPIssuanceConfigs;

    /* OATH issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig[] oathIssuanceConfigs;

    /* ArcotOTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig[] arcotOTPIssuanceConfigs;

    /* EMV issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig[] emvIssuanceConfigs;

    /* ArcotID authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig[] arcotIDAuthConfigs;

    /* QNA authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig[] qnaAuthConfigs;

    /* Password authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig[] passwordAuthConfigs;

    /* Server OTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig[] serverOTPAuthConfigs;

    /* OATH authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig[] oathAuthConfigs;

    /* ArcotOTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] arcotOTPAuthConfigs;

    /* EMV authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig[] emvAuthConfigs;

    /* Miscellaneous configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig[] miscellaneousConfigs;

    /* Key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] keyConfigs;

    /* RADIUS client configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig[] radiusClientConfigs;

    /* RADIUS server configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig[] radiusServerConfigs;

    /* Credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig[] credTypeResolutionConfigs;

    /* Plugin configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig[] pluginConfigs;

    /* Callout configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig[] calloutConfigs;

    /* ASSP configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig[] asspConfigs;

    /* SAML token configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig[] samlTokenConfigs;

    public ConfigurationsInput() {
    }

    public ConfigurationsInput(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig[] arcotIDIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig[] qnaIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig[] passwordIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig[] serverOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig[] oathIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig[] arcotOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig[] emvIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig[] arcotIDAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig[] qnaAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig[] passwordAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig[] serverOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig[] oathAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] arcotOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig[] emvAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig[] miscellaneousConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] keyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig[] radiusClientConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig[] radiusServerConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig[] credTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig[] pluginConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig[] calloutConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig[] asspConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig[] samlTokenConfigs) {
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
           this.radiusClientConfigs = radiusClientConfigs;
           this.radiusServerConfigs = radiusServerConfigs;
           this.credTypeResolutionConfigs = credTypeResolutionConfigs;
           this.pluginConfigs = pluginConfigs;
           this.calloutConfigs = calloutConfigs;
           this.asspConfigs = asspConfigs;
           this.samlTokenConfigs = samlTokenConfigs;
    }


    /**
     * Gets the orgDetails value for this ConfigurationsInput.
     * 
     * @return orgDetails   * Organization details of the configurations.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this ConfigurationsInput.
     * 
     * @param orgDetails   * Organization details of the configurations.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig[] getArcotIDIssuanceConfigs() {
        return arcotIDIssuanceConfigs;
    }


    /**
     * Sets the arcotIDIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public void setArcotIDIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig[] arcotIDIssuanceConfigs) {
        this.arcotIDIssuanceConfigs = arcotIDIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig getArcotIDIssuanceConfigs(int i) {
        return this.arcotIDIssuanceConfigs[i];
    }

    public void setArcotIDIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDIssuanceConfig _value) {
        this.arcotIDIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the qnaIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return qnaIssuanceConfigs   * QNA issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig[] getQnaIssuanceConfigs() {
        return qnaIssuanceConfigs;
    }


    /**
     * Sets the qnaIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param qnaIssuanceConfigs   * QNA issuance configurations.
     */
    public void setQnaIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig[] qnaIssuanceConfigs) {
        this.qnaIssuanceConfigs = qnaIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig getQnaIssuanceConfigs(int i) {
        return this.qnaIssuanceConfigs[i];
    }

    public void setQnaIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAIssuanceConfig _value) {
        this.qnaIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the passwordIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return passwordIssuanceConfigs   * Password issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig[] getPasswordIssuanceConfigs() {
        return passwordIssuanceConfigs;
    }


    /**
     * Sets the passwordIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param passwordIssuanceConfigs   * Password issuance configurations.
     */
    public void setPasswordIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig[] passwordIssuanceConfigs) {
        this.passwordIssuanceConfigs = passwordIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig getPasswordIssuanceConfigs(int i) {
        return this.passwordIssuanceConfigs[i];
    }

    public void setPasswordIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordIssuanceConfig _value) {
        this.passwordIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the serverOTPIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig[] getServerOTPIssuanceConfigs() {
        return serverOTPIssuanceConfigs;
    }


    /**
     * Sets the serverOTPIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public void setServerOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig[] serverOTPIssuanceConfigs) {
        this.serverOTPIssuanceConfigs = serverOTPIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig getServerOTPIssuanceConfigs(int i) {
        return this.serverOTPIssuanceConfigs[i];
    }

    public void setServerOTPIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPIssuanceConfig _value) {
        this.serverOTPIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the oathIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return oathIssuanceConfigs   * OATH issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig[] getOathIssuanceConfigs() {
        return oathIssuanceConfigs;
    }


    /**
     * Sets the oathIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param oathIssuanceConfigs   * OATH issuance configurations.
     */
    public void setOathIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig[] oathIssuanceConfigs) {
        this.oathIssuanceConfigs = oathIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig getOathIssuanceConfigs(int i) {
        return this.oathIssuanceConfigs[i];
    }

    public void setOathIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHIssuanceConfig _value) {
        this.oathIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the arcotOTPIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig[] getArcotOTPIssuanceConfigs() {
        return arcotOTPIssuanceConfigs;
    }


    /**
     * Sets the arcotOTPIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public void setArcotOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig[] arcotOTPIssuanceConfigs) {
        this.arcotOTPIssuanceConfigs = arcotOTPIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig getArcotOTPIssuanceConfigs(int i) {
        return this.arcotOTPIssuanceConfigs[i];
    }

    public void setArcotOTPIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPIssuanceConfig _value) {
        this.arcotOTPIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the emvIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @return emvIssuanceConfigs   * EMV issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig[] getEmvIssuanceConfigs() {
        return emvIssuanceConfigs;
    }


    /**
     * Sets the emvIssuanceConfigs value for this ConfigurationsInput.
     * 
     * @param emvIssuanceConfigs   * EMV issuance configurations.
     */
    public void setEmvIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig[] emvIssuanceConfigs) {
        this.emvIssuanceConfigs = emvIssuanceConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig getEmvIssuanceConfigs(int i) {
        return this.emvIssuanceConfigs[i];
    }

    public void setEmvIssuanceConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVIssuanceConfig _value) {
        this.emvIssuanceConfigs[i] = _value;
    }


    /**
     * Gets the arcotIDAuthConfigs value for this ConfigurationsInput.
     * 
     * @return arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig[] getArcotIDAuthConfigs() {
        return arcotIDAuthConfigs;
    }


    /**
     * Sets the arcotIDAuthConfigs value for this ConfigurationsInput.
     * 
     * @param arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public void setArcotIDAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig[] arcotIDAuthConfigs) {
        this.arcotIDAuthConfigs = arcotIDAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig getArcotIDAuthConfigs(int i) {
        return this.arcotIDAuthConfigs[i];
    }

    public void setArcotIDAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotIDAuthConfig _value) {
        this.arcotIDAuthConfigs[i] = _value;
    }


    /**
     * Gets the qnaAuthConfigs value for this ConfigurationsInput.
     * 
     * @return qnaAuthConfigs   * QNA authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig[] getQnaAuthConfigs() {
        return qnaAuthConfigs;
    }


    /**
     * Sets the qnaAuthConfigs value for this ConfigurationsInput.
     * 
     * @param qnaAuthConfigs   * QNA authentication configurations.
     */
    public void setQnaAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig[] qnaAuthConfigs) {
        this.qnaAuthConfigs = qnaAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig getQnaAuthConfigs(int i) {
        return this.qnaAuthConfigs[i];
    }

    public void setQnaAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.QnAAuthConfig _value) {
        this.qnaAuthConfigs[i] = _value;
    }


    /**
     * Gets the passwordAuthConfigs value for this ConfigurationsInput.
     * 
     * @return passwordAuthConfigs   * Password authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig[] getPasswordAuthConfigs() {
        return passwordAuthConfigs;
    }


    /**
     * Sets the passwordAuthConfigs value for this ConfigurationsInput.
     * 
     * @param passwordAuthConfigs   * Password authentication configurations.
     */
    public void setPasswordAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig[] passwordAuthConfigs) {
        this.passwordAuthConfigs = passwordAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig getPasswordAuthConfigs(int i) {
        return this.passwordAuthConfigs[i];
    }

    public void setPasswordAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PasswordAuthConfig _value) {
        this.passwordAuthConfigs[i] = _value;
    }


    /**
     * Gets the serverOTPAuthConfigs value for this ConfigurationsInput.
     * 
     * @return serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig[] getServerOTPAuthConfigs() {
        return serverOTPAuthConfigs;
    }


    /**
     * Sets the serverOTPAuthConfigs value for this ConfigurationsInput.
     * 
     * @param serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public void setServerOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig[] serverOTPAuthConfigs) {
        this.serverOTPAuthConfigs = serverOTPAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig getServerOTPAuthConfigs(int i) {
        return this.serverOTPAuthConfigs[i];
    }

    public void setServerOTPAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ServerOTPAuthConfig _value) {
        this.serverOTPAuthConfigs[i] = _value;
    }


    /**
     * Gets the oathAuthConfigs value for this ConfigurationsInput.
     * 
     * @return oathAuthConfigs   * OATH authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig[] getOathAuthConfigs() {
        return oathAuthConfigs;
    }


    /**
     * Sets the oathAuthConfigs value for this ConfigurationsInput.
     * 
     * @param oathAuthConfigs   * OATH authentication configurations.
     */
    public void setOathAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig[] oathAuthConfigs) {
        this.oathAuthConfigs = oathAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig getOathAuthConfigs(int i) {
        return this.oathAuthConfigs[i];
    }

    public void setOathAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OATHAuthConfig _value) {
        this.oathAuthConfigs[i] = _value;
    }


    /**
     * Gets the arcotOTPAuthConfigs value for this ConfigurationsInput.
     * 
     * @return arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] getArcotOTPAuthConfigs() {
        return arcotOTPAuthConfigs;
    }


    /**
     * Sets the arcotOTPAuthConfigs value for this ConfigurationsInput.
     * 
     * @param arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public void setArcotOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig[] arcotOTPAuthConfigs) {
        this.arcotOTPAuthConfigs = arcotOTPAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig getArcotOTPAuthConfigs(int i) {
        return this.arcotOTPAuthConfigs[i];
    }

    public void setArcotOTPAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ArcotOTPAuthConfig _value) {
        this.arcotOTPAuthConfigs[i] = _value;
    }


    /**
     * Gets the emvAuthConfigs value for this ConfigurationsInput.
     * 
     * @return emvAuthConfigs   * EMV authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig[] getEmvAuthConfigs() {
        return emvAuthConfigs;
    }


    /**
     * Sets the emvAuthConfigs value for this ConfigurationsInput.
     * 
     * @param emvAuthConfigs   * EMV authentication configurations.
     */
    public void setEmvAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig[] emvAuthConfigs) {
        this.emvAuthConfigs = emvAuthConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig getEmvAuthConfigs(int i) {
        return this.emvAuthConfigs[i];
    }

    public void setEmvAuthConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EMVAuthConfig _value) {
        this.emvAuthConfigs[i] = _value;
    }


    /**
     * Gets the miscellaneousConfigs value for this ConfigurationsInput.
     * 
     * @return miscellaneousConfigs   * Miscellaneous configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig[] getMiscellaneousConfigs() {
        return miscellaneousConfigs;
    }


    /**
     * Sets the miscellaneousConfigs value for this ConfigurationsInput.
     * 
     * @param miscellaneousConfigs   * Miscellaneous configurations.
     */
    public void setMiscellaneousConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig[] miscellaneousConfigs) {
        this.miscellaneousConfigs = miscellaneousConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig getMiscellaneousConfigs(int i) {
        return this.miscellaneousConfigs[i];
    }

    public void setMiscellaneousConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.MiscellaneousConfig _value) {
        this.miscellaneousConfigs[i] = _value;
    }


    /**
     * Gets the keyConfigs value for this ConfigurationsInput.
     * 
     * @return keyConfigs   * Key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] getKeyConfigs() {
        return keyConfigs;
    }


    /**
     * Sets the keyConfigs value for this ConfigurationsInput.
     * 
     * @param keyConfigs   * Key configurations.
     */
    public void setKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig[] keyConfigs) {
        this.keyConfigs = keyConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig getKeyConfigs(int i) {
        return this.keyConfigs[i];
    }

    public void setKeyConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.KeyConfig _value) {
        this.keyConfigs[i] = _value;
    }


    /**
     * Gets the radiusClientConfigs value for this ConfigurationsInput.
     * 
     * @return radiusClientConfigs   * RADIUS client configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig[] getRadiusClientConfigs() {
        return radiusClientConfigs;
    }


    /**
     * Sets the radiusClientConfigs value for this ConfigurationsInput.
     * 
     * @param radiusClientConfigs   * RADIUS client configurations.
     */
    public void setRadiusClientConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig[] radiusClientConfigs) {
        this.radiusClientConfigs = radiusClientConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig getRadiusClientConfigs(int i) {
        return this.radiusClientConfigs[i];
    }

    public void setRadiusClientConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClientConfig _value) {
        this.radiusClientConfigs[i] = _value;
    }


    /**
     * Gets the radiusServerConfigs value for this ConfigurationsInput.
     * 
     * @return radiusServerConfigs   * RADIUS server configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig[] getRadiusServerConfigs() {
        return radiusServerConfigs;
    }


    /**
     * Sets the radiusServerConfigs value for this ConfigurationsInput.
     * 
     * @param radiusServerConfigs   * RADIUS server configurations.
     */
    public void setRadiusServerConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig[] radiusServerConfigs) {
        this.radiusServerConfigs = radiusServerConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig getRadiusServerConfigs(int i) {
        return this.radiusServerConfigs[i];
    }

    public void setRadiusServerConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServerConfig _value) {
        this.radiusServerConfigs[i] = _value;
    }


    /**
     * Gets the credTypeResolutionConfigs value for this ConfigurationsInput.
     * 
     * @return credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig[] getCredTypeResolutionConfigs() {
        return credTypeResolutionConfigs;
    }


    /**
     * Sets the credTypeResolutionConfigs value for this ConfigurationsInput.
     * 
     * @param credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public void setCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig[] credTypeResolutionConfigs) {
        this.credTypeResolutionConfigs = credTypeResolutionConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig getCredTypeResolutionConfigs(int i) {
        return this.credTypeResolutionConfigs[i];
    }

    public void setCredTypeResolutionConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CredTypeResolutionConfig _value) {
        this.credTypeResolutionConfigs[i] = _value;
    }


    /**
     * Gets the pluginConfigs value for this ConfigurationsInput.
     * 
     * @return pluginConfigs   * Plugin configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig[] getPluginConfigs() {
        return pluginConfigs;
    }


    /**
     * Sets the pluginConfigs value for this ConfigurationsInput.
     * 
     * @param pluginConfigs   * Plugin configurations.
     */
    public void setPluginConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig[] pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig getPluginConfigs(int i) {
        return this.pluginConfigs[i];
    }

    public void setPluginConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.PluginConfig _value) {
        this.pluginConfigs[i] = _value;
    }


    /**
     * Gets the calloutConfigs value for this ConfigurationsInput.
     * 
     * @return calloutConfigs   * Callout configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig[] getCalloutConfigs() {
        return calloutConfigs;
    }


    /**
     * Sets the calloutConfigs value for this ConfigurationsInput.
     * 
     * @param calloutConfigs   * Callout configurations.
     */
    public void setCalloutConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig[] calloutConfigs) {
        this.calloutConfigs = calloutConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig getCalloutConfigs(int i) {
        return this.calloutConfigs[i];
    }

    public void setCalloutConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.CalloutConfig _value) {
        this.calloutConfigs[i] = _value;
    }


    /**
     * Gets the asspConfigs value for this ConfigurationsInput.
     * 
     * @return asspConfigs   * ASSP configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig[] getAsspConfigs() {
        return asspConfigs;
    }


    /**
     * Sets the asspConfigs value for this ConfigurationsInput.
     * 
     * @param asspConfigs   * ASSP configurations.
     */
    public void setAsspConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig[] asspConfigs) {
        this.asspConfigs = asspConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig getAsspConfigs(int i) {
        return this.asspConfigs[i];
    }

    public void setAsspConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ASSPConfig _value) {
        this.asspConfigs[i] = _value;
    }


    /**
     * Gets the samlTokenConfigs value for this ConfigurationsInput.
     * 
     * @return samlTokenConfigs   * SAML token configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig[] getSamlTokenConfigs() {
        return samlTokenConfigs;
    }


    /**
     * Sets the samlTokenConfigs value for this ConfigurationsInput.
     * 
     * @param samlTokenConfigs   * SAML token configurations.
     */
    public void setSamlTokenConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig[] samlTokenConfigs) {
        this.samlTokenConfigs = samlTokenConfigs;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig getSamlTokenConfigs(int i) {
        return this.samlTokenConfigs[i];
    }

    public void setSamlTokenConfigs(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.SAMLTokenConfig _value) {
        this.samlTokenConfigs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationsInput)) return false;
        ConfigurationsInput other = (ConfigurationsInput) obj;
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
            ((this.radiusClientConfigs==null && other.getRadiusClientConfigs()==null) || 
             (this.radiusClientConfigs!=null &&
              java.util.Arrays.equals(this.radiusClientConfigs, other.getRadiusClientConfigs()))) &&
            ((this.radiusServerConfigs==null && other.getRadiusServerConfigs()==null) || 
             (this.radiusServerConfigs!=null &&
              java.util.Arrays.equals(this.radiusServerConfigs, other.getRadiusServerConfigs()))) &&
            ((this.credTypeResolutionConfigs==null && other.getCredTypeResolutionConfigs()==null) || 
             (this.credTypeResolutionConfigs!=null &&
              java.util.Arrays.equals(this.credTypeResolutionConfigs, other.getCredTypeResolutionConfigs()))) &&
            ((this.pluginConfigs==null && other.getPluginConfigs()==null) || 
             (this.pluginConfigs!=null &&
              java.util.Arrays.equals(this.pluginConfigs, other.getPluginConfigs()))) &&
            ((this.calloutConfigs==null && other.getCalloutConfigs()==null) || 
             (this.calloutConfigs!=null &&
              java.util.Arrays.equals(this.calloutConfigs, other.getCalloutConfigs()))) &&
            ((this.asspConfigs==null && other.getAsspConfigs()==null) || 
             (this.asspConfigs!=null &&
              java.util.Arrays.equals(this.asspConfigs, other.getAsspConfigs()))) &&
            ((this.samlTokenConfigs==null && other.getSamlTokenConfigs()==null) || 
             (this.samlTokenConfigs!=null &&
              java.util.Arrays.equals(this.samlTokenConfigs, other.getSamlTokenConfigs())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationsInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationsInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ServerOTPIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OATHIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EMVIssuanceConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "QnAAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ServerOTPAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OATHAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EMVAuthConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneousConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscellaneousConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "MiscellaneousConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "KeyConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClientConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClientConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClientConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredTypeResolutionConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PluginConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "calloutConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CalloutConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLTokenConfig"));
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
