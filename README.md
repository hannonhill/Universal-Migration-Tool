## Migration Tool

This is an open-source content migration tool for importing existing web content into [Cascade Server](http://www.hannonhill.com/products/).

The tool assumes an export from your existing CMS that contains 1 file per page. The content needs to be structured such that the Migration Tool can pull content out using `id`s, `class`es and/or XPath expressions.

## Downloads

You can download the binary and source versions in the [releases area](https://github.com/hannonhill/Universal-Migration-Tool/releases)

## Requirements

Due to an issue [#2](https://github.com/hannonhill/Universal-Migration-Tool/issues/2) with file paths on Windows, this tool should be run in a *nix environment.

Oracle Java 1.6/1.7 JRE or JDK is required

Cascade Server's [Web Service API](http://www.hannonhill.com/kb/Web-Services/) needs to be reachable from the server that is hosting the Migration Tool.

## Installation

1. Download and unpack version of the tool that corresponds to the version of Cascade Server that you're running.
1. Ensure that either `JRE_HOME` or `JAVA_HOME` is set in your `PATH` and points to your installed Oracle Java version, _or_
1. Add a `JRE_HOME` or `JAVA_HOME` environment variable to `bin/catalina.sh` [around this line](https://github.com/hannonhill/Universal-Migration-Tool/blob/7f4f551f7c4f36c8155b48113ad2ad5fc37ffc8c/tomcat/bin/catalina.sh#L81)
1. Ensure that the `tomcat` directory contains a `logs` directory and create one if it does not exist
1. Start Tomcat by running from a shell: `bin/startup.sh`
1. Once you see `INFO: Server startup in 1676 ms` in the `logs/catalina.out` the tool should be reachable at: `http://localhost:8081` (or whatever hostname is used to reach this machine)


### Deploying locally for development

This assumes use of Eclipse.
------------------------------------

1. Add a tomcat v6.0 server to the Eclipse
  a) Open the "Servers" view
  b) In the "Servers" view, right click and select New -> Server
  c) From the list, choose Tomcat v6.0 Server
  d) In the Server runtime environment line, click "Add..."
  e) Click Browse and locate the "tomcat" folder inside of this Universal Migration Tool project
  f) Click Finish
  g) Name your Server appropriately
  d) Click Finish
2. Configure the server
  a) Double click on the newly created server
  b) In "Server Locations" area, choose "Use workspace metadata"
  c) In "Deploy path" field, click Browse... and browse for the Tomcat folder inside of your Universal Migration Tool project
  d) In "Publishing" area, select "Never publish automatically"
  e) Also, check the "Update context paths" checkbox
  e) In "Server Options" make sure "Serve modules without publishing" is unchecked
  f) In "General Information" area click "Open Launch Configuration"
  g) In "Arguments" tab add "-Xmx1024M -Xms1024M" to VM argument
  h) In "Source" tab add the UMT Java Project
  i) Close the window and choose File -> Save
3. Build the project
  a) Open "Ant" view
  b) Drag "build.xml" file and drop it to the ant view
  c) Unfold the dropped item and double click on "compile"
4. Start the Tomcat server in debugging mode
