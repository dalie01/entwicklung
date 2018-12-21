<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.6.0/build/reset-fonts-grids/reset-fonts-grids.css"/> 
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.6.0/build/assets/skins/sam/skin.css"/>     
<style type="text/css" media="screen">
        #cal1Container {
            position: absolute;
            display: none;
        }
        #cal1Container {
            margin: 1em;
        }
        #cal1Container {
            z-index: 400;
        }
	</style>
    <title>Calendar Text Input</title>
</head>
<body class="yui-skin-sam">
<div id="davdoc" class="yui-t7">
    <div id="bd">
        <form method="get" action="#">
            Select Date: <input type="text" name="cal1Date1" id="cal1Date1" size="35" value="" /><br/>
            <input type="submit" value="Submit" />
        </form>
        <div id="cal1Container"></div>
    </div>
</div>
<a name="goBackToIndexPage" href="../index.jsp" id="goBackToIndexPage"
		title="go back"
		style="font: bold 10px Helvetica, sans-serif; color: #2D5893; border-bottom: 1px dotted #2D5893; text-decoration: none;">go
		back</a>
<script type="text/javascript" src="http://yui.yahooapis.com/2.6.0/build/utilities/utilities.js"></script> 
<script type="text/javascript" src="http://yui.yahooapis.com/2.6.0/build/calendar/calendar-min.js"></script> 
<script type="text/javascript" src="<%= request.getContextPath()%>/script/selectDate.js"></script>
</body>

</html>