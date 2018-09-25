/**
 * UpdateOrgRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotUserRegistryMgmtSvc._1_0.msgs;

public class UpdateOrgRequest  implements java.io.Serializable {
    private java.lang.String orgName;

    private com.arcot.ws.UserSchema._1_0.OrgStatusType status;

    private java.lang.String displayName;

    private com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails;

    private com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] mappingDetails;

    private java.lang.String description;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    private java.lang.String clientTxId;

    public UpdateOrgRequest() {
    }

    public UpdateOrgRequest(
           java.lang.String orgName,
           com.arcot.ws.UserSchema._1_0.OrgStatusType status,
           java.lang.String displayName,
           com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails,
           com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] mappingDetails,
           java.lang.String description,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute,
           java.lang.String clientTxId) {
           this.orgName = orgName;
           this.status = status;
           this.displayName = displayName;
           this.repositoryDetails = repositoryDetails;
           this.mappingDetails = mappingDetails;
           this.description = description;
           this.customAttribute = customAttribute;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the orgName value for this UpdateOrgRequest.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this UpdateOrgRequest.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the status value for this UpdateOrgRequest.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.OrgStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateOrgRequest.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.OrgStatusType status) {
        this.status = status;
    }


    /**
     * Gets the displayName value for this UpdateOrgRequest.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UpdateOrgRequest.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the repositoryDetails value for this UpdateOrgRequest.
     * 
     * @return repositoryDetails
     */
    public com.arcot.ws.UserSchema._1_0.RepositoryDetailsType getRepositoryDetails() {
        return repositoryDetails;
    }


    /**
     * Sets the repositoryDetails value for this UpdateOrgRequest.
     * 
     * @param repositoryDetails
     */
    public void setRepositoryDetails(com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails) {
        this.repositoryDetails = repositoryDetails;
    }


    /**
     * Gets the mappingDetails value for this UpdateOrgRequest.
     * 
     * @return mappingDetails
     */
    public com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] getMappingDetails() {
        return mappingDetails;
    }


    /**
     * Sets the mappingDetails value for this UpdateOrgRequest.
     * 
     * @param mappingDetails
     */
    public void setMappingDetails(com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] mappingDetails) {
        this.mappingDetails = mappingDetails;
    }


    /**
     * Gets the description value for this UpdateOrgRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateOrgRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the customAttribute value for this UpdateOrgRequest.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this UpdateOrgRequest.
     * 
     * @param customAttribute
     */
    public void setCustomAttribute(com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute) {
        this.customAttribute = customAttribute;
    }

    public com.arcot.ws.UserSchema._1_0.CustomAttributeType getCustomAttribute(int i) {
        return this.customAttribute[i];
    }

    public void setCustomAttribute(int i, com.arcot.ws.UserSchema._1_0.CustomAttributeType _value) {
        this.customAttribute[i] = _value;
    }


    /**
     * Gets the clientTxId value for this UpdateOrgRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this UpdateOrgRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrgRequest)) return false;
        UpdateOrgRequest other = (UpdateOrgRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.repositoryDetails==null && other.getRepositoryDetails()==null) || 
             (this.repositoryDetails!=null &&
              this.repositoryDetails.equals(other.getRepositoryDetails()))) &&
            ((this.mappingDetails==null && other.getMappingDetails()==null) || 
             (this.mappingDetails!=null &&
              java.util.Arrays.equals(this.mappingDetails, other.getMappingDetails()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute()))) &&
            ((this.clientTxId==null && other.getClientTxId()==null) || 
             (this.clientTxId!=null &&
              this.clientTxId.equals(other.getClientTxId())));
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
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getRepositoryDetails() != null) {
            _hashCode += getRepositoryDetails().hashCode();
        }
        if (getMappingDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappingDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappingDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCustomAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientTxId() != null) {
            _hashCode += getClientTxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrgRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotUserRegistryMgmtSvc/1.0/msgs", ">updateOrgRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrgStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositoryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">AttributeMappingsType>mapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "mapping"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
