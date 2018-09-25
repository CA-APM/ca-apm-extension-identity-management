/**
 * PermissionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PermissionType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PermissionType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _ReadOnly = new org.apache.axis.types.Token("ReadOnly");
    public static final org.apache.axis.types.Token _ReadWrite = new org.apache.axis.types.Token("ReadWrite");
    public static final org.apache.axis.types.Token _ReadWriteMandatory = new org.apache.axis.types.Token("ReadWriteMandatory");
    public static final org.apache.axis.types.Token _WriteMandatory = new org.apache.axis.types.Token("WriteMandatory");
    public static final org.apache.axis.types.Token _WriteOnce = new org.apache.axis.types.Token("WriteOnce");
    public static final PermissionType ReadOnly = new PermissionType(_ReadOnly);
    public static final PermissionType ReadWrite = new PermissionType(_ReadWrite);
    public static final PermissionType ReadWriteMandatory = new PermissionType(_ReadWriteMandatory);
    public static final PermissionType WriteMandatory = new PermissionType(_WriteMandatory);
    public static final PermissionType WriteOnce = new PermissionType(_WriteOnce);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PermissionType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PermissionType enumeration = (PermissionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PermissionType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(PermissionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", "PermissionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
