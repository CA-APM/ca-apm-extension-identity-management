/**
 * ModifyWorkflowTemplateSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ModifyWorkflowTemplateSearchResult  implements java.io.Serializable {
    private tews6.wsdl.ImsStatus imsStatus;

    private tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem[] resultItem;

    public ModifyWorkflowTemplateSearchResult() {
    }

    public ModifyWorkflowTemplateSearchResult(
           tews6.wsdl.ImsStatus imsStatus,
           tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem[] resultItem) {
           this.imsStatus = imsStatus;
           this.resultItem = resultItem;
    }


    /**
     * Gets the imsStatus value for this ModifyWorkflowTemplateSearchResult.
     * 
     * @return imsStatus
     */
    public tews6.wsdl.ImsStatus getImsStatus() {
        return imsStatus;
    }


    /**
     * Sets the imsStatus value for this ModifyWorkflowTemplateSearchResult.
     * 
     * @param imsStatus
     */
    public void setImsStatus(tews6.wsdl.ImsStatus imsStatus) {
        this.imsStatus = imsStatus;
    }


    /**
     * Gets the resultItem value for this ModifyWorkflowTemplateSearchResult.
     * 
     * @return resultItem
     */
    public tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem[] getResultItem() {
        return resultItem;
    }


    /**
     * Sets the resultItem value for this ModifyWorkflowTemplateSearchResult.
     * 
     * @param resultItem
     */
    public void setResultItem(tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem[] resultItem) {
        this.resultItem = resultItem;
    }

    public tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem getResultItem(int i) {
        return this.resultItem[i];
    }

    public void setResultItem(int i, tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem _value) {
        this.resultItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyWorkflowTemplateSearchResult)) return false;
        ModifyWorkflowTemplateSearchResult other = (ModifyWorkflowTemplateSearchResult) obj;
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
            ((this.resultItem==null && other.getResultItem()==null) || 
             (this.resultItem!=null &&
              java.util.Arrays.equals(this.resultItem, other.getResultItem())));
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
        if (getResultItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultItem(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyWorkflowTemplateSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResultItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearchResult>ResultItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
