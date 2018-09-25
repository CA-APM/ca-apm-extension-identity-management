/**
 * ArcotIDInputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the data that is needed to manage
 * 				ArcotID credential.
 */
public class ArcotIDInputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialInputType  implements java.io.Serializable {
    private java.lang.String password;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] unsignedAttributes;

    private java.lang.Boolean fetchAttributes;

    public ArcotIDInputType() {
    }

    public ArcotIDInputType(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String profileName,
           java.util.Calendar validityEndTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime,
           java.lang.String password,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] unsignedAttributes,
           java.lang.Boolean fetchAttributes) {
        super(
            notes,
            profileName,
            validityEndTime,
            validityEndTimeEx,
            disableStartTime,
            disableEndTime);
        this.password = password;
        this.unsignedAttributes = unsignedAttributes;
        this.fetchAttributes = fetchAttributes;
    }


    /**
     * Gets the password value for this ArcotIDInputType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ArcotIDInputType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the unsignedAttributes value for this ArcotIDInputType.
     * 
     * @return unsignedAttributes
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDAttributeType[] getUnsignedAttributes() {
        return unsignedAttributes;
    }


    /**
     * Sets the unsignedAttributes value for this ArcotIDInputType.
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
     * Gets the fetchAttributes value for this ArcotIDInputType.
     * 
     * @return fetchAttributes
     */
    public java.lang.Boolean getFetchAttributes() {
        return fetchAttributes;
    }


    /**
     * Sets the fetchAttributes value for this ArcotIDInputType.
     * 
     * @param fetchAttributes
     */
    public void setFetchAttributes(java.lang.Boolean fetchAttributes) {
        this.fetchAttributes = fetchAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDInputType)) return false;
        ArcotIDInputType other = (ArcotIDInputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.unsignedAttributes==null && other.getUnsignedAttributes()==null) || 
             (this.unsignedAttributes!=null &&
              java.util.Arrays.equals(this.unsignedAttributes, other.getUnsignedAttributes()))) &&
            ((this.fetchAttributes==null && other.getFetchAttributes()==null) || 
             (this.fetchAttributes!=null &&
              this.fetchAttributes.equals(other.getFetchAttributes())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
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
        if (getFetchAttributes() != null) {
            _hashCode += getFetchAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotIDInputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDInputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsignedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "unsignedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "fetchAttributes"));
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
