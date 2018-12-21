<!-- siteContents\backOffice\properties\ajax\refresh\PropertyContentData.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<c:set var="MapContentData" scope="page" value="${GroupedPropertyMap}" />
<c:forEach var='MapEntry' items='${MapContentData}'>
	<c:forEach var='propertyMap' items='${MapEntry.value}'>					
    	<c:set var="pO" scope="page" value="${propertyMap.value}" />
		<br/>
		<span class="dalie-ui-li-desc"><c:out value="${pO.countryId}" /></span>
		<span style="font-style:italic"><c:out value="${pO.description}"/></span>
	</c:forEach>
	
</c:forEach>
<c:remove var="MapContentData"/>
<c:remove var="MapEntry"/>
<c:remove var="WebForm"/>