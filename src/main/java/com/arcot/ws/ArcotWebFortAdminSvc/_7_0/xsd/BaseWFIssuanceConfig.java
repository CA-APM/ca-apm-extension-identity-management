/**
 * BaseWFIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * Base class of all admin profile data structures.
 */
public class BaseWFIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Number of times credential can be used in
     * 								successful authentication. */
    private java.lang.Integer multipleUsageCount;

    /* Usage type of the credential. */
    private java.lang.String usageType;

    /* Validity of the credential. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity;

    /* User attributes that are need to be checked. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck;

    /* Custom attributes. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes;

    public BaseWFIssuanceConfig() {
    }

    public BaseWFIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes) {
        super(
            name,
            status);
        this.multipleUsageCount = multipleUsageCount;
        this.usageType = usageType;
        this.validity = validity;
        this.userCheck = userCheck;
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the multipleUsageCount value for this BaseWFIssuanceConfig.
     * 
     * @return multipleUsageCount   * Number of times credential can be used in
     * 								successful authentication.
     */
    public java.lang.Integer getMultipleUsageCount() {
        return multipleUsageCount;
    }


    /**
     * Sets the multipleUsageCount value for this BaseWFIssuanceConfig.
     * 
     * @param multipleUsageCount   * Number of times credential can be used in
     * 								successful authentication.
     */
    public void setMultipleUsageCount(java.lang.Integer multipleUsageCount) {
        this.multipleUsageCount = multipleUsageCount;
    }


    /**
     * Gets the usageType value for this BaseWFIssuanceConfig.
     * 
     * @return usageType   * Usage type of the credential.
     */
    public java.lang.String getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this BaseWFIssuanceConfig.
     * 
     * @param usageType   * Usage type of the credential.
     */
    public void setUsageType(java.lang.String usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the validity value for this BaseWFIssuanceConfig.
     * 
     * @return validity   * Validity of the credential.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this BaseWFIssuanceConfig.
     * 
     * @param validity   * Validity of the credential.
     */
    public void setValidity(com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity) {
        this.validity = validity;
    }


    /**
     * Gets the userCheck value for this BaseWFIssuanceConfig.
     * 
     * @return userCheck   * User attributes that are need to be checked.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck getUserCheck() {
        return userCheck;
    }


    /**
     * Sets the userCheck value for this BaseWFIssuanceConfig.
     * 
     * @param userCheck   * User attributes that are need to be checked.
     */
    public void setUserCheck(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck) {
        this.userCheck = userCheck;
    }


    /**
     * Gets the customAttributes value for this BaseWFIssuanceConfig.
     * 
     * @return customAttributes   * Custom attributes.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this BaseWFIssuanceConfig.
     * 
     * @param customAttributes   * Custom attributes.
     */
    public void setCustomAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes) {
        this.customAttributes = customAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseWFIssuanceConfig)) return false;
        BaseWFIssuanceConfig other = (BaseWFIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.multipleUsageCount==null && other.getMultipleUsageCount()==null) || 
             (this.multipleUsageCount!=null &&
              this.multipleUsageCount.equals(other.getMultipleUsageCount()))) &&
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.userCheck==null && other.getUserCheck()==null) || 
             (this.userCheck!=null &&
              this.userCheck.equals(other.getUserCheck()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes())));
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
        if (getMultipleUsageCount() != null) {
            _hashCode += getMultipleUsageCount().hashCode();
        }
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getUserCheck() != null) {
            _hashCode += getUserCheck().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseWFIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleUsageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "multipleUsageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "Validity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "userCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "UserCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
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
