<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
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
					<p class="lead">Please assign field mappings.</p>
					
					<div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
					
					<form action="/AssignFields" method="POST">
						<div class="row">							
							<div class="span3">
								<div class="well well-small">
									<div class="control-group">
									    <label class="control-label" for="xmlFieldNames">From</label>
									    <div class="controls">
									    	<select name="xmlFieldNames" id="xmlFieldNames" class="input-block-level">
													<option value="xPath">XPath</option>
													<option value="sv">Static Value</option>
												</select>
									      <input class="input-block-level" type="text" id="value" value="" />
									    </div>
									  </div>
									  <div class="control-group">
									  	<label class="control-label" for="cascadeFieldNames">To Cascade Field</label>
									    <div class="controls">
									      <select name="cascadeFieldNames" id="cascadeFieldNames" class="input-block-level">
													<optgroup label="-Metadata-">
														<s:iterator value="cascadeMetadataFields">												
															<option value="m<s:property value="identifier"/>">
																<s:property value="label"/>
															</option>
														</s:iterator>
													</optgroup>
													<optgroup label="-Data Definition-">
														<s:iterator value="cascadeDataDefinitionFields">												
															<option value="d<s:property value="identifier"/>" data-multiple="<s:property value="multiple"/>">
																<s:property value="label"/>
															</option>
														</s:iterator>
													</optgroup>
												</select>
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
											<th style="width:32.5%">From</th>
											<th style="width:32.5%">To Cascade Field</th>
											<th style="width:20%">Type</th>
											<th>&nbsp;</th>
										</tr>
									</thead>
									<tbody id="mappings"></tbody>
								</table>
							</div>
						</div>
						<button class="btn pull-left" onclick="window.location='/AssignContentType';return false;">Previous</button>
					 	<button type="submit" name="submitButton" class="btn btn-primary pull-right">Save and Next</button>
					</form>
          <div style="margin-top: 50px;">
            <p>Paste test XML</p>
            <textarea style="width:100%;" rows="5" id="test-xml"></textarea>
          </div>
          <div>
            <p>Result (press the play button next to XPath assignment)</p>
            <textarea style="width:100%;" rows="25" id="test-result"></textarea>
          </div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function() {
				var actionError = $("#actionError");
				
				if (actionError.find('div').text() !== "") {
					actionError.removeClass('hide');
				}
				
				$('.js-add-mapping').on('click', function() {
					addMappingFromForm();					
					return false;
				});
				
				$('table').on('click', '.js-remove-mapping', function() {
					$(this).parents('tr').remove();
				});
				
				$('table').on('click', '.js-test-xpath', function() {
				  var $selectedXPath = $(this).siblings('input[name="selectedXPaths"]');
          var xpath = $selectedXPath.val(); 
          var multiple = $selectedXPath.attr('data-multiple');
          var xml = $('#test-xml').val();
          $.get('/TestXPath', {testXPath: xpath, testXml: xml, testMultiple: multiple}, function(resp) {
            $('#test-result').val(resp);
            $('#test-result')[0].scrollIntoView()
          })
        });
				
				<s:iterator value="fieldMappings">
					addMappingByName("<s:property value="xPath" escapeJavaScript="true" escape="false"/>", null, "<s:property value="field.identifier"/>", "<s:property value="field.class.name"/>");
				</s:iterator>
				<s:iterator value="staticValueMap.entrySet()">
					addMappingByName(null, "<s:property value="value" escapeJavaScript="true" escape="false"/>", "<s:property value="key.identifier"/>", "<s:property value="key.class.name"/>");
				</s:iterator>
			});

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
				var cascadeTypeLetter = cascadeType=="com.hannonhill.umt.MetadataSetField" ? "m" : "d";
				cascade = cascadeTypeLetter + cascade;
				
				var cascadeFieldNamesEl = document.getElementById("cascadeFieldNames");
				for(var i=0; i<cascadeFieldNamesEl.options.length; i++)
					if (cascadeFieldNamesEl.options[i].value==cascade)
						cascadeIndex = i;

				
				addMapping(xPath, staticValue, cascadeIndex);
			}

			function addMapping(xPath, staticValue, cascadeFieldSelectedIndex)
			{
				var staticValueEscaped = staticValue === null ? null : staticValue.entityEncode(),
						xPathEscaped = xPath === null ? null : xPath.entityEncode(),
						cascadeFieldNamesEl = document.getElementById("cascadeFieldNames"),
						cascadeFieldName = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].text,
						isMultiple = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].getAttribute('data-multiple');
						cascadeFieldIdentifierFull = cascadeFieldNamesEl.options[cascadeFieldSelectedIndex].value,
						cascadeFieldTypeLetter = cascadeFieldIdentifierFull.charAt(0),
						cascadeFieldIdentifier = cascadeFieldIdentifierFull.substring(1),
						cascadeFieldType = cascadeFieldTypeLetter == "m" ? "metadata" : "data definition",
						row = $("<tr> \
							<td>" + (staticValue == null ? 'XPath: ' + xPath : 'Static: ' + staticValue) + "</td> \
							<td>" + cascadeFieldName + "</td> \
							<td>" + cascadeFieldType + "</td> \
							<td> \
							<input type='hidden' name='selectedXPaths' value='" + (xPath !== null ? xPathEscaped : "null") + "' data-multiple='" + isMultiple + "'/> \
							<input type='hidden' name='staticValues' value='" + staticValueEscaped + "'/> \
							<input type='hidden' name='selectedCascadeMetadataFields' value='" + (cascadeFieldTypeLetter === "m" ? cascadeFieldIdentifier : "null") + "'/> \
							<input type='hidden' name='selectedCascadeDataDefinitionFields' value='" + (cascadeFieldTypeLetter === "d" ? cascadeFieldIdentifier : "null") + "'/> \
              " + (xPath !== null ? "<a class='btn btn-small js-test-xpath' title='Text'><i class='icon-play'></i></a>" : "") +
							"<a class='btn btn-small js-remove-mapping' title='Remove'><i class='icon-remove-sign'></i></a> \
							</td> \
						</tr>");

				$("#mappings").append(row);
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
			
			String.prototype.entityEncode = function() {
				var entityMap = {
				   "&": "&amp;",
				   "<": "&lt;",
				   ">": "&gt;",
				   '"': '&quot;',
				   "'": '&#39;',
				   "/": '&#x2F;'
				 };

		    return this.replace(/[&<>"'\/](?![^& ]+;)/g, function (s) {
		      return entityMap[s];
		    });
			};
		</script>	
	</body>
</html>
