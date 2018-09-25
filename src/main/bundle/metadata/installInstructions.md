# ${artifactId} (${version})

## Description
Provide a short description of the field pack here. See [Mastering Markdown](https://guides.github.com/features/mastering-markdown/) for markdown syntax.

# Installation Instructions
How to install the field pack.

## Prerequisites
What has to be done before installing the field pack.

## Dependencies
APM and third party dependencies. E.g. APM agent 9.1+, SOA (web services) extension 9.1+

## Installation
Copy the pbd file to <AGENT_HOME>/core/config, copy the jar file to <AGENT_HOME>/core/ext and add the pbd filename to either a pbl file (e.g. tomcat-typical.pbl) or to the property introscope.autoprobe.directivesFile in your IntroscopeAgent.profile.

This archive may contain a file wily/config/IntroscopeAgent.${artifactId}.profile. In APM 10.2 ACC will only use a file called IntroscopeAgent.profile. The file is named differently in order to avoid inadvertently overwriting the real IntroscopeAgent.profile when manually extracting the archive. In order for ACC to handle that file as designed this file has to be renamed in the archive.

## Configuration
How to configure the field pack.


# Usage Instructions
How to use the field pack.

## Metric description
Describe the metrics provided by this field pack or link to third party documentation.

## Custom Management Modules
Dashboards, etc. included with this field pack.

## Custom type viewers
Type viewers included with this field pack. Include agent and metric path that the type viewer matches against.

## Name Formatter Replacements
If the field pack includes name formatters cite all place holders here and what they are replaced with.

## Debugging and Troubleshooting
How to debug and troubleshoot the field pack.
