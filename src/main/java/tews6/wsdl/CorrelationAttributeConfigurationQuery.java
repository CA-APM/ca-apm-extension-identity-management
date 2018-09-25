/**
 * CorrelationAttributeConfigurationQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CorrelationAttributeConfigurationQuery  implements java.io.Serializable {
    private tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab;

    public CorrelationAttributeConfigurationQuery() {
    }

    public CorrelationAttributeConfigurationQuery(
           tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab) {
           this.correlationAttributeConfigurationCorrelationAttributeTagTab = correlationAttributeConfigurationCorrelationAttributeTagTab;
    }


    /**
     * Gets the correlationAttributeConfigurationCorrelationAttributeTagTab value for this CorrelationAttributeConfigurationQuery.
     * 
     * @return correlationAttributeConfigurationCorrelationAttributeTagTab
     */
    public tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab getCorrelationAttributeConfigurationCorrelationAttributeTagTab() {
        return correlationAttributeConfigurationCorrelationAttributeTagTab;
    }


    /**
     * Sets the correlationAttributeConfigurationCorrelationAttributeTagTab value for this CorrelationAttributeConfigurationQuery.
     * 
     * @param correlationAttributeConfigurationCorrelationAttributeTagTab
     */
    public void setCorrelationAttributeConfigurationCorrelationAttributeTagTab(tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab) {
        this.correlationAttributeConfigurationCorrelationAttributeTagTab = correlationAttributeConfigurationCorrelationAttributeTagTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrelationAttributeConfigurationQuery)) return false;
        CorrelationAttributeConfigurationQuery other = (CorrelationAttributeConfigurationQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correlationAttributeConfigurationCorrelationAttributeTagTab==null && other.getCorrelationAttributeConfigurationCorrelationAttributeTagTab()==null) || 
             (this.correlationAttributeConfigurationCorrelationAttributeTagTab!=null &&
              this.correlationAttributeConfigurationCorrelationAttributeTagTab.equals(other.getCorrelationAttributeConfigurationCorrelationAttributeTagTab())));
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
        if (getCorrelationAttributeConfigurationCorrelationAttributeTagTab() != null) {
            _hashCode += getCorrelationAttributeConfigurationCorrelationAttributeTagTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrelationAttributeConfigurationQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationAttributeConfigurationCorrelationAttributeTagTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CorrelationAttributeConfigurationCorrelationAttributeTagTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationCorrelationAttributeTagTab"));
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
