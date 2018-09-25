/**
 * ArcotOTPAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ArcotOTPAuthConfig is the structure used to
 * 				represent authentication configuration for ARCOT OTP
 * 				credential.
 * 				These configuration settings will be
 * 				used while authenticating with ArcotOTP by the user.
 */
public class ArcotOTPAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig  implements java.io.Serializable {
    /* This element contains the OTP counter tolerance
     * 								parameters. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OTPCounterTolerance otpCounterTolerance;

    public ArcotOTPAuthConfig() {
    }

    public ArcotOTPAuthConfig(
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
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OTPCounterTolerance otpCounterTolerance) {
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
        this.otpCounterTolerance = otpCounterTolerance;
    }


    /**
     * Gets the otpCounterTolerance value for this ArcotOTPAuthConfig.
     * 
     * @return otpCounterTolerance   * This element contains the OTP counter tolerance
     * 								parameters.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OTPCounterTolerance getOtpCounterTolerance() {
        return otpCounterTolerance;
    }


    /**
     * Sets the otpCounterTolerance value for this ArcotOTPAuthConfig.
     * 
     * @param otpCounterTolerance   * This element contains the OTP counter tolerance
     * 								parameters.
     */
    public void setOtpCounterTolerance(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.OTPCounterTolerance otpCounterTolerance) {
        this.otpCounterTolerance = otpCounterTolerance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotOTPAuthConfig)) return false;
        ArcotOTPAuthConfig other = (ArcotOTPAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.otpCounterTolerance==null && other.getOtpCounterTolerance()==null) || 
             (this.otpCounterTolerance!=null &&
              this.otpCounterTolerance.equals(other.getOtpCounterTolerance())));
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
        if (getOtpCounterTolerance() != null) {
            _hashCode += getOtpCounterTolerance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotOTPAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ArcotOTPAuthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpCounterTolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "otpCounterTolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OTPCounterTolerance"));
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
