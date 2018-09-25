/**
 * ManageReportServerConnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ManageReportServerConnection  implements java.io.Serializable {
    private tews6.wsdl.ManageReportServerConnectionSearch manageReportServerConnectionSearch;

    private tews6.wsdl.ManageReportServerConnectionProfileTab manageReportServerConnectionProfileTab;

    public ManageReportServerConnection() {
    }

    public ManageReportServerConnection(
           tews6.wsdl.ManageReportServerConnectionSearch manageReportServerConnectionSearch,
           tews6.wsdl.ManageReportServerConnectionProfileTab manageReportServerConnectionProfileTab) {
           this.manageReportServerConnectionSearch = manageReportServerConnectionSearch;
           this.manageReportServerConnectionProfileTab = manageReportServerConnectionProfileTab;
    }


    /**
     * Gets the manageReportServerConnectionSearch value for this ManageReportServerConnection.
     * 
     * @return manageReportServerConnectionSearch
     */
    public tews6.wsdl.ManageReportServerConnectionSearch getManageReportServerConnectionSearch() {
        return manageReportServerConnectionSearch;
    }


    /**
     * Sets the manageReportServerConnectionSearch value for this ManageReportServerConnection.
     * 
     * @param manageReportServerConnectionSearch
     */
    public void setManageReportServerConnectionSearch(tews6.wsdl.ManageReportServerConnectionSearch manageReportServerConnectionSearch) {
        this.manageReportServerConnectionSearch = manageReportServerConnectionSearch;
    }


    /**
     * Gets the manageReportServerConnectionProfileTab value for this ManageReportServerConnection.
     * 
     * @return manageReportServerConnectionProfileTab
     */
    public tews6.wsdl.ManageReportServerConnectionProfileTab getManageReportServerConnectionProfileTab() {
        return manageReportServerConnectionProfileTab;
    }


    /**
     * Sets the manageReportServerConnectionProfileTab value for this ManageReportServerConnection.
     * 
     * @param manageReportServerConnectionProfileTab
     */
    public void setManageReportServerConnectionProfileTab(tews6.wsdl.ManageReportServerConnectionProfileTab manageReportServerConnectionProfileTab) {
        this.manageReportServerConnectionProfileTab = manageReportServerConnectionProfileTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageReportServerConnection)) return false;
        ManageReportServerConnection other = (ManageReportServerConnection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manageReportServerConnectionSearch==null && other.getManageReportServerConnectionSearch()==null) || 
             (this.manageReportServerConnectionSearch!=null &&
              this.manageReportServerConnectionSearch.equals(other.getManageReportServerConnectionSearch()))) &&
            ((this.manageReportServerConnectionProfileTab==null && other.getManageReportServerConnectionProfileTab()==null) || 
             (this.manageReportServerConnectionProfileTab!=null &&
              this.manageReportServerConnectionProfileTab.equals(other.getManageReportServerConnectionProfileTab())));
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
        if (getManageReportServerConnectionSearch() != null) {
            _hashCode += getManageReportServerConnectionSearch().hashCode();
        }
        if (getManageReportServerConnectionProfileTab() != null) {
            _hashCode += getManageReportServerConnectionProfileTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageReportServerConnection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageReportServerConnectionSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ManageReportServerConnectionSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionSearch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageReportServerConnectionProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ManageReportServerConnectionProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionProfileTab"));
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
