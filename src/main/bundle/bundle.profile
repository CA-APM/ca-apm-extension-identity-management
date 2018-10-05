#<preamble>
########################################################################
#
# Introscope Agent Configuration for ${artifactId} {$version}
#
# Author: ${user.name} (first.last@ca.com)
# Date: ${date}
# Version: ${version}
# Changes:
#     DATE     |       AUTHOR        |       COMMENTS
#-----------------------------------------------------------------------
#  2018-09-19  | Guenter Grossberger | Initial version
########################################################################
#</preamble>

#<property type="string">
# log level for CA Identity Manager extension (default: INFO)
#</property>
log4j.logger.IntroscopeAgent.ext.im-monitor=INFO, logfile

#<property type="boolean">
# log additivy for CA Identity Manager extension (default false)
#</property>
log4j.additivity.IntroscopeAgent.ext.im-monitor=false


#<property type="boolean">
# Send reset user password request?
#</property>
im.resetUserPassword.enabled=true

#<property type="string">
# URL of CA Identity Manager
#</property>
im.url=http://localhost:8080/iam/im/TEWS6/identityEnv

#<property type="string">
# user for authorization with CA Identity Manager
#</property>
#im.authorization.user=

#<property type="string">
# password for authorization with CA Identity Manager
#</property>
#im.authorization.password=

#<property type="string">
# CA Identity Manager admin user
#</property>
im.admin.user=imadmin

#<property type="string">
# password for CA Identity Manager admin user
#</property>
im.admin.password=secret

#<property type="string">
# CA Identity Manager user to reset password for
#</property>
im.resetUserPassword.user=auser01

#<property type="string">
# CA Identity Manager new password for user im.resetUserPassword.user
#</property>
im.resetUserPassword.password=test@1234

#<property type="integer">
# Milliseconds to wait before checking transaction status after request.
#</property>
im.resetUserPassword.pause.before.transaction.check=5000

#<property type="integer">
# Milliseconds to wait between consecutive requests.
#</property>
im.resetUserPassword.interval=30000


#<property type="boolean">
# Send get user status request.
#</property>
arcot.getUserStatus.enabled=true

#<property type="string">
# URL of CA Advanced Authentication user registry service.
#</property>
arcot.userRegistry.url=http://localhost:9080/arcotuds/services/ArcotUserRegistrySvc

#<property type="string">
# CA Advanced Authentication org name for get user status
#</property>
arcot.getUserStatus.orgName=DEFAULTORG

#<property type="string">
# CA Advanced Authentication user name for get user status
#</property>
arcot.getUserStatus.userName=AUSER1

#<property type="integer">
# CA Advanced Authentication user ref id for get user status
#</property>
arcot.getUserStatus.userRefId=2

#<property type="integer">
# Milliseconds to wait between consecutive requests.
#</property>
arcot.getUserStatus.interval=60000


#<property type="string">
# URL of CA Advanced Authentication RiskFort evaluation service.
#</property>
arcot.riskFort.evaluate.url=http://localhost:7778/services/RiskFortEvaluateRiskSvc

#<property type="boolean">
# Send evaluate risk request.
#</property>
arcot.evaluateRisk.enabled=true

#<property type="string">
# CA Advanced Authentication org name for evaluate risk
#</property>
arcot.evaluateRisk.orgName=DEFAULTORG

#<property type="string">
# CA Advanced Authentication user name for evaluate risk
#</property>
arcot.evaluateRisk.userName=AUSER1

#<property type="integer">
# Milliseconds to wait between consecutive requests.
#</property>
arcot.evaluateRisk.interval=60000


#<property type="string">
# URL of CA Advanced Authentication WebFort issuance service.
#</property>
arcot.webfort.issuance.url=http://localhost:9744/services/WebFortIssuanceSvc

#<property type="boolean">
# Send fetch credential request.
#</property>
arcot.fetchCredential.enabled=true

#<property type="string">
# CA Advanced Authentication org name for fetch credential
#</property>
arcot.fetchCredential.orgName=DEFAULTORG

#<property type="string">
# CA Advanced Authentication user name for fetch credential
#</property>
arcot.fetchCredential.userName=AUSER1

#<property type="integer">
# Milliseconds to wait between consecutive requests.
#</property>
arcot.fetchCredential.interval=60000


#<property type="string">
# URL of CA Advanced Authentication configuration registry service.
#</property>
arcot.configRegistry.url=http://localhost:8080/arcotuds/services/ArcotConfigRegistrySvc
                        
#<property type="string">
# URL of CA Advanced Authentication user registry management service.
#</property>
arcot.userRegistryMgmt.url=http://localhost:8080/arcotuds/services/ArcotUserRegistryMgmtSvc
                        
#<property type="string">
# URL of CA Advanced Authentication RiskFort administration service.
#</property>
arcot.riskFort.admin.url=http://localhost:8080/axis2/services/ArcotRiskFortAdminSvc

#<property type="string">
# URL of CA Advanced Authentication WebFort administration service.
#</property>
arcot.webfort.admin.url=http://localhost:8080/services/WebFortAdminSvc
                        
#<property type="string">
# URL of CA Advanced Authentication WebFort Authentication service.
#</property>
arcot.webfort.auth.url=http://localhost:8080/services/WebFortAuthSvc
                        
#<property type="string">
# URL of CA Advanced Authentication WebFort bulk operations service.
#</property>
arcot.webfort.bulk.url=http://localhost:8080/services/WebFortBulkOperationsSvc
