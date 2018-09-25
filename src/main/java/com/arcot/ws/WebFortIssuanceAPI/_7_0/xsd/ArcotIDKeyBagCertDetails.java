/**
 * ArcotIDKeyBagCertDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Information in a human readable form about a certificate that has
 * 				been loaded into the  ArcotID-Keybag.
 * 				elementId 	- an internal identifier for the certificate and corresponding
 * key if any. This is used to refer to the elements in requests like
 * delete.
 * 				issuerName  - full Distinguished Name of the issuer of the certificate.
 * 				certSubject - full Distinguished Name of the subject of the certificate.
 * 				certValidFrom -  date and time the certificate may be used.
 * 				certValidTo   -  date and time of the certificate expiration.
 * 				hasPrivatekey - true : The private key corresponding to the certificate
 * exists in the KeyBag.
 */
public class ArcotIDKeyBagCertDetails  implements java.io.Serializable {
    private java.lang.String elementId;

    private java.lang.String issuerName;

    private java.lang.String serialNumber;

    private java.lang.String certSubject;

    private java.util.Calendar certValidFrom;

    private java.util.Calendar certValidTo;

    private boolean hasPrivatekey;

    public ArcotIDKeyBagCertDetails() {
    }

    public ArcotIDKeyBagCertDetails(
           java.lang.String elementId,
           java.lang.String issuerName,
           java.lang.String serialNumber,
           java.lang.String certSubject,
           java.util.Calendar certValidFrom,
           java.util.Calendar certValidTo,
           boolean hasPrivatekey) {
           this.elementId = elementId;
           this.issuerName = issuerName;
           this.serialNumber = serialNumber;
           this.certSubject = certSubject;
           this.certValidFrom = certValidFrom;
           this.certValidTo = certValidTo;
           this.hasPrivatekey = hasPrivatekey;
    }


    /**
     * Gets the elementId value for this ArcotIDKeyBagCertDetails.
     * 
     * @return elementId
     */
    public java.lang.String getElementId() {
        return elementId;
    }


    /**
     * Sets the elementId value for this ArcotIDKeyBagCertDetails.
     * 
     * @param elementId
     */
    public void setElementId(java.lang.String elementId) {
        this.elementId = elementId;
    }


    /**
     * Gets the issuerName value for this ArcotIDKeyBagCertDetails.
     * 
     * @return issuerName
     */
    public java.lang.String getIssuerName() {
        return issuerName;
    }


    /**
     * Sets the issuerName value for this ArcotIDKeyBagCertDetails.
     * 
     * @param issuerName
     */
    public void setIssuerName(java.lang.String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets the serialNumber value for this ArcotIDKeyBagCertDetails.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ArcotIDKeyBagCertDetails.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the certSubject value for this ArcotIDKeyBagCertDetails.
     * 
     * @return certSubject
     */
    public java.lang.String getCertSubject() {
        return certSubject;
    }


    /**
     * Sets the certSubject value for this ArcotIDKeyBagCertDetails.
     * 
     * @param certSubject
     */
    public void setCertSubject(java.lang.String certSubject) {
        this.certSubject = certSubject;
    }


    /**
     * Gets the certValidFrom value for this ArcotIDKeyBagCertDetails.
     * 
     * @return certValidFrom
     */
    public java.util.Calendar getCertValidFrom() {
        return certValidFrom;
    }


    /**
     * Sets the certValidFrom value for this ArcotIDKeyBagCertDetails.
     * 
     * @param certValidFrom
     */
    public void setCertValidFrom(java.util.Calendar certValidFrom) {
        this.certValidFrom = certValidFrom;
    }


    /**
     * Gets the certValidTo value for this ArcotIDKeyBagCertDetails.
     * 
     * @return certValidTo
     */
    public java.util.Calendar getCertValidTo() {
        return certValidTo;
    }


    /**
     * Sets the certValidTo value for this ArcotIDKeyBagCertDetails.
     * 
     * @param certValidTo
     */
    public void setCertValidTo(java.util.Calendar certValidTo) {
        this.certValidTo = certValidTo;
    }


    /**
     * Gets the hasPrivatekey value for this ArcotIDKeyBagCertDetails.
     * 
     * @return hasPrivatekey
     */
    public boolean isHasPrivatekey() {
        return hasPrivatekey;
    }


    /**
     * Sets the hasPrivatekey value for this ArcotIDKeyBagCertDetails.
     * 
     * @param hasPrivatekey
     */
    public void setHasPrivatekey(boolean hasPrivatekey) {
        this.hasPrivatekey = hasPrivatekey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagCertDetails)) return false;
        ArcotIDKeyBagCertDetails other = (ArcotIDKeyBagCertDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementId==null && other.getElementId()==null) || 
             (this.elementId!=null &&
              this.elementId.equals(other.getElementId()))) &&
            ((this.issuerName==null && other.getIssuerName()==null) || 
             (this.issuerName!=null &&
              this.issuerName.equals(other.getIssuerName()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.certSubject==null && other.getCertSubject()==null) || 
             (this.certSubject!=null &&
              this.certSubject.equals(other.getCertSubject()))) &&
            ((this.certValidFrom==null && other.getCertValidFrom()==null) || 
             (this.certValidFrom!=null &&
              this.certValidFrom.equals(other.getCertValidFrom()))) &&
            ((this.certValidTo==null && other.getCertValidTo()==null) || 
             (this.certValidTo!=null &&
              this.certValidTo.equals(other.getCertValidTo()))) &&
            this.hasPrivatekey == other.isHasPrivatekey();
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
        if (getElementId() != null) {
            _hashCode += getElementId().hashCode();
        }
        if (getIssuerName() != null) {
            _hashCode += getIssuerName().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getCertSubject() != null) {
            _hashCode += getCertSubject().hashCode();
        }
        if (getCertValidFrom() != null) {
            _hashCode += getCertValidFrom().hashCode();
        }
        if (getCertValidTo() != null) {
            _hashCode += getCertValidTo().hashCode();
        }
        _hashCode += (isHasPrivatekey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagCertDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagCertDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "elementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "issuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "certSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certValidFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "certValidFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certValidTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "certValidTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPrivatekey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "hasPrivatekey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
