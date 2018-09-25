/**
 * ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove  implements java.io.Serializable {
    private java.lang.String uniqueName;

    private java.lang.String UID;

    private java.lang.String name;

    private java.lang.String comments;

    private java.lang.String description;

    private java.lang.String department;

    private tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter[] filter;

    private int index;  // attribute

    public ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove() {
    }

    public ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove(
           java.lang.String uniqueName,
           java.lang.String UID,
           java.lang.String name,
           java.lang.String comments,
           java.lang.String description,
           java.lang.String department,
           tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter[] filter,
           int index) {
           this.uniqueName = uniqueName;
           this.UID = UID;
           this.name = name;
           this.comments = comments;
           this.description = description;
           this.department = department;
           this.filter = filter;
           this.index = index;
    }


    /**
     * Gets the uniqueName value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the UID value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the name value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the comments value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the description value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the department value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the filter value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return filter
     */
    public tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param filter
     */
    public void setFilter(tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter[] filter) {
        this.filter = filter;
    }

    public tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter _value) {
        this.filter[i] = _value;
    }


    /**
     * Gets the index value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove)) return false;
        ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove other = (ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
            this.index == other.getIndex();
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
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>remove"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>remove>Filter"));
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
