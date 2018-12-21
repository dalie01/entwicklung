<!-- siteContents\backOffice\properties\PropertySite.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=BACKOFFICE" 
	headerTitle="dalie.mobile.backoffice.propertySite.headerTitle" 
	title="dalie.mobile.backoffice.propertySite.title" 
	transition="fade" />

<div data-role="content">
	<dalie:Include url="PROPERTY-CONTENT" parms="PropertyId=${param.PropertyId};CountryId=${param.CountryId}"/>	
</div><!-- PAGE:CONTENT -->
