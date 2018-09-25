/**
 * AuthAPIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.wsdl;

public interface AuthAPIPortType extends java.rmi.Remote {

    /**
     * Fetches the Base64-encoded ArcotID for a given
     * 				user.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDResponse getArcotID(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDRequest getArcotIDRequest) throws java.rmi.RemoteException;

    /**
     * Fetches the PAM (Personal Assurance Message) for
     * 				a given
     * 				user.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMResponse getPAM(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPAMRequest getPAMRequest) throws java.rmi.RemoteException;

    /**
     * This method obtains an ArcotID challenge from the
     * 				WebFort Server. ArcotID authentication is
     * 				challenge-response-based
     * 				authentication mechanism. The
     * 				challenge is a tamper-proof data sent
     * 				from the server,
     * 				which needs to be signed by the user's ArcotID for
     * 				the
     * 				ArcotID credential verification.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeResponse getArcotIDChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetArcotIDChallengeRequest getArcotIDChallengeRequest) throws java.rmi.RemoteException;

    /**
     * This method verifies the response received from
     * 				signing
     * 				the ArcotID challenge, by ArcotID.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyArcotIDSignedChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotIDSignedChallenge verifySignedChallengeRequest) throws java.rmi.RemoteException;

    /**
     * Fetches the list of questions for the given user
     * 				from
     * 				WebFort. This list can then be presented to the user for
     * 				answers.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsResponse getQuestions(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetQuestionsRequest getQuestionsRequest) throws java.rmi.RemoteException;

    /**
     * This method obtains challenge for Password
     * 				authentication from the WebFort Server.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeResponse getPasswordChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetPasswordChallengeRequest getPasswordChallengeRequest) throws java.rmi.RemoteException;

    /**
     * Verifies the answers provided by the user to the
     * 				questions obtained in the getQuestions() call.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyAnswers(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAnswers verifyAnswersRequest) throws java.rmi.RemoteException;

    /**
     * Verifies the Password credential for a given
     * 				user.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyPassword(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPassword verifyPasswordRequest) throws java.rmi.RemoteException;

    /**
     * Authenticates the users based on their OTP.If
     * 				authentication is successful user gets his information
     * 				and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOTP verifyOTPRequest) throws java.rmi.RemoteException;

    /**
     * Authenticates the users based on their OATH
     * 				OTP.If
     * 				authentication is successful user gets his information
     * 				and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyOATHOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyOATHOTP verifyOATHOTPRequest) throws java.rmi.RemoteException;

    /**
     * Synchronizes the OATH-OTP credential for a given
     * 				user.If
     * 				synchronization is successful user gets his information
     * 				and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeOATHOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeOATHOTP synchronizeOATHOTPRequest) throws java.rmi.RemoteException;

    /**
     * Authenticates the users based on their
     * 				ArcotOTP.If
     * 				authentication is successful user gets his information
     * 				and authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyArcotOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyArcotOTP verifyArcotOTPRequest) throws java.rmi.RemoteException;

    /**
     * Synchronizes the ArcotOTP credential for a given
     * 				user.If synchronization is successful user gets his
     * 				information and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeArcotOTP(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeArcotOTP synchronizeArcotOTPRequest) throws java.rmi.RemoteException;

    /**
     * Authenticates the users based on their EMV. If
     * 				authentication is successful user gets his information
     * 				and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyEMV(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyEMV verifyEMVRequest) throws java.rmi.RemoteException;

    /**
     * Synchronizes the EMV credential for a given
     * 				user.If synchronization is successful user gets his
     * 				information and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse synchronizeEMV(com.arcot.ws.WebFortAuthAPI._7_0.msgs.SynchronizeEMV synchronizeEMVRequest) throws java.rmi.RemoteException;

    /**
     * Authenticates the users based on the palin credential. If
     * 				authentication is successful user gets his information
     * 				and
     * 				authentication token.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.AuthResponse verifyPlain(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyPlain verifyPlainRequest) throws java.rmi.RemoteException;

    /**
     * Verifies the authentication token for a given
     * 				user.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenResponse verifyAuthToken(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyAuthTokenRequest verifyAuthTokenRequest) throws java.rmi.RemoteException;

    /**
     * This method obtains the custom challenge from
     * 				WebFort
     * 				Server. It can be useful if the custom credential uses
     * 				challenge-response-based authentication mechanism.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeResponse getCustomChallenge(com.arcot.ws.WebFortAuthAPI._7_0.msgs.GetCustomChallengeRequest getCustomChallengeRequest) throws java.rmi.RemoteException;

    /**
     * This method verifies the custom credential.
     */
    public com.arcot.ws.WebFortAuthAPI._7_0.msgs.CustomAuthResponse verifyCustomCredential(com.arcot.ws.WebFortAuthAPI._7_0.msgs.VerifyCustomCredential verifyCustomCredentialRequest) throws java.rmi.RemoteException;
}
