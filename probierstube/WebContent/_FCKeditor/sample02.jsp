<?xml version="1.0" encoding="UTF-8" ?> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
		        pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>
<%--
6	 * FCKeditor - The text editor for Internet - http://www.fckeditor.net
7	 * Copyright (C) 2004-2010 Frederico Caldeira Knabben
8	 *
9	 * == BEGIN LICENSE ==
10	 *
11	 * Licensed under the terms of any of the following licenses at your
12	 * choice:
13	 *
14	 *  - GNU General Public License Version 2 or later (the "GPL")
15	 *    http://www.gnu.org/licenses/gpl.html
16	 *
17	 *  - GNU Lesser General Public License Version 2.1 or later (the "LGPL")
18	 *    http://www.gnu.org/licenses/lgpl.html
19	 *
20	 *  - Mozilla Public License Version 1.1 or later (the "MPL")
21	 *    http://www.mozilla.org/MPL/MPL-1.1.html
22	 *
23	 * == END LICENSE ==
24	 * @version: $Id$
25	--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
27	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>FCKeditor - JSP Sample</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="robots" content="noindex, nofollow" />
<link href="../sample.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="../fckeditor.gif" type="image/x-icon" />
<script type="text/javascript">
	function FCKeditor_OnComplete(editorInstance) {
		window.status = editorInstance.Description;
	}
</script>
</head>
<body>
<h1>FCKeditor - JSP - Sample 2</h1>
This sample displays a normal HTML form with an FCKeditor with full
features enabled.
<br />
This sample uses the FCKeditor Taglib: this method is preferred to
<a href="sample01.jsp">the API version</a>
<br />
All other sample pages will use this method.
<hr />
<form action="sampleposteddata.jsp" method="post" target="_blank">
<FCK:editor instanceName="EditorDefault">
	<jsp:attribute name="value">This is some <strong>sample text
	                                        </strong>. You are using <a
			href="http://www.fckeditor.net">
	                                        FCKeditor</a>.
	                                </jsp:attribute>
</FCK:editor> <br />
<input type="submit" value="Submit" /></form>
</body>
</html>