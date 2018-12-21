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
<link href="<%= request.getContextPath()%>/theme/Master.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/selinas-SiteTyp10.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/Druck.css" rel="stylesheet" type="text/css" media="print"/>
<link href="http://www.dalieweb.de/pfeilmit01.ico" rel="shortcut icon" title="dalieweb" type="image/x-icon"/>
<!-- Definition RSS Feed -->
<link rel="alternate" type="application/rss+xml" title="dalieweb.de RSS-Feed" href="http://www.dalieweb.de/dalieweb.xml"/> 
<!-- Script's  -->
<script src="<%= request.getContextPath()%>/script/dalieLogo.js" type="text/javascript"></script>
<title>dalieweb</title>
</head>
<body>
<div id="page">
	<div id="pageHeader"><p>Platz f�r Logo</p></div><!-- pageHeader -->
	<div id="pageContentWrapper">
		<div id="pageContent">
			<div id="dokument">
			<p>dokument1</p>
			</div>
			<div class="clearBoth"></div><!-- clearBoth  -->
			<div id="dokument">
			<p>dokument2</p>
			</div>
		</div><!-- pageContent -->
	</div><!-- pageContentWrapper -->
	<div id="pageFooter"><p>pageFooter</p></div><!-- pageFooter -->	
</div><!-- page -->
</body>
</html>
