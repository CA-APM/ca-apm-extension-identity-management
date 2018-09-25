/**
 * TaskContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TaskContext  implements java.io.Serializable {
    private java.lang.String admin_id;

    private java.lang.String admin_password;

    private java.lang.String transaction_id;

    private java.lang.String connection_id;

    private java.lang.String workitem_id;

    private java.lang.String delegator_id;

    private java.lang.String workitem_owner_id;

    private java.lang.String worklist_task_tag;

    private java.lang.String no_namespace_on_soapfaults_header;

    private tews6.wsdl.TaskContextAction action;

    private java.lang.String submit_action;

    public TaskContext() {
    }

    public TaskContext(
           java.lang.String admin_id,
           java.lang.String admin_password,
           java.lang.String transaction_id,
           java.lang.String connection_id,
           java.lang.String workitem_id,
           java.lang.String delegator_id,
           java.lang.String workitem_owner_id,
           java.lang.String worklist_task_tag,
           java.lang.String no_namespace_on_soapfaults_header,
           tews6.wsdl.TaskContextAction action,
           java.lang.String submit_action) {
           this.admin_id = admin_id;
           this.admin_password = admin_password;
           this.transaction_id = transaction_id;
           this.connection_id = connection_id;
           this.workitem_id = workitem_id;
           this.delegator_id = delegator_id;
           this.workitem_owner_id = workitem_owner_id;
           this.worklist_task_tag = worklist_task_tag;
           this.no_namespace_on_soapfaults_header = no_namespace_on_soapfaults_header;
           this.action = action;
           this.submit_action = submit_action;
    }


    /**
     * Gets the admin_id value for this TaskContext.
     * 
     * @return admin_id
     */
    public java.lang.String getAdmin_id() {
        return admin_id;
    }


    /**
     * Sets the admin_id value for this TaskContext.
     * 
     * @param admin_id
     */
    public void setAdmin_id(java.lang.String admin_id) {
        this.admin_id = admin_id;
    }


    /**
     * Gets the admin_password value for this TaskContext.
     * 
     * @return admin_password
     */
    public java.lang.String getAdmin_password() {
        return admin_password;
    }


    /**
     * Sets the admin_password value for this TaskContext.
     * 
     * @param admin_password
     */
    public void setAdmin_password(java.lang.String admin_password) {
        this.admin_password = admin_password;
    }


    /**
     * Gets the transaction_id value for this TaskContext.
     * 
     * @return transaction_id
     */
    public java.lang.String getTransaction_id() {
        return transaction_id;
    }


    /**
     * Sets the transaction_id value for this TaskContext.
     * 
     * @param transaction_id
     */
    public void setTransaction_id(java.lang.String transaction_id) {
        this.transaction_id = transaction_id;
    }


    /**
     * Gets the connection_id value for this TaskContext.
     * 
     * @return connection_id
     */
    public java.lang.String getConnection_id() {
        return connection_id;
    }


    /**
     * Sets the connection_id value for this TaskContext.
     * 
     * @param connection_id
     */
    public void setConnection_id(java.lang.String connection_id) {
        this.connection_id = connection_id;
    }


    /**
     * Gets the workitem_id value for this TaskContext.
     * 
     * @return workitem_id
     */
    public java.lang.String getWorkitem_id() {
        return workitem_id;
    }


    /**
     * Sets the workitem_id value for this TaskContext.
     * 
     * @param workitem_id
     */
    public void setWorkitem_id(java.lang.String workitem_id) {
        this.workitem_id = workitem_id;
    }


    /**
     * Gets the delegator_id value for this TaskContext.
     * 
     * @return delegator_id
     */
    public java.lang.String getDelegator_id() {
        return delegator_id;
    }


    /**
     * Sets the delegator_id value for this TaskContext.
     * 
     * @param delegator_id
     */
    public void setDelegator_id(java.lang.String delegator_id) {
        this.delegator_id = delegator_id;
    }


    /**
     * Gets the workitem_owner_id value for this TaskContext.
     * 
     * @return workitem_owner_id
     */
    public java.lang.String getWorkitem_owner_id() {
        return workitem_owner_id;
    }


    /**
     * Sets the workitem_owner_id value for this TaskContext.
     * 
     * @param workitem_owner_id
     */
    public void setWorkitem_owner_id(java.lang.String workitem_owner_id) {
        this.workitem_owner_id = workitem_owner_id;
    }


    /**
     * Gets the worklist_task_tag value for this TaskContext.
     * 
     * @return worklist_task_tag
     */
    public java.lang.String getWorklist_task_tag() {
        return worklist_task_tag;
    }


    /**
     * Sets the worklist_task_tag value for this TaskContext.
     * 
     * @param worklist_task_tag
     */
    public void setWorklist_task_tag(java.lang.String worklist_task_tag) {
        this.worklist_task_tag = worklist_task_tag;
    }


    /**
     * Gets the no_namespace_on_soapfaults_header value for this TaskContext.
     * 
     * @return no_namespace_on_soapfaults_header
     */
    public java.lang.String getNo_namespace_on_soapfaults_header() {
        return no_namespace_on_soapfaults_header;
    }


    /**
     * Sets the no_namespace_on_soapfaults_header value for this TaskContext.
     * 
     * @param no_namespace_on_soapfaults_header
     */
    public void setNo_namespace_on_soapfaults_header(java.lang.String no_namespace_on_soapfaults_header) {
        this.no_namespace_on_soapfaults_header = no_namespace_on_soapfaults_header;
    }


    /**
     * Gets the action value for this TaskContext.
     * 
     * @return action
     */
    public tews6.wsdl.TaskContextAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this TaskContext.
     * 
     * @param action
     */
    public void setAction(tews6.wsdl.TaskContextAction action) {
        this.action = action;
    }


    /**
     * Gets the submit_action value for this TaskContext.
     * 
     * @return submit_action
     */
    public java.lang.String getSubmit_action() {
        return submit_action;
    }


    /**
     * Sets the submit_action value for this TaskContext.
     * 
     * @param submit_action
     */
    public void setSubmit_action(java.lang.String submit_action) {
        this.submit_action = submit_action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskContext)) return false;
        TaskContext other = (TaskContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.admin_id==null && other.getAdmin_id()==null) || 
             (this.admin_id!=null &&
              this.admin_id.equals(other.getAdmin_id()))) &&
            ((this.admin_password==null && other.getAdmin_password()==null) || 
             (this.admin_password!=null &&
              this.admin_password.equals(other.getAdmin_password()))) &&
            ((this.transaction_id==null && other.getTransaction_id()==null) || 
             (this.transaction_id!=null &&
              this.transaction_id.equals(other.getTransaction_id()))) &&
            ((this.connection_id==null && other.getConnection_id()==null) || 
             (this.connection_id!=null &&
              this.connection_id.equals(other.getConnection_id()))) &&
            ((this.workitem_id==null && other.getWorkitem_id()==null) || 
             (this.workitem_id!=null &&
              this.workitem_id.equals(other.getWorkitem_id()))) &&
            ((this.delegator_id==null && other.getDelegator_id()==null) || 
             (this.delegator_id!=null &&
              this.delegator_id.equals(other.getDelegator_id()))) &&
            ((this.workitem_owner_id==null && other.getWorkitem_owner_id()==null) || 
             (this.workitem_owner_id!=null &&
              this.workitem_owner_id.equals(other.getWorkitem_owner_id()))) &&
            ((this.worklist_task_tag==null && other.getWorklist_task_tag()==null) || 
             (this.worklist_task_tag!=null &&
              this.worklist_task_tag.equals(other.getWorklist_task_tag()))) &&
            ((this.no_namespace_on_soapfaults_header==null && other.getNo_namespace_on_soapfaults_header()==null) || 
             (this.no_namespace_on_soapfaults_header!=null &&
              this.no_namespace_on_soapfaults_header.equals(other.getNo_namespace_on_soapfaults_header()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.submit_action==null && other.getSubmit_action()==null) || 
             (this.submit_action!=null &&
              this.submit_action.equals(other.getSubmit_action())));
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
        if (getAdmin_id() != null) {
            _hashCode += getAdmin_id().hashCode();
        }
        if (getAdmin_password() != null) {
            _hashCode += getAdmin_password().hashCode();
        }
        if (getTransaction_id() != null) {
            _hashCode += getTransaction_id().hashCode();
        }
        if (getConnection_id() != null) {
            _hashCode += getConnection_id().hashCode();
        }
        if (getWorkitem_id() != null) {
            _hashCode += getWorkitem_id().hashCode();
        }
        if (getDelegator_id() != null) {
            _hashCode += getDelegator_id().hashCode();
        }
        if (getWorkitem_owner_id() != null) {
            _hashCode += getWorkitem_owner_id().hashCode();
        }
        if (getWorklist_task_tag() != null) {
            _hashCode += getWorklist_task_tag().hashCode();
        }
        if (getNo_namespace_on_soapfaults_header() != null) {
            _hashCode += getNo_namespace_on_soapfaults_header().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getSubmit_action() != null) {
            _hashCode += getSubmit_action().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "admin_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "admin_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "transaction_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connection_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "connection_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitem_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "workitem_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegator_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "delegator_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitem_owner_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "workitem_owner_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worklist_task_tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "worklist_task_tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_namespace_on_soapfaults_header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "no_namespace_on_soapfaults_header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskContext>action"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submit_action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "submit_action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
