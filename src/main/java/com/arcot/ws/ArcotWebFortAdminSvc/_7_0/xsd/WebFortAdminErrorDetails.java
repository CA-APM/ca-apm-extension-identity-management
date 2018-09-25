/**
 * WebFortAdminErrorDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * WebFortAdminErrorDetails is the structure used for
 * 				holding the admin
 * 				transaction failure details per organization.
 */
public class WebFortAdminErrorDetails  implements java.io.Serializable {
    /* Organization details of the configurations. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* ArcotID issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDIssuanceConfigErrors;

    /* QnA issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaIssuanceConfigErrors;

    /* Password issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordIssuanceConfigErrors;

    /* Server OTP issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPIssuanceConfigErrors;

    /* OATH issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathIssuanceConfigErrors;

    /* ArcotOTP issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPIssuanceConfigErrors;

    /* EMV issuance configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvIssuanceConfigErrors;

    /* ArcotID authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDAuthConfigErrors;

    /* QnA authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaAuthConfigErrors;

    /* Password authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordAuthConfigErrors;

    /* Server OTP authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPAuthConfigErrors;

    /* OATH authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathAuthConfigErrors;

    /* ArcotOTP authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPAuthConfigErrors;

    /* EMV authentication configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvAuthConfigErrors;

    /* Miscellaneous configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] miscellaneousConfigErrors;

    /* Key configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] keyConfigErrors;

    /* ArcotID domain key configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDDomainKeyConfigErrors;

    /* OATH OTP master key configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathOTPMasterKeyConfigErrors;

    /* ArcotOTP master key configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPMasterKeyConfigErrors;

    /* EMV OTP master key configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvOTPMasterKeyConfigErrors;

    /* RADIUS client configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusClientConfigErrors;

    /* RADIUS server configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusServerConfigErrors;

    /* Credential type resolution configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] credTypeResolutionConfigErrors;

    /* RADIUS credential type resolution configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusCredTypeResolutionConfigErrors;

    /* ASSP credential type resolution configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspCredTypeResolutionConfigErrors;

    /* Plugin configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] pluginConfigErrors;

    /* Callout configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] calloutConfigErrors;

    /* ASSP configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspConfigErrors;

    /* SAML token configurations error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] samlTokenConfigErrors;

    public WebFortAdminErrorDetails() {
    }

    public WebFortAdminErrorDetails(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvIssuanceConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvAuthConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] miscellaneousConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] keyConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDDomainKeyConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathOTPMasterKeyConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPMasterKeyConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvOTPMasterKeyConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusClientConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusServerConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] credTypeResolutionConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusCredTypeResolutionConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspCredTypeResolutionConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] pluginConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] calloutConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspConfigErrors,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] samlTokenConfigErrors) {
           this.orgDetails = orgDetails;
           this.arcotIDIssuanceConfigErrors = arcotIDIssuanceConfigErrors;
           this.qnaIssuanceConfigErrors = qnaIssuanceConfigErrors;
           this.passwordIssuanceConfigErrors = passwordIssuanceConfigErrors;
           this.serverOTPIssuanceConfigErrors = serverOTPIssuanceConfigErrors;
           this.oathIssuanceConfigErrors = oathIssuanceConfigErrors;
           this.arcotOTPIssuanceConfigErrors = arcotOTPIssuanceConfigErrors;
           this.emvIssuanceConfigErrors = emvIssuanceConfigErrors;
           this.arcotIDAuthConfigErrors = arcotIDAuthConfigErrors;
           this.qnaAuthConfigErrors = qnaAuthConfigErrors;
           this.passwordAuthConfigErrors = passwordAuthConfigErrors;
           this.serverOTPAuthConfigErrors = serverOTPAuthConfigErrors;
           this.oathAuthConfigErrors = oathAuthConfigErrors;
           this.arcotOTPAuthConfigErrors = arcotOTPAuthConfigErrors;
           this.emvAuthConfigErrors = emvAuthConfigErrors;
           this.miscellaneousConfigErrors = miscellaneousConfigErrors;
           this.keyConfigErrors = keyConfigErrors;
           this.arcotIDDomainKeyConfigErrors = arcotIDDomainKeyConfigErrors;
           this.oathOTPMasterKeyConfigErrors = oathOTPMasterKeyConfigErrors;
           this.arcotOTPMasterKeyConfigErrors = arcotOTPMasterKeyConfigErrors;
           this.emvOTPMasterKeyConfigErrors = emvOTPMasterKeyConfigErrors;
           this.radiusClientConfigErrors = radiusClientConfigErrors;
           this.radiusServerConfigErrors = radiusServerConfigErrors;
           this.credTypeResolutionConfigErrors = credTypeResolutionConfigErrors;
           this.radiusCredTypeResolutionConfigErrors = radiusCredTypeResolutionConfigErrors;
           this.asspCredTypeResolutionConfigErrors = asspCredTypeResolutionConfigErrors;
           this.pluginConfigErrors = pluginConfigErrors;
           this.calloutConfigErrors = calloutConfigErrors;
           this.asspConfigErrors = asspConfigErrors;
           this.samlTokenConfigErrors = samlTokenConfigErrors;
    }


    /**
     * Gets the orgDetails value for this WebFortAdminErrorDetails.
     * 
     * @return orgDetails   * Organization details of the configurations.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this WebFortAdminErrorDetails.
     * 
     * @param orgDetails   * Organization details of the configurations.
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the arcotIDIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotIDIssuanceConfigErrors   * ArcotID issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotIDIssuanceConfigErrors() {
        return arcotIDIssuanceConfigErrors;
    }


    /**
     * Sets the arcotIDIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotIDIssuanceConfigErrors   * ArcotID issuance configurations error details.
     */
    public void setArcotIDIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDIssuanceConfigErrors) {
        this.arcotIDIssuanceConfigErrors = arcotIDIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotIDIssuanceConfigErrors(int i) {
        return this.arcotIDIssuanceConfigErrors[i];
    }

    public void setArcotIDIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotIDIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the qnaIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return qnaIssuanceConfigErrors   * QnA issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getQnaIssuanceConfigErrors() {
        return qnaIssuanceConfigErrors;
    }


    /**
     * Sets the qnaIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param qnaIssuanceConfigErrors   * QnA issuance configurations error details.
     */
    public void setQnaIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaIssuanceConfigErrors) {
        this.qnaIssuanceConfigErrors = qnaIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getQnaIssuanceConfigErrors(int i) {
        return this.qnaIssuanceConfigErrors[i];
    }

    public void setQnaIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.qnaIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the passwordIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return passwordIssuanceConfigErrors   * Password issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getPasswordIssuanceConfigErrors() {
        return passwordIssuanceConfigErrors;
    }


    /**
     * Sets the passwordIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param passwordIssuanceConfigErrors   * Password issuance configurations error details.
     */
    public void setPasswordIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordIssuanceConfigErrors) {
        this.passwordIssuanceConfigErrors = passwordIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getPasswordIssuanceConfigErrors(int i) {
        return this.passwordIssuanceConfigErrors[i];
    }

    public void setPasswordIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.passwordIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the serverOTPIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return serverOTPIssuanceConfigErrors   * Server OTP issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getServerOTPIssuanceConfigErrors() {
        return serverOTPIssuanceConfigErrors;
    }


    /**
     * Sets the serverOTPIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param serverOTPIssuanceConfigErrors   * Server OTP issuance configurations error details.
     */
    public void setServerOTPIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPIssuanceConfigErrors) {
        this.serverOTPIssuanceConfigErrors = serverOTPIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getServerOTPIssuanceConfigErrors(int i) {
        return this.serverOTPIssuanceConfigErrors[i];
    }

    public void setServerOTPIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.serverOTPIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the oathIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return oathIssuanceConfigErrors   * OATH issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getOathIssuanceConfigErrors() {
        return oathIssuanceConfigErrors;
    }


    /**
     * Sets the oathIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param oathIssuanceConfigErrors   * OATH issuance configurations error details.
     */
    public void setOathIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathIssuanceConfigErrors) {
        this.oathIssuanceConfigErrors = oathIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getOathIssuanceConfigErrors(int i) {
        return this.oathIssuanceConfigErrors[i];
    }

    public void setOathIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.oathIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the arcotOTPIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotOTPIssuanceConfigErrors   * ArcotOTP issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotOTPIssuanceConfigErrors() {
        return arcotOTPIssuanceConfigErrors;
    }


    /**
     * Sets the arcotOTPIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotOTPIssuanceConfigErrors   * ArcotOTP issuance configurations error details.
     */
    public void setArcotOTPIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPIssuanceConfigErrors) {
        this.arcotOTPIssuanceConfigErrors = arcotOTPIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotOTPIssuanceConfigErrors(int i) {
        return this.arcotOTPIssuanceConfigErrors[i];
    }

    public void setArcotOTPIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotOTPIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the emvIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return emvIssuanceConfigErrors   * EMV issuance configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getEmvIssuanceConfigErrors() {
        return emvIssuanceConfigErrors;
    }


    /**
     * Sets the emvIssuanceConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param emvIssuanceConfigErrors   * EMV issuance configurations error details.
     */
    public void setEmvIssuanceConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvIssuanceConfigErrors) {
        this.emvIssuanceConfigErrors = emvIssuanceConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getEmvIssuanceConfigErrors(int i) {
        return this.emvIssuanceConfigErrors[i];
    }

    public void setEmvIssuanceConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.emvIssuanceConfigErrors[i] = _value;
    }


    /**
     * Gets the arcotIDAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotIDAuthConfigErrors   * ArcotID authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotIDAuthConfigErrors() {
        return arcotIDAuthConfigErrors;
    }


    /**
     * Sets the arcotIDAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotIDAuthConfigErrors   * ArcotID authentication configurations error details.
     */
    public void setArcotIDAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDAuthConfigErrors) {
        this.arcotIDAuthConfigErrors = arcotIDAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotIDAuthConfigErrors(int i) {
        return this.arcotIDAuthConfigErrors[i];
    }

    public void setArcotIDAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotIDAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the qnaAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return qnaAuthConfigErrors   * QnA authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getQnaAuthConfigErrors() {
        return qnaAuthConfigErrors;
    }


    /**
     * Sets the qnaAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param qnaAuthConfigErrors   * QnA authentication configurations error details.
     */
    public void setQnaAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] qnaAuthConfigErrors) {
        this.qnaAuthConfigErrors = qnaAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getQnaAuthConfigErrors(int i) {
        return this.qnaAuthConfigErrors[i];
    }

    public void setQnaAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.qnaAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the passwordAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return passwordAuthConfigErrors   * Password authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getPasswordAuthConfigErrors() {
        return passwordAuthConfigErrors;
    }


    /**
     * Sets the passwordAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param passwordAuthConfigErrors   * Password authentication configurations error details.
     */
    public void setPasswordAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] passwordAuthConfigErrors) {
        this.passwordAuthConfigErrors = passwordAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getPasswordAuthConfigErrors(int i) {
        return this.passwordAuthConfigErrors[i];
    }

    public void setPasswordAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.passwordAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the serverOTPAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return serverOTPAuthConfigErrors   * Server OTP authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getServerOTPAuthConfigErrors() {
        return serverOTPAuthConfigErrors;
    }


    /**
     * Sets the serverOTPAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param serverOTPAuthConfigErrors   * Server OTP authentication configurations error details.
     */
    public void setServerOTPAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] serverOTPAuthConfigErrors) {
        this.serverOTPAuthConfigErrors = serverOTPAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getServerOTPAuthConfigErrors(int i) {
        return this.serverOTPAuthConfigErrors[i];
    }

    public void setServerOTPAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.serverOTPAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the oathAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return oathAuthConfigErrors   * OATH authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getOathAuthConfigErrors() {
        return oathAuthConfigErrors;
    }


    /**
     * Sets the oathAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param oathAuthConfigErrors   * OATH authentication configurations error details.
     */
    public void setOathAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathAuthConfigErrors) {
        this.oathAuthConfigErrors = oathAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getOathAuthConfigErrors(int i) {
        return this.oathAuthConfigErrors[i];
    }

    public void setOathAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.oathAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the arcotOTPAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotOTPAuthConfigErrors   * ArcotOTP authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotOTPAuthConfigErrors() {
        return arcotOTPAuthConfigErrors;
    }


    /**
     * Sets the arcotOTPAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotOTPAuthConfigErrors   * ArcotOTP authentication configurations error details.
     */
    public void setArcotOTPAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPAuthConfigErrors) {
        this.arcotOTPAuthConfigErrors = arcotOTPAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotOTPAuthConfigErrors(int i) {
        return this.arcotOTPAuthConfigErrors[i];
    }

    public void setArcotOTPAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotOTPAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the emvAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return emvAuthConfigErrors   * EMV authentication configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getEmvAuthConfigErrors() {
        return emvAuthConfigErrors;
    }


    /**
     * Sets the emvAuthConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param emvAuthConfigErrors   * EMV authentication configurations error details.
     */
    public void setEmvAuthConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvAuthConfigErrors) {
        this.emvAuthConfigErrors = emvAuthConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getEmvAuthConfigErrors(int i) {
        return this.emvAuthConfigErrors[i];
    }

    public void setEmvAuthConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.emvAuthConfigErrors[i] = _value;
    }


    /**
     * Gets the miscellaneousConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return miscellaneousConfigErrors   * Miscellaneous configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getMiscellaneousConfigErrors() {
        return miscellaneousConfigErrors;
    }


    /**
     * Sets the miscellaneousConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param miscellaneousConfigErrors   * Miscellaneous configurations error details.
     */
    public void setMiscellaneousConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] miscellaneousConfigErrors) {
        this.miscellaneousConfigErrors = miscellaneousConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getMiscellaneousConfigErrors(int i) {
        return this.miscellaneousConfigErrors[i];
    }

    public void setMiscellaneousConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.miscellaneousConfigErrors[i] = _value;
    }


    /**
     * Gets the keyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return keyConfigErrors   * Key configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getKeyConfigErrors() {
        return keyConfigErrors;
    }


    /**
     * Sets the keyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param keyConfigErrors   * Key configurations error details.
     */
    public void setKeyConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] keyConfigErrors) {
        this.keyConfigErrors = keyConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getKeyConfigErrors(int i) {
        return this.keyConfigErrors[i];
    }

    public void setKeyConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.keyConfigErrors[i] = _value;
    }


    /**
     * Gets the arcotIDDomainKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotIDDomainKeyConfigErrors   * ArcotID domain key configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotIDDomainKeyConfigErrors() {
        return arcotIDDomainKeyConfigErrors;
    }


    /**
     * Sets the arcotIDDomainKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotIDDomainKeyConfigErrors   * ArcotID domain key configurations error details.
     */
    public void setArcotIDDomainKeyConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotIDDomainKeyConfigErrors) {
        this.arcotIDDomainKeyConfigErrors = arcotIDDomainKeyConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotIDDomainKeyConfigErrors(int i) {
        return this.arcotIDDomainKeyConfigErrors[i];
    }

    public void setArcotIDDomainKeyConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotIDDomainKeyConfigErrors[i] = _value;
    }


    /**
     * Gets the oathOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return oathOTPMasterKeyConfigErrors   * OATH OTP master key configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getOathOTPMasterKeyConfigErrors() {
        return oathOTPMasterKeyConfigErrors;
    }


    /**
     * Sets the oathOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param oathOTPMasterKeyConfigErrors   * OATH OTP master key configurations error details.
     */
    public void setOathOTPMasterKeyConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] oathOTPMasterKeyConfigErrors) {
        this.oathOTPMasterKeyConfigErrors = oathOTPMasterKeyConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getOathOTPMasterKeyConfigErrors(int i) {
        return this.oathOTPMasterKeyConfigErrors[i];
    }

    public void setOathOTPMasterKeyConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.oathOTPMasterKeyConfigErrors[i] = _value;
    }


    /**
     * Gets the arcotOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return arcotOTPMasterKeyConfigErrors   * ArcotOTP master key configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getArcotOTPMasterKeyConfigErrors() {
        return arcotOTPMasterKeyConfigErrors;
    }


    /**
     * Sets the arcotOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param arcotOTPMasterKeyConfigErrors   * ArcotOTP master key configurations error details.
     */
    public void setArcotOTPMasterKeyConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] arcotOTPMasterKeyConfigErrors) {
        this.arcotOTPMasterKeyConfigErrors = arcotOTPMasterKeyConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getArcotOTPMasterKeyConfigErrors(int i) {
        return this.arcotOTPMasterKeyConfigErrors[i];
    }

    public void setArcotOTPMasterKeyConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.arcotOTPMasterKeyConfigErrors[i] = _value;
    }


    /**
     * Gets the emvOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return emvOTPMasterKeyConfigErrors   * EMV OTP master key configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getEmvOTPMasterKeyConfigErrors() {
        return emvOTPMasterKeyConfigErrors;
    }


    /**
     * Sets the emvOTPMasterKeyConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param emvOTPMasterKeyConfigErrors   * EMV OTP master key configurations error details.
     */
    public void setEmvOTPMasterKeyConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] emvOTPMasterKeyConfigErrors) {
        this.emvOTPMasterKeyConfigErrors = emvOTPMasterKeyConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getEmvOTPMasterKeyConfigErrors(int i) {
        return this.emvOTPMasterKeyConfigErrors[i];
    }

    public void setEmvOTPMasterKeyConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.emvOTPMasterKeyConfigErrors[i] = _value;
    }


    /**
     * Gets the radiusClientConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return radiusClientConfigErrors   * RADIUS client configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getRadiusClientConfigErrors() {
        return radiusClientConfigErrors;
    }


    /**
     * Sets the radiusClientConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param radiusClientConfigErrors   * RADIUS client configurations error details.
     */
    public void setRadiusClientConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusClientConfigErrors) {
        this.radiusClientConfigErrors = radiusClientConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getRadiusClientConfigErrors(int i) {
        return this.radiusClientConfigErrors[i];
    }

    public void setRadiusClientConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.radiusClientConfigErrors[i] = _value;
    }


    /**
     * Gets the radiusServerConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return radiusServerConfigErrors   * RADIUS server configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getRadiusServerConfigErrors() {
        return radiusServerConfigErrors;
    }


    /**
     * Sets the radiusServerConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param radiusServerConfigErrors   * RADIUS server configurations error details.
     */
    public void setRadiusServerConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusServerConfigErrors) {
        this.radiusServerConfigErrors = radiusServerConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getRadiusServerConfigErrors(int i) {
        return this.radiusServerConfigErrors[i];
    }

    public void setRadiusServerConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.radiusServerConfigErrors[i] = _value;
    }


    /**
     * Gets the credTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return credTypeResolutionConfigErrors   * Credential type resolution configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getCredTypeResolutionConfigErrors() {
        return credTypeResolutionConfigErrors;
    }


    /**
     * Sets the credTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param credTypeResolutionConfigErrors   * Credential type resolution configurations error details.
     */
    public void setCredTypeResolutionConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] credTypeResolutionConfigErrors) {
        this.credTypeResolutionConfigErrors = credTypeResolutionConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getCredTypeResolutionConfigErrors(int i) {
        return this.credTypeResolutionConfigErrors[i];
    }

    public void setCredTypeResolutionConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.credTypeResolutionConfigErrors[i] = _value;
    }


    /**
     * Gets the radiusCredTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return radiusCredTypeResolutionConfigErrors   * RADIUS credential type resolution configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getRadiusCredTypeResolutionConfigErrors() {
        return radiusCredTypeResolutionConfigErrors;
    }


    /**
     * Sets the radiusCredTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param radiusCredTypeResolutionConfigErrors   * RADIUS credential type resolution configurations error details.
     */
    public void setRadiusCredTypeResolutionConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] radiusCredTypeResolutionConfigErrors) {
        this.radiusCredTypeResolutionConfigErrors = radiusCredTypeResolutionConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getRadiusCredTypeResolutionConfigErrors(int i) {
        return this.radiusCredTypeResolutionConfigErrors[i];
    }

    public void setRadiusCredTypeResolutionConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.radiusCredTypeResolutionConfigErrors[i] = _value;
    }


    /**
     * Gets the asspCredTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return asspCredTypeResolutionConfigErrors   * ASSP credential type resolution configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getAsspCredTypeResolutionConfigErrors() {
        return asspCredTypeResolutionConfigErrors;
    }


    /**
     * Sets the asspCredTypeResolutionConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param asspCredTypeResolutionConfigErrors   * ASSP credential type resolution configurations error details.
     */
    public void setAsspCredTypeResolutionConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspCredTypeResolutionConfigErrors) {
        this.asspCredTypeResolutionConfigErrors = asspCredTypeResolutionConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getAsspCredTypeResolutionConfigErrors(int i) {
        return this.asspCredTypeResolutionConfigErrors[i];
    }

    public void setAsspCredTypeResolutionConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.asspCredTypeResolutionConfigErrors[i] = _value;
    }


    /**
     * Gets the pluginConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return pluginConfigErrors   * Plugin configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getPluginConfigErrors() {
        return pluginConfigErrors;
    }


    /**
     * Sets the pluginConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param pluginConfigErrors   * Plugin configurations error details.
     */
    public void setPluginConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] pluginConfigErrors) {
        this.pluginConfigErrors = pluginConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getPluginConfigErrors(int i) {
        return this.pluginConfigErrors[i];
    }

    public void setPluginConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.pluginConfigErrors[i] = _value;
    }


    /**
     * Gets the calloutConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return calloutConfigErrors   * Callout configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getCalloutConfigErrors() {
        return calloutConfigErrors;
    }


    /**
     * Sets the calloutConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param calloutConfigErrors   * Callout configurations error details.
     */
    public void setCalloutConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] calloutConfigErrors) {
        this.calloutConfigErrors = calloutConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getCalloutConfigErrors(int i) {
        return this.calloutConfigErrors[i];
    }

    public void setCalloutConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.calloutConfigErrors[i] = _value;
    }


    /**
     * Gets the asspConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return asspConfigErrors   * ASSP configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getAsspConfigErrors() {
        return asspConfigErrors;
    }


    /**
     * Sets the asspConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param asspConfigErrors   * ASSP configurations error details.
     */
    public void setAsspConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] asspConfigErrors) {
        this.asspConfigErrors = asspConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getAsspConfigErrors(int i) {
        return this.asspConfigErrors[i];
    }

    public void setAsspConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.asspConfigErrors[i] = _value;
    }


    /**
     * Gets the samlTokenConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @return samlTokenConfigErrors   * SAML token configurations error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] getSamlTokenConfigErrors() {
        return samlTokenConfigErrors;
    }


    /**
     * Sets the samlTokenConfigErrors value for this WebFortAdminErrorDetails.
     * 
     * @param samlTokenConfigErrors   * SAML token configurations error details.
     */
    public void setSamlTokenConfigErrors(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails[] samlTokenConfigErrors) {
        this.samlTokenConfigErrors = samlTokenConfigErrors;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails getSamlTokenConfigErrors(int i) {
        return this.samlTokenConfigErrors[i];
    }

    public void setSamlTokenConfigErrors(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigurationErrorDetails _value) {
        this.samlTokenConfigErrors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebFortAdminErrorDetails)) return false;
        WebFortAdminErrorDetails other = (WebFortAdminErrorDetails) obj;
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
            ((this.arcotIDIssuanceConfigErrors==null && other.getArcotIDIssuanceConfigErrors()==null) || 
             (this.arcotIDIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotIDIssuanceConfigErrors, other.getArcotIDIssuanceConfigErrors()))) &&
            ((this.qnaIssuanceConfigErrors==null && other.getQnaIssuanceConfigErrors()==null) || 
             (this.qnaIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.qnaIssuanceConfigErrors, other.getQnaIssuanceConfigErrors()))) &&
            ((this.passwordIssuanceConfigErrors==null && other.getPasswordIssuanceConfigErrors()==null) || 
             (this.passwordIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.passwordIssuanceConfigErrors, other.getPasswordIssuanceConfigErrors()))) &&
            ((this.serverOTPIssuanceConfigErrors==null && other.getServerOTPIssuanceConfigErrors()==null) || 
             (this.serverOTPIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.serverOTPIssuanceConfigErrors, other.getServerOTPIssuanceConfigErrors()))) &&
            ((this.oathIssuanceConfigErrors==null && other.getOathIssuanceConfigErrors()==null) || 
             (this.oathIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.oathIssuanceConfigErrors, other.getOathIssuanceConfigErrors()))) &&
            ((this.arcotOTPIssuanceConfigErrors==null && other.getArcotOTPIssuanceConfigErrors()==null) || 
             (this.arcotOTPIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotOTPIssuanceConfigErrors, other.getArcotOTPIssuanceConfigErrors()))) &&
            ((this.emvIssuanceConfigErrors==null && other.getEmvIssuanceConfigErrors()==null) || 
             (this.emvIssuanceConfigErrors!=null &&
              java.util.Arrays.equals(this.emvIssuanceConfigErrors, other.getEmvIssuanceConfigErrors()))) &&
            ((this.arcotIDAuthConfigErrors==null && other.getArcotIDAuthConfigErrors()==null) || 
             (this.arcotIDAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotIDAuthConfigErrors, other.getArcotIDAuthConfigErrors()))) &&
            ((this.qnaAuthConfigErrors==null && other.getQnaAuthConfigErrors()==null) || 
             (this.qnaAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.qnaAuthConfigErrors, other.getQnaAuthConfigErrors()))) &&
            ((this.passwordAuthConfigErrors==null && other.getPasswordAuthConfigErrors()==null) || 
             (this.passwordAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.passwordAuthConfigErrors, other.getPasswordAuthConfigErrors()))) &&
            ((this.serverOTPAuthConfigErrors==null && other.getServerOTPAuthConfigErrors()==null) || 
             (this.serverOTPAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.serverOTPAuthConfigErrors, other.getServerOTPAuthConfigErrors()))) &&
            ((this.oathAuthConfigErrors==null && other.getOathAuthConfigErrors()==null) || 
             (this.oathAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.oathAuthConfigErrors, other.getOathAuthConfigErrors()))) &&
            ((this.arcotOTPAuthConfigErrors==null && other.getArcotOTPAuthConfigErrors()==null) || 
             (this.arcotOTPAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotOTPAuthConfigErrors, other.getArcotOTPAuthConfigErrors()))) &&
            ((this.emvAuthConfigErrors==null && other.getEmvAuthConfigErrors()==null) || 
             (this.emvAuthConfigErrors!=null &&
              java.util.Arrays.equals(this.emvAuthConfigErrors, other.getEmvAuthConfigErrors()))) &&
            ((this.miscellaneousConfigErrors==null && other.getMiscellaneousConfigErrors()==null) || 
             (this.miscellaneousConfigErrors!=null &&
              java.util.Arrays.equals(this.miscellaneousConfigErrors, other.getMiscellaneousConfigErrors()))) &&
            ((this.keyConfigErrors==null && other.getKeyConfigErrors()==null) || 
             (this.keyConfigErrors!=null &&
              java.util.Arrays.equals(this.keyConfigErrors, other.getKeyConfigErrors()))) &&
            ((this.arcotIDDomainKeyConfigErrors==null && other.getArcotIDDomainKeyConfigErrors()==null) || 
             (this.arcotIDDomainKeyConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotIDDomainKeyConfigErrors, other.getArcotIDDomainKeyConfigErrors()))) &&
            ((this.oathOTPMasterKeyConfigErrors==null && other.getOathOTPMasterKeyConfigErrors()==null) || 
             (this.oathOTPMasterKeyConfigErrors!=null &&
              java.util.Arrays.equals(this.oathOTPMasterKeyConfigErrors, other.getOathOTPMasterKeyConfigErrors()))) &&
            ((this.arcotOTPMasterKeyConfigErrors==null && other.getArcotOTPMasterKeyConfigErrors()==null) || 
             (this.arcotOTPMasterKeyConfigErrors!=null &&
              java.util.Arrays.equals(this.arcotOTPMasterKeyConfigErrors, other.getArcotOTPMasterKeyConfigErrors()))) &&
            ((this.emvOTPMasterKeyConfigErrors==null && other.getEmvOTPMasterKeyConfigErrors()==null) || 
             (this.emvOTPMasterKeyConfigErrors!=null &&
              java.util.Arrays.equals(this.emvOTPMasterKeyConfigErrors, other.getEmvOTPMasterKeyConfigErrors()))) &&
            ((this.radiusClientConfigErrors==null && other.getRadiusClientConfigErrors()==null) || 
             (this.radiusClientConfigErrors!=null &&
              java.util.Arrays.equals(this.radiusClientConfigErrors, other.getRadiusClientConfigErrors()))) &&
            ((this.radiusServerConfigErrors==null && other.getRadiusServerConfigErrors()==null) || 
             (this.radiusServerConfigErrors!=null &&
              java.util.Arrays.equals(this.radiusServerConfigErrors, other.getRadiusServerConfigErrors()))) &&
            ((this.credTypeResolutionConfigErrors==null && other.getCredTypeResolutionConfigErrors()==null) || 
             (this.credTypeResolutionConfigErrors!=null &&
              java.util.Arrays.equals(this.credTypeResolutionConfigErrors, other.getCredTypeResolutionConfigErrors()))) &&
            ((this.radiusCredTypeResolutionConfigErrors==null && other.getRadiusCredTypeResolutionConfigErrors()==null) || 
             (this.radiusCredTypeResolutionConfigErrors!=null &&
              java.util.Arrays.equals(this.radiusCredTypeResolutionConfigErrors, other.getRadiusCredTypeResolutionConfigErrors()))) &&
            ((this.asspCredTypeResolutionConfigErrors==null && other.getAsspCredTypeResolutionConfigErrors()==null) || 
             (this.asspCredTypeResolutionConfigErrors!=null &&
              java.util.Arrays.equals(this.asspCredTypeResolutionConfigErrors, other.getAsspCredTypeResolutionConfigErrors()))) &&
            ((this.pluginConfigErrors==null && other.getPluginConfigErrors()==null) || 
             (this.pluginConfigErrors!=null &&
              java.util.Arrays.equals(this.pluginConfigErrors, other.getPluginConfigErrors()))) &&
            ((this.calloutConfigErrors==null && other.getCalloutConfigErrors()==null) || 
             (this.calloutConfigErrors!=null &&
              java.util.Arrays.equals(this.calloutConfigErrors, other.getCalloutConfigErrors()))) &&
            ((this.asspConfigErrors==null && other.getAsspConfigErrors()==null) || 
             (this.asspConfigErrors!=null &&
              java.util.Arrays.equals(this.asspConfigErrors, other.getAsspConfigErrors()))) &&
            ((this.samlTokenConfigErrors==null && other.getSamlTokenConfigErrors()==null) || 
             (this.samlTokenConfigErrors!=null &&
              java.util.Arrays.equals(this.samlTokenConfigErrors, other.getSamlTokenConfigErrors())));
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
        if (getArcotIDIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQnaIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQnaIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQnaIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPasswordIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPasswordIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPasswordIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServerOTPIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerOTPIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerOTPIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvIssuanceConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvIssuanceConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvIssuanceConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotIDAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQnaAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQnaAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQnaAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPasswordAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPasswordAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPasswordAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServerOTPAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerOTPAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerOTPAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvAuthConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvAuthConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvAuthConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiscellaneousConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiscellaneousConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiscellaneousConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotIDDomainKeyConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotIDDomainKeyConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotIDDomainKeyConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOathOTPMasterKeyConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOathOTPMasterKeyConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOathOTPMasterKeyConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotOTPMasterKeyConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArcotOTPMasterKeyConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArcotOTPMasterKeyConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmvOTPMasterKeyConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmvOTPMasterKeyConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmvOTPMasterKeyConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusClientConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusClientConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusClientConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusServerConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusServerConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusServerConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredTypeResolutionConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredTypeResolutionConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredTypeResolutionConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusCredTypeResolutionConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusCredTypeResolutionConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusCredTypeResolutionConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsspCredTypeResolutionConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsspCredTypeResolutionConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsspCredTypeResolutionConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPluginConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluginConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluginConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalloutConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalloutConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalloutConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsspConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAsspConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAsspConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlTokenConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlTokenConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlTokenConfigErrors(), i);
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
        new org.apache.axis.description.TypeDesc(WebFortAdminErrorDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "WebFortAdminErrorDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvIssuanceConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvIssuanceConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "qnaAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "passwordAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "serverOTPAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAuthConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAuthConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscellaneousConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "miscellaneousConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotIDDomainKeyConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotIDDomainKeyConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oathOTPMasterKeyConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "oathOTPMasterKeyConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotOTPMasterKeyConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "arcotOTPMasterKeyConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvOTPMasterKeyConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvOTPMasterKeyConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClientConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClientConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusServerConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusServerConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credTypeResolutionConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credTypeResolutionConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusCredTypeResolutionConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusCredTypeResolutionConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspCredTypeResolutionConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspCredTypeResolutionConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "pluginConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "calloutConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asspConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "asspConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlTokenConfigErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "samlTokenConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigurationErrorDetails"));
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
