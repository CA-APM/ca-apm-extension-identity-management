/**
 * ConfigStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotWebFortAdminSvc._7_0.xsd;


/**
 * Configuration status is a combination of following
 * 				different status.
 * 				Not required as input. Comes as only output.
 */
public class ConfigStatus  implements java.io.Serializable {
    private java.lang.Boolean ACTIVE;

    private java.lang.Boolean DISABLED;

    private java.lang.Boolean DELETED;

    private java.lang.Boolean DEFAULT;

    private java.lang.Boolean READONLY;

    public ConfigStatus() {
    }

    public ConfigStatus(
           java.lang.Boolean ACTIVE,
           java.lang.Boolean DISABLED,
           java.lang.Boolean DELETED,
           java.lang.Boolean DEFAULT,
           java.lang.Boolean READONLY) {
           this.ACTIVE = ACTIVE;
           this.DISABLED = DISABLED;
           this.DELETED = DELETED;
           this.DEFAULT = DEFAULT;
           this.READONLY = READONLY;
    }


    /**
     * Gets the ACTIVE value for this ConfigStatus.
     * 
     * @return ACTIVE
     */
    public java.lang.Boolean getACTIVE() {
        return ACTIVE;
    }


    /**
     * Sets the ACTIVE value for this ConfigStatus.
     * 
     * @param ACTIVE
     */
    public void setACTIVE(java.lang.Boolean ACTIVE) {
        this.ACTIVE = ACTIVE;
    }


    /**
     * Gets the DISABLED value for this ConfigStatus.
     * 
     * @return DISABLED
     */
    public java.lang.Boolean getDISABLED() {
        return DISABLED;
    }


    /**
     * Sets the DISABLED value for this ConfigStatus.
     * 
     * @param DISABLED
     */
    public void setDISABLED(java.lang.Boolean DISABLED) {
        this.DISABLED = DISABLED;
    }


    /**
     * Gets the DELETED value for this ConfigStatus.
     * 
     * @return DELETED
     */
    public java.lang.Boolean getDELETED() {
        return DELETED;
    }


    /**
     * Sets the DELETED value for this ConfigStatus.
     * 
     * @param DELETED
     */
    public void setDELETED(java.lang.Boolean DELETED) {
        this.DELETED = DELETED;
    }


    /**
     * Gets the DEFAULT value for this ConfigStatus.
     * 
     * @return DEFAULT
     */
    public java.lang.Boolean getDEFAULT() {
        return DEFAULT;
    }


    /**
     * Sets the DEFAULT value for this ConfigStatus.
     * 
     * @param DEFAULT
     */
    public void setDEFAULT(java.lang.Boolean DEFAULT) {
        this.DEFAULT = DEFAULT;
    }


    /**
     * Gets the READONLY value for this ConfigStatus.
     * 
     * @return READONLY
     */
    public java.lang.Boolean getREADONLY() {
        return READONLY;
    }


    /**
     * Sets the READONLY value for this ConfigStatus.
     * 
     * @param READONLY
     */
    public void setREADONLY(java.lang.Boolean READONLY) {
        this.READONLY = READONLY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigStatus)) return false;
        ConfigStatus other = (ConfigStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACTIVE==null && other.getACTIVE()==null) || 
             (this.ACTIVE!=null &&
              this.ACTIVE.equals(other.getACTIVE()))) &&
            ((this.DISABLED==null && other.getDISABLED()==null) || 
             (this.DISABLED!=null &&
              this.DISABLED.equals(other.getDISABLED()))) &&
            ((this.DELETED==null && other.getDELETED()==null) || 
             (this.DELETED!=null &&
              this.DELETED.equals(other.getDELETED()))) &&
            ((this.DEFAULT==null && other.getDEFAULT()==null) || 
             (this.DEFAULT!=null &&
              this.DEFAULT.equals(other.getDEFAULT()))) &&
            ((this.READONLY==null && other.getREADONLY()==null) || 
             (this.READONLY!=null &&
              this.READONLY.equals(other.getREADONLY())));
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
        if (getACTIVE() != null) {
            _hashCode += getACTIVE().hashCode();
        }
        if (getDISABLED() != null) {
            _hashCode += getDISABLED().hashCode();
        }
        if (getDELETED() != null) {
            _hashCode += getDELETED().hashCode();
        }
        if (getDEFAULT() != null) {
            _hashCode += getDEFAULT().hashCode();
        }
        if (getREADONLY() != null) {
            _hashCode += getREADONLY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ConfigStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTIVE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "ACTIVE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISABLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "DISABLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELETED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "DELETED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEFAULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "DEFAULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("READONLY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotWebFortAdminSvc/7.0/xsd", "READONLY"));
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
