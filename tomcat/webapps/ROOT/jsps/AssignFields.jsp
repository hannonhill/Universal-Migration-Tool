<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />		
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Please assign field mappings</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignFields" method="POST">
				<tr>
					<td><button onclick="window.location='/AssignContentTypes';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Next" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
	</body>
</html>