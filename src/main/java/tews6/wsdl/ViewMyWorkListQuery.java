/**
 * ViewMyWorkListQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewMyWorkListQuery  implements java.io.Serializable {
    private tews6.wsdl.ViewMyWorkListWorkListTab viewMyWorkListWorkListTab;

    public ViewMyWorkListQuery() {
    }

    public ViewMyWorkListQuery(
           tews6.wsdl.ViewMyWorkListWorkListTab viewMyWorkListWorkListTab) {
           this.viewMyWorkListWorkListTab = viewMyWorkListWorkListTab;
    }


    /**
     * Gets the viewMyWorkListWorkListTab value for this ViewMyWorkListQuery.
     * 
     * @return viewMyWorkListWorkListTab
     */
    public tews6.wsdl.ViewMyWorkListWorkListTab getViewMyWorkListWorkListTab() {
        return viewMyWorkListWorkListTab;
    }


    /**
     * Sets the viewMyWorkListWorkListTab value for this ViewMyWorkListQuery.
     * 
     * @param viewMyWorkListWorkListTab
     */
    public void setViewMyWorkListWorkListTab(tews6.wsdl.ViewMyWorkListWorkListTab viewMyWorkListWorkListTab) {
        this.viewMyWorkListWorkListTab = viewMyWorkListWorkListTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewMyWorkListQuery)) return false;
        ViewMyWorkListQuery other = (ViewMyWorkListQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewMyWorkListWorkListTab==null && other.getViewMyWorkListWorkListTab()==null) || 
             (this.viewMyWorkListWorkListTab!=null &&
              this.viewMyWorkListWorkListTab.equals(other.getViewMyWorkListWorkListTab())));
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
        if (getViewMyWorkListWorkListTab() != null) {
            _hashCode += getViewMyWorkListWorkListTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewMyWorkListQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewMyWorkListWorkListTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkListWorkListTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListWorkListTab"));
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
