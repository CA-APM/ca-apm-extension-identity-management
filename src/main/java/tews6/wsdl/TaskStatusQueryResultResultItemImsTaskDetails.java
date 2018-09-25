/**
 * TaskStatusQueryResultResultItemImsTaskDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TaskStatusQueryResultResultItemImsTaskDetails  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String id;

    private java.lang.String description;

    private java.lang.String state;

    private java.lang.String submittedBy;

    private java.lang.String submittedTime;

    private java.lang.String completedTime;

    private java.lang.String taskNumber;

    private tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails[] eventDetails;

    public TaskStatusQueryResultResultItemImsTaskDetails() {
    }

    public TaskStatusQueryResultResultItemImsTaskDetails(
           java.lang.String name,
           java.lang.String id,
           java.lang.String description,
           java.lang.String state,
           java.lang.String submittedBy,
           java.lang.String submittedTime,
           java.lang.String completedTime,
           java.lang.String taskNumber,
           tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails[] eventDetails) {
           this.name = name;
           this.id = id;
           this.description = description;
           this.state = state;
           this.submittedBy = submittedBy;
           this.submittedTime = submittedTime;
           this.completedTime = completedTime;
           this.taskNumber = taskNumber;
           this.eventDetails = eventDetails;
    }


    /**
     * Gets the name value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the id value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the description value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the submittedBy value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return submittedBy
     */
    public java.lang.String getSubmittedBy() {
        return submittedBy;
    }


    /**
     * Sets the submittedBy value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param submittedBy
     */
    public void setSubmittedBy(java.lang.String submittedBy) {
        this.submittedBy = submittedBy;
    }


    /**
     * Gets the submittedTime value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return submittedTime
     */
    public java.lang.String getSubmittedTime() {
        return submittedTime;
    }


    /**
     * Sets the submittedTime value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param submittedTime
     */
    public void setSubmittedTime(java.lang.String submittedTime) {
        this.submittedTime = submittedTime;
    }


    /**
     * Gets the completedTime value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return completedTime
     */
    public java.lang.String getCompletedTime() {
        return completedTime;
    }


    /**
     * Sets the completedTime value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param completedTime
     */
    public void setCompletedTime(java.lang.String completedTime) {
        this.completedTime = completedTime;
    }


    /**
     * Gets the taskNumber value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return taskNumber
     */
    public java.lang.String getTaskNumber() {
        return taskNumber;
    }


    /**
     * Sets the taskNumber value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param taskNumber
     */
    public void setTaskNumber(java.lang.String taskNumber) {
        this.taskNumber = taskNumber;
    }


    /**
     * Gets the eventDetails value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @return eventDetails
     */
    public tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails[] getEventDetails() {
        return eventDetails;
    }


    /**
     * Sets the eventDetails value for this TaskStatusQueryResultResultItemImsTaskDetails.
     * 
     * @param eventDetails
     */
    public void setEventDetails(tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails[] eventDetails) {
        this.eventDetails = eventDetails;
    }

    public tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails getEventDetails(int i) {
        return this.eventDetails[i];
    }

    public void setEventDetails(int i, tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails _value) {
        this.eventDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskStatusQueryResultResultItemImsTaskDetails)) return false;
        TaskStatusQueryResultResultItemImsTaskDetails other = (TaskStatusQueryResultResultItemImsTaskDetails) obj;
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
            ((this.submittedBy==null && other.getSubmittedBy()==null) || 
             (this.submittedBy!=null &&
              this.submittedBy.equals(other.getSubmittedBy()))) &&
            ((this.submittedTime==null && other.getSubmittedTime()==null) || 
             (this.submittedTime!=null &&
              this.submittedTime.equals(other.getSubmittedTime()))) &&
            ((this.completedTime==null && other.getCompletedTime()==null) || 
             (this.completedTime!=null &&
              this.completedTime.equals(other.getCompletedTime()))) &&
            ((this.taskNumber==null && other.getTaskNumber()==null) || 
             (this.taskNumber!=null &&
              this.taskNumber.equals(other.getTaskNumber()))) &&
            ((this.eventDetails==null && other.getEventDetails()==null) || 
             (this.eventDetails!=null &&
              java.util.Arrays.equals(this.eventDetails, other.getEventDetails())));
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
        if (getSubmittedBy() != null) {
            _hashCode += getSubmittedBy().hashCode();
        }
        if (getSubmittedTime() != null) {
            _hashCode += getSubmittedTime().hashCode();
        }
        if (getCompletedTime() != null) {
            _hashCode += getCompletedTime().hashCode();
        }
        if (getTaskNumber() != null) {
            _hashCode += getTaskNumber().hashCode();
        }
        if (getEventDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TaskStatusQueryResultResultItemImsTaskDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TaskStatusQueryResult>ResultItem>ImsTaskDetails"));
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
        elemField.setFieldName("submittedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "SubmittedBy"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "EventDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>TaskStatusQueryResult>ResultItem>ImsTaskDetails>EventDetails"));
        elemField.setMinOccurs(0);
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
