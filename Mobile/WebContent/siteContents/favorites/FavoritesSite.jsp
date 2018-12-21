<!-- siteContents\favorites\FavoritesContent.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=BACKOFFICE" 
	headerTitle="${SiteTitle}" 
	title="Home" 
	transition="fade" />
	
<div data-role="content">	
	<jsp:include page="/FavoritesContent" flush="true" />	
</div><!-- PAGE:CONTENT -->