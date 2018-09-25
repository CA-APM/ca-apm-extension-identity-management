/**
 * ArcotOTPOutputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the ArcotOTP credential details.
 */
public class ArcotOTPOutputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialOutputType  implements java.io.Serializable {
    private java.lang.String card;

    private int type;

    private java.lang.Long counterOffSet;

    public ArcotOTPOutputType() {
    }

    public ArcotOTPOutputType(
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.Integer status,
           java.lang.Integer remainingUsageCount,
           java.util.Calendar createTime,
           java.util.Calendar lastUpdatedTime,
           java.util.Calendar validityStartTime,
           java.util.Calendar validityEndTime,
           java.util.Calendar disableStartTime,
           java.util.Calendar disableEndTime,
           java.lang.Integer numberOfFailedAuthAttempts,
           java.util.Calendar lastSuccessAuthAttemptTime,
           java.util.Calendar lastFailedAuthAttemptTime,
           java.lang.String profileName,
           java.lang.Integer profileVersion,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String card,
           int type,
           java.lang.Long counterOffSet) {
        super(
            userName,
            orgName,
            status,
            remainingUsageCount,
            createTime,
            lastUpdatedTime,
            validityStartTime,
            validityEndTime,
            disableStartTime,
            disableEndTime,
            numberOfFailedAuthAttempts,
            lastSuccessAuthAttemptTime,
            lastFailedAuthAttemptTime,
            profileName,
            profileVersion,
            notes);
        this.card = card;
        this.type = type;
        this.counterOffSet = counterOffSet;
    }


    /**
     * Gets the card value for this ArcotOTPOutputType.
     * 
     * @return card
     */
    public java.lang.String getCard() {
        return card;
    }


    /**
     * Sets the card value for this ArcotOTPOutputType.
     * 
     * @param card
     */
    public void setCard(java.lang.String card) {
        this.card = card;
    }


    /**
     * Gets the type value for this ArcotOTPOutputType.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this ArcotOTPOutputType.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the counterOffSet value for this ArcotOTPOutputType.
     * 
     * @return counterOffSet
     */
    public java.lang.Long getCounterOffSet() {
        return counterOffSet;
    }


    /**
     * Sets the counterOffSet value for this ArcotOTPOutputType.
     * 
     * @param counterOffSet
     */
    public void setCounterOffSet(java.lang.Long counterOffSet) {
        this.counterOffSet = counterOffSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotOTPOutputType)) return false;
        ArcotOTPOutputType other = (ArcotOTPOutputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            this.type == other.getType() &&
            ((this.counterOffSet==null && other.getCounterOffSet()==null) || 
             (this.counterOffSet!=null &&
              this.counterOffSet.equals(other.getCounterOffSet())));
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
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        _hashCode += getType();
        if (getCounterOffSet() != null) {
            _hashCode += getCounterOffSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotOTPOutputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotOTPOutputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterOffSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "counterOffSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
