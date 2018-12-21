<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!-- onwn TagLib-Direktive -->
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<!-- MetaData -->
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=ISO-8859-1"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta name="keywords" content="dalieweb"/>
<meta name="author" content="u.dalies"/>
<!-- CSS und Icons -->
<link href="<%= request.getContextPath()%>/theme/Master1.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/selinas-SiteTyp11.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/Druck.css" rel="stylesheet" type="text/css" media="print"/>
<link href="http://www.dalieweb.de/pfeilmit01.ico" rel="shortcut icon" title="dalieweb" type="image/x-icon"/>
<!-- CSS-Datei (Standard YUI Sam Skin) -->
<link href="http://yui.yahooapis.com/2.8.0r4/build/calendar/assets/skins/sam/calendar.css" rel="stylesheet" type="text/css"/>
<!-- Definition RSS Feed -->
<link rel="alternate" type="application/rss+xml" title="dalieweb.de RSS-Feed" href="http://www.dalieweb.de/dalieweb.xml"/> 
<!-- Script's  -->
<!-- Dependencies --><!-- Abhängigkeiten -->
<script src = "http://yui.yahooapis.com/2.8.0r4/build/yahoo-dom-event/yahoo-dom-event.js"></script>
<!-- Source file --> <!-- Quelle-Datei -->
<script src = "http://yui.yahooapis.com/2.8.0r4/build/calendar/calendar-min.js"></script>
<!-- Script's  -->
<script src="<%= request.getContextPath()%>/script/dateSelectDE.js" type="text/javascript"></script>
<title>DateSelect</title>
</head>
<body>
 <div id="cal1Container"></div>
 <a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
		title="go back"
		style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
		back</a>
</body>
</html>