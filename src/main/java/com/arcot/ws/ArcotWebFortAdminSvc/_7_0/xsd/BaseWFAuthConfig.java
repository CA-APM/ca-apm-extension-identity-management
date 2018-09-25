/**
 * BaseWFAuthConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * BaseWFAuthConfig is base class of all admin policy
 * 				data structures.
 */
public class BaseWFAuthConfig  extends com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.BaseWFConfig  implements java.io.Serializable {
    /* Maximum number of unsuccessful authentications
     * 								tried by the user. */
    private java.lang.Integer maxStrikes;

    /* The number of days that are left to expire the
     * 								credential. */
    private java.lang.Long warningPeriod;

    /* The number of days that are left to fail the
     * 								authentication
     * 								of the credential after the expiry. */
    private java.lang.Long gracePeriod;

    /* The number of seconds that are left to unlock the
     * 								credential. */
    private java.lang.Long autoUnlockPeriod;

    /* User attributes that are need to be checked. */
    private com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck;

    /* Flag that indicates the match across usage
     * 								type. */
    private java.lang.Boolean matchAcrossUsageType;

    /* Usage type that need to be matched. */
    private java.lang.String usageTypeToMatch;

    /* The set of webfort response codes for which
     * 								alternate/additional processor will be invoked. */
    private com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions;

    public BaseWFAuthConfig() {
    }

    public BaseWFAuthConfig(
           java.lang.String name,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.ConfigStatus status,
           java.lang.Integer maxStrikes,
           java.lang.Long warningPeriod,
           java.lang.Long gracePeriod,
           java.lang.Long autoUnlockPeriod,
           com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck,
           java.lang.Boolean matchAcrossUsageType,
           java.lang.String usageTypeToMatch,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions) {
        super(
            name,
            status);
        this.maxStrikes = maxStrikes;
        this.warningPeriod = warningPeriod;
        this.gracePeriod = gracePeriod;
        this.autoUnlockPeriod = autoUnlockPeriod;
        this.userCheck = userCheck;
        this.matchAcrossUsageType = matchAcrossUsageType;
        this.usageTypeToMatch = usageTypeToMatch;
        this.adProcConditions = adProcConditions;
    }


    /**
     * Gets the maxStrikes value for this BaseWFAuthConfig.
     * 
     * @return maxStrikes   * Maximum number of unsuccessful authentications
     * 								tried by the user.
     */
    public java.lang.Integer getMaxStrikes() {
        return maxStrikes;
    }


    /**
     * Sets the maxStrikes value for this BaseWFAuthConfig.
     * 
     * @param maxStrikes   * Maximum number of unsuccessful authentications
     * 								tried by the user.
     */
    public void setMaxStrikes(java.lang.Integer maxStrikes) {
        this.maxStrikes = maxStrikes;
    }


    /**
     * Gets the warningPeriod value for this BaseWFAuthConfig.
     * 
     * @return warningPeriod   * The number of days that are left to expire the
     * 								credential.
     */
    public java.lang.Long getWarningPeriod() {
        return warningPeriod;
    }


    /**
     * Sets the warningPeriod value for this BaseWFAuthConfig.
     * 
     * @param warningPeriod   * The number of days that are left to expire the
     * 								credential.
     */
    public void setWarningPeriod(java.lang.Long warningPeriod) {
        this.warningPeriod = warningPeriod;
    }


    /**
     * Gets the gracePeriod value for this BaseWFAuthConfig.
     * 
     * @return gracePeriod   * The number of days that are left to fail the
     * 								authentication
     * 								of the credential after the expiry.
     */
    public java.lang.Long getGracePeriod() {
        return gracePeriod;
    }


    /**
     * Sets the gracePeriod value for this BaseWFAuthConfig.
     * 
     * @param gracePeriod   * The number of days that are left to fail the
     * 								authentication
     * 								of the credential after the expiry.
     */
    public void setGracePeriod(java.lang.Long gracePeriod) {
        this.gracePeriod = gracePeriod;
    }


    /**
     * Gets the autoUnlockPeriod value for this BaseWFAuthConfig.
     * 
     * @return autoUnlockPeriod   * The number of seconds that are left to unlock the
     * 								credential.
     */
    public java.lang.Long getAutoUnlockPeriod() {
        return autoUnlockPeriod;
    }


    /**
     * Sets the autoUnlockPeriod value for this BaseWFAuthConfig.
     * 
     * @param autoUnlockPeriod   * The number of seconds that are left to unlock the
     * 								credential.
     */
    public void setAutoUnlockPeriod(java.lang.Long autoUnlockPeriod) {
        this.autoUnlockPeriod = autoUnlockPeriod;
    }


    /**
     * Gets the userCheck value for this BaseWFAuthConfig.
     * 
     * @return userCheck   * User attributes that are need to be checked.
     */
    public com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck getUserCheck() {
        return userCheck;
    }


    /**
     * Sets the userCheck value for this BaseWFAuthConfig.
     * 
     * @param userCheck   * User attributes that are need to be checked.
     */
    public void setUserCheck(com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd.UserCheck userCheck) {
        this.userCheck = userCheck;
    }


    /**
     * Gets the matchAcrossUsageType value for this BaseWFAuthConfig.
     * 
     * @return matchAcrossUsageType   * Flag that indicates the match across usage
     * 								type.
     */
    public java.lang.Boolean getMatchAcrossUsageType() {
        return matchAcrossUsageType;
    }


    /**
     * Sets the matchAcrossUsageType value for this BaseWFAuthConfig.
     * 
     * @param matchAcrossUsageType   * Flag that indicates the match across usage
     * 								type.
     */
    public void setMatchAcrossUsageType(java.lang.Boolean matchAcrossUsageType) {
        this.matchAcrossUsageType = matchAcrossUsageType;
    }


    /**
     * Gets the usageTypeToMatch value for this BaseWFAuthConfig.
     * 
     * @return usageTypeToMatch   * Usage type that need to be matched.
     */
    public java.lang.String getUsageTypeToMatch() {
        return usageTypeToMatch;
    }


    /**
     * Sets the usageTypeToMatch value for this BaseWFAuthConfig.
     * 
     * @param usageTypeToMatch   * Usage type that need to be matched.
     */
    public void setUsageTypeToMatch(java.lang.String usageTypeToMatch) {
        this.usageTypeToMatch = usageTypeToMatch;
    }


    /**
     * Gets the adProcConditions value for this BaseWFAuthConfig.
     * 
     * @return adProcConditions   * The set of webfort response codes for which
     * 								alternate/additional processor will be invoked.
     */
    public com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList getAdProcConditions() {
        return adProcConditions;
    }


    /**
     * Sets the adProcConditions value for this BaseWFAuthConfig.
     * 
     * @param adProcConditions   * The set of webfort response codes for which
     * 								alternate/additional processor will be invoked.
     */
    public void setAdProcConditions(com.arcot.ws.WebFortCommonAPI._7_0.xsd.IntegerList adProcConditions) {
        this.adProcConditions = adProcConditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseWFAuthConfig)) return false;
        BaseWFAuthConfig other = (BaseWFAuthConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxStrikes==null && other.getMaxStrikes()==null) || 
             (this.maxStrikes!=null &&
              this.maxStrikes.equals(other.getMaxStrikes()))) &&
            ((this.warningPeriod==null && other.getWarningPeriod()==null) || 
             (this.warningPeriod!=null &&
              this.warningPeriod.equals(other.getWarningPeriod()))) &&
            ((this.gracePeriod==null && other.getGracePeriod()==null) || 
             (this.gracePeriod!=null &&
              this.gracePeriod.equals(other.getGracePeriod()))) &&
            ((this.autoUnlockPeriod==null && other.getAutoUnlockPeriod()==null) || 
             (this.autoUnlockPeriod!=null &&
              this.autoUnlockPeriod.equals(other.getAutoUnlockPeriod()))) &&
            ((this.userCheck==null && other.getUserCheck()==null) || 
             (this.userCheck!=null &&
              this.userCheck.equals(other.getUserCheck()))) &&
            ((this.matchAcrossUsageType==null && other.getMatchAcrossUsageType()==null) || 
             (this.matchAcrossUsageType!=null &&
              this.matchAcrossUsageType.equals(other.getMatchAcrossUsageType()))) &&
            ((this.usageTypeToMatch==null && other.getUsageTypeToMatch()==null) || 
             (this.usageTypeToMatch!=null &&
              this.usageTypeToMatch.equals(other.getUsageTypeToMatch()))) &&
            ((this.adProcConditions==null && other.getAdProcConditions()==null) || 
             (this.adProcConditions!=null &&
              this.adProcConditions.equals(other.getAdProcConditions())));
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
        if (getMaxStrikes() != null) {
            _hashCode += getMaxStrikes().hashCode();
        }
        if (getWarningPeriod() != null) {
            _hashCode += getWarningPeriod().hashCode();
        }
        if (getGracePeriod() != null) {
            _hashCode += getGracePeriod().hashCode();
        }
        if (getAutoUnlockPeriod() != null) {
            _hashCode += getAutoUnlockPeriod().hashCode();
        }
        if (getUserCheck() != null) {
            _hashCode += getUserCheck().hashCode();
        }
        if (getMatchAcrossUsageType() != null) {
            _hashCode += getMatchAcrossUsageType().hashCode();
        }
        if (getUsageTypeToMatch() != null) {
            _hashCode += getUsageTypeToMatch().hashCode();
        }
        if (getAdProcConditions() != null) {
            _hashCode += getAdProcConditions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseWFAuthConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "BaseWFAuthConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxStrikes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "maxStrikes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "warningPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "gracePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoUnlockPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "autoUnlockPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "userCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "UserCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchAcrossUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "matchAcrossUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageTypeToMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "usageTypeToMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adProcConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "adProcConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "IntegerList"));
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
