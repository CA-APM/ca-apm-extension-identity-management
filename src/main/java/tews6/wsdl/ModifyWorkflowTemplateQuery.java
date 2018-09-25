/**
 * ModifyWorkflowTemplateQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ModifyWorkflowTemplateQuery  implements java.io.Serializable {
    private tews6.wsdl.ModifyWorkflowTemplateSearch modifyWorkflowTemplateSearch;

    private tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTab modifyWorkflowTemplateModifyWorkflowTemplateTab;

    public ModifyWorkflowTemplateQuery() {
    }

    public ModifyWorkflowTemplateQuery(
           tews6.wsdl.ModifyWorkflowTemplateSearch modifyWorkflowTemplateSearch,
           tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTab modifyWorkflowTemplateModifyWorkflowTemplateTab) {
           this.modifyWorkflowTemplateSearch = modifyWorkflowTemplateSearch;
           this.modifyWorkflowTemplateModifyWorkflowTemplateTab = modifyWorkflowTemplateModifyWorkflowTemplateTab;
    }


    /**
     * Gets the modifyWorkflowTemplateSearch value for this ModifyWorkflowTemplateQuery.
     * 
     * @return modifyWorkflowTemplateSearch
     */
    public tews6.wsdl.ModifyWorkflowTemplateSearch getModifyWorkflowTemplateSearch() {
        return modifyWorkflowTemplateSearch;
    }


    /**
     * Sets the modifyWorkflowTemplateSearch value for this ModifyWorkflowTemplateQuery.
     * 
     * @param modifyWorkflowTemplateSearch
     */
    public void setModifyWorkflowTemplateSearch(tews6.wsdl.ModifyWorkflowTemplateSearch modifyWorkflowTemplateSearch) {
        this.modifyWorkflowTemplateSearch = modifyWorkflowTemplateSearch;
    }


    /**
     * Gets the modifyWorkflowTemplateModifyWorkflowTemplateTab value for this ModifyWorkflowTemplateQuery.
     * 
     * @return modifyWorkflowTemplateModifyWorkflowTemplateTab
     */
    public tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTab getModifyWorkflowTemplateModifyWorkflowTemplateTab() {
        return modifyWorkflowTemplateModifyWorkflowTemplateTab;
    }


    /**
     * Sets the modifyWorkflowTemplateModifyWorkflowTemplateTab value for this ModifyWorkflowTemplateQuery.
     * 
     * @param modifyWorkflowTemplateModifyWorkflowTemplateTab
     */
    public void setModifyWorkflowTemplateModifyWorkflowTemplateTab(tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTab modifyWorkflowTemplateModifyWorkflowTemplateTab) {
        this.modifyWorkflowTemplateModifyWorkflowTemplateTab = modifyWorkflowTemplateModifyWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyWorkflowTemplateQuery)) return false;
        ModifyWorkflowTemplateQuery other = (ModifyWorkflowTemplateQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modifyWorkflowTemplateSearch==null && other.getModifyWorkflowTemplateSearch()==null) || 
             (this.modifyWorkflowTemplateSearch!=null &&
              this.modifyWorkflowTemplateSearch.equals(other.getModifyWorkflowTemplateSearch()))) &&
            ((this.modifyWorkflowTemplateModifyWorkflowTemplateTab==null && other.getModifyWorkflowTemplateModifyWorkflowTemplateTab()==null) || 
             (this.modifyWorkflowTemplateModifyWorkflowTemplateTab!=null &&
              this.modifyWorkflowTemplateModifyWorkflowTemplateTab.equals(other.getModifyWorkflowTemplateModifyWorkflowTemplateTab())));
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
        if (getModifyWorkflowTemplateSearch() != null) {
            _hashCode += getModifyWorkflowTemplateSearch().hashCode();
        }
        if (getModifyWorkflowTemplateModifyWorkflowTemplateTab() != null) {
            _hashCode += getModifyWorkflowTemplateModifyWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyWorkflowTemplateQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyWorkflowTemplateSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyWorkflowTemplateModifyWorkflowTemplateTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateModifyWorkflowTemplateTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateModifyWorkflowTemplateTab"));
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
