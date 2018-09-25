/**
 * CorrelationAttributeConfigurationQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CorrelationAttributeConfigurationQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab;

    public CorrelationAttributeConfigurationQueryResult() {
    }

    public CorrelationAttributeConfigurationQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab) {
           this.imsStatus = imsStatus;
           this.correlationAttributeConfigurationCorrelationAttributeTagTab = correlationAttributeConfigurationCorrelationAttributeTagTab;
    }


    /**
     * Gets the imsStatus value for this CorrelationAttributeConfigurationQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this CorrelationAttributeConfigurationQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the correlationAttributeConfigurationCorrelationAttributeTagTab value for this CorrelationAttributeConfigurationQueryResult.
     * 
     * @return correlationAttributeConfigurationCorrelationAttributeTagTab
     */
    public tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab getCorrelationAttributeConfigurationCorrelationAttributeTagTab() {
        return correlationAttributeConfigurationCorrelationAttributeTagTab;
    }


    /**
     * Sets the correlationAttributeConfigurationCorrelationAttributeTagTab value for this CorrelationAttributeConfigurationQueryResult.
     * 
     * @param correlationAttributeConfigurationCorrelationAttributeTagTab
     */
    public void setCorrelationAttributeConfigurationCorrelationAttributeTagTab(tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab correlationAttributeConfigurationCorrelationAttributeTagTab) {
        this.correlationAttributeConfigurationCorrelationAttributeTagTab = correlationAttributeConfigurationCorrelationAttributeTagTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrelationAttributeConfigurationQueryResult)) return false;
        CorrelationAttributeConfigurationQueryResult other = (CorrelationAttributeConfigurationQueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imsStatus==null && other.getImsStatus()==null) || 
             (this.imsStatus!=null &&
              this.imsStatus.equals(other.getImsStatus()))) &&
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
        if (getImsStatus() != null) {
            _hashCode += getImsStatus().hashCode();
        }
        if (getCorrelationAttributeConfigurationCorrelationAttributeTagTab() != null) {
            _hashCode += getCorrelationAttributeConfigurationCorrelationAttributeTagTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrelationAttributeConfigurationQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
