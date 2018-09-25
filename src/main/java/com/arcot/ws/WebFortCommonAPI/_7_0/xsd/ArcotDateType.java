/**
 * ArcotDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.WebFortCommonAPI._7_0.xsd;


/**
 * ArcotDateType is the structure used to represent
 * 				date and time. year, month, day, hour, minute
 * 				and second fields are
 * 				used to represent any date
 * 				and time. dateType represents the type of
 * 				date.
 * 				type can be any of following. 1 represents
 * 				current date (current
 * 				date in database). 2
 * 				represents for ever date. 3 represents explicit
 * 				date, Example year=2008, month=12, day=31. 4
 * 				represents relative
 * 				time, Example year=10,
 * 				month=1. If the type is 1 or 2 then date values
 * 				(year, month etc...) will be ignored.
 */
public class ArcotDateType  implements java.io.Serializable {
    private java.lang.Integer year;

    private java.lang.Integer month;

    private java.lang.Integer day;

    private java.lang.Integer hour;

    private java.lang.Integer minute;

    private java.lang.Integer second;

    private int dateType;

    public ArcotDateType() {
    }

    public ArcotDateType(
           java.lang.Integer year,
           java.lang.Integer month,
           java.lang.Integer day,
           java.lang.Integer hour,
           java.lang.Integer minute,
           java.lang.Integer second,
           int dateType) {
           this.year = year;
           this.month = month;
           this.day = day;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
           this.dateType = dateType;
    }


    /**
     * Gets the year value for this ArcotDateType.
     * 
     * @return year
     */
    public java.lang.Integer getYear() {
        return year;
    }


    /**
     * Sets the year value for this ArcotDateType.
     * 
     * @param year
     */
    public void setYear(java.lang.Integer year) {
        this.year = year;
    }


    /**
     * Gets the month value for this ArcotDateType.
     * 
     * @return month
     */
    public java.lang.Integer getMonth() {
        return month;
    }


    /**
     * Sets the month value for this ArcotDateType.
     * 
     * @param month
     */
    public void setMonth(java.lang.Integer month) {
        this.month = month;
    }


    /**
     * Gets the day value for this ArcotDateType.
     * 
     * @return day
     */
    public java.lang.Integer getDay() {
        return day;
    }


    /**
     * Sets the day value for this ArcotDateType.
     * 
     * @param day
     */
    public void setDay(java.lang.Integer day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this ArcotDateType.
     * 
     * @return hour
     */
    public java.lang.Integer getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this ArcotDateType.
     * 
     * @param hour
     */
    public void setHour(java.lang.Integer hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this ArcotDateType.
     * 
     * @return minute
     */
    public java.lang.Integer getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this ArcotDateType.
     * 
     * @param minute
     */
    public void setMinute(java.lang.Integer minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this ArcotDateType.
     * 
     * @return second
     */
    public java.lang.Integer getSecond() {
        return second;
    }


    /**
     * Sets the second value for this ArcotDateType.
     * 
     * @param second
     */
    public void setSecond(java.lang.Integer second) {
        this.second = second;
    }


    /**
     * Gets the dateType value for this ArcotDateType.
     * 
     * @return dateType
     */
    public int getDateType() {
        return dateType;
    }


    /**
     * Sets the dateType value for this ArcotDateType.
     * 
     * @param dateType
     */
    public void setDateType(int dateType) {
        this.dateType = dateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcotDateType)) return false;
        ArcotDateType other = (ArcotDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond()))) &&
            this.dateType == other.getDateType();
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        _hashCode += getDateType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcotDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "ArcotDateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/WebFortCommonAPI/7.0/xsd", "dateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
