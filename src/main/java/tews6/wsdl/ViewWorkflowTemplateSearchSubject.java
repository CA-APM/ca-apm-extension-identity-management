/**
 * ViewWorkflowTemplateSearchSubject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewWorkflowTemplateSearchSubject  implements java.io.Serializable {
    private java.lang.String uniqueName;

    private java.lang.String name;

    private java.lang.String friendlyName;

    private java.lang.String tag;

    private java.lang.String OID;

    private java.lang.Boolean check;

    private java.math.BigInteger index;  // attribute

    public ViewWorkflowTemplateSearchSubject() {
    }

    public ViewWorkflowTemplateSearchSubject(
           java.lang.String uniqueName,
           java.lang.String name,
           java.lang.String friendlyName,
           java.lang.String tag,
           java.lang.String OID,
           java.lang.Boolean check,
           java.math.BigInteger index) {
           this.uniqueName = uniqueName;
           this.name = name;
           this.friendlyName = friendlyName;
           this.tag = tag;
           this.OID = OID;
           this.check = check;
           this.index = index;
    }


    /**
     * Gets the uniqueName value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the name value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the friendlyName value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the tag value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }


    /**
     * Gets the OID value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the check value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return check
     */
    public java.lang.Boolean getCheck() {
        return check;
    }


    /**
     * Sets the check value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param check
     */
    public void setCheck(java.lang.Boolean check) {
        this.check = check;
    }


    /**
     * Gets the index value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @return index
     */
    public java.math.BigInteger getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ViewWorkflowTemplateSearchSubject.
     * 
     * @param index
     */
    public void setIndex(java.math.BigInteger index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewWorkflowTemplateSearchSubject)) return false;
        ViewWorkflowTemplateSearchSubject other = (ViewWorkflowTemplateSearchSubject) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.OID==null && other.getOID()==null) || 
             (this.OID!=null &&
              this.OID.equals(other.getOID()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getOID() != null) {
            _hashCode += getOID().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewWorkflowTemplateSearchSubject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearch>Subject"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UniqueName"));
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
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "FriendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "OID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
