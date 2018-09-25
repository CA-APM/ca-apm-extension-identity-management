/**
 * TaskContextAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TaskContextAction implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaskContextAction(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _approve = new org.apache.axis.types.NMToken("approve");
    public static final org.apache.axis.types.NMToken _reject = new org.apache.axis.types.NMToken("reject");
    public static final org.apache.axis.types.NMToken _reserve = new org.apache.axis.types.NMToken("reserve");
    public static final org.apache.axis.types.NMToken _release = new org.apache.axis.types.NMToken("release");
    public static final org.apache.axis.types.NMToken _reassign = new org.apache.axis.types.NMToken("reassign");
    public static final org.apache.axis.types.NMToken _submit_action = new org.apache.axis.types.NMToken("submit_action");
    public static final org.apache.axis.types.NMToken _multiactionapprovereject = new org.apache.axis.types.NMToken("multiactionapprovereject");
    public static final TaskContextAction approve = new TaskContextAction(_approve);
    public static final TaskContextAction reject = new TaskContextAction(_reject);
    public static final TaskContextAction reserve = new TaskContextAction(_reserve);
    public static final TaskContextAction release = new TaskContextAction(_release);
    public static final TaskContextAction reassign = new TaskContextAction(_reassign);
    public static final TaskContextAction submit_action = new TaskContextAction(_submit_action);
    public static final TaskContextAction multiactionapprovereject = new TaskContextAction(_multiactionapprovereject);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TaskContextAction fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TaskContextAction enumeration = (TaskContextAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaskContextAction fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
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
        new org.apache.axis.description.TypeDesc(TaskContextAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskContext>action"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
