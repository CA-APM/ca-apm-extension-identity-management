/**
 * ConfigurationObjectList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigurationObjectList is the structure used to
 * 				represent configurations for a particulat
 * 				organization in response.
 */
public class ConfigurationObjectList  implements java.io.Serializable {
    /* Organization details of the configurations. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDIssuanceConfigs arcotIDIssuanceConfigs;

    /* QNA issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaIssuanceConfigs qnaIssuanceConfigs;

    /* Password issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordIssuanceConfigs passwordIssuanceConfigs;

    /* Server OTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPIssuanceConfigs serverOTPIssuanceConfigs;

    /* OATH issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathIssuanceConfigs oathIssuanceConfigs;

    /* ArcotOTP issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPIssuanceConfigs arcotOTPIssuanceConfigs;

    /* EMV issuance configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvIssuanceConfigs emvIssuanceConfigs;

    /* ArcotID authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDAuthConfigs arcotIDAuthConfigs;

    /* QNA authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaAuthConfigs qnaAuthConfigs;

    /* Password authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordAuthConfigs passwordAuthConfigs;

    /* Server OTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPAuthConfigs serverOTPAuthConfigs;

    /* OATH authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathAuthConfigs oathAuthConfigs;

    /* ArcotOTP authentication configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPAuthConfigs arcotOTPAuthConfigs;

    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvAuthConfigs emvAuthConfigs;

    /* Miscellaneous configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListMiscellaneousConfigs miscellaneousConfigs;

    /* Key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListKeyConfigs keyConfigs;

    /* ArcotID domain key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDDomainKeyConfigs arcotIDDomainKeyConfigs;

    /* OATH OTP master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathOTPMasterKeyConfigs oathOTPMasterKeyConfigs;

    /* ArcotOTP master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPMasterKeyConfigs arcotOTPMasterKeyConfigs;

    /* EMV OTP master key configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvOTPMasterKeyConfigs emvOTPMasterKeyConfigs;

    /* RADIUS client configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusClientConfigs radiusClientConfigs;

    /* RADIUS server configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusServerConfigs radiusServerConfigs;

    /* Credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCredTypeResolutionConfigs credTypeResolutionConfigs;

    /* RADIUS credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusCredTypeResolutionConfigs radiusCredTypeResolutionConfigs;

    /* ASSP credential type resolution configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspCredTypeResolutionConfigs asspCredTypeResolutionConfigs;

    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPluginConfigs pluginConfigs;

    /* Callout configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCalloutConfigs calloutConfigs;

    /* ASSP configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspConfigs asspConfigs;

    /* SAML token configurations. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListSamlTokenConfigs samlTokenConfigs;

    public ConfigurationObjectList() {
    }

    public ConfigurationObjectList(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDIssuanceConfigs arcotIDIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaIssuanceConfigs qnaIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordIssuanceConfigs passwordIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPIssuanceConfigs serverOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathIssuanceConfigs oathIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPIssuanceConfigs arcotOTPIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvIssuanceConfigs emvIssuanceConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDAuthConfigs arcotIDAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaAuthConfigs qnaAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordAuthConfigs passwordAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPAuthConfigs serverOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathAuthConfigs oathAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPAuthConfigs arcotOTPAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvAuthConfigs emvAuthConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListMiscellaneousConfigs miscellaneousConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListKeyConfigs keyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDDomainKeyConfigs arcotIDDomainKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathOTPMasterKeyConfigs oathOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPMasterKeyConfigs arcotOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvOTPMasterKeyConfigs emvOTPMasterKeyConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusClientConfigs radiusClientConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusServerConfigs radiusServerConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCredTypeResolutionConfigs credTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusCredTypeResolutionConfigs radiusCredTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspCredTypeResolutionConfigs asspCredTypeResolutionConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPluginConfigs pluginConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCalloutConfigs calloutConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspConfigs asspConfigs,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListSamlTokenConfigs samlTokenConfigs) {
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
           this.credTypeResolutionConfigs = credTypeResolutionConfigs;
           this.radiusCredTypeResolutionConfigs = radiusCredTypeResolutionConfigs;
           this.asspCredTypeResolutionConfigs = asspCredTypeResolutionConfigs;
           this.pluginConfigs = pluginConfigs;
           this.calloutConfigs = calloutConfigs;
           this.asspConfigs = asspConfigs;
           this.samlTokenConfigs = samlTokenConfigs;
    }


    /**
     * Gets the orgDetails value for this ConfigurationObjectList.
     * 
     * @return orgDetails   * Organization details of the configurations.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this ConfigurationObjectList.
     * 
     * @param orgDetails   * Organization details of the configurations.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDIssuanceConfigs getArcotIDIssuanceConfigs() {
        return arcotIDIssuanceConfigs;
    }


    /**
     * Sets the arcotIDIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotIDIssuanceConfigs   * ArcotID issuance configurations.
     */
    public void setArcotIDIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDIssuanceConfigs arcotIDIssuanceConfigs) {
        this.arcotIDIssuanceConfigs = arcotIDIssuanceConfigs;
    }


    /**
     * Gets the qnaIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return qnaIssuanceConfigs   * QNA issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaIssuanceConfigs getQnaIssuanceConfigs() {
        return qnaIssuanceConfigs;
    }


    /**
     * Sets the qnaIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param qnaIssuanceConfigs   * QNA issuance configurations.
     */
    public void setQnaIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaIssuanceConfigs qnaIssuanceConfigs) {
        this.qnaIssuanceConfigs = qnaIssuanceConfigs;
    }


    /**
     * Gets the passwordIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return passwordIssuanceConfigs   * Password issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordIssuanceConfigs getPasswordIssuanceConfigs() {
        return passwordIssuanceConfigs;
    }


    /**
     * Sets the passwordIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param passwordIssuanceConfigs   * Password issuance configurations.
     */
    public void setPasswordIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordIssuanceConfigs passwordIssuanceConfigs) {
        this.passwordIssuanceConfigs = passwordIssuanceConfigs;
    }


    /**
     * Gets the serverOTPIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPIssuanceConfigs getServerOTPIssuanceConfigs() {
        return serverOTPIssuanceConfigs;
    }


    /**
     * Sets the serverOTPIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param serverOTPIssuanceConfigs   * Server OTP issuance configurations.
     */
    public void setServerOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPIssuanceConfigs serverOTPIssuanceConfigs) {
        this.serverOTPIssuanceConfigs = serverOTPIssuanceConfigs;
    }


    /**
     * Gets the oathIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return oathIssuanceConfigs   * OATH issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathIssuanceConfigs getOathIssuanceConfigs() {
        return oathIssuanceConfigs;
    }


    /**
     * Sets the oathIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param oathIssuanceConfigs   * OATH issuance configurations.
     */
    public void setOathIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathIssuanceConfigs oathIssuanceConfigs) {
        this.oathIssuanceConfigs = oathIssuanceConfigs;
    }


    /**
     * Gets the arcotOTPIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPIssuanceConfigs getArcotOTPIssuanceConfigs() {
        return arcotOTPIssuanceConfigs;
    }


    /**
     * Sets the arcotOTPIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotOTPIssuanceConfigs   * ArcotOTP issuance configurations.
     */
    public void setArcotOTPIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPIssuanceConfigs arcotOTPIssuanceConfigs) {
        this.arcotOTPIssuanceConfigs = arcotOTPIssuanceConfigs;
    }


    /**
     * Gets the emvIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @return emvIssuanceConfigs   * EMV issuance configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvIssuanceConfigs getEmvIssuanceConfigs() {
        return emvIssuanceConfigs;
    }


    /**
     * Sets the emvIssuanceConfigs value for this ConfigurationObjectList.
     * 
     * @param emvIssuanceConfigs   * EMV issuance configurations.
     */
    public void setEmvIssuanceConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvIssuanceConfigs emvIssuanceConfigs) {
        this.emvIssuanceConfigs = emvIssuanceConfigs;
    }


    /**
     * Gets the arcotIDAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDAuthConfigs getArcotIDAuthConfigs() {
        return arcotIDAuthConfigs;
    }


    /**
     * Sets the arcotIDAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotIDAuthConfigs   * ArcotID authentication configurations.
     */
    public void setArcotIDAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDAuthConfigs arcotIDAuthConfigs) {
        this.arcotIDAuthConfigs = arcotIDAuthConfigs;
    }


    /**
     * Gets the qnaAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return qnaAuthConfigs   * QNA authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaAuthConfigs getQnaAuthConfigs() {
        return qnaAuthConfigs;
    }


    /**
     * Sets the qnaAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param qnaAuthConfigs   * QNA authentication configurations.
     */
    public void setQnaAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListQnaAuthConfigs qnaAuthConfigs) {
        this.qnaAuthConfigs = qnaAuthConfigs;
    }


    /**
     * Gets the passwordAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return passwordAuthConfigs   * Password authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordAuthConfigs getPasswordAuthConfigs() {
        return passwordAuthConfigs;
    }


    /**
     * Sets the passwordAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param passwordAuthConfigs   * Password authentication configurations.
     */
    public void setPasswordAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPasswordAuthConfigs passwordAuthConfigs) {
        this.passwordAuthConfigs = passwordAuthConfigs;
    }


    /**
     * Gets the serverOTPAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPAuthConfigs getServerOTPAuthConfigs() {
        return serverOTPAuthConfigs;
    }


    /**
     * Sets the serverOTPAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param serverOTPAuthConfigs   * Server OTP authentication configurations.
     */
    public void setServerOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListServerOTPAuthConfigs serverOTPAuthConfigs) {
        this.serverOTPAuthConfigs = serverOTPAuthConfigs;
    }


    /**
     * Gets the oathAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return oathAuthConfigs   * OATH authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathAuthConfigs getOathAuthConfigs() {
        return oathAuthConfigs;
    }


    /**
     * Sets the oathAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param oathAuthConfigs   * OATH authentication configurations.
     */
    public void setOathAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathAuthConfigs oathAuthConfigs) {
        this.oathAuthConfigs = oathAuthConfigs;
    }


    /**
     * Gets the arcotOTPAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPAuthConfigs getArcotOTPAuthConfigs() {
        return arcotOTPAuthConfigs;
    }


    /**
     * Sets the arcotOTPAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotOTPAuthConfigs   * ArcotOTP authentication configurations.
     */
    public void setArcotOTPAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPAuthConfigs arcotOTPAuthConfigs) {
        this.arcotOTPAuthConfigs = arcotOTPAuthConfigs;
    }


    /**
     * Gets the emvAuthConfigs value for this ConfigurationObjectList.
     * 
     * @return emvAuthConfigs
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvAuthConfigs getEmvAuthConfigs() {
        return emvAuthConfigs;
    }


    /**
     * Sets the emvAuthConfigs value for this ConfigurationObjectList.
     * 
     * @param emvAuthConfigs
     */
    public void setEmvAuthConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvAuthConfigs emvAuthConfigs) {
        this.emvAuthConfigs = emvAuthConfigs;
    }


    /**
     * Gets the miscellaneousConfigs value for this ConfigurationObjectList.
     * 
     * @return miscellaneousConfigs   * Miscellaneous configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListMiscellaneousConfigs getMiscellaneousConfigs() {
        return miscellaneousConfigs;
    }


    /**
     * Sets the miscellaneousConfigs value for this ConfigurationObjectList.
     * 
     * @param miscellaneousConfigs   * Miscellaneous configurations.
     */
    public void setMiscellaneousConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListMiscellaneousConfigs miscellaneousConfigs) {
        this.miscellaneousConfigs = miscellaneousConfigs;
    }


    /**
     * Gets the keyConfigs value for this ConfigurationObjectList.
     * 
     * @return keyConfigs   * Key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListKeyConfigs getKeyConfigs() {
        return keyConfigs;
    }


    /**
     * Sets the keyConfigs value for this ConfigurationObjectList.
     * 
     * @param keyConfigs   * Key configurations.
     */
    public void setKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListKeyConfigs keyConfigs) {
        this.keyConfigs = keyConfigs;
    }


    /**
     * Gets the arcotIDDomainKeyConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotIDDomainKeyConfigs   * ArcotID domain key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDDomainKeyConfigs getArcotIDDomainKeyConfigs() {
        return arcotIDDomainKeyConfigs;
    }


    /**
     * Sets the arcotIDDomainKeyConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotIDDomainKeyConfigs   * ArcotID domain key configurations.
     */
    public void setArcotIDDomainKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotIDDomainKeyConfigs arcotIDDomainKeyConfigs) {
        this.arcotIDDomainKeyConfigs = arcotIDDomainKeyConfigs;
    }


    /**
     * Gets the oathOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @return oathOTPMasterKeyConfigs   * OATH OTP master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathOTPMasterKeyConfigs getOathOTPMasterKeyConfigs() {
        return oathOTPMasterKeyConfigs;
    }


    /**
     * Sets the oathOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @param oathOTPMasterKeyConfigs   * OATH OTP master key configurations.
     */
    public void setOathOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListOathOTPMasterKeyConfigs oathOTPMasterKeyConfigs) {
        this.oathOTPMasterKeyConfigs = oathOTPMasterKeyConfigs;
    }


    /**
     * Gets the arcotOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @return arcotOTPMasterKeyConfigs   * ArcotOTP master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPMasterKeyConfigs getArcotOTPMasterKeyConfigs() {
        return arcotOTPMasterKeyConfigs;
    }


    /**
     * Sets the arcotOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @param arcotOTPMasterKeyConfigs   * ArcotOTP master key configurations.
     */
    public void setArcotOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListArcotOTPMasterKeyConfigs arcotOTPMasterKeyConfigs) {
        this.arcotOTPMasterKeyConfigs = arcotOTPMasterKeyConfigs;
    }


    /**
     * Gets the emvOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @return emvOTPMasterKeyConfigs   * EMV OTP master key configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvOTPMasterKeyConfigs getEmvOTPMasterKeyConfigs() {
        return emvOTPMasterKeyConfigs;
    }


    /**
     * Sets the emvOTPMasterKeyConfigs value for this ConfigurationObjectList.
     * 
     * @param emvOTPMasterKeyConfigs   * EMV OTP master key configurations.
     */
    public void setEmvOTPMasterKeyConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListEmvOTPMasterKeyConfigs emvOTPMasterKeyConfigs) {
        this.emvOTPMasterKeyConfigs = emvOTPMasterKeyConfigs;
    }


    /**
     * Gets the radiusClientConfigs value for this ConfigurationObjectList.
     * 
     * @return radiusClientConfigs   * RADIUS client configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusClientConfigs getRadiusClientConfigs() {
        return radiusClientConfigs;
    }


    /**
     * Sets the radiusClientConfigs value for this ConfigurationObjectList.
     * 
     * @param radiusClientConfigs   * RADIUS client configurations.
     */
    public void setRadiusClientConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusClientConfigs radiusClientConfigs) {
        this.radiusClientConfigs = radiusClientConfigs;
    }


    /**
     * Gets the radiusServerConfigs value for this ConfigurationObjectList.
     * 
     * @return radiusServerConfigs   * RADIUS server configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusServerConfigs getRadiusServerConfigs() {
        return radiusServerConfigs;
    }


    /**
     * Sets the radiusServerConfigs value for this ConfigurationObjectList.
     * 
     * @param radiusServerConfigs   * RADIUS server configurations.
     */
    public void setRadiusServerConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusServerConfigs radiusServerConfigs) {
        this.radiusServerConfigs = radiusServerConfigs;
    }


    /**
     * Gets the credTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @return credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCredTypeResolutionConfigs getCredTypeResolutionConfigs() {
        return credTypeResolutionConfigs;
    }


    /**
     * Sets the credTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @param credTypeResolutionConfigs   * Credential type resolution configurations.
     */
    public void setCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCredTypeResolutionConfigs credTypeResolutionConfigs) {
        this.credTypeResolutionConfigs = credTypeResolutionConfigs;
    }


    /**
     * Gets the radiusCredTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @return radiusCredTypeResolutionConfigs   * RADIUS credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusCredTypeResolutionConfigs getRadiusCredTypeResolutionConfigs() {
        return radiusCredTypeResolutionConfigs;
    }


    /**
     * Sets the radiusCredTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @param radiusCredTypeResolutionConfigs   * RADIUS credential type resolution configurations.
     */
    public void setRadiusCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListRadiusCredTypeResolutionConfigs radiusCredTypeResolutionConfigs) {
        this.radiusCredTypeResolutionConfigs = radiusCredTypeResolutionConfigs;
    }


    /**
     * Gets the asspCredTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @return asspCredTypeResolutionConfigs   * ASSP credential type resolution configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspCredTypeResolutionConfigs getAsspCredTypeResolutionConfigs() {
        return asspCredTypeResolutionConfigs;
    }


    /**
     * Sets the asspCredTypeResolutionConfigs value for this ConfigurationObjectList.
     * 
     * @param asspCredTypeResolutionConfigs   * ASSP credential type resolution configurations.
     */
    public void setAsspCredTypeResolutionConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspCredTypeResolutionConfigs asspCredTypeResolutionConfigs) {
        this.asspCredTypeResolutionConfigs = asspCredTypeResolutionConfigs;
    }


    /**
     * Gets the pluginConfigs value for this ConfigurationObjectList.
     * 
     * @return pluginConfigs
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPluginConfigs getPluginConfigs() {
        return pluginConfigs;
    }


    /**
     * Sets the pluginConfigs value for this ConfigurationObjectList.
     * 
     * @param pluginConfigs
     */
    public void setPluginConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListPluginConfigs pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }


    /**
     * Gets the calloutConfigs value for this ConfigurationObjectList.
     * 
     * @return calloutConfigs   * Callout configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCalloutConfigs getCalloutConfigs() {
        return calloutConfigs;
    }


    /**
     * Sets the calloutConfigs value for this ConfigurationObjectList.
     * 
     * @param calloutConfigs   * Callout configurations.
     */
    public void setCalloutConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListCalloutConfigs calloutConfigs) {
        this.calloutConfigs = calloutConfigs;
    }


    /**
     * Gets the asspConfigs value for this ConfigurationObjectList.
     * 
     * @return asspConfigs   * ASSP configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspConfigs getAsspConfigs() {
        return asspConfigs;
    }


    /**
     * Sets the asspConfigs value for this ConfigurationObjectList.
     * 
     * @param asspConfigs   * ASSP configurations.
     */
    public void setAsspConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListAsspConfigs asspConfigs) {
        this.asspConfigs = asspConfigs;
    }


    /**
     * Gets the samlTokenConfigs value for this ConfigurationObjectList.
     * 
     * @return samlTokenConfigs   * SAML token configurations.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListSamlTokenConfigs getSamlTokenConfigs() {
        return samlTokenConfigs;
    }


    /**
     * Sets the samlTokenConfigs value for this ConfigurationObjectList.
     * 
     * @param samlTokenConfigs   * SAML token configurations.
     */
    public void setSamlTokenConfigs(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationObjectListSamlTokenConfigs samlTokenConfigs) {
        this.samlTokenConfigs = samlTokenConfigs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationObjectList)) return false;
        ConfigurationObjectList other = (ConfigurationObjectList) obj;
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
              this.arcotIDIssuanceConfigs.equals(other.getArcotIDIssuanceConfigs()))) &&
            ((this.qnaIssuanceConfigs==null && other.getQnaIssuanceConfigs()==null) || 
             (this.qnaIssuanceConfigs!=null &&
              this.qnaIssuanceConfigs.equals(other.getQnaIssuanceConfigs()))) &&
            ((this.passwordIssuanceConfigs==null && other.getPasswordIssuanceConfigs()==null) || 
             (this.passwordIssuanceConfigs!=null &&
              this.passwordIssuanceConfigs.equals(other.getPasswordIssuanceConfigs()))) &&
            ((this.serverOTPIssuanceConfigs==null && other.getServerOTPIssuanceConfigs()==null) || 
             (this.serverOTPIssuanceConfigs!=null &&
              this.serverOTPIssuanceConfigs.equals(other.getServerOTPIssuanceConfigs()))) &&
            ((this.oathIssuanceConfigs==null && other.getOathIssuanceConfigs()==null) || 
             (this.oathIssuanceConfigs!=null &&
              this.oathIssuanceConfigs.equals(other.getOathIssuanceConfigs()))) &&
            ((this.arcotOTPIssuanceConfigs==null && other.getArcotOTPIssuanceConfigs()==null) || 
             (this.arcotOTPIssuanceConfigs!=null &&
              this.arcotOTPIssuanceConfigs.equals(other.getArcotOTPIssuanceConfigs()))) &&
            ((this.emvIssuanceConfigs==null && other.getEmvIssuanceConfigs()==null) || 
             (this.emvIssuanceConfigs!=null &&
              this.emvIssuanceConfigs.equals(other.getEmvIssuanceConfigs()))) &&
            ((this.arcotIDAuthConfigs==null && other.getArcotIDAuthConfigs()==null) || 
             (this.arcotIDAuthConfigs!=null &&
              this.arcotIDAuthConfigs.equals(other.getArcotIDAuthConfigs()))) &&
            ((this.qnaAuthConfigs==null && other.getQnaAuthConfigs()==null) || 
             (this.qnaAuthConfigs!=null &&
              this.qnaAuthConfigs.equals(other.getQnaAuthConfigs()))) &&
            ((this.passwordAuthConfigs==null && other.getPasswordAuthConfigs()==null) || 
             (this.passwordAuthConfigs!=null &&
              this.passwordAuthConfigs.equals(other.getPasswordAuthConfigs()))) &&
            ((this.serverOTPAuthConfigs==null && other.getServerOTPAuthConfigs()==null) || 
             (this.serverOTPAuthConfigs!=null &&
              this.serverOTPAuthConfigs.equals(other.getServerOTPAuthConfigs()))) &&
            ((this.oathAuthConfigs==null && other.getOathAuthConfigs()==null) || 
             (this.oathAuthConfigs!=null &&
              this.oathAuthConfigs.equals(other.getOathAuthConfigs()))) &&
            ((this.arcotOTPAuthConfigs==null && other.getArcotOTPAuthConfigs()==null) || 
             (this.arcotOTPAuthConfigs!=null &&
              this.arcotOTPAuthConfigs.equals(other.getArcotOTPAuthConfigs()))) &&
            ((this.emvAuthConfigs==null && other.getEmvAuthConfigs()==null) || 
             (this.emvAuthConfigs!=null &&
              this.emvAuthConfigs.equals(other.getEmvAuthConfigs()))) &&
            ((this.miscellaneousConfigs==null && other.getMiscellaneousConfigs()==null) || 
             (this.miscellaneousConfigs!=null &&
              this.miscellaneousConfigs.equals(other.getMiscellaneousConfigs()))) &&
            ((this.keyConfigs==null && other.getKeyConfigs()==null) || 
             (this.keyConfigs!=null &&
              this.keyConfigs.equals(other.getKeyConfigs()))) &&
            ((this.arcotIDDomainKeyConfigs==null && other.getArcotIDDomainKeyConfigs()==null) || 
             (this.arcotIDDomainKeyConfigs!=null &&
              this.arcotIDDomainKeyConfigs.equals(other.getArcotIDDomainKeyConfigs()))) &&
            ((this.oathOTPMasterKeyConfigs==null && other.getOathOTPMasterKeyConfigs()==null) || 
             (this.oathOTPMasterKeyConfigs!=null &&
              this.oathOTPMasterKeyConfigs.equals(other.getOathOTPMasterKeyConfigs()))) &&
            ((this.arcotOTPMasterKeyConfigs==null && other.getArcotOTPMasterKeyConfigs()==null) || 
             (this.arcotOTPMasterKeyConfigs!=null &&
              this.arcotOTPMasterKeyConfigs.equals(other.getArcotOTPMasterKeyConfigs()))) &&
            ((this.emvOTPMasterKeyConfigs==null && other.getEmvOTPMasterKeyConfigs()==null) || 
             (this.emvOTPMasterKeyConfigs!=null &&
              this.emvOTPMasterKeyConfigs.equals(other.getEmvOTPMasterKeyConfigs()))) &&
            ((this.radiusClientConfigs==null && other.getRadiusClientConfigs()==null) || 
             (this.radiusClientConfigs!=null &&
              this.radiusClientConfigs.equals(other.getRadiusClientConfigs()))) &&
            ((this.radiusServerConfigs==null && other.getRadiusServerConfigs()==null) || 
             (this.radiusServerConfigs!=null &&
              this.radiusServerConfigs.equals(other.getRadiusServerConfigs()))) &&
            ((this.credTypeResolutionConfigs==null && other.getCredTypeResolutionConfigs()==null) || 
             (this.credTypeResolutionConfigs!=null &&
              this.credTypeResolutionConfigs.equals(other.getCredTypeResolutionConfigs()))) &&
            ((this.radiusCredTypeResolutionConfigs==null && other.getRadiusCredTypeResolutionConfigs()==null) || 
             (this.radiusCredTypeResolutionConfigs!=null &&
              this.radiusCredTypeResolutionConfigs.equals(other.getRadiusCredTypeResolutionConfigs()))) &&
            ((this.asspCredTypeResolutionConfigs==null && other.getAsspCredTypeResolutionConfigs()==null) || 
             (this.asspCredTypeResolutionConfigs!=null &&
              this.asspCredTypeResolutionConfigs.equals(other.getAsspCredTypeResolutionConfigs()))) &&
            ((this.pluginConfigs==null && other.getPluginConfigs()==null) || 
             (this.pluginConfigs!=null &&
              this.pluginConfigs.equals(other.getPluginConfigs()))) &&
            ((this.calloutConfigs==null && other.getCalloutConfigs()==null) || 
             (this.calloutConfigs!=null &&
              this.calloutConfigs.equals(other.getCalloutConfigs()))) &&
            ((this.asspConfigs==null && other.getAsspConfigs()==null) || 
             (this.asspConfigs!=null &&
              this.asspConfigs.equals(other.getAsspConfigs()))) &&
            ((this.samlTokenConfigs==null && other.getSamlTokenConfigs()==null) || 
             (this.samlTokenConfigs!=null &&
              this.samlTokenConfigs.equals(other.getSamlTokenConfigs())));
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
            _hashCode += getArcotIDIssuanceConfigs().hashCode();
        }
        if (getQnaIssuanceConfigs() != null) {
            _hashCode += getQnaIssuanceConfigs().hashCode();
        }
        if (getPasswordIssuanceConfigs() != null) {
            _hashCode += getPasswordIssuanceConfigs().hashCode();
        }
        if (getServerOTPIssuanceConfigs() != null) {
            _hashCode += getServerOTPIssuanceConfigs().hashCode();
        }
        if (getOathIssuanceConfigs() != null) {
            _hashCode += getOathIssuanceConfigs().hashCode();
        }
        if (getArcotOTPIssuanceConfigs() != null) {
            _hashCode += getArcotOTPIssuanceConfigs().hashCode();
        }
        if (getEmvIssuanceConfigs() != null) {
            _hashCode += getEmvIssuanceConfigs().hashCode();
        }
        if (getArcotIDAuthConfigs() != null) {
            _hashCode += getArcotIDAuthConfigs().hashCode();
        }
        if (getQnaAuthConfigs() != null) {
            _hashCode += getQnaAuthConfigs().hashCode();
        }
        if (getPasswordAuthConfigs() != null) {
            _hashCode += getPasswordAuthConfigs().hashCode();
        }
        if (getServerOTPAuthConfigs() != null) {
            _hashCode += getServerOTPAuthConfigs().hashCode();
        }
        if (getOathAuthConfigs() != null) {
            _hashCode += getOathAuthConfigs().hashCode();
        }
        if (getArcotOTPAuthConfigs() != null) {
            _hashCode += getArcotOTPAuthConfigs().hashCode();
        }
        if (getEmvAuthConfigs() != null) {
            _hashCode += getEmvAuthConfigs().hashCode();
        }
        if (getMiscellaneousConfigs() != null) {
            _hashCode += getMiscellaneousConfigs().hashCode();
        }
        if (getKeyConfigs() != null) {
            _hashCode += getKeyConfigs().hashCode();
        }
        if (getArcotIDDomainKeyConfigs() != null) {
            _hashCode += getArcotIDDomainKeyConfigs().hashCode();
        }
        if (getOathOTPMasterKeyConfigs() != null) {
            _hashCode += getOathOTPMasterKeyConfigs().hashCode();
        }
        if (getArcotOTPMasterKeyConfigs() != null) {
            _hashCode += getArcotOTPMasterKeyConfigs().hashCode();
        }
        if (getEmvOTPMasterKeyConfigs() != null) {
            _hashCode += getEmvOTPMasterKeyConfigs().hashCode();
        }
        if (getRadiusClientConfigs() != null) {
            _hashCode += getRadiusClientConfigs().hashCode();
        }
        if (getRadiusServerConfigs() != null) {
            _hashCode += getRadiusServerConfigs().hashCode();
        }
        if (getCredTypeResolutionConfigs() != null) {
            _hashCode += getCredTypeResolutionConfigs().hashCode();
        }
        if (getRadiusCredTypeResolutionConfigs() != null) {
            _hashCode += getRadiusCredTypeResolutionConfigs().hashCode();
        }
        if (getAsspCredTypeResolutionConfigs() != null) {
            _hashCode += getAsspCredTypeResolutionConfigs().hashCode();
        }
        if (getPluginConfigs() != null) {
            _hashCode += getPluginConfigs().hashCode();
        }
        if (getCalloutConfigs() != null) {
            _hashCode += getCalloutConfigs().hashCode();
        }
        if (getAsspConfigs() != null) {
            _hashCode += getAsspConfigs().hashCode();
        }
        if (getSamlTokenConfigs() != null) {
            _hashCode += getSamlTokenConfigs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationObjectList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationObjectList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>qnaIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>passwordIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>serverOTPIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvIssuanceConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>qnaAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>passwordAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>serverOTPAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvAuthConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneousConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscellaneousConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>miscellaneousConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>keyConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDDomainKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDDomainKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotIDDomainKeyConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>oathOTPMasterKeyConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>arcotOTPMasterKeyConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvOTPMasterKeyConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvOTPMasterKeyConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>emvOTPMasterKeyConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClientConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClientConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusClientConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusServerConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>credTypeResolutionConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusCredTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusCredTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>radiusCredTypeResolutionConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspCredTypeResolutionConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspCredTypeResolutionConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>asspCredTypeResolutionConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>pluginConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "calloutConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>calloutConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>asspConfigs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", ">ConfigurationObjectList>samlTokenConfigs"));
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
