/**
 * OATHOTPInputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the data that is needed to create the
 * 				OATH credential.tokenID - Identifier of the
 * 				token.reUseToken - Reuse
 * 				the token that was
 * 				already used by some other user.
 */
public class OATHOTPInputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialInputType  implements java.io.Serializable {
    private java.lang.String tokenID;

    private java.lang.Boolean reUseToken;

    public OATHOTPInputType() {
    }

    public OATHOTPInputType(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String profileName,
           java.util.Calendar validityEndTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime,
           java.lang.String tokenID,
           java.lang.Boolean reUseToken) {
        super(
            notes,
            profileName,
            validityEndTime,
            validityEndTimeEx,
            disableStartTime,
            disableEndTime);
        this.tokenID = tokenID;
        this.reUseToken = reUseToken;
    }


    /**
     * Gets the tokenID value for this OATHOTPInputType.
     * 
     * @return tokenID
     */
    public java.lang.String getTokenID() {
        return tokenID;
    }


    /**
     * Sets the tokenID value for this OATHOTPInputType.
     * 
     * @param tokenID
     */
    public void setTokenID(java.lang.String tokenID) {
        this.tokenID = tokenID;
    }


    /**
     * Gets the reUseToken value for this OATHOTPInputType.
     * 
     * @return reUseToken
     */
    public java.lang.Boolean getReUseToken() {
        return reUseToken;
    }


    /**
     * Sets the reUseToken value for this OATHOTPInputType.
     * 
     * @param reUseToken
     */
    public void setReUseToken(java.lang.Boolean reUseToken) {
        this.reUseToken = reUseToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OATHOTPInputType)) return false;
        OATHOTPInputType other = (OATHOTPInputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenID==null && other.getTokenID()==null) || 
             (this.tokenID!=null &&
              this.tokenID.equals(other.getTokenID()))) &&
            ((this.reUseToken==null && other.getReUseToken()==null) || 
             (this.reUseToken!=null &&
              this.reUseToken.equals(other.getReUseToken())));
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
        if (getTokenID() != null) {
            _hashCode += getTokenID().hashCode();
        }
        if (getReUseToken() != null) {
            _hashCode += getReUseToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OATHOTPInputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "OATHOTPInputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "tokenID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reUseToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "reUseToken"));
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
