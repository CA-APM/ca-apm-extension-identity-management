/**
 * ResetProvisioningRoleOwnersSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetProvisioningRoleOwnersSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemFriendlyName friendlyName;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDescription description;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemComments comments;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDepartment department;

    public ResetProvisioningRoleOwnersSearchResultResultItem() {
    }

    public ResetProvisioningRoleOwnersSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemFriendlyName friendlyName,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDescription description,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemComments comments,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDepartment department) {
           this.OID = OID;
           this.friendlyName = friendlyName;
           this.description = description;
           this.comments = comments;
           this.department = department;
    }


    /**
     * Gets the OID value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the friendlyName value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @return friendlyName
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemFriendlyName getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemFriendlyName friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the description value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @return description
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @param description
     */
    public void setDescription(tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDescription description) {
        this.description = description;
    }


    /**
     * Gets the comments value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @return comments
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemComments getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @param comments
     */
    public void setComments(tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemComments comments) {
        this.comments = comments;
    }


    /**
     * Gets the department value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @return department
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDepartment getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ResetProvisioningRoleOwnersSearchResultResultItem.
     * 
     * @param department
     */
    public void setDepartment(tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDepartment department) {
        this.department = department;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetProvisioningRoleOwnersSearchResultResultItem)) return false;
        ResetProvisioningRoleOwnersSearchResultResultItem other = (ResetProvisioningRoleOwnersSearchResultResultItem) obj;
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
        new org.apache.axis.description.TypeDesc(ResetProvisioningRoleOwnersSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "friendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>friendlyName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>description"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>comments"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>department"));
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
