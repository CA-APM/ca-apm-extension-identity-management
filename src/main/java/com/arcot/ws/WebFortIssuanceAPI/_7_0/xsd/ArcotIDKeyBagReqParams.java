/**
 * ArcotIDKeyBagReqParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Common input that is required by all ArcotIDKeyBag operations.
 * 				userName - Name of the user.
 * 				orgName - Organization(Organization) to which the user belongs.
 * 				profileName - the identifier for the ArcotID profile to be used
 * for
 * 				the current transaction.If the profileName is not specified,
 * 				then the default profile will be applied.
 * 				elementSelection - to select the set of details to be returned
 * in the response.
 * 				additionalInput - Additional inputs.
 */
public class ArcotIDKeyBagReqParams  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.BaseIssuanceRequestType  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String orgName;

    private java.lang.String profileName;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection elementSelection;

    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput;

    public ArcotIDKeyBagReqParams() {
    }

    public ArcotIDKeyBagReqParams(
           java.lang.String clientTxnId,
           java.lang.String userName,
           java.lang.String orgName,
           java.lang.String profileName,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection elementSelection,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        super(
            clientTxnId);
        this.userName = userName;
        this.orgName = orgName;
        this.profileName = profileName;
        this.elementSelection = elementSelection;
        this.additionalInput = additionalInput;
    }


    /**
     * Gets the userName value for this ArcotIDKeyBagReqParams.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ArcotIDKeyBagReqParams.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the orgName value for this ArcotIDKeyBagReqParams.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this ArcotIDKeyBagReqParams.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the profileName value for this ArcotIDKeyBagReqParams.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this ArcotIDKeyBagReqParams.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the elementSelection value for this ArcotIDKeyBagReqParams.
     * 
     * @return elementSelection
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection getElementSelection() {
        return elementSelection;
    }


    /**
     * Sets the elementSelection value for this ArcotIDKeyBagReqParams.
     * 
     * @param elementSelection
     */
    public void setElementSelection(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.ArcotIDKeyBagElementSelection elementSelection) {
        this.elementSelection = elementSelection;
    }


    /**
     * Gets the additionalInput value for this ArcotIDKeyBagReqParams.
     * 
     * @return additionalInput
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] getAdditionalInput() {
        return additionalInput;
    }


    /**
     * Sets the additionalInput value for this ArcotIDKeyBagReqParams.
     * 
     * @param additionalInput
     */
    public void setAdditionalInput(com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] additionalInput) {
        this.additionalInput = additionalInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotIDKeyBagReqParams)) return false;
        ArcotIDKeyBagReqParams other = (ArcotIDKeyBagReqParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.elementSelection==null && other.getElementSelection()==null) || 
             (this.elementSelection!=null &&
              this.elementSelection.equals(other.getElementSelection()))) &&
            ((this.additionalInput==null && other.getAdditionalInput()==null) || 
             (this.additionalInput!=null &&
              java.util.Arrays.equals(this.additionalInput, other.getAdditionalInput())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getElementSelection() != null) {
            _hashCode += getElementSelection().hashCode();
        }
        if (getAdditionalInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInput(), i);
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
        new org.apache.axis.description.TypeDesc(ArcotIDKeyBagReqParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagReqParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "elementSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "ArcotIDKeyBagElementSelection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "additionalInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "PairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "pairs"));
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
