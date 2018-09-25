/**
 * TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TaskStatusQueryResultResultItemImsTaskDetailsEventDetails  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String id;

    private java.lang.String description;

    private java.lang.String state;

    private java.lang.String submittedTime;

    private java.lang.String completedTime;

    public TaskStatusQueryResultResultItemImsTaskDetailsEventDetails() {
    }

    public TaskStatusQueryResultResultItemImsTaskDetailsEventDetails(
           java.lang.String name,
           java.lang.String id,
           java.lang.String description,
           java.lang.String state,
           java.lang.String submittedTime,
           java.lang.String completedTime) {
           this.name = name;
           this.id = id;
           this.description = description;
           this.state = state;
           this.submittedTime = submittedTime;
           this.completedTime = completedTime;
    }


    /**
     * Gets the name value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the id value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the description value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the submittedTime value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return submittedTime
     */
    public java.lang.String getSubmittedTime() {
        return submittedTime;
    }


    /**
     * Sets the submittedTime value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param submittedTime
     */
    public void setSubmittedTime(java.lang.String submittedTime) {
        this.submittedTime = submittedTime;
    }


    /**
     * Gets the completedTime value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @return completedTime
     */
    public java.lang.String getCompletedTime() {
        return completedTime;
    }


    /**
     * Sets the completedTime value for this TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.
     * 
     * @param completedTime
     */
    public void setCompletedTime(java.lang.String completedTime) {
        this.completedTime = completedTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskStatusQueryResultResultItemImsTaskDetailsEventDetails)) return false;
        TaskStatusQueryResultResultItemImsTaskDetailsEventDetails other = (TaskStatusQueryResultResultItemImsTaskDetailsEventDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.submittedTime==null && other.getSubmittedTime()==null) || 
             (this.submittedTime!=null &&
              this.submittedTime.equals(other.getSubmittedTime()))) &&
            ((this.completedTime==null && other.getCompletedTime()==null) || 
             (this.completedTime!=null &&
              this.completedTime.equals(other.getCompletedTime())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubmittedTime() != null) {
            _hashCode += getSubmittedTime().hashCode();
        }
        if (getCompletedTime() != null) {
            _hashCode += getCompletedTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>TaskStatusQueryResult>ResultItem>ImsTaskDetails>EventDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "SubmittedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CompletedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
