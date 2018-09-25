/**
 * PasswordStrengthParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * PasswordStrengthParameters is the structure used to
 * 				represent the password strength parameters.
 */
public class PasswordStrengthParameters  implements java.io.Serializable {
    /* Minimum length of the password. */
    private java.lang.Integer minLength;

    /* Maximum length of the password. */
    private java.lang.Integer maxLength;

    /* Minimum number of alphabets required in the
     * 						password. */
    private java.lang.Integer minAlphaChars;

    /* Minimum number of numbers required in the
     * 						password. */
    private java.lang.Integer minNumericChars;

    /* Minimum number of special characters required in
     * 						the password. */
    private java.lang.Integer minSpecialChars;

    public PasswordStrengthParameters() {
    }

    public PasswordStrengthParameters(
           java.lang.Integer minLength,
           java.lang.Integer maxLength,
           java.lang.Integer minAlphaChars,
           java.lang.Integer minNumericChars,
           java.lang.Integer minSpecialChars) {
           this.minLength = minLength;
           this.maxLength = maxLength;
           this.minAlphaChars = minAlphaChars;
           this.minNumericChars = minNumericChars;
           this.minSpecialChars = minSpecialChars;
    }


    /**
     * Gets the minLength value for this PasswordStrengthParameters.
     * 
     * @return minLength   * Minimum length of the password.
     */
    public java.lang.Integer getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this PasswordStrengthParameters.
     * 
     * @param minLength   * Minimum length of the password.
     */
    public void setMinLength(java.lang.Integer minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the maxLength value for this PasswordStrengthParameters.
     * 
     * @return maxLength   * Maximum length of the password.
     */
    public java.lang.Integer getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this PasswordStrengthParameters.
     * 
     * @param maxLength   * Maximum length of the password.
     */
    public void setMaxLength(java.lang.Integer maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minAlphaChars value for this PasswordStrengthParameters.
     * 
     * @return minAlphaChars   * Minimum number of alphabets required in the
     * 						password.
     */
    public java.lang.Integer getMinAlphaChars() {
        return minAlphaChars;
    }


    /**
     * Sets the minAlphaChars value for this PasswordStrengthParameters.
     * 
     * @param minAlphaChars   * Minimum number of alphabets required in the
     * 						password.
     */
    public void setMinAlphaChars(java.lang.Integer minAlphaChars) {
        this.minAlphaChars = minAlphaChars;
    }


    /**
     * Gets the minNumericChars value for this PasswordStrengthParameters.
     * 
     * @return minNumericChars   * Minimum number of numbers required in the
     * 						password.
     */
    public java.lang.Integer getMinNumericChars() {
        return minNumericChars;
    }


    /**
     * Sets the minNumericChars value for this PasswordStrengthParameters.
     * 
     * @param minNumericChars   * Minimum number of numbers required in the
     * 						password.
     */
    public void setMinNumericChars(java.lang.Integer minNumericChars) {
        this.minNumericChars = minNumericChars;
    }


    /**
     * Gets the minSpecialChars value for this PasswordStrengthParameters.
     * 
     * @return minSpecialChars   * Minimum number of special characters required in
     * 						the password.
     */
    public java.lang.Integer getMinSpecialChars() {
        return minSpecialChars;
    }


    /**
     * Sets the minSpecialChars value for this PasswordStrengthParameters.
     * 
     * @param minSpecialChars   * Minimum number of special characters required in
     * 						the password.
     */
    public void setMinSpecialChars(java.lang.Integer minSpecialChars) {
        this.minSpecialChars = minSpecialChars;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordStrengthParameters)) return false;
        PasswordStrengthParameters other = (PasswordStrengthParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minLength==null && other.getMinLength()==null) || 
             (this.minLength!=null &&
              this.minLength.equals(other.getMinLength()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.minAlphaChars==null && other.getMinAlphaChars()==null) || 
             (this.minAlphaChars!=null &&
              this.minAlphaChars.equals(other.getMinAlphaChars()))) &&
            ((this.minNumericChars==null && other.getMinNumericChars()==null) || 
             (this.minNumericChars!=null &&
              this.minNumericChars.equals(other.getMinNumericChars()))) &&
            ((this.minSpecialChars==null && other.getMinSpecialChars()==null) || 
             (this.minSpecialChars!=null &&
              this.minSpecialChars.equals(other.getMinSpecialChars())));
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
        if (getMinLength() != null) {
            _hashCode += getMinLength().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getMinAlphaChars() != null) {
            _hashCode += getMinAlphaChars().hashCode();
        }
        if (getMinNumericChars() != null) {
            _hashCode += getMinNumericChars().hashCode();
        }
        if (getMinSpecialChars() != null) {
            _hashCode += getMinSpecialChars().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordStrengthParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "PasswordStrengthParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAlphaChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minAlphaChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minNumericChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minNumericChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSpecialChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "minSpecialChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
