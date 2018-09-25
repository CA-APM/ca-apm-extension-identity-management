/**
 * OTPOutputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the OTP credential details.
 * 				remainingUsageCount and usageCount represents
 * 				the same, usageCount is
 * 				still maintained for
 * 				backward compatibility.
 */
public class OTPOutputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialOutputType  implements java.io.Serializable {
    private java.lang.String otp;

    private java.lang.Integer usageCount;

    public OTPOutputType() {
    }

    public OTPOutputType(
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
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String otp,
           java.lang.Integer usageCount) {
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
        this.otp = otp;
        this.usageCount = usageCount;
    }


    /**
     * Gets the otp value for this OTPOutputType.
     * 
     * @return otp
     */
    public java.lang.String getOtp() {
        return otp;
    }


    /**
     * Sets the otp value for this OTPOutputType.
     * 
     * @param otp
     */
    public void setOtp(java.lang.String otp) {
        this.otp = otp;
    }


    /**
     * Gets the usageCount value for this OTPOutputType.
     * 
     * @return usageCount
     */
    public java.lang.Integer getUsageCount() {
        return usageCount;
    }


    /**
     * Sets the usageCount value for this OTPOutputType.
     * 
     * @param usageCount
     */
    public void setUsageCount(java.lang.Integer usageCount) {
        this.usageCount = usageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTPOutputType)) return false;
        OTPOutputType other = (OTPOutputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.otp==null && other.getOtp()==null) || 
             (this.otp!=null &&
              this.otp.equals(other.getOtp()))) &&
            ((this.usageCount==null && other.getUsageCount()==null) || 
             (this.usageCount!=null &&
              this.usageCount.equals(other.getUsageCount())));
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
        if (getOtp() != null) {
            _hashCode += getOtp().hashCode();
        }
        if (getUsageCount() != null) {
            _hashCode += getUsageCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTPOutputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OTPOutputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "otp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "usageCount"));
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
