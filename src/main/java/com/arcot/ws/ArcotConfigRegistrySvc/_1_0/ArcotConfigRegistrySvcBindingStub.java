/**
 * ArcotConfigRegistrySvcBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotConfigRegistrySvc._1_0;

public class ArcotConfigRegistrySvcBindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.ArcotConfigRegistrySvc._1_0.ArcotConfigRegistrySvcPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listAccountTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listAccountTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listAccountTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListAccountTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listAccountTypeResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.AccountType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listAccountTypeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "accountType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listEmailTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listEmailTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listEmailTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListEmailTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listEmailTypeResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.EmailType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listEmailTypeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "emailType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listTelephoneTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listTelephoneTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listTelephoneTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListTelephoneTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listTelephoneTypeResponse"));
        oper.setReturnClass(com.arcot.ws.UserSchema._1_0.TelephoneType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listTelephoneTypeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "telephoneType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listConfiguredAttributesForEncryption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listConfiguredAttributesForEncryptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listConfiguredAttributesForEncryptionRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListConfiguredAttributesForEncryptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listConfiguredAttributesForEncryptionResponse"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "listConfiguredAttributesForEncryptionResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "deleteAccountTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">deleteAccountTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">deleteAccountTypeResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "deleteAccountTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "createAccountTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">createAccountTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">createAccountTypeResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "createAccountTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "updateAccountTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">updateAccountTypeRequest"), com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">updateAccountTypeResponse"));
        oper.setReturnClass(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "updateAccountTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public ArcotConfigRegistrySvcBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotConfigRegistrySvcBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotConfigRegistrySvcBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">>updateAccountTypeRequest>RemoveOrganizations");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "orgName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">createAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">createAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">deleteAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">deleteAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountType");
            qName2 = new javax.xml.namespace.QName("", "accountType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listConfiguredAttributesForEncryptionRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListConfiguredAttributesForEncryptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listConfiguredAttributesForEncryptionResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listEmailTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListEmailTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listEmailTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.EmailType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "EmailType");
            qName2 = new javax.xml.namespace.QName("", "emailType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listTelephoneTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListTelephoneTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">listTelephoneTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.TelephoneType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "TelephoneType");
            qName2 = new javax.xml.namespace.QName("", "telephoneType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">updateAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", ">updateAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "AccountCustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "ListOfOrgsAccountType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.AccountCustomAttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotConfigRegistrySvc/1.0/msgs", "AccountCustomAttributeType");
            qName2 = new javax.xml.namespace.QName("", "Organization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "CustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.CustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "EmailType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.EmailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "TelephoneType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.TelephoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/UserSchema/1.0", "UdsRegistrySuccessType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.UserSchema._1_0.UdsRegistrySuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.arcot.ws.UserSchema._1_0.AccountType[] listAccountTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListAccountTypeRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListAccountTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listAccountTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.AccountType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.AccountType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.AccountType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.EmailType[] listEmailTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListEmailTypeRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListEmailTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listEmailTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.EmailType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.EmailType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.EmailType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.UserSchema._1_0.TelephoneType[] listTelephoneTypes(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListTelephoneTypeRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListTelephoneTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listTelephoneTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.UserSchema._1_0.TelephoneType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.UserSchema._1_0.TelephoneType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.UserSchema._1_0.TelephoneType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] listConfiguredAttributesForEncryption(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.ListConfiguredAttributesForEncryptionRequest param) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.ListConfiguredAttributesForEncryption");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listConfiguredAttributesForEncryption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse deleteAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.DeleteAccountType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.DeleteAccountTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse createAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.CreateAccountType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.CreateAccountTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse updateAccountType(com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeRequest input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:UDS.UpdateAccountType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.ArcotConfigRegistrySvc._1_0.msgs.UpdateAccountTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
