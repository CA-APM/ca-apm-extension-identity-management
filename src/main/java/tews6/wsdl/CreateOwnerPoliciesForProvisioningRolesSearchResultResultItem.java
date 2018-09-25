/**
 * CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemFriendlyName friendlyName;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDescription description;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemComments comments;

    private tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDepartment department;

    public CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem() {
    }

    public CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemFriendlyName friendlyName,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDescription description,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemComments comments,
           tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDepartment department) {
           this.OID = OID;
           this.friendlyName = friendlyName;
           this.description = description;
           this.comments = comments;
           this.department = department;
    }


    /**
     * Gets the OID value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the friendlyName value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @return friendlyName
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemFriendlyName getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemFriendlyName friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the description value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @return description
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @param description
     */
    public void setDescription(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDescription description) {
        this.description = description;
    }


    /**
     * Gets the comments value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @return comments
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemComments getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @param comments
     */
    public void setComments(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemComments comments) {
        this.comments = comments;
    }


    /**
     * Gets the department value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @return department
     */
    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDepartment getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.
     * 
     * @param department
     */
    public void setDepartment(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDepartment department) {
        this.department = department;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem)) return false;
        CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem other = (CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem) obj;
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
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment())));
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
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "friendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>friendlyName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>description"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>comments"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>department"));
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
