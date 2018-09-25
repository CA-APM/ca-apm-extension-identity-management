/**
 * TemplateEmployeeCreationFromFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TemplateEmployeeCreationFromFeed  implements java.io.Serializable {
    private tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTab templateEmployeeCreationFromFeedUserProfileTab;

    public TemplateEmployeeCreationFromFeed() {
    }

    public TemplateEmployeeCreationFromFeed(
           tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTab templateEmployeeCreationFromFeedUserProfileTab) {
           this.templateEmployeeCreationFromFeedUserProfileTab = templateEmployeeCreationFromFeedUserProfileTab;
    }


    /**
     * Gets the templateEmployeeCreationFromFeedUserProfileTab value for this TemplateEmployeeCreationFromFeed.
     * 
     * @return templateEmployeeCreationFromFeedUserProfileTab
     */
    public tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTab getTemplateEmployeeCreationFromFeedUserProfileTab() {
        return templateEmployeeCreationFromFeedUserProfileTab;
    }


    /**
     * Sets the templateEmployeeCreationFromFeedUserProfileTab value for this TemplateEmployeeCreationFromFeed.
     * 
     * @param templateEmployeeCreationFromFeedUserProfileTab
     */
    public void setTemplateEmployeeCreationFromFeedUserProfileTab(tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTab templateEmployeeCreationFromFeedUserProfileTab) {
        this.templateEmployeeCreationFromFeedUserProfileTab = templateEmployeeCreationFromFeedUserProfileTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateEmployeeCreationFromFeed)) return false;
        TemplateEmployeeCreationFromFeed other = (TemplateEmployeeCreationFromFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateEmployeeCreationFromFeedUserProfileTab==null && other.getTemplateEmployeeCreationFromFeedUserProfileTab()==null) || 
             (this.templateEmployeeCreationFromFeedUserProfileTab!=null &&
              this.templateEmployeeCreationFromFeedUserProfileTab.equals(other.getTemplateEmployeeCreationFromFeedUserProfileTab())));
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
        if (getTemplateEmployeeCreationFromFeedUserProfileTab() != null) {
            _hashCode += getTemplateEmployeeCreationFromFeedUserProfileTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateEmployeeCreationFromFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeCreationFromFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateEmployeeCreationFromFeedUserProfileTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateEmployeeCreationFromFeedUserProfileTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeCreationFromFeedUserProfileTab"));
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
