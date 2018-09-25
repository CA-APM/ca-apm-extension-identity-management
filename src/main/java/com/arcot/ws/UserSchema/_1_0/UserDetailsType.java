/**
 * UserDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.UserSchema._1_0;


/**
 * This type holds the minimal user details that are stored
 * 				in Arcot systems.
 * 				All pre-defined parameter are searchable fields in case of Arcot
 * repository.
 * 				CustomAttributes are not searchable.
 */
public class UserDetailsType  implements java.io.Serializable {
    private com.arcot.ws.UserSchema._1_0.UserIdentifierType userId;

    private java.util.Calendar dateCreated;

    private java.util.Calendar dateModified;

    /* Set the qualifier attribute to qualify the emails.
     * 				      Eg: Personal Email, Official Email etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level. */
    private com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId[] emailId;

    /* Set the qualifier attribute to qualify the telephone numbers
     * 				      Eg: Personal, Official etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level. */
    private com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber[] telephoneNumber;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String pam;

    private java.lang.String pamImageURL;

    /* Pass the user image as base64 encoded binary data. */
    private byte[] image;

    private com.arcot.ws.UserSchema._1_0.UserStatusType status;

    private com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute;

    private java.util.Calendar startLockTime;

    private java.util.Calendar endLockTime;

    public UserDetailsType() {
    }

    public UserDetailsType(
           com.arcot.ws.UserSchema._1_0.UserIdentifierType userId,
           java.util.Calendar dateCreated,
           java.util.Calendar dateModified,
           com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId[] emailId,
           com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber[] telephoneNumber,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String pam,
           java.lang.String pamImageURL,
           byte[] image,
           com.arcot.ws.UserSchema._1_0.UserStatusType status,
           com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute,
           java.util.Calendar startLockTime,
           java.util.Calendar endLockTime) {
           this.userId = userId;
           this.dateCreated = dateCreated;
           this.dateModified = dateModified;
           this.emailId = emailId;
           this.telephoneNumber = telephoneNumber;
           this.firstName = firstName;
           this.middleName = middleName;
           this.lastName = lastName;
           this.pam = pam;
           this.pamImageURL = pamImageURL;
           this.image = image;
           this.status = status;
           this.customAttribute = customAttribute;
           this.startLockTime = startLockTime;
           this.endLockTime = endLockTime;
    }


    /**
     * Gets the userId value for this UserDetailsType.
     * 
     * @return userId
     */
    public com.arcot.ws.UserSchema._1_0.UserIdentifierType getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserDetailsType.
     * 
     * @param userId
     */
    public void setUserId(com.arcot.ws.UserSchema._1_0.UserIdentifierType userId) {
        this.userId = userId;
    }


    /**
     * Gets the dateCreated value for this UserDetailsType.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this UserDetailsType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateModified value for this UserDetailsType.
     * 
     * @return dateModified
     */
    public java.util.Calendar getDateModified() {
        return dateModified;
    }


    /**
     * Sets the dateModified value for this UserDetailsType.
     * 
     * @param dateModified
     */
    public void setDateModified(java.util.Calendar dateModified) {
        this.dateModified = dateModified;
    }


    /**
     * Gets the emailId value for this UserDetailsType.
     * 
     * @return emailId   * Set the qualifier attribute to qualify the emails.
     * 				      Eg: Personal Email, Official Email etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level.
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId[] getEmailId() {
        return emailId;
    }


    /**
     * Sets the emailId value for this UserDetailsType.
     * 
     * @param emailId   * Set the qualifier attribute to qualify the emails.
     * 				      Eg: Personal Email, Official Email etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level.
     */
    public void setEmailId(com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId[] emailId) {
        this.emailId = emailId;
    }

    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId getEmailId(int i) {
        return this.emailId[i];
    }

    public void setEmailId(int i, com.arcot.ws.UserSchema._1_0.UserDetailsTypeEmailId _value) {
        this.emailId[i] = _value;
    }


    /**
     * Gets the telephoneNumber value for this UserDetailsType.
     * 
     * @return telephoneNumber   * Set the qualifier attribute to qualify the telephone numbers
     * 				      Eg: Personal, Official etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level.
     */
    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber[] getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this UserDetailsType.
     * 
     * @param telephoneNumber   * Set the qualifier attribute to qualify the telephone numbers
     * 				      Eg: Personal, Official etc.,
     * 				      The qualifier name should be pre configured per organization
     * or at global level.
     */
    public void setTelephoneNumber(com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber[] telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber getTelephoneNumber(int i) {
        return this.telephoneNumber[i];
    }

    public void setTelephoneNumber(int i, com.arcot.ws.UserSchema._1_0.UserDetailsTypeTelephoneNumber _value) {
        this.telephoneNumber[i] = _value;
    }


    /**
     * Gets the firstName value for this UserDetailsType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserDetailsType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this UserDetailsType.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this UserDetailsType.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this UserDetailsType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserDetailsType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the pam value for this UserDetailsType.
     * 
     * @return pam
     */
    public java.lang.String getPam() {
        return pam;
    }


    /**
     * Sets the pam value for this UserDetailsType.
     * 
     * @param pam
     */
    public void setPam(java.lang.String pam) {
        this.pam = pam;
    }


    /**
     * Gets the pamImageURL value for this UserDetailsType.
     * 
     * @return pamImageURL
     */
    public java.lang.String getPamImageURL() {
        return pamImageURL;
    }


    /**
     * Sets the pamImageURL value for this UserDetailsType.
     * 
     * @param pamImageURL
     */
    public void setPamImageURL(java.lang.String pamImageURL) {
        this.pamImageURL = pamImageURL;
    }


    /**
     * Gets the image value for this UserDetailsType.
     * 
     * @return image   * Pass the user image as base64 encoded binary data.
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this UserDetailsType.
     * 
     * @param image   * Pass the user image as base64 encoded binary data.
     */
    public void setImage(byte[] image) {
        this.image = image;
    }


    /**
     * Gets the status value for this UserDetailsType.
     * 
     * @return status
     */
    public com.arcot.ws.UserSchema._1_0.UserStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserDetailsType.
     * 
     * @param status
     */
    public void setStatus(com.arcot.ws.UserSchema._1_0.UserStatusType status) {
        this.status = status;
    }


    /**
     * Gets the customAttribute value for this UserDetailsType.
     * 
     * @return customAttribute
     */
    public com.arcot.ws.UserSchema._1_0.CustomAttributeType[] getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this UserDetailsType.
     * 
     * @param customAttribute
     */
    public void setCustomAttribute(com.arcot.ws.UserSchema._1_0.CustomAttributeType[] customAttribute) {
        this.customAttribute = customAttribute;
    }

    public com.arcot.ws.UserSchema._1_0.CustomAttributeType getCustomAttribute(int i) {
        return this.customAttribute[i];
    }

    public void setCustomAttribute(int i, com.arcot.ws.UserSchema._1_0.CustomAttributeType _value) {
        this.customAttribute[i] = _value;
    }


    /**
     * Gets the startLockTime value for this UserDetailsType.
     * 
     * @return startLockTime
     */
    public java.util.Calendar getStartLockTime() {
        return startLockTime;
    }


    /**
     * Sets the startLockTime value for this UserDetailsType.
     * 
     * @param startLockTime
     */
    public void setStartLockTime(java.util.Calendar startLockTime) {
        this.startLockTime = startLockTime;
    }


    /**
     * Gets the endLockTime value for this UserDetailsType.
     * 
     * @return endLockTime
     */
    public java.util.Calendar getEndLockTime() {
        return endLockTime;
    }


    /**
     * Sets the endLockTime value for this UserDetailsType.
     * 
     * @param endLockTime
     */
    public void setEndLockTime(java.util.Calendar endLockTime) {
        this.endLockTime = endLockTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDetailsType)) return false;
        UserDetailsType other = (UserDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateModified==null && other.getDateModified()==null) || 
             (this.dateModified!=null &&
              this.dateModified.equals(other.getDateModified()))) &&
            ((this.emailId==null && other.getEmailId()==null) || 
             (this.emailId!=null &&
              java.util.Arrays.equals(this.emailId, other.getEmailId()))) &&
            ((this.telephoneNumber==null && other.getTelephoneNumber()==null) || 
             (this.telephoneNumber!=null &&
              java.util.Arrays.equals(this.telephoneNumber, other.getTelephoneNumber()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.pam==null && other.getPam()==null) || 
             (this.pam!=null &&
              this.pam.equals(other.getPam()))) &&
            ((this.pamImageURL==null && other.getPamImageURL()==null) || 
             (this.pamImageURL!=null &&
              this.pamImageURL.equals(other.getPamImageURL()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.customAttribute==null && other.getCustomAttribute()==null) || 
             (this.customAttribute!=null &&
              java.util.Arrays.equals(this.customAttribute, other.getCustomAttribute()))) &&
            ((this.startLockTime==null && other.getStartLockTime()==null) || 
             (this.startLockTime!=null &&
              this.startLockTime.equals(other.getStartLockTime()))) &&
            ((this.endLockTime==null && other.getEndLockTime()==null) || 
             (this.endLockTime!=null &&
              this.endLockTime.equals(other.getEndLockTime())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateModified() != null) {
            _hashCode += getDateModified().hashCode();
        }
        if (getEmailId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelephoneNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephoneNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephoneNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPam() != null) {
            _hashCode += getPam().hashCode();
        }
        if (getPamImageURL() != null) {
            _hashCode += getPamImageURL().hashCode();
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCustomAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartLockTime() != null) {
            _hashCode += getStartLockTime().hashCode();
        }
        if (getEndLockTime() != null) {
            _hashCode += getEndLockTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "dateModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "emailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserDetailsType>emailId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "telephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", ">UserDetailsType>telephoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "pam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "pamImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UserStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "customAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "startLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endLockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "endLockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
