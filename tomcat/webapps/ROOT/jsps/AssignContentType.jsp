<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Generic Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Generic Migration Tool</h1>
		<div class="main">
			<h2>Please select the Content Type</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignContentType" method="POST">
			    <s:select list="contentTypes" name="selectedContentType" label="Cascade Content Type"/>
				<tr>
					<td><button onclick="window.location='<s:property value="previousLink"/>';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
	</body>
</html>