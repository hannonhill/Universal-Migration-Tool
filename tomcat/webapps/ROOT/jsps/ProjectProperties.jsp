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
          <p class="lead">Please enter Cascade Server information below.</p>

          <div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>

          <form action="/ProjectProperties" method="POST" class="form-horizontal">
            <fieldset>
              <div class="control-group">
                <label class="control-label" for="url">Cascade Server 7.6.x URL</label>
                <div class="controls">
                  <input class="span4" type="text" id="url" placeholder="http://" name="url" value="<s:property value="url"/>" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="username">Username</label>
                <div class="controls">
                  <input class="span2" type="text" id="username" name="username" value="<s:property value="username"/>" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="password">Password</label>
                <div class="controls">
                  <input class="span2" type="password" id="password" name="password" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="siteName">Site Name</label>
                <div class="controls">
                  <select id="siteName" name="siteName" class="span4"></select>
                </div>
              </div>
              <button type="submit" name="submitButton" class="btn btn-primary pull-right">Save and Next</button>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
		<script type="text/javascript">
			$(function() {
				var actionError = $("#actionError"),
						loadSiteNames = function() {
							var url = $.trim($('#url').val()),
									username = $.trim($('#username').val()),
									password = $.trim($('#password').val()),
									currentlySelected = $('#siteName option:selected').val();
							
							if (url === "" || username === "" || password === "") {
								resetSiteNames();
								return;
							}
							
							resetSiteNames('Please wait...');
							
							$.ajax({
								url: '/ProjectPropertiesGetAvailableSiteNamesAjax',
								data: {
									url: url, 
									username: username, 
									password: password
								},
								dataTypeString: 'json',
								type: 'POST',
								success: function(response) {
									var optionHTML = ""
											i = 0;
									
									actionError.addClass('hide');
									
									if (response.error) {
										triggerError(response.error);
										return;
									}
									
									var siteNames = response.siteNames;
									if (!siteNames || siteNames.length==0) {
										triggerError();
										return;
									}	
									
									for(; i < siteNames.length; i++) {
										var site = siteNames[i],
												isSelected = (site === currentlySelected);
										optionHTML += '<option value="'+site+'"'+(isSelected ? ' selected="selected"' : '')+'>'+site+'</option>';
									}
									
									$('#siteName').html(optionHTML).attr("disabled", false);
								},
								error: function(obj, e) {
									triggerError(e);
								}
							});
						},
						resetSiteNames = function(defaultVal) {
							defaultVal = defaultVal || "Select after providing information above";
							$('#siteName').attr("disabled",true).html('<option value="-1">' + defaultVal + '</option>');				
						},				
						triggerError = function(err) {
							err = err || "";
							
							if (err !== "") {
								actionError.removeClass('hide').find('div').text(err);
							}
							
							resetSiteNames();
						};				
				
				if (actionError.find('div').text() !== "") {
					actionError.removeClass('hide');
				}
				
				$('#url, #username, #password').change(loadSiteNames);
				
				if ($('#siteName option').size() == 0) {
					resetSiteNames();
				}
			});		
		</script>		
	</body>
</html>