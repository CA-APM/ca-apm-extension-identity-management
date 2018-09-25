/**
 * UploadOATHTokensType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Construct a single request object for uploading
 * 						OATH tokens.
 */
public class UploadOATHTokensType  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails;

    /* Remark if any for the current batch of tokens
     * 								being uploaded. */
    private java.lang.String remark;

    /* Key in HEX format to decrypt the token file.
     * 								Will be empty if the keys are in plain. */
    private java.lang.String key;

    private com.arcot.www.ArWFTokenExchangeFormat._1_0.ArKeyContainer keyContainer;

    public UploadOATHTokensType() {
    }

    public UploadOATHTokensType(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails,
           java.lang.String remark,
           java.lang.String key,
           com.arcot.www.ArWFTokenExchangeFormat._1_0.ArKeyContainer keyContainer) {
           this.orgDetails = orgDetails;
           this.remark = remark;
           this.key = key;
           this.keyContainer = keyContainer;
    }


    /**
     * Gets the orgDetails value for this UploadOATHTokensType.
     * 
     * @return orgDetails
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails getOrgDetails() {
        return orgDetails;
    }


    /**
     * Sets the orgDetails value for this UploadOATHTokensType.
     * 
     * @param orgDetails
     */
    public void setOrgDetails(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetails orgDetails) {
        this.orgDetails = orgDetails;
    }


    /**
     * Gets the remark value for this UploadOATHTokensType.
     * 
     * @return remark   * Remark if any for the current batch of tokens
     * 								being uploaded.
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this UploadOATHTokensType.
     * 
     * @param remark   * Remark if any for the current batch of tokens
     * 								being uploaded.
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the key value for this UploadOATHTokensType.
     * 
     * @return key   * Key in HEX format to decrypt the token file.
     * 								Will be empty if the keys are in plain.
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this UploadOATHTokensType.
     * 
     * @param key   * Key in HEX format to decrypt the token file.
     * 								Will be empty if the keys are in plain.
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the keyContainer value for this UploadOATHTokensType.
     * 
     * @return keyContainer
     */
    public com.arcot.www.ArWFTokenExchangeFormat._1_0.ArKeyContainer getKeyContainer() {
        return keyContainer;
    }


    /**
     * Sets the keyContainer value for this UploadOATHTokensType.
     * 
     * @param keyContainer
     */
    public void setKeyContainer(com.arcot.www.ArWFTokenExchangeFormat._1_0.ArKeyContainer keyContainer) {
        this.keyContainer = keyContainer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadOATHTokensType)) return false;
        UploadOATHTokensType other = (UploadOATHTokensType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgDetails==null && other.getOrgDetails()==null) || 
             (this.orgDetails!=null &&
              this.orgDetails.equals(other.getOrgDetails()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.keyContainer==null && other.getKeyContainer()==null) || 
             (this.keyContainer!=null &&
              this.keyContainer.equals(other.getKeyContainer())));
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
        if (getOrgDetails() != null) {
            _hashCode += getOrgDetails().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getKeyContainer() != null) {
            _hashCode += getKeyContainer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadOATHTokensType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "UploadOATHTokensType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "orgDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "keyContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.arcot.com/ArWFTokenExchangeFormat/1.0", "ArKeyContainer"));
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
