/**
 * UserCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * UserCheck is the structure used to represent
 * 				the
 * 				user attributes that are need to be checked.
 */
public class UserCheck  implements java.io.Serializable {
    /* Flag that indicates the user active check. */
    private java.lang.Boolean userActiveCheck;

    /* User attributes that are need to be checked. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType userAttributesToCheck;

    public UserCheck() {
    }

    public UserCheck(
           java.lang.Boolean userActiveCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType userAttributesToCheck) {
           this.userActiveCheck = userActiveCheck;
           this.userAttributesToCheck = userAttributesToCheck;
    }


    /**
     * Gets the userActiveCheck value for this UserCheck.
     * 
     * @return userActiveCheck   * Flag that indicates the user active check.
     */
    public java.lang.Boolean getUserActiveCheck() {
        return userActiveCheck;
    }


    /**
     * Sets the userActiveCheck value for this UserCheck.
     * 
     * @param userActiveCheck   * Flag that indicates the user active check.
     */
    public void setUserActiveCheck(java.lang.Boolean userActiveCheck) {
        this.userActiveCheck = userActiveCheck;
    }


    /**
     * Gets the userAttributesToCheck value for this UserCheck.
     * 
     * @return userAttributesToCheck   * User attributes that are need to be checked.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType getUserAttributesToCheck() {
        return userAttributesToCheck;
    }


    /**
     * Sets the userAttributesToCheck value for this UserCheck.
     * 
     * @param userAttributesToCheck   * User attributes that are need to be checked.
     */
    public void setUserAttributesToCheck(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType userAttributesToCheck) {
        this.userAttributesToCheck = userAttributesToCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCheck)) return false;
        UserCheck other = (UserCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userActiveCheck==null && other.getUserActiveCheck()==null) || 
             (this.userActiveCheck!=null &&
              this.userActiveCheck.equals(other.getUserActiveCheck()))) &&
            ((this.userAttributesToCheck==null && other.getUserAttributesToCheck()==null) || 
             (this.userAttributesToCheck!=null &&
              this.userAttributesToCheck.equals(other.getUserAttributesToCheck())));
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
        if (getUserActiveCheck() != null) {
            _hashCode += getUserActiveCheck().hashCode();
        }
        if (getUserAttributesToCheck() != null) {
            _hashCode += getUserAttributesToCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "UserCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userActiveCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "userActiveCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAttributesToCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "userAttributesToCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType"));
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
