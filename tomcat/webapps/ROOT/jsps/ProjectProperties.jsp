<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Please enter Cascade Server information</h2>
			<h4><s:actionerror /></h4>
			<s:form action="ProjectProperties" method="POST">
			    <s:textfield label="Cascade Server 6.4.x URL" name="url" value="%{url}" size="50"/>
			    <s:textfield label="Username" name="username" value="%{username}" size="50"/>
			    <s:password label="Password" name="password" value="%{password}" size="50"/>
			    <s:textfield label="Site Name" name="siteName" value="%{siteName}" size="50"/>	
			    <s:submit value="Save and Next" name="submitButton"/>
			</s:form>
		</div>
	</body>
</html>