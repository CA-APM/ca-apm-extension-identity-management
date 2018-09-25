/**
 * OperatorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OperatorType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperatorType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _EQUALS = new org.apache.axis.types.Token("EQUALS");
    public static final org.apache.axis.types.Token _NOT_EQUALS = new org.apache.axis.types.Token("NOT_EQUALS");
    public static final org.apache.axis.types.Token _CONTAINS = new org.apache.axis.types.Token("CONTAINS");
    public static final org.apache.axis.types.Token _STARTS_WITH = new org.apache.axis.types.Token("STARTS_WITH");
    public static final org.apache.axis.types.Token _ENDS_WITH = new org.apache.axis.types.Token("ENDS_WITH");
    public static final org.apache.axis.types.Token _GREATER_THAN = new org.apache.axis.types.Token("GREATER_THAN");
    public static final org.apache.axis.types.Token _LESS_THAN = new org.apache.axis.types.Token("LESS_THAN");
    public static final org.apache.axis.types.Token _GREATER_THAN_EQUALS = new org.apache.axis.types.Token("GREATER_THAN_EQUALS");
    public static final org.apache.axis.types.Token _LESS_THAN_EQUALS = new org.apache.axis.types.Token("LESS_THAN_EQUALS");
    public static final OperatorType EQUALS = new OperatorType(_EQUALS);
    public static final OperatorType NOT_EQUALS = new OperatorType(_NOT_EQUALS);
    public static final OperatorType CONTAINS = new OperatorType(_CONTAINS);
    public static final OperatorType STARTS_WITH = new OperatorType(_STARTS_WITH);
    public static final OperatorType ENDS_WITH = new OperatorType(_ENDS_WITH);
    public static final OperatorType GREATER_THAN = new OperatorType(_GREATER_THAN);
    public static final OperatorType LESS_THAN = new OperatorType(_LESS_THAN);
    public static final OperatorType GREATER_THAN_EQUALS = new OperatorType(_GREATER_THAN_EQUALS);
    public static final OperatorType LESS_THAN_EQUALS = new OperatorType(_LESS_THAN_EQUALS);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static OperatorType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        OperatorType enumeration = (OperatorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperatorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperatorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", "OperatorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
