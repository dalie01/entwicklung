<!-- siteContents\backOffice\language\LanguageSite.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=BACKOFFICE" 
	headerTitle="dalie.mobile.backoffice.lanagugeSite.headerTitle" 
	title="dalie.mobile.backoffice.langungeSite.title" 
	transition="fade" />

<div data-role="content">	
	<jsp:include page="/LanguageContent" flush="true" />	
</div><!-- PAGE:CONTENT -->