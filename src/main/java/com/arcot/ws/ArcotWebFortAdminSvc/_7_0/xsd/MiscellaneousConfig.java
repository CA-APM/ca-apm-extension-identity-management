/**
 * MiscellaneousConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * MiscellaneousConfig is the structure used to
 * 				represent miscellaneous configuration.
 */
public class MiscellaneousConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Validity time in seconds for native token. */
    private java.lang.Integer nativeTokenTimeout;

    /* One time token length. */
    private java.lang.Integer ottLength;

    /* Validity time in seconds for one time token. */
    private java.lang.Integer ottTimeout;

    public MiscellaneousConfig() {
    }

    public MiscellaneousConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer nativeTokenTimeout,
           java.lang.Integer ottLength,
           java.lang.Integer ottTimeout) {
        super(
            name,
            status);
        this.nativeTokenTimeout = nativeTokenTimeout;
        this.ottLength = ottLength;
        this.ottTimeout = ottTimeout;
    }


    /**
     * Gets the nativeTokenTimeout value for this MiscellaneousConfig.
     * 
     * @return nativeTokenTimeout   * Validity time in seconds for native token.
     */
    public java.lang.Integer getNativeTokenTimeout() {
        return nativeTokenTimeout;
    }


    /**
     * Sets the nativeTokenTimeout value for this MiscellaneousConfig.
     * 
     * @param nativeTokenTimeout   * Validity time in seconds for native token.
     */
    public void setNativeTokenTimeout(java.lang.Integer nativeTokenTimeout) {
        this.nativeTokenTimeout = nativeTokenTimeout;
    }


    /**
     * Gets the ottLength value for this MiscellaneousConfig.
     * 
     * @return ottLength   * One time token length.
     */
    public java.lang.Integer getOttLength() {
        return ottLength;
    }


    /**
     * Sets the ottLength value for this MiscellaneousConfig.
     * 
     * @param ottLength   * One time token length.
     */
    public void setOttLength(java.lang.Integer ottLength) {
        this.ottLength = ottLength;
    }


    /**
     * Gets the ottTimeout value for this MiscellaneousConfig.
     * 
     * @return ottTimeout   * Validity time in seconds for one time token.
     */
    public java.lang.Integer getOttTimeout() {
        return ottTimeout;
    }


    /**
     * Sets the ottTimeout value for this MiscellaneousConfig.
     * 
     * @param ottTimeout   * Validity time in seconds for one time token.
     */
    public void setOttTimeout(java.lang.Integer ottTimeout) {
        this.ottTimeout = ottTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MiscellaneousConfig)) return false;
        MiscellaneousConfig other = (MiscellaneousConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nativeTokenTimeout==null && other.getNativeTokenTimeout()==null) || 
             (this.nativeTokenTimeout!=null &&
              this.nativeTokenTimeout.equals(other.getNativeTokenTimeout()))) &&
            ((this.ottLength==null && other.getOttLength()==null) || 
             (this.ottLength!=null &&
              this.ottLength.equals(other.getOttLength()))) &&
            ((this.ottTimeout==null && other.getOttTimeout()==null) || 
             (this.ottTimeout!=null &&
              this.ottTimeout.equals(other.getOttTimeout())));
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
        if (getNativeTokenTimeout() != null) {
            _hashCode += getNativeTokenTimeout().hashCode();
        }
        if (getOttLength() != null) {
            _hashCode += getOttLength().hashCode();
        }
        if (getOttTimeout() != null) {
            _hashCode += getOttTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MiscellaneousConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "MiscellaneousConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeTokenTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "nativeTokenTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ottLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ottTimeout"));
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
