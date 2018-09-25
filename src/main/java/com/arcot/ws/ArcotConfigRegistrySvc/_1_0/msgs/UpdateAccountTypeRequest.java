/**
 * UpdateAccountTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs;

public class UpdateAccountTypeRequest  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String displayName;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    private java.lang.String[] removeCustomAttribute;

    private java.lang.Boolean targetAllOrgs;

    /* This element contains the list of organization-AccountType
     * associations. The list of account type custom attributes for an organization
     * are completely overwritten.
     * 								To add a new custom attribute, one must pass the existing
     * custom attributes along with new custom attributes. */
    private com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations;

    private java.lang.String[] removeOrganizations;

    private java.lang.String clientTxId;

    public UpdateAccountTypeRequest() {
    }

    public UpdateAccountTypeRequest(
           java.lang.String name,
           java.lang.String displayName,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute,
           java.lang.String[] removeCustomAttribute,
           java.lang.Boolean targetAllOrgs,
           com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations,
           java.lang.String[] removeOrganizations,
           java.lang.String clientTxId) {
           this.name = name;
           this.displayName = displayName;
           this.customAttribute = customAttribute;
           this.removeCustomAttribute = removeCustomAttribute;
           this.targetAllOrgs = targetAllOrgs;
           this.listOfOrganizations = listOfOrganizations;
           this.removeOrganizations = removeOrganizations;
           this.clientTxId = clientTxId;
    }


    /**
     * Gets the name value for this UpdateAccountTypeRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UpdateAccountTypeRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this UpdateAccountTypeRequest.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UpdateAccountTypeRequest.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the customAttribute value for this UpdateAccountTypeRequest.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this UpdateAccountTypeRequest.
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
     * Gets the removeCustomAttribute value for this UpdateAccountTypeRequest.
     * 
     * @return removeCustomAttribute
     */
    public java.lang.String[] getRemoveCustomAttribute() {
        return removeCustomAttribute;
    }


    /**
     * Sets the removeCustomAttribute value for this UpdateAccountTypeRequest.
     * 
     * @param removeCustomAttribute
     */
    public void setRemoveCustomAttribute(java.lang.String[] removeCustomAttribute) {
        this.removeCustomAttribute = removeCustomAttribute;
    }

    public java.lang.String getRemoveCustomAttribute(int i) {
        return this.removeCustomAttribute[i];
    }

    public void setRemoveCustomAttribute(int i, java.lang.String _value) {
        this.removeCustomAttribute[i] = _value;
    }


    /**
     * Gets the targetAllOrgs value for this UpdateAccountTypeRequest.
     * 
     * @return targetAllOrgs
     */
    public java.lang.Boolean getTargetAllOrgs() {
        return targetAllOrgs;
    }


    /**
     * Sets the targetAllOrgs value for this UpdateAccountTypeRequest.
     * 
     * @param targetAllOrgs
     */
    public void setTargetAllOrgs(java.lang.Boolean targetAllOrgs) {
        this.targetAllOrgs = targetAllOrgs;
    }


    /**
     * Gets the listOfOrganizations value for this UpdateAccountTypeRequest.
     * 
     * @return listOfOrganizations   * This element contains the list of organization-AccountType
     * associations. The list of account type custom attributes for an organization
     * are completely overwritten.
     * 								To add a new custom attribute, one must pass the existing
     * custom attributes along with new custom attributes.
     */
    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] getListOfOrganizations() {
        return listOfOrganizations;
    }


    /**
     * Sets the listOfOrganizations value for this UpdateAccountTypeRequest.
     * 
     * @param listOfOrganizations   * This element contains the list of organization-AccountType
     * associations. The list of account type custom attributes for an organization
     * are completely overwritten.
     * 								To add a new custom attribute, one must pass the existing
     * custom attributes along with new custom attributes.
     */
    public void setListOfOrganizations(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[] listOfOrganizations) {
        this.listOfOrganizations = listOfOrganizations;
    }


    /**
     * Gets the removeOrganizations value for this UpdateAccountTypeRequest.
     * 
     * @return removeOrganizations
     */
    public java.lang.String[] getRemoveOrganizations() {
        return removeOrganizations;
    }


    /**
     * Sets the removeOrganizations value for this UpdateAccountTypeRequest.
     * 
     * @param removeOrganizations
     */
    public void setRemoveOrganizations(java.lang.String[] removeOrganizations) {
        this.removeOrganizations = removeOrganizations;
    }


    /**
     * Gets the clientTxId value for this UpdateAccountTypeRequest.
     * 
     * @return clientTxId
     */
    public java.lang.String getClientTxId() {
        return clientTxId;
    }


    /**
     * Sets the clientTxId value for this UpdateAccountTypeRequest.
     * 
     * @param clientTxId
     */
    public void setClientTxId(java.lang.String clientTxId) {
        this.clientTxId = clientTxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAccountTypeRequest)) return false;
        UpdateAccountTypeRequest other = (UpdateAccountTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute()))) &&
            ((this.removeCustomAttribute==null && other.getRemoveCustomAttribute()==null) || 
             (this.removeCustomAttribute!=null &&
              java.util.Arrays.equals(this.removeCustomAttribute, other.getRemoveCustomAttribute()))) &&
            ((this.targetAllOrgs==null && other.getTargetAllOrgs()==null) || 
             (this.targetAllOrgs!=null &&
              this.targetAllOrgs.equals(other.getTargetAllOrgs()))) &&
            ((this.listOfOrganizations==null && other.getListOfOrganizations()==null) || 
             (this.listOfOrganizations!=null &&
              java.util.Arrays.equals(this.listOfOrganizations, other.getListOfOrganizations()))) &&
            ((this.removeOrganizations==null && other.getRemoveOrganizations()==null) || 
             (this.removeOrganizations!=null &&
              java.util.Arrays.equals(this.removeOrganizations, other.getRemoveOrganizations()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
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
        if (getRemoveCustomAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveCustomAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveCustomAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetAllOrgs() != null) {
            _hashCode += getTargetAllOrgs().hashCode();
        }
        if (getListOfOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfOrganizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveOrganizations(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateAccountTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">updateAccountTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeCustomAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeCustomAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAllOrgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAllOrgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListOfOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "AccountCustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Organization"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "orgName"));
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
