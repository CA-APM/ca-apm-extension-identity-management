/**
 * ViewWorkflowTemplateQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewWorkflowTemplateQuery  implements java.io.Serializable {
    private tews6.wsdl.ViewWorkflowTemplateSearch viewWorkflowTemplateSearch;

    private tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab;

    public ViewWorkflowTemplateQuery() {
    }

    public ViewWorkflowTemplateQuery(
           tews6.wsdl.ViewWorkflowTemplateSearch viewWorkflowTemplateSearch,
           tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab) {
           this.viewWorkflowTemplateSearch = viewWorkflowTemplateSearch;
           this.viewWorkflowTemplateViewWorkflowTemplateTab = viewWorkflowTemplateViewWorkflowTemplateTab;
    }


    /**
     * Gets the viewWorkflowTemplateSearch value for this ViewWorkflowTemplateQuery.
     * 
     * @return viewWorkflowTemplateSearch
     */
    public tews6.wsdl.ViewWorkflowTemplateSearch getViewWorkflowTemplateSearch() {
        return viewWorkflowTemplateSearch;
    }


    /**
     * Sets the viewWorkflowTemplateSearch value for this ViewWorkflowTemplateQuery.
     * 
     * @param viewWorkflowTemplateSearch
     */
    public void setViewWorkflowTemplateSearch(tews6.wsdl.ViewWorkflowTemplateSearch viewWorkflowTemplateSearch) {
        this.viewWorkflowTemplateSearch = viewWorkflowTemplateSearch;
    }


    /**
     * Gets the viewWorkflowTemplateViewWorkflowTemplateTab value for this ViewWorkflowTemplateQuery.
     * 
     * @return viewWorkflowTemplateViewWorkflowTemplateTab
     */
    public tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab getViewWorkflowTemplateViewWorkflowTemplateTab() {
        return viewWorkflowTemplateViewWorkflowTemplateTab;
    }


    /**
     * Sets the viewWorkflowTemplateViewWorkflowTemplateTab value for this ViewWorkflowTemplateQuery.
     * 
     * @param viewWorkflowTemplateViewWorkflowTemplateTab
     */
    public void setViewWorkflowTemplateViewWorkflowTemplateTab(tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab) {
        this.viewWorkflowTemplateViewWorkflowTemplateTab = viewWorkflowTemplateViewWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewWorkflowTemplateQuery)) return false;
        ViewWorkflowTemplateQuery other = (ViewWorkflowTemplateQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewWorkflowTemplateSearch==null && other.getViewWorkflowTemplateSearch()==null) || 
             (this.viewWorkflowTemplateSearch!=null &&
              this.viewWorkflowTemplateSearch.equals(other.getViewWorkflowTemplateSearch()))) &&
            ((this.viewWorkflowTemplateViewWorkflowTemplateTab==null && other.getViewWorkflowTemplateViewWorkflowTemplateTab()==null) || 
             (this.viewWorkflowTemplateViewWorkflowTemplateTab!=null &&
              this.viewWorkflowTemplateViewWorkflowTemplateTab.equals(other.getViewWorkflowTemplateViewWorkflowTemplateTab())));
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
        if (getViewWorkflowTemplateSearch() != null) {
            _hashCode += getViewWorkflowTemplateSearch().hashCode();
        }
        if (getViewWorkflowTemplateViewWorkflowTemplateTab() != null) {
            _hashCode += getViewWorkflowTemplateViewWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewWorkflowTemplateQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewWorkflowTemplateSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewWorkflowTemplateViewWorkflowTemplateTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateViewWorkflowTemplateTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateViewWorkflowTemplateTab"));
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
