/**
 * SetPAMRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class SetPAMRequest  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserIdentifierType userId;

    private java.lang.String PAM;

    private java.lang.String pamImageUrl;

    private java.lang.String clientTxId;

    public SetPAMRequest() {
    }

    public SetPAMRequest(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType userId,
           java.lang.String PAM,
           java.lang.String pamImageUrl,
           java.lang.String clientTxId) {
           this.userId = userId;
           this.PAM = PAM;
           this.pamImageUrl = pamImageUrl;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the userId value for this SetPAMRequest.
     * 
     * @return userId
     */
    public com.arcot.ws.UserSchema._1_0.UserIdentifierType getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SetPAMRequest.
     * 
     * @param userId
     */
    public void setUserId(com.arcot.ws.UserSchema._1_0.UserIdentifierType userId) {
        this.userId = userId;
    }


    /**
     * Gets the PAM value for this SetPAMRequest.
     * 
     * @return PAM
     */
    public java.lang.String getPAM() {
        return PAM;
    }


    /**
     * Sets the PAM value for this SetPAMRequest.
     * 
     * @param PAM
     */
    public void setPAM(java.lang.String PAM) {
        this.PAM = PAM;
    }


    /**
     * Gets the pamImageUrl value for this SetPAMRequest.
     * 
     * @return pamImageUrl
     */
    public java.lang.String getPamImageUrl() {
        return pamImageUrl;
    }


    /**
     * Sets the pamImageUrl value for this SetPAMRequest.
     * 
     * @param pamImageUrl
     */
    public void setPamImageUrl(java.lang.String pamImageUrl) {
        this.pamImageUrl = pamImageUrl;
    }


    /**
     * Gets the clientTxId value for this SetPAMRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this SetPAMRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPAMRequest)) return false;
        SetPAMRequest other = (SetPAMRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.PAM==null && other.getPAM()==null) || 
             (this.PAM!=null &&
              this.PAM.equals(other.getPAM()))) &&
            ((this.pamImageUrl==null && other.getPamImageUrl()==null) || 
             (this.pamImageUrl!=null &&
              this.pamImageUrl.equals(other.getPamImageUrl()))) &&
            ((this.clientTxId==null && other.getClientTxId()==null) || 
             (this.clientTxId!=null &&
              this.clientTxId.equals(other.getClientTxId())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPAM() != null) {
            _hashCode += getPAM().hashCode();
        }
        if (getPamImageUrl() != null) {
            _hashCode += getPamImageUrl().hashCode();
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPAMRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">setPAMRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "PAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "pamImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "clientTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
