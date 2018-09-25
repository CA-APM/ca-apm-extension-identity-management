/**
 * ViewUseCaseQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUseCaseQuery  implements java.io.Serializable {
    private tews6.wsdl.ViewUseCaseSearch viewUseCaseSearch;

    private tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab;

    private tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab;

    public ViewUseCaseQuery() {
    }

    public ViewUseCaseQuery(
           tews6.wsdl.ViewUseCaseSearch viewUseCaseSearch,
           tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab,
           tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab) {
           this.viewUseCaseSearch = viewUseCaseSearch;
           this.viewUseCaseDeploymentXpressProfileTab = viewUseCaseDeploymentXpressProfileTab;
           this.viewUseCaseElementTabTab = viewUseCaseElementTabTab;
    }


    /**
     * Gets the viewUseCaseSearch value for this ViewUseCaseQuery.
     * 
     * @return viewUseCaseSearch
     */
    public tews6.wsdl.ViewUseCaseSearch getViewUseCaseSearch() {
        return viewUseCaseSearch;
    }


    /**
     * Sets the viewUseCaseSearch value for this ViewUseCaseQuery.
     * 
     * @param viewUseCaseSearch
     */
    public void setViewUseCaseSearch(tews6.wsdl.ViewUseCaseSearch viewUseCaseSearch) {
        this.viewUseCaseSearch = viewUseCaseSearch;
    }


    /**
     * Gets the viewUseCaseDeploymentXpressProfileTab value for this ViewUseCaseQuery.
     * 
     * @return viewUseCaseDeploymentXpressProfileTab
     */
    public tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab getViewUseCaseDeploymentXpressProfileTab() {
        return viewUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Sets the viewUseCaseDeploymentXpressProfileTab value for this ViewUseCaseQuery.
     * 
     * @param viewUseCaseDeploymentXpressProfileTab
     */
    public void setViewUseCaseDeploymentXpressProfileTab(tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab viewUseCaseDeploymentXpressProfileTab) {
        this.viewUseCaseDeploymentXpressProfileTab = viewUseCaseDeploymentXpressProfileTab;
    }


    /**
     * Gets the viewUseCaseElementTabTab value for this ViewUseCaseQuery.
     * 
     * @return viewUseCaseElementTabTab
     */
    public tews6.wsdl.ViewUseCaseElementTabTab getViewUseCaseElementTabTab() {
        return viewUseCaseElementTabTab;
    }


    /**
     * Sets the viewUseCaseElementTabTab value for this ViewUseCaseQuery.
     * 
     * @param viewUseCaseElementTabTab
     */
    public void setViewUseCaseElementTabTab(tews6.wsdl.ViewUseCaseElementTabTab viewUseCaseElementTabTab) {
        this.viewUseCaseElementTabTab = viewUseCaseElementTabTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUseCaseQuery)) return false;
        ViewUseCaseQuery other = (ViewUseCaseQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewUseCaseSearch==null && other.getViewUseCaseSearch()==null) || 
             (this.viewUseCaseSearch!=null &&
              this.viewUseCaseSearch.equals(other.getViewUseCaseSearch()))) &&
            ((this.viewUseCaseDeploymentXpressProfileTab==null && other.getViewUseCaseDeploymentXpressProfileTab()==null) || 
             (this.viewUseCaseDeploymentXpressProfileTab!=null &&
              this.viewUseCaseDeploymentXpressProfileTab.equals(other.getViewUseCaseDeploymentXpressProfileTab()))) &&
            ((this.viewUseCaseElementTabTab==null && other.getViewUseCaseElementTabTab()==null) || 
             (this.viewUseCaseElementTabTab!=null &&
              this.viewUseCaseElementTabTab.equals(other.getViewUseCaseElementTabTab())));
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
        if (getViewUseCaseSearch() != null) {
            _hashCode += getViewUseCaseSearch().hashCode();
        }
        if (getViewUseCaseDeploymentXpressProfileTab() != null) {
            _hashCode += getViewUseCaseDeploymentXpressProfileTab().hashCode();
        }
        if (getViewUseCaseElementTabTab() != null) {
            _hashCode += getViewUseCaseElementTabTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUseCaseQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewUseCaseSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewUseCaseDeploymentXpressProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseDeploymentXpressProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseDeploymentXpressProfileTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewUseCaseElementTabTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseElementTabTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseElementTabTab"));
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
