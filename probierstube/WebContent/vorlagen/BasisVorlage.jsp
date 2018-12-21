<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<!-- Descripten -->
<!-- * ************************************************ * -->
<!-- * Descripten...: Basisvorlage                      * -->
<!-- * ************************************************ * -->
<html>
<!-- Header -->
<head>
<%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!-- TagLib-Direktive -->
<!-- MetaData -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<!-- erlauben Index in Suchmaschine aufnehmen -->
<!-- Hyperlinks der Seite verfolgen auch erlaubt -->
<meta name="Robots" content="ALL" />
<meta name="Description" content="basisvorlage"/>
<meta name="Copyright" content="(c) 2009 Copyright"/>
<meta name="keywords" content="Login"/>
<meta name="author" content="DV0101"/>
<!-- CSS und Icons -->
<link href="<%= request.getContextPath()%>/theme/toTrail1.css" rel="stylesheet" type="text/css" media="screen" />
<link href="../theme/Druck.css" rel="stylesheet" type="text/css" media="print" />
<link href="http://www.dalieweb.de/pfeilmit01.ico" rel="shortcut icon" title="dalieweb Icon" type="image/x-icon"/>
<!-- Definition RSS Feed -->
<link rel="alternate" type="application/rss+xml" title="dalieweb.de RSS-Feed" href="http://www.dalieweb.de/dalieweb.xml"/> 
<!-- Script's  -->
<script src="../script/dalieLogo.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/script/toTrail.js" type="text/javascript"></script>
<!-- onwn TagLib-Direktive -->
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<title>dalieweb</title>
</head>
<body onload="if(document.images) nextimg()">
<div id="page">
	<div id="pageHeader">
		<a href="http://www.dalieweb.de/" target="_self">
		<img src="<%= request.getContextPath()%>/bilder/pfeilmit01.gif" width="60" height="60" alt="" name="ani" title="dalieweb" class="logo"/></a>
		<span class="strapline">dalieweb.de</span>
	</div><!-- /pageHeader -->
	<div id="header">
		<p>header</p>
	</div><!-- /header -->
	<div id="wrapper">
		<p>wrapper</p>
		<div class="contentLeft">
			<div id="homeFeatures">
<ul class="tabs">
	<li id="tab_1" class="firstItem on firstItemOn "><span><a
		href="http://localhost:9080/dalieweb/toTrail/toTrail1.jsp??tab=1"
		onclick="switchTab(1, 4, 'roundedBottom '); return false;">What We Do</a></span>
	</li>
	<li id="tab_2" class=""><span><a
		href="http://localhost:9080/dalieweb/toTrail/toTrail1.jsp?tab=2"
		onclick="switchTab(2, 4, 'roundedBottom '); return false;">Meet
	Cartella </a></span></li>
	<li id="tab_3" class=""><span><a
		href="http://localhost:9080/dalieweb/toTrail/toTrail1.jsp?tab=3"
		onclick="switchTab(3, 4, 'roundedBottom '); return false;">Service
	Advantage</a></span></li>
	<li id="tab_4" class="lastItem "><span><a
		href="http://localhost:9080/dalieweb/toTrail/toTrail1.jsp?tab=4"
		onclick="switchTab(4, 4, 'roundedBottom '); return false;">.edu
	Solutions</a></span></li>
</ul>
<div id="copy_1" class="roundedBottom ">
<div class="content">
<div class="item">
<div class="leftContent">
<p>Ingeniux is a full-service <strong>web content management software </strong>and
enterprise <strong>social software </strong>vendor that enables
organizations to manage world-class websites and turn content into
advantage. The Ingeniux CMS enterprise 2.0 content platform delivers
usable, scalable, innovative solutions for managing websites, online
media, and team collaboration.</p>
<p>Learn more about <a href="http://www.ingeniux.com/Products.xml">Ingeniux
enterprise 2.0 content management solutions</a>.</p>
<p>&nbsp;</p>
</div>
<!-- leftContent -->
<div class="rightContent"><a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml"><img
	class="left" src="../bilder/whitepaper.gif" alt="" /></a> <a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml">Download
Whitepapers &amp; Datasheets</a></div>
<!-- rightContent -->
<div class="clearBoth"></div>
<!-- clearBoth  --></div>
<!-- item --></div>
<!-- content -->
<div class="leftCorner"></div>
<div class="rightCorner"></div>
</div>
<!-- roundedBottom -->
<div id="copy_2" class="roundedBottom hiddenItem">
<div class="content">
<div class="item">
<div class="leftContent">
<p>Cartella is the newest addition to the Ingeniux product family.
Cartella delivers the best in social networking, web analytics, and
content management software to make communities easy to manage, measure,
and optimize. Learn more about Cartella or <a
	href="http://www.ingeniux.com/Products/Ingeniux-Cartella-Social-Content-Management-Software.xml?tab=4">register
for a demo </a>to see how you can turn your content into conversations.</p>
<p>Learn More About <a
	href="http://www.ingeniux.com/Products/Ingeniux-Cartella-Social-Content-Management-Software.xml">Ingeniux
Cartella Social Content Management</a></p>
<p>&nbsp;</p>
</div>
<div class="rightContent"><a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml"><img
	class="left" src="../bilder/whitepaper.gif" alt="" /></a> <a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml">Download
Whitepapers &amp; Datasheets</a></div>
<div class="clearBoth"></div>
</div>
</div>
<div class="leftCorner"></div>
<div class="rightCorner"></div>
</div>
<div id="copy_3" class="roundedBottom hiddenItem">
<div class="content">
<div class="item">
<div class="leftContent">
<p>Ingeniux is focused on service. With a reputation for the best
support in the industry, the <a
	href="http://www.ingeniux.com/Services/Ingeniux-360.xml">Ingeniux 360
developer and site support</a> program, end-to-end implementation
services, and strategic consulting - Ingeniux delivers <strong>Web CMS
success</strong>.</p>
<p>Learn more about <a href="http://www.ingeniux.com/Services.xml">Ingeniux
Support and Professional Services</a>.</p>
<p>&nbsp;</p>
</div>
<div class="rightContent"><a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml"><img
	class="left" src="../bilder/whitepaper.gif" alt="" /></a> <a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml">Download
Whitepapers &amp; Datasheets</a></div>
<div class="clearBoth"></div>
</div>
</div>
<div class="leftCorner"></div>
<div class="rightCorner"></div>
</div>
<div id="copy_4" class="roundedBottom hiddenItem">
<div class="content">
<div class="item">
<div class="leftContent">
<p align="left">Ingeniux is the leader in Higher Education <a
	href="http://www.ingeniux.com/Products/Ingeniux-CMS-Website-Content-Management-Software.xml">website
content management</a>. With the experience to make content management
work on campus, a complete set of .edu solutions from calendars to
catalogs, and a proven approach to help you achieve results - Ingeniux
is the educated choice in Web CMS.</p>
<p>Learn Why Over 100 Colleges and Universities have selected <a
	href="http://www.ingeniux.com/Customers/Higher-Education.xml">Ingeniux
CMS for Higher Education web management.</a></p>
<p>&nbsp;</p>
</div>
<div class="rightContent"><a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml"><img
	class="left" src="../bilder/whitepaper.gif" alt="" /></a> <a
	href="http://www.ingeniux.com/Resources/Download-Whitepapers.xml">Download
Whitepapers &amp; Datasheets</a></div>
<div class="clearBoth"></div>
</div>
</div>
<div class="leftCorner"></div>
<div class="rightCorner"></div>
</div>
</div>
</div>
		</div><!-- /contentLeft -->
		<div id="contentRight">	
			<p>contentRight</p>
		</div><!-- /contentRight -->
	</div><!-- wrapper -->
	<div id="footer">
		<p>footer</p>
		<a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
	title="go back"
	style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
back</a>
	</div><!-- /footer -->	
	<div id="pageFooter">
		<p>dalie</p>
		<div id="meta-wrap">
			<div class="vcard">
 				<a class="url" href="http://www.dalieonline.de/"></a>
 				<div class="org fn">
					dalieweb.de<br />
				</div><!-- /org fn -->
 				<div class="adr">
 					<div class="street-address">
						Vogelsangstraße 9
					</div><!-- street-address -->
  					<span class="locality">Stuttgart</span> 
  					<span class="region">DE</span>
  					<span class="postal-code">70176</span>
			 	</div><!-- /adr -->
 				<div class="tel">
				</div><!-- /tel -->
				<a href="http://www.dalieonline.de">Contact Us.</a> | <a href="mailto:dalie@dalieweb.de">Schreiben</a>&nbsp;Sie mir!
			</div><!-- vcard -->
		</div><!-- meta-wrap -->
	</div><!-- pageFooter -->	
</body></html>


