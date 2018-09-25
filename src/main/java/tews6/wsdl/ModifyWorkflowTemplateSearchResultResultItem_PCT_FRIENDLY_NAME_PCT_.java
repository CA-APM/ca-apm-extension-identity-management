/**
 * ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_  implements java.io.Serializable {
    private java.lang.String DISPLAY_NAME;

    private java.lang.String ATTR_NAME;

    private java.lang.String ATTR_VALUE;

    private tews6.wsdl.PermissionType ATTR_PERMISSION;

    public ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_() {
    }

    public ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_(
           java.lang.String DISPLAY_NAME,
           java.lang.String ATTR_NAME,
           java.lang.String ATTR_VALUE,
           tews6.wsdl.PermissionType ATTR_PERMISSION) {
           this.DISPLAY_NAME = DISPLAY_NAME;
           this.ATTR_NAME = ATTR_NAME;
           this.ATTR_VALUE = ATTR_VALUE;
           this.ATTR_PERMISSION = ATTR_PERMISSION;
    }


    /**
     * Gets the DISPLAY_NAME value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @return DISPLAY_NAME
     */
    public java.lang.String getDISPLAY_NAME() {
        return DISPLAY_NAME;
    }


    /**
     * Sets the DISPLAY_NAME value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @param DISPLAY_NAME
     */
    public void setDISPLAY_NAME(java.lang.String DISPLAY_NAME) {
        this.DISPLAY_NAME = DISPLAY_NAME;
    }


    /**
     * Gets the ATTR_NAME value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @return ATTR_NAME
     */
    public java.lang.String getATTR_NAME() {
        return ATTR_NAME;
    }


    /**
     * Sets the ATTR_NAME value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @param ATTR_NAME
     */
    public void setATTR_NAME(java.lang.String ATTR_NAME) {
        this.ATTR_NAME = ATTR_NAME;
    }


    /**
     * Gets the ATTR_VALUE value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @return ATTR_VALUE
     */
    public java.lang.String getATTR_VALUE() {
        return ATTR_VALUE;
    }


    /**
     * Sets the ATTR_VALUE value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @param ATTR_VALUE
     */
    public void setATTR_VALUE(java.lang.String ATTR_VALUE) {
        this.ATTR_VALUE = ATTR_VALUE;
    }


    /**
     * Gets the ATTR_PERMISSION value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @return ATTR_PERMISSION
     */
    public tews6.wsdl.PermissionType getATTR_PERMISSION() {
        return ATTR_PERMISSION;
    }


    /**
     * Sets the ATTR_PERMISSION value for this ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.
     * 
     * @param ATTR_PERMISSION
     */
    public void setATTR_PERMISSION(tews6.wsdl.PermissionType ATTR_PERMISSION) {
        this.ATTR_PERMISSION = ATTR_PERMISSION;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_)) return false;
        ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_ other = (ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DISPLAY_NAME==null && other.getDISPLAY_NAME()==null) || 
             (this.DISPLAY_NAME!=null &&
              this.DISPLAY_NAME.equals(other.getDISPLAY_NAME()))) &&
            ((this.ATTR_NAME==null && other.getATTR_NAME()==null) || 
             (this.ATTR_NAME!=null &&
              this.ATTR_NAME.equals(other.getATTR_NAME()))) &&
            ((this.ATTR_VALUE==null && other.getATTR_VALUE()==null) || 
             (this.ATTR_VALUE!=null &&
              this.ATTR_VALUE.equals(other.getATTR_VALUE()))) &&
            ((this.ATTR_PERMISSION==null && other.getATTR_PERMISSION()==null) || 
             (this.ATTR_PERMISSION!=null &&
              this.ATTR_PERMISSION.equals(other.getATTR_PERMISSION())));
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
        if (getDISPLAY_NAME() != null) {
            _hashCode += getDISPLAY_NAME().hashCode();
        }
        if (getATTR_NAME() != null) {
            _hashCode += getATTR_NAME().hashCode();
        }
        if (getATTR_VALUE() != null) {
            _hashCode += getATTR_VALUE().hashCode();
        }
        if (getATTR_PERMISSION() != null) {
            _hashCode += getATTR_PERMISSION().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISPLAY_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "DISPLAY_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATTR_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ATTR_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATTR_VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ATTR_VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATTR_PERMISSION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ATTR_PERMISSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", "PermissionType"));
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
