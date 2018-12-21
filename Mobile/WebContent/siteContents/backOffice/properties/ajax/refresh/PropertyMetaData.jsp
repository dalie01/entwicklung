<!-- siteContents\backOffice\properties\ajax\refresh\PropertyMetaData.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<c:set var="MapMetaData" scope="page" value="${GroupedPropertyMap}" />
<c:forEach var='MapEntry' items='${MapMetaData}'>
	<c:set var="Property" scope="page" value="${MapEntry.key}" />
	
	<c:set var="metaData" scope="page" value="${Property.dataUtils}" />
	<br /><br /> 
	<span class="dalie-ui-li-head"> 
		<dalie:LocalizedDate fmt="${metaData.createDate}" />
	</span> 
	<span class="dalie-ui-li-desc"> 
		<!-- DB:Create --> 
		<dalie:LocalizedString key="dalie.mobile.common.db.create" />
	</span> 
	<br /> 
	<span class="dalie-ui-li-head"> 
		<dalie:LocalizedDate fmt="${metaData.changeDate}" />
	</span> 
	<span class="dalie-ui-li-desc"> 
		<!-- DB:Update --> 
		<dalie:LocalizedString key="dalie.mobile.common.db.update" />
	</span>
	
</c:forEach>
<c:remove var="MapMetaData"/>
<c:remove var="MapEntry"/>
<c:remove var="Property"/>