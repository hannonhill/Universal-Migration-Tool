<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Please upload the zip archive</h2>
			<h4><s:actionerror /></h4>
			<s:form action="UploadZip" method="POST" enctype="multipart/form-data">
				<s:radio label="XML Folder" name="xmlDirectory" list="availableFolders" />
				<s:file label="Zip File" name="zip" onchange="document.getElementById('UploadZip_xmlDirectorySelected Below').checked='checked';"/>
				<tr>
					<td><button onclick="window.location='/ProjectProperties';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Next" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
	</body>
</html>
		
