## Migration Tool

This is an open-source content migration tool for importing existing web content into [Cascade CMS](https://www.hannonhill.com/products/cascade-cms/).

The tool assumes an export from your existing CMS that contains 1 file per page. The content needs to be structured such that the Migration Tool can pull content out using `id`s, `class`es and/or XPath expressions.

## Downloads

You can download the binary and source versions in the [releases area](https://github.com/hannonhill/Universal-Migration-Tool/releases).

## Overview Documentation

An overview of using the migration tool can be [found on our Knowledge Base](https://www.hannonhill.com/cascadecms/latest/cascade-administration/installation-and-upgrades/migration-tool.html).

## Requirements/Notes

* Oracle Java 1.8 JRE or JDK is required.
* Cascade CMS's [Web Services API](https://www.hannonhill.com/cascadecms/latest/developing-in-cascade/rest-api/index.html) needs to be reachable from the server that is hosting the Migration Tool.
* Migration of content to [Shared Fields](https://www.hannonhill.com/cascadecms/latest/design-in-cascade/data-definitions/shared-fields.html) is not currently supported.

## Installation

1. Download and unpack the [latest version](https://github.com/hannonhill/Universal-Migration-Tool/releases) of the tool.
1. Ensure that either `JRE_HOME` or `JAVA_HOME` is set in your `PATH` and points to your installed Oracle Java version, _or_
1. Add a `JRE_HOME` or `JAVA_HOME` environment variable to `bin/catalina.sh` after the comment block containing the license and environment variable options.
1. Ensure that the `tomcat` directory contains a `logs` directory and create one if it does not exist.
1. Ensure you have `ant` command tool installed. Then, run `ant compile`.
1. Start Tomcat by running from a shell: `bin/startup.sh`
1. Once you see `INFO: Server startup in 1676 ms` in the `logs/catalina.out` the tool should be reachable at: `http://localhost:8081` (or whatever hostname is used to reach this machine).


### Deploying locally for development

Prerequisites:
- Ensure that you have a Java JDK installed
- Ensure that you have Node v14+ and NPM installed. You should be able to install both using a package manager like `homebrew` or by downloading them directly from Node.
- Ensure that you have `ant` command tool installed. You should be able to install this via a package manager like `homebrew` or by downloading it directly from Apache.

Steps:
1. Clone this repository on this branch
2. Ensure that you have a valid JDK available in VSCode, IDEA, Eclipse or other IDE
3. Build the Java portion of the project: `ant compile`
4. Ensure that either `JRE_HOME` or `JAVA_HOME` is set in your `PATH` and points to the installed Java JDK
5. Add a `JRE_HOME` or `JAVA_HOME` environment variable to `bin/catalina.sh` after the comment block containing the license and environment variable options.
6. For the React portion, run `cd src/react-app` and then `npm install` and finally `npm run build`
7. Start Tomcat from command line: `tomcat/bin/startup.sh` or using a built-in Tomcat server in your IDE
8. Once started, visit `http://localhost:8081` in your browser to access the tool
9. You should see "React app here" at the bottom of the main screen which confirms the React app was built and deployed correctly.
10. For changes to the Java application, run `ant compile` to deploy your changes which may require restarting Tomcat: `tomcat/bin/shutdown.sh` and then `tomcat/bin/startup.sh`
11. For changes to the React app, you will need to run `npm run build` again and refresh the browser to see the changes.

#### OLD: Eclipse

This assumes use of Eclipse as the IDE

1. Add a tomcat v8.0 server to the Eclipse
  a) Open the "Servers" view
  b) In the "Servers" view, right click and select New -> Server
  c) From the list, choose Tomcat v8.0 Server
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
