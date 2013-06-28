<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
  <head>
		<meta charset="utf-8">    
		<title>Generic Migration Tool</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<link href="/css/bootstrap.min.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />

		<script type="text/javascript" src="/javascript/jquery-1.9.0.js"></script>
	</head>
	<body>
		<div class="mt-header">
      <div class="container">
        <h1 class="brand">Cascade Server <span>Generic Migration Tool</span></h1>
      </div>
    </div>
    <div id="page" class="container">
      <div class="row">
        <div class="span12">
					<p class="lead">A summary of the migration is listed below.</p>
					
					<div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
					
					<form action="/MigrationSummary" method="POST">
						<h5>Cascade Server Information</h5>
						<div class="row">
							<div class="span3">Cascade Server URL</div>
							<div class="span7"><strong><s:property value="projectInformation.url"/></strong></div>
						</div>
						<div class="row">
							<div class="span3">Username</div>
							<div class="span7"><strong><s:property value="projectInformation.username"/></strong></div>
						</div>
						<div class="row">
							<div class="span3">Site Name</div>
							<div class="span7"><strong><s:property value="projectInformation.siteName"/></strong></div>
						</div>
						<br />
						<s:if test="projectInformation.externalRootLevelFolderAssignemnts.size()>0">
							<h5>Folder Assignments</h5>
							<table class="table table-striped">
						  	<thead>
						  		<tr>
						  			<th style="width:40%">Root Level Folder</th>
						  			<th style="width:20%">&nbsp;</th>
						  			<th style="width:40%">Link</th>
						  		</tr>
						  	</thead>
								<tbody>
								<s:iterator value="projectInformation.externalRootLevelFolderAssignemnts.entrySet()">
									<tr>
										<td><s:property value="value.folder"/></td>
										<td class="arrow"><i class="icon-arrow-right"></i></td>
										<s:if test="value.crossSiteAssignment != ''">
										<td><small class="muted">Cross-Site:</small> <s:property value="value.crossSiteAssignment"/></td>
										</s:if>
										<s:if test="value.externalLinkAssignment != ''">
										<td><small class="muted">External Link:</small> <s:property value="value.externalLinkAssignment"/></td>
										</s:if>
									</tr>
								</s:iterator>
								</tbody>
							</table>
						</s:if>
						<h5>Mapping</h5>	
						<s:if test="projectInformation.fieldMapping.size()>0">							
							<table class="table table-striped">
								<thead>
									<tr><th colspan="3">XPath</th></tr>
								</thead>
								<tbody>						
								<s:iterator value="projectInformation.fieldMapping.entrySet()">
									<tr><td style="width:40%"><s:property value="key"/></td><td class="arrow" style="width:20%"><i class="icon-arrow-right"></i></td><td style="width:40%"><s:property value="value.label"/></td></tr>
								</s:iterator>
								</tbody>
							</table>
						</s:if>
						<s:if test="projectInformation.staticValueMapping.size()>0">
							<table class="table table-striped">
								<thead>
									<tr><th colspan="3">Static Value</th></tr>
								</thead>
								<tbody>
								<s:iterator value="projectInformation.staticValueMapping.entrySet()">
									<tr><td style="width:40%"><s:property value="value"/></td><td class="arrow" style="width:20%"><i class="icon-arrow-right"></i></td><td style="width:40%"><s:property value="key.label"/></td></tr>
								</s:iterator>
								</tbody>
							</table>
						</s:if>
							
						<div class="control-group">
							<label class="control-label" for="overwriteBehavior0"><strong>Overwrite Behavior</strong></label>
					    <div class="controls span10">
					    <s:iterator value="overwriteBehaviorList" status="stat">
					    	<label class="radio"><input type="radio" name="overwriteBehavior" id="overwriteBehavior<s:property value="#stat.index" />" value="<s:property />"<s:if test="#stat.index==0"> checked="checked"</s:if> /> <s:property /></label>
							</s:iterator>
					    </div>
					  </div>
					  <div class="clearfix">&nbsp;</div>
					  <br/>
					  <button class="btn pull-left" onclick="window.location='/AssignFields?assetType=<s:property value="nAssetTypes-1"/>';return false;">Previous</button>
					 	<button type="submit" name="submitButton" class="btn btn-primary pull-right">Save and Next</button>
					</form>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			$(function() {
				var actionError = $("#actionError");
				if (actionError.find('div').text() !== "") {
					actionError.removeClass('hide');
				}
			});
		</script>
	</body>
</html>