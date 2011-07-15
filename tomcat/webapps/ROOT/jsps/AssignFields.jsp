<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript">
			function addMapping()
			{
				var isStaticValue = isLastSelected("xmlFieldNames");
				var staticValueEl = document.getElementById("staticValue");
				if (isStaticValue && staticValueEl.value=='')
				{
					alert("Sorry, but you can't select and empty static value");
					return;
				}

				var xmlFieldNamesEl = document.getElementById("xmlFieldNames");
				if (xmlFieldNamesEl.selectedIndex==-1)
				{
					alert("No XML Field selected");
					return;
				}
				
				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				if (cascadeFieldNamesEl.selectedIndex==-1)
				{
					alert("No Cascade Field selected");
					return;
				}

				var xmlFieldSelectedIndex = xmlFieldNamesEl.selectedIndex;
				var staticValue = isStaticValue ? staticValueEl.value : ""; 
				var cascadeFieldSelectedIndex = cascadeFieldNamesEl.selectedIndex;
				
				addMappingForGivenIndex(xmlFieldSelectedIndex, staticValue, cascadeFieldSelectedIndex);
			}

			function addMappingByName(xml, staticValue, cascade, cascadeType)
			{
				var xmlIndex = null;
				var cascadeIndex = null;
				var cascadeTypeLetter = cascadeType=="com.hannonhill.smt.MetadataSetField" ? "m" : "d";
				cascade = cascadeTypeLetter + cascade;
				
				var xmlFieldNamesEl = document.getElementById("xmlFieldNames");
				if (staticValue==null)
					for(var i=0; i<xmlFieldNamesEl.options.length; i++)
						if (xmlFieldNamesEl.options[i].value==xml)
							xmlIndex = i;

				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				for(var i=0; i<cascadeFieldNamesEl.options.length; i++)
					if (cascadeFieldNamesEl.options[i].value==cascade)
						cascadeIndex = i;

				addMappingForGivenIndex(xmlIndex, staticValue, cascadeIndex);
			}

			function addMappingForGivenIndex(xmlFieldSelectedIndex, staticValue, cascadeFieldSelectedIndex)
			{
				var staticValueEscaped = staticValue==null?null:staticValue.replace(/&/g, '&amp;').replace(/\"/g, '&quot;');
				var xmlFieldNamesEl = document.getElementById("xmlFieldNames");
				var xmlFieldNameFull = xmlFieldNamesEl.options[xmlFieldSelectedIndex].value;
				var xmlFieldName = xmlFieldNamesEl.options[xmlFieldSelectedIndex].text;
				var xmlFieldTypeLetter = xmlFieldNameFull.charAt(0);
				var xmlFieldType = xmlFieldTypeLetter == 'm' ? "metadata" : xmlFieldTypeLetter == 'c' ? "content" : "static";
				
				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				var cascadeFieldName = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].text;
				var cascadeFieldIdentifierFull = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].value;
				var cascadeFieldTypeLetter = cascadeFieldIdentifierFull.charAt(0);
				var cascadeFieldIdentifier = cascadeFieldIdentifierFull.substring(1);
				var cascadeFieldType = cascadeFieldTypeLetter == "m" ? "metadata" : "data definition";
					
				var tableEl = document.getElementById("mappings");
				var row = document.createElement("tr");
				row.id = "field"+xmlFieldNameFull;
				var cell1 = document.createElement("td");
				cell1.appendChild(document.createTextNode(xmlFieldTypeLetter == "s" ? staticValue : xmlFieldName));
				var cell2 = document.createElement("td");
				cell2.appendChild(document.createTextNode(xmlFieldType));
				var cell3 = document.createElement("td");
				cell3.appendChild(document.createTextNode(cascadeFieldName));
				var cell4 = document.createElement("td");
				cell4.appendChild(document.createTextNode(cascadeFieldType));
				var cell5 = document.createElement("td");
				var hiddenContent = "<input type=\"hidden\" name=\"selectedXmlMetadataFields\" value=\""+(xmlFieldTypeLetter=="m"?xmlFieldName:"null")+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"selectedXmlContentFields\" value=\""+(xmlFieldTypeLetter=="c"?xmlFieldName:"null")+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"staticValues\" value=\""+staticValueEscaped+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeMetadataFields\" value=\""+(cascadeFieldTypeLetter=="m" ? cascadeFieldIdentifier : "null")+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeDataDefinitionFields\" value=\"" + (cascadeFieldTypeLetter=="d"?cascadeFieldIdentifier : "null") + "\"/>";				
				cell5.innerHTML = hiddenContent+"<button onclick=\"removeMapping('" + xmlFieldNameFull + "', '" + (staticValueEscaped==null?null:staticValueEscaped.replace(/\'/g, "\\'")) + "');return false;\">&#8722;</button>";

				row.appendChild(cell1);
				row.appendChild(cell2);
				row.appendChild(cell3);				
				row.appendChild(cell4);
				row.appendChild(cell5);

				var dropdownsEl = document.getElementById("dropdowns");
				tableEl.removeChild(dropdownsEl);
				tableEl.appendChild(row);
				tableEl.appendChild(dropdownsEl);

				if (xmlFieldTypeLetter=='s')
					return;

				xmlFieldNamesEl.options[xmlFieldSelectedIndex].disabled="disabled";
				xmlFieldChanged();
			}

			function removeMapping(fieldName, staticValue)
			{
				var isStatic = staticValue != "null" && staticValue != "";
				var tableEl = document.getElementById("mappings");
				var fieldValue = isStatic ? staticValue : fieldName;
				fieldValue = fieldValue.replace(/</g, '&lt;').replace(/>/g, '&gt;');
				var trEl = document.getElementById("field"+fieldName);
				tableEl.removeChild(trEl);
				if (isStatic)
					return;
				
				var dropdownEl = document.getElementById("xmlFieldNames");
				for(var j = 0; j < dropdownEl.options.length ; j++)
					if (dropdownEl.options[j].value == fieldValue)
						dropdownEl.options[j].disabled = "";
				return;
			}

			function xmlFieldChanged()
			{
				// Show or hide the static value text box depending on whether or not the selected item is the last item
				document.getElementById("staticValue").style.display = isLastSelected("xmlFieldNames") ? "" : "none";

				// if current field is disabled, select the next field
				var xmlFieldNamesEl = document.getElementById("xmlFieldNames");
				var selectedIndex = xmlFieldNamesEl.selectedIndex;
				if (xmlFieldNamesEl.options[selectedIndex].disabled)
				{
					xmlFieldNamesEl.options[selectedIndex+1].selected=true;
					xmlFieldChanged();
				}
			}

			// Returns true if the element with given id has the last option selected
			function isLastSelected(elementId)
			{
				var el = document.getElementById(elementId);
				return el.selectedIndex == (el.options.length - 1);
			}
		</script>		
	</head>
	<body>
		<h1>Migration Tool</h1>
		<div class="main">
			<h2>Please assign field mappings</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignFields" method="POST">
				<tr><td colspan="2">Asset Type: <s:property value="assetTypeName"/></td></tr>
				<tr><td colspan="2">Content Type: <s:property value="contentTypePath"/></td></tr>
				<tr>
					<td colspan="2">
						<table summary="Mappings" style="width:100%">
							<tbody id="mappings"><tr><th>XML Field</th><th>Type</th><th>Cascade Field</th><th>Type</th><th></th></tr>
								<tr id="dropdowns">
									<td colspan="2">
										<select name="xmlFieldNames" id="xmlFieldNames" style="width: 100%" onchange="xmlFieldChanged()">
											<optgroup label="-Metadata-">
												<s:iterator value="xmlMetadataFieldNames">												
													<option value="m<s:property/>"><s:property/></option>
												</s:iterator>
											</optgroup>
											<optgroup label="-Content-">
												<s:iterator value="xmlContentFieldNames">												
													<option value="c<s:property/>"><s:property/></option>
												</s:iterator>
											</optgroup>
											<optgroup label="-Static-">
												<option value="sv">Static Value</option>
											</optgroup>
										</select>
										<br/>
										<input type="text" id="staticValue" style="display:none;"/>
									</td>
									<td colspan="2">
										<select name="cascadeFieldNames" id="cascadeFieldNames" style="width: 100%">
											<optgroup label="-Metadata-">
												<s:iterator value="cascadeMetadataFields">												
													<option value="m<s:property value="identifier"/>">
														<s:property value="label"/>
													</option>
												</s:iterator>
											</optgroup>
											<optgroup label="-Data Definition-">
												<s:iterator value="cascadeDataDefinitionFields">												
													<option value="d<s:property value="identifier"/>">
														<s:property value="label"/>
													</option>
												</s:iterator>
											</optgroup>
										</select>
									</td>
									<td><button onclick="addMapping();return false;">+</button></td>
								</tr>
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
			addMappingByName("m<s:property value="key"/>", null, "<s:property value="value.identifier"/>", "<s:property value="value.class.name"/>");
		</s:iterator>
		<s:iterator value="contentFieldMap.entrySet()">
			addMappingByName("c<s:property value="key"/>", null, "<s:property value="value.identifier"/>", "<s:property value="value.class.name"/>");
		</s:iterator>
		<s:iterator value="staticValueMap.entrySet()">
			addMappingByName(null, "<s:property value="value" escapeJavaScript="true" escape="false"/>", "<s:property value="key.identifier"/>", "<s:property value="key.class.name"/>");
		</s:iterator>
		</script>
	</body>
</html>