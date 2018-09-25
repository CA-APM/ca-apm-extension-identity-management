/**
 * TokenInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.www.ArWFTokenExchangeFormat._1_0;


/**
 * Describes the information about each token including
 * 		    vendor information, identity and any other additional details.
 */
public class TokenInfo  implements java.io.Serializable {
    /* Indicates the manufacturer of the token. */
    private java.lang.String manufacturer;

    /* Indicates the serial number of the token. */
    private java.lang.String serialNo;

    /* Indicates the model of the token. */
    private java.lang.String model;

    private com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo[] additionalInfo;

    public TokenInfo() {
    }

    public TokenInfo(
           java.lang.String manufacturer,
           java.lang.String serialNo,
           java.lang.String model,
           com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo[] additionalInfo) {
           this.manufacturer = manufacturer;
           this.serialNo = serialNo;
           this.model = model;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the manufacturer value for this TokenInfo.
     * 
     * @return manufacturer   * Indicates the manufacturer of the token.
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this TokenInfo.
     * 
     * @param manufacturer   * Indicates the manufacturer of the token.
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the serialNo value for this TokenInfo.
     * 
     * @return serialNo   * Indicates the serial number of the token.
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this TokenInfo.
     * 
     * @param serialNo   * Indicates the serial number of the token.
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the model value for this TokenInfo.
     * 
     * @return model   * Indicates the model of the token.
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this TokenInfo.
     * 
     * @param model   * Indicates the model of the token.
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the additionalInfo value for this TokenInfo.
     * 
     * @return additionalInfo
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this TokenInfo.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, com.arcot.www.ArWFTokenExchangeFormat._1_0.AdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenInfo)) return false;
        TokenInfo other = (TokenInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo())));
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
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "TokenInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "SerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "Model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "AdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
