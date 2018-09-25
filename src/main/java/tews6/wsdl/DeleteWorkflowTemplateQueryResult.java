/**
 * DeleteWorkflowTemplateQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class DeleteWorkflowTemplateQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab;

    public DeleteWorkflowTemplateQueryResult() {
    }

    public DeleteWorkflowTemplateQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab) {
           this.imsStatus = imsStatus;
           this.deleteWorkflowTemplateDeleteWorkflowTemplateTab = deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }


    /**
     * Gets the imsStatus value for this DeleteWorkflowTemplateQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this DeleteWorkflowTemplateQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the deleteWorkflowTemplateDeleteWorkflowTemplateTab value for this DeleteWorkflowTemplateQueryResult.
     * 
     * @return deleteWorkflowTemplateDeleteWorkflowTemplateTab
     */
    public tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab getDeleteWorkflowTemplateDeleteWorkflowTemplateTab() {
        return deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }


    /**
     * Sets the deleteWorkflowTemplateDeleteWorkflowTemplateTab value for this DeleteWorkflowTemplateQueryResult.
     * 
     * @param deleteWorkflowTemplateDeleteWorkflowTemplateTab
     */
    public void setDeleteWorkflowTemplateDeleteWorkflowTemplateTab(tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab) {
        this.deleteWorkflowTemplateDeleteWorkflowTemplateTab = deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteWorkflowTemplateQueryResult)) return false;
        DeleteWorkflowTemplateQueryResult other = (DeleteWorkflowTemplateQueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imsStatus==null && other.getImsStatus()==null) || 
             (this.imsStatus!=null &&
              this.imsStatus.equals(other.getImsStatus()))) &&
            ((this.deleteWorkflowTemplateDeleteWorkflowTemplateTab==null && other.getDeleteWorkflowTemplateDeleteWorkflowTemplateTab()==null) || 
             (this.deleteWorkflowTemplateDeleteWorkflowTemplateTab!=null &&
              this.deleteWorkflowTemplateDeleteWorkflowTemplateTab.equals(other.getDeleteWorkflowTemplateDeleteWorkflowTemplateTab())));
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
        if (getImsStatus() != null) {
            _hashCode += getImsStatus().hashCode();
        }
        if (getDeleteWorkflowTemplateDeleteWorkflowTemplateTab() != null) {
            _hashCode += getDeleteWorkflowTemplateDeleteWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteWorkflowTemplateQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteWorkflowTemplateDeleteWorkflowTemplateTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateDeleteWorkflowTemplateTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateDeleteWorkflowTemplateTab"));
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
