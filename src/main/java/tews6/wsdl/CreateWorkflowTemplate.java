/**
 * CreateWorkflowTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateWorkflowTemplate  implements java.io.Serializable {
    private tews6.wsdl.CreateWorkflowTemplateSearch createWorkflowTemplateSearch;

    private tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTab createWorkflowTemplateCreateWorkflowTemplateTab;

    public CreateWorkflowTemplate() {
    }

    public CreateWorkflowTemplate(
           tews6.wsdl.CreateWorkflowTemplateSearch createWorkflowTemplateSearch,
           tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTab createWorkflowTemplateCreateWorkflowTemplateTab) {
           this.createWorkflowTemplateSearch = createWorkflowTemplateSearch;
           this.createWorkflowTemplateCreateWorkflowTemplateTab = createWorkflowTemplateCreateWorkflowTemplateTab;
    }


    /**
     * Gets the createWorkflowTemplateSearch value for this CreateWorkflowTemplate.
     * 
     * @return createWorkflowTemplateSearch
     */
    public tews6.wsdl.CreateWorkflowTemplateSearch getCreateWorkflowTemplateSearch() {
        return createWorkflowTemplateSearch;
    }


    /**
     * Sets the createWorkflowTemplateSearch value for this CreateWorkflowTemplate.
     * 
     * @param createWorkflowTemplateSearch
     */
    public void setCreateWorkflowTemplateSearch(tews6.wsdl.CreateWorkflowTemplateSearch createWorkflowTemplateSearch) {
        this.createWorkflowTemplateSearch = createWorkflowTemplateSearch;
    }


    /**
     * Gets the createWorkflowTemplateCreateWorkflowTemplateTab value for this CreateWorkflowTemplate.
     * 
     * @return createWorkflowTemplateCreateWorkflowTemplateTab
     */
    public tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTab getCreateWorkflowTemplateCreateWorkflowTemplateTab() {
        return createWorkflowTemplateCreateWorkflowTemplateTab;
    }


    /**
     * Sets the createWorkflowTemplateCreateWorkflowTemplateTab value for this CreateWorkflowTemplate.
     * 
     * @param createWorkflowTemplateCreateWorkflowTemplateTab
     */
    public void setCreateWorkflowTemplateCreateWorkflowTemplateTab(tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTab createWorkflowTemplateCreateWorkflowTemplateTab) {
        this.createWorkflowTemplateCreateWorkflowTemplateTab = createWorkflowTemplateCreateWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateWorkflowTemplate)) return false;
        CreateWorkflowTemplate other = (CreateWorkflowTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createWorkflowTemplateSearch==null && other.getCreateWorkflowTemplateSearch()==null) || 
             (this.createWorkflowTemplateSearch!=null &&
              this.createWorkflowTemplateSearch.equals(other.getCreateWorkflowTemplateSearch()))) &&
            ((this.createWorkflowTemplateCreateWorkflowTemplateTab==null && other.getCreateWorkflowTemplateCreateWorkflowTemplateTab()==null) || 
             (this.createWorkflowTemplateCreateWorkflowTemplateTab!=null &&
              this.createWorkflowTemplateCreateWorkflowTemplateTab.equals(other.getCreateWorkflowTemplateCreateWorkflowTemplateTab())));
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
        if (getCreateWorkflowTemplateSearch() != null) {
            _hashCode += getCreateWorkflowTemplateSearch().hashCode();
        }
        if (getCreateWorkflowTemplateCreateWorkflowTemplateTab() != null) {
            _hashCode += getCreateWorkflowTemplateCreateWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateWorkflowTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createWorkflowTemplateSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateWorkflowTemplateSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createWorkflowTemplateCreateWorkflowTemplateTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateWorkflowTemplateCreateWorkflowTemplateTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateCreateWorkflowTemplateTab"));
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
