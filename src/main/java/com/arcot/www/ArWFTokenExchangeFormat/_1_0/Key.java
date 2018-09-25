/**
 * Key.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFTokenExchangeFormat._1_0;


/**
 * Describes the details of the key like secret, OTP generation algorithm,
 * 			  and corresponding parameters.
 */
public class Key  implements java.io.Serializable {
    private com.arcot.www.ArWFTokenExchangeFormat._1_0.OTPFormat OTPFormat;

    /* Encrypted/Hex Encoded/Base64 Encoded secret, based on algorithm
     * specified
     * 					  in EncryptionMethod element. */
    private java.lang.String secret;

    /* Value of the event counter for event based OTP tokens (HOTP). */
    private java.lang.Integer counter;

    /* This is for time based OTP tokens (TOTP). 
     * 					  It is the initial time drift (in seconds) compared to UNIX
     * epoch. */
    private java.lang.Integer time;

    /* Value of the the time step in seconds for time based OTP tokens. */
    private java.lang.Integer timeInterval;

    private java.lang.String keyAlgorithm;  // attribute

    private java.lang.String keyId;  // attribute

    public Key() {
    }

    public Key(
           com.arcot.www.ArWFTokenExchangeFormat._1_0.OTPFormat OTPFormat,
           java.lang.String secret,
           java.lang.Integer counter,
           java.lang.Integer time,
           java.lang.Integer timeInterval,
           java.lang.String keyAlgorithm,
           java.lang.String keyId) {
           this.OTPFormat = OTPFormat;
           this.secret = secret;
           this.counter = counter;
           this.time = time;
           this.timeInterval = timeInterval;
           this.keyAlgorithm = keyAlgorithm;
           this.keyId = keyId;
    }


    /**
     * Gets the OTPFormat value for this Key.
     * 
     * @return OTPFormat
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.OTPFormat getOTPFormat() {
        return OTPFormat;
    }


    /**
     * Sets the OTPFormat value for this Key.
     * 
     * @param OTPFormat
     */
    public void setOTPFormat(com.arcot.www.ArWFTokenExchangeFormat._1_0.OTPFormat OTPFormat) {
        this.OTPFormat = OTPFormat;
    }


    /**
     * Gets the secret value for this Key.
     * 
     * @return secret   * Encrypted/Hex Encoded/Base64 Encoded secret, based on algorithm
     * specified
     * 					  in EncryptionMethod element.
     */
    public java.lang.String getSecret() {
        return secret;
    }


    /**
     * Sets the secret value for this Key.
     * 
     * @param secret   * Encrypted/Hex Encoded/Base64 Encoded secret, based on algorithm
     * specified
     * 					  in EncryptionMethod element.
     */
    public void setSecret(java.lang.String secret) {
        this.secret = secret;
    }


    /**
     * Gets the counter value for this Key.
     * 
     * @return counter   * Value of the event counter for event based OTP tokens (HOTP).
     */
    public java.lang.Integer getCounter() {
        return counter;
    }


    /**
     * Sets the counter value for this Key.
     * 
     * @param counter   * Value of the event counter for event based OTP tokens (HOTP).
     */
    public void setCounter(java.lang.Integer counter) {
        this.counter = counter;
    }


    /**
     * Gets the time value for this Key.
     * 
     * @return time   * This is for time based OTP tokens (TOTP). 
     * 					  It is the initial time drift (in seconds) compared to UNIX
     * epoch.
     */
    public java.lang.Integer getTime() {
        return time;
    }


    /**
     * Sets the time value for this Key.
     * 
     * @param time   * This is for time based OTP tokens (TOTP). 
     * 					  It is the initial time drift (in seconds) compared to UNIX
     * epoch.
     */
    public void setTime(java.lang.Integer time) {
        this.time = time;
    }


    /**
     * Gets the timeInterval value for this Key.
     * 
     * @return timeInterval   * Value of the the time step in seconds for time based OTP tokens.
     */
    public java.lang.Integer getTimeInterval() {
        return timeInterval;
    }


    /**
     * Sets the timeInterval value for this Key.
     * 
     * @param timeInterval   * Value of the the time step in seconds for time based OTP tokens.
     */
    public void setTimeInterval(java.lang.Integer timeInterval) {
        this.timeInterval = timeInterval;
    }


    /**
     * Gets the keyAlgorithm value for this Key.
     * 
     * @return keyAlgorithm
     */
    public java.lang.String getKeyAlgorithm() {
        return keyAlgorithm;
    }


    /**
     * Sets the keyAlgorithm value for this Key.
     * 
     * @param keyAlgorithm
     */
    public void setKeyAlgorithm(java.lang.String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }


    /**
     * Gets the keyId value for this Key.
     * 
     * @return keyId
     */
    public java.lang.String getKeyId() {
        return keyId;
    }


    /**
     * Sets the keyId value for this Key.
     * 
     * @param keyId
     */
    public void setKeyId(java.lang.String keyId) {
        this.keyId = keyId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Key)) return false;
        Key other = (Key) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OTPFormat==null && other.getOTPFormat()==null) || 
             (this.OTPFormat!=null &&
              this.OTPFormat.equals(other.getOTPFormat()))) &&
            ((this.secret==null && other.getSecret()==null) || 
             (this.secret!=null &&
              this.secret.equals(other.getSecret()))) &&
            ((this.counter==null && other.getCounter()==null) || 
             (this.counter!=null &&
              this.counter.equals(other.getCounter()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.timeInterval==null && other.getTimeInterval()==null) || 
             (this.timeInterval!=null &&
              this.timeInterval.equals(other.getTimeInterval()))) &&
            ((this.keyAlgorithm==null && other.getKeyAlgorithm()==null) || 
             (this.keyAlgorithm!=null &&
              this.keyAlgorithm.equals(other.getKeyAlgorithm()))) &&
            ((this.keyId==null && other.getKeyId()==null) || 
             (this.keyId!=null &&
              this.keyId.equals(other.getKeyId())));
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
        if (getOTPFormat() != null) {
            _hashCode += getOTPFormat().hashCode();
        }
        if (getSecret() != null) {
            _hashCode += getSecret().hashCode();
        }
        if (getCounter() != null) {
            _hashCode += getCounter().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTimeInterval() != null) {
            _hashCode += getTimeInterval().hashCode();
        }
        if (getKeyAlgorithm() != null) {
            _hashCode += getKeyAlgorithm().hashCode();
        }
        if (getKeyId() != null) {
            _hashCode += getKeyId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Key.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Key"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("keyAlgorithm");
        attrField.setXmlName(new javax.xml.namespace.QName("", "KeyAlgorithm"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("keyId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "KeyId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "OTPFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "OTPFormat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secret");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Secret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Counter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "TimeInterval"));
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
