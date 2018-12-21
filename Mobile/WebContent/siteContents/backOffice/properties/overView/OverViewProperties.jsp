<!-- siteContents\backOffice\properties\PropertyListAllContent.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<br/><br/>
<div class="grid-100 mobile-grid-100">
	<div class="grid-50 mobile-grid-100">
		<ul data-role="listview" data-theme="d" data-inset="true" data-filter="true">
	
			<c:forEach var='MapEntry' items='${GroupedPropertiesMap}' varStatus="theCount">
				<c:set var="WebForm" scope="session" value="${MapEntry.key}" />
				<c:set var="PropertyIndex" scope="session" value="${theCount.index}"/>
				
		 		<div data-filtertext="<c:out value="${WebForm.property.propertId}"/>" data-folder="folder-set" data-theme="c" data-inset="true">
	  		
     				<!-- Property:Insert -->
					<div data-folder="content" data-folded="true" data-role="button" data-theme="c">
						<div align="right">
							 <a href="./MobileApp?Page=PROPERTY&PropertyId=${WebForm.property.propertId}&CountryId=${WebForm.property.countryId}" 
							 	data-role="button" data-icon="search" 
							 	data-iconpos="notext"
							 	title="<dalie:LocalizedString key="dalie.mobile.common.zooum.in"/>"
							 	>&nbsp;</a>
						</div><!-- /divRight -->	
						<div class="SelectViewPropertyByDefault${theCount.index}">
							<jsp:include page="/SelectViewPropertyByDefault" flush="true"/>
						</div>
						<div class="SelectViewPropertyByUpdate${theCount.index}" style="display:none;">
							<!-- JSP:MetaData show Property MetaData Date Time and also on kinds -->
							<jsp:include page="/SelectViewPropertyByUpdate" flush="true"/>
							<div class="grid-container">
 								<div class="grid-75" style="float: left;">
 								</div><!-- /DIV:grid-75 -->
								<div class="grid-25" style="float: right;">
									<div class="SelectViewPropertyToDefault" id="${PropertyIndex}" 
										data-role="button" 
										data-icon="back"
										data-iconpos="right">
										<!-- Button:Details -->
										<dalie:LocalizedString key="common.Edit" />
									</div>
								</div><!-- /DIV:grid-25 -->
							</div><!-- /DIV:grid-container -->	
						</div>
					</div><!-- /div_content -->
					<div data-folder="button" data-role="button" data-icon="arrow-r" data-iconpos="right" data-inset="false" data-theme="c">
						<div align="left">
							<span class="dalie-ui-li-desc">
								Identifier
							</span>
							<span class="dalie-ul-li-head"> 
							 	<c:out value="${WebForm.property.propertId}" />
							</span>
							
						<div id="jsPropertyContentData${PropertyIndex}" data-url="./MobileApp?Page=PROPERTY-REFRESH&PropertyId=${WebForm.property.propertId}">
							<c:forEach var='propertyMap' items='${MapEntry.value}'>
							
      							<c:set var="pO" scope="page" value="${propertyMap.value}" />
								<br/>
								<span class="dalie-ui-li-desc"><c:out value="${pO.countryId}" /></span>
								<span style="font-style:italic"><c:out value="${pO.description}"/></span>
							</c:forEach>
						</div><!-- /div_jsPropertyRefresh -->
						</div><!-- /div_left -->
					</div><!-- /div_button -->	
				</div><!-- /div_folder-set -->
			</c:forEach>
			<c:remove var="MapEntry"/>
			<c:remove var="WebForm"/>
			<c:remove var="PropertyIndex"/>
		</ul>
	</div><!-- /div_grid-50 -->
	<div class="grid-50 mobile-grid-100">
		<p>&nbsp;</p>
	</div><!-- /div_grid-50 -->
</div><!-- /div_grid-100 -->
<script type="text/javascript">
		
	
	function bindEvents() {
		var sEventPropertyToUpdate = $("div.SelectViewPropertyToUpdate");
		sEventPropertyToUpdate.on('click', function(event) {
			$('div.SelectViewPropertyByDefault' + $(this).attr("id")).animate({
					height : 'toggle'}, 1000);	
			$('div.SelectViewPropertyByUpdate' + $(this).attr("id")).animate({
					height : 'toggle'}, 1000);	
		});
		
		var sEventPropertyToDefault = $("div.SelectViewPropertyToDefault");
		sEventPropertyToDefault.on('click', function(event) {
			$('div.SelectViewPropertyByUpdate' + $(this).attr("id")).animate({
					height : 'toggle'}, 1000);	
			$('div.SelectViewPropertyByDefault' + $(this).attr("id")).animate({
					height : 'toggle'}, 1000);
			
			ajaxReload($('div#jsPropertyMetaData' + $(this).attr("id")));
			ajaxReload($('div#jsPropertyContentData' + $(this).attr("id")));
			
		});
		
		bindReload();
	}

	function ajaxReload( aElements ) {
			
		$.each( aElements, function( index, domEle ) {
			$.ajax({
				url: $(this).data('url'),
				async: false,
				complete : function(xhr, result) {
					if(result != 'success')
						return;
					var response = xhr.responseText;
					aElements.html(response).trigger('create');
				}
			});
		});
	}
	
	function bindReload() {
		
		
		/* WEB:FORM:APPLY */
		var webForm_Trigger = $('div.WebFormIsSubmitted');
		webForm_Trigger.on("click", function( event ) {
			event.preventDefault();
			var webForm = $(this).closest("form");
			var data = $(':input',webForm).serialize();
			var contain = webForm.closest("div");
			
	   		$.ajax({
		   		type: webForm.attr('method'),
		        url:  webForm.attr('action'),
				data: decodeURI(data),
		 		complete : function(xhr, result) {
		  			if (result != 'success')
		 				return;
		  			var response = xhr.responseText;
		  			contain.html(response).trigger('create');
	  				bindReload();
	  			}
	  		});
		
		});
		
	}
	
	$(':jqmData(role=page)').on('pageshow',function (event){
    	bindEvents();
  	});
	 	
</script>
