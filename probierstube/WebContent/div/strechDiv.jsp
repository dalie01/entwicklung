<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<script src="http://code.jquery.com/jquery-1.7.js" type="text/javascript"></script>
<title>DIV</title>
<style type="text/css">
body {
	margin:0;
	padding:0;
}
div {
	border: 2px solid #FF0000;
}
div#doc {
	overflow: hidden;
	position: relativ;
	margin:auto;
	height: 600px;
	width: 80%;
}
div#docLeftBottom {
	postion: absolut;
	height: 100%;
	width: 100%;
	background-color:#EEEEEE;
	overflow: hidden;
}
</style>
</head>
<body>
<div id="doc">
	<div id="docLeftTop">docLeftTop
	</div>
	<div id="docLeftBottom">
		<span class="bottom">docLeftBottom</span>	
	</div>
</div>
<a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
		title="go back"
		style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
		back</a>
<script type="text/javascript">

	jQuery(document).ready(function() {
		
		

		
	
	});
</script>
</body>
</html>