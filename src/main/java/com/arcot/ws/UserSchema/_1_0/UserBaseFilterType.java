/**
 * UserBaseFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * 1) If includeImage is set to true, user's image information is
 * also retrieved if present.
 * 			  2) If includeAccounts is set is true, user account information
 * is also retrieved if present.
 */
public class UserBaseFilterType  implements java.io.Serializable {
    private java.lang.Boolean includeImage;

    private java.lang.Boolean includeAccounts;

    public UserBaseFilterType() {
    }

    public UserBaseFilterType(
           java.lang.Boolean includeImage,
           java.lang.Boolean includeAccounts) {
           this.includeImage = includeImage;
           this.includeAccounts = includeAccounts;
    }


    /**
     * Gets the includeImage value for this UserBaseFilterType.
     * 
     * @return includeImage
     */
    public java.lang.Boolean getIncludeImage() {
        return includeImage;
    }


    /**
     * Sets the includeImage value for this UserBaseFilterType.
     * 
     * @param includeImage
     */
    public void setIncludeImage(java.lang.Boolean includeImage) {
        this.includeImage = includeImage;
    }


    /**
     * Gets the includeAccounts value for this UserBaseFilterType.
     * 
     * @return includeAccounts
     */
    public java.lang.Boolean getIncludeAccounts() {
        return includeAccounts;
    }


    /**
     * Sets the includeAccounts value for this UserBaseFilterType.
     * 
     * @param includeAccounts
     */
    public void setIncludeAccounts(java.lang.Boolean includeAccounts) {
        this.includeAccounts = includeAccounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserBaseFilterType)) return false;
        UserBaseFilterType other = (UserBaseFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeImage==null && other.getIncludeImage()==null) || 
             (this.includeImage!=null &&
              this.includeImage.equals(other.getIncludeImage()))) &&
            ((this.includeAccounts==null && other.getIncludeAccounts()==null) || 
             (this.includeAccounts!=null &&
              this.includeAccounts.equals(other.getIncludeAccounts())));
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
        if (getIncludeImage() != null) {
            _hashCode += getIncludeImage().hashCode();
        }
        if (getIncludeAccounts() != null) {
            _hashCode += getIncludeAccounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserBaseFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserBaseFilterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "includeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "includeAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
