/**
 * QnAInputType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the data that is needed to manage the
 * 				QnA credential.
 */
public class QnAInputType  extends com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.CredentialInputType  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] qna;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAResetType qnaReset;

    public QnAInputType() {
    }

    public QnAInputType(
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.PairType[] notes,
           java.lang.String profileName,
           java.util.Calendar validityEndTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType validityEndTimeEx,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableStartTime,
           com.arcot.ws.WebFortCommonAPI._7_0.xsd.ArcotDateType disableEndTime,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] qna,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAResetType qnaReset) {
        super(
            notes,
            profileName,
            validityEndTime,
            validityEndTimeEx,
            disableStartTime,
            disableEndTime);
        this.qna = qna;
        this.qnaReset = qnaReset;
    }


    /**
     * Gets the qna value for this QnAInputType.
     * 
     * @return qna
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] getQna() {
        return qna;
    }


    /**
     * Sets the qna value for this QnAInputType.
     * 
     * @param qna
     */
    public void setQna(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] qna) {
        this.qna = qna;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType getQna(int i) {
        return this.qna[i];
    }

    public void setQna(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType _value) {
        this.qna[i] = _value;
    }


    /**
     * Gets the qnaReset value for this QnAInputType.
     * 
     * @return qnaReset
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAResetType getQnaReset() {
        return qnaReset;
    }


    /**
     * Sets the qnaReset value for this QnAInputType.
     * 
     * @param qnaReset
     */
    public void setQnaReset(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAResetType qnaReset) {
        this.qnaReset = qnaReset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QnAInputType)) return false;
        QnAInputType other = (QnAInputType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.qna==null && other.getQna()==null) || 
             (this.qna!=null &&
              java.util.Arrays.equals(this.qna, other.getQna()))) &&
            ((this.qnaReset==null && other.getQnaReset()==null) || 
             (this.qnaReset!=null &&
              this.qnaReset.equals(other.getQnaReset())));
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
        if (getQna() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQna());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQna(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQnaReset() != null) {
            _hashCode += getQnaReset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QnAInputType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAInputType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "qna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qnaReset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "qnaReset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAResetType"));
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
