<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java"
	import="selinas.Dokument"  
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<%
	Dokument dokument = (Dokument)session.getAttribute("Dokument");
%>
<body>
	<form action="<%= request.getContextPath() %>/DokumentToProcess" method="post">
	<table width="99%" border="0" cellspacing="3" cellpadding="3" style="border: 1px solid #557AA6;">
		<caption style="font: bold 10px Helvetica, sans-serif; color: #2D5893; text-align: left; padding: 3px 10px;">Dokument</caption>
		<tr>
			<td width="5%">Typ: </td><td width="20%"><strong><em><%= dokument.getTyp() %></em></strong></td>
		</tr>
			<tr>
			<td width="5%">Nummer:</td><td width="20%"><strong><em><%= dokument.getNummer() %>.<%= dokument.getId() %></em></strong></td>
		</tr>
			<tr>
			<td colspan="2" style="font: bold 10px Helvetica, sans-serif; color: #2D5893; text-align: left; padding: 3px 10px;">Inhalt</td>
		</tr>
		<tr>
			<td colspan="2" style="border: 1px solid #557AA6; padding: 3px 5px;">
			<FCK:editor instanceName="selinasContent" toolbarSet="Basic">
				<jsp:attribute name="value"><%= dokument.getContent() %></jsp:attribute>
				<jsp:body>
					<FCK:config AutoDetectLanguage="false" DefaultLanguage="en" />
					<FCK:config SkinPath="skins/office2003/"/>
<!--					<FCK:config CustomConfigurationsPath="${pageContext.request.contextPath}/selinas/dalie.config.js" />-->
				</jsp:body>
			</FCK:editor>
			</td>
		</tr>
		<tr>
		 <td colspan="2" style="border-top: 1px solid #557AA6; padding: 3px 5px;"><button name="goSelinas001" id="goSelinas001" type="submit" value="backPage" tabindex="1">go back</button>
		<button name="goSelinas002" id="goSelinas002" type="submit" value="nextPage" tabindex="1">nextPage</button></td>
		</tr>
		</table>
	</form>
</body>
</html>