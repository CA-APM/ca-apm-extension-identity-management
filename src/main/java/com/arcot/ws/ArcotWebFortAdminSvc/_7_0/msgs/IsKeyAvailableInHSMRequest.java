/**
 * IsKeyAvailableInHSMRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class IsKeyAvailableInHSMRequest  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq  implements java.io.Serializable {
    /* Label of the key that is present
     * 									in HSM. */
    private java.lang.String keyLabel;

    public IsKeyAvailableInHSMRequest() {
    }

    public IsKeyAvailableInHSMRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           java.lang.String keyLabel) {
        super(
            clientTxnId,
            additionalInput);
        this.keyLabel = keyLabel;
    }


    /**
     * Gets the keyLabel value for this IsKeyAvailableInHSMRequest.
     * 
     * @return keyLabel   * Label of the key that is present
     * 									in HSM.
     */
    public java.lang.String getKeyLabel() {
        return keyLabel;
    }


    /**
     * Sets the keyLabel value for this IsKeyAvailableInHSMRequest.
     * 
     * @param keyLabel   * Label of the key that is present
     * 									in HSM.
     */
    public void setKeyLabel(java.lang.String keyLabel) {
        this.keyLabel = keyLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsKeyAvailableInHSMRequest)) return false;
        IsKeyAvailableInHSMRequest other = (IsKeyAvailableInHSMRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyLabel==null && other.getKeyLabel()==null) || 
             (this.keyLabel!=null &&
              this.keyLabel.equals(other.getKeyLabel())));
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
        if (getKeyLabel() != null) {
            _hashCode += getKeyLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsKeyAvailableInHSMRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">IsKeyAvailableInHSMRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "keyLabel"));
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
