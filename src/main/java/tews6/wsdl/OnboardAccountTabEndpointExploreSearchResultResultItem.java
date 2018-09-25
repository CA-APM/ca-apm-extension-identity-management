/**
 * OnboardAccountTabEndpointExploreSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class OnboardAccountTabEndpointExploreSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ACCOUNT_NAME_PCT_ _PCT_ACCOUNT_NAME_PCT_;

    private tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_TYPE_PCT_ _PCT_ENDPOINT_TYPE_PCT_;

    private tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_PCT_ _PCT_ENDPOINT_PCT_;

    private tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_CONTAINER_PCT_ _PCT_CONTAINER_PCT_;

    public OnboardAccountTabEndpointExploreSearchResultResultItem() {
    }

    public OnboardAccountTabEndpointExploreSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ACCOUNT_NAME_PCT_ _PCT_ACCOUNT_NAME_PCT_,
           tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_TYPE_PCT_ _PCT_ENDPOINT_TYPE_PCT_,
           tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_PCT_ _PCT_ENDPOINT_PCT_,
           tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_CONTAINER_PCT_ _PCT_CONTAINER_PCT_) {
           this.OID = OID;
           this._PCT_ACCOUNT_NAME_PCT_ = _PCT_ACCOUNT_NAME_PCT_;
           this._PCT_ENDPOINT_TYPE_PCT_ = _PCT_ENDPOINT_TYPE_PCT_;
           this._PCT_ENDPOINT_PCT_ = _PCT_ENDPOINT_PCT_;
           this._PCT_CONTAINER_PCT_ = _PCT_CONTAINER_PCT_;
    }


    /**
     * Gets the OID value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the _PCT_ACCOUNT_NAME_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @return _PCT_ACCOUNT_NAME_PCT_
     */
    public tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ACCOUNT_NAME_PCT_ get_PCT_ACCOUNT_NAME_PCT_() {
        return _PCT_ACCOUNT_NAME_PCT_;
    }


    /**
     * Sets the _PCT_ACCOUNT_NAME_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @param _PCT_ACCOUNT_NAME_PCT_
     */
    public void set_PCT_ACCOUNT_NAME_PCT_(tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ACCOUNT_NAME_PCT_ _PCT_ACCOUNT_NAME_PCT_) {
        this._PCT_ACCOUNT_NAME_PCT_ = _PCT_ACCOUNT_NAME_PCT_;
    }


    /**
     * Gets the _PCT_ENDPOINT_TYPE_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @return _PCT_ENDPOINT_TYPE_PCT_
     */
    public tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_TYPE_PCT_ get_PCT_ENDPOINT_TYPE_PCT_() {
        return _PCT_ENDPOINT_TYPE_PCT_;
    }


    /**
     * Sets the _PCT_ENDPOINT_TYPE_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @param _PCT_ENDPOINT_TYPE_PCT_
     */
    public void set_PCT_ENDPOINT_TYPE_PCT_(tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_TYPE_PCT_ _PCT_ENDPOINT_TYPE_PCT_) {
        this._PCT_ENDPOINT_TYPE_PCT_ = _PCT_ENDPOINT_TYPE_PCT_;
    }


    /**
     * Gets the _PCT_ENDPOINT_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @return _PCT_ENDPOINT_PCT_
     */
    public tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_PCT_ get_PCT_ENDPOINT_PCT_() {
        return _PCT_ENDPOINT_PCT_;
    }


    /**
     * Sets the _PCT_ENDPOINT_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @param _PCT_ENDPOINT_PCT_
     */
    public void set_PCT_ENDPOINT_PCT_(tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_PCT_ _PCT_ENDPOINT_PCT_) {
        this._PCT_ENDPOINT_PCT_ = _PCT_ENDPOINT_PCT_;
    }


    /**
     * Gets the _PCT_CONTAINER_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @return _PCT_CONTAINER_PCT_
     */
    public tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_CONTAINER_PCT_ get_PCT_CONTAINER_PCT_() {
        return _PCT_CONTAINER_PCT_;
    }


    /**
     * Sets the _PCT_CONTAINER_PCT_ value for this OnboardAccountTabEndpointExploreSearchResultResultItem.
     * 
     * @param _PCT_CONTAINER_PCT_
     */
    public void set_PCT_CONTAINER_PCT_(tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_CONTAINER_PCT_ _PCT_CONTAINER_PCT_) {
        this._PCT_CONTAINER_PCT_ = _PCT_CONTAINER_PCT_;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnboardAccountTabEndpointExploreSearchResultResultItem)) return false;
        OnboardAccountTabEndpointExploreSearchResultResultItem other = (OnboardAccountTabEndpointExploreSearchResultResultItem) obj;
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
            ((this._PCT_ACCOUNT_NAME_PCT_==null && other.get_PCT_ACCOUNT_NAME_PCT_()==null) || 
             (this._PCT_ACCOUNT_NAME_PCT_!=null &&
              this._PCT_ACCOUNT_NAME_PCT_.equals(other.get_PCT_ACCOUNT_NAME_PCT_()))) &&
            ((this._PCT_ENDPOINT_TYPE_PCT_==null && other.get_PCT_ENDPOINT_TYPE_PCT_()==null) || 
             (this._PCT_ENDPOINT_TYPE_PCT_!=null &&
              this._PCT_ENDPOINT_TYPE_PCT_.equals(other.get_PCT_ENDPOINT_TYPE_PCT_()))) &&
            ((this._PCT_ENDPOINT_PCT_==null && other.get_PCT_ENDPOINT_PCT_()==null) || 
             (this._PCT_ENDPOINT_PCT_!=null &&
              this._PCT_ENDPOINT_PCT_.equals(other.get_PCT_ENDPOINT_PCT_()))) &&
            ((this._PCT_CONTAINER_PCT_==null && other.get_PCT_CONTAINER_PCT_()==null) || 
             (this._PCT_CONTAINER_PCT_!=null &&
              this._PCT_CONTAINER_PCT_.equals(other.get_PCT_CONTAINER_PCT_())));
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
        if (get_PCT_ACCOUNT_NAME_PCT_() != null) {
            _hashCode += get_PCT_ACCOUNT_NAME_PCT_().hashCode();
        }
        if (get_PCT_ENDPOINT_TYPE_PCT_() != null) {
            _hashCode += get_PCT_ENDPOINT_TYPE_PCT_().hashCode();
        }
        if (get_PCT_ENDPOINT_PCT_() != null) {
            _hashCode += get_PCT_ENDPOINT_PCT_().hashCode();
        }
        if (get_PCT_CONTAINER_PCT_() != null) {
            _hashCode += get_PCT_CONTAINER_PCT_().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnboardAccountTabEndpointExploreSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_ACCOUNT_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_ACCOUNT_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ACCOUNT_NAME_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_ENDPOINT_TYPE_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_ENDPOINT_TYPE_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ENDPOINT_TYPE_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_ENDPOINT_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_ENDPOINT_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ENDPOINT_PCT_"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_CONTAINER_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_CONTAINER_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_CONTAINER_PCT_"));
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
