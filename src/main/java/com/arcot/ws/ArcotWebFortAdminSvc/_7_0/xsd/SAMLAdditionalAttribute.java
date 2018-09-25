/**
 * SAMLAdditionalAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * SAMLAdditionalAttribute is the structure used
 * 				to
 * 				represent additional attributes used in SAML
 * 				token.
 */
public class SAMLAdditionalAttribute  implements java.io.Serializable {
    /* Attribute namespace. */
    private java.lang.String attributeNameSpace;

    /* Attribute name format. */
    private java.lang.String nameFormat;

    /* Attribute name. */
    private java.lang.String attributeName;

    /* Friendly name. */
    private java.lang.String friendlyName;

    public SAMLAdditionalAttribute() {
    }

    public SAMLAdditionalAttribute(
           java.lang.String attributeNameSpace,
           java.lang.String nameFormat,
           java.lang.String attributeName,
           java.lang.String friendlyName) {
           this.attributeNameSpace = attributeNameSpace;
           this.nameFormat = nameFormat;
           this.attributeName = attributeName;
           this.friendlyName = friendlyName;
    }


    /**
     * Gets the attributeNameSpace value for this SAMLAdditionalAttribute.
     * 
     * @return attributeNameSpace   * Attribute namespace.
     */
    public java.lang.String getAttributeNameSpace() {
        return attributeNameSpace;
    }


    /**
     * Sets the attributeNameSpace value for this SAMLAdditionalAttribute.
     * 
     * @param attributeNameSpace   * Attribute namespace.
     */
    public void setAttributeNameSpace(java.lang.String attributeNameSpace) {
        this.attributeNameSpace = attributeNameSpace;
    }


    /**
     * Gets the nameFormat value for this SAMLAdditionalAttribute.
     * 
     * @return nameFormat   * Attribute name format.
     */
    public java.lang.String getNameFormat() {
        return nameFormat;
    }


    /**
     * Sets the nameFormat value for this SAMLAdditionalAttribute.
     * 
     * @param nameFormat   * Attribute name format.
     */
    public void setNameFormat(java.lang.String nameFormat) {
        this.nameFormat = nameFormat;
    }


    /**
     * Gets the attributeName value for this SAMLAdditionalAttribute.
     * 
     * @return attributeName   * Attribute name.
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this SAMLAdditionalAttribute.
     * 
     * @param attributeName   * Attribute name.
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the friendlyName value for this SAMLAdditionalAttribute.
     * 
     * @return friendlyName   * Friendly name.
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this SAMLAdditionalAttribute.
     * 
     * @param friendlyName   * Friendly name.
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAMLAdditionalAttribute)) return false;
        SAMLAdditionalAttribute other = (SAMLAdditionalAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeNameSpace==null && other.getAttributeNameSpace()==null) || 
             (this.attributeNameSpace!=null &&
              this.attributeNameSpace.equals(other.getAttributeNameSpace()))) &&
            ((this.nameFormat==null && other.getNameFormat()==null) || 
             (this.nameFormat!=null &&
              this.nameFormat.equals(other.getNameFormat()))) &&
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName())));
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
        if (getAttributeNameSpace() != null) {
            _hashCode += getAttributeNameSpace().hashCode();
        }
        if (getNameFormat() != null) {
            _hashCode += getNameFormat().hashCode();
        }
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAMLAdditionalAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "SAMLAdditionalAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeNameSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "attributeNameSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "nameFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "FriendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
