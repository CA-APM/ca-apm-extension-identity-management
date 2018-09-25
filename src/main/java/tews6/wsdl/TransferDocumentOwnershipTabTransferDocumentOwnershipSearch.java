/**
 * TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class TransferDocumentOwnershipTabTransferDocumentOwnershipSearch  implements java.io.Serializable {
    private tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchSubject subject;

    private tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchOrganization organization;

    private tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter[] filter;

    public TransferDocumentOwnershipTabTransferDocumentOwnershipSearch() {
    }

    public TransferDocumentOwnershipTabTransferDocumentOwnershipSearch(
           tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchSubject subject,
           tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchOrganization organization,
           tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter[] filter) {
           this.subject = subject;
           this.organization = organization;
           this.filter = filter;
    }


    /**
     * Gets the subject value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @return subject
     */
    public tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchSubject getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @param subject
     */
    public void setSubject(tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchSubject subject) {
        this.subject = subject;
    }


    /**
     * Gets the organization value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @return organization
     */
    public tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchOrganization getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @param organization
     */
    public void setOrganization(tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchOrganization organization) {
        this.organization = organization;
    }


    /**
     * Gets the filter value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @return filter
     */
    public tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.
     * 
     * @param filter
     */
    public void setFilter(tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter[] filter) {
        this.filter = filter;
    }

    public tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter _value) {
        this.filter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferDocumentOwnershipTabTransferDocumentOwnershipSearch)) return false;
        TransferDocumentOwnershipTabTransferDocumentOwnershipSearch other = (TransferDocumentOwnershipTabTransferDocumentOwnershipSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
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
        new org.apache.axis.description.TypeDesc(TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Subject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Organization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Filter"));
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
