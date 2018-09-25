/**
 * EMVIssuanceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * EMVIssuanceConfig is the structure used to
 * 				represent EMV issuance configuration. These
 * 				configuration settings will be used while
 * 				issuing a new EMV credential to user.
 */
public class EMVIssuanceConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFIssuanceConfig  implements java.io.Serializable {
    /* Account type should correspond to PAN. */
    private java.lang.String accountType;

    /* Account attribute that contains 
     * 								PAN Sequence. */
    private java.lang.String attributeForPanSequence;

    /* Provisioning attributes are used for EMV. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes;

    /* EMV standard attributes. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList emvAttributes;

    /* Custom card attributes are used in EMV card. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes;

    public EMVIssuanceConfig() {
    }

    public EMVIssuanceConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer multipleUsageCount,
           java.lang.String usageType,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customAttributes,
           java.lang.String accountType,
           java.lang.String attributeForPanSequence,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList emvAttributes,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes) {
        super(
            name,
            status,
            multipleUsageCount,
            usageType,
            validity,
            userCheck,
            customAttributes);
        this.accountType = accountType;
        this.attributeForPanSequence = attributeForPanSequence;
        this.provisioningAttributes = provisioningAttributes;
        this.emvAttributes = emvAttributes;
        this.customCardAttributes = customCardAttributes;
    }


    /**
     * Gets the accountType value for this EMVIssuanceConfig.
     * 
     * @return accountType   * Account type should correspond to PAN.
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this EMVIssuanceConfig.
     * 
     * @param accountType   * Account type should correspond to PAN.
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the attributeForPanSequence value for this EMVIssuanceConfig.
     * 
     * @return attributeForPanSequence   * Account attribute that contains 
     * 								PAN Sequence.
     */
    public java.lang.String getAttributeForPanSequence() {
        return attributeForPanSequence;
    }


    /**
     * Sets the attributeForPanSequence value for this EMVIssuanceConfig.
     * 
     * @param attributeForPanSequence   * Account attribute that contains 
     * 								PAN Sequence.
     */
    public void setAttributeForPanSequence(java.lang.String attributeForPanSequence) {
        this.attributeForPanSequence = attributeForPanSequence;
    }


    /**
     * Gets the provisioningAttributes value for this EMVIssuanceConfig.
     * 
     * @return provisioningAttributes   * Provisioning attributes are used for EMV.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getProvisioningAttributes() {
        return provisioningAttributes;
    }


    /**
     * Sets the provisioningAttributes value for this EMVIssuanceConfig.
     * 
     * @param provisioningAttributes   * Provisioning attributes are used for EMV.
     */
    public void setProvisioningAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList provisioningAttributes) {
        this.provisioningAttributes = provisioningAttributes;
    }


    /**
     * Gets the emvAttributes value for this EMVIssuanceConfig.
     * 
     * @return emvAttributes   * EMV standard attributes.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getEmvAttributes() {
        return emvAttributes;
    }


    /**
     * Sets the emvAttributes value for this EMVIssuanceConfig.
     * 
     * @param emvAttributes   * EMV standard attributes.
     */
    public void setEmvAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList emvAttributes) {
        this.emvAttributes = emvAttributes;
    }


    /**
     * Gets the customCardAttributes value for this EMVIssuanceConfig.
     * 
     * @return customCardAttributes   * Custom card attributes are used in EMV card.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList getCustomCardAttributes() {
        return customCardAttributes;
    }


    /**
     * Sets the customCardAttributes value for this EMVIssuanceConfig.
     * 
     * @param customCardAttributes   * Custom card attributes are used in EMV card.
     */
    public void setCustomCardAttributes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairTypeList customCardAttributes) {
        this.customCardAttributes = customCardAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMVIssuanceConfig)) return false;
        EMVIssuanceConfig other = (EMVIssuanceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.attributeForPanSequence==null && other.getAttributeForPanSequence()==null) || 
             (this.attributeForPanSequence!=null &&
              this.attributeForPanSequence.equals(other.getAttributeForPanSequence()))) &&
            ((this.provisioningAttributes==null && other.getProvisioningAttributes()==null) || 
             (this.provisioningAttributes!=null &&
              this.provisioningAttributes.equals(other.getProvisioningAttributes()))) &&
            ((this.emvAttributes==null && other.getEmvAttributes()==null) || 
             (this.emvAttributes!=null &&
              this.emvAttributes.equals(other.getEmvAttributes()))) &&
            ((this.customCardAttributes==null && other.getCustomCardAttributes()==null) || 
             (this.customCardAttributes!=null &&
              this.customCardAttributes.equals(other.getCustomCardAttributes())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAttributeForPanSequence() != null) {
            _hashCode += getAttributeForPanSequence().hashCode();
        }
        if (getProvisioningAttributes() != null) {
            _hashCode += getProvisioningAttributes().hashCode();
        }
        if (getEmvAttributes() != null) {
            _hashCode += getEmvAttributes().hashCode();
        }
        if (getCustomCardAttributes() != null) {
            _hashCode += getCustomCardAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMVIssuanceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EMVIssuanceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeForPanSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "attributeForPanSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "provisioningAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "emvAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCardAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "customCardAttributes"));
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
