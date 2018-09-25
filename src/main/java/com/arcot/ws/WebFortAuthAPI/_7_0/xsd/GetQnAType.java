/**
 * GetQnAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortAuthAPI._7_0.xsd;


/**
 * Returned as an output of the function
 * 				GetQuestions
 * 				which holds the QuestionIDs,
 * 				questions and answers of the user.
 * 				questionID -
 * 				The identifier with which the server recognizes
 * 				the asked
 * 				question. question - The question it
 * 				self. answer - Answer of
 * 				question.
 */
public class GetQnAType  implements java.io.Serializable {
    private java.lang.String questionID;

    private java.lang.String question;

    private java.lang.String answer;

    public GetQnAType() {
    }

    public GetQnAType(
           java.lang.String questionID,
           java.lang.String question,
           java.lang.String answer) {
           this.questionID = questionID;
           this.question = question;
           this.answer = answer;
    }


    /**
     * Gets the questionID value for this GetQnAType.
     * 
     * @return questionID
     */
    public java.lang.String getQuestionID() {
        return questionID;
    }


    /**
     * Sets the questionID value for this GetQnAType.
     * 
     * @param questionID
     */
    public void setQuestionID(java.lang.String questionID) {
        this.questionID = questionID;
    }


    /**
     * Gets the question value for this GetQnAType.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this GetQnAType.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the answer value for this GetQnAType.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this GetQnAType.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQnAType)) return false;
        GetQnAType other = (GetQnAType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionID==null && other.getQuestionID()==null) || 
             (this.questionID!=null &&
              this.questionID.equals(other.getQuestionID()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer())));
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
        if (getQuestionID() != null) {
            _hashCode += getQuestionID().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQnAType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "GetQnAType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "questionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortAuthAPI/7.0/xsd", "answer"));
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
