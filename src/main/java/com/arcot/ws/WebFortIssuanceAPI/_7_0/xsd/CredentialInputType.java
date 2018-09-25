/**
 * CredentialInputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Common input that is required by all credential
 * 				operations. validityEndTime is used to specify
 * 				the absolute date to
 * 				which the credential
 * 				validity should be changed. If you want to
 * 				specify relative date from validity start date
 * 				then use
 * 				validityEndTimeEx, for more details
 * 				look into the type ArcotDateType.
 * 				validityEndTimeEx will take precedence over
 * 				validityEndTime, that is
 * 				if both are specified
 * 				then validityEndTimeEx will be considered.
 */
public class CredentialInputType  implements java.io.Serializable {
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes;

    private java.lang.String profileName;

    private java.util.Calendar validityEndTime;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime;

    public CredentialInputType() {
    }

    public CredentialInputType(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String profileName,
           java.util.Calendar validityEndTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime) {
           this.notes = notes;
           this.profileName = profileName;
           this.validityEndTime = validityEndTime;
           this.validityEndTimeEx = validityEndTimeEx;
           this.disableStartTime = disableStartTime;
           this.disableEndTime = disableEndTime;
    }


    /**
     * Gets the notes value for this CredentialInputType.
     * 
     * @return notes
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this CredentialInputType.
     * 
     * @param notes
     */
    public void setNotes(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes) {
        this.notes = notes;
    }

    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType getNotes(int i) {
        return this.notes[i];
    }

    public void setNotes(int i, com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType _value) {
        this.notes[i] = _value;
    }


    /**
     * Gets the profileName value for this CredentialInputType.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this CredentialInputType.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the validityEndTime value for this CredentialInputType.
     * 
     * @return validityEndTime
     */
    public java.util.Calendar getValidityEndTime() {
        return validityEndTime;
    }


    /**
     * Sets the validityEndTime value for this CredentialInputType.
     * 
     * @param validityEndTime
     */
    public void setValidityEndTime(java.util.Calendar validityEndTime) {
        this.validityEndTime = validityEndTime;
    }


    /**
     * Gets the validityEndTimeEx value for this CredentialInputType.
     * 
     * @return validityEndTimeEx
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getValidityEndTimeEx() {
        return validityEndTimeEx;
    }


    /**
     * Sets the validityEndTimeEx value for this CredentialInputType.
     * 
     * @param validityEndTimeEx
     */
    public void setValidityEndTimeEx(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx) {
        this.validityEndTimeEx = validityEndTimeEx;
    }


    /**
     * Gets the disableStartTime value for this CredentialInputType.
     * 
     * @return disableStartTime
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getDisableStartTime() {
        return disableStartTime;
    }


    /**
     * Sets the disableStartTime value for this CredentialInputType.
     * 
     * @param disableStartTime
     */
    public void setDisableStartTime(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime) {
        this.disableStartTime = disableStartTime;
    }


    /**
     * Gets the disableEndTime value for this CredentialInputType.
     * 
     * @return disableEndTime
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType getDisableEndTime() {
        return disableEndTime;
    }


    /**
     * Sets the disableEndTime value for this CredentialInputType.
     * 
     * @param disableEndTime
     */
    public void setDisableEndTime(com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime) {
        this.disableEndTime = disableEndTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialInputType)) return false;
        CredentialInputType other = (CredentialInputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.validityEndTime==null && other.getValidityEndTime()==null) || 
             (this.validityEndTime!=null &&
              this.validityEndTime.equals(other.getValidityEndTime()))) &&
            ((this.validityEndTimeEx==null && other.getValidityEndTimeEx()==null) || 
             (this.validityEndTimeEx!=null &&
              this.validityEndTimeEx.equals(other.getValidityEndTimeEx()))) &&
            ((this.disableStartTime==null && other.getDisableStartTime()==null) || 
             (this.disableStartTime!=null &&
              this.disableStartTime.equals(other.getDisableStartTime()))) &&
            ((this.disableEndTime==null && other.getDisableEndTime()==null) || 
             (this.disableEndTime!=null &&
              this.disableEndTime.equals(other.getDisableEndTime())));
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
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getValidityEndTime() != null) {
            _hashCode += getValidityEndTime().hashCode();
        }
        if (getValidityEndTimeEx() != null) {
            _hashCode += getValidityEndTimeEx().hashCode();
        }
        if (getDisableStartTime() != null) {
            _hashCode += getDisableStartTime().hashCode();
        }
        if (getDisableEndTime() != null) {
            _hashCode += getDisableEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredentialInputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "CredentialInputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "validityEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityEndTimeEx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "validityEndTimeEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "disableStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "disableEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
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
