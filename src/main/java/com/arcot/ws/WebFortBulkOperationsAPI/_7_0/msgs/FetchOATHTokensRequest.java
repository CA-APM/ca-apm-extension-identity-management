/**
 * FetchOATHTokensRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortBulkOperationsAPI._7_0.msgs;

public class FetchOATHTokensRequest  extends com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.BaseBulkOperationsRequestType  implements java.io.Serializable {
    private java.lang.Boolean fetchGlobal;

    private java.lang.String[] orgList;

    /* Wild cards like *,. are allowed. */
    private java.lang.String tokenID;

    private java.lang.String batchID;

    private com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.TokenStatusFilterType tokenStatusFilter;

    public FetchOATHTokensRequest() {
    }

    public FetchOATHTokensRequest(
           java.lang.String clientTxnId,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput,
           java.lang.Boolean fetchGlobal,
           java.lang.String[] orgList,
           java.lang.String tokenID,
           java.lang.String batchID,
           com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.TokenStatusFilterType tokenStatusFilter) {
        super(
            clientTxnId,
            additionalInput);
        this.fetchGlobal = fetchGlobal;
        this.orgList = orgList;
        this.tokenID = tokenID;
        this.batchID = batchID;
        this.tokenStatusFilter = tokenStatusFilter;
    }


    /**
     * Gets the fetchGlobal value for this FetchOATHTokensRequest.
     * 
     * @return fetchGlobal
     */
    public java.lang.Boolean getFetchGlobal() {
        return fetchGlobal;
    }


    /**
     * Sets the fetchGlobal value for this FetchOATHTokensRequest.
     * 
     * @param fetchGlobal
     */
    public void setFetchGlobal(java.lang.Boolean fetchGlobal) {
        this.fetchGlobal = fetchGlobal;
    }


    /**
     * Gets the orgList value for this FetchOATHTokensRequest.
     * 
     * @return orgList
     */
    public java.lang.String[] getOrgList() {
        return orgList;
    }


    /**
     * Sets the orgList value for this FetchOATHTokensRequest.
     * 
     * @param orgList
     */
    public void setOrgList(java.lang.String[] orgList) {
        this.orgList = orgList;
    }

    public java.lang.String getOrgList(int i) {
        return this.orgList[i];
    }

    public void setOrgList(int i, java.lang.String _value) {
        this.orgList[i] = _value;
    }


    /**
     * Gets the tokenID value for this FetchOATHTokensRequest.
     * 
     * @return tokenID   * Wild cards like *,. are allowed.
     */
    public java.lang.String getTokenID() {
        return tokenID;
    }


    /**
     * Sets the tokenID value for this FetchOATHTokensRequest.
     * 
     * @param tokenID   * Wild cards like *,. are allowed.
     */
    public void setTokenID(java.lang.String tokenID) {
        this.tokenID = tokenID;
    }


    /**
     * Gets the batchID value for this FetchOATHTokensRequest.
     * 
     * @return batchID
     */
    public java.lang.String getBatchID() {
        return batchID;
    }


    /**
     * Sets the batchID value for this FetchOATHTokensRequest.
     * 
     * @param batchID
     */
    public void setBatchID(java.lang.String batchID) {
        this.batchID = batchID;
    }


    /**
     * Gets the tokenStatusFilter value for this FetchOATHTokensRequest.
     * 
     * @return tokenStatusFilter
     */
    public com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.TokenStatusFilterType getTokenStatusFilter() {
        return tokenStatusFilter;
    }


    /**
     * Sets the tokenStatusFilter value for this FetchOATHTokensRequest.
     * 
     * @param tokenStatusFilter
     */
    public void setTokenStatusFilter(com.arcot.ws.WebFortBulkOperationsAPI._7_0.xsd.TokenStatusFilterType tokenStatusFilter) {
        this.tokenStatusFilter = tokenStatusFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchOATHTokensRequest)) return false;
        FetchOATHTokensRequest other = (FetchOATHTokensRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fetchGlobal==null && other.getFetchGlobal()==null) || 
             (this.fetchGlobal!=null &&
              this.fetchGlobal.equals(other.getFetchGlobal()))) &&
            ((this.orgList==null && other.getOrgList()==null) || 
             (this.orgList!=null &&
              java.util.Arrays.equals(this.orgList, other.getOrgList()))) &&
            ((this.tokenID==null && other.getTokenID()==null) || 
             (this.tokenID!=null &&
              this.tokenID.equals(other.getTokenID()))) &&
            ((this.batchID==null && other.getBatchID()==null) || 
             (this.batchID!=null &&
              this.batchID.equals(other.getBatchID()))) &&
            ((this.tokenStatusFilter==null && other.getTokenStatusFilter()==null) || 
             (this.tokenStatusFilter!=null &&
              this.tokenStatusFilter.equals(other.getTokenStatusFilter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFetchGlobal() != null) {
            _hashCode += getFetchGlobal().hashCode();
        }
        if (getOrgList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTokenID() != null) {
            _hashCode += getTokenID().hashCode();
        }
        if (getBatchID() != null) {
            _hashCode += getBatchID().hashCode();
        }
        if (getTokenStatusFilter() != null) {
            _hashCode += getTokenStatusFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchOATHTokensRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", ">FetchOATHTokensRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "fetchGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "orgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "tokenID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "batchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenStatusFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/msgs", "tokenStatusFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortBulkOperationsAPI/7.0/xsd", "TokenStatusFilterType"));
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
