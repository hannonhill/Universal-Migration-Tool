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
          <h1 class="brand">Cascade CMS <span>Universal Migration Tool</span></h1>
      </div>
    </div>
    <div id="page" class="container">
      <div class="row">
        <div class="span12">
					<p class="lead">Please select the Content Type and file extensions.</p>
					
					<div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
					
					<form action="/AssignContentType" method="POST" class="form-horizontal">
						<div class="control-group">
                <label class="control-label" for="selectedContentType">Cascade Content Type</label>
                <div class="controls">
                  <select id="selectedContentType" name="selectedContentType" class="span4">
                  <s:iterator value="contentTypes">
                  	<s:set var="value"><s:property /></s:set>										
                  	<option value="<s:property value="#value" />"<s:if test="selectedContentType==#value"> selected="selected"</s:if>><s:property value="#value" /></option>
                  </s:iterator>
                  </select>                  
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="pageExtensions">Page Extensions</label>
                <div class="controls">
                  <input class="span4" type="text" id="pageExtensions" name="pageExtensions" value="<s:property value="pageExtensions"/>" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="blockExtensions">XHTML Block extensions</label>
                <div class="controls">
                  <input class="span4" type="text" id="blockExtensions" name="blockExtensions" value="<s:property value="blockExtensions"/>" />
                </div>
              </div>
              <button class="btn pull-left" onclick="window.location='/AssignRootLevelFolders';return false;">Previous</button>
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