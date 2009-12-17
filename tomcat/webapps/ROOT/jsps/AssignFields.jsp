<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript">
			function addMapping()
			{
				var xmlFieldTypeMetadataEl = document.getElementById("xmlFieldTypeMetadata");
				var xmlFieldTypeContentEl = document.getElementById("xmlFieldTypeContent");
				var xmlFieldTypeStaticEl = document.getElementById("xmlFieldTypeStatic");
				var cascadeFieldTypeMetadataEl = document.getElementById("cascadeFieldTypeMetadata");
				var cascadeFieldTypeDataDefinitionEl = document.getElementById("cascadeFieldTypeDataDefinition");

				if (!xmlFieldTypeMetadataEl.checked && !xmlFieldTypeContentEl.checked && !xmlFieldTypeStaticEl.checked)
				{
					alert("Please select either a XML Metadata Field or XML Content Field or a Static value");
					return;
				}

				if (!cascadeFieldTypeMetadataEl.checked && !cascadeFieldTypeDataDefinitionEl.checked)
				{
					alert("Please select either a Cascade Metadata Field or Cascade Data Definition Field");
					return;
				}

				var xmlMetadataFieldNamesEl = document.getElementById("xmlMetadataFieldNames");
				var xmlContentFieldNamesEl = document.getElementById("xmlContentFieldNames");
				var xmlStaticValueEl = document.getElementById("xmlStaticValue");
				var cascadeMetadataFieldNamesEl = document.getElementById("cascadeMetadataFieldNames");
				var cascadeDataDefinitionFieldNamesEl = document.getElementById("cascadeDataDefinitionFieldNames");

				if (xmlFieldTypeMetadataEl.checked && xmlMetadataFieldNamesEl.selectedIndex==-1)
				{
					alert("No XML Metadata Field selected");
					return;
				}

				if (xmlFieldTypeContentEl.checked && xmlContentFieldNamesEl.selectedIndex==-1)
				{
					alert("No XML Content Field selected");
					return;
				}

				if (xmlFieldTypeStaticEl.checked && xmlStaticValueEl.value=='')
				{
					alert("Sorry, but you can't select and empty static value");
					return;
				}
				 
				if (cascadeFieldTypeMetadataEl.checked && cascadeMetadataFieldNamesEl.selectedIndex==-1)
				{
					alert("No Cascade Metadata Field selected");
					return;
				}

				if (cascadeFieldTypeDataDefinitionEl.checked && cascadeDataDefinitionFieldNamesEl.selectedIndex==-1)
				{
					alert("No Cascade Data Definition Field selected");
					return;
				}

				var xmlMetadataFieldSelectedIndex = xmlFieldTypeMetadataEl.checked?xmlMetadataFieldNamesEl.selectedIndex:null;
				var xmlContentFieldSelectedIndex = xmlFieldTypeContentEl.checked?xmlContentFieldNamesEl.selectedIndex:null;
				var xmlStaticValue = xmlStaticValueEl.value; 
				var cascadeMetadataFieldSelectedIndex = cascadeFieldTypeMetadataEl.checked?cascadeMetadataFieldNamesEl.selectedIndex:null;
				var cascadeDataDefinitionFieldSelectedIndex = cascadeFieldTypeDataDefinitionEl.checked?cascadeDataDefinitionFieldNamesEl.selectedIndex:null;
				
				addMappingForGivenIndex(xmlMetadataFieldSelectedIndex, xmlContentFieldSelectedIndex, xmlStaticValue, cascadeMetadataFieldSelectedIndex, cascadeDataDefinitionFieldSelectedIndex);
			}

			function addMappingByName(xmlMetadata, xmlContent, staticValue, cascade, cascadeType)
			{
				var xmlMetadataIndex = null;
				var xmlContentIndex = null;
				var cascadeMetadataIndex = null;
				var cascadeDataDefinitionIndex = null;

				var xmlMetadataFieldNamesEl = document.getElementById("xmlMetadataFieldNames");
				var xmlContentFieldNamesEl = document.getElementById("xmlContentFieldNames");
				if (xmlMetadata!=null)
				{
					for(var i=0; i<xmlMetadataFieldNamesEl.options.length; i++)
						if (xmlMetadataFieldNamesEl.options[i].text==xmlMetadata)
							xmlMetadataIndex = i;
				}
				else
				{
					for(var i=0; i<xmlContentFieldNamesEl.options.length; i++)
						if (xmlContentFieldNamesEl.options[i].text==xmlContent)
							xmlContentIndex = i;
				}

				var cascadeMetadataFieldNamesEl = document.getElementById("cascadeMetadataFieldNames");
				var cascadeDataDefinitionFieldNamesEl = document.getElementById("cascadeDataDefinitionFieldNames");
				if (cascadeType=="com.hannonhill.smt.MetadataSetField")
				{
					for(var i=0; i<cascadeMetadataFieldNamesEl.options.length; i++)
						if (cascadeMetadataFieldNamesEl.options[i].value==cascade)
							cascadeMetadataIndex = i;
				}
				else
				{
					for(var i=0; i<cascadeDataDefinitionFieldNamesEl.options.length; i++)
						if (cascadeDataDefinitionFieldNamesEl.options[i].value==cascade)
							cascadeDataDefinitionIndex = i;
				}

				
				addMappingForGivenIndex(xmlMetadataIndex, xmlContentIndex, staticValue, cascadeMetadataIndex, cascadeDataDefinitionIndex);
			}

			function addMappingForGivenIndex(xmlMetadataFieldSelectedIndex, xmlContentFieldSelectedIndex, staticValue, cascadeMetadataFieldSelectedIndex, cascadeDataDefinitionFieldSelectedIndex)
			{
				var xmlMetadataFieldNamesEl = document.getElementById("xmlMetadataFieldNames");
				var xmlMetadataFieldName = xmlMetadataFieldSelectedIndex==null?null:xmlMetadataFieldNamesEl.options[xmlMetadataFieldSelectedIndex].text;
				var xmlContentFieldNamesEl = document.getElementById("xmlContentFieldNames");
				var xmlContentFieldName = xmlContentFieldSelectedIndex==null?null:xmlContentFieldNamesEl.options[xmlContentFieldSelectedIndex].text;
				var cascadeMetadataFieldNamesEl = document.getElementById("cascadeMetadataFieldNames");
				var cascadeMetadataFieldName = cascadeMetadataFieldSelectedIndex==null?"":cascadeMetadataFieldNamesEl.options[cascadeMetadataFieldSelectedIndex].text;
				var cascadeMetadataFieldIdentifier = cascadeMetadataFieldSelectedIndex==null?null:cascadeMetadataFieldNamesEl.options[cascadeMetadataFieldSelectedIndex].value;
				var cascadeDataDefinitionFieldNamesEl = document.getElementById("cascadeDataDefinitionFieldNames");
				var cascadeDataDefinitionFieldName = cascadeDataDefinitionFieldSelectedIndex==null?"":cascadeDataDefinitionFieldNamesEl.options[cascadeDataDefinitionFieldSelectedIndex].text;
				var cascadeDataDefinitionFieldIdentifier = cascadeDataDefinitionFieldSelectedIndex==null?null:cascadeDataDefinitionFieldNamesEl.options[cascadeDataDefinitionFieldSelectedIndex].value;
				var tableName = xmlMetadataFieldSelectedIndex != null ? "mappingsMetadata" : xmlContentFieldSelectedIndex != null ? "mappingsContent" : "mappingsStatic";
				var tableEl = document.getElementById(tableName);
				var row = document.createElement("tr");
				var cell1 = document.createElement("td");
				cell1.appendChild(document.createTextNode(xmlMetadataFieldName!=null ? xmlMetadataFieldName : xmlContentFieldName != null ? xmlContentFieldName : staticValue ));
				var cell2 = document.createElement("td");
				cell2.appendChild(document.createTextNode(cascadeMetadataFieldName));
				var cell3 = document.createElement("td");
				cell3.appendChild(document.createTextNode(cascadeDataDefinitionFieldName));
				var cell4 = document.createElement("td");
				var hiddenContent = "<input type=\"hidden\" name=\"selectedXmlMetadataFields\" value=\""+xmlMetadataFieldName+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"selectedXmlContentFields\" value=\""+xmlContentFieldName+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"staticValues\" value=\""+(staticValue==null?null:staticValue.replace(/\"/g, '&quot;').replace(/&/g, '&amp;'))+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeMetadataFields\" value=\""+cascadeMetadataFieldIdentifier+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeDataDefinitionFields\" value=\"" + cascadeDataDefinitionFieldIdentifier + "\"/>";				
				cell4.innerHTML = hiddenContent+"<button onclick=\"removeMapping('" + xmlMetadataFieldName + "', '" + xmlContentFieldName + "', '" + staticValue + "');return false;\">Remove</button>";
				// static value has a different order of columns				
				if (staticValue==null || staticValue=="")
				{
					row.appendChild(cell1);
					row.appendChild(cell2);
					row.appendChild(cell3);
				}
				else
				{
					row.appendChild(cell2);
					row.appendChild(cell3);
					row.appendChild(cell1);
				}
				
				row.appendChild(cell4);
				tableEl.appendChild(row);

				var dropdownEl = xmlMetadataFieldSelectedIndex!=null ? xmlMetadataFieldNamesEl : xmlContentFieldSelectedIndex!=null ? xmlContentFieldNamesEl : null;
				if (dropdownEl != null)
					dropdownEl.remove(xmlMetadataFieldSelectedIndex==null ? xmlContentFieldSelectedIndex : xmlMetadataFieldSelectedIndex);
			}

			function removeMapping(metadataFieldName, contentFieldName, staticValue)
			{
				var isContent = contentFieldName!='null';
				var isMetadata = metadataFieldName!='null'; 
				var tableName = isContent ? "mappingsContent" : isMetadata ? "mappingsMetadata" : "mappingsStatic";				
				var tableEl = document.getElementById(tableName);
				var fieldValue = isContent ? contentFieldName : isMetadata ? metadataFieldName : staticValue;
				
				for(var i = 0; i < tableEl.childNodes.length; i++)
				{
					var trEl = tableEl.childNodes[i];
					if (trEl.nodeName == "TR")
						for(var j = 0; j < trEl.childNodes.length; j++)
						{
							var tdEl = trEl.childNodes[j];
							if (tdEl.innerHTML.replace(/&amp;/g, '&')==fieldValue)
							{
								tableEl.removeChild(trEl);
								if (!isContent && !isMetadata)
									return;

								var dropdownName = isContent ? "xmlContentFieldNames" : "xmlMetadataFieldNames";
								var dropdownEl = document.getElementById(dropdownName);
								dropdownEl.options[dropdownEl.options.length]=new Option(fieldValue);
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
			<h2>Please assign field mappings</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignFields" method="POST">
				<div>Asset Type: <s:property value="assetTypeName"/></div>
				<div>Content Type: <s:property value="contentTypePath"/></div>
				<tr>
					<td><input type="radio" name="xmlFieldType" id="xmlFieldTypeMetadata"/> XML Metadata Field</td>
					<td>
						<select name="xmlMetadataFieldNames" id="xmlMetadataFieldNames" onfocus="document.getElementById('xmlFieldTypeMetadata').checked='checked'">
							<s:iterator value="xmlMetadataFieldNames">
								<option value="<s:property/>"><s:property/></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="radio" name="xmlFieldType" id="xmlFieldTypeContent"/> XML Content Field</td>
					<td>
						<select name="xmlContentFieldNames" id="xmlContentFieldNames" onfocus="document.getElementById('xmlFieldTypeContent').checked='checked'">
							<s:iterator value="xmlContentFieldNames">
								<option value="<s:property/>"><s:property/></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="radio" name="xmlFieldType" id="xmlFieldTypeStatic"/> Static Value</td>
					<td><input type="text" name="xmlStaticValue" id="xmlStaticValue" onfocus="document.getElementById('xmlFieldTypeStatic').checked='checked'"/></td>
				</tr>
				<tr>
					<td><input type="radio" name="cascadeFieldType" id="cascadeFieldTypeMetadata"/> Cascade Metadata Field</td>
					<td>
						<select name="cascadeMetadataFieldNames" id="cascadeMetadataFieldNames" onfocus="document.getElementById('cascadeFieldTypeMetadata').checked='checked'">
							<s:iterator value="cascadeMetadataFields">
								<option value="<s:property value="identifier"/>">
									<s:property value="label"/>
								</option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="radio" name="cascadeFieldType" id="cascadeFieldTypeDataDefinition"/> Cascade Data Definition Field</td>
					<td>
						<select name="cascadeDataDefinitionFieldNames" id="cascadeDataDefinitionFieldNames" onfocus="document.getElementById('cascadeFieldTypeDataDefinition').checked='checked'">
							<s:iterator value="cascadeDataDefinitionFields">
								<option value="<s:property value="identifier"/>">
									<s:property value="label"/>
								</option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr><td colspan="2"><button onclick="addMapping();return false;"/>Add Mapping</button></td></tr>
				<tr>
					<td colspan="2">
						<table summary="Mappings">
							<tbody id="mappingsMetadata">
								<tr><th>XML Metadata Field</th><th>Cascade Metadata Field</th><th>Cascade Data Definition Field</th></tr>
							</tbody>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<table summary="Mappings">
							<tbody id="mappingsContent">
								<tr><th>XML Content Field</th><th>Cascade Metadata Field</th><th>Cascade Data Definition Field</th></tr>
							</tbody>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<table summary="Mappings">
							<tbody id="mappingsStatic">
								<tr><th>Cascade Metadata Field</th><th>Cascade Data Definition Field</th><th>Static Value</th></tr>
							</tbody>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						<input type="hidden" name="assetType" value="<s:property value="assetType"/>"/>
						<s:if test="assetType==0">
							<button onclick="window.location='/AssignContentTypes';return false;">Previous</button>
						</s:if>
						<s:if test="assetType>0">
							<button onclick="window.location='/AssignFields?assetType=<s:property value="assetType-1"/>';return false;">Previous</button>
						</s:if>
					</td>
					<td align="right"><input type="submit" value="Save and Next" name="submitButton"/></td>
				</tr>
			</s:form>
		</div>
		<script type="text/javascript">
		<s:iterator value="metadataFieldMap.entrySet()">
			addMappingByName("<s:property value="key"/>", null, null, "<s:property value="value.identifier"/>", "<s:property value="value.class.name"/>");
		</s:iterator>
		<s:iterator value="contentFieldMap.entrySet()">
			addMappingByName(null, "<s:property value="key"/>", null, "<s:property value="value.identifier"/>", "<s:property value="value.class.name"/>");
		</s:iterator>
		<s:iterator value="staticValueMap.entrySet()">
			addMappingByName(null, null, "<s:property value="value" escapeJavaScript="true" escape="false"/>", "<s:property value="key.identifier"/>", "<s:property value="key.class.name"/>");
		</s:iterator>
		</script>
	</body>
</html>