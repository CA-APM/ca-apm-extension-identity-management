/**
 * ForgottenPasswordSearchSubject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ForgottenPasswordSearchSubject  implements java.io.Serializable {
    private java.lang.String UID;

    private java.lang.String uniqueName;

    private java.lang.String OID;

    private java.lang.String name;

    private java.lang.String _BAR_VerifyAnswer_BAR_;

    private java.math.BigInteger index;  // attribute

    public ForgottenPasswordSearchSubject() {
    }

    public ForgottenPasswordSearchSubject(
           java.lang.String UID,
           java.lang.String uniqueName,
           java.lang.String OID,
           java.lang.String name,
           java.lang.String _BAR_VerifyAnswer_BAR_,
           java.math.BigInteger index) {
           this.UID = UID;
           this.uniqueName = uniqueName;
           this.OID = OID;
           this.name = name;
           this._BAR_VerifyAnswer_BAR_ = _BAR_VerifyAnswer_BAR_;
           this.index = index;
    }


    /**
     * Gets the UID value for this ForgottenPasswordSearchSubject.
     * 
     * @return UID
     */
    public java.lang.String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this ForgottenPasswordSearchSubject.
     * 
     * @param UID
     */
    public void setUID(java.lang.String UID) {
        this.UID = UID;
    }


    /**
     * Gets the uniqueName value for this ForgottenPasswordSearchSubject.
     * 
     * @return uniqueName
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ForgottenPasswordSearchSubject.
     * 
     * @param uniqueName
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the OID value for this ForgottenPasswordSearchSubject.
     * 
     * @return OID
     */
    public java.lang.String getOID() {
        return OID;
    }


    /**
     * Sets the OID value for this ForgottenPasswordSearchSubject.
     * 
     * @param OID
     */
    public void setOID(java.lang.String OID) {
        this.OID = OID;
    }


    /**
     * Gets the name value for this ForgottenPasswordSearchSubject.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForgottenPasswordSearchSubject.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the _BAR_VerifyAnswer_BAR_ value for this ForgottenPasswordSearchSubject.
     * 
     * @return _BAR_VerifyAnswer_BAR_
     */
    public java.lang.String get_BAR_VerifyAnswer_BAR_() {
        return _BAR_VerifyAnswer_BAR_;
    }


    /**
     * Sets the _BAR_VerifyAnswer_BAR_ value for this ForgottenPasswordSearchSubject.
     * 
     * @param _BAR_VerifyAnswer_BAR_
     */
    public void set_BAR_VerifyAnswer_BAR_(java.lang.String _BAR_VerifyAnswer_BAR_) {
        this._BAR_VerifyAnswer_BAR_ = _BAR_VerifyAnswer_BAR_;
    }


    /**
     * Gets the index value for this ForgottenPasswordSearchSubject.
     * 
     * @return index
     */
    public java.math.BigInteger getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ForgottenPasswordSearchSubject.
     * 
     * @param index
     */
    public void setIndex(java.math.BigInteger index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForgottenPasswordSearchSubject)) return false;
        ForgottenPasswordSearchSubject other = (ForgottenPasswordSearchSubject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.OID==null && other.getOID()==null) || 
             (this.OID!=null &&
              this.OID.equals(other.getOID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this._BAR_VerifyAnswer_BAR_==null && other.get_BAR_VerifyAnswer_BAR_()==null) || 
             (this._BAR_VerifyAnswer_BAR_!=null &&
              this._BAR_VerifyAnswer_BAR_.equals(other.get_BAR_VerifyAnswer_BAR_()))) &&
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
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getOID() != null) {
            _hashCode += getOID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (get_BAR_VerifyAnswer_BAR_() != null) {
            _hashCode += get_BAR_VerifyAnswer_BAR_().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForgottenPasswordSearchSubject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ForgottenPasswordSearch>Subject"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UniqueName"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_BAR_VerifyAnswer_BAR_");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "_BAR_VerifyAnswer_BAR_"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
