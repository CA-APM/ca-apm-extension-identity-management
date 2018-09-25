/**
 * UserFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * 1) If includeImage is set to true, user's image information is
 * also retrieved if present.
 * 			  2) If includeAccounts is set is true, user account information
 * is also retrieved if present.
 * 		      3) If deepSearch is set to true, the given user identifier
 * is first searched against UserName; 
 * 		      	 On no match, it would search against AccountID; On no match
 * it would further search against AccountIDAttribute.
 * 		         If deepSearch is set to false, search will be restricted
 * to UserName.
 */
public class UserFilterType  extends com.arcot.ws.UserSchema._1_0.UserBaseFilterType  implements java.io.Serializable {
    private java.lang.Boolean deepSearch;

    public UserFilterType() {
    }

    public UserFilterType(
           java.lang.Boolean includeImage,
           java.lang.Boolean includeAccounts,
           java.lang.Boolean deepSearch) {
        super(
            includeImage,
            includeAccounts);
        this.deepSearch = deepSearch;
    }


    /**
     * Gets the deepSearch value for this UserFilterType.
     * 
     * @return deepSearch
     */
    public java.lang.Boolean getDeepSearch() {
        return deepSearch;
    }


    /**
     * Sets the deepSearch value for this UserFilterType.
     * 
     * @param deepSearch
     */
    public void setDeepSearch(java.lang.Boolean deepSearch) {
        this.deepSearch = deepSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFilterType)) return false;
        UserFilterType other = (UserFilterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deepSearch==null && other.getDeepSearch()==null) || 
             (this.deepSearch!=null &&
              this.deepSearch.equals(other.getDeepSearch())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDeepSearch() != null) {
            _hashCode += getDeepSearch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserFilterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deepSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "deepSearch"));
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
