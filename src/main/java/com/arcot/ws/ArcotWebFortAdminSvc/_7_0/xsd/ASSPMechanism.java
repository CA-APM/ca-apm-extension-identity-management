/**
 * ASSPMechanism.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * ASSPMechanism is the structure used to represent
 * 				mechanism information that are used in ASSP.
 */
public class ASSPMechanism  implements java.io.Serializable {
    /* Mechanism used by ASSP. */
    private int mechanism;

    /* The mechanism with status 1 indicates that
     * 						ASSP will use the mechanism. */
    private int status;

    public ASSPMechanism() {
    }

    public ASSPMechanism(
           int mechanism,
           int status) {
           this.mechanism = mechanism;
           this.status = status;
    }


    /**
     * Gets the mechanism value for this ASSPMechanism.
     * 
     * @return mechanism   * Mechanism used by ASSP.
     */
    public int getMechanism() {
        return mechanism;
    }


    /**
     * Sets the mechanism value for this ASSPMechanism.
     * 
     * @param mechanism   * Mechanism used by ASSP.
     */
    public void setMechanism(int mechanism) {
        this.mechanism = mechanism;
    }


    /**
     * Gets the status value for this ASSPMechanism.
     * 
     * @return status   * The mechanism with status 1 indicates that
     * 						ASSP will use the mechanism.
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ASSPMechanism.
     * 
     * @param status   * The mechanism with status 1 indicates that
     * 						ASSP will use the mechanism.
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASSPMechanism)) return false;
        ASSPMechanism other = (ASSPMechanism) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mechanism == other.getMechanism() &&
            this.status == other.getStatus();
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
        _hashCode += getMechanism();
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASSPMechanism.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ASSPMechanism"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mechanism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "mechanism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
