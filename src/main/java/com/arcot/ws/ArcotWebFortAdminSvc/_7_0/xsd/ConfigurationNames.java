/**
 * ConfigurationNames.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ConfigurationNames is the structure used to
 * 				represent configuration names for a particular
 * 				organization.
 */
public class ConfigurationNames  implements java.io.Serializable {
    /* Organization details of the configuration names. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDIssuanceConfigNames;

    /* QnA issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaIssuanceConfigNames;

    /* Password issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordIssuanceConfigNames;

    /* Server OTP issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPIssuanceConfigNames;

    /* OATH issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathIssuanceConfigNames;

    /* ArcotOTP issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPIssuanceConfigNames;

    /* EMV issuance configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvIssuanceConfigNames;

    /* ArcotID authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDAuthConfigNames;

    /* QnA authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaAuthConfigNames;

    /* Password authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordAuthConfigNames;

    /* Server OTP authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPAuthConfigNames;

    /* OATH authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathAuthConfigNames;

    /* ArcotOTP authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPAuthConfigNames;

    /* EMV authentication configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvAuthConfigNames;

    /* Miscellaneous configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter miscellaneousConfigNames;

    /* Key configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter keyConfigNames;

    /* RADIUS client configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusClientConfigNames;

    /* RADIUS server configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusServerConfigNames;

    /* ASSP configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter asspConfigNames;

    /* SAML token configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter samlTokenConfigNames;

    /* Credential type resolution configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter credTypeResolutionConfigNames;

    /* Plugin configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter pluginConfigNames;

    /* Callout configuration names. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter calloutConfigNames;

    public ConfigurationNames() {
    }

    public ConfigurationNames(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvIssuanceConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvAuthConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter miscellaneousConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter keyConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusClientConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusServerConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter asspConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter samlTokenConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter credTypeResolutionConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter pluginConfigNames,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter calloutConfigNames) {
           this.orgDetails = orgDetails;
           this.arcotIDIssuanceConfigNames = arcotIDIssuanceConfigNames;
           this.qnaIssuanceConfigNames = qnaIssuanceConfigNames;
           this.passwordIssuanceConfigNames = passwordIssuanceConfigNames;
           this.serverOTPIssuanceConfigNames = serverOTPIssuanceConfigNames;
           this.oathIssuanceConfigNames = oathIssuanceConfigNames;
           this.arcotOTPIssuanceConfigNames = arcotOTPIssuanceConfigNames;
           this.emvIssuanceConfigNames = emvIssuanceConfigNames;
           this.arcotIDAuthConfigNames = arcotIDAuthConfigNames;
           this.qnaAuthConfigNames = qnaAuthConfigNames;
           this.passwordAuthConfigNames = passwordAuthConfigNames;
           this.serverOTPAuthConfigNames = serverOTPAuthConfigNames;
           this.oathAuthConfigNames = oathAuthConfigNames;
           this.arcotOTPAuthConfigNames = arcotOTPAuthConfigNames;
           this.emvAuthConfigNames = emvAuthConfigNames;
           this.miscellaneousConfigNames = miscellaneousConfigNames;
           this.keyConfigNames = keyConfigNames;
           this.radiusClientConfigNames = radiusClientConfigNames;
           this.radiusServerConfigNames = radiusServerConfigNames;
           this.asspConfigNames = asspConfigNames;
           this.samlTokenConfigNames = samlTokenConfigNames;
           this.credTypeResolutionConfigNames = credTypeResolutionConfigNames;
           this.pluginConfigNames = pluginConfigNames;
           this.calloutConfigNames = calloutConfigNames;
    }


    /**
     * Gets the orgDetails value for this ConfigurationNames.
     * 
     * @return orgDetails   * Organization details of the configuration names.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this ConfigurationNames.
     * 
     * @param orgDetails   * Organization details of the configuration names.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return arcotIDIssuanceConfigNames   * ArcotID issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getArcotIDIssuanceConfigNames() {
        return arcotIDIssuanceConfigNames;
    }


    /**
     * Sets the arcotIDIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param arcotIDIssuanceConfigNames   * ArcotID issuance configuration names.
     */
    public void setArcotIDIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDIssuanceConfigNames) {
        this.arcotIDIssuanceConfigNames = arcotIDIssuanceConfigNames;
    }


    /**
     * Gets the qnaIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return qnaIssuanceConfigNames   * QnA issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getQnaIssuanceConfigNames() {
        return qnaIssuanceConfigNames;
    }


    /**
     * Sets the qnaIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param qnaIssuanceConfigNames   * QnA issuance configuration names.
     */
    public void setQnaIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaIssuanceConfigNames) {
        this.qnaIssuanceConfigNames = qnaIssuanceConfigNames;
    }


    /**
     * Gets the passwordIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return passwordIssuanceConfigNames   * Password issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getPasswordIssuanceConfigNames() {
        return passwordIssuanceConfigNames;
    }


    /**
     * Sets the passwordIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param passwordIssuanceConfigNames   * Password issuance configuration names.
     */
    public void setPasswordIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordIssuanceConfigNames) {
        this.passwordIssuanceConfigNames = passwordIssuanceConfigNames;
    }


    /**
     * Gets the serverOTPIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return serverOTPIssuanceConfigNames   * Server OTP issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getServerOTPIssuanceConfigNames() {
        return serverOTPIssuanceConfigNames;
    }


    /**
     * Sets the serverOTPIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param serverOTPIssuanceConfigNames   * Server OTP issuance configuration names.
     */
    public void setServerOTPIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPIssuanceConfigNames) {
        this.serverOTPIssuanceConfigNames = serverOTPIssuanceConfigNames;
    }


    /**
     * Gets the oathIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return oathIssuanceConfigNames   * OATH issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getOathIssuanceConfigNames() {
        return oathIssuanceConfigNames;
    }


    /**
     * Sets the oathIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param oathIssuanceConfigNames   * OATH issuance configuration names.
     */
    public void setOathIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathIssuanceConfigNames) {
        this.oathIssuanceConfigNames = oathIssuanceConfigNames;
    }


    /**
     * Gets the arcotOTPIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return arcotOTPIssuanceConfigNames   * ArcotOTP issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getArcotOTPIssuanceConfigNames() {
        return arcotOTPIssuanceConfigNames;
    }


    /**
     * Sets the arcotOTPIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param arcotOTPIssuanceConfigNames   * ArcotOTP issuance configuration names.
     */
    public void setArcotOTPIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPIssuanceConfigNames) {
        this.arcotOTPIssuanceConfigNames = arcotOTPIssuanceConfigNames;
    }


    /**
     * Gets the emvIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @return emvIssuanceConfigNames   * EMV issuance configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getEmvIssuanceConfigNames() {
        return emvIssuanceConfigNames;
    }


    /**
     * Sets the emvIssuanceConfigNames value for this ConfigurationNames.
     * 
     * @param emvIssuanceConfigNames   * EMV issuance configuration names.
     */
    public void setEmvIssuanceConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvIssuanceConfigNames) {
        this.emvIssuanceConfigNames = emvIssuanceConfigNames;
    }


    /**
     * Gets the arcotIDAuthConfigNames value for this ConfigurationNames.
     * 
     * @return arcotIDAuthConfigNames   * ArcotID authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getArcotIDAuthConfigNames() {
        return arcotIDAuthConfigNames;
    }


    /**
     * Sets the arcotIDAuthConfigNames value for this ConfigurationNames.
     * 
     * @param arcotIDAuthConfigNames   * ArcotID authentication configuration names.
     */
    public void setArcotIDAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotIDAuthConfigNames) {
        this.arcotIDAuthConfigNames = arcotIDAuthConfigNames;
    }


    /**
     * Gets the qnaAuthConfigNames value for this ConfigurationNames.
     * 
     * @return qnaAuthConfigNames   * QnA authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getQnaAuthConfigNames() {
        return qnaAuthConfigNames;
    }


    /**
     * Sets the qnaAuthConfigNames value for this ConfigurationNames.
     * 
     * @param qnaAuthConfigNames   * QnA authentication configuration names.
     */
    public void setQnaAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter qnaAuthConfigNames) {
        this.qnaAuthConfigNames = qnaAuthConfigNames;
    }


    /**
     * Gets the passwordAuthConfigNames value for this ConfigurationNames.
     * 
     * @return passwordAuthConfigNames   * Password authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getPasswordAuthConfigNames() {
        return passwordAuthConfigNames;
    }


    /**
     * Sets the passwordAuthConfigNames value for this ConfigurationNames.
     * 
     * @param passwordAuthConfigNames   * Password authentication configuration names.
     */
    public void setPasswordAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter passwordAuthConfigNames) {
        this.passwordAuthConfigNames = passwordAuthConfigNames;
    }


    /**
     * Gets the serverOTPAuthConfigNames value for this ConfigurationNames.
     * 
     * @return serverOTPAuthConfigNames   * Server OTP authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getServerOTPAuthConfigNames() {
        return serverOTPAuthConfigNames;
    }


    /**
     * Sets the serverOTPAuthConfigNames value for this ConfigurationNames.
     * 
     * @param serverOTPAuthConfigNames   * Server OTP authentication configuration names.
     */
    public void setServerOTPAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter serverOTPAuthConfigNames) {
        this.serverOTPAuthConfigNames = serverOTPAuthConfigNames;
    }


    /**
     * Gets the oathAuthConfigNames value for this ConfigurationNames.
     * 
     * @return oathAuthConfigNames   * OATH authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getOathAuthConfigNames() {
        return oathAuthConfigNames;
    }


    /**
     * Sets the oathAuthConfigNames value for this ConfigurationNames.
     * 
     * @param oathAuthConfigNames   * OATH authentication configuration names.
     */
    public void setOathAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter oathAuthConfigNames) {
        this.oathAuthConfigNames = oathAuthConfigNames;
    }


    /**
     * Gets the arcotOTPAuthConfigNames value for this ConfigurationNames.
     * 
     * @return arcotOTPAuthConfigNames   * ArcotOTP authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getArcotOTPAuthConfigNames() {
        return arcotOTPAuthConfigNames;
    }


    /**
     * Sets the arcotOTPAuthConfigNames value for this ConfigurationNames.
     * 
     * @param arcotOTPAuthConfigNames   * ArcotOTP authentication configuration names.
     */
    public void setArcotOTPAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter arcotOTPAuthConfigNames) {
        this.arcotOTPAuthConfigNames = arcotOTPAuthConfigNames;
    }


    /**
     * Gets the emvAuthConfigNames value for this ConfigurationNames.
     * 
     * @return emvAuthConfigNames   * EMV authentication configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getEmvAuthConfigNames() {
        return emvAuthConfigNames;
    }


    /**
     * Sets the emvAuthConfigNames value for this ConfigurationNames.
     * 
     * @param emvAuthConfigNames   * EMV authentication configuration names.
     */
    public void setEmvAuthConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter emvAuthConfigNames) {
        this.emvAuthConfigNames = emvAuthConfigNames;
    }


    /**
     * Gets the miscellaneousConfigNames value for this ConfigurationNames.
     * 
     * @return miscellaneousConfigNames   * Miscellaneous configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getMiscellaneousConfigNames() {
        return miscellaneousConfigNames;
    }


    /**
     * Sets the miscellaneousConfigNames value for this ConfigurationNames.
     * 
     * @param miscellaneousConfigNames   * Miscellaneous configuration names.
     */
    public void setMiscellaneousConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter miscellaneousConfigNames) {
        this.miscellaneousConfigNames = miscellaneousConfigNames;
    }


    /**
     * Gets the keyConfigNames value for this ConfigurationNames.
     * 
     * @return keyConfigNames   * Key configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getKeyConfigNames() {
        return keyConfigNames;
    }


    /**
     * Sets the keyConfigNames value for this ConfigurationNames.
     * 
     * @param keyConfigNames   * Key configuration names.
     */
    public void setKeyConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter keyConfigNames) {
        this.keyConfigNames = keyConfigNames;
    }


    /**
     * Gets the radiusClientConfigNames value for this ConfigurationNames.
     * 
     * @return radiusClientConfigNames   * RADIUS client configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getRadiusClientConfigNames() {
        return radiusClientConfigNames;
    }


    /**
     * Sets the radiusClientConfigNames value for this ConfigurationNames.
     * 
     * @param radiusClientConfigNames   * RADIUS client configuration names.
     */
    public void setRadiusClientConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusClientConfigNames) {
        this.radiusClientConfigNames = radiusClientConfigNames;
    }


    /**
     * Gets the radiusServerConfigNames value for this ConfigurationNames.
     * 
     * @return radiusServerConfigNames   * RADIUS server configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getRadiusServerConfigNames() {
        return radiusServerConfigNames;
    }


    /**
     * Sets the radiusServerConfigNames value for this ConfigurationNames.
     * 
     * @param radiusServerConfigNames   * RADIUS server configuration names.
     */
    public void setRadiusServerConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter radiusServerConfigNames) {
        this.radiusServerConfigNames = radiusServerConfigNames;
    }


    /**
     * Gets the asspConfigNames value for this ConfigurationNames.
     * 
     * @return asspConfigNames   * ASSP configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getAsspConfigNames() {
        return asspConfigNames;
    }


    /**
     * Sets the asspConfigNames value for this ConfigurationNames.
     * 
     * @param asspConfigNames   * ASSP configuration names.
     */
    public void setAsspConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter asspConfigNames) {
        this.asspConfigNames = asspConfigNames;
    }


    /**
     * Gets the samlTokenConfigNames value for this ConfigurationNames.
     * 
     * @return samlTokenConfigNames   * SAML token configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getSamlTokenConfigNames() {
        return samlTokenConfigNames;
    }


    /**
     * Sets the samlTokenConfigNames value for this ConfigurationNames.
     * 
     * @param samlTokenConfigNames   * SAML token configuration names.
     */
    public void setSamlTokenConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter samlTokenConfigNames) {
        this.samlTokenConfigNames = samlTokenConfigNames;
    }


    /**
     * Gets the credTypeResolutionConfigNames value for this ConfigurationNames.
     * 
     * @return credTypeResolutionConfigNames   * Credential type resolution configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getCredTypeResolutionConfigNames() {
        return credTypeResolutionConfigNames;
    }


    /**
     * Sets the credTypeResolutionConfigNames value for this ConfigurationNames.
     * 
     * @param credTypeResolutionConfigNames   * Credential type resolution configuration names.
     */
    public void setCredTypeResolutionConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter credTypeResolutionConfigNames) {
        this.credTypeResolutionConfigNames = credTypeResolutionConfigNames;
    }


    /**
     * Gets the pluginConfigNames value for this ConfigurationNames.
     * 
     * @return pluginConfigNames   * Plugin configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getPluginConfigNames() {
        return pluginConfigNames;
    }


    /**
     * Sets the pluginConfigNames value for this ConfigurationNames.
     * 
     * @param pluginConfigNames   * Plugin configuration names.
     */
    public void setPluginConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter pluginConfigNames) {
        this.pluginConfigNames = pluginConfigNames;
    }


    /**
     * Gets the calloutConfigNames value for this ConfigurationNames.
     * 
     * @return calloutConfigNames   * Callout configuration names.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter getCalloutConfigNames() {
        return calloutConfigNames;
    }


    /**
     * Sets the calloutConfigNames value for this ConfigurationNames.
     * 
     * @param calloutConfigNames   * Callout configuration names.
     */
    public void setCalloutConfigNames(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigFilter calloutConfigNames) {
        this.calloutConfigNames = calloutConfigNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurationNames)) return false;
        ConfigurationNames other = (ConfigurationNames) obj;
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
            ((this.arcotIDIssuanceConfigNames==null && other.getArcotIDIssuanceConfigNames()==null) || 
             (this.arcotIDIssuanceConfigNames!=null &&
              this.arcotIDIssuanceConfigNames.equals(other.getArcotIDIssuanceConfigNames()))) &&
            ((this.qnaIssuanceConfigNames==null && other.getQnaIssuanceConfigNames()==null) || 
             (this.qnaIssuanceConfigNames!=null &&
              this.qnaIssuanceConfigNames.equals(other.getQnaIssuanceConfigNames()))) &&
            ((this.passwordIssuanceConfigNames==null && other.getPasswordIssuanceConfigNames()==null) || 
             (this.passwordIssuanceConfigNames!=null &&
              this.passwordIssuanceConfigNames.equals(other.getPasswordIssuanceConfigNames()))) &&
            ((this.serverOTPIssuanceConfigNames==null && other.getServerOTPIssuanceConfigNames()==null) || 
             (this.serverOTPIssuanceConfigNames!=null &&
              this.serverOTPIssuanceConfigNames.equals(other.getServerOTPIssuanceConfigNames()))) &&
            ((this.oathIssuanceConfigNames==null && other.getOathIssuanceConfigNames()==null) || 
             (this.oathIssuanceConfigNames!=null &&
              this.oathIssuanceConfigNames.equals(other.getOathIssuanceConfigNames()))) &&
            ((this.arcotOTPIssuanceConfigNames==null && other.getArcotOTPIssuanceConfigNames()==null) || 
             (this.arcotOTPIssuanceConfigNames!=null &&
              this.arcotOTPIssuanceConfigNames.equals(other.getArcotOTPIssuanceConfigNames()))) &&
            ((this.emvIssuanceConfigNames==null && other.getEmvIssuanceConfigNames()==null) || 
             (this.emvIssuanceConfigNames!=null &&
              this.emvIssuanceConfigNames.equals(other.getEmvIssuanceConfigNames()))) &&
            ((this.arcotIDAuthConfigNames==null && other.getArcotIDAuthConfigNames()==null) || 
             (this.arcotIDAuthConfigNames!=null &&
              this.arcotIDAuthConfigNames.equals(other.getArcotIDAuthConfigNames()))) &&
            ((this.qnaAuthConfigNames==null && other.getQnaAuthConfigNames()==null) || 
             (this.qnaAuthConfigNames!=null &&
              this.qnaAuthConfigNames.equals(other.getQnaAuthConfigNames()))) &&
            ((this.passwordAuthConfigNames==null && other.getPasswordAuthConfigNames()==null) || 
             (this.passwordAuthConfigNames!=null &&
              this.passwordAuthConfigNames.equals(other.getPasswordAuthConfigNames()))) &&
            ((this.serverOTPAuthConfigNames==null && other.getServerOTPAuthConfigNames()==null) || 
             (this.serverOTPAuthConfigNames!=null &&
              this.serverOTPAuthConfigNames.equals(other.getServerOTPAuthConfigNames()))) &&
            ((this.oathAuthConfigNames==null && other.getOathAuthConfigNames()==null) || 
             (this.oathAuthConfigNames!=null &&
              this.oathAuthConfigNames.equals(other.getOathAuthConfigNames()))) &&
            ((this.arcotOTPAuthConfigNames==null && other.getArcotOTPAuthConfigNames()==null) || 
             (this.arcotOTPAuthConfigNames!=null &&
              this.arcotOTPAuthConfigNames.equals(other.getArcotOTPAuthConfigNames()))) &&
            ((this.emvAuthConfigNames==null && other.getEmvAuthConfigNames()==null) || 
             (this.emvAuthConfigNames!=null &&
              this.emvAuthConfigNames.equals(other.getEmvAuthConfigNames()))) &&
            ((this.miscellaneousConfigNames==null && other.getMiscellaneousConfigNames()==null) || 
             (this.miscellaneousConfigNames!=null &&
              this.miscellaneousConfigNames.equals(other.getMiscellaneousConfigNames()))) &&
            ((this.keyConfigNames==null && other.getKeyConfigNames()==null) || 
             (this.keyConfigNames!=null &&
              this.keyConfigNames.equals(other.getKeyConfigNames()))) &&
            ((this.radiusClientConfigNames==null && other.getRadiusClientConfigNames()==null) || 
             (this.radiusClientConfigNames!=null &&
              this.radiusClientConfigNames.equals(other.getRadiusClientConfigNames()))) &&
            ((this.radiusServerConfigNames==null && other.getRadiusServerConfigNames()==null) || 
             (this.radiusServerConfigNames!=null &&
              this.radiusServerConfigNames.equals(other.getRadiusServerConfigNames()))) &&
            ((this.asspConfigNames==null && other.getAsspConfigNames()==null) || 
             (this.asspConfigNames!=null &&
              this.asspConfigNames.equals(other.getAsspConfigNames()))) &&
            ((this.samlTokenConfigNames==null && other.getSamlTokenConfigNames()==null) || 
             (this.samlTokenConfigNames!=null &&
              this.samlTokenConfigNames.equals(other.getSamlTokenConfigNames()))) &&
            ((this.credTypeResolutionConfigNames==null && other.getCredTypeResolutionConfigNames()==null) || 
             (this.credTypeResolutionConfigNames!=null &&
              this.credTypeResolutionConfigNames.equals(other.getCredTypeResolutionConfigNames()))) &&
            ((this.pluginConfigNames==null && other.getPluginConfigNames()==null) || 
             (this.pluginConfigNames!=null &&
              this.pluginConfigNames.equals(other.getPluginConfigNames()))) &&
            ((this.calloutConfigNames==null && other.getCalloutConfigNames()==null) || 
             (this.calloutConfigNames!=null &&
              this.calloutConfigNames.equals(other.getCalloutConfigNames())));
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
        if (getArcotIDIssuanceConfigNames() != null) {
            _hashCode += getArcotIDIssuanceConfigNames().hashCode();
        }
        if (getQnaIssuanceConfigNames() != null) {
            _hashCode += getQnaIssuanceConfigNames().hashCode();
        }
        if (getPasswordIssuanceConfigNames() != null) {
            _hashCode += getPasswordIssuanceConfigNames().hashCode();
        }
        if (getServerOTPIssuanceConfigNames() != null) {
            _hashCode += getServerOTPIssuanceConfigNames().hashCode();
        }
        if (getOathIssuanceConfigNames() != null) {
            _hashCode += getOathIssuanceConfigNames().hashCode();
        }
        if (getArcotOTPIssuanceConfigNames() != null) {
            _hashCode += getArcotOTPIssuanceConfigNames().hashCode();
        }
        if (getEmvIssuanceConfigNames() != null) {
            _hashCode += getEmvIssuanceConfigNames().hashCode();
        }
        if (getArcotIDAuthConfigNames() != null) {
            _hashCode += getArcotIDAuthConfigNames().hashCode();
        }
        if (getQnaAuthConfigNames() != null) {
            _hashCode += getQnaAuthConfigNames().hashCode();
        }
        if (getPasswordAuthConfigNames() != null) {
            _hashCode += getPasswordAuthConfigNames().hashCode();
        }
        if (getServerOTPAuthConfigNames() != null) {
            _hashCode += getServerOTPAuthConfigNames().hashCode();
        }
        if (getOathAuthConfigNames() != null) {
            _hashCode += getOathAuthConfigNames().hashCode();
        }
        if (getArcotOTPAuthConfigNames() != null) {
            _hashCode += getArcotOTPAuthConfigNames().hashCode();
        }
        if (getEmvAuthConfigNames() != null) {
            _hashCode += getEmvAuthConfigNames().hashCode();
        }
        if (getMiscellaneousConfigNames() != null) {
            _hashCode += getMiscellaneousConfigNames().hashCode();
        }
        if (getKeyConfigNames() != null) {
            _hashCode += getKeyConfigNames().hashCode();
        }
        if (getRadiusClientConfigNames() != null) {
            _hashCode += getRadiusClientConfigNames().hashCode();
        }
        if (getRadiusServerConfigNames() != null) {
            _hashCode += getRadiusServerConfigNames().hashCode();
        }
        if (getAsspConfigNames() != null) {
            _hashCode += getAsspConfigNames().hashCode();
        }
        if (getSamlTokenConfigNames() != null) {
            _hashCode += getSamlTokenConfigNames().hashCode();
        }
        if (getCredTypeResolutionConfigNames() != null) {
            _hashCode += getCredTypeResolutionConfigNames().hashCode();
        }
        if (getPluginConfigNames() != null) {
            _hashCode += getPluginConfigNames().hashCode();
        }
        if (getCalloutConfigNames() != null) {
            _hashCode += getCalloutConfigNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurationNames.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationNames"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneousConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscellaneousConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClientConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClientConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutConfigNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "calloutConfigNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigFilter"));
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
