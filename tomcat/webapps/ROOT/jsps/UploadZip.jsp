<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Generic Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<link href="/css/jquery-ui-1.10.3.custom.min.css" media="screen" rel="stylesheet" type="text/css"></link>
		<link href="/css/jquery.shadow.css" media="screen" rel="stylesheet" type="text/css"></link>		
		<script type="text/javascript" src="/javascript/jquery-1.9.0.js"></script>
		<script type="text/javascript" src="/javascript/jquery-ui-1.10.3.custom.min.js"></script>
		<script type="text/javascript" src="/javascript/json2.js"></script>
		<script type="text/javascript" src="/javascript/jquery.shadow.js"></script>	
		<script type="text/javascript">
			$(function() {
				$('#page').shadow({type:'sides', sides:'vt-2'});
				$('input[type=button], input[type=submit], button').button();
			});
		</script>
	</head>
	<body>
		<div class="container">
			<div id="page">
				<h1>Generic Migration Tool</h1>
				<h3>Please upload the zip archive</h3>
				<h4><s:actionerror /></h4>
				<s:form action="UploadZip" method="POST" enctype="multipart/form-data">
					<s:radio label="XML Folder" name="xmlDirectory" list="availableFolders" />
					<s:file label="Zip File" name="zip" onchange="document.getElementById('UploadZip_xmlDirectorySelected Below').checked='checked';"/>
					<tr class="buttons">
						<td><button onclick="window.location='/ProjectProperties';return false;">Previous</button></td>
						<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
					</tr>
				</s:form>
			</div>
		</div>
	</body>
</html>
		
