<!-- siteContents\error\Error.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=MAIN" 
	headerTitle="${SiteTitle}" 
	title="dalie.home.errorSite.title" 
	transition="fade" />

<div data-role="content">	
	<jsp:include page="/Error" flush="true" />	
</div><!-- PAGE:CONTENT -->