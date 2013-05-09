<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Generic Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<h1>Generic Migration Tool</h1>
		<div class="main">
			<h2>Migration Summary</h2>
			<h4><s:actionerror /></h4>
			<s:form action="MigrationSummary" method="POST">
				<tr>
					<td colspan="2">
						<table summary="Cascade Server Information" width="100%">
							<tr><th colspan="2">Cascade Server Information</th></tr>
							<tr><td>Cascade Server URL:</td><td><s:property value="projectInformation.url"/></td></tr>
							<tr><td>Username:</td><td><s:property value="projectInformation.username"/></td></tr>
							<tr><td>Site Name:</td><td><s:property value="projectInformation.siteName"/></td></tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<table summary="Content Type Mappings" class="mappingReport">
							<tr><th colspan="3">Content Type Mappings</th></tr>
							<s:iterator value="projectInformation.contentTypeMap.entrySet()">
								<tr><td><s:property value="key"/></td><td class="arrow">-&gt;</td><td><s:property value="value"/></td></tr>
							</s:iterator>
						</table>
					</td>
				</tr>
				<s:iterator value="projectInformation.assetTypeNames" var="assetTypeName" >
					<tr>
						<td colspan="2">
							<table summary="<s:property/>" class="mappingReport">
								<tr><th colspan="3"><s:property/></th></tr>								
								<s:if test="projectInformation.assetTypes.get(#assetTypeName).metadataFieldMapping.size()>0">
									<tr><th colspan="3">Metadata</th></tr>
									<s:iterator value="projectInformation.assetTypes.get(#assetTypeName).metadataFieldMapping.entrySet()">
										<tr><td><s:property value="key"/></td><td class="arrow">-&gt;</td><td><s:property value="value.label"/></td></tr>
									</s:iterator>
								</s:if>
								<s:if test="projectInformation.assetTypes.get(#assetTypeName).contentFieldMapping.size()>0">
									<tr><th colspan="3">Content</th></tr>
									<s:iterator value="projectInformation.assetTypes.get(#assetTypeName).contentFieldMapping.entrySet()">
										<tr><td><s:property value="key"/></td><td class="arrow">-&gt;</td><td><s:property value="value.label"/></td></tr>
									</s:iterator>
								</s:if>
								<s:if test="projectInformation.assetTypes.get(#assetTypeName).staticValueMapping.size()>0">
									<tr><th colspan="3">Static Value</th></tr>
									<s:iterator value="projectInformation.assetTypes.get(#assetTypeName).staticValueMapping.entrySet()">
										<tr><td><s:property value="key.label"/></td><td class="arrow">-&gt;</td><td><s:property value="value"/></td></tr>
									</s:iterator>
								</s:if>
							</table>
						</td>
					</tr>
				</s:iterator>
				<s:radio list="overwriteBehaviorList" name="overwriteBehavior" label="Overwrite Behavior"></s:radio>
				<tr>
					<td><button onclick="window.location='/AssignFields?assetType=<s:property value="nAssetTypes-1"/>';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Migration" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
	</body>
</html>