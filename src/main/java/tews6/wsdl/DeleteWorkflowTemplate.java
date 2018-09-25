/**
 * DeleteWorkflowTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class DeleteWorkflowTemplate  implements java.io.Serializable {
    private tews6.wsdl.DeleteWorkflowTemplateSearch deleteWorkflowTemplateSearch;

    private tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab;

    public DeleteWorkflowTemplate() {
    }

    public DeleteWorkflowTemplate(
           tews6.wsdl.DeleteWorkflowTemplateSearch deleteWorkflowTemplateSearch,
           tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab) {
           this.deleteWorkflowTemplateSearch = deleteWorkflowTemplateSearch;
           this.deleteWorkflowTemplateDeleteWorkflowTemplateTab = deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }


    /**
     * Gets the deleteWorkflowTemplateSearch value for this DeleteWorkflowTemplate.
     * 
     * @return deleteWorkflowTemplateSearch
     */
    public tews6.wsdl.DeleteWorkflowTemplateSearch getDeleteWorkflowTemplateSearch() {
        return deleteWorkflowTemplateSearch;
    }


    /**
     * Sets the deleteWorkflowTemplateSearch value for this DeleteWorkflowTemplate.
     * 
     * @param deleteWorkflowTemplateSearch
     */
    public void setDeleteWorkflowTemplateSearch(tews6.wsdl.DeleteWorkflowTemplateSearch deleteWorkflowTemplateSearch) {
        this.deleteWorkflowTemplateSearch = deleteWorkflowTemplateSearch;
    }


    /**
     * Gets the deleteWorkflowTemplateDeleteWorkflowTemplateTab value for this DeleteWorkflowTemplate.
     * 
     * @return deleteWorkflowTemplateDeleteWorkflowTemplateTab
     */
    public tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab getDeleteWorkflowTemplateDeleteWorkflowTemplateTab() {
        return deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }


    /**
     * Sets the deleteWorkflowTemplateDeleteWorkflowTemplateTab value for this DeleteWorkflowTemplate.
     * 
     * @param deleteWorkflowTemplateDeleteWorkflowTemplateTab
     */
    public void setDeleteWorkflowTemplateDeleteWorkflowTemplateTab(tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab deleteWorkflowTemplateDeleteWorkflowTemplateTab) {
        this.deleteWorkflowTemplateDeleteWorkflowTemplateTab = deleteWorkflowTemplateDeleteWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteWorkflowTemplate)) return false;
        DeleteWorkflowTemplate other = (DeleteWorkflowTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteWorkflowTemplateSearch==null && other.getDeleteWorkflowTemplateSearch()==null) || 
             (this.deleteWorkflowTemplateSearch!=null &&
              this.deleteWorkflowTemplateSearch.equals(other.getDeleteWorkflowTemplateSearch()))) &&
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
        if (getDeleteWorkflowTemplateSearch() != null) {
            _hashCode += getDeleteWorkflowTemplateSearch().hashCode();
        }
        if (getDeleteWorkflowTemplateDeleteWorkflowTemplateTab() != null) {
            _hashCode += getDeleteWorkflowTemplateDeleteWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteWorkflowTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteWorkflowTemplateSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateSearch"));
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
