/**
 * TaskStatusSearchFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TaskStatusSearchFilter  implements java.io.Serializable {
    private java.lang.String taskId;

    private java.lang.String taskNumber;

    private java.math.BigInteger index;  // attribute

    public TaskStatusSearchFilter() {
    }

    public TaskStatusSearchFilter(
           java.lang.String taskId,
           java.lang.String taskNumber,
           java.math.BigInteger index) {
           this.taskId = taskId;
           this.taskNumber = taskNumber;
           this.index = index;
    }


    /**
     * Gets the taskId value for this TaskStatusSearchFilter.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this TaskStatusSearchFilter.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskNumber value for this TaskStatusSearchFilter.
     * 
     * @return taskNumber
     */
    public java.lang.String getTaskNumber() {
        return taskNumber;
    }


    /**
     * Sets the taskNumber value for this TaskStatusSearchFilter.
     * 
     * @param taskNumber
     */
    public void setTaskNumber(java.lang.String taskNumber) {
        this.taskNumber = taskNumber;
    }


    /**
     * Gets the index value for this TaskStatusSearchFilter.
     * 
     * @return index
     */
    public java.math.BigInteger getIndex() {
        return index;
    }


    /**
     * Sets the index value for this TaskStatusSearchFilter.
     * 
     * @param index
     */
    public void setIndex(java.math.BigInteger index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskStatusSearchFilter)) return false;
        TaskStatusSearchFilter other = (TaskStatusSearchFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskNumber==null && other.getTaskNumber()==null) || 
             (this.taskNumber!=null &&
              this.taskNumber.equals(other.getTaskNumber()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskNumber() != null) {
            _hashCode += getTaskNumber().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskStatusSearchFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskStatusSearch>Filter"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
