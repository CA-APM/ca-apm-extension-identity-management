/**
 * OTPCounterTolerance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * OTPCounterTolerance is the structure used to
 * 				represent the look ahead and look back in authentication
 * 				and
 * 				synchronization cases.
 */
public class OTPCounterTolerance  implements java.io.Serializable {
    /* Authentication look ahead count. */
    private java.lang.Integer authLookAhead;

    /* Authentication look back count. */
    private java.lang.Integer authLookBack;

    /* Synchronization look ahead count. */
    private java.lang.Integer reSyncLookAhead;

    /* Synchronization look back count. */
    private java.lang.Integer reSyncLookBack;

    public OTPCounterTolerance() {
    }

    public OTPCounterTolerance(
           java.lang.Integer authLookAhead,
           java.lang.Integer authLookBack,
           java.lang.Integer reSyncLookAhead,
           java.lang.Integer reSyncLookBack) {
           this.authLookAhead = authLookAhead;
           this.authLookBack = authLookBack;
           this.reSyncLookAhead = reSyncLookAhead;
           this.reSyncLookBack = reSyncLookBack;
    }


    /**
     * Gets the authLookAhead value for this OTPCounterTolerance.
     * 
     * @return authLookAhead   * Authentication look ahead count.
     */
    public java.lang.Integer getAuthLookAhead() {
        return authLookAhead;
    }


    /**
     * Sets the authLookAhead value for this OTPCounterTolerance.
     * 
     * @param authLookAhead   * Authentication look ahead count.
     */
    public void setAuthLookAhead(java.lang.Integer authLookAhead) {
        this.authLookAhead = authLookAhead;
    }


    /**
     * Gets the authLookBack value for this OTPCounterTolerance.
     * 
     * @return authLookBack   * Authentication look back count.
     */
    public java.lang.Integer getAuthLookBack() {
        return authLookBack;
    }


    /**
     * Sets the authLookBack value for this OTPCounterTolerance.
     * 
     * @param authLookBack   * Authentication look back count.
     */
    public void setAuthLookBack(java.lang.Integer authLookBack) {
        this.authLookBack = authLookBack;
    }


    /**
     * Gets the reSyncLookAhead value for this OTPCounterTolerance.
     * 
     * @return reSyncLookAhead   * Synchronization look ahead count.
     */
    public java.lang.Integer getReSyncLookAhead() {
        return reSyncLookAhead;
    }


    /**
     * Sets the reSyncLookAhead value for this OTPCounterTolerance.
     * 
     * @param reSyncLookAhead   * Synchronization look ahead count.
     */
    public void setReSyncLookAhead(java.lang.Integer reSyncLookAhead) {
        this.reSyncLookAhead = reSyncLookAhead;
    }


    /**
     * Gets the reSyncLookBack value for this OTPCounterTolerance.
     * 
     * @return reSyncLookBack   * Synchronization look back count.
     */
    public java.lang.Integer getReSyncLookBack() {
        return reSyncLookBack;
    }


    /**
     * Sets the reSyncLookBack value for this OTPCounterTolerance.
     * 
     * @param reSyncLookBack   * Synchronization look back count.
     */
    public void setReSyncLookBack(java.lang.Integer reSyncLookBack) {
        this.reSyncLookBack = reSyncLookBack;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTPCounterTolerance)) return false;
        OTPCounterTolerance other = (OTPCounterTolerance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authLookAhead==null && other.getAuthLookAhead()==null) || 
             (this.authLookAhead!=null &&
              this.authLookAhead.equals(other.getAuthLookAhead()))) &&
            ((this.authLookBack==null && other.getAuthLookBack()==null) || 
             (this.authLookBack!=null &&
              this.authLookBack.equals(other.getAuthLookBack()))) &&
            ((this.reSyncLookAhead==null && other.getReSyncLookAhead()==null) || 
             (this.reSyncLookAhead!=null &&
              this.reSyncLookAhead.equals(other.getReSyncLookAhead()))) &&
            ((this.reSyncLookBack==null && other.getReSyncLookBack()==null) || 
             (this.reSyncLookBack!=null &&
              this.reSyncLookBack.equals(other.getReSyncLookBack())));
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
        if (getAuthLookAhead() != null) {
            _hashCode += getAuthLookAhead().hashCode();
        }
        if (getAuthLookBack() != null) {
            _hashCode += getAuthLookBack().hashCode();
        }
        if (getReSyncLookAhead() != null) {
            _hashCode += getReSyncLookAhead().hashCode();
        }
        if (getReSyncLookBack() != null) {
            _hashCode += getReSyncLookBack().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTPCounterTolerance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "OTPCounterTolerance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authLookAhead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "authLookAhead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authLookBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "authLookBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reSyncLookAhead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "reSyncLookAhead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reSyncLookBack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "reSyncLookBack"));
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
