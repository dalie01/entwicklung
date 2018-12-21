<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" 
	import="net.fckeditor.*"
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<!-- onwn TagLib-Direktive -->
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>

<script type="text/javascript">
	function FCKeditor_OnComplete(editorInstance) {
		window.status = editorInstance.Description;
	}
</script>
<title>Insert title here</title>
</head>
<%
	 FCKeditor fckEditor = new FCKeditor(request, "EditorDefault");
%>
<body>
	
	<h1>FCKeditor - JSP - Sample 1</h1>
	                <p>This sample displays a normal HTML form with an FCKeditor with
	                full features enabled.</p>
	                <p>Basic FCKeditor information:</p>
	                <ul>
	                        <li><FCK:check command="CompatibleBrowser" /></li>
	                        <li><FCK:check command="GetResources" /></li>
	                        <li><FCK:check command="FileUpload" /></li>
	                        <li><FCK:check command="CreateFolder" /></li>
	                </ul>
	                <hr />
	                <form action="sampleposteddata.jsp" method="post" target="_blank">
	                <%
	                        fckEditor.setValue("This is some <strong>sample text</strong>. You are using <a href=\"http://www.fckeditor.net\">FCKeditor</a>.");
	                        out.println(fckEditor);
	                %>
	                <br />
	                <input type="submit" value="Submit" /></form>
	        
	
</body>
</html>