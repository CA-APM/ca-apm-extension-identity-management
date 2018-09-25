/**
 * RADIUSServerList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * Used as list for holding RADIUS servers.
 * 				list - list of values.
 */
public class RADIUSServerList  extends com.arcot.ws.WebFortCommonAPI._7_0.xsd.ListType  implements java.io.Serializable {
    /* List of RADIUS servers. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer[] list;

    public RADIUSServerList() {
    }

    public RADIUSServerList(
           java.lang.Integer operation,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer[] list) {
        super(
            operation);
        this.list = list;
    }


    /**
     * Gets the list value for this RADIUSServerList.
     * 
     * @return list   * List of RADIUS servers.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer[] getList() {
        return list;
    }


    /**
     * Sets the list value for this RADIUSServerList.
     * 
     * @param list   * List of RADIUS servers.
     */
    public void setList(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer[] list) {
        this.list = list;
    }

    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer getList(int i) {
        return this.list[i];
    }

    public void setList(int i, com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.RADIUSServer _value) {
        this.list[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RADIUSServerList)) return false;
        RADIUSServerList other = (RADIUSServerList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              java.util.Arrays.equals(this.list, other.getList())));
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
        if (getList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RADIUSServerList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServerList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "RADIUSServer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
