<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">
  <head>
		<meta charset="utf-8">    
		<title>Universal Migration Tool</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		
		<link href="/css/bootstrap.min.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />

		<script type="text/javascript" src="/javascript/jquery-1.9.0.js"></script>
	</head>
	<body>
		<div class="mt-header">
      <div class="container">
        <h1 class="brand">Cascade Server <span>Universal Migration Tool</span></h1>
      </div>
    </div>
    <div id="page" class="container">
      <div class="row">
        <div class="span12">
					<p class="lead">Please assign root level folders</p>
					
					<div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
				
					<form action="/AssignRootLevelFolders" method="POST" id="mt-mapping-form">
						<div class="row">							
							<div class="span3">
								<div class="well well-small">
									<div class="control-group">
								    <label class="control-label" for="AssignRootLevelFolders_rootLevelFolder">Root Level Folder</label>
								    <div class="controls">
								      <input class="input-block-level" type="text" id="AssignRootLevelFolders_rootLevelFolder" name="rootLevelFolder" value="" />
								    </div>
								  </div>
								  <div class="control-group">
								    <div class="controls controls-row">
								      <label class="radio"><input type="radio" name="assignmentType" id="assignmentTypeCrossSite"/> Cross Site</label>
								      <input class="input-block-level" type="text" name="crossSiteText" id="crossSiteText" onfocus="document.getElementById('assignmentTypeCrossSite').checked='checked'"/>
								    </div>
								  </div>
								  <div class="control-group">
								    <div class="controls controls-row">
								      <label class="radio"><input type="radio" name="assignmentType" id="assignmentTypeExternalLink"/> External Link</label>
								      <input class="input-block-level" type="text" name="externalLinkText" id="externalLinkText" onfocus="document.getElementById('assignmentTypeExternalLink').checked='checked'"/>
								    </div>
								  </div>
								  <div class="control-group">
								    <a class="btn js-add-mapping"><i class="icon-plus-sign"></i> Add Mapping</a>
								  </div>
								 </div>
							</div>
							<div class="span9">
							  <table summary="Mappings" class="table table-striped">
							  	<thead>
							  		<tr>
							  			<th style="width:30%">Root Level Folder</th>
							  			<th style="width:30%">Cross-site link to site</th>
							  			<th style="width:30%">External link to domain</th>
							  			<th>&nbsp;</th>
							  		</tr>
							  	</thead>
									<tbody id="mappings"></tbody>
								</table>
							</div>
						</div>
					  
					  <button class="btn pull-left" onclick="window.location='/UploadZip';return false;">Previous</button>
					 	<button type="submit" name="submitButton" class="btn btn-primary pull-right">Save and Next</button>
					</form>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				var actionError = $("#actionError"),
						addMapping = function() {
							var rootLevelFolderEl = document.getElementById("AssignRootLevelFolders_rootLevelFolder");
							
							if(rootLevelFolderEl.value === "")
							{
								alert("No folder selected");
								return;
							}
		
							var assignmentTypeCrossSiteEl = document.getElementById("assignmentTypeCrossSite"),
									assignmentTypeExternalLinkEl = document.getElementById("assignmentTypeExternalLink"),
									crossSiteTextEl = document.getElementById("crossSiteText"),
									crossSiteText = assignmentTypeCrossSiteEl.checked ? crossSiteTextEl.value : null,
									externalLinkTextEl = document.getElementById("externalLinkText"),						
									externalLinkText = assignmentTypeExternalLinkEl.checked ? externalLinkTextEl.value : null;
		
							if (!assignmentTypeCrossSiteEl.checked && !assignmentTypeExternalLinkEl.checked)
							{
								alert("Please select either a Cross Site or External Link");
								return;
							}
		
							if (assignmentTypeCrossSiteEl.checked && crossSiteTextEl.value === "")
							{
								alert("Please enter the site name");
								return;
							}
							
							if (assignmentTypeExternalLinkEl.checked && externalLinkTextEl.value === "")
							{
								alert("Please enter the domain name");
								return;
							}
							
							addMappingByName(rootLevelFolderEl.value, crossSiteText, externalLinkText);
						},
						addMappingByName = function(rootLevelFolder, crossSiteText, externalLinkText) {
							var row = $("<tr> \
														<td>" + rootLevelFolder + "</td> \
														<td>" + (crossSiteText || "") + "</td> \
														<td>" + (externalLinkText || "") + "</td> \
														<td> \
															<input type='hidden' name='selectedRootLevelFolders' value='" + rootLevelFolder + "'/> \
															<input type='hidden' name='selectedCrossSiteTexts' value='" + crossSiteText + "'/> \
															<input type='hidden' name='selectedExternalLinkTexts' value='" + externalLinkText + "'/> \
															<a class='btn btn-small js-remove-mapping' title='Remove'><i class='icon-remove-sign'></i></a> \
														</td> \
													</tr>");
							
							$("#mappings").append(row);
							
							// Clear the form and reset focus to add another.
							$("#mt-mapping-form input[type=text]").val("").get(0).focus();
							$("#mt-mapping-form input[type=radio]").attr("checked", false);
						};
				
				
				if (actionError.find('div').text() !== "") {
					actionError.removeClass('hide');
				}
				
				$('.js-add-mapping').on('click', function() {
					addMapping();					
					return false;
				});
				
				$('table').on('click', '.js-remove-mapping', function() {
					$(this).parents('tr').remove();
				});
				
				<s:iterator value="projectInformation.externalRootLevelFolderAssignemnts.entrySet()">
				addMappingByName("<s:property value="key"/>", "<s:property value="value.crossSiteAssignment"/>", "<s:property value="value.externalLinkAssignment"/>");
				</s:iterator>
			});
		</script>	
	</body>
</html>