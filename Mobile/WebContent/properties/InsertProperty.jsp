<!-- properties\InsertProperty.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- MetaData -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<%@include file="/inc/Module.jsp"%>
<link href="<%= request.getContextPath()%>/theme/css/Mobile.css" rel="stylesheet" type="text/css"/>

<form data-transition="pop" name="${Property.PROPERTY_OBJECT_ID}" 
	action="./MobileApp?Page=PROPERTIES_INSERT" method="post">

<!-- WebForm:Property -->
<jsp:include page="/PropertyForm" flush="true" />   

<!-- Button -->
<fieldset id="buttons" class="ui-grid-a">
	<div class="ui-block-a">
		<input type="submit" name="${Property.PROPERTY_CLEARED}" value="Discard" data-theme="d" tabindex="7">
	</div>
	<div class="ui-block-b">
		<input type="submit" name="${Property.PROPERTY_SUBMITTED}" value="Apply" data-theme="b" tabindex="6">
		
	</div>
</fieldset>
</form>
<!-- List:all Errors -->
<c:if test="${not empty Property.error}">
<c:forEach var="error" items="${Property.error}">
	<c:out value="${error}"></c:out><br/>
</c:forEach>
</c:if>
<br><br>

<c:if test="${not empty PropertiesRecent}">
	<ul class="grid-container" data-role="listview" 
		id="propertyId" data-theme="d" data-inset="true" data-filter="true">
	
	<c:forEach var='globalEntry' items='${PropertiesRecent}'>
	<c:if test="${globalEntry != null}">
		<c:set var="pOk" scope="page" value="${globalEntry.key}" />
		<li class="grid-100 mobile-grid-100" 
			data-filtertext="<c:out value="${pOk.propertId}"/>">
		
		<c:out value="${pOk.propertId}" />
		
		<c:forEach var='propertyMap' items='${globalEntry.value}'>
      		<c:set var="pO" scope="page" value="${propertyMap.value}" />
      		<p class="ui-li-desc"><br/>
				<span style="font-family:'Courier New'; line-height: 1em; font-size: 1.5em;">
					<strong><c:out value="${pO.countryId}" /></strong> 
				</span> &nbsp;:&nbsp;
				<span style="font-family:'Courier New'; line-height: 1em; font-size: 1.5em;">
					<c:out value="${pO.description}" />
				</span>
			</p>
				
		<c:set var="dUT" scope="page" value="${pO.dataUtils}"/>
			<p class="ui-li-desc">
				<c:out value="${dUT.createDate}"/>
			</p>
    	</c:forEach>
		</li>
	</c:if>
	</c:forEach>
</ul>

</c:if>

<script type="text/javascript">

	
	var bClProperty = $('input[name="WebFromIsCleared"]');
	var bInProperty = $('input[name="WebFormIsSubmitted"]');
	var container = $('#jSWebForm_Property_HTML');
	
	var select = $('#PropertyCountryId');
	select.selectmenu('refresh', true);
	select.on('change', function (event) {
		$('input[id*=description]').val('').focus();
	});
	
	/* WEB:FORM:DISCARD */
	bClProperty.bind("click",  function( event ) {
		event.preventDefault();
		var ajax = $('input[name="Ajax"]').val();
		if (ajax.length == 0) {
			clearForm();
			$('form').submit();
		} else {
			clearForm();
			var data = $("form :input").serialize();	
    		$.ajax({
  				url : "./MobileApp?Page=PROPERTIES_INSERT",
  				data: decodeURI(data),
 				complete : function(xhr, result) {
  					if (result != "success")
 						return;
  					var response = xhr.responseText;
  					container.empty().html(response).trigger("create");
  					select.selectmenu('refresh', true);
  				}
  			});
		}
	});
	
	/* WEB:FORM:APPLY */
	bInProperty.on("click",  function( event ) {
		
		event.preventDefault();
		var ajax = $('input[name="Ajax"]').val();
		if (ajax.length == 0) {
			var input = $("<input>").attr("name", "WebFormIsSubmitted").attr("type", "hidden").val("Apply");
			$('form').append(input).submit();

		} else {
		
			var data = $("form :input").serialize();
    		$.ajax({
  				url : "./MobileApp?Page=PROPERTIES_INSERT&WebFormIsSubmitted=Apply",
  				data: decodeURI(data),
 				complete : function(xhr, result) {
  					if (result != "success")
 						return;
  					var response = xhr.responseText;
  					container.empty().html(response).trigger("create");
  				}
  			});
		}
		
	});


function clearForm() {
    $(':input').not(':submit, :reset, :hidden').val('');
}
</script>
</html>