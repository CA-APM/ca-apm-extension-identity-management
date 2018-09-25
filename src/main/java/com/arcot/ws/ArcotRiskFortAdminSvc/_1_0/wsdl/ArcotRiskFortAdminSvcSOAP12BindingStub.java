/**
 * ArcotRiskFortAdminSvcSOAP12BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl;

public class ArcotRiskFortAdminSvcSOAP12BindingStub extends org.apache.axis.client.Stub implements com.arcot.ws.ArcotRiskFortAdminSvc._1_0.wsdl.ArcotRiskFortAdminSvcPortType {
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
        oper.setName("addUserToExceptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "callerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUserFromExceptionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "moveReason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "callerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "userName"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "callerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "firstName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "lastName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "emailAddress"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "isExceptionUser"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionStartDate"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionEndDate"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocationAndConnectionInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "ip"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "callerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "locationAndConnectionInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/xsd", "LocationAndConnectionInfo"), com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.LocationAndConnectionInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public ArcotRiskFortAdminSvcSOAP12BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ArcotRiskFortAdminSvcSOAP12BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ArcotRiskFortAdminSvcSOAP12BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/xsd", "LocationAndConnectionInfo");
            cachedSerQNames.add(qName);
            cls = com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.LocationAndConnectionInfo.class;
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

    public void addUserToExceptionList(java.lang.String userName, java.lang.String groupName, java.util.Date startDate, java.util.Date endDate, java.lang.String reason, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addUserToExceptionList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "addUserToExceptionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, groupName, startDate, endDate, reason, callerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                code.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"));
            } catch (java.lang.Exception _exception) {
                code.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code")), java.lang.String.class);
            }
            try {
                message.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"));
            } catch (java.lang.Exception _exception) {
                message.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteUserFromExceptionList(java.lang.String userName, java.lang.String groupName, java.lang.String moveReason, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteUserFromExceptionList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "deleteUserFromExceptionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, groupName, moveReason, callerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                code.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"));
            } catch (java.lang.Exception _exception) {
                code.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code")), java.lang.String.class);
            }
            try {
                message.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"));
            } catch (java.lang.Exception _exception) {
                message.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getUserProfile(javax.xml.rpc.holders.StringHolder userName, java.lang.String groupName, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId, javax.xml.rpc.holders.StringHolder firstName, javax.xml.rpc.holders.StringHolder lastName, javax.xml.rpc.holders.StringHolder emailAddress, javax.xml.rpc.holders.BooleanHolder isExceptionUser, org.apache.axis.holders.DateHolder exceptionStartDate, org.apache.axis.holders.DateHolder exceptionEndDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getUserProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "getUserProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName.value, groupName, callerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                userName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "userName"));
            } catch (java.lang.Exception _exception) {
                userName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "userName")), java.lang.String.class);
            }
            try {
                code.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"));
            } catch (java.lang.Exception _exception) {
                code.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code")), java.lang.String.class);
            }
            try {
                message.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"));
            } catch (java.lang.Exception _exception) {
                message.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId")), java.lang.String.class);
            }
            try {
                firstName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "firstName"));
            } catch (java.lang.Exception _exception) {
                firstName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "firstName")), java.lang.String.class);
            }
            try {
                lastName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "lastName"));
            } catch (java.lang.Exception _exception) {
                lastName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "lastName")), java.lang.String.class);
            }
            try {
                emailAddress.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "emailAddress"));
            } catch (java.lang.Exception _exception) {
                emailAddress.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "emailAddress")), java.lang.String.class);
            }
            try {
                isExceptionUser.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "isExceptionUser"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                isExceptionUser.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "isExceptionUser")), boolean.class)).booleanValue();
            }
            try {
                exceptionStartDate.value = (java.util.Date) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionStartDate"));
            } catch (java.lang.Exception _exception) {
                exceptionStartDate.value = (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionStartDate")), java.util.Date.class);
            }
            try {
                exceptionEndDate.value = (java.util.Date) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionEndDate"));
            } catch (java.lang.Exception _exception) {
                exceptionEndDate.value = (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "exceptionEndDate")), java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getLocationAndConnectionInfo(java.lang.String ip, java.lang.String callerId, javax.xml.rpc.holders.StringHolder code, javax.xml.rpc.holders.StringHolder message, javax.xml.rpc.holders.StringHolder transactionId, com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.holders.LocationAndConnectionInfoHolder locationAndConnectionInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getLocationAndConnectionInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "getLocationAndConnectionInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ip, callerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                code.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code"));
            } catch (java.lang.Exception _exception) {
                code.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "code")), java.lang.String.class);
            }
            try {
                message.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message"));
            } catch (java.lang.Exception _exception) {
                message.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "message")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "transactionId")), java.lang.String.class);
            }
            try {
                locationAndConnectionInfo.value = (com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.LocationAndConnectionInfo) _output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "locationAndConnectionInfo"));
            } catch (java.lang.Exception _exception) {
                locationAndConnectionInfo.value = (com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.LocationAndConnectionInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://ws.arcot.com/ArcotRiskFortAdminSvc/1.0/msgs", "locationAndConnectionInfo")), com.arcot.ws.ArcotRiskFortAdminSvc._1_0.xsd.LocationAndConnectionInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
