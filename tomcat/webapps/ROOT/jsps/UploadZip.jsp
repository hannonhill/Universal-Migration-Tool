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
		  <h1 class="brand">Cascade CMS <span>Universal Migration Tool</span></h1>
      </div>
    </div>
    <div id="page" class="container">
      <div class="row">
        <div class="span12">
					<p class="lead">Please upload the zip archive.</p>
					
					<div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
					
					<form action="/UploadZip" method="POST" class="form-horizontal" enctype="multipart/form-data">
						<div class="control-group">
					    <label class="control-label" for="xmlDirectory0">XML Folder</label>
					    <div class="controls">
					    <s:iterator value="availableFolders" status="stat">
					    	<s:set var="value"><s:property /></s:set>
					    	<label class="radio"><input type="radio" name="xmlDirectory" id="xmlDirectory<s:property value="#stat.index" />" value="<s:property value="#value" />"<s:if test="#stat.index==0 || xmlDirectory==#value"> checked="checked"</s:if> /> <s:property value="#value" /></label>
					    </s:iterator>
					    </div>
					  </div>
					  <div class="control-group">
					    <label class="control-label" for="UploadZip_zip">Zip File</label>
					    <div class="controls">
					      <input type="file" name="zip" value="" id="UploadZip_zip" />
					    </div>
					  </div>
					  <button class="btn pull-left" onclick="window.location='/ProjectProperties';return false;">Previous</button>
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
				
				$("#UploadZip_zip").on("change", function(){
					$("input[id^='xmlDirectory']:last").attr("checked", true);
				});
			});
		</script>		
	</body>
</html>
		
