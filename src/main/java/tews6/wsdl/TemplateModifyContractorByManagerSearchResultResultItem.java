/**
 * TemplateModifyContractorByManagerSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TemplateModifyContractorByManagerSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_USER_ID_PCT_ _PCT_USER_ID_PCT_;

    private tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_LAST_NAME_PCT_ _PCT_LAST_NAME_PCT_;

    private tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_FIRST_NAME_PCT_ _PCT_FIRST_NAME_PCT_;

    private tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_ _PCT_ORG_MEMBERSHIP_NAME_PCT_;

    public TemplateModifyContractorByManagerSearchResultResultItem() {
    }

    public TemplateModifyContractorByManagerSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_USER_ID_PCT_ _PCT_USER_ID_PCT_,
           tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_LAST_NAME_PCT_ _PCT_LAST_NAME_PCT_,
           tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_FIRST_NAME_PCT_ _PCT_FIRST_NAME_PCT_,
           tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_ _PCT_ORG_MEMBERSHIP_NAME_PCT_) {
           this.OID = OID;
           this._PCT_USER_ID_PCT_ = _PCT_USER_ID_PCT_;
           this._PCT_LAST_NAME_PCT_ = _PCT_LAST_NAME_PCT_;
           this._PCT_FIRST_NAME_PCT_ = _PCT_FIRST_NAME_PCT_;
           this._PCT_ORG_MEMBERSHIP_NAME_PCT_ = _PCT_ORG_MEMBERSHIP_NAME_PCT_;
    }


    /**
     * Gets the OID value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the _PCT_USER_ID_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @return _PCT_USER_ID_PCT_
     */
    public tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_USER_ID_PCT_ get_PCT_USER_ID_PCT_() {
        return _PCT_USER_ID_PCT_;
    }


    /**
     * Sets the _PCT_USER_ID_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @param _PCT_USER_ID_PCT_
     */
    public void set_PCT_USER_ID_PCT_(tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_USER_ID_PCT_ _PCT_USER_ID_PCT_) {
        this._PCT_USER_ID_PCT_ = _PCT_USER_ID_PCT_;
    }


    /**
     * Gets the _PCT_LAST_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @return _PCT_LAST_NAME_PCT_
     */
    public tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_LAST_NAME_PCT_ get_PCT_LAST_NAME_PCT_() {
        return _PCT_LAST_NAME_PCT_;
    }


    /**
     * Sets the _PCT_LAST_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @param _PCT_LAST_NAME_PCT_
     */
    public void set_PCT_LAST_NAME_PCT_(tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_LAST_NAME_PCT_ _PCT_LAST_NAME_PCT_) {
        this._PCT_LAST_NAME_PCT_ = _PCT_LAST_NAME_PCT_;
    }


    /**
     * Gets the _PCT_FIRST_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @return _PCT_FIRST_NAME_PCT_
     */
    public tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_FIRST_NAME_PCT_ get_PCT_FIRST_NAME_PCT_() {
        return _PCT_FIRST_NAME_PCT_;
    }


    /**
     * Sets the _PCT_FIRST_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @param _PCT_FIRST_NAME_PCT_
     */
    public void set_PCT_FIRST_NAME_PCT_(tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_FIRST_NAME_PCT_ _PCT_FIRST_NAME_PCT_) {
        this._PCT_FIRST_NAME_PCT_ = _PCT_FIRST_NAME_PCT_;
    }


    /**
     * Gets the _PCT_ORG_MEMBERSHIP_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @return _PCT_ORG_MEMBERSHIP_NAME_PCT_
     */
    public tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_ get_PCT_ORG_MEMBERSHIP_NAME_PCT_() {
        return _PCT_ORG_MEMBERSHIP_NAME_PCT_;
    }


    /**
     * Sets the _PCT_ORG_MEMBERSHIP_NAME_PCT_ value for this TemplateModifyContractorByManagerSearchResultResultItem.
     * 
     * @param _PCT_ORG_MEMBERSHIP_NAME_PCT_
     */
    public void set_PCT_ORG_MEMBERSHIP_NAME_PCT_(tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_ _PCT_ORG_MEMBERSHIP_NAME_PCT_) {
        this._PCT_ORG_MEMBERSHIP_NAME_PCT_ = _PCT_ORG_MEMBERSHIP_NAME_PCT_;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateModifyContractorByManagerSearchResultResultItem)) return false;
        TemplateModifyContractorByManagerSearchResultResultItem other = (TemplateModifyContractorByManagerSearchResultResultItem) obj;
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
            ((this._PCT_USER_ID_PCT_==null && other.get_PCT_USER_ID_PCT_()==null) || 
             (this._PCT_USER_ID_PCT_!=null &&
              this._PCT_USER_ID_PCT_.equals(other.get_PCT_USER_ID_PCT_()))) &&
            ((this._PCT_LAST_NAME_PCT_==null && other.get_PCT_LAST_NAME_PCT_()==null) || 
             (this._PCT_LAST_NAME_PCT_!=null &&
              this._PCT_LAST_NAME_PCT_.equals(other.get_PCT_LAST_NAME_PCT_()))) &&
            ((this._PCT_FIRST_NAME_PCT_==null && other.get_PCT_FIRST_NAME_PCT_()==null) || 
             (this._PCT_FIRST_NAME_PCT_!=null &&
              this._PCT_FIRST_NAME_PCT_.equals(other.get_PCT_FIRST_NAME_PCT_()))) &&
            ((this._PCT_ORG_MEMBERSHIP_NAME_PCT_==null && other.get_PCT_ORG_MEMBERSHIP_NAME_PCT_()==null) || 
             (this._PCT_ORG_MEMBERSHIP_NAME_PCT_!=null &&
              this._PCT_ORG_MEMBERSHIP_NAME_PCT_.equals(other.get_PCT_ORG_MEMBERSHIP_NAME_PCT_())));
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
        if (get_PCT_USER_ID_PCT_() != null) {
            _hashCode += get_PCT_USER_ID_PCT_().hashCode();
        }
        if (get_PCT_LAST_NAME_PCT_() != null) {
            _hashCode += get_PCT_LAST_NAME_PCT_().hashCode();
        }
        if (get_PCT_FIRST_NAME_PCT_() != null) {
            _hashCode += get_PCT_FIRST_NAME_PCT_().hashCode();
        }
        if (get_PCT_ORG_MEMBERSHIP_NAME_PCT_() != null) {
            _hashCode += get_PCT_ORG_MEMBERSHIP_NAME_PCT_().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateModifyContractorByManagerSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_USER_ID_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_USER_ID_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_USER_ID_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_LAST_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_LAST_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_LAST_NAME_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_FIRST_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_FIRST_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_ORG_MEMBERSHIP_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_ORG_MEMBERSHIP_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_"));
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
