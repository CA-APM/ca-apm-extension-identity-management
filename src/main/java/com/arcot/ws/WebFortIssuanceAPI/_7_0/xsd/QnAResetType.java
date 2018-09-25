/**
 * QnAResetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortIssuanceAPI._7_0.xsd;


/**
 * Represents the data that is needed to reset the qna 
 * 				credential partially.
 */
public class QnAResetType  implements java.io.Serializable {
    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType[] deleteList;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] addList;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] changeAnswerList;

    private com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType[] changeQuestionList;

    public QnAResetType() {
    }

    public QnAResetType(
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType[] deleteList,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] addList,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] changeAnswerList,
           com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType[] changeQuestionList) {
           this.deleteList = deleteList;
           this.addList = addList;
           this.changeAnswerList = changeAnswerList;
           this.changeQuestionList = changeQuestionList;
    }


    /**
     * Gets the deleteList value for this QnAResetType.
     * 
     * @return deleteList
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType[] getDeleteList() {
        return deleteList;
    }


    /**
     * Sets the deleteList value for this QnAResetType.
     * 
     * @param deleteList
     */
    public void setDeleteList(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType[] deleteList) {
        this.deleteList = deleteList;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType getDeleteList(int i) {
        return this.deleteList[i];
    }

    public void setDeleteList(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QuestionType _value) {
        this.deleteList[i] = _value;
    }


    /**
     * Gets the addList value for this QnAResetType.
     * 
     * @return addList
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] getAddList() {
        return addList;
    }


    /**
     * Sets the addList value for this QnAResetType.
     * 
     * @param addList
     */
    public void setAddList(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] addList) {
        this.addList = addList;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType getAddList(int i) {
        return this.addList[i];
    }

    public void setAddList(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType _value) {
        this.addList[i] = _value;
    }


    /**
     * Gets the changeAnswerList value for this QnAResetType.
     * 
     * @return changeAnswerList
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] getChangeAnswerList() {
        return changeAnswerList;
    }


    /**
     * Sets the changeAnswerList value for this QnAResetType.
     * 
     * @param changeAnswerList
     */
    public void setChangeAnswerList(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType[] changeAnswerList) {
        this.changeAnswerList = changeAnswerList;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType getChangeAnswerList(int i) {
        return this.changeAnswerList[i];
    }

    public void setChangeAnswerList(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnAType _value) {
        this.changeAnswerList[i] = _value;
    }


    /**
     * Gets the changeQuestionList value for this QnAResetType.
     * 
     * @return changeQuestionList
     */
    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType[] getChangeQuestionList() {
        return changeQuestionList;
    }


    /**
     * Sets the changeQuestionList value for this QnAResetType.
     * 
     * @param changeQuestionList
     */
    public void setChangeQuestionList(com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType[] changeQuestionList) {
        this.changeQuestionList = changeQuestionList;
    }

    public com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType getChangeQuestionList(int i) {
        return this.changeQuestionList[i];
    }

    public void setChangeQuestionList(int i, com.arcot.ws.WebFortIssuanceAPI._7_0.xsd.QnQType _value) {
        this.changeQuestionList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QnAResetType)) return false;
        QnAResetType other = (QnAResetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteList==null && other.getDeleteList()==null) || 
             (this.deleteList!=null &&
              java.util.Arrays.equals(this.deleteList, other.getDeleteList()))) &&
            ((this.addList==null && other.getAddList()==null) || 
             (this.addList!=null &&
              java.util.Arrays.equals(this.addList, other.getAddList()))) &&
            ((this.changeAnswerList==null && other.getChangeAnswerList()==null) || 
             (this.changeAnswerList!=null &&
              java.util.Arrays.equals(this.changeAnswerList, other.getChangeAnswerList()))) &&
            ((this.changeQuestionList==null && other.getChangeQuestionList()==null) || 
             (this.changeQuestionList!=null &&
              java.util.Arrays.equals(this.changeQuestionList, other.getChangeQuestionList())));
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
        if (getDeleteList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangeAnswerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeAnswerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeAnswerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangeQuestionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeQuestionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeQuestionList(), i);
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
        new org.apache.axis.description.TypeDesc(QnAResetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAResetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "deleteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QuestionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "addList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAnswerList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "changeAnswerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnAType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeQuestionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "changeQuestionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortIssuanceAPI/7.0/xsd", "QnQType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
