Deploying SMT in an Eclipse debugger:
------------------------------------

1. Add a tomcat v6.0 server to the Eclipse
  a) Open the "Servers" view
  b) In the "Servers" view, right click and select New -> Server
  c) From the list, choose Tomcat v6.0 Server
  d) In the Server runtime environment line, click "Add..."
  e) Click Browse and locate the "tomcat" folder inside of this Migration Tool project
  f) Click Finish
  g) Name your Server appropriately
  d) Click Finish
2. Configure the server
  a) Double click on the newly created server
  b) In "Server Locations" area, choose "Use custom location" and Browse in the file system for the tomcat folder that resides in the project
  c) In "Publishing" area, select "Never publish automatically"
  d) In "General Information" area click "Open Launch Configuration"
  e) In "Arguments" tab add " -Xmx1024M -Xms1024M" to VM arguments
  f) In "Source" tab add the SMT Java Project
  g) Close the window and choose File -> Save
3. Build the project
  a) Open "Ant" view
  b) Drag "build.xml" file and drop it to the ant view
  c) Unfold the dropped item and double click on "compile"
4. Start the Tomcat server in debugging mode