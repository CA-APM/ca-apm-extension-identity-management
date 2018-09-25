/**
 * EvaluateRiskAPISOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl;

public class EvaluateRiskAPISOAP11BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskAPIPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAssociation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationRequestType"), com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationResponseType"));
        oper.setReturnClass(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evaluateRisk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskRequestType"), com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateResponseType"));
        oper.setReturnClass(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationsRequestType"), com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationResponseType"));
        oper.setReturnClass(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postEvaluate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateRequestType"), com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateResponseType"));
        oper.setReturnClass(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public EvaluateRiskAPISOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EvaluateRiskAPISOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EvaluateRiskAPISOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", ">DeviceIDItemType>deviceIDItem");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", ">RiskAssessmentType>score");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "AdminContextType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.AdminContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeleteAssociationResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeviceContextType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "DeviceIDItemType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeviceIDItemTypeDeviceIDItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", ">DeviceIDItemType>deviceIDItem");
            qName2 = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "deviceIDItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "EvaluateRiskRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "ListAssociationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "LocationContextType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.LocationContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "NameValueType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.NameValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateRequestType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "PostEvaluateResponseType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskAssessmentType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskAssessmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "RiskFortSuccess");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.RiskFortSuccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "TransactionContextType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.TransactionContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserContextType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.arcot.com/RiskFortEvaluateRiskAPI/3.0/wsdl", "UserDeviceAssociationType");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.UserDeviceAssociationType.class;
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

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType deleteAssociation(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteAssociation30B11");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteAssociation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.DeleteAssociationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType evaluateRisk(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateRiskRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:evaluateRiskEx30B11");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "evaluateRisk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.EvaluateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType listAssociations(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationsRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:listAssociations30B11");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.ListAssociationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType postEvaluate(com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:postEvaluate30B11");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "postEvaluate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.arcot.ws.RiskFortEvaluateRiskAPI._3_0.wsdl.PostEvaluateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
