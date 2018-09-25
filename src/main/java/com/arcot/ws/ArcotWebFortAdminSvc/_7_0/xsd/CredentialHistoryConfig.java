/**
 * CredentialHistoryConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * CredentialHistoryConfig is the structure used to
 * 				represent the configuration required
 * 				for credential history.
 */
public class CredentialHistoryConfig  implements java.io.Serializable {
    /* History based on count. */
    private java.lang.Integer count;

    /* History based on time.
     * 						Only relative ArcotDateType is allowed,
     * 						anything else is (ignored and ) treated 
     * 						as relative. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType time;

    public CredentialHistoryConfig() {
    }

    public CredentialHistoryConfig(
           java.lang.Integer count,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType time) {
           this.count = count;
           this.time = time;
    }


    /**
     * Gets the count value for this CredentialHistoryConfig.
     * 
     * @return count   * History based on count.
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this CredentialHistoryConfig.
     * 
     * @param count   * History based on count.
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the time value for this CredentialHistoryConfig.
     * 
     * @return time   * History based on time.
     * 						Only relative ArcotDateType is allowed,
     * 						anything else is (ignored and ) treated 
     * 						as relative.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getTime() {
        return time;
    }


    /**
     * Sets the time value for this CredentialHistoryConfig.
     * 
     * @param time   * History based on time.
     * 						Only relative ArcotDateType is allowed,
     * 						anything else is (ignored and ) treated 
     * 						as relative.
     */
    public void setTime(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialHistoryConfig)) return false;
        CredentialHistoryConfig other = (CredentialHistoryConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredentialHistoryConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredentialHistoryConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
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
