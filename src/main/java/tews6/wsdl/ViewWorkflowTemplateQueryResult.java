/**
 * ViewWorkflowTemplateQueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewWorkflowTemplateQueryResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab;

    public ViewWorkflowTemplateQueryResult() {
    }

    public ViewWorkflowTemplateQueryResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab) {
           this.imsStatus = imsStatus;
           this.viewWorkflowTemplateViewWorkflowTemplateTab = viewWorkflowTemplateViewWorkflowTemplateTab;
    }


    /**
     * Gets the imsStatus value for this ViewWorkflowTemplateQueryResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this ViewWorkflowTemplateQueryResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the viewWorkflowTemplateViewWorkflowTemplateTab value for this ViewWorkflowTemplateQueryResult.
     * 
     * @return viewWorkflowTemplateViewWorkflowTemplateTab
     */
    public tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab getViewWorkflowTemplateViewWorkflowTemplateTab() {
        return viewWorkflowTemplateViewWorkflowTemplateTab;
    }


    /**
     * Sets the viewWorkflowTemplateViewWorkflowTemplateTab value for this ViewWorkflowTemplateQueryResult.
     * 
     * @param viewWorkflowTemplateViewWorkflowTemplateTab
     */
    public void setViewWorkflowTemplateViewWorkflowTemplateTab(tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab viewWorkflowTemplateViewWorkflowTemplateTab) {
        this.viewWorkflowTemplateViewWorkflowTemplateTab = viewWorkflowTemplateViewWorkflowTemplateTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewWorkflowTemplateQueryResult)) return false;
        ViewWorkflowTemplateQueryResult other = (ViewWorkflowTemplateQueryResult) obj;
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
        if (getImsStatus() != null) {
            _hashCode += getImsStatus().hashCode();
        }
        if (getViewWorkflowTemplateViewWorkflowTemplateTab() != null) {
            _hashCode += getViewWorkflowTemplateViewWorkflowTemplateTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewWorkflowTemplateQueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
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
