<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>Please enter Cascade Server information</h2>
<h4><s:actionerror /></h4>
<s:form action="SubmitProjectProperties" method="POST">
    <s:textfield label="Cascade Server 6.4.x URL" name="url" value="%{url}"/>
    <s:textfield label="Username" name="username" value="%{username}"/>
    <s:password label="Password" name="password" value="%{password}" />
    <s:textfield label="Site Name" name="siteName" value="%{siteName}"/>	
    <s:submit value="Next"/>
</s:form>