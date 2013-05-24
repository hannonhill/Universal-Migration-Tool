<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Migration Tool</title>
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
			(function ($) 
			{
			    $.fn.styleTable = function (options) 
			    {
			        var defaults = {
			            css: 'styleTable'
			        };
			        options = $.extend(defaults, options);

			        return this.each(function () {

			            input = $(this);
			            input.addClass(options.css);

			            input.addClass('ui-corner-all');

			            input.find("th").addClass("ui-state-default");
			        });
			    };
			})(jQuery);
			function addMapping()
			{
				var rootLevelFolderEl = document.getElementById("AssignRootLevelFolders_rootLevelFolder");
				if(rootLevelFolderEl.value=='')
				{
					alert("No folder selected");
					return;
				}

				var assignmentTypeCrossSiteEl = document.getElementById("assignmentTypeCrossSite");
				var crossSiteTextEl = document.getElementById("crossSiteText");
				var assignmentTypeExternalLinkEl = document.getElementById("assignmentTypeExternalLink");
				var externalLinkTextEl = document.getElementById("externalLinkText");

				if (!assignmentTypeCrossSiteEl.checked && !assignmentTypeExternalLinkEl.checked)
				{
					alert("Please select either a Cross Site or External Link");
					return;
				}

				if (assignmentTypeCrossSiteEl.checked && crossSiteTextEl.value=='')
				{
					alert("Please enter the site name");
					return;
				}
				
				if (assignmentTypeExternalLinkEl.checked && externalLinkTextEl.value=='')
				{
					alert("Please enter the domain name");
					return;
				}

				var crossSiteText = assignmentTypeCrossSiteEl.checked ? crossSiteTextEl.value : null;
				var externalLinkText = assignmentTypeExternalLinkEl.checked ? externalLinkTextEl.value : null;
				
				addMappingForGivenIndex(rootLevelFolderEl.value, crossSiteText, externalLinkText);
			}

			function addMappingByName(rootLevelFolder, crossSiteText, externalLinkText)
			{
				addMappingForGivenIndex(rootLevelFolder, crossSiteText, externalLinkText);
			}

			function addMappingForGivenIndex(rootLevelFolder, crossSiteText, externalLinkText)
			{
				var rootLevelFolderEl = document.getElementById("AssignRootLevelFolders_rootLevelFolder");
				var tableEl = document.getElementById("mappings");
				var row = document.createElement("tr");
				var cell1 = document.createElement("td");
				cell1.appendChild(document.createTextNode(rootLevelFolder));
				var cell2 = document.createElement("td");
				cell2.appendChild(document.createTextNode(crossSiteText==null?"":crossSiteText));
				var cell3 = document.createElement("td");
				cell3.appendChild(document.createTextNode(externalLinkText==null?"":externalLinkText));
				var cell4 = document.createElement("td");
				var hiddenContent = "<input type=\"hidden\" name=\"selectedRootLevelFolders\" value=\""+rootLevelFolder+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"selectedCrossSiteTexts\" value=\""+crossSiteText+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedExternalLinkTexts\" value=\""+externalLinkText+"\"/>";				
				cell4.innerHTML = hiddenContent+"<button onclick=\"removeMapping('" + rootLevelFolder + "');return false;\">Remove</button>";
				
				row.appendChild(cell1);
				row.appendChild(cell2);
				row.appendChild(cell3);
				row.appendChild(cell4);
				tableEl.appendChild(row);
				$('input[type=button], input[type=submit], button').button();
			}

			function removeMapping(rootLevelFolder)
			{
				var tableEl = document.getElementById("mappings");
				for(var i = 0; i < tableEl.childNodes.length; i++)
				{
					var trEl = tableEl.childNodes[i];
					if (trEl.nodeName == "TR")
					{
						var tdEl = trEl.childNodes[0];
						if (tdEl.innerHTML==rootLevelFolder)
						{
							tableEl.removeChild(trEl);
							var rootLevelFolderEl = document.getElementById("AssignRootLevelFolders_rootLevelFolder");
							rootLevelFolderEl.options[rootLevelFolderEl.options.length]=new Option(rootLevelFolder);
							return;
						}		
					}	
				}
			}
		</script>	
	</head>
	<body>
		<div class="container">
			<div id="page">		
				<h1>Migration Tool</h1>
				<h2>Please assign root level folders</h2>
				<h4><s:actionerror /></h4>
				<s:form action="AssignRootLevelFolders" method="POST">
					Root Level Folder: <input type="text" name="rootLevelFolder" id="AssignRootLevelFolders_rootLevelFolder" size="60"/>
					<tr>
						<td><input type="radio" name="assignmentType" id="assignmentTypeCrossSite"/> <label for="assignmentTypeCrossSite">Cross Site</label> </td>
						<td><input type="text" name="crossSiteText" id="crossSiteText" onfocus="document.getElementById('assignmentTypeCrossSite').checked='checked'" size="60"/></td>
					</tr>
					<tr>
						<td><input type="radio" name="assignmentType" id="assignmentTypeExternalLink"/> <label for="assignmentTypeExternalLink">External Link</label></td>
						<td><input type="text" name="externalLinkText" id="externalLinkText" onfocus="document.getElementById('assignmentTypeExternalLink').checked='checked'" size="60"/></td>
					</tr>
					<tr><td colspan="2"><button onclick="addMapping();return false;">Add Mapping</button></td></tr>
					<tr>
						<td colspan="2">
							<table summary="Mappings">
								<tbody id="mappings">
									<tr><th>Root Level Folder</th><th>Cross-site link to site</th><th>External link to domain</th><th>&nbsp;</th></tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr class="buttons">
						<td><button onclick="window.location='/UploadZip';return false;">Previous</button></td>
						<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
					</tr>
				</s:form>
			</div>
		</div>
		<script type="text/javascript">
			<s:iterator value="projectInformation.externalRootLevelFolderAssignemnts.entrySet()">
			addMappingByName("<s:property value="key"/>", "<s:property value="value.crossSiteAssignment"/>", "<s:property value="value.externalLinkAssignment"/>");
			</s:iterator>
			$('#mappings').parent().styleTable();
		</script>
	</body>
</html>