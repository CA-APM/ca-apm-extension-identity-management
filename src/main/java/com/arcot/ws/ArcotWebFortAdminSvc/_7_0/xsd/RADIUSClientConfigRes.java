/**
 * RADIUSClientConfigRes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * RADIUSClientConfig is the structure used to
 * 				represent Radius client configuration.
 */
public class RADIUSClientConfigRes  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* RADIUS clients information. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClient radiusClient;

    /* Details of EAP authentication type. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeDetails eapAuthTypeData;

    public RADIUSClientConfigRes() {
    }

    public RADIUSClientConfigRes(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClient radiusClient,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeDetails eapAuthTypeData) {
        super(
            name,
            status);
        this.radiusClient = radiusClient;
        this.eapAuthTypeData = eapAuthTypeData;
    }


    /**
     * Gets the radiusClient value for this RADIUSClientConfigRes.
     * 
     * @return radiusClient   * RADIUS clients information.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClient getRadiusClient() {
        return radiusClient;
    }


    /**
     * Sets the radiusClient value for this RADIUSClientConfigRes.
     * 
     * @param radiusClient   * RADIUS clients information.
     */
    public void setRadiusClient(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSClient radiusClient) {
        this.radiusClient = radiusClient;
    }


    /**
     * Gets the eapAuthTypeData value for this RADIUSClientConfigRes.
     * 
     * @return eapAuthTypeData   * Details of EAP authentication type.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeDetails getEapAuthTypeData() {
        return eapAuthTypeData;
    }


    /**
     * Sets the eapAuthTypeData value for this RADIUSClientConfigRes.
     * 
     * @param eapAuthTypeData   * Details of EAP authentication type.
     */
    public void setEapAuthTypeData(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.EAPAuthTypeDetails eapAuthTypeData) {
        this.eapAuthTypeData = eapAuthTypeData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSClientConfigRes)) return false;
        RADIUSClientConfigRes other = (RADIUSClientConfigRes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.radiusClient==null && other.getRadiusClient()==null) || 
             (this.radiusClient!=null &&
              this.radiusClient.equals(other.getRadiusClient()))) &&
            ((this.eapAuthTypeData==null && other.getEapAuthTypeData()==null) || 
             (this.eapAuthTypeData!=null &&
              this.eapAuthTypeData.equals(other.getEapAuthTypeData())));
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
        if (getRadiusClient() != null) {
            _hashCode += getRadiusClient().hashCode();
        }
        if (getEapAuthTypeData() != null) {
            _hashCode += getEapAuthTypeData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSClientConfigRes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClientConfigRes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusClient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "radiusClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSClient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eapAuthTypeData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "eapAuthTypeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "EAPAuthTypeDetails"));
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
