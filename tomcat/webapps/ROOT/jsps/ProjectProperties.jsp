<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="/javascript/jquery-1.9.0.js"></script>
		<script type="text/javascript" src="/javascript/json2.js"></script>
		<script type="text/javascript">
			$(function() {
				$('#url, #username, #password').change(function(){loadSiteNames();});
				if ($('#siteName option').size()==0)
					resetSiteNames();					
			});
			
			function loadSiteNames()
			{
				var url = $.trim($('#url').val());
				var username = $.trim($('#username').val());
				var password = $.trim($('#password').val());
				
				if (url=='' || username=='' || password=='')
					resetSiteNames();
				
				var currentlySelected = $('#siteName option:selected').val();
				
				resetSiteNames('Please wait...');
				$.ajax({url: '/ProjectPropertiesGetAvailableSiteNamesAjax',
					data: {url: url, username: username, password: password},
					dataTypeString: 'json',
					type: 'POST',
					success: function(response)
					{
						if (response.error)
						{
							resetSiteNames(response.error);
							return;
						}
						
						var siteNames = response.siteNames;
						if (!siteNames || siteNames.length==0)
						{
							resetSiteNames();
							return;
						}	
						
						$('#siteName option').remove();
						for(var i=0;i<siteNames.length;i++)
							$('#siteName').append($('<option></option>').attr("value", siteNames[i]).text(siteNames[i]));
						
						$('#siteName option[value="'+currentlySelected+'"]').prop('selected', true);
					},
					error: function(obj, e) {resetSiteNames("Error occurred: "+e);}
				});
			}
			
			function resetSiteNames(optionalValue)
			{
				$('#siteName option').remove();
				$('#siteName').append($('<option></option>').attr("value", "-1").text(optionalValue ? optionalValue : "--- Select after providing information above ---"));				
			}
		</script>
	</head>
	<body>
		<h1>Migration Tool</h1>
		<div class="main">
			<h2>Please enter Cascade Server information</h2>
			<h4><s:actionerror /></h4>
			<s:form action="ProjectProperties" method="POST">
			    <s:textfield label="Cascade Server 7.2.x URL" name="url" value="%{url}" size="50" id="url"/>
			    <s:textfield label="Username" name="username" value="%{username}" size="50" id="username"/>
			    <s:password label="Password" name="password" value="%{password}" size="50" id="password" />
			    <s:select label="Site Name" list="availableSites" name="siteName" id="siteName"/>
			    <s:submit value="Save and Next" name="submitButton"/>
			</s:form>
		</div>
	</body>
</html>