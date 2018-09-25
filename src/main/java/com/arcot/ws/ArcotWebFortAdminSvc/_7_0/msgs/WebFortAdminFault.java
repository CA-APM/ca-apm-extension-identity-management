/**
 * WebFortAdminFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class WebFortAdminFault  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType  implements java.io.Serializable {
    /* Admin configuration error details. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.WebFortAdminErrorDetails adminErrorDetails;

    public WebFortAdminFault() {
    }

    public WebFortAdminFault(
           java.lang.String message,
           int reasonCode,
           int responseCode,
           java.lang.String transactionID,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalOutput,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.WebFortAdminErrorDetails adminErrorDetails) {
        super(
            message,
            reasonCode,
            responseCode,
            transactionID,
            additionalOutput);
        this.adminErrorDetails = adminErrorDetails;
    }


    /**
     * Gets the adminErrorDetails value for this WebFortAdminFault.
     * 
     * @return adminErrorDetails   * Admin configuration error details.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.WebFortAdminErrorDetails getAdminErrorDetails() {
        return adminErrorDetails;
    }


    /**
     * Sets the adminErrorDetails value for this WebFortAdminFault.
     * 
     * @param adminErrorDetails   * Admin configuration error details.
     */
    public void setAdminErrorDetails(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.WebFortAdminErrorDetails adminErrorDetails) {
        this.adminErrorDetails = adminErrorDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebFortAdminFault)) return false;
        WebFortAdminFault other = (WebFortAdminFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adminErrorDetails==null && other.getAdminErrorDetails()==null) || 
             (this.adminErrorDetails!=null &&
              this.adminErrorDetails.equals(other.getAdminErrorDetails())));
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
        if (getAdminErrorDetails() != null) {
            _hashCode += getAdminErrorDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebFortAdminFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">WebFortAdminFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminErrorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "adminErrorDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "WebFortAdminErrorDetails"));
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
