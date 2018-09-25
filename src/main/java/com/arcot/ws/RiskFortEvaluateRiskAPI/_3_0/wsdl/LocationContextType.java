/**
 * LocationContextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;


/**
 * Contains a client's geolocation information. The clientIPAddress
 * 						is an input and all other fields are returned by the server.
 */
public class LocationContextType  implements java.io.Serializable {
    private java.lang.String clientIPAddress;

    private java.lang.Float longitude;

    private java.lang.Float latitude;

    private java.lang.String continent;

    private java.lang.String country;

    private java.lang.String countryISO2;

    private java.lang.String region;

    private java.lang.String state;

    private java.lang.String city;

    private java.lang.String connectionType;

    private java.lang.String lineSpeed;

    public LocationContextType() {
    }

    public LocationContextType(
           java.lang.String clientIPAddress,
           java.lang.Float longitude,
           java.lang.Float latitude,
           java.lang.String continent,
           java.lang.String country,
           java.lang.String countryISO2,
           java.lang.String region,
           java.lang.String state,
           java.lang.String city,
           java.lang.String connectionType,
           java.lang.String lineSpeed) {
           this.clientIPAddress = clientIPAddress;
           this.longitude = longitude;
           this.latitude = latitude;
           this.continent = continent;
           this.country = country;
           this.countryISO2 = countryISO2;
           this.region = region;
           this.state = state;
           this.city = city;
           this.connectionType = connectionType;
           this.lineSpeed = lineSpeed;
    }


    /**
     * Gets the clientIPAddress value for this LocationContextType.
     * 
     * @return clientIPAddress
     */
    public java.lang.String getClientIPAddress() {
        return clientIPAddress;
    }


    /**
     * Sets the clientIPAddress value for this LocationContextType.
     * 
     * @param clientIPAddress
     */
    public void setClientIPAddress(java.lang.String clientIPAddress) {
        this.clientIPAddress = clientIPAddress;
    }


    /**
     * Gets the longitude value for this LocationContextType.
     * 
     * @return longitude
     */
    public java.lang.Float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LocationContextType.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this LocationContextType.
     * 
     * @return latitude
     */
    public java.lang.Float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LocationContextType.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the continent value for this LocationContextType.
     * 
     * @return continent
     */
    public java.lang.String getContinent() {
        return continent;
    }


    /**
     * Sets the continent value for this LocationContextType.
     * 
     * @param continent
     */
    public void setContinent(java.lang.String continent) {
        this.continent = continent;
    }


    /**
     * Gets the country value for this LocationContextType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LocationContextType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the countryISO2 value for this LocationContextType.
     * 
     * @return countryISO2
     */
    public java.lang.String getCountryISO2() {
        return countryISO2;
    }


    /**
     * Sets the countryISO2 value for this LocationContextType.
     * 
     * @param countryISO2
     */
    public void setCountryISO2(java.lang.String countryISO2) {
        this.countryISO2 = countryISO2;
    }


    /**
     * Gets the region value for this LocationContextType.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this LocationContextType.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the state value for this LocationContextType.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this LocationContextType.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this LocationContextType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationContextType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the connectionType value for this LocationContextType.
     * 
     * @return connectionType
     */
    public java.lang.String getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this LocationContextType.
     * 
     * @param connectionType
     */
    public void setConnectionType(java.lang.String connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the lineSpeed value for this LocationContextType.
     * 
     * @return lineSpeed
     */
    public java.lang.String getLineSpeed() {
        return lineSpeed;
    }


    /**
     * Sets the lineSpeed value for this LocationContextType.
     * 
     * @param lineSpeed
     */
    public void setLineSpeed(java.lang.String lineSpeed) {
        this.lineSpeed = lineSpeed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationContextType)) return false;
        LocationContextType other = (LocationContextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientIPAddress==null && other.getClientIPAddress()==null) || 
             (this.clientIPAddress!=null &&
              this.clientIPAddress.equals(other.getClientIPAddress()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.continent==null && other.getContinent()==null) || 
             (this.continent!=null &&
              this.continent.equals(other.getContinent()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countryISO2==null && other.getCountryISO2()==null) || 
             (this.countryISO2!=null &&
              this.countryISO2.equals(other.getCountryISO2()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType()))) &&
            ((this.lineSpeed==null && other.getLineSpeed()==null) || 
             (this.lineSpeed!=null &&
              this.lineSpeed.equals(other.getLineSpeed())));
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
        if (getClientIPAddress() != null) {
            _hashCode += getClientIPAddress().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getContinent() != null) {
            _hashCode += getContinent().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountryISO2() != null) {
            _hashCode += getCountryISO2().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        if (getLineSpeed() != null) {
            _hashCode += getLineSpeed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationContextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "LocationContextType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "clientIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "continent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "countryISO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "lineSpeed"));
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
