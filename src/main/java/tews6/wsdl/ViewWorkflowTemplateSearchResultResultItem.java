/**
 * ViewWorkflowTemplateSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewWorkflowTemplateSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_ _PCT_FRIENDLY_NAME_PCT_;

    private tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemWfprocessname wfprocessname;

    private tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemDescription description;

    public ViewWorkflowTemplateSearchResultResultItem() {
    }

    public ViewWorkflowTemplateSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_ _PCT_FRIENDLY_NAME_PCT_,
           tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemWfprocessname wfprocessname,
           tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemDescription description) {
           this.OID = OID;
           this._PCT_FRIENDLY_NAME_PCT_ = _PCT_FRIENDLY_NAME_PCT_;
           this.wfprocessname = wfprocessname;
           this.description = description;
    }


    /**
     * Gets the OID value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the _PCT_FRIENDLY_NAME_PCT_ value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @return _PCT_FRIENDLY_NAME_PCT_
     */
    public tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_ get_PCT_FRIENDLY_NAME_PCT_() {
        return _PCT_FRIENDLY_NAME_PCT_;
    }


    /**
     * Sets the _PCT_FRIENDLY_NAME_PCT_ value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @param _PCT_FRIENDLY_NAME_PCT_
     */
    public void set_PCT_FRIENDLY_NAME_PCT_(tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_ _PCT_FRIENDLY_NAME_PCT_) {
        this._PCT_FRIENDLY_NAME_PCT_ = _PCT_FRIENDLY_NAME_PCT_;
    }


    /**
     * Gets the wfprocessname value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @return wfprocessname
     */
    public tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemWfprocessname getWfprocessname() {
        return wfprocessname;
    }


    /**
     * Sets the wfprocessname value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @param wfprocessname
     */
    public void setWfprocessname(tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemWfprocessname wfprocessname) {
        this.wfprocessname = wfprocessname;
    }


    /**
     * Gets the description value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @return description
     */
    public tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ViewWorkflowTemplateSearchResultResultItem.
     * 
     * @param description
     */
    public void setDescription(tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemDescription description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewWorkflowTemplateSearchResultResultItem)) return false;
        ViewWorkflowTemplateSearchResultResultItem other = (ViewWorkflowTemplateSearchResultResultItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OID==null && other.getOID()==null) || 
             (this.OID!=null &&
              this.OID.equals(other.getOID()))) &&
            ((this._PCT_FRIENDLY_NAME_PCT_==null && other.get_PCT_FRIENDLY_NAME_PCT_()==null) || 
             (this._PCT_FRIENDLY_NAME_PCT_!=null &&
              this._PCT_FRIENDLY_NAME_PCT_.equals(other.get_PCT_FRIENDLY_NAME_PCT_()))) &&
            ((this.wfprocessname==null && other.getWfprocessname()==null) || 
             (this.wfprocessname!=null &&
              this.wfprocessname.equals(other.getWfprocessname()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getOID() != null) {
            _hashCode += getOID().hashCode();
        }
        if (get_PCT_FRIENDLY_NAME_PCT_() != null) {
            _hashCode += get_PCT_FRIENDLY_NAME_PCT_().hashCode();
        }
        if (getWfprocessname() != null) {
            _hashCode += getWfprocessname().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewWorkflowTemplateSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_FRIENDLY_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_FRIENDLY_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wfprocessname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "wfprocessname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>wfprocessname"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>description"));
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
