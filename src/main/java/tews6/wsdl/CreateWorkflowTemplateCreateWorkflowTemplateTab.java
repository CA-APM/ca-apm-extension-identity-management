/**
 * CreateWorkflowTemplateCreateWorkflowTemplateTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateWorkflowTemplateCreateWorkflowTemplateTab  implements java.io.Serializable {
    private tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTabHistoryEntry historyEntry;

    public CreateWorkflowTemplateCreateWorkflowTemplateTab() {
    }

    public CreateWorkflowTemplateCreateWorkflowTemplateTab(
           tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTabHistoryEntry historyEntry) {
           this.historyEntry = historyEntry;
    }


    /**
     * Gets the historyEntry value for this CreateWorkflowTemplateCreateWorkflowTemplateTab.
     * 
     * @return historyEntry
     */
    public tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTabHistoryEntry getHistoryEntry() {
        return historyEntry;
    }


    /**
     * Sets the historyEntry value for this CreateWorkflowTemplateCreateWorkflowTemplateTab.
     * 
     * @param historyEntry
     */
    public void setHistoryEntry(tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTabHistoryEntry historyEntry) {
        this.historyEntry = historyEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateWorkflowTemplateCreateWorkflowTemplateTab)) return false;
        CreateWorkflowTemplateCreateWorkflowTemplateTab other = (CreateWorkflowTemplateCreateWorkflowTemplateTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.historyEntry==null && other.getHistoryEntry()==null) || 
             (this.historyEntry!=null &&
              this.historyEntry.equals(other.getHistoryEntry())));
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
        if (getHistoryEntry() != null) {
            _hashCode += getHistoryEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateWorkflowTemplateCreateWorkflowTemplateTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateCreateWorkflowTemplateTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "HistoryEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateCreateWorkflowTemplateTab>HistoryEntry"));
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
