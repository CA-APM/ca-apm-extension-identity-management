# CA Identity Management Extension

# Description
This (Infrastructure) agent extension provides availability and functional checks against CA Identity Manager and CA Advanced Authentication using the SOAP APIs provided by the two solutions.

## Short Description
This agent extension provides availability and functional checks against CA Identity Manager and CA Advanced Authentication.

## APM version
Test with CA APM 10.7.

## Supported third party versions
CA Identity Manager 12.6.8
CA Advanced Authentication

## Limitations
* This extensions provides two sample checks against CA Identity Manager and CA Advanced Authentication. It contains java classes generated with Axis 1.4 wsdl2java for all API calls in the included wsdls. Additional checks, however, must be implemented as explained in this documentation and the sample code provided.
* Currently there is no support for CA APM Team Center (ATC).


## License
[Eclipse Public License - v 1.0](LICENSE)

# Installation Instructions

## Prerequisites
* You need to install [CA APM Infrastructure Agent  10.7](https://docops.ca.com/ca-apm/10-7/en/implementing-agents/infrastructure-agent). It does not have to be on a specific server. It is recommended to isntall on a server in the same subnet as the monitored identity management servers.
* Open firewall ports:
  * From CA APM Infrastructure Agent to CA APM Enterprise Managers (MOM and collectors): port 5001
  * From the CA APM Infrastructure Agent to web service ports of the identity management servers. See all parameters ending in `url` below.

## Dependencies
[CA APM Infrastructure Agent 10.7](https://docops.ca.com/ca-apm/10-7/en/implementing-agents/infrastructure-agent).

## Installation
1. Extract `im-monitor-<version>-dist.tar.gz`
2. Copy `post-10.5/im-monitor.tar.gz` to `${AGENT_HOME}/extensions/deploy` of your CA APM 10.5 or 10.7 Infrastructure Agent.
3. Restart the Infrastructure Agent.
4. Copy `copy-to-em/deploy/CAIdentityManagementMM.jar` to the `${EM_HOME}/deploy` directory of your CA APM MOM (Enterprise Manager).

## Configuration
The file `extensions/im-monitor/bundle.properties` contains the configuration of the Identity Manager Extension.

### Logging
There are two properties that configure logging for the Identity Manager Extension:
* `log4j.logger.IntroscopeAgent.ext.im-monitor=INFO, logfile`: to increase the log level set this property to `DEBUG`. This will only apply to the extension logging and not the agent in general. You can also redirect the logging of the extension into a different fiel or appender. This appender has to be defined here or in `IntroscopeAgent.profile`. See [Log4J](https://logging.apache.org/log4j) for more information.
* `log4j.additivity.IntroscopeAgent.ext.im-monitor=false`: *do not change this property* to avoid duplicate logging at both the extension and root loggers!

### CA Identity Manager: Reset User Password example
The *CA Identity Manager - Reset User Password example* has the following properties:
* `im.resetUserPassword.enabled=true`: enables/disables this check
* `im.url=http://localhost:8080/iam/im/TEWS6/identityEnv`: the URL for the CA Identity Manager TEWS API
* `#im.authorization.user=`: the user needed for (basic http) authorization, if empty or commented out no authentication header is sent
* `#im.authorization.password=`: the encrypted password needed for (basic http) authorization
* `im.admin.user=imadmin`: a CA Identity Manager user that may perform the request
* `im.admin.password=interOP@123`: the password of the a CA Identity Manager user that may perform the request
* `im.resetUserPassword.user=auser01`: the user whose password will be reset
* `im.resetUserPassword.password=test@1234`: the new password
* `im.resetUserPassword.pause.before.transaction.check=5000`: the pause between the password reset request and the task status request (in ms, default: 5s)
* `im.resetUserPassword.interval=30000`: the interval for the check (in ms, default: 30s)

### CA Advanced Authentication: Get User Status example
The *CA Advanced Authentication - Get User Status example* has the following properties:
* `arcot.getUserStatus.enabled=true`: enables/disables this check
* `arcot.userRegistry.url=http://localhost:9080/arcotuds/services/ArcotUserRegistrySvc`: the URL for the CA Advanced Authentication User Registry Service
* `arcot.getUserStatus.orgName=DEFAULTORG`: the organization of the user to check
* `arcot.getUserStatus.userName=AUSER1`: the username of the user to check
* `arcot.getUserStatus.userRefId=2`: the user reference id of the user to check
* `arcot.getUserStatus.interval=30000`: the interval for the check (in ms, default: 30s)

### CA Advanced Authentication: other service URLs
These CA Advanced Authentication service have no examples
* `arcot.configRegistry.url=http://localhost:8080/arcotuds/services/ArcotConfigRegistrySvc`
* `arcot.userRegistryMgmt.url=http://localhost:9080/arcotuds/services/ArcotUserRegistryMgmtSvc`
* `arcot.riskFort.admin.url=http://localhost:8080/axis2/services/ArcotRiskFortAdminSvc`
* `arcot.riskFort.evaluate.url=http://localhost:7778/services/RiskFortEvaluateRiskSvc`
* `arcot.webfort.admin.url=http://localhost:9744/services/WebFortAdminSvc`
* `arcot.webfort.auth.url=http://localhost:8080/services/WebFortAuthSvc`
* `arcot.webfort.bulk.url=http://localhost:8080/services/WebFortBulkOperationsSvc`
* `arcot.webfort.issuance.url=http://localhost:8080/services/WebFortIssuanceSvc`

### Encrypting Passwords
To encrypt a password run `java -cp lib/EPAgent.jar -jar extensions/im-monitor/lib/im-monitor.jar <password>` from the Infrastructure agent directory.

# Usage Instructions
Configure the examples as shown above matching your environment and (re-) start the Infrastructure agent.

## Metric description
Metrics will appear under Infrastructure agent.

### CA Identity Manager
Metrics for each CA Identity Manager request are shown under the node "CA Identity Manager" in the metric viewer.

For each request the following nodes are shown:
* Request: metrics of the request (e.g. `CA Identity Manager|Reset User Password|Request`)
  * Duration: the duration of the request
  * Error Code: the error code of the request (0 if no error, 1 if no specific error code provided)
  * Last Completed: the timestamp when the last request was completed (string, only in live mode)
  * Status: the status of the request (1 ok, 2 warning, 3 danger)
  * Status Message: the status message (string, only in live mode)
* Task: metrics of the task status query for this request/transaction
  * Error Code: the error code of the request (0 if no error, 1 if no specific error code provided)
  * Last Completed: the timestamp when the task was completed (string, only in live mode)
  * Status: the status of the task (1 ok, 2 warning, 3 danger)
  * Status Message: the status message (string, only in live mode)
* Events: every task can have one or several events, for each event the name of the event is shown with the following metrics:
  * Error Code: the error code of the request (0 if no error, 1 if no specific error code provided)
  * Last Completed: the timestamp when the event was completed (string, only in live mode)
  * Status: the status of the event (1 ok, 2 warning, 3 danger)
  * Status Message: the status message (string, only in live mode)

### CA Advanced Authentication
Metrics for each CA Advanced Authentication request are shown under the node "CA Advanced Authentication" in the metric viewer.

For each request the following nodes are shown:
* Request: metrics of the request (e.g. `CA Advanced Authentication|Get User Status|Request`)
  * Duration: the duration of the request
  * Error Code: the error code of the request (0 if no error, 1 if no specific error code provided)
  * Last Completed: the timestamp when the last request was completed (string, only in live mode)
  * Status: the status of the request (1 ok, 2 warning, 3 danger)
  * Status Message: the status message (string, only in live mode)

There are no tasks or events for CA Advanced Authentication.

### Sustainability Metrics
For each request there is a counter metric, e.g.:
* `Agent Stats|Sustainability|CA Advanced Authentication|Get User Status:Request`
* `Agent Stats|Sustainability|CA Identity Manager|Reset User Password:Request`

## Custom Management Modules
The Management Module `CA Identity Manager and Advanced Authentication` (`CAIdentityManagerMM.jar`) contains the following elements:

## Agent Expression
The Management Module agent expression is `(.*)\|(Infrastructure|EPAgent)\|(.*)`. If you don't see metrics in the dashboard check the name of your Infrastructure agent and change the agent expression accordingly.

### Metric Groupings
* CA Advanced Authentication Duration
* CA Advanced Authentication Status
* CA Advanced Authentication Status Message
* CA Identity Manager Duration
* CA Identity Manager Status
* CA Identity Manager Status Message

### Alerts
* CA Advanced Authentication Status: warning > 1, danger > 2
* CA Identity Manager Status: warning > 1, danger > 2

### Dashboards
* CA Identity Management Overview: contains the two alert stati, graphs for the stati and lists of the status messages.

## Custom type viewers
n/a

## Debugging and Troubleshooting
* All log messages from this extension are prefixed with `[IntroscopeAgent.ext.im-monitor]`.
* If no metrics appear in the metric viewer check the `IntroscopeAgent.log` for log messages with level `WARN` or `ERROR`.
* Verify the configuration of the extension in `extensions/im-monitor/bundle.properties`.
* To increase the log level set `log4j.logger.IntroscopeAgent.ext.im-monitor=DEBUG, logfile` in `extensions/im-monitor/bundle.properties`. This will only apply to log messages from this extension and not the agent in general.

## Support
This document and associated tools are made available from CA Technologies as examples and provided at no charge as a courtesy to the CA APM Community at large. This resource may require modification for use in your environment. However, please note that this resource is not supported by CA Technologies, and inclusion in this site should not be construed to be an endorsement or recommendation by CA Technologies. These utilities are not covered by the CA Technologies software license agreement and there is no explicit or implied warranty from CA Technologies. They can be used and distributed freely amongst the CA APM Community, but not sold. As such, they are unsupported software, provided as is without warranty of any kind, express or implied, including but not limited to warranties of merchantability and fitness for a particular purpose. CA Technologies does not warrant that this resource will meet your requirements or that the operation of the resource will be uninterrupted or error free or that any defects will be corrected. The use of this resource implies that you understand and agree to the terms listed herein.

Although these utilities are unsupported, please let us know if you have any problems or questions by adding a comment to the CA APM Community Site area where the resource is located, so that the Author(s) may attempt to address the issue or question.

Unless explicitly stated otherwise this extension is only supported on the same platforms as the APM core agent. See [APM Compatibility Guide](http://www.ca.com/us/support/ca-support-online/product-content/status/compatibility-matrix/application-performance-management-compatibility-guide.aspx).

### Support URL
https://github.com/CA-APM/ca-apm-extension-identity-management/issues

# Contributing
The [CA APM Community](https://communities.ca.com/community/ca-apm) is the primary means of interfacing with other users and with the CA APM product team.  The [developer subcommunity](https://communities.ca.com/community/ca-apm/ca-developer-apm) is where you can learn more about building APM-based assets, find code examples, and ask questions of other developers and the CA APM product team.

If you wish to contribute to this or any other project, please refer to [easy instructions](https://communities.ca.com/docs/DOC-231150910) available on the CA APM Developer Community.

## Code Overview
Most of the code was generated with Axis 1.4 `wsdl2java` from the WDSLs of the CA Identity Manager (`tews.wsdl.*`) and CA Advanced Authentication (`com.arcot.*`) APIs.

The custom code is in the packages `com.ca.apm.extensions.im.service` and `com.ca.apm.extensions.arcot.service`. The structure is very similar:
* An agent service (`ImService` and `ArcotService`) as the entry point for the extension.
* An abstract task base class (`AIdentityManagerTask` and `AAdvancedAuthenticationTask`) as template for a check.
* An example check task class (`ResetUserPasswordTask` and `GetUserStatusTask`)

### Agent Service
The agent service classes implement the `IAgentService` and `IDynamicService` interfaces by extending the `ADynamicSerive` class. Their main purpose is to:
* start the extension (`IAgentService_startService()`), initialize the Axis classes and register the check tasks (`registerTasks()`)
* stop the extension (`IAgentService_stopService()`), stop the tasks
* provide access to shared resource like the logger, the agent, the Axis services (`get...Service()`), ...
* some constants (e.g. property names)

You need to add code to create and register new tasks in `registerTasks()`.

### Abstract Task Class
The abstract tasks provide all the reusable functionality for the tasks:
* the task main method (`ITimestampedRunnable_execute()` similar to `Thread.run()`)
* sending metrics
* error handling
* `AIdentityManagerTask` also makes the task status query request

### Custom Task classes
The custom tasks extend the respective base class and need only implement the specific API calls by using the Axis services provided by the agent service class.

You only have to implement `makeRequest()` by constructing the request object from the properties in the configuration file, making the call to the API and returning a status object (for CA Identity Manager this is the object returned by the request itself). Everything else is already taken care of.


## Categories
Integration, Examples, Packaged Applications


# Change log
Changes for each version of the extension.

Version | Author | Comment
--------|--------|--------
1.0 | CA Technologies | First version of the extension.
