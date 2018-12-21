<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java"
	import="selinas.Dokument" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- own TagLib-Directive -->
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<!-- MetaData -->
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=ISO-8859-1"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta name="keywords" content="dalieweb"/>
<meta name="author" content="u.dalies"/>
<title>dalieweb</title>
</head>
<body style="padding: 0px, margin: 0px, font: Arial-Narrow, font-size: 80%">
	<form action="<%= request.getContextPath()%>/Upload001Servlet" enctype="multipart/form-data" method="post">
	<input type="file" name="myFile" tabindex='2' maxlength="255" class="file"/>
	<dalie:ButtonOption name="submit" accesskey="s" permitId="3" tabindex="3"><!-- Button:upload starten -->upload</dalie:ButtonOption>
	</form>
</body>
</html>