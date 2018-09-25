/**
 * ArcotIDKeyBagAddElementsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.msgs;

public class ArcotIDKeyBagAddElementsRequest  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagReqParams  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation[] elements;

    public ArcotIDKeyBagAddElementsRequest() {
    }

    public ArcotIDKeyBagAddElementsRequest(
           java.lang.String clientTxnId,
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.String profileName,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection elementSelection,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation[] elements) {
        super(
            clientTxnId,
            userName,
            orgName,
            profileName,
            elementSelection,
            additionalInput);
        this.elements = elements;
    }


    /**
     * Gets the elements value for this ArcotIDKeyBagAddElementsRequest.
     * 
     * @return elements
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation[] getElements() {
        return elements;
    }


    /**
     * Sets the elements value for this ArcotIDKeyBagAddElementsRequest.
     * 
     * @param elements
     */
    public void setElements(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagP12Representation[] elements) {
        this.elements = elements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagAddElementsRequest)) return false;
        ArcotIDKeyBagAddElementsRequest other = (ArcotIDKeyBagAddElementsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.elements==null && other.getElements()==null) || 
             (this.elements!=null &&
              java.util.Arrays.equals(this.elements, other.getElements())));
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
        if (getElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElements(), i);
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
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagAddElementsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", ">ArcotIDKeyBagAddElementsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/msgs", "elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagP12Representation"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "p12Representations"));
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
