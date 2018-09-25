/**
 * EventDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * "EventDetails is the structure used to
 * 				represent event internal details."
 */
public class EventDetails  implements java.io.Serializable {
    /* Numeric representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is required (not eventName). */
    private int eventID;

    /* String representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is not required (eventID is enough). */
    private java.lang.String eventName;

    public EventDetails() {
    }

    public EventDetails(
           int eventID,
           java.lang.String eventName) {
           this.eventID = eventID;
           this.eventName = eventName;
    }


    /**
     * Gets the eventID value for this EventDetails.
     * 
     * @return eventID   * Numeric representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is required (not eventName).
     */
    public int getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this EventDetails.
     * 
     * @param eventID   * Numeric representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is required (not eventName).
     */
    public void setEventID(int eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the eventName value for this EventDetails.
     * 
     * @return eventName   * String representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is not required (eventID is enough).
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this EventDetails.
     * 
     * @param eventName   * String representation of the event. 
     * 						When specifing event to be
     * 						associated with plugin or callout
     * 						this is not required (eventID is enough).
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventDetails)) return false;
        EventDetails other = (EventDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventID == other.getEventID() &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName())));
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
        _hashCode += getEventID();
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eventName"));
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
