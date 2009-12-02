<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript">
			function addMapping()
			{
				var assetTypesEl = document.getElementById("AssignContentTypes_assetTypes");
				if(assetTypesEl.selectedIndex==-1)
				{
					alert("No Asset Type selected");
					return;
				}
				var contentTypesEl = document.getElementById("AssignContentTypes_contentTypes");
				addMappingForGivenIndex(assetTypesEl.selectedIndex, contentTypesEl.selectedIndex);
			}

			function addMappingByName(assetType, contentType)
			{
				var assetTypesIndex = -1;
				var contentTypesIndex = -1;

				var assetTypesEl = document.getElementById("AssignContentTypes_assetTypes");
				for(var i=0; i<assetTypesEl.options.length; i++)
					if (assetTypesEl.options[i].text==assetType)
						assetTypesIndex = i;

				var contentTypesEl = document.getElementById("AssignContentTypes_contentTypes");
				for(var i=0; i<contentTypesEl.options.length; i++)
					if (contentTypesEl.options[i].text==contentType)
						contentTypesIndex = i;
				
				if (assetTypesIndex!=-1 && contentTypesIndex!=-1)
					addMappingForGivenIndex(assetTypesIndex, contentTypesIndex);
			}

			function addMappingForGivenIndex(assetTypesIndex, contentTypesIndex)
			{
				var assetTypesEl = document.getElementById("AssignContentTypes_assetTypes");
				var assetType = assetTypesEl.options[assetTypesIndex].text;
				var contentTypesEl = document.getElementById("AssignContentTypes_contentTypes");
				var contentType = contentTypesEl.options[contentTypesIndex].text;
				var tableEl = document.getElementById("mappings");
				var row = document.createElement("tr");
				var cell1 = document.createElement("td");
				cell1.appendChild(document.createTextNode(assetType));
				var cell2 = document.createElement("td");
				cell2.appendChild(document.createTextNode(contentType));
				var cell3 = document.createElement("td");
				var hiddenContent = "<input type=\"hidden\" name=\"selectedAssetTypes\" value=\""+assetType+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"selectedContentTypes\" value=\""+contentType+"\"/>";				
				cell3.innerHTML = hiddenContent+"<button onclick=\"removeMapping('" + assetType + "');return false;\">Remove</button>";
				
				row.appendChild(cell1);
				row.appendChild(cell2);
				row.appendChild(cell3);
				tableEl.appendChild(row);
				assetTypesEl.remove(assetTypesIndex);
			}

			function removeMapping(assetType)
			{
				var tableEl = document.getElementById("mappings");
				for(var i = 0; i < tableEl.childNodes.length; i++)
				{
					var trEl = tableEl.childNodes[i];
					if (trEl.nodeName == "TR")
						for(var j = 0; j < trEl.childNodes.length; j++)
						{
							var tdEl = trEl.childNodes[j];
							if (tdEl.innerHTML==assetType)
							{
								tableEl.removeChild(trEl);
								var assetTypesEl = document.getElementById("AssignContentTypes_assetTypes");
								assetTypesEl.options[assetTypesEl.options.length]=new Option(assetType);
								return;
							}		
						}
				}
			}
		</script>
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Please assign Content Type mappings</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignContentTypes" method="POST">
			    <s:select list="assetTypes" name="assetTypes" label="XML Asset Type"/>	
			    <s:select list="contentTypes" name="contentTypes" label="Cascade Content Type"/>
				<tr><td colspan="2"><button onclick="addMapping();return false;"/>Add Mapping</button></td></tr>
				<tr>
					<td colspan="2">
						<table summary="Mappings" id="mappings">
							<tr><th>XML Asset Type</th><th>Cascade Content Type</th></tr>
						</table>
					</td>
				</tr>
				<tr>
					<td><button onclick="window.location='/UploadZip';return false;">Previous</button></td>
					<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
		<script type="text/javascript">
		<s:iterator value="contentTypeMap.entrySet()">
			addMappingByName("<s:property value="key"/>", "<s:property value="value"/>");
		</s:iterator>
		</script>
	</body>
</html>