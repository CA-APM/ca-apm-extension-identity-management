/**
 * ArcotIDAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ArcotIDAuthConfig is the structure used
 * 				to represent
 * 				authentication configuration.
 * 				These configuration settings will be
 * 				used while
 * 				authenticating with ArcotID by the user.
 */
public class ArcotIDAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig  implements java.io.Serializable {
    /* Validity time in seconds for challenge sent
     * 								while arcotID authentication. */
    private java.lang.Integer challengeTimeout;

    public ArcotIDAuthConfig() {
    }

    public ArcotIDAuthConfig(
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
        this.challengeTimeout = challengeTimeout;
    }


    /**
     * Gets the challengeTimeout value for this ArcotIDAuthConfig.
     * 
     * @return challengeTimeout   * Validity time in seconds for challenge sent
     * 								while arcotID authentication.
     */
    public java.lang.Integer getChallengeTimeout() {
        return challengeTimeout;
    }


    /**
     * Sets the challengeTimeout value for this ArcotIDAuthConfig.
     * 
     * @param challengeTimeout   * Validity time in seconds for challenge sent
     * 								while arcotID authentication.
     */
    public void setChallengeTimeout(java.lang.Integer challengeTimeout) {
        this.challengeTimeout = challengeTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDAuthConfig)) return false;
        ArcotIDAuthConfig other = (ArcotIDAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        if (getChallengeTimeout() != null) {
            _hashCode += getChallengeTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotIDAuthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
