<!DOCTYPE html>
<html>
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
<link href="<%= request.getContextPath()%>/theme/css/tools/jquery.fancybox.css?v=2.1.2" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/css/tools/jquery.nailthumb.1.1.css" rel="stylesheet" type="text/css"/>
<link href="<%= request.getContextPath()%>/theme/css/barndesgin.css"  rel="stylesheet" type="text/css"/>
<!-- CSS:Site -->
<!-- CSS:Site:Icon -->
<link href="<%= request.getContextPath()%>/theme/images/logo/Logo_ScheunenDesign_SiteType_FavIcon.ico" rel="shortcut icon" title="immeweb" type="image/x-icon"/>
<!-- RSS:Feed -->
<!-- SCRIPT:Site  -->
<script src="http://www.google.com/jsapi" type="text/javascript"></script>
<script type="text/javascript">google.load("jquery","1.7");</script>
<script src="<%= request.getContextPath()%>/script/SiteType.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.ez-bg-resize.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.scroll-startstop.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.fancybox.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.nailthumb.1.1.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/tools/jquery.imgpreload.min.js" type="text/javascript"></script>
<title>Scheunen Design</title>
</head>
<body>
<div id="body" class="yui3-g">
	<div class="yui3-u-1-3">&nbsp;</div>
	<div class="yui3-u-1">
		<jsp:include page="${LinkToSite}" flush="true" />	
	</div>
<div class="yui3-u-1">
	<!-- Space:Footer -->
</div><!-- /.yui3-u-1 -->	
<div id="Navigation" class="yui3-u-1"></div><!-- /.yui3-u-1 -->
</div><!-- /yui3-g -->
</body>
</html>