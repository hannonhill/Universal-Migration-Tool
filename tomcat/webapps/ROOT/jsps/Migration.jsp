<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Serena Migration Tool</title>
		<link href="/css/styles.css?t=<s:property value="time"/>" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="/javascript/json2.js?t=<s:property value="time"/>"></script>
		<script type="text/javascript">
			var currentProgress = 0;
			var currentCreated = 0;
			var currentSkipped = 0;
			var currentErrors =0;
			var currentAligned = 0;
			var currentNotAligned = 0;			
			var currentId = 0;

			function callStop()
			{
				var url = "/MigrationStopAjax";
			    var request = GetXmlHttpObject();    
			    request.open("POST", url, true);    
			    if (request.overrideMimeType)
			        request.overrideMimeType('application/json');
			    request.setRequestHeader('Content-Type', 'application/json');
			    request.send(null);
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
				var nextCreated = responseObject["pagesCreated"];
				var nextSkipped = responseObject["pagesSkipped"];
				var nextErrors = responseObject["pagesWithErrors"];
				var nextAligned = responseObject["pagesAligned"];
				var nextNotAligned = responseObject["pagesNotAligned"];

				var log = responseObject["log"];
				log = log.replace(/[\n\r\t]/g,''); // Remove any new line or tab characters from the log 
				var newspan = document.createElement('SPAN');
				currentId++;
				newspan.setAttribute('id', 'span'+currentId);
				document.getElementById("log").appendChild(newspan);
				animateProgreeBar(log, nextProgress, nextCreated, nextSkipped, nextErrors, nextAligned, nextNotAligned);
				currentProgress = nextProgress;
				currentCreated = nextCreated;
				currentSkipped = nextSkipped;
				currentErrors = nextErrors;
				currentAligned = nextAligned;
				currentNotAligned = nextNotAligned;
				var completed = responseObject["completed"];
				if (!completed)
					setTimeout("sendAjaxRequestForProgress()", 1000);
				else
					setTimeout("completed()", 1000);
			}

			function completed()
			{
				document.getElementById('progress-percent').innerHTML = 'Migration Completed';
				var stopMigrationEl = document.getElementById('stopMigration');
				stopMigrationEl.innerHTML = "Start Over";
				stopMigrationEl.onclick = function() { window.location="/ProjectProperties"; }
			}
	
			function animateProgreeBar(log, nextProgress, nextCreated, nextSkipped, nextErrors, nextAligned, nextNotAligned)
			{
				var frames = 20;
				var framesPerSecond = 20;
				for(var i=1;i<=frames;i++)
				{
					var progress = currentProgress+i*(nextProgress-currentProgress)/frames;
					var created = currentCreated+i*(nextCreated-currentCreated)/frames;
					var skipped = currentSkipped+i*(nextSkipped-currentSkipped)/frames;
					var errors = currentErrors+i*(nextErrors-currentErrors)/frames;
					var aligned = currentAligned+i*(nextAligned-currentAligned)/frames;
					var notAligned = currentNotAligned+i*(nextNotAligned-currentNotAligned)/frames;
					setTimeout("updateProgressFrame("+progress+", "+(i*5)+", '"+log+"',"+created+","+skipped+","+errors+","+aligned+","+notAligned+")", i * 1000 / framesPerSecond);
				}
			}
	
			function updateProgressFrame(amount, framePercent, log, created, skipped, errors, aligned, notAligned)
			{
				document.getElementById("progress-bar").style.width=amount+"%";
				document.getElementById("progress-percent").innerHTML = Math.round(amount)+"%";
				if (log.length>0)
				{
					document.getElementById("span"+currentId).innerHTML = log.substring(0, log.length * framePercent / 100);
					var logEl = document.getElementById("log");
					logEl.scrollTop = logEl.scrollHeight;
				}
				document.getElementById("created").innerHTML = Math.round(created);
				document.getElementById("skipped").innerHTML = Math.round(skipped);
				document.getElementById("errors").innerHTML = Math.round(errors);
				document.getElementById("aligned").innerHTML = Math.round(aligned);
				document.getElementById("notAligned").innerHTML = Math.round(notAligned);
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
				<table class="status">
					<tr>
						<td>Created: <span id="created">0</span></td>
						<td>Skipped: <span id="skipped">0</span></td>
						<td>Errors: <span id="errors">0</span></td>
						<td>Aligned: <span id="aligned">0</span></td>
						<td>Aligning errors: <span id="notAligned">0</span></td>
					</tr>
				</table>
			</div>
			<div style="text-align: center;"><button onclick="callStop();return false;" id="stopMigration">Stop Migration</button></div>	
		</div>
		<script type="text/javascript">sendAjaxRequestForProgress()</script>
	</body>
</html>