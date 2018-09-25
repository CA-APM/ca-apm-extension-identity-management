/**
 * OrgDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * OrgDetails is the structure used to represent
 * 				the
 * 				organization details.
 */
public class OrgDetails  implements java.io.Serializable {
    /* Organization name. */
    private java.lang.String orgName;

    /* isGlobal represents the global organization. If this element
     * is
     * 	                    exist then server will consider the organization
     * is global organization,
     * 	                    otherwise organization name will be taken from
     * orgName. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetailsIsGlobal isGlobal;

    public OrgDetails() {
    }

    public OrgDetails(
           java.lang.String orgName,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetailsIsGlobal isGlobal) {
           this.orgName = orgName;
           this.isGlobal = isGlobal;
    }


    /**
     * Gets the orgName value for this OrgDetails.
     * 
     * @return orgName   * Organization name.
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this OrgDetails.
     * 
     * @param orgName   * Organization name.
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the isGlobal value for this OrgDetails.
     * 
     * @return isGlobal   * isGlobal represents the global organization. If this element
     * is
     * 	                    exist then server will consider the organization
     * is global organization,
     * 	                    otherwise organization name will be taken from
     * orgName.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetailsIsGlobal getIsGlobal() {
        return isGlobal;
    }


    /**
     * Sets the isGlobal value for this OrgDetails.
     * 
     * @param isGlobal   * isGlobal represents the global organization. If this element
     * is
     * 	                    exist then server will consider the organization
     * is global organization,
     * 	                    otherwise organization name will be taken from
     * orgName.
     */
    public void setIsGlobal(com.arcot.ws.WebFortCommonAPI._7_0.xsd.OrgDetailsIsGlobal isGlobal) {
        this.isGlobal = isGlobal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgDetails)) return false;
        OrgDetails other = (OrgDetails) obj;
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
            ((this.isGlobal==null && other.getIsGlobal()==null) || 
             (this.isGlobal!=null &&
              this.isGlobal.equals(other.getIsGlobal())));
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
        if (getIsGlobal() != null) {
            _hashCode += getIsGlobal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "OrgDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "isGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", ">OrgDetails>isGlobal"));
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
