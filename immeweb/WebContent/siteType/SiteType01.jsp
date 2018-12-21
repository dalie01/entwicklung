<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<%@ page language="java"
	import="dalie.imme.design.sf.internal.navigation.Navigation;"
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!-- TagLib-Directive -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- MetaData -->
<meta http-equiv="Content-Type" content="application/xhtml+xml; charset=ISO-8859-1"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta name="keywords" content="ScheunenDesign"/>
<meta name="author" content="dalieweb.de"/>
<!-- CSS:Global -->  
<link href="http://yui.yahooapis.com/3.7.3/build/cssgrids/grids-min.css" rel="stylesheet" type="text/css"/>
<link href="http://yui.yahooapis.com/3.7.3/build/cssreset/cssreset.css"  rel="stylesheet" type="text/css"/>
<link href="http://yui.yahooapis.com/3.7.3/build/cssfonts/cssfonts.css" rel="stylesheet" type="text/css"/>
<link href="http://yui.yahooapis.com/3.7.3/build/cssbase/cssbase.css" rel="stylesheet" type="text/css"/>
<link href="<%= request.getContextPath()%>/theme/css/barndesgin.css"  rel="stylesheet" type="text/css"/>
<!-- CSS:Site -->
<!-- CSS:Site:Icon -->
<link href="<%= request.getContextPath()%>/theme/images/logo/Logo_ScheunenDesign_SiteType_FavIcon.ico" rel="shortcut icon" title="immeweb" type="image/x-icon"/>
<!-- Definition RSS Feed -->
<!-- Script's  -->
<script src="http://www.google.com/jsapi" type="text/javascript"></script>
<script type="text/javascript">google.load("jquery","1.7");</script>
<script src="<%= request.getContextPath()%>/script/SiteType.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.ez-bg-resize.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.scroll-startstop.js" type="text/javascript"></script>
<title>Scheunen Design</title>
</head>
<body>
<div id="body" class="yui3-g">
	<div class="yui3-u-1-3">&nbsp;</div>
	<div class="yui3-u-1-3">
		<div class="logo" onclick="location.href='<c:out value="${pageContext.request.contextPath}"/>/ImmeWeb?Page=START';">
			<img src="./theme/images/logo/Logo_ScheunenDesign_SiteType_01.png" alt="" title=""/>
		</div><!-- /.logo -->
	</div>
</div><!-- /yui3-g -->
<div class="yui3-u-1">
	<jsp:include page="${LinkToSite}" flush="true" />	
</div>
</body>
</html>