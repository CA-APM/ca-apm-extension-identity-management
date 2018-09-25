/**
 * ChangeMyPasswordQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ChangeMyPasswordQuery  implements java.io.Serializable {
    private tews6.wsdl.ChangeMyPasswordProfileTab changeMyPasswordProfileTab;

    public ChangeMyPasswordQuery() {
    }

    public ChangeMyPasswordQuery(
           tews6.wsdl.ChangeMyPasswordProfileTab changeMyPasswordProfileTab) {
           this.changeMyPasswordProfileTab = changeMyPasswordProfileTab;
    }


    /**
     * Gets the changeMyPasswordProfileTab value for this ChangeMyPasswordQuery.
     * 
     * @return changeMyPasswordProfileTab
     */
    public tews6.wsdl.ChangeMyPasswordProfileTab getChangeMyPasswordProfileTab() {
        return changeMyPasswordProfileTab;
    }


    /**
     * Sets the changeMyPasswordProfileTab value for this ChangeMyPasswordQuery.
     * 
     * @param changeMyPasswordProfileTab
     */
    public void setChangeMyPasswordProfileTab(tews6.wsdl.ChangeMyPasswordProfileTab changeMyPasswordProfileTab) {
        this.changeMyPasswordProfileTab = changeMyPasswordProfileTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeMyPasswordQuery)) return false;
        ChangeMyPasswordQuery other = (ChangeMyPasswordQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeMyPasswordProfileTab==null && other.getChangeMyPasswordProfileTab()==null) || 
             (this.changeMyPasswordProfileTab!=null &&
              this.changeMyPasswordProfileTab.equals(other.getChangeMyPasswordProfileTab())));
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
        if (getChangeMyPasswordProfileTab() != null) {
            _hashCode += getChangeMyPasswordProfileTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMyPasswordQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeMyPasswordProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ChangeMyPasswordProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordProfileTab"));
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
