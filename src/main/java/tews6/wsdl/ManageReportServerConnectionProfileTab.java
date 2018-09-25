/**
 * ManageReportServerConnectionProfileTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ManageReportServerConnectionProfileTab  implements java.io.Serializable {
    private java.lang.String _PCT_FRIENDLY_NAME_PCT_;

    private java.lang.String CONNECTION_TYPE;

    private java.lang.String _BAR_URL_BAR_;

    private java.lang.String USER_ID;

    private java.lang.String PASSWORD;

    private tews6.wsdl.ManageReportServerConnectionProfileTabHistoryEntry historyEntry;

    public ManageReportServerConnectionProfileTab() {
    }

    public ManageReportServerConnectionProfileTab(
           java.lang.String _PCT_FRIENDLY_NAME_PCT_,
           java.lang.String CONNECTION_TYPE,
           java.lang.String _BAR_URL_BAR_,
           java.lang.String USER_ID,
           java.lang.String PASSWORD,
           tews6.wsdl.ManageReportServerConnectionProfileTabHistoryEntry historyEntry) {
           this._PCT_FRIENDLY_NAME_PCT_ = _PCT_FRIENDLY_NAME_PCT_;
           this.CONNECTION_TYPE = CONNECTION_TYPE;
           this._BAR_URL_BAR_ = _BAR_URL_BAR_;
           this.USER_ID = USER_ID;
           this.PASSWORD = PASSWORD;
           this.historyEntry = historyEntry;
    }


    /**
     * Gets the _PCT_FRIENDLY_NAME_PCT_ value for this ManageReportServerConnectionProfileTab.
     * 
     * @return _PCT_FRIENDLY_NAME_PCT_
     */
    public java.lang.String get_PCT_FRIENDLY_NAME_PCT_() {
        return _PCT_FRIENDLY_NAME_PCT_;
    }


    /**
     * Sets the _PCT_FRIENDLY_NAME_PCT_ value for this ManageReportServerConnectionProfileTab.
     * 
     * @param _PCT_FRIENDLY_NAME_PCT_
     */
    public void set_PCT_FRIENDLY_NAME_PCT_(java.lang.String _PCT_FRIENDLY_NAME_PCT_) {
        this._PCT_FRIENDLY_NAME_PCT_ = _PCT_FRIENDLY_NAME_PCT_;
    }


    /**
     * Gets the CONNECTION_TYPE value for this ManageReportServerConnectionProfileTab.
     * 
     * @return CONNECTION_TYPE
     */
    public java.lang.String getCONNECTION_TYPE() {
        return CONNECTION_TYPE;
    }


    /**
     * Sets the CONNECTION_TYPE value for this ManageReportServerConnectionProfileTab.
     * 
     * @param CONNECTION_TYPE
     */
    public void setCONNECTION_TYPE(java.lang.String CONNECTION_TYPE) {
        this.CONNECTION_TYPE = CONNECTION_TYPE;
    }


    /**
     * Gets the _BAR_URL_BAR_ value for this ManageReportServerConnectionProfileTab.
     * 
     * @return _BAR_URL_BAR_
     */
    public java.lang.String get_BAR_URL_BAR_() {
        return _BAR_URL_BAR_;
    }


    /**
     * Sets the _BAR_URL_BAR_ value for this ManageReportServerConnectionProfileTab.
     * 
     * @param _BAR_URL_BAR_
     */
    public void set_BAR_URL_BAR_(java.lang.String _BAR_URL_BAR_) {
        this._BAR_URL_BAR_ = _BAR_URL_BAR_;
    }


    /**
     * Gets the USER_ID value for this ManageReportServerConnectionProfileTab.
     * 
     * @return USER_ID
     */
    public java.lang.String getUSER_ID() {
        return USER_ID;
    }


    /**
     * Sets the USER_ID value for this ManageReportServerConnectionProfileTab.
     * 
     * @param USER_ID
     */
    public void setUSER_ID(java.lang.String USER_ID) {
        this.USER_ID = USER_ID;
    }


    /**
     * Gets the PASSWORD value for this ManageReportServerConnectionProfileTab.
     * 
     * @return PASSWORD
     */
    public java.lang.String getPASSWORD() {
        return PASSWORD;
    }


    /**
     * Sets the PASSWORD value for this ManageReportServerConnectionProfileTab.
     * 
     * @param PASSWORD
     */
    public void setPASSWORD(java.lang.String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }


    /**
     * Gets the historyEntry value for this ManageReportServerConnectionProfileTab.
     * 
     * @return historyEntry
     */
    public tews6.wsdl.ManageReportServerConnectionProfileTabHistoryEntry getHistoryEntry() {
        return historyEntry;
    }


    /**
     * Sets the historyEntry value for this ManageReportServerConnectionProfileTab.
     * 
     * @param historyEntry
     */
    public void setHistoryEntry(tews6.wsdl.ManageReportServerConnectionProfileTabHistoryEntry historyEntry) {
        this.historyEntry = historyEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageReportServerConnectionProfileTab)) return false;
        ManageReportServerConnectionProfileTab other = (ManageReportServerConnectionProfileTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._PCT_FRIENDLY_NAME_PCT_==null && other.get_PCT_FRIENDLY_NAME_PCT_()==null) || 
             (this._PCT_FRIENDLY_NAME_PCT_!=null &&
              this._PCT_FRIENDLY_NAME_PCT_.equals(other.get_PCT_FRIENDLY_NAME_PCT_()))) &&
            ((this.CONNECTION_TYPE==null && other.getCONNECTION_TYPE()==null) || 
             (this.CONNECTION_TYPE!=null &&
              this.CONNECTION_TYPE.equals(other.getCONNECTION_TYPE()))) &&
            ((this._BAR_URL_BAR_==null && other.get_BAR_URL_BAR_()==null) || 
             (this._BAR_URL_BAR_!=null &&
              this._BAR_URL_BAR_.equals(other.get_BAR_URL_BAR_()))) &&
            ((this.USER_ID==null && other.getUSER_ID()==null) || 
             (this.USER_ID!=null &&
              this.USER_ID.equals(other.getUSER_ID()))) &&
            ((this.PASSWORD==null && other.getPASSWORD()==null) || 
             (this.PASSWORD!=null &&
              this.PASSWORD.equals(other.getPASSWORD()))) &&
            ((this.historyEntry==null && other.getHistoryEntry()==null) || 
             (this.historyEntry!=null &&
              this.historyEntry.equals(other.getHistoryEntry())));
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
        if (get_PCT_FRIENDLY_NAME_PCT_() != null) {
            _hashCode += get_PCT_FRIENDLY_NAME_PCT_().hashCode();
        }
        if (getCONNECTION_TYPE() != null) {
            _hashCode += getCONNECTION_TYPE().hashCode();
        }
        if (get_BAR_URL_BAR_() != null) {
            _hashCode += get_BAR_URL_BAR_().hashCode();
        }
        if (getUSER_ID() != null) {
            _hashCode += getUSER_ID().hashCode();
        }
        if (getPASSWORD() != null) {
            _hashCode += getPASSWORD().hashCode();
        }
        if (getHistoryEntry() != null) {
            _hashCode += getHistoryEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageReportServerConnectionProfileTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionProfileTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_PCT_FRIENDLY_NAME_PCT_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_PCT_FRIENDLY_NAME_PCT_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONNECTION_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "CONNECTION_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BAR_URL_BAR_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_BAR_URL_BAR_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "USER_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PASSWORD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "PASSWORD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "HistoryEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ManageReportServerConnectionProfileTab>HistoryEntry"));
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
