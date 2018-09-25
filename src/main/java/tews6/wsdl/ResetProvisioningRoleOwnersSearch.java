/**
 * ResetProvisioningRoleOwnersSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ResetProvisioningRoleOwnersSearch  implements java.io.Serializable {
    private java.lang.Boolean createCopy;

    private java.lang.Boolean createNew;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject[] subject;

    private tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter[] filter;

    public ResetProvisioningRoleOwnersSearch() {
    }

    public ResetProvisioningRoleOwnersSearch(
           java.lang.Boolean createCopy,
           java.lang.Boolean createNew,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject[] subject,
           tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter[] filter) {
           this.createCopy = createCopy;
           this.createNew = createNew;
           this.subject = subject;
           this.filter = filter;
    }


    /**
     * Gets the createCopy value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @return createCopy
     */
    public java.lang.Boolean getCreateCopy() {
        return createCopy;
    }


    /**
     * Sets the createCopy value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @param createCopy
     */
    public void setCreateCopy(java.lang.Boolean createCopy) {
        this.createCopy = createCopy;
    }


    /**
     * Gets the createNew value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @return createNew
     */
    public java.lang.Boolean getCreateNew() {
        return createNew;
    }


    /**
     * Sets the createNew value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @param createNew
     */
    public void setCreateNew(java.lang.Boolean createNew) {
        this.createNew = createNew;
    }


    /**
     * Gets the subject value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @return subject
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject[] getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @param subject
     */
    public void setSubject(tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject[] subject) {
        this.subject = subject;
    }

    public tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject _value) {
        this.subject[i] = _value;
    }


    /**
     * Gets the filter value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @return filter
     */
    public tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this ResetProvisioningRoleOwnersSearch.
     * 
     * @param filter
     */
    public void setFilter(tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter[] filter) {
        this.filter = filter;
    }

    public tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter _value) {
        this.filter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetProvisioningRoleOwnersSearch)) return false;
        ResetProvisioningRoleOwnersSearch other = (ResetProvisioningRoleOwnersSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createCopy==null && other.getCreateCopy()==null) || 
             (this.createCopy!=null &&
              this.createCopy.equals(other.getCreateCopy()))) &&
            ((this.createNew==null && other.getCreateNew()==null) || 
             (this.createNew!=null &&
              this.createNew.equals(other.getCreateNew()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              java.util.Arrays.equals(this.subject, other.getSubject()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter())));
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
        if (getCreateCopy() != null) {
            _hashCode += getCreateCopy().hashCode();
        }
        if (getCreateNew() != null) {
            _hashCode += getCreateNew().hashCode();
        }
        if (getSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetProvisioningRoleOwnersSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createNew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearch>Subject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearch>Filter"));
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
