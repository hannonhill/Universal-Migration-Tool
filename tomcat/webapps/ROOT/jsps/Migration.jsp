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
		<script type="text/javascript" src="/javascript/json2.js?t=<s:property value="time"/>"></script>
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
          <p class="lead">Migration Overview</p>

          <div id="actionError" class="alert alert-block alert-error hide">
					  <h5>The following error(s) were encountered:</h5>
					  <div><s:actionerror /></div>
					</div>
          
          <div id="log"></div>
					<div id="js-progress-bar" class="progress">
						<div class="bar" style="width:0%"></div>
					</div>
					<table class="table" id="migration-status">
						<tr>
							<td>Created: <span id="created">0</span></td>
							<td>Skipped: <span id="skipped">0</span></td>
							<td>Errors: <span id="errors">0</span></td>
							<td>Aligned: <span id="aligned">0</span></td>
							<td>Aligning errors: <span id="notAligned">0</span></td>
						</tr>
					</table>
					<table class="table" id="link-checker-status" style="display: none;">
						<tr>
							<td>Checked: <span id="checked">0</span></td>
							<td>Errors: <span id="checkingErrors">0</span></td>
							<td>Correct Links: <span id="correctLinks">0</span></td>
							<td>Broken Links: <span id="brokenLinks">0</span></td>
						</tr>
					</table>
				</div>
				<div style="text-align: center;padding-top: 20px;">
					<a class="btn" onclick="window.location='/MigrationSummary';return false;" id="goBack" style="display:none;">Go Back</a>
					<a class="btn" onclick="callStop();return false;" id="stopMigration">Stop Migration</a>
					<a class="btn" onclick="callStop();return false;" id="stopLinkChecker" style="display:none;">Stop Link Checker</a>
					<a class="btn" onclick="window.location='/StartFromBeginning';return false;" id="startOver">Start From Beginning</a>
					<a class="btn" onclick="startLinkChecker();return false;" id="startLinkChecker" style="display: none;">Start Link Checker</a>
					<a class="btn" onclick="startLinkChecker();return false;" id="restartLinkChecker" style="display: none;">Restart Link Checker</a>
					<a class="btn" onclick="restartMigration();return false;" id="restartMigration" style="display: none;">Restart Migration</a>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			var currentProgress = 0;
			var currentId = 0;
			var frames = 20;
			var framesPerSecond = 20;
			var firstTime = true;

			function callStop()
			{
				var url = "/MigrationStopTaskAjax";
			    var request = GetXmlHttpObject();    
			    request.open("POST", url, true);    
			    if (request.overrideMimeType)
			        request.overrideMimeType('application/json');
			    request.setRequestHeader('Content-Type', 'application/json');
			    request.send(null);		    
			}

			function startLinkChecker()
			{
				var url = "/MigrationStartLinkCheckerAjax";
			    var request = GetXmlHttpObject();    
			    request.open("POST", url, true);    
			    if (request.overrideMimeType)
			        request.overrideMimeType('application/json');
			    request.setRequestHeader('Content-Type', 'application/json');
			    request.send(null);
			    switchUIToLinkChecker();
			}
			
			function restartMigration()
			{
				var url = "/MigrationRestartMigrationAjax";
			    var request = GetXmlHttpObject();    
			    request.open("POST", url, true);    
			    if (request.overrideMimeType)
			        request.overrideMimeType('application/json');
			    request.setRequestHeader('Content-Type', 'application/json');
			    request.send(null);
			    switchUIToMigration();
			}
			
			function switchUIToLinkChecker()
			{
				currentProgress = 0;
			    document.getElementById("checked").innerHTML = "0";
			    document.getElementById("checkingErrors").innerHTML = "0";
			    document.getElementById("correctLinks").innerHTML = "0";
			    document.getElementById("brokenLinks").innerHTML = "0";
			    document.getElementById("migration-status").style.display="none";
			    document.getElementById("link-checker-status").style.display="";
			    $("#js-progress-bar .bar").html("");
			    window.onbeforeunload = closeEditorLinkCheckingWarning;			    
			    enableButtons(false, false, true, true, false, false, false);
			    setTimeout("sendAjaxRequestForProgress()", 1000);
			}

			function switchUIToMigration()
			{
				currentProgress = 0;
				document.getElementById("created").innerHTML = "0";
				document.getElementById("skipped").innerHTML = "0";
				document.getElementById("errors").innerHTML = "0";
				document.getElementById("aligned").innerHTML = "0";
				document.getElementById("notAligned").innerHTML = "0";
		    document.getElementById("migration-status").style.display="";
		    document.getElementById("link-checker-status").style.display="none";
		    $("#js-progress-bar .bar").html("");
		    window.onbeforeunload = closeEditorMigrationWarning;			    
		    enableButtons(false, true, false, true, false, false, false);
		    setTimeout("sendAjaxRequestForProgress()", 1000);
			}
			
			function sendAjaxRequestForProgress()
			{
				var url = "/MigrationAjax";
			    var request = GetXmlHttpObject();    
			    request.open("POST", url, true);    
			    if (request.overrideMimeType)
			        request.overrideMimeType('application/json');
			    request.setRequestHeader('Content-Type', 'application/json');
			    request.onreadystatechange = function () 
			    {
			        if (request.readyState == 4) 
			        {
			            try
			            {
			                if (request.status == 200) 
			                {
			                    var response = request.responseText;                
			    
			                    if (response)
			                    {
			                    	updateProgressReturn(response); 
			                    }
			                }
			            }
			            catch(e)
			            {                      
			            } 
			 
			            request = null;
			        }
			    };       
			    request.send(null);
			}
	
			function updateProgressReturn(response)
			{
				var responseObject = JSON.parse(response);	
				var nextProgress = parseInt(responseObject["progress"])/10.0;

				var currentTask = responseObject["currentTask"];
				var fullTaskName = "";
				if (currentTask=="migration")
				{
					animateNumber("created", responseObject["created"]);
					animateNumber("skipped", responseObject["skipped"]);
					animateNumber("errors", responseObject["withErrors"]);
					animateNumber("aligned", responseObject["aligned"]);
					animateNumber("notAligned", responseObject["notAligned"]);
				}
				else if (currentTask=="link-checker")
				{
					animateNumber("checked", responseObject["checked"]);
					animateNumber("checkingErrors", responseObject["withErrors"]);
					animateNumber("correctLinks", responseObject["correctLinks"]);
					animateNumber("brokenLinks", responseObject["brokenLinks"]);
				}				

				var log = responseObject["log"];
				log = log.replace(/[\n\r\t]/g,''); // Remove any new line or tab characters from the log
				if (log != null && log != '')
				{
					var newspan = document.createElement('SPAN');
					currentId++;
					newspan.setAttribute('id', 'span'+currentId);
					document.getElementById("log").appendChild(newspan);
				}
				animateProgreeBar(log, nextProgress);
				currentProgress = nextProgress;
				var completed = responseObject["completed"];
				if (!completed)
					setTimeout("sendAjaxRequestForProgress()", 1000);
				else
				{
					setTimeout("completed('"+currentTask+"')", 1500);
				}
				firstTime = false;
			}

			function completed(task)
			{
				var taskName = task=='migration'?"Migration":"Link checking";
				window.onbeforeunload = null;
				$("#js-progress-bar .bar").html(taskName+' completed.');
				if (task=='migration')
					enableButtons(true, false, false, true, true, false, true);
				else
					enableButtons(true, false, false, true, false, true, true);
			}
	
			function animateProgreeBar(log, nextProgress)
			{
				if (firstTime)
					frames = 1;
				else
					frames = 20;
				
				for(var i=1;i<=frames;i++)
				{
					var progress = currentProgress+i*(nextProgress-currentProgress)/frames;
					setTimeout("updateProgressFrame("+progress+", "+(i*100/frames)+", '"+log+"')", i * 1000 / framesPerSecond);
				}
			}

			function animateNumber(elId, newVal)
			{
				if (firstTime)
					frames = 1;
				else
					frames = 20;
				
				var el = document.getElementById(elId);
				var oldVal = parseInt(el.innerHTML);
				newVal = parseInt(newVal);
				for(var i=1;i<=frames;i++)
				{
					var val = oldVal+i*(newVal-oldVal)/frames;
					setTimeout("updateNumberFrame('"+elId+"', "+val+")", i * 1000 / framesPerSecond);
				}
			}

			function updateNumberFrame(elId, amount)
			{
				document.getElementById(elId).innerHTML = Math.round(amount);
			}
	
			function updateProgressFrame(amount, framePercent, log)
			{
				$("#js-progress-bar .bar").css("width", amount+"%");
				if (log.length>0)
				{
					document.getElementById("span"+currentId).innerHTML = log.substring(0, log.length * framePercent / 100);
					var logEl = document.getElementById("log");
					logEl.scrollTop = logEl.scrollHeight;
				}
			}

			function GetXmlHttpObject()
			{
				var xmlHttp=null;
				try
				{
					// Firefox, Opera 8.0+, Safari
					xmlHttp=new XMLHttpRequest();
				}
				catch (e)
				{
					// Internet Explorer
					try
					{
						xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
					}
					catch (e)
					{
					  	xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
					}
				}
				return xmlHttp;
			}

			function closeEditorMigrationWarning()
			{
				return 'If you navigate away, you will not be able to see the migration progress or the log but the migration will continue running. The log is saved on the UMT server\'s filesystem.'
			}
			
			function closeEditorLinkCheckingWarning()
			{
				return 'If you navigate away, you will not be able to see the link checking progress or the log but the link checking will continue running. The log is saved on the UMT server\'s filesystem.'
			}

			function enableButtons(goBack, stopMigration, stopLinkChecker, startOver, startLinkChecker, restartLinkChecker, restartMigration)
			{
				document.getElementById("goBack").style.display=goBack?"":"none";
				document.getElementById("stopMigration").style.display=stopMigration?"":"none";
				document.getElementById("stopLinkChecker").style.display=stopLinkChecker?"":"none";
				document.getElementById("startOver").style.display=startOver?"":"none";
				document.getElementById("startLinkChecker").style.display=startLinkChecker?"":"none";
				document.getElementById("restartLinkChecker").style.display=restartLinkChecker?"":"none";
				document.getElementById("restartMigration").style.display=restartMigration?"":"none";
			}

			window.onbeforeunload = closeEditorMigrationWarning
		</script>
		<script type="text/javascript">
			<s:if test="projectInformation.currentTask=='link-checker'">switchUIToLinkChecker();</s:if>
			<s:if test="projectInformation.currentTask!='link-checker'">sendAjaxRequestForProgress();</s:if>
		</script>
	</body>
</html>