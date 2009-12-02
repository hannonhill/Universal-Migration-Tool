<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Migration Summary</h2>
			<h4><s:actionerror /></h4>
			<s:form action="MigrationSummary" method="POST">
				Hi
			    <s:submit value="Save and Next" name="submitButton"/>
			</s:form>
		</div>
	</body>
</html>