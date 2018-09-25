/**
 * KeyConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * KeyConfig is the structure used to
 * 				represent key
 * 				configuration.
 */
public class KeyConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Label in HSM for key. */
    private java.lang.String label;

    /* Key status represents whether key is active or not.
     * 								if its value is 1 then key is active,
     * 								if its value is 2 then key is inactive,
     * 								if its value is 3 then key is retired. */
    private java.lang.Integer keyStatus;

    /* Flag that indicates whether key is present in
     * 								HSM or not. */
    private java.lang.Boolean keyInHSM;

    /* This data structure represents the Key validity. 
     * 								In key creation Server will always take current
     * 								date as validityBegin even though caller passes 
     * 								the value of it. In key updation if validityEnd 
     * 								is relative then server will calculate validity 
     * 								end date w.r.t. existing validity end date. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity;

    public KeyConfig() {
    }

    public KeyConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.String label,
           java.lang.Integer keyStatus,
           java.lang.Boolean keyInHSM,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity) {
        super(
            name,
            status);
        this.label = label;
        this.keyStatus = keyStatus;
        this.keyInHSM = keyInHSM;
        this.validity = validity;
    }


    /**
     * Gets the label value for this KeyConfig.
     * 
     * @return label   * Label in HSM for key.
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this KeyConfig.
     * 
     * @param label   * Label in HSM for key.
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the keyStatus value for this KeyConfig.
     * 
     * @return keyStatus   * Key status represents whether key is active or not.
     * 								if its value is 1 then key is active,
     * 								if its value is 2 then key is inactive,
     * 								if its value is 3 then key is retired.
     */
    public java.lang.Integer getKeyStatus() {
        return keyStatus;
    }


    /**
     * Sets the keyStatus value for this KeyConfig.
     * 
     * @param keyStatus   * Key status represents whether key is active or not.
     * 								if its value is 1 then key is active,
     * 								if its value is 2 then key is inactive,
     * 								if its value is 3 then key is retired.
     */
    public void setKeyStatus(java.lang.Integer keyStatus) {
        this.keyStatus = keyStatus;
    }


    /**
     * Gets the keyInHSM value for this KeyConfig.
     * 
     * @return keyInHSM   * Flag that indicates whether key is present in
     * 								HSM or not.
     */
    public java.lang.Boolean getKeyInHSM() {
        return keyInHSM;
    }


    /**
     * Sets the keyInHSM value for this KeyConfig.
     * 
     * @param keyInHSM   * Flag that indicates whether key is present in
     * 								HSM or not.
     */
    public void setKeyInHSM(java.lang.Boolean keyInHSM) {
        this.keyInHSM = keyInHSM;
    }


    /**
     * Gets the validity value for this KeyConfig.
     * 
     * @return validity   * This data structure represents the Key validity. 
     * 								In key creation Server will always take current
     * 								date as validityBegin even though caller passes 
     * 								the value of it. In key updation if validityEnd 
     * 								is relative then server will calculate validity 
     * 								end date w.r.t. existing validity end date.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this KeyConfig.
     * 
     * @param validity   * This data structure represents the Key validity. 
     * 								In key creation Server will always take current
     * 								date as validityBegin even though caller passes 
     * 								the value of it. In key updation if validityEnd 
     * 								is relative then server will calculate validity 
     * 								end date w.r.t. existing validity end date.
     */
    public void setValidity(com.arcot.ws.WebFortCommonAPI._7_0.xsd.Validity validity) {
        this.validity = validity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyConfig)) return false;
        KeyConfig other = (KeyConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.keyStatus==null && other.getKeyStatus()==null) || 
             (this.keyStatus!=null &&
              this.keyStatus.equals(other.getKeyStatus()))) &&
            ((this.keyInHSM==null && other.getKeyInHSM()==null) || 
             (this.keyInHSM!=null &&
              this.keyInHSM.equals(other.getKeyInHSM()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getKeyStatus() != null) {
            _hashCode += getKeyStatus().hashCode();
        }
        if (getKeyInHSM() != null) {
            _hashCode += getKeyInHSM().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "KeyConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyInHSM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "keyInHSM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
