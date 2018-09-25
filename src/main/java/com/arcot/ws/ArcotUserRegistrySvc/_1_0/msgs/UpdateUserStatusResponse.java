/**
 * UpdateUserStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistrySvc._1_0.msgs;

public class UpdateUserStatusResponse  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType _return;

    public UpdateUserStatusResponse() {
    }

    public UpdateUserStatusResponse(
           com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType _return) {
           this._return = _return;
    }


    /**
     * Gets the _return value for this UpdateUserStatusResponse.
     * 
     * @return _return
     */
    public com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this UpdateUserStatusResponse.
     * 
     * @param _return
     */
    public void set_return(com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserStatusResponse)) return false;
        UpdateUserStatusResponse other = (UpdateUserStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", ">updateUserStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistrySvc/1.0/msgs", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UdsRegistrySuccessType"));
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
