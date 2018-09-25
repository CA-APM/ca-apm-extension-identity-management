/**
 * TemplateModifyContractorByManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TemplateModifyContractorByManager  implements java.io.Serializable {
    private tews6.wsdl.TemplateModifyContractorByManagerSearch templateModifyContractorByManagerSearch;

    private tews6.wsdl.TemplateModifyContractorByManagerUserProfileTab templateModifyContractorByManagerUserProfileTab;

    public TemplateModifyContractorByManager() {
    }

    public TemplateModifyContractorByManager(
           tews6.wsdl.TemplateModifyContractorByManagerSearch templateModifyContractorByManagerSearch,
           tews6.wsdl.TemplateModifyContractorByManagerUserProfileTab templateModifyContractorByManagerUserProfileTab) {
           this.templateModifyContractorByManagerSearch = templateModifyContractorByManagerSearch;
           this.templateModifyContractorByManagerUserProfileTab = templateModifyContractorByManagerUserProfileTab;
    }


    /**
     * Gets the templateModifyContractorByManagerSearch value for this TemplateModifyContractorByManager.
     * 
     * @return templateModifyContractorByManagerSearch
     */
    public tews6.wsdl.TemplateModifyContractorByManagerSearch getTemplateModifyContractorByManagerSearch() {
        return templateModifyContractorByManagerSearch;
    }


    /**
     * Sets the templateModifyContractorByManagerSearch value for this TemplateModifyContractorByManager.
     * 
     * @param templateModifyContractorByManagerSearch
     */
    public void setTemplateModifyContractorByManagerSearch(tews6.wsdl.TemplateModifyContractorByManagerSearch templateModifyContractorByManagerSearch) {
        this.templateModifyContractorByManagerSearch = templateModifyContractorByManagerSearch;
    }


    /**
     * Gets the templateModifyContractorByManagerUserProfileTab value for this TemplateModifyContractorByManager.
     * 
     * @return templateModifyContractorByManagerUserProfileTab
     */
    public tews6.wsdl.TemplateModifyContractorByManagerUserProfileTab getTemplateModifyContractorByManagerUserProfileTab() {
        return templateModifyContractorByManagerUserProfileTab;
    }


    /**
     * Sets the templateModifyContractorByManagerUserProfileTab value for this TemplateModifyContractorByManager.
     * 
     * @param templateModifyContractorByManagerUserProfileTab
     */
    public void setTemplateModifyContractorByManagerUserProfileTab(tews6.wsdl.TemplateModifyContractorByManagerUserProfileTab templateModifyContractorByManagerUserProfileTab) {
        this.templateModifyContractorByManagerUserProfileTab = templateModifyContractorByManagerUserProfileTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateModifyContractorByManager)) return false;
        TemplateModifyContractorByManager other = (TemplateModifyContractorByManager) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateModifyContractorByManagerSearch==null && other.getTemplateModifyContractorByManagerSearch()==null) || 
             (this.templateModifyContractorByManagerSearch!=null &&
              this.templateModifyContractorByManagerSearch.equals(other.getTemplateModifyContractorByManagerSearch()))) &&
            ((this.templateModifyContractorByManagerUserProfileTab==null && other.getTemplateModifyContractorByManagerUserProfileTab()==null) || 
             (this.templateModifyContractorByManagerUserProfileTab!=null &&
              this.templateModifyContractorByManagerUserProfileTab.equals(other.getTemplateModifyContractorByManagerUserProfileTab())));
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
        if (getTemplateModifyContractorByManagerSearch() != null) {
            _hashCode += getTemplateModifyContractorByManagerSearch().hashCode();
        }
        if (getTemplateModifyContractorByManagerUserProfileTab() != null) {
            _hashCode += getTemplateModifyContractorByManagerUserProfileTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateModifyContractorByManager.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManager"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateModifyContractorByManagerSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateModifyContractorByManagerUserProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerUserProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerUserProfileTab"));
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
