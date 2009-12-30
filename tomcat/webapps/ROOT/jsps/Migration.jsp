<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="/javascript/json2.js?t=<s:property value="time"/>"></script>
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
					animateNumber("created", responseObject["pagesCreated"]);
					animateNumber("skipped", responseObject["pagesSkipped"]);
					animateNumber("errors", responseObject["pagesWithErrors"]);
					animateNumber("aligned", responseObject["pagesAligned"]);
					animateNumber("notAligned", responseObject["pagesNotAligned"]);
				}
				else if (currentTask=="link-checker")
				{
					animateNumber("checked", responseObject["pagesChecked"]);
					animateNumber("checkingErrors", responseObject["pagesWithErrors"]);
					animateNumber("correctLinks", responseObject["correctLinks"]);
					animateNumber("brokenLinks", responseObject["brokenLinks"]);
				}				

				var log = responseObject["log"];
				log = log.replace(/[\n\r\t]/g,''); // Remove any new line or tab characters from the log 
				var newspan = document.createElement('SPAN');
				currentId++;
				newspan.setAttribute('id', 'span'+currentId);
				document.getElementById("log").appendChild(newspan);
				animateProgreeBar(log, nextProgress);
				currentProgress = nextProgress;
				var completed = responseObject["completed"];
				if (!completed)
					setTimeout("sendAjaxRequestForProgress()", 1000);
				else
				{
					setTimeout("completed('"+currentTask+"')", 1000);
				}
				firstTime = false;
			}

			function completed(task)
			{
				var taskName = task=='migration'?"Migration":"Link checking";
				window.onbeforeunload = null;
				document.getElementById('progress-percent').innerHTML = taskName+' completed.';
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
				document.getElementById("progress-bar").style.width=amount+"%";
				document.getElementById("progress-percent").innerHTML = Math.round(amount)+"%";
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
				return 'If you navigate away, you will not be able to see the migration progress or the log but the migration will continue running. The log is saved on the SMT server\'s filesystem.'
			}
			
			function closeEditorLinkCheckingWarning()
			{
				return 'If you navigate away, you will not be able to see the link checking progress or the log but the link checking will continue running. The log is saved on the SMT server\'s filesystem.'
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
	</head>
	<body>
		<h1>Serena Migration Tool</h1>
		<div class="main">
			<h2>Migration Started</h2>
			<h4><s:actionerror /></h4>
			<div id="log"></div>
			<div class="progress">
				<div id="progress-bar">
					<div id="progress-percent">0%</div>
					&nbsp;
				</div>
				<table class="status" id="migration-status">
					<tr>
						<td>Created: <span id="created">0</span></td>
						<td>Skipped: <span id="skipped">0</span></td>
						<td>Errors: <span id="errors">0</span></td>
						<td>Aligned: <span id="aligned">0</span></td>
						<td>Aligning errors: <span id="notAligned">0</span></td>
					</tr>
				</table>
				<table class="status" id="link-checker-status" style="display: none;">
					<tr>
						<td>Checked: <span id="checked">0</span></td>
						<td>Errors: <span id="checkingErrors">0</span></td>
						<td>Correct Links: <span id="correctLinks">0</span></td>
						<td>Broken Links: <span id="brokenLinks">0</span></td>
					</tr>
				</table>
			</div>
			<div style="text-align: center;">
				<button onclick="window.location='/MigrationSummary';return false;" id="goBack" style="display:none;">Go Back</button>
				<button onclick="callStop();return false;" id="stopMigration">Stop Migration</button>
				<button onclick="callStop();return false;" id="stopLinkChecker" style="display:none;">Stop Link Checker</button>
				<button onclick="window.location='/StartFromBeginning';return false;" id="startOver">Start From Beginning</button>
				<button onclick="startLinkChecker();return false;" id="startLinkChecker" style="display: none;">Start Link Checker</button>
				<button onclick="startLinkChecker();return false;" id="restartLinkChecker" style="display: none;">Restart Link Checker</button>
				<button onclick="restartMigration();return false;" id="restartMigration" style="display: none;">Restart Migration</button>
			</div>	
		</div>
		<script type="text/javascript">
			<s:if test="projectInformation.currentTask=='link-checker'">switchUIToLinkChecker();</s:if>
			<s:if test="projectInformation.currentTask!='link-checker'">sendAjaxRequestForProgress();</s:if>
		</script>
	</body>
</html>