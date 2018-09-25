/**
 * ViewUserAccessRolesTabUserAdminAccessRoles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class ViewUserAccessRolesTabUserAdminAccessRoles  implements java.io.Serializable {
    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd[] add;

    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove[] remove;

    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify[] identify;

    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify[] modify;

    private tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue[] currentvalue;

    public ViewUserAccessRolesTabUserAdminAccessRoles() {
    }

    public ViewUserAccessRolesTabUserAdminAccessRoles(
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd[] add,
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove[] remove,
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify[] identify,
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify[] modify,
           tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue[] currentvalue) {
           this.add = add;
           this.remove = remove;
           this.identify = identify;
           this.modify = modify;
           this.currentvalue = currentvalue;
    }


    /**
     * Gets the add value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @return add
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd[] getAdd() {
        return add;
    }


    /**
     * Sets the add value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @param add
     */
    public void setAdd(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd[] add) {
        this.add = add;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd getAdd(int i) {
        return this.add[i];
    }

    public void setAdd(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd _value) {
        this.add[i] = _value;
    }


    /**
     * Gets the remove value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @return remove
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove[] getRemove() {
        return remove;
    }


    /**
     * Sets the remove value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @param remove
     */
    public void setRemove(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove[] remove) {
        this.remove = remove;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove getRemove(int i) {
        return this.remove[i];
    }

    public void setRemove(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove _value) {
        this.remove[i] = _value;
    }


    /**
     * Gets the identify value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @return identify
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify[] getIdentify() {
        return identify;
    }


    /**
     * Sets the identify value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @param identify
     */
    public void setIdentify(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify[] identify) {
        this.identify = identify;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify getIdentify(int i) {
        return this.identify[i];
    }

    public void setIdentify(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify _value) {
        this.identify[i] = _value;
    }


    /**
     * Gets the modify value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @return modify
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify[] getModify() {
        return modify;
    }


    /**
     * Sets the modify value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @param modify
     */
    public void setModify(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify[] modify) {
        this.modify = modify;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify getModify(int i) {
        return this.modify[i];
    }

    public void setModify(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify _value) {
        this.modify[i] = _value;
    }


    /**
     * Gets the currentvalue value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @return currentvalue
     */
    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue[] getCurrentvalue() {
        return currentvalue;
    }


    /**
     * Sets the currentvalue value for this ViewUserAccessRolesTabUserAdminAccessRoles.
     * 
     * @param currentvalue
     */
    public void setCurrentvalue(tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue[] currentvalue) {
        this.currentvalue = currentvalue;
    }

    public tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue getCurrentvalue(int i) {
        return this.currentvalue[i];
    }

    public void setCurrentvalue(int i, tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue _value) {
        this.currentvalue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewUserAccessRolesTabUserAdminAccessRoles)) return false;
        ViewUserAccessRolesTabUserAdminAccessRoles other = (ViewUserAccessRolesTabUserAdminAccessRoles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.add==null && other.getAdd()==null) || 
             (this.add!=null &&
              java.util.Arrays.equals(this.add, other.getAdd()))) &&
            ((this.remove==null && other.getRemove()==null) || 
             (this.remove!=null &&
              java.util.Arrays.equals(this.remove, other.getRemove()))) &&
            ((this.identify==null && other.getIdentify()==null) || 
             (this.identify!=null &&
              java.util.Arrays.equals(this.identify, other.getIdentify()))) &&
            ((this.modify==null && other.getModify()==null) || 
             (this.modify!=null &&
              java.util.Arrays.equals(this.modify, other.getModify()))) &&
            ((this.currentvalue==null && other.getCurrentvalue()==null) || 
             (this.currentvalue!=null &&
              java.util.Arrays.equals(this.currentvalue, other.getCurrentvalue())));
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
        if (getAdd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemove() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemove());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemove(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentify() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentify());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentify(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModify() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModify());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModify(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentvalue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentvalue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentvalue(), i);
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
        new org.apache.axis.description.TypeDesc(ViewUserAccessRolesTabUserAdminAccessRoles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAccessRolesTab>UserAdminAccessRoles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>add"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "remove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>remove"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "identify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>identify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "modify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>modify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>currentvalue"));
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
