<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Universal Migration Tool</title>
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
				<h1>Universal Migration Tool</h1>
				<h3>Please select the Content Type and file extensions</h3>
				<h4><s:actionerror /></h4>
				<s:form action="AssignContentType" method="POST">
				    <s:select list="contentTypes" name="selectedContentType" label="Cascade Content Type"/>
				    <s:textfield name="pageExtensions" label="Page extensions" size="60"/>
				    <s:textfield name="blockExtensions" label="XHTML Block extensions" size="60"/>
					<tr class="buttons">
						<td><button onclick="window.location='<s:property value="previousLink"/>';return false;">Previous</button></td>
						<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
					</tr>
				</s:form>
			</div>
		</div>
	</body>
</html>