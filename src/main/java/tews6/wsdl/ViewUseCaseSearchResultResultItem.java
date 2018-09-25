/**
 * ViewUseCaseSearchResultResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUseCaseSearchResultResultItem  implements java.io.Serializable {
    private java.lang.String OID;

    private tews6.wsdl.ViewUseCaseSearchResultResultItemName name;

    private tews6.wsdl.ViewUseCaseSearchResultResultItemTag tag;

    private tews6.wsdl.ViewUseCaseSearchResultResultItemCategory category;

    private tews6.wsdl.ViewUseCaseSearchResultResultItemStatus status;

    private tews6.wsdl.ViewUseCaseSearchResultResultItemDefinitionId definitionId;

    public ViewUseCaseSearchResultResultItem() {
    }

    public ViewUseCaseSearchResultResultItem(
           java.lang.String OID,
           tews6.wsdl.ViewUseCaseSearchResultResultItemName name,
           tews6.wsdl.ViewUseCaseSearchResultResultItemTag tag,
           tews6.wsdl.ViewUseCaseSearchResultResultItemCategory category,
           tews6.wsdl.ViewUseCaseSearchResultResultItemStatus status,
           tews6.wsdl.ViewUseCaseSearchResultResultItemDefinitionId definitionId) {
           this.OID = OID;
           this.name = name;
           this.tag = tag;
           this.category = category;
           this.status = status;
           this.definitionId = definitionId;
    }


    /**
     * Gets the OID value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the name value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return name
     */
    public tews6.wsdl.ViewUseCaseSearchResultResultItemName getName() {
        return name;
    }


    /**
     * Sets the name value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param name
     */
    public void setName(tews6.wsdl.ViewUseCaseSearchResultResultItemName name) {
        this.name = name;
    }


    /**
     * Gets the tag value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return tag
     */
    public tews6.wsdl.ViewUseCaseSearchResultResultItemTag getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param tag
     */
    public void setTag(tews6.wsdl.ViewUseCaseSearchResultResultItemTag tag) {
        this.tag = tag;
    }


    /**
     * Gets the category value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return category
     */
    public tews6.wsdl.ViewUseCaseSearchResultResultItemCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param category
     */
    public void setCategory(tews6.wsdl.ViewUseCaseSearchResultResultItemCategory category) {
        this.category = category;
    }


    /**
     * Gets the status value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return status
     */
    public tews6.wsdl.ViewUseCaseSearchResultResultItemStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param status
     */
    public void setStatus(tews6.wsdl.ViewUseCaseSearchResultResultItemStatus status) {
        this.status = status;
    }


    /**
     * Gets the definitionId value for this ViewUseCaseSearchResultResultItem.
     * 
     * @return definitionId
     */
    public tews6.wsdl.ViewUseCaseSearchResultResultItemDefinitionId getDefinitionId() {
        return definitionId;
    }


    /**
     * Sets the definitionId value for this ViewUseCaseSearchResultResultItem.
     * 
     * @param definitionId
     */
    public void setDefinitionId(tews6.wsdl.ViewUseCaseSearchResultResultItemDefinitionId definitionId) {
        this.definitionId = definitionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUseCaseSearchResultResultItem)) return false;
        ViewUseCaseSearchResultResultItem other = (ViewUseCaseSearchResultResultItem) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.definitionId==null && other.getDefinitionId()==null) || 
             (this.definitionId!=null &&
              this.definitionId.equals(other.getDefinitionId())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDefinitionId() != null) {
            _hashCode += getDefinitionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewUseCaseSearchResultResultItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearchResult>ResultItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>tag"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>category"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "definitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>definitionId"));
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
