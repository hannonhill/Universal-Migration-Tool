<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Generic Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript">
			function addMappingFromForm()
			{
				var isStaticValue = isLastSelected("xmlFieldNames");
				var valueEl = document.getElementById("value");
				valueEl.blur();
				var value = valueEl.value;
				if (value=='')
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

				var cascadeFieldSelectedIndex = cascadeFieldNamesEl.selectedIndex;
				var xPath = isStaticValue ? null : value;
				var staticValue = isStaticValue ? value : null;
				addMapping(xPath, staticValue, cascadeFieldSelectedIndex);
				valueEl.value='';
				valueEl.focus();
			}

			function addMappingByName(xPath, staticValue, cascade, cascadeType)
			{
				var cascadeIndex = null;
				var cascadeTypeLetter = cascadeType=="com.hannonhill.smt.MetadataSetField" ? "m" : "d";
				cascade = cascadeTypeLetter + cascade;
				
				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				for(var i=0; i<cascadeFieldNamesEl.options.length; i++)
					if (cascadeFieldNamesEl.options[i].value==cascade)
						cascadeIndex = i;

				
				addMapping(xPath, staticValue, cascadeIndex);
			}

			function addMapping(xPath, staticValue, cascadeFieldSelectedIndex)
			{
				var staticValueEscaped = staticValue==null?null:staticValue.replace(/&/g, '&amp;').replace(/\"/g, '&quot;');
				var xPathEscaped = xPath == null ? null : xPath.replace(/&/g, '&amp;').replace(/\"/g, '&quot;');
				
				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				var cascadeFieldName = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].text;
				var cascadeFieldIdentifierFull = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].value;
				var cascadeFieldTypeLetter = cascadeFieldIdentifierFull.charAt(0);
				var cascadeFieldIdentifier = cascadeFieldIdentifierFull.substring(1);
				var cascadeFieldType = cascadeFieldTypeLetter == "m" ? "metadata" : "data definition";
					
				var randomnumber=Math.floor(Math.random()*100000000)
				var tableEl = document.getElementById("mappings");
				var row = document.createElement("tr");
				row.id = "field"+randomnumber;
				var cell1 = document.createElement("td");
				cell1.appendChild(document.createTextNode(staticValue == null ? 'XPath: ' + xPath : 'Static: ' + staticValue));
				var cell2 = document.createElement("td");
				cell2.appendChild(document.createTextNode(cascadeFieldName));
				var cell3 = document.createElement("td");
				cell3.appendChild(document.createTextNode(cascadeFieldType));
				var cell4 = document.createElement("td");
				var hiddenContent = "<input type=\"hidden\" name=\"selectedXPaths\" value=\""+(xPath!=null ? xPath : "null")+"\"/>";
				hiddenContent += "<input type=\"hidden\" name=\"staticValues\" value=\""+staticValueEscaped+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeMetadataFields\" value=\""+(cascadeFieldTypeLetter=="m" ? cascadeFieldIdentifier : "null")+"\"/>";				
				hiddenContent += "<input type=\"hidden\" name=\"selectedCascadeDataDefinitionFields\" value=\"" + (cascadeFieldTypeLetter=="d"?cascadeFieldIdentifier : "null") + "\"/>";				
				cell4.innerHTML = hiddenContent+"<button onclick=\"removeMapping('" + randomnumber + "');return false;\">&#8722;</button>";

				row.appendChild(cell1);
				row.appendChild(cell2);
				row.appendChild(cell3);				
				row.appendChild(cell4);

				var dropdownsEl = document.getElementById("dropdowns");
				tableEl.insertBefore(row, dropdownsEl);
			}

			function removeMapping(fieldName)
			{
				var tableEl = document.getElementById("mappings");
				var trEl = document.getElementById("field"+fieldName);
				tableEl.removeChild(trEl);
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
		<h1>Generic Migration Tool</h1>
		<div class="main">
			<h2>Please assign field mappings</h2>
			<h4><s:actionerror /></h4>
			<s:form action="AssignFields" method="POST">
				<tr>
					<td colspan="2">
						<table summary="Mappings" style="width:100%">
							<tbody id="mappings"><tr><th>XML Field</th><th>Type</th><th>Cascade Field</th><th>Type</th><th></th></tr>
								<tr id="dropdowns">
									<td colspan="2">
										<select name="xmlFieldNames" id="xmlFieldNames" style="width: 100%">
											<option value="xPath">XPath</option>
											<option value="sv">Static Value</option>
										</select>
										<br/>
										<input type="text" id="value"/>
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
									<td><button onclick="addMappingFromForm();return false;">+</button></td>
								</tr>
							</tbody>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						<s:if test="assetType==0">
							<button onclick="window.location='/AssignContentType';return false;">Previous</button>
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
		<s:iterator value="fieldMap.entrySet()">
			addMappingByName("<s:property value="key"/>", null, "<s:property value="value.identifier"/>", "<s:property value="value.class.name"/>");
		</s:iterator>
		<s:iterator value="staticValueMap.entrySet()">
			addMappingByName(null, "<s:property value="value" escapeJavaScript="true" escape="false"/>", "<s:property value="key.identifier"/>", "<s:property value="key.class.name"/>");
		</s:iterator>
		</script>
	</body>
</html>