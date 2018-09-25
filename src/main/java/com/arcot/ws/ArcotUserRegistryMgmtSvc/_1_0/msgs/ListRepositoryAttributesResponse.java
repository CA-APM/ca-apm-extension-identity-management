/**
 * ListRepositoryAttributesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class ListRepositoryAttributesResponse  implements java.io.Serializable {
    private java.lang.String[] attributeList;

    public ListRepositoryAttributesResponse() {
    }

    public ListRepositoryAttributesResponse(
           java.lang.String[] attributeList) {
           this.attributeList = attributeList;
    }


    /**
     * Gets the attributeList value for this ListRepositoryAttributesResponse.
     * 
     * @return attributeList
     */
    public java.lang.String[] getAttributeList() {
        return attributeList;
    }


    /**
     * Sets the attributeList value for this ListRepositoryAttributesResponse.
     * 
     * @param attributeList
     */
    public void setAttributeList(java.lang.String[] attributeList) {
        this.attributeList = attributeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListRepositoryAttributesResponse)) return false;
        ListRepositoryAttributesResponse other = (ListRepositoryAttributesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeList==null && other.getAttributeList()==null) || 
             (this.attributeList!=null &&
              java.util.Arrays.equals(this.attributeList, other.getAttributeList())));
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
        if (getAttributeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeList(), i);
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
        new org.apache.axis.description.TypeDesc(ListRepositoryAttributesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">listRepositoryAttributesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeName"));
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
