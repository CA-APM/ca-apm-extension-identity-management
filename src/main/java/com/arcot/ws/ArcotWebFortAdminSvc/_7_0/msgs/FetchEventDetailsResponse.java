/**
 * FetchEventDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.msgs;

public class FetchEventDetailsResponse  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseAdminRes  implements java.io.Serializable {
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList events;

    public FetchEventDetailsResponse() {
    }

    public FetchEventDetailsResponse(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.TransactionDetailsType transactionDetails,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList events) {
        super(
            transactionDetails);
        this.events = events;
    }


    /**
     * Gets the events value for this FetchEventDetailsResponse.
     * 
     * @return events
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList getEvents() {
        return events;
    }


    /**
     * Sets the events value for this FetchEventDetailsResponse.
     * 
     * @param events
     */
    public void setEvents(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchEventDetailsResponse)) return false;
        FetchEventDetailsResponse other = (FetchEventDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents())));
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
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchEventDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", ">FetchEventDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/msgs", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetailsList"));
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
