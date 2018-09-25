/**
 * PORTALObjectsFeederRecordsDetailsTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class PORTALObjectsFeederRecordsDetailsTab  implements java.io.Serializable {
    private java.lang.String actionAttrName;

    private java.lang.String uniqueIdentifierAttrName;

    private java.lang.String fileContent;

    private java.lang.String fileName;

    private java.lang.String parserClass;

    private java.lang.String parserDeletionSequence;

    public PORTALObjectsFeederRecordsDetailsTab() {
    }

    public PORTALObjectsFeederRecordsDetailsTab(
           java.lang.String actionAttrName,
           java.lang.String uniqueIdentifierAttrName,
           java.lang.String fileContent,
           java.lang.String fileName,
           java.lang.String parserClass,
           java.lang.String parserDeletionSequence) {
           this.actionAttrName = actionAttrName;
           this.uniqueIdentifierAttrName = uniqueIdentifierAttrName;
           this.fileContent = fileContent;
           this.fileName = fileName;
           this.parserClass = parserClass;
           this.parserDeletionSequence = parserDeletionSequence;
    }


    /**
     * Gets the actionAttrName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return actionAttrName
     */
    public java.lang.String getActionAttrName() {
        return actionAttrName;
    }


    /**
     * Sets the actionAttrName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param actionAttrName
     */
    public void setActionAttrName(java.lang.String actionAttrName) {
        this.actionAttrName = actionAttrName;
    }


    /**
     * Gets the uniqueIdentifierAttrName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return uniqueIdentifierAttrName
     */
    public java.lang.String getUniqueIdentifierAttrName() {
        return uniqueIdentifierAttrName;
    }


    /**
     * Sets the uniqueIdentifierAttrName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param uniqueIdentifierAttrName
     */
    public void setUniqueIdentifierAttrName(java.lang.String uniqueIdentifierAttrName) {
        this.uniqueIdentifierAttrName = uniqueIdentifierAttrName;
    }


    /**
     * Gets the fileContent value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return fileContent
     */
    public java.lang.String getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param fileContent
     */
    public void setFileContent(java.lang.String fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the fileName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the parserClass value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return parserClass
     */
    public java.lang.String getParserClass() {
        return parserClass;
    }


    /**
     * Sets the parserClass value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param parserClass
     */
    public void setParserClass(java.lang.String parserClass) {
        this.parserClass = parserClass;
    }


    /**
     * Gets the parserDeletionSequence value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @return parserDeletionSequence
     */
    public java.lang.String getParserDeletionSequence() {
        return parserDeletionSequence;
    }


    /**
     * Sets the parserDeletionSequence value for this PORTALObjectsFeederRecordsDetailsTab.
     * 
     * @param parserDeletionSequence
     */
    public void setParserDeletionSequence(java.lang.String parserDeletionSequence) {
        this.parserDeletionSequence = parserDeletionSequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PORTALObjectsFeederRecordsDetailsTab)) return false;
        PORTALObjectsFeederRecordsDetailsTab other = (PORTALObjectsFeederRecordsDetailsTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionAttrName==null && other.getActionAttrName()==null) || 
             (this.actionAttrName!=null &&
              this.actionAttrName.equals(other.getActionAttrName()))) &&
            ((this.uniqueIdentifierAttrName==null && other.getUniqueIdentifierAttrName()==null) || 
             (this.uniqueIdentifierAttrName!=null &&
              this.uniqueIdentifierAttrName.equals(other.getUniqueIdentifierAttrName()))) &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              this.fileContent.equals(other.getFileContent()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.parserClass==null && other.getParserClass()==null) || 
             (this.parserClass!=null &&
              this.parserClass.equals(other.getParserClass()))) &&
            ((this.parserDeletionSequence==null && other.getParserDeletionSequence()==null) || 
             (this.parserDeletionSequence!=null &&
              this.parserDeletionSequence.equals(other.getParserDeletionSequence())));
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
        if (getActionAttrName() != null) {
            _hashCode += getActionAttrName().hashCode();
        }
        if (getUniqueIdentifierAttrName() != null) {
            _hashCode += getUniqueIdentifierAttrName().hashCode();
        }
        if (getFileContent() != null) {
            _hashCode += getFileContent().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getParserClass() != null) {
            _hashCode += getParserClass().hashCode();
        }
        if (getParserDeletionSequence() != null) {
            _hashCode += getParserDeletionSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PORTALObjectsFeederRecordsDetailsTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederRecordsDetailsTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionAttrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ActionAttrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIdentifierAttrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "UniqueIdentifierAttrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "FileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parserClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ParserClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parserDeletionSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "ParserDeletionSequence"));
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
