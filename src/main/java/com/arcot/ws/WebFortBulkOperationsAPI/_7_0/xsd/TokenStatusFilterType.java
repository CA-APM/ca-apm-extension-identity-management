/**
 * TokenStatusFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd;


/**
 * Filter used in fetching tokens.
 */
public class TokenStatusFilterType  implements java.io.Serializable {
    private java.lang.Boolean free;

    private java.lang.Boolean assigned;

    private java.lang.Boolean abandoned;

    private java.lang.Boolean failed;

    public TokenStatusFilterType() {
    }

    public TokenStatusFilterType(
           java.lang.Boolean free,
           java.lang.Boolean assigned,
           java.lang.Boolean abandoned,
           java.lang.Boolean failed) {
           this.free = free;
           this.assigned = assigned;
           this.abandoned = abandoned;
           this.failed = failed;
    }


    /**
     * Gets the free value for this TokenStatusFilterType.
     * 
     * @return free
     */
    public java.lang.Boolean getFree() {
        return free;
    }


    /**
     * Sets the free value for this TokenStatusFilterType.
     * 
     * @param free
     */
    public void setFree(java.lang.Boolean free) {
        this.free = free;
    }


    /**
     * Gets the assigned value for this TokenStatusFilterType.
     * 
     * @return assigned
     */
    public java.lang.Boolean getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this TokenStatusFilterType.
     * 
     * @param assigned
     */
    public void setAssigned(java.lang.Boolean assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the abandoned value for this TokenStatusFilterType.
     * 
     * @return abandoned
     */
    public java.lang.Boolean getAbandoned() {
        return abandoned;
    }


    /**
     * Sets the abandoned value for this TokenStatusFilterType.
     * 
     * @param abandoned
     */
    public void setAbandoned(java.lang.Boolean abandoned) {
        this.abandoned = abandoned;
    }


    /**
     * Gets the failed value for this TokenStatusFilterType.
     * 
     * @return failed
     */
    public java.lang.Boolean getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this TokenStatusFilterType.
     * 
     * @param failed
     */
    public void setFailed(java.lang.Boolean failed) {
        this.failed = failed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenStatusFilterType)) return false;
        TokenStatusFilterType other = (TokenStatusFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.free==null && other.getFree()==null) || 
             (this.free!=null &&
              this.free.equals(other.getFree()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.abandoned==null && other.getAbandoned()==null) || 
             (this.abandoned!=null &&
              this.abandoned.equals(other.getAbandoned()))) &&
            ((this.failed==null && other.getFailed()==null) || 
             (this.failed!=null &&
              this.failed.equals(other.getFailed())));
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
        if (getFree() != null) {
            _hashCode += getFree().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getAbandoned() != null) {
            _hashCode += getAbandoned().hashCode();
        }
        if (getFailed() != null) {
            _hashCode += getFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenStatusFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "TokenStatusFilterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("free");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "free"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abandoned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "abandoned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "failed"));
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
