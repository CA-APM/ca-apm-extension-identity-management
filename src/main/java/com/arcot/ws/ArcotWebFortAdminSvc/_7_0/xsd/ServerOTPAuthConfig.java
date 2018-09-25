/**
 * ServerOTPAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ServerOTPAuthConfig is the structure used to
 * 				represent authentication configuration for server
 * 				OTP credential.
 * 				These configuration settings will
 * 				be used while authenticating with server OTP by the
 * 				user.
 */
public class ServerOTPAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFAuthConfig  implements java.io.Serializable {
    public ServerOTPAuthConfig() {
    }

    public ServerOTPAuthConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer maxStrikes,
           java.lang.Long warningPeriod,
           java.lang.Long gracePeriod,
           java.lang.Long autoUnlockPeriod,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           java.lang.Boolean matchAcrossUsageType,
           java.lang.String usageTypeToMatch,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions) {
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
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerOTPAuthConfig)) return false;
        ServerOTPAuthConfig other = (ServerOTPAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerOTPAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ServerOTPAuthConfig"));
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
