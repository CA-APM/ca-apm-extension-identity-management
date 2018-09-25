/**
 * ConnectionCredentialTypeSsl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;

public class ConnectionCredentialTypeSsl implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConnectionCredentialTypeSsl(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "NONE";
    public static final java.lang.String _value2 = "1WAY";
    public static final java.lang.String _value3 = "2WAY";
    public static final ConnectionCredentialTypeSsl value1 = new ConnectionCredentialTypeSsl(_value1);
    public static final ConnectionCredentialTypeSsl value2 = new ConnectionCredentialTypeSsl(_value2);
    public static final ConnectionCredentialTypeSsl value3 = new ConnectionCredentialTypeSsl(_value3);
    public java.lang.String getValue() { return _value_;}
    public static ConnectionCredentialTypeSsl fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConnectionCredentialTypeSsl enumeration = (ConnectionCredentialTypeSsl)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConnectionCredentialTypeSsl fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectionCredentialTypeSsl.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">ConnectionCredentialType>ssl"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
