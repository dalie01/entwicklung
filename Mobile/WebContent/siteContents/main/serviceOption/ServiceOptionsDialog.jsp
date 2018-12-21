<!-- siteContents\main\serviceOption\ServiceOptionsDialog.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div data-role="popup" id="getSoDialog" class="ui-corner-all" data-overlay-theme="a" 
	data-theme="c" data-dismissible="false" style="max-width:80%; width:400px;">
	
	<div data-role="header" data-theme="a" class=ui-corner-top>
		<h1>Dialog</h1>
	</div><!-- div:header -->
	
	<div data-role="content" data-theme="c" class="ui-corner-bottom ui-content">
		<p>your Content</p>
		
		<a href="#'#'#" data-role="button" data-rel="back" data-transition="flow" data-theme="e">okay</a>
		<input type="submit" name="execWebForm" data-role="button" data-theme="b" value="Bestätigen"/>
	</div>
</div><!-- div:popup -->
