/**
 * AssignDefaultRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class AssignDefaultRequest  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminReq  implements java.io.Serializable {
    /* Configuration names, that are going to be assigned as a default
     * for a particular organization. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.AssignDefault assignDefault;

    public AssignDefaultRequest() {
    }

    public AssignDefaultRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.AssignDefault assignDefault) {
        super(
            clientTxnId,
            additionalInput);
        this.assignDefault = assignDefault;
    }


    /**
     * Gets the assignDefault value for this AssignDefaultRequest.
     * 
     * @return assignDefault   * Configuration names, that are going to be assigned as a default
     * for a particular organization.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.AssignDefault getAssignDefault() {
        return assignDefault;
    }


    /**
     * Sets the assignDefault value for this AssignDefaultRequest.
     * 
     * @param assignDefault   * Configuration names, that are going to be assigned as a default
     * for a particular organization.
     */
    public void setAssignDefault(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.AssignDefault assignDefault) {
        this.assignDefault = assignDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignDefaultRequest)) return false;
        AssignDefaultRequest other = (AssignDefaultRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignDefault==null && other.getAssignDefault()==null) || 
             (this.assignDefault!=null &&
              this.assignDefault.equals(other.getAssignDefault())));
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
        if (getAssignDefault() != null) {
            _hashCode += getAssignDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignDefaultRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">AssignDefaultRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "assignDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "AssignDefault"));
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
