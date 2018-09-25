/**
 * ArcotIDOutputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Provides the ArcotID credential details.
 */
public class ArcotIDOutputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialOutputType  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] unsignedAttributes;

    private java.lang.String arcotID;

    public ArcotIDOutputType() {
    }

    public ArcotIDOutputType(
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
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] unsignedAttributes,
           java.lang.String arcotID) {
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
        this.unsignedAttributes = unsignedAttributes;
        this.arcotID = arcotID;
    }


    /**
     * Gets the unsignedAttributes value for this ArcotIDOutputType.
     * 
     * @return unsignedAttributes
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] getUnsignedAttributes() {
        return unsignedAttributes;
    }


    /**
     * Sets the unsignedAttributes value for this ArcotIDOutputType.
     * 
     * @param unsignedAttributes
     */
    public void setUnsignedAttributes(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] unsignedAttributes) {
        this.unsignedAttributes = unsignedAttributes;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType getUnsignedAttributes(int i) {
        return this.unsignedAttributes[i];
    }

    public void setUnsignedAttributes(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType _value) {
        this.unsignedAttributes[i] = _value;
    }


    /**
     * Gets the arcotID value for this ArcotIDOutputType.
     * 
     * @return arcotID
     */
    public java.lang.String getArcotID() {
        return arcotID;
    }


    /**
     * Sets the arcotID value for this ArcotIDOutputType.
     * 
     * @param arcotID
     */
    public void setArcotID(java.lang.String arcotID) {
        this.arcotID = arcotID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDOutputType)) return false;
        ArcotIDOutputType other = (ArcotIDOutputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unsignedAttributes==null && other.getUnsignedAttributes()==null) || 
             (this.unsignedAttributes!=null &&
              java.util.Arrays.equals(this.unsignedAttributes, other.getUnsignedAttributes()))) &&
            ((this.arcotID==null && other.getArcotID()==null) || 
             (this.arcotID!=null &&
              this.arcotID.equals(other.getArcotID())));
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
        if (getUnsignedAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnsignedAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnsignedAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArcotID() != null) {
            _hashCode += getArcotID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDOutputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDOutputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsignedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "unsignedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arcotID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "arcotID"));
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
