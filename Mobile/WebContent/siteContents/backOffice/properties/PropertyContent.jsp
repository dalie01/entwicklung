<!-- siteContents\backOffice\properties\PropertyContent.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>


<div id="jsPropertyFormContent">
	<div data-role="button" data-theme="d" class="grid-60 mobile-grid-100 dalieButton">

		<form data-transition="pop" name="${WebForm.PROPERTY_OBJECT_ID}" 
			action="./MobileApp?Page=PROPERTY-CHECK" method="get">
			<!-- WebForm:Property -->
			<jsp:include page="/PropertyForm" flush="true" />  
		</form>
		
		<!-- List:all Errors -->
		<c:if test="${not empty WebForm.error}">
			<div class="ui-corner-all" align="left">
				<c:forEach var="errorId" items="${WebForm.error}">
					 <span class="dalie-ui-li-head">
				 		<dalie:LocalizedString key="dalie.mobile.propertyForm.${errorId}"/>
					 </span><br/>
				</c:forEach>
			</div>
		</c:if>
	
	</div><!-- /div:grid-60 -->

	<c:if test="${not empty WebForm.property.dataUtils.createDate}">
		<div data-role="button" data-theme="d" class="grid-60 mobile-grid-100 dalieButton">
	
		<div class="ui-grid-a" align="left" >
			<div class="ui-block-a">
				<br/>
				<span class="dalie-ui-li-desc">
					<!-- Project Info -->
					<dalie:LocalizedString key="dalie.mobile.backoffice.propertyContent.project.info"/>
				</span>
				<br/>
				<span class="dalie-ui-li-head">
					<c:out value="${WebForm.property.projectId}" />&nbsp;<c:out value="${WebForm.property.releaseId}" />
				</span>
				<br/><br/>
				<c:forEach var='MapEntry' items='${GroupedPropertyMap}'>
						<c:forEach var='propertyMap' items='${MapEntry.value}'>
      						<c:set var="pO" scope="page" value="${propertyMap.value}" />
								<br/>
								<span class="dalie-ui-li-desc"><c:out value="${pO.countryId}" /></span>
								<span style="font-style:italic"><c:out value="${pO.description}"/></span>
							</c:forEach>
				
				</c:forEach>
					<c:set var="metaData" scope="page" value="${WebForm.property.dataUtils}"/>
					<br/><br/>
					<span class="dalie-ui-li-head">
						<dalie:LocalizedDate fmt="${metaData.createDate}"/>
					</span>
					<span class="dalie-ui-li-desc">
						<!-- DB:Create -->
						<dalie:LocalizedString key="dalie.mobile.common.db.create"/>
					</span>
					<br/>
					<span class="dalie-ui-li-head">
						<dalie:LocalizedDate fmt="${metaData.changeDate}"/>
					</span>
					<span class="dalie-ui-li-desc">
						<!-- DB:Update -->
						<dalie:LocalizedString key="dalie.mobile.common.db.update"/>
					</span>
			</div><!-- /ui_block-a -->
			<div class="ui-block-b">
				<a data-role="button" data-rel="back" href="./MobileApp?Page=PROPERTIES-OVERVIEW-Site" 
					title="<dalie:LocalizedString key="common.search"/>">
					<!-- Button:Search --><dalie:LocalizedString key="common.search"/>
				</a>
			</div><!-- /ui_block-b -->
	
		</div><!-- /ui_grid-a -->
		</div><!-- /div:grid-60 -->
	</c:if>
		

</div><!-- /div:jsPropertyFormContent -->

<script type="text/javascript">
	
	var webForm = $("form[name='${WebForm.PROPERTY_OBJECT_ID}']");
	var webForm_Trigger = $('input[name=WebFormIsSubmitted]');
	var webForm_Content = $('#jsPropertyFormContent');
		
	/* WEB:FORM:APPLY */
	webForm_Trigger.on("click",  function( event ) {
		event.preventDefault();

		var data = $('form :input').serialize();
   		$.ajax({
   			type: webForm.attr('method'),
            url:  webForm.attr('action'),
			data: decodeURI(data),
 			complete : function(xhr, result) {
  				if (result != 'success')
 					return;
  				var response = xhr.responseText;
  				webForm_Content.empty().html(response).trigger('create');
  			}
  		});
		
	});	
</script>
