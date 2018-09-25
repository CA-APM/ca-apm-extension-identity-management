/**
 * ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String stakeHolder;

    public ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry() {
    }

    public ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry(
           java.lang.String message,
           java.lang.String stakeHolder) {
           this.message = message;
           this.stakeHolder = stakeHolder;
    }


    /**
     * Gets the message value for this ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the stakeHolder value for this ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.
     * 
     * @return stakeHolder
     */
    public java.lang.String getStakeHolder() {
        return stakeHolder;
    }


    /**
     * Sets the stakeHolder value for this ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.
     * 
     * @param stakeHolder
     */
    public void setStakeHolder(java.lang.String stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry)) return false;
        ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry other = (ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.stakeHolder==null && other.getStakeHolder()==null) || 
             (this.stakeHolder!=null &&
              this.stakeHolder.equals(other.getStakeHolder())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getStakeHolder() != null) {
            _hashCode += getStakeHolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateModifyWorkflowTemplateTab>HistoryEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "StakeHolder"));
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
