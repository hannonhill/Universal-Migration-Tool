<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Generic Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Generic Migration Tool</h1>
		<div class="main">
			<h2>Errors occured</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AnalyzeInformation" method="POST">
				<tr>
					<td><button onclick="window.location='/UploadZip';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Ignore These and Continue" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
	</body>
</html>