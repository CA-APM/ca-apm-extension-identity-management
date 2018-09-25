/**
 * ArcotIDKeyBagDeleteElementsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class ArcotIDKeyBagDeleteElementsRequest  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagReqParams  implements java.io.Serializable {
    private java.lang.String[] elementIds;

    public ArcotIDKeyBagDeleteElementsRequest() {
    }

    public ArcotIDKeyBagDeleteElementsRequest(
           java.lang.String clientTxnId,
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.String profileName,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection elementSelection,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           java.lang.String[] elementIds) {
        super(
            clientTxnId,
            userName,
            orgName,
            profileName,
            elementSelection,
            additionalInput);
        this.elementIds = elementIds;
    }


    /**
     * Gets the elementIds value for this ArcotIDKeyBagDeleteElementsRequest.
     * 
     * @return elementIds
     */
    public java.lang.String[] getElementIds() {
        return elementIds;
    }


    /**
     * Sets the elementIds value for this ArcotIDKeyBagDeleteElementsRequest.
     * 
     * @param elementIds
     */
    public void setElementIds(java.lang.String[] elementIds) {
        this.elementIds = elementIds;
    }

    public java.lang.String getElementIds(int i) {
        return this.elementIds[i];
    }

    public void setElementIds(int i, java.lang.String _value) {
        this.elementIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagDeleteElementsRequest)) return false;
        ArcotIDKeyBagDeleteElementsRequest other = (ArcotIDKeyBagDeleteElementsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.elementIds==null && other.getElementIds()==null) || 
             (this.elementIds!=null &&
              java.util.Arrays.equals(this.elementIds, other.getElementIds())));
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
        if (getElementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementIds(), i);
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
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagDeleteElementsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagDeleteElementsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "elementIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
