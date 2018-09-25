/**
 * ListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * Used as basic container for lists.
 */
public class ListType  implements java.io.Serializable {
    /* This is used when an update operation is performed.
     * 						This will specify what to be done on an existing list.
     * 						The default value is REPLACE.
     * 						Supported operations are
     * 						0 - REPLACE (Replaces the existing list with the given list)
     * 						1 - CLEAR (Clears the existing list, any value specified 
     * 						           in the input list will be ignored)
     * 						Any value other than the above will be discarded and default
     * 						value (REPLACE) will be considered. */
    private java.lang.Integer operation;

    public ListType() {
    }

    public ListType(
           java.lang.Integer operation) {
           this.operation = operation;
    }


    /**
     * Gets the operation value for this ListType.
     * 
     * @return operation   * This is used when an update operation is performed.
     * 						This will specify what to be done on an existing list.
     * 						The default value is REPLACE.
     * 						Supported operations are
     * 						0 - REPLACE (Replaces the existing list with the given list)
     * 						1 - CLEAR (Clears the existing list, any value specified 
     * 						           in the input list will be ignored)
     * 						Any value other than the above will be discarded and default
     * 						value (REPLACE) will be considered.
     */
    public java.lang.Integer getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ListType.
     * 
     * @param operation   * This is used when an update operation is performed.
     * 						This will specify what to be done on an existing list.
     * 						The default value is REPLACE.
     * 						Supported operations are
     * 						0 - REPLACE (Replaces the existing list with the given list)
     * 						1 - CLEAR (Clears the existing list, any value specified 
     * 						           in the input list will be ignored)
     * 						Any value other than the above will be discarded and default
     * 						value (REPLACE) will be considered.
     */
    public void setOperation(java.lang.Integer operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListType)) return false;
        ListType other = (ListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
