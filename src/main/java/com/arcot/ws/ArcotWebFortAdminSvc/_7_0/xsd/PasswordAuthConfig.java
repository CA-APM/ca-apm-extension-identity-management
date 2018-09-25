/**
 * PasswordAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * PasswordAuthPolicy is the structure used to
 * 				represent authentication configuration for
 * 				password credential. These
 * 				configuration
 * 				settings will be used while authenticating
 * 				with password by the user.
 */
public class PasswordAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig  implements java.io.Serializable {
    /* Number of positions to be challenged in partial
     * 								password case. */
    private java.lang.Integer numPositionsToChallenge;

    /* Validity time in seconds for challenge sent
     * 								while password authentication. */
    private java.lang.Integer challengeTimeout;

    public PasswordAuthConfig() {
    }

    public PasswordAuthConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer maxStrikes,
           java.lang.Long warningPeriod,
           java.lang.Long gracePeriod,
           java.lang.Long autoUnlockPeriod,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           java.lang.Boolean matchAcrossUsageType,
           java.lang.String usageTypeToMatch,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions,
           java.lang.Integer numPositionsToChallenge,
           java.lang.Integer challengeTimeout) {
        super(
            name,
            status,
            maxStrikes,
            warningPeriod,
            gracePeriod,
            autoUnlockPeriod,
            userCheck,
            matchAcrossUsageType,
            usageTypeToMatch,
            adProcConditions);
        this.numPositionsToChallenge = numPositionsToChallenge;
        this.challengeTimeout = challengeTimeout;
    }


    /**
     * Gets the numPositionsToChallenge value for this PasswordAuthConfig.
     * 
     * @return numPositionsToChallenge   * Number of positions to be challenged in partial
     * 								password case.
     */
    public java.lang.Integer getNumPositionsToChallenge() {
        return numPositionsToChallenge;
    }


    /**
     * Sets the numPositionsToChallenge value for this PasswordAuthConfig.
     * 
     * @param numPositionsToChallenge   * Number of positions to be challenged in partial
     * 								password case.
     */
    public void setNumPositionsToChallenge(java.lang.Integer numPositionsToChallenge) {
        this.numPositionsToChallenge = numPositionsToChallenge;
    }


    /**
     * Gets the challengeTimeout value for this PasswordAuthConfig.
     * 
     * @return challengeTimeout   * Validity time in seconds for challenge sent
     * 								while password authentication.
     */
    public java.lang.Integer getChallengeTimeout() {
        return challengeTimeout;
    }


    /**
     * Sets the challengeTimeout value for this PasswordAuthConfig.
     * 
     * @param challengeTimeout   * Validity time in seconds for challenge sent
     * 								while password authentication.
     */
    public void setChallengeTimeout(java.lang.Integer challengeTimeout) {
        this.challengeTimeout = challengeTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordAuthConfig)) return false;
        PasswordAuthConfig other = (PasswordAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numPositionsToChallenge==null && other.getNumPositionsToChallenge()==null) || 
             (this.numPositionsToChallenge!=null &&
              this.numPositionsToChallenge.equals(other.getNumPositionsToChallenge()))) &&
            ((this.challengeTimeout==null && other.getChallengeTimeout()==null) || 
             (this.challengeTimeout!=null &&
              this.challengeTimeout.equals(other.getChallengeTimeout())));
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
        if (getNumPositionsToChallenge() != null) {
            _hashCode += getNumPositionsToChallenge().hashCode();
        }
        if (getChallengeTimeout() != null) {
            _hashCode += getChallengeTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordAuthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPositionsToChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "numPositionsToChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "challengeTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
