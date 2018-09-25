/**
 * ViewMyWorkListWorkListTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewMyWorkListWorkListTab  implements java.io.Serializable {
    private tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue[] workList;

    public ViewMyWorkListWorkListTab() {
    }

    public ViewMyWorkListWorkListTab(
           tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue[] workList) {
           this.workList = workList;
    }


    /**
     * Gets the workList value for this ViewMyWorkListWorkListTab.
     * 
     * @return workList
     */
    public tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue[] getWorkList() {
        return workList;
    }


    /**
     * Sets the workList value for this ViewMyWorkListWorkListTab.
     * 
     * @param workList
     */
    public void setWorkList(tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue[] workList) {
        this.workList = workList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewMyWorkListWorkListTab)) return false;
        ViewMyWorkListWorkListTab other = (ViewMyWorkListWorkListTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workList==null && other.getWorkList()==null) || 
             (this.workList!=null &&
              java.util.Arrays.equals(this.workList, other.getWorkList())));
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
        if (getWorkList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewMyWorkListWorkListTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListWorkListTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "WorkList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkListWorkListTab>WorkList>currentvalue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue"));
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
