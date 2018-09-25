/**
 * ArcotIDKeyBagElementSelection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Select different types of elements retrievable from the server
 * for a given ArcotID-KeyBag.
 * 				selectCertEncoding - a flag to be set to true to retrieve the
 * certificate encoding in the response.
 * 				selectCertsDetails - a flag to be set to true to retrieve the
 * certificate details in the response.
 */
public class ArcotIDKeyBagElementSelection  implements java.io.Serializable {
    private java.lang.Boolean selectCertEncoding;

    private java.lang.Boolean selectCertsDetails;

    public ArcotIDKeyBagElementSelection() {
    }

    public ArcotIDKeyBagElementSelection(
           java.lang.Boolean selectCertEncoding,
           java.lang.Boolean selectCertsDetails) {
           this.selectCertEncoding = selectCertEncoding;
           this.selectCertsDetails = selectCertsDetails;
    }


    /**
     * Gets the selectCertEncoding value for this ArcotIDKeyBagElementSelection.
     * 
     * @return selectCertEncoding
     */
    public java.lang.Boolean getSelectCertEncoding() {
        return selectCertEncoding;
    }


    /**
     * Sets the selectCertEncoding value for this ArcotIDKeyBagElementSelection.
     * 
     * @param selectCertEncoding
     */
    public void setSelectCertEncoding(java.lang.Boolean selectCertEncoding) {
        this.selectCertEncoding = selectCertEncoding;
    }


    /**
     * Gets the selectCertsDetails value for this ArcotIDKeyBagElementSelection.
     * 
     * @return selectCertsDetails
     */
    public java.lang.Boolean getSelectCertsDetails() {
        return selectCertsDetails;
    }


    /**
     * Sets the selectCertsDetails value for this ArcotIDKeyBagElementSelection.
     * 
     * @param selectCertsDetails
     */
    public void setSelectCertsDetails(java.lang.Boolean selectCertsDetails) {
        this.selectCertsDetails = selectCertsDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagElementSelection)) return false;
        ArcotIDKeyBagElementSelection other = (ArcotIDKeyBagElementSelection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectCertEncoding==null && other.getSelectCertEncoding()==null) || 
             (this.selectCertEncoding!=null &&
              this.selectCertEncoding.equals(other.getSelectCertEncoding()))) &&
            ((this.selectCertsDetails==null && other.getSelectCertsDetails()==null) || 
             (this.selectCertsDetails!=null &&
              this.selectCertsDetails.equals(other.getSelectCertsDetails())));
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
        if (getSelectCertEncoding() != null) {
            _hashCode += getSelectCertEncoding().hashCode();
        }
        if (getSelectCertsDetails() != null) {
            _hashCode += getSelectCertsDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagElementSelection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagElementSelection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectCertEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "selectCertEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectCertsDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "selectCertsDetails"));
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
