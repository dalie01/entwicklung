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
<link href="<%= request.getContextPath()%>/theme/selinas-SiteTyp1.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="<%= request.getContextPath()%>/theme/Druck.css" rel="stylesheet" type="text/css" media="print"/>
<link href="http://www.dalieweb.de/pfeilmit01.ico" rel="shortcut icon" title="dalieweb" type="image/x-icon"/>
<!-- Definition RSS Feed -->
<link rel="alternate" type="application/rss+xml" title="dalieweb.de RSS-Feed" href="http://www.dalieweb.de/dalieweb.xml"/> 
<!-- Script's  -->
<script src="<%= request.getContextPath()%>/script/changeColorOfAnyInputBoxBorder.js" type="text/javascript"></script>
<style type="text/css" media="screen">
    
   /* For standards browsers */
    input[type="text"]:focus {
      border: 2px solid #2D5893;
    }
    
    /* For Internet Explorer */
    input.focus {
      border: 2px solid #2D5893;
    }
</style>
<title>change the color of any input box border</title>
</head>
<body>
	<p>test</p>
<div id="wrapper">
	<div id="header">
		<h1>change the color of any input box border</h1>
			<div id="headerMenu">
				<p>&nbsp;</p>
			</div><!-- headerMenu -->
	</div><!-- header -->
	<div id="wrapperContent">
	<div id="content">	
		<form action="" method="get">
      		<input type="text" name="name" value="name" size="20" tabindex="1"></input>
      		<input type="text" name="vorname" value="vorname" size="20" tabindex="2"></input>
      		<dalie:InputOption name="hallo" tabindex="3" value="hallo" id="hallo" permitId="5"></dalie:InputOption>
    	</form>
	</div><!-- content -->
	<div id="contentRight">	
		<p>contentRight</p>	
	</div><!-- contentRight -->
	</div><!-- wrapperContent -->	
	<div id="footer">
	<p>footer</p>
	<a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
	title="go back"
	style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
back</a>
	</div><!-- footer -->	
</div><!-- wrapper -->
</body>
</html>