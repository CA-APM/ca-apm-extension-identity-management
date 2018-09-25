/**
 * UPOutputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the Username-Password credential
 * 				details.
 */
public class UPOutputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialOutputType  implements java.io.Serializable {
    public UPOutputType() {
    }

    public UPOutputType(
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.Integer status,
           java.lang.Integer remainingUsageCount,
           java.util.Calendar createTime,
           java.util.Calendar lastUpdatedTime,
           java.util.Calendar validityStartTime,
           java.util.Calendar validityEndTime,
           java.util.Calendar disableStartTime,
           java.util.Calendar disableEndTime,
           java.lang.Integer numberOfFailedAuthAttempts,
           java.util.Calendar lastSuccessAuthAttemptTime,
           java.util.Calendar lastFailedAuthAttemptTime,
           java.lang.String profileName,
           java.lang.Integer profileVersion,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes) {
        super(
            userName,
            orgName,
            status,
            remainingUsageCount,
            createTime,
            lastUpdatedTime,
            validityStartTime,
            validityEndTime,
            disableStartTime,
            disableEndTime,
            numberOfFailedAuthAttempts,
            lastSuccessAuthAttemptTime,
            lastFailedAuthAttemptTime,
            profileName,
            profileVersion,
            notes);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UPOutputType)) return false;
        UPOutputType other = (UPOutputType) obj;
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
        new org.apache.axis.description.TypeDesc(UPOutputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "UPOutputType"));
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
