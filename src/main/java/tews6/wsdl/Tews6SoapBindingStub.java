/**
 * Tews6SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tews6.wsdl;

public class Tews6SoapBindingStub extends org.apache.axis.client.Stub implements tews6.wsdl.Tews6PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[56];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObjectsFeeder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeeder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeeder"), tews6.wsdl.ObjectsFeeder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObjectsFeederQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederQuery"), tews6.wsdl.ObjectsFeederQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederQueryResult"));
        oper.setReturnClass(tews6.wsdl.ObjectsFeederQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObjectsFeederSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederSearch"), tews6.wsdl.ObjectsFeederSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederSearchResult"));
        oper.setReturnClass(tews6.wsdl.ObjectsFeederSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ObjectsFeederSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMyPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ChangeMyPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPassword"), tews6.wsdl.ChangeMyPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMyPasswordQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ChangeMyPasswordQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordQuery"), tews6.wsdl.ChangeMyPasswordQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordQueryResult"));
        oper.setReturnClass(tews6.wsdl.ChangeMyPasswordQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ChangeMyPasswordQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CorrelationAttributeConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CorrelationAttributeConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfiguration"), tews6.wsdl.CorrelationAttributeConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CorrelationAttributeConfigurationQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CorrelationAttributeConfigurationQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQuery"), tews6.wsdl.CorrelationAttributeConfigurationQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQueryResult"));
        oper.setReturnClass(tews6.wsdl.CorrelationAttributeConfigurationQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "CorrelationAttributeConfigurationQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateOwnerPoliciesForProvisioningRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRoles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRoles"), tews6.wsdl.CreateOwnerPoliciesForProvisioningRoles.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateOwnerPoliciesForProvisioningRolesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQuery"), tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQueryResult"));
        oper.setReturnClass(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateOwnerPoliciesForProvisioningRolesSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesSearch"), tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesSearchResult"));
        oper.setReturnClass(tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateOwnerPoliciesForProvisioningRolesSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateWorkflowTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateWorkflowTemplate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplate"), tews6.wsdl.CreateWorkflowTemplate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateWorkflowTemplateSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateWorkflowTemplateSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateSearch"), tews6.wsdl.CreateWorkflowTemplateSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateSearchResult"));
        oper.setReturnClass(tews6.wsdl.CreateWorkflowTemplateSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "CreateWorkflowTemplateSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteWorkflowTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplate"), tews6.wsdl.DeleteWorkflowTemplate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteWorkflowTemplateQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateQuery"), tews6.wsdl.DeleteWorkflowTemplateQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateQueryResult"));
        oper.setReturnClass(tews6.wsdl.DeleteWorkflowTemplateQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteWorkflowTemplateSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateSearch"), tews6.wsdl.DeleteWorkflowTemplateSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateSearchResult"));
        oper.setReturnClass(tews6.wsdl.DeleteWorkflowTemplateSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "DeleteWorkflowTemplateSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateEmployeeCreationFromFeed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateEmployeeCreationFromFeed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeCreationFromFeed"), tews6.wsdl.TemplateEmployeeCreationFromFeed.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateEmployeeSelfModification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateEmployeeSelfModification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModification"), tews6.wsdl.TemplateEmployeeSelfModification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateEmployeeSelfModificationQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateEmployeeSelfModificationQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModificationQuery"), tews6.wsdl.TemplateEmployeeSelfModificationQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModificationQueryResult"));
        oper.setReturnClass(tews6.wsdl.TemplateEmployeeSelfModificationQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateEmployeeSelfModificationQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InboundNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "InboundNotification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotification"), tews6.wsdl.InboundNotification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InboundNotificationQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "InboundNotificationQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationQuery"), tews6.wsdl.InboundNotificationQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationQueryResult"));
        oper.setReturnClass(tews6.wsdl.InboundNotificationQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "InboundNotificationQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateModifyContractorByManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManager"), tews6.wsdl.TemplateModifyContractorByManager.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateModifyContractorByManagerQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerQuery"), tews6.wsdl.TemplateModifyContractorByManagerQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerQueryResult"));
        oper.setReturnClass(tews6.wsdl.TemplateModifyContractorByManagerQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TemplateModifyContractorByManagerSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerSearch"), tews6.wsdl.TemplateModifyContractorByManagerSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerSearchResult"));
        oper.setReturnClass(tews6.wsdl.TemplateModifyContractorByManagerSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TemplateModifyContractorByManagerSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyUseCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCase"), tews6.wsdl.ModifyUseCase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyUseCaseQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseQuery"), tews6.wsdl.ModifyUseCaseQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseQueryResult"));
        oper.setReturnClass(tews6.wsdl.ModifyUseCaseQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyUseCaseSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseSearch"), tews6.wsdl.ModifyUseCaseSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseSearchResult"));
        oper.setReturnClass(tews6.wsdl.ModifyUseCaseSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyUseCaseSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyWorkflowTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplate"), tews6.wsdl.ModifyWorkflowTemplate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyWorkflowTemplateQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateQuery"), tews6.wsdl.ModifyWorkflowTemplateQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateQueryResult"));
        oper.setReturnClass(tews6.wsdl.ModifyWorkflowTemplateQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifyWorkflowTemplateSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearch"), tews6.wsdl.ModifyWorkflowTemplateSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearchResult"));
        oper.setReturnClass(tews6.wsdl.ModifyWorkflowTemplateSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ModifyWorkflowTemplateSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OnboardAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "OnboardAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount"), tews6.wsdl.OnboardAccount.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OnboardAccount-Tab-EndpointExploreSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "OnboardAccount-Tab-EndpointExploreSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount-Tab-EndpointExploreSearch"), tews6.wsdl.OnboardAccountTabEndpointExploreSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount-Tab-EndpointExploreSearchResult"));
        oper.setReturnClass(tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "OnboardAccount-Tab-EndpointExploreSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageReportServerConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ManageReportServerConnection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnection"), tews6.wsdl.ManageReportServerConnection.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageReportServerConnectionSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ManageReportServerConnectionSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionSearch"), tews6.wsdl.ManageReportServerConnectionSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionSearchResult"));
        oper.setReturnClass(tews6.wsdl.ManageReportServerConnectionSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ManageReportServerConnectionSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetProvisioningRoleOwners");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwners"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwners"), tews6.wsdl.ResetProvisioningRoleOwners.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetProvisioningRoleOwnersQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersQuery"), tews6.wsdl.ResetProvisioningRoleOwnersQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersQueryResult"));
        oper.setReturnClass(tews6.wsdl.ResetProvisioningRoleOwnersQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetProvisioningRoleOwnersSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearch"), tews6.wsdl.ResetProvisioningRoleOwnersSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearchResult"));
        oper.setReturnClass(tews6.wsdl.ResetProvisioningRoleOwnersSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetProvisioningRoleOwnersSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetUserPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPassword"), tews6.wsdl.ResetUserPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetUserPasswordQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPasswordQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordQuery"), tews6.wsdl.ResetUserPasswordQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordQueryResult"));
        oper.setReturnClass(tews6.wsdl.ResetUserPasswordQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPasswordQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetUserPasswordSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPasswordSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordSearch"), tews6.wsdl.ResetUserPasswordSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordSearchResult"));
        oper.setReturnClass(tews6.wsdl.ResetUserPasswordSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ResetUserPasswordSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferDocumentOwnership");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnership"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership"), tews6.wsdl.TransferDocumentOwnership.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferDocumentOwnershipQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipQuery"), tews6.wsdl.TransferDocumentOwnershipQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipQueryResult"));
        oper.setReturnClass(tews6.wsdl.TransferDocumentOwnershipQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferDocumentOwnershipSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipSearch"), tews6.wsdl.TransferDocumentOwnershipSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipSearchResult"));
        oper.setReturnClass(tews6.wsdl.TransferDocumentOwnershipSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnershipSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch"), tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult"));
        oper.setReturnClass(tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewMyWorkList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList"), tews6.wsdl.ViewMyWorkList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewMyWorkListQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkListQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListQuery"), tews6.wsdl.ViewMyWorkListQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListQueryResult"));
        oper.setReturnClass(tews6.wsdl.ViewMyWorkListQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkListQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewMyWorkList-Tab-WorkListSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkList-Tab-WorkListSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList-Tab-WorkListSearch"), tews6.wsdl.ViewMyWorkListTabWorkListSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList-Tab-WorkListSearchResult"));
        oper.setReturnClass(tews6.wsdl.ViewMyWorkListTabWorkListSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewMyWorkList-Tab-WorkListSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewUseCaseQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQuery"), tews6.wsdl.ViewUseCaseQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQueryResult"));
        oper.setReturnClass(tews6.wsdl.ViewUseCaseQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewUseCaseSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseSearch"), tews6.wsdl.ViewUseCaseSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseSearchResult"));
        oper.setReturnClass(tews6.wsdl.ViewUseCaseSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUseCaseSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewUserQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUserQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserQuery"), tews6.wsdl.ViewUserQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserQueryResult"));
        oper.setReturnClass(tews6.wsdl.ViewUserQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUserQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewUserSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUserSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserSearch"), tews6.wsdl.ViewUserSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserSearchResult"));
        oper.setReturnClass(tews6.wsdl.ViewUserSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewUserSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewWorkflowTemplateQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQuery"), tews6.wsdl.ViewWorkflowTemplateQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQueryResult"));
        oper.setReturnClass(tews6.wsdl.ViewWorkflowTemplateQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ViewWorkflowTemplateSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateSearch"), tews6.wsdl.ViewWorkflowTemplateSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateSearchResult"));
        oper.setReturnClass(tews6.wsdl.ViewWorkflowTemplateSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ViewWorkflowTemplateSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PORTALObjectsFeeder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeeder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeeder"), tews6.wsdl.PORTALObjectsFeeder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus"));
        oper.setReturnClass(tews6.wsdl.ImsStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "ImsStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PORTALObjectsFeederQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederQuery"), tews6.wsdl.PORTALObjectsFeederQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederQueryResult"));
        oper.setReturnClass(tews6.wsdl.PORTALObjectsFeederQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PORTALObjectsFeederSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederSearch"), tews6.wsdl.PORTALObjectsFeederSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederSearchResult"));
        oper.setReturnClass(tews6.wsdl.PORTALObjectsFeederSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "PORTALObjectsFeederSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TaskStatusQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext"), tews6.wsdl.TaskContext.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskStatusSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskStatusSearch"), tews6.wsdl.TaskStatusSearchFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tews6/wsdl", "Filter"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskStatusQueryResult"));
        oper.setReturnClass(tews6.wsdl.TaskStatusQueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tews6/wsdl", "TaskStatusQueryResult"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://tews6/wsdl", "ImsException"),
                      "tews6.wsdl.ImsException",
                      new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException"), 
                      true
                     ));
        _operations[55] = oper;

    }

    public Tews6SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Tews6SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Tews6SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>Accounts>add>Filter>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsAddFilterAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>Accounts>add>Filter>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsAddFilterCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>Accounts>currentvalue>Filter>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilterAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>Accounts>currentvalue>Filter>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilterCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>EndpointDetails>add>Containers>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainersAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>EndpointDetails>add>Containers>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainersCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>EndpointDetails>currentvalue>Containers>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>>OnboardAccountEndpointExploreTab>EndpointDetails>currentvalue>Containers>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainersCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>Accounts>add>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsAddFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>Accounts>currentvalue>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalueFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>EndpointDetails>add>Containers");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAddContainers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>OnboardAccountEndpointExploreTab>EndpointDetails>currentvalue>Containers");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalueContainers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>TaskStatusQueryResult>ResultItem>ImsTaskDetails>EventDetails");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetailsEventDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles>add>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRolesAddFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles>remove>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRolesRemoveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>add>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesAddFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>remove>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemoveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>add>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRolesAddFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>remove>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRolesRemoveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles>add>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRolesAddFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles>remove>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRolesRemoveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesOwnersTab>Policy>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicyAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesOwnersTab>Policy>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicyCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>comments");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemComments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>department");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDepartment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem>friendlyName");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItemFriendlyName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateWorkflowTemplateSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>CreateWorkflowTemplateSearchResult>ResultItem>wfprocessname");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchResultResultItemWfprocessname.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>DeleteWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>DeleteWorkflowTemplateSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>DeleteWorkflowTemplateSearchResult>ResultItem>wfprocessname");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchResultResultItemWfprocessname.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyUseCaseSearchResult>ResultItem>category");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItemCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyUseCaseSearchResult>ResultItem>definitionId");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItemDefinitionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyUseCaseSearchResult>ResultItem>name");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItemName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyUseCaseSearchResult>ResultItem>status");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyUseCaseSearchResult>ResultItem>tag");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItemTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyWorkflowTemplateSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ModifyWorkflowTemplateSearchResult>ResultItem>wfprocessname");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItemWfprocessname.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ACCOUNT_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ACCOUNT_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_CONTAINER_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_CONTAINER_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ENDPOINT_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem>_PCT_ENDPOINT_TYPE_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem_PCT_ENDPOINT_TYPE_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>Accounts>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>Accounts>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccountsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>EndpointDetails>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>OnboardAccountEndpointExploreTab>EndpointDetails>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetailsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>Policy>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabPolicyAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>Policy>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabPolicyCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>Policy>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabPolicyRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>RoleOwners>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabRoleOwnersAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>RoleOwners>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabRoleOwnersCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersOwnersTab>RoleOwners>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabRoleOwnersRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>comments");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemComments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>department");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDepartment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetProvisioningRoleOwnersSearchResult>ResultItem>friendlyName");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItemFriendlyName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetUserPasswordSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetUserPasswordSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetUserPasswordSearchResult>ResultItem>_PCT_LOGIN_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem_PCT_LOGIN_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetUserPasswordSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ResetUserPasswordSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TaskStatusQueryResult>ResultItem>ImsTaskDetails");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TemplateModifyContractorByManagerSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem>_PCT_LOGIN_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem_PCT_LOGIN_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipSearchResult>ResultItem>_PCT_LOGIN_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem_PCT_LOGIN_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccountsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>AllAccounts>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssignCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForChangePassword>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForChangePasswordAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForChangePassword>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForChangePasswordCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForDelete>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForDeleteAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForDelete>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForDeleteCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForResume>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForResumeAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForResume>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForResumeCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForSuspend>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForSuspendAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForSuspend>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForSuspendCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForUnAssign>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnAssignAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForUnAssign>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnAssignCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForUnlock>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnlockAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>SelectedForUnlock>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnlockCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>UserSelectedAccounts>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabUserSelectedAccountsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>UserSelectedAccounts>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabUserSelectedAccountsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem>initiator");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemInitiator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem>name");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItemName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkListWorkListTab>WorkList>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>category");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItemCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>definitionId");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItemDefinitionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>name");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItemName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>status");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUseCaseSearchResult>ResultItem>tag");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItemTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>identify");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesIdentify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>modify");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserAdminAccessRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserMemberAccessRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserMemberAccessRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserMemberAccessRoles>identify");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRolesIdentify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserMemberAccessRoles>modify");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRolesModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAccessRolesTab>UserMemberAccessRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserAdminAdminRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserAdminAdminRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserAdminAdminRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserMemberAdminRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserMemberAdminRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserAdminRolesTab>UserMemberAdminRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserDelegationTab>DelegateList>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserDelegationTabDelegateListAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserDelegationTab>DelegateList>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserDelegationTabDelegateListCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserDelegationTab>DelegateList>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserDelegationTabDelegateListRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserAdminGroups>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserAdminGroupsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserAdminGroups>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserAdminGroupsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserAdminGroups>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserAdminGroupsRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserMemberGroups>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserMemberGroupsAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserMemberGroups>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserMemberGroupsCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserGroupsTab>UserMemberGroups>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserMemberGroupsRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles>add");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRolesAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles>currentvalue");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRolesCurrentvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles>remove");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRolesRemove.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserSearchResult>ResultItem>_PCT_FIRST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem_PCT_FIRST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserSearchResult>ResultItem>_PCT_LAST_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem_PCT_LAST_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserSearchResult>ResultItem>_PCT_LOGIN_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem_PCT_LOGIN_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserSearchResult>ResultItem>_PCT_ORG_MEMBERSHIP_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem_PCT_ORG_MEMBERSHIP_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewUserSearchResult>ResultItem>_PCT_USER_ID_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem_PCT_USER_ID_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>_PCT_FRIENDLY_NAME_PCT_");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem_PCT_FRIENDLY_NAME_PCT_.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>description");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewWorkflowTemplateSearchResult>ResultItem>wfprocessname");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchResultResultItemWfprocessname.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ChangeMyPasswordProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ChangeMyPasswordProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesOwnersTab>Policy");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTabPolicy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateOwnerPoliciesForProvisioningRolesSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateCreateWorkflowTemplateTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>CreateWorkflowTemplateSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>DeleteWorkflowTemplateSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>DeleteWorkflowTemplateSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>DeleteWorkflowTemplateSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>DeleteWorkflowTemplateSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>DeleteWorkflowTemplateSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ImsException>exception");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsExceptionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ManageReportServerConnectionProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ManageReportServerConnectionSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ManageReportServerConnectionSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ManageReportServerConnectionSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyUseCaseSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyUseCaseSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyUseCaseSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyUseCaseSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyUseCaseSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateModifyWorkflowTemplateTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ModifyWorkflowTemplateSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ObjectsFeederSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ObjectsFeederSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ObjectsFeederSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccount-Tab-EndpointExploreSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccount-Tab-EndpointExploreSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccount-Tab-EndpointExploreSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccountEndpointExploreTab>Accounts");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabAccounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>OnboardAccountEndpointExploreTab>EndpointDetails");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTabEndpointDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>PORTALObjectsFeederSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>PORTALObjectsFeederSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>PORTALObjectsFeederSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersOwnersTab>Policy");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabPolicy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersOwnersTab>RoleOwners");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTabRoleOwners.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetProvisioningRoleOwnersSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ResetUserPasswordSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskContext>action");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskContextAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskStatusQueryResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusQueryResultResultItemImsTaskDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TaskStatusQueryResult>ResultItem>ImsTaskDetails");
            qName2 = new javax.xml.namespace.QName("http://tews6/wsdl", "ImsTaskDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskStatusSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateEmployeeCreationFromFeedUserProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateEmployeeSelfModificationUserProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeSelfModificationUserProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TemplateModifyContractorByManagerUserProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerUserProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipTransferDocumentOwnershipTab>SelectedAccounts");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTabSelectedAccounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>AllAccounts");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabAllAccountsCurrentvalue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>TransferDocumentOwnershipUserAccountsTab>AllAccounts>currentvalue");
            qName2 = new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForAssign");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForAssign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForChangePassword");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForChangePassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForDelete");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForResume");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForResume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForSuspend");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForSuspend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForUnAssign");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnAssign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>SelectedForUnlock");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabSelectedForUnlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TransferDocumentOwnershipUserAccountsTab>UserSelectedAccounts");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTabUserSelectedAccounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewMyWorkList-Tab-WorkListSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewMyWorkList-Tab-WorkListSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewMyWorkList-Tab-WorkListSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewMyWorkListWorkListTab>WorkList");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListWorkListTabWorkListCurrentvalue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>>ViewMyWorkListWorkListTab>WorkList>currentvalue");
            qName2 = new javax.xml.namespace.QName("http://tews6/wsdl", "currentvalue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUseCaseSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAccessRolesTab>UserAdminAccessRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserAdminAccessRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAccessRolesTab>UserMemberAccessRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTabUserMemberAccessRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>Results");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>UserAdminAdminRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserAdminAdminRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserAdminRolesTab>UserMemberAdminRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTabUserMemberAdminRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserDelegationTab>DelegateList");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserDelegationTabDelegateList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserGroupsTab>UserAdminGroups");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserAdminGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserGroupsTab>UserMemberGroups");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTabUserMemberGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProfileTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProfileTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesIndirectTab>UserAdminProvisioningRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserAdminProvisioningRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesIndirectTab>UserMemberProvisioningRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTabUserMemberProvisioningRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesTab>UserAdminProvisioningRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserAdminProvisioningRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserProvisioningRolesTab>UserMemberProvisioningRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTabUserMemberProvisioningRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewUserSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearch>Filter");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearch>Group");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearch>Organization");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchOrganization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearch>Subject");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateSearchResult>ResultItem");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchResultResultItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>ViewWorkflowTemplateViewWorkflowTemplateTab>HistoryEntry");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTabHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPassword");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ChangeMyPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ChangeMyPasswordProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ChangeMyPasswordQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ChangeMyPasswordQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ChangeMyPasswordQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfiguration");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CorrelationAttributeConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationCorrelationAttributeTagTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CorrelationAttributeConfigurationCorrelationAttributeTagTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CorrelationAttributeConfigurationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CorrelationAttributeConfigurationQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CorrelationAttributeConfigurationQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRoles");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRoles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesOwnersTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesOwnersTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateOwnerPoliciesForProvisioningRolesSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplate");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateCreateWorkflowTemplateTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateCreateWorkflowTemplateTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">CreateWorkflowTemplateSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.CreateWorkflowTemplateSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplate");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateDeleteWorkflowTemplateTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateDeleteWorkflowTemplateTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">DeleteWorkflowTemplateSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.DeleteWorkflowTemplateSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsException");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ImsStatus");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ImsStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotification");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.InboundNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationInboundNotificationTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.InboundNotificationInboundNotificationTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.InboundNotificationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">InboundNotificationQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.InboundNotificationQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnection");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ManageReportServerConnectionSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ManageReportServerConnectionSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCase");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseDeploymentXpressProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseDeploymentXpressProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseElementTabTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseElementTabTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyUseCaseSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyUseCaseSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplate");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateModifyWorkflowTemplateTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateModifyWorkflowTemplateTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ModifyWorkflowTemplateSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ModifyWorkflowTemplateSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeeder");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeeder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederFeederActionsMappingTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederFeederActionsMappingTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederRecordsDetailsTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederRecordsDetailsTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ObjectsFeederSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ObjectsFeederSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount-Tab-EndpointExploreSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccount-Tab-EndpointExploreSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">OnboardAccountEndpointExploreTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OnboardAccountEndpointExploreTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeeder");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeeder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederFeederActionsMappingTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederFeederActionsMappingTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederRecordsDetailsTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederRecordsDetailsTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">PORTALObjectsFeederSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PORTALObjectsFeederSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwners");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwners.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersOwnersTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersOwnersTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetProvisioningRoleOwnersSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetProvisioningRoleOwnersSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPassword");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ResetUserPasswordSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ResetUserPasswordSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskContext");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskStatusQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TaskStatusSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TaskStatusSearchFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">>TaskStatusSearch>Filter");
            qName2 = new javax.xml.namespace.QName("http://tews6/wsdl", "Filter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeCreationFromFeed");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeCreationFromFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeCreationFromFeedUserProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeCreationFromFeedUserProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModification");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeSelfModification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModificationQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeSelfModificationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModificationQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeSelfModificationQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateEmployeeSelfModificationUserProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateEmployeeSelfModificationUserProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManager");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManager.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TemplateModifyContractorByManagerUserProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TemplateModifyContractorByManagerUserProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnership.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipTransferDocumentOwnershipTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipTransferDocumentOwnershipTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">TransferDocumentOwnershipUserAccountsTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.TransferDocumentOwnershipUserAccountsTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList-Tab-WorkListSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkList-Tab-WorkListSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListTabWorkListSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewMyWorkListWorkListTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewMyWorkListWorkListTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseDeploymentXpressProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseDeploymentXpressProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseElementTabTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseElementTabTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUseCaseSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUseCaseSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserAccessRolesTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAccessRolesTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserAdminRolesTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserAdminRolesTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserDelegationTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserDelegationTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserGroupsTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserGroupsTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserProfileTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProfileTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserProvisioningRolesIndirectTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesIndirectTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserProvisioningRolesTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserProvisioningRolesTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewUserSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewUserSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQuery");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateQueryResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateSearch");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateSearchResult");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", ">ViewWorkflowTemplateViewWorkflowTemplateTab");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ViewWorkflowTemplateViewWorkflowTemplateTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "ConjunctionType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.ConjunctionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "OperatorType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.OperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://tews6/wsdl", "PermissionType");
            cachedSerQNames.add(qName);
            cls = tews6.wsdl.PermissionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public tews6.wsdl.ImsStatus objectsFeeder(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ObjectsFeeder objectsFeederPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ObjectsFeederSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ObjectsFeeder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, objectsFeederPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ObjectsFeederQueryResult objectsFeederQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ObjectsFeederQuery objectsFeederQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ObjectsFeederQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ObjectsFeederQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, objectsFeederQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ObjectsFeederQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ObjectsFeederQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ObjectsFeederQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ObjectsFeederSearchResult objectsFeederSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ObjectsFeederSearch objectsFeederSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ObjectsFeederSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ObjectsFeederSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, objectsFeederSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ObjectsFeederSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ObjectsFeederSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ObjectsFeederSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus changeMyPassword(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ChangeMyPassword changeMyPasswordPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMyPasswordSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMyPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, changeMyPasswordPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ChangeMyPasswordQueryResult changeMyPasswordQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ChangeMyPasswordQuery changeMyPasswordQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ChangeMyPasswordQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeMyPasswordQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, changeMyPasswordQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ChangeMyPasswordQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ChangeMyPasswordQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ChangeMyPasswordQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus correlationAttributeConfiguration(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CorrelationAttributeConfiguration correlationAttributeConfigurationPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CorrelationAttributeConfigurationSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CorrelationAttributeConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, correlationAttributeConfigurationPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.CorrelationAttributeConfigurationQueryResult correlationAttributeConfigurationQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CorrelationAttributeConfigurationQuery correlationAttributeConfigurationQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CorrelationAttributeConfigurationQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CorrelationAttributeConfigurationQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, correlationAttributeConfigurationQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.CorrelationAttributeConfigurationQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.CorrelationAttributeConfigurationQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.CorrelationAttributeConfigurationQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus createOwnerPoliciesForProvisioningRoles(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CreateOwnerPoliciesForProvisioningRoles createOwnerPoliciesForProvisioningRolesPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateOwnerPoliciesForProvisioningRolesSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateOwnerPoliciesForProvisioningRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, createOwnerPoliciesForProvisioningRolesPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult createOwnerPoliciesForProvisioningRolesQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQuery createOwnerPoliciesForProvisioningRolesQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateOwnerPoliciesForProvisioningRolesQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateOwnerPoliciesForProvisioningRolesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, createOwnerPoliciesForProvisioningRolesQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult createOwnerPoliciesForProvisioningRolesSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearch createOwnerPoliciesForProvisioningRolesSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateOwnerPoliciesForProvisioningRolesSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateOwnerPoliciesForProvisioningRolesSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, createOwnerPoliciesForProvisioningRolesSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.CreateOwnerPoliciesForProvisioningRolesSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus createWorkflowTemplate(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CreateWorkflowTemplate createWorkflowTemplatePart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateWorkflowTemplateSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateWorkflowTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, createWorkflowTemplatePart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.CreateWorkflowTemplateSearchResult createWorkflowTemplateSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.CreateWorkflowTemplateSearch createWorkflowTemplateSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CreateWorkflowTemplateSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateWorkflowTemplateSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, createWorkflowTemplateSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.CreateWorkflowTemplateSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.CreateWorkflowTemplateSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.CreateWorkflowTemplateSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus deleteWorkflowTemplate(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.DeleteWorkflowTemplate deleteWorkflowTemplatePart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteWorkflowTemplateSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteWorkflowTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, deleteWorkflowTemplatePart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.DeleteWorkflowTemplateQueryResult deleteWorkflowTemplateQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.DeleteWorkflowTemplateQuery deleteWorkflowTemplateQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteWorkflowTemplateQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteWorkflowTemplateQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, deleteWorkflowTemplateQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.DeleteWorkflowTemplateQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.DeleteWorkflowTemplateQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.DeleteWorkflowTemplateQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.DeleteWorkflowTemplateSearchResult deleteWorkflowTemplateSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.DeleteWorkflowTemplateSearch deleteWorkflowTemplateSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteWorkflowTemplateSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteWorkflowTemplateSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, deleteWorkflowTemplateSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.DeleteWorkflowTemplateSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.DeleteWorkflowTemplateSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.DeleteWorkflowTemplateSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus templateEmployeeCreationFromFeed(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateEmployeeCreationFromFeed templateEmployeeCreationFromFeedPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateEmployeeCreationFromFeedSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateEmployeeCreationFromFeed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateEmployeeCreationFromFeedPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus templateEmployeeSelfModification(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateEmployeeSelfModification templateEmployeeSelfModificationPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateEmployeeSelfModificationSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateEmployeeSelfModification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateEmployeeSelfModificationPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TemplateEmployeeSelfModificationQueryResult templateEmployeeSelfModificationQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateEmployeeSelfModificationQuery templateEmployeeSelfModificationQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateEmployeeSelfModificationQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateEmployeeSelfModificationQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateEmployeeSelfModificationQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TemplateEmployeeSelfModificationQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TemplateEmployeeSelfModificationQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TemplateEmployeeSelfModificationQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus inboundNotification(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.InboundNotification inboundNotificationPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("InboundNotificationSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "InboundNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, inboundNotificationPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.InboundNotificationQueryResult inboundNotificationQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.InboundNotificationQuery inboundNotificationQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("InboundNotificationQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "InboundNotificationQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, inboundNotificationQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.InboundNotificationQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.InboundNotificationQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.InboundNotificationQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus templateModifyContractorByManager(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateModifyContractorByManager templateModifyContractorByManagerPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateModifyContractorByManagerSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateModifyContractorByManager"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateModifyContractorByManagerPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TemplateModifyContractorByManagerQueryResult templateModifyContractorByManagerQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateModifyContractorByManagerQuery templateModifyContractorByManagerQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateModifyContractorByManagerQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateModifyContractorByManagerQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateModifyContractorByManagerQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TemplateModifyContractorByManagerQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TemplateModifyContractorByManagerQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TemplateModifyContractorByManagerQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TemplateModifyContractorByManagerSearchResult templateModifyContractorByManagerSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TemplateModifyContractorByManagerSearch templateModifyContractorByManagerSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TemplateModifyContractorByManagerSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TemplateModifyContractorByManagerSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, templateModifyContractorByManagerSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TemplateModifyContractorByManagerSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TemplateModifyContractorByManagerSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TemplateModifyContractorByManagerSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus modifyUseCase(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyUseCase modifyUseCasePart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyUseCaseSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyUseCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyUseCasePart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ModifyUseCaseQueryResult modifyUseCaseQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyUseCaseQuery modifyUseCaseQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyUseCaseQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyUseCaseQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyUseCaseQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ModifyUseCaseQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ModifyUseCaseQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ModifyUseCaseQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ModifyUseCaseSearchResult modifyUseCaseSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyUseCaseSearch modifyUseCaseSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyUseCaseSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyUseCaseSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyUseCaseSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ModifyUseCaseSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ModifyUseCaseSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ModifyUseCaseSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus modifyWorkflowTemplate(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyWorkflowTemplate modifyWorkflowTemplatePart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyWorkflowTemplateSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyWorkflowTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyWorkflowTemplatePart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ModifyWorkflowTemplateQueryResult modifyWorkflowTemplateQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyWorkflowTemplateQuery modifyWorkflowTemplateQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyWorkflowTemplateQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyWorkflowTemplateQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyWorkflowTemplateQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ModifyWorkflowTemplateQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ModifyWorkflowTemplateQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ModifyWorkflowTemplateQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ModifyWorkflowTemplateSearchResult modifyWorkflowTemplateSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ModifyWorkflowTemplateSearch modifyWorkflowTemplateSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ModifyWorkflowTemplateSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifyWorkflowTemplateSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, modifyWorkflowTemplateSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ModifyWorkflowTemplateSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ModifyWorkflowTemplateSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ModifyWorkflowTemplateSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus onboardAccount(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.OnboardAccount onboardAccountPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("OnboardAccountSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OnboardAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, onboardAccountPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult onboardAccountTabEndpointExploreSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.OnboardAccountTabEndpointExploreSearch onboardAccountTabEndpointExploreSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("OnboardAccount-Tab-EndpointExploreSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OnboardAccount-Tab-EndpointExploreSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, onboardAccountTabEndpointExploreSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.OnboardAccountTabEndpointExploreSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus manageReportServerConnection(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ManageReportServerConnection manageReportServerConnectionPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageReportServerConnectionSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageReportServerConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, manageReportServerConnectionPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ManageReportServerConnectionSearchResult manageReportServerConnectionSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ManageReportServerConnectionSearch manageReportServerConnectionSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ManageReportServerConnectionSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageReportServerConnectionSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, manageReportServerConnectionSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ManageReportServerConnectionSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ManageReportServerConnectionSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ManageReportServerConnectionSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus resetProvisioningRoleOwners(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetProvisioningRoleOwners resetProvisioningRoleOwnersPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetProvisioningRoleOwnersSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetProvisioningRoleOwners"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetProvisioningRoleOwnersPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ResetProvisioningRoleOwnersQueryResult resetProvisioningRoleOwnersQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetProvisioningRoleOwnersQuery resetProvisioningRoleOwnersQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetProvisioningRoleOwnersQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetProvisioningRoleOwnersQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetProvisioningRoleOwnersQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ResetProvisioningRoleOwnersQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ResetProvisioningRoleOwnersQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ResetProvisioningRoleOwnersQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ResetProvisioningRoleOwnersSearchResult resetProvisioningRoleOwnersSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetProvisioningRoleOwnersSearch resetProvisioningRoleOwnersSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetProvisioningRoleOwnersSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetProvisioningRoleOwnersSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetProvisioningRoleOwnersSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ResetProvisioningRoleOwnersSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ResetProvisioningRoleOwnersSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ResetProvisioningRoleOwnersSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus resetUserPassword(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetUserPassword resetUserPasswordPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetUserPasswordSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetUserPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetUserPasswordPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ResetUserPasswordQueryResult resetUserPasswordQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetUserPasswordQuery resetUserPasswordQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetUserPasswordQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetUserPasswordQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetUserPasswordQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ResetUserPasswordQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ResetUserPasswordQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ResetUserPasswordQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ResetUserPasswordSearchResult resetUserPasswordSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ResetUserPasswordSearch resetUserPasswordSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ResetUserPasswordSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResetUserPasswordSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, resetUserPasswordSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ResetUserPasswordSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ResetUserPasswordSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ResetUserPasswordSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus transferDocumentOwnership(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TransferDocumentOwnership transferDocumentOwnershipPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransferDocumentOwnershipSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransferDocumentOwnership"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, transferDocumentOwnershipPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TransferDocumentOwnershipQueryResult transferDocumentOwnershipQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TransferDocumentOwnershipQuery transferDocumentOwnershipQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransferDocumentOwnershipQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransferDocumentOwnershipQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, transferDocumentOwnershipQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TransferDocumentOwnershipQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TransferDocumentOwnershipQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TransferDocumentOwnershipQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TransferDocumentOwnershipSearchResult transferDocumentOwnershipSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TransferDocumentOwnershipSearch transferDocumentOwnershipSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransferDocumentOwnershipSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransferDocumentOwnershipSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, transferDocumentOwnershipSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TransferDocumentOwnershipSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TransferDocumentOwnershipSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TransferDocumentOwnershipSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult transferDocumentOwnershipTabTransferDocumentOwnershipSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearch transferDocumentOwnershipTabTransferDocumentOwnershipSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransferDocumentOwnership-Tab-TransferDocumentOwnershipSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, transferDocumentOwnershipTabTransferDocumentOwnershipSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TransferDocumentOwnershipTabTransferDocumentOwnershipSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus viewMyWorkList(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewMyWorkList viewMyWorkListPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewMyWorkListSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewMyWorkList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewMyWorkListPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewMyWorkListQueryResult viewMyWorkListQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewMyWorkListQuery viewMyWorkListQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewMyWorkListQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewMyWorkListQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewMyWorkListQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewMyWorkListQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewMyWorkListQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewMyWorkListQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewMyWorkListTabWorkListSearchResult viewMyWorkListTabWorkListSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewMyWorkListTabWorkListSearch viewMyWorkListTabWorkListSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewMyWorkList-Tab-WorkListSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewMyWorkList-Tab-WorkListSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewMyWorkListTabWorkListSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewMyWorkListTabWorkListSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewMyWorkListTabWorkListSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewMyWorkListTabWorkListSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewUseCaseQueryResult viewUseCaseQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewUseCaseQuery viewUseCaseQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewUseCaseQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewUseCaseQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewUseCaseQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewUseCaseQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewUseCaseQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewUseCaseQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewUseCaseSearchResult viewUseCaseSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewUseCaseSearch viewUseCaseSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewUseCaseSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewUseCaseSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewUseCaseSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewUseCaseSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewUseCaseSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewUseCaseSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewUserQueryResult viewUserQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewUserQuery viewUserQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewUserQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewUserQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewUserQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewUserQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewUserQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewUserQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewUserSearchResult viewUserSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewUserSearch viewUserSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewUserSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewUserSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewUserSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewUserSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewUserSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewUserSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewWorkflowTemplateQueryResult viewWorkflowTemplateQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewWorkflowTemplateQuery viewWorkflowTemplateQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewWorkflowTemplateQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewWorkflowTemplateQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewWorkflowTemplateQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewWorkflowTemplateQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewWorkflowTemplateQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewWorkflowTemplateQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ViewWorkflowTemplateSearchResult viewWorkflowTemplateSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.ViewWorkflowTemplateSearch viewWorkflowTemplateSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ViewWorkflowTemplateSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ViewWorkflowTemplateSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, viewWorkflowTemplateSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ViewWorkflowTemplateSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ViewWorkflowTemplateSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ViewWorkflowTemplateSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.ImsStatus PORTALObjectsFeeder(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.PORTALObjectsFeeder PORTALObjectsFeederPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PORTALObjectsFeederSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PORTALObjectsFeeder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, PORTALObjectsFeederPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.ImsStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.ImsStatus) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.ImsStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.PORTALObjectsFeederQueryResult PORTALObjectsFeederQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.PORTALObjectsFeederQuery PORTALObjectsFeederQueryPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PORTALObjectsFeederQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PORTALObjectsFeederQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, PORTALObjectsFeederQueryPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.PORTALObjectsFeederQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.PORTALObjectsFeederQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.PORTALObjectsFeederQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.PORTALObjectsFeederSearchResult PORTALObjectsFeederSearch(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.PORTALObjectsFeederSearch PORTALObjectsFeederSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PORTALObjectsFeederSearchSoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PORTALObjectsFeederSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, PORTALObjectsFeederSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.PORTALObjectsFeederSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.PORTALObjectsFeederSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.PORTALObjectsFeederSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tews6.wsdl.TaskStatusQueryResult taskStatusQuery(tews6.wsdl.TaskContext taskContextPart, tews6.wsdl.TaskStatusSearchFilter[] taskStatusSearchPart) throws java.rmi.RemoteException, tews6.wsdl.ImsException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TaskStatusQuerySoap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TaskStatusQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskContextPart, taskStatusSearchPart});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tews6.wsdl.TaskStatusQueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (tews6.wsdl.TaskStatusQueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, tews6.wsdl.TaskStatusQueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tews6.wsdl.ImsException) {
              throw (tews6.wsdl.ImsException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
