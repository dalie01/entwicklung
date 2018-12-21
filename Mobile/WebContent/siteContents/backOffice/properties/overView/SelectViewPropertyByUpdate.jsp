<!-- siteContents\backOffice\properties\overView\SelectViewPropertyByUpdate.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div class="jsAjaxRefresh">
	<form data-transition="pop" name="WebPropertyForm" 
			action="./MobileApp?Page=PROPERTY-CHECK-01" method="get" data-ajax="false">
			<!-- WebForm:Property -->
			<jsp:include page="/PropertyForm01" flush="true" />  
		<div class="grid-container">
 		<div class="grid-75">
			<!-- List:all Errors -->
			<c:if test="${not empty WebForm.error}">
				<c:forEach var="errorId" items="${WebForm.error}">
					 <span class="dalie-ui-li-head">
			 			<dalie:LocalizedString key="dalie.mobile.propertyForm.${errorId}"/>
					 </span><br/>
				</c:forEach>
			</c:if>
		</div><!-- /DIV:grid-75 -->
		<div class="grid-25" style="float: right;">
			<!-- BUTTEN:APPLY -->
			<div class="${WebForm.PROPERTY_SUBMITTED}" 
				data-role="button" 
				data-theme="b">
				<dalie:LocalizedString key="common.capture"/>
			</div>		
 		</div><!-- /DIV:grid-25 -->
		</div><!-- /DIV:grid-container -->
	</form>
</div><!-- /Div:jsAjaxResult -->	




