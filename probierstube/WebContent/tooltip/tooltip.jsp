<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Tooltip</title>
<style type="text/css">
/*margin and padding on body element
  can introduce errors in determining
  element position and are not recommended;
  we turn them off as a foundation for YUI
  CSS treatments. */
body {
	margin:0;
	padding:0;
}
</style>
<style>
	#container {height:15em;}
</style>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/fonts/fonts-min.css" />
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/container/assets/skins/sam/container.css" />
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/yahoo-dom-event/yahoo-dom-event.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/container/container-min.js"></script>
</head>
<body class="yui-skin-sam">
<script>
		YAHOO.namespace("example.container");

		function init() {
			// Instantiate a Panel from markup
			YAHOO.example.container.panel1 = new YAHOO.widget.Panel("panel1", { width:"320px", visible:false, constraintoviewport:true } );
			YAHOO.example.container.panel1.render();

			// Instantiate a Panel from script
			YAHOO.example.container.panel2 = new YAHOO.widget.Panel("panel2", { width:"320px", visible:false, draggable:false, close:false } );
			YAHOO.example.container.panel2.setHeader("Panel #2 from Script &mdash; This Panel Isn't Draggable");
			YAHOO.example.container.panel2.setBody("This is a dynamically generated Panel.");
			YAHOO.example.container.panel2.setFooter("End of Panel #2");
			YAHOO.example.container.panel2.render("container");

			YAHOO.util.Event.addListener("show1", "click", YAHOO.example.container.panel1.show, YAHOO.example.container.panel1, true);
			YAHOO.util.Event.addListener("hide1", "click", YAHOO.example.container.panel1.hide, YAHOO.example.container.panel1, true);

			YAHOO.util.Event.addListener("show2", "click", YAHOO.example.container.panel2.show, YAHOO.example.container.panel2, true);
			YAHOO.util.Event.addListener("hide2", "click", YAHOO.example.container.panel2.hide, YAHOO.example.container.panel2, true);
		}

		YAHOO.util.Event.addListener(window, "load", init);
</script>


	
		<button id="show1">Show panel1</button> 
	
	
	<div id="panel1">
		<div class="hd">Dokument sichtbar für:</div>
		<div class="bd">This is a Panel that was marked up in the document.</div>
		<div class="ft">End of Panel #1</div>
	</div>
	
	<div>
		<button id="show2">Show panel2</button> 
		<button id="hide2">Hide panel2</button>
	</div>

</body>
</html>