/**
 * CredTypeResolutionConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * CredTypeResolutionConfig is the structure used to
 * 				represent credential type resolution configuration.
 */
public class CredTypeResolutionConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Credential to map. */
    private java.lang.Integer credType;

    /* User custom attribute that contains 
     * 								credential type. */
    private java.lang.String userAttributeForCredType;

    public CredTypeResolutionConfig() {
    }

    public CredTypeResolutionConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer credType,
           java.lang.String userAttributeForCredType) {
        super(
            name,
            status);
        this.credType = credType;
        this.userAttributeForCredType = userAttributeForCredType;
    }


    /**
     * Gets the credType value for this CredTypeResolutionConfig.
     * 
     * @return credType   * Credential to map.
     */
    public java.lang.Integer getCredType() {
        return credType;
    }


    /**
     * Sets the credType value for this CredTypeResolutionConfig.
     * 
     * @param credType   * Credential to map.
     */
    public void setCredType(java.lang.Integer credType) {
        this.credType = credType;
    }


    /**
     * Gets the userAttributeForCredType value for this CredTypeResolutionConfig.
     * 
     * @return userAttributeForCredType   * User custom attribute that contains 
     * 								credential type.
     */
    public java.lang.String getUserAttributeForCredType() {
        return userAttributeForCredType;
    }


    /**
     * Sets the userAttributeForCredType value for this CredTypeResolutionConfig.
     * 
     * @param userAttributeForCredType   * User custom attribute that contains 
     * 								credential type.
     */
    public void setUserAttributeForCredType(java.lang.String userAttributeForCredType) {
        this.userAttributeForCredType = userAttributeForCredType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredTypeResolutionConfig)) return false;
        CredTypeResolutionConfig other = (CredTypeResolutionConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.credType==null && other.getCredType()==null) || 
             (this.credType!=null &&
              this.credType.equals(other.getCredType()))) &&
            ((this.userAttributeForCredType==null && other.getUserAttributeForCredType()==null) || 
             (this.userAttributeForCredType!=null &&
              this.userAttributeForCredType.equals(other.getUserAttributeForCredType())));
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
        if (getCredType() != null) {
            _hashCode += getCredType().hashCode();
        }
        if (getUserAttributeForCredType() != null) {
            _hashCode += getUserAttributeForCredType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredTypeResolutionConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "CredTypeResolutionConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "credType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAttributeForCredType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "userAttributeForCredType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
