/**
 * ExtModuleEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * "Events structure represents 
 * 				different types of events that
 * 				can come as a result of fetching
 * 				the plugin/callout configuration."
 */
public class ExtModuleEvents  implements java.io.Serializable {
    /* Events supported by plugin/callout. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsSupported;

    /* For the given organization the remaining 
     * 						events that this plugin/callout can avail. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAvailable;

    /* The events those to be associated or already
     * 						associated for the given org with the
     * 						plugin/callout. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAssociated;

    public ExtModuleEvents() {
    }

    public ExtModuleEvents(
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsSupported,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAvailable,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAssociated) {
           this.eventsSupported = eventsSupported;
           this.eventsAvailable = eventsAvailable;
           this.eventsAssociated = eventsAssociated;
    }


    /**
     * Gets the eventsSupported value for this ExtModuleEvents.
     * 
     * @return eventsSupported   * Events supported by plugin/callout.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList getEventsSupported() {
        return eventsSupported;
    }


    /**
     * Sets the eventsSupported value for this ExtModuleEvents.
     * 
     * @param eventsSupported   * Events supported by plugin/callout.
     */
    public void setEventsSupported(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsSupported) {
        this.eventsSupported = eventsSupported;
    }


    /**
     * Gets the eventsAvailable value for this ExtModuleEvents.
     * 
     * @return eventsAvailable   * For the given organization the remaining 
     * 						events that this plugin/callout can avail.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList getEventsAvailable() {
        return eventsAvailable;
    }


    /**
     * Sets the eventsAvailable value for this ExtModuleEvents.
     * 
     * @param eventsAvailable   * For the given organization the remaining 
     * 						events that this plugin/callout can avail.
     */
    public void setEventsAvailable(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAvailable) {
        this.eventsAvailable = eventsAvailable;
    }


    /**
     * Gets the eventsAssociated value for this ExtModuleEvents.
     * 
     * @return eventsAssociated   * The events those to be associated or already
     * 						associated for the given org with the
     * 						plugin/callout.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList getEventsAssociated() {
        return eventsAssociated;
    }


    /**
     * Sets the eventsAssociated value for this ExtModuleEvents.
     * 
     * @param eventsAssociated   * The events those to be associated or already
     * 						associated for the given org with the
     * 						plugin/callout.
     */
    public void setEventsAssociated(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EventDetailsList eventsAssociated) {
        this.eventsAssociated = eventsAssociated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtModuleEvents)) return false;
        ExtModuleEvents other = (ExtModuleEvents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventsSupported==null && other.getEventsSupported()==null) || 
             (this.eventsSupported!=null &&
              this.eventsSupported.equals(other.getEventsSupported()))) &&
            ((this.eventsAvailable==null && other.getEventsAvailable()==null) || 
             (this.eventsAvailable!=null &&
              this.eventsAvailable.equals(other.getEventsAvailable()))) &&
            ((this.eventsAssociated==null && other.getEventsAssociated()==null) || 
             (this.eventsAssociated!=null &&
              this.eventsAssociated.equals(other.getEventsAssociated())));
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
        if (getEventsSupported() != null) {
            _hashCode += getEventsSupported().hashCode();
        }
        if (getEventsAvailable() != null) {
            _hashCode += getEventsAvailable().hashCode();
        }
        if (getEventsAssociated() != null) {
            _hashCode += getEventsAssociated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtModuleEvents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ExtModuleEvents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eventsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eventsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EventDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventsAssociated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eventsAssociated"));
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
