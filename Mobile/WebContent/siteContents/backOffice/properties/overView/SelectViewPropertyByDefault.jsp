<!-- siteContents\backOffice\properties\overView\SelectViewPropertByDefault.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div class="ui-grid-a" align="left">
	<div class="ui-block-a">
		<br /> 
		<span class="dalie-ui-li-desc">Release</span> 
		<br /> 
		<span class="dalie-ui-li-head"> 
		<c:out value="${WebForm.property['projectId']}" />&nbsp;<c:out value="${WebForm.property['releaseId']}" />
		</span>
		<div id="jsPropertyMetaData${PropertyIndex}" data-url="./MobileApp?Page=PROPERTY-REFRESH-01&PropertyId=${WebForm.property.propertId}">
			<c:set var="metaData" scope="page" value="${WebForm.property.dataUtils}" />
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
		</div><!-- /DIV:jsPropertyMetaRefresh -->
	</div>
	<!-- /ui_block-a -->
	<div class="ui-block-b">
		<div class="SelectViewPropertyToUpdate" id="${PropertyIndex}" 
			data-role="button"
			data-iconpos="right"
			data-icon="plus">
			<!-- Button:Edit -->
			<dalie:LocalizedString key="common.Edit" />
		</div>

	</div>
	<!-- /ui_block-b -->
</div>
<!-- /ui_grid-a -->