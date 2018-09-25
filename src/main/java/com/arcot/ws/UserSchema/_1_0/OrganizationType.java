/**
 * OrganizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * Organization details.
 */
public class OrganizationType  implements java.io.Serializable {
    private java.lang.String orgName;

    private java.lang.String displayName;

    private com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails;

    private com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] attributeMappings;

    private java.util.Calendar dateCreated;

    private java.util.Calendar dateModified;

    private java.lang.String description;

    private com.arcot.ws.UserSchema._1_0.OrgStatusType status;

    private java.lang.String preferredLocale;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    public OrganizationType() {
    }

    public OrganizationType(
           java.lang.String orgName,
           java.lang.String displayName,
           com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails,
           com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] attributeMappings,
           java.util.Calendar dateCreated,
           java.util.Calendar dateModified,
           java.lang.String description,
           com.arcot.ws.UserSchema._1_0.OrgStatusType status,
           java.lang.String preferredLocale,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute) {
           this.orgName = orgName;
           this.displayName = displayName;
           this.repositoryDetails = repositoryDetails;
           this.attributeMappings = attributeMappings;
           this.dateCreated = dateCreated;
           this.dateModified = dateModified;
           this.description = description;
           this.status = status;
           this.preferredLocale = preferredLocale;
           this.customAttribute = customAttribute;
    }


    /**
     * Gets the orgName value for this OrganizationType.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this OrganizationType.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the displayName value for this OrganizationType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this OrganizationType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the repositoryDetails value for this OrganizationType.
     * 
     * @return repositoryDetails
     */
    public com.arcot.ws.UserSchema._1_0.RepositoryDetailsType getRepositoryDetails() {
        return repositoryDetails;
    }


    /**
     * Sets the repositoryDetails value for this OrganizationType.
     * 
     * @param repositoryDetails
     */
    public void setRepositoryDetails(com.arcot.ws.UserSchema._1_0.RepositoryDetailsType repositoryDetails) {
        this.repositoryDetails = repositoryDetails;
    }


    /**
     * Gets the attributeMappings value for this OrganizationType.
     * 
     * @return attributeMappings
     */
    public com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] getAttributeMappings() {
        return attributeMappings;
    }


    /**
     * Sets the attributeMappings value for this OrganizationType.
     * 
     * @param attributeMappings
     */
    public void setAttributeMappings(com.arcot.ws.UserSchema._1_0.AttributeMappingsTypeMapping[] attributeMappings) {
        this.attributeMappings = attributeMappings;
    }


    /**
     * Gets the dateCreated value for this OrganizationType.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OrganizationType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateModified value for this OrganizationType.
     * 
     * @return dateModified
     */
    public java.util.Calendar getDateModified() {
        return dateModified;
    }


    /**
     * Sets the dateModified value for this OrganizationType.
     * 
     * @param dateModified
     */
    public void setDateModified(java.util.Calendar dateModified) {
        this.dateModified = dateModified;
    }


    /**
     * Gets the description value for this OrganizationType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrganizationType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this OrganizationType.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.OrgStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrganizationType.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.OrgStatusType status) {
        this.status = status;
    }


    /**
     * Gets the preferredLocale value for this OrganizationType.
     * 
     * @return preferredLocale
     */
    public java.lang.String getPreferredLocale() {
        return preferredLocale;
    }


    /**
     * Sets the preferredLocale value for this OrganizationType.
     * 
     * @param preferredLocale
     */
    public void setPreferredLocale(java.lang.String preferredLocale) {
        this.preferredLocale = preferredLocale;
    }


    /**
     * Gets the customAttribute value for this OrganizationType.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this OrganizationType.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationType)) return false;
        OrganizationType other = (OrganizationType) obj;
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
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.repositoryDetails==null && other.getRepositoryDetails()==null) || 
             (this.repositoryDetails!=null &&
              this.repositoryDetails.equals(other.getRepositoryDetails()))) &&
            ((this.attributeMappings==null && other.getAttributeMappings()==null) || 
             (this.attributeMappings!=null &&
              java.util.Arrays.equals(this.attributeMappings, other.getAttributeMappings()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateModified==null && other.getDateModified()==null) || 
             (this.dateModified!=null &&
              this.dateModified.equals(other.getDateModified()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.preferredLocale==null && other.getPreferredLocale()==null) || 
             (this.preferredLocale!=null &&
              this.preferredLocale.equals(other.getPreferredLocale()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getRepositoryDetails() != null) {
            _hashCode += getRepositoryDetails().hashCode();
        }
        if (getAttributeMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateModified() != null) {
            _hashCode += getDateModified().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPreferredLocale() != null) {
            _hashCode += getPreferredLocale().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrganizationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "repositoryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "RepositoryDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "attributeMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">AttributeMappingsType>mapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "mapping"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "OrgStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "preferredLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
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
