Deploying UMT in an Eclipse debugger:
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
  c) In "Deploy path" field, click Browse... and browse for the Tomcat folder inside of your Serena project
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