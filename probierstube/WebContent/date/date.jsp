<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<!-- onwn TagLib-Direktive -->
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<style type="text/css">
<!--
th.calendar {
	font: 12pt Arial;
	font-weight: bold;
	color: white;
	background-color: black
}

td.weekday {
	font: 14pt Arial;
	text-align: right;
	vertical-align: top;
	height: 70;
	background-color: lightblue
}

td.weekend {
	font: 14pt Arial;
	text-align: right;
	vertical-align: top;
	height: 70;
	background-color: lightgreen
}

th.navigation {
	font-weight: bold;
	text-align: center
}

td.navigation {
	font: 14pt Arial;
	font-weigth: bold;
	text-align: center
}
-->
</style>
<title>date</title>
</head>
<body>
<center>
<p><dalie:setDate /></p>
<form>
<table width="500" border="2">
	<dalie:showCalendar />
</table>
<table cellpadding="7">
	<dalie:showNavigation />
</table>
</form>
<a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
		title="go back"
		style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
		back</a>
</center>
</body>
</html>