<%@include file="/inc/Module.jsp"%>

<link href="<%= request.getContextPath()%>/theme/css/Mobile.css" rel="stylesheet" type="text/css"/>
<style type="text/css">

a:hover {
	text-decoration: underline;
}
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
} 

</style>
<div class="grid-100 mobile-grid-100">
<br>

<div data-role="controlgroup">
	<span id="TOP"></span>
	<button id="buttonCrProperty"
		data-role="button" data-icon="arrow-u" data-iconpos="right" data-inline="true">Create</button>
</div>
<div id="jSWebForm_Property_HTML">
</div>

<table class="ui-body-d ui-shadow table-stripe" 
		data-role="table" id="propertiesTable" 
		data-mode="columntoggle"
		data-column-btn-text="PageView admin" 
		data-inset="true" 
		data-filter="true">
<thead>
	<tr>
		<th data-priority="1"><abbr>Intershop Id</abbr></th>
		<th data-priority="2">Store-Label</th>
	</tr>
</thead>
<tbody>
<tr>
<td>
<!-- FilterView by PropertyId -->
<ul class="grid-container" data-role="listview" 
	id="propertyId" data-theme="d" data-inset="true" data-filter="true">
	
	<c:forEach var='globalEntry' items='${Properties}'>
		<c:set var="pOk" scope="page" value="${globalEntry.key}" />
		<li 
			data-filtertext="<c:out value="${pOk.propertId}"/>">
			<span style="margin-bottom: 8px"><c:out value="${pOk.propertId}" /></span>
		
		
		<c:forEach var='propertyMap' items='${globalEntry.value}'>
      		<c:set var="pO" scope="page" value="${propertyMap.value}" />
      	
      		<p class="ui-li-desc">
		<a id="getUpdate"
			href="./MobileApp?Page=PROPERTIES_UPDATE&Ajax=/properties/InsertProperty.jsp&Id=${pO.propertId}&cId=${pO.countryId}&CpId=TOP">
			<span style="font-style:italic;"><c:out value="${pO.countryId}" />&nbsp;:&nbsp;<c:out value="${pO.description}" /></span>
	
		</a>
			</p>
      
    	</c:forEach>
		</li>
	</c:forEach>
</ul>
</td>
<td>
<!-- FilterView by Description -->
<ul class="grid-container" data-role="listview" 
	id="countryId" data-theme="d" data-inset="true" data-filter="true">
	
	<c:forEach var='globalEntry' items='${Properties}'>
		<c:set var="pOk" scope="page" value="${globalEntry.key}" />
	
	
		<li 
			data-filtertext="<c:out value="${pOk.description}"/>">
			<span style="margin-bottom: 8px"><c:out value="${pOk.description}" /></span>
		
			<c:forEach var='propertyMap' items='${globalEntry.value}'>
      			<c:set var="pO" scope="page" value="${propertyMap.value}" />
      			<p class="ui-li-desc">
      			<a id="getUpdate"
					href="./MobileApp?Page=PROPERTIES_UPDATE&Ajax=/properties/InsertProperty.jsp&Id=${pO.propertId}&cId=${pO.countryId}&CpId=TOP">
				<span style="font-style:italic;"><c:out value="${pO.propertId}" /></span>
				</a>
				</p>
				
    		</c:forEach>
		</li>
	
	</c:forEach>
</ul>

</td>
</tr>	
</tbody>
</table>
</div>
<script type="text/javascript">

$(":jqmData(role='page'):last").on('pageshow', function(event) {
		
	var bCrProperty = $('#buttonCrProperty');
	bCrProperty.bind('click', function( event ) {
		
		var webForm = $('form[name="PROPERTIES"]');
		var containResultHTMl = $('#jSWebForm_Property_HTML');
		
		if (webForm.length == 0) {
			bCrProperty.buttonMarkup({ iconpos: "top" });	
			$.ajax({
				url : "./MobileApp?Page=PROPERTIES_INSERT&Ajax=/properties/InsertProperty.jsp",
				complete : function(xhr, result) {
				if (result != "success")
						return;
					var response = xhr.responseText;

					containResultHTMl.hide().html(response).trigger("create").fadeIn(2000)
				}
		
			});
			
		} else {
			
			bCrProperty.buttonMarkup({ iconpos: "right" });
			containResultHTMl.fadeOut(2000).empty().trigger("create");
			window.location = "./MobileApp?Page=PROPERTIES&Mode=RESTORE";
		}
	});
	
	var aUpPropery = $('a[id=getUpdate]');
	aUpPropery.off();
	aUpPropery.on('click', function(event, element){
		var containResultHTMl = $('#jSWebForm_Property_HTML');
		event.preventDefault();
		$.ajax({
			url : $(this).attr('href'),
			complete : function(xhr, result) {
			if (result != "success")
					return;
				var response = xhr.responseText;
				bCrProperty.buttonMarkup({ iconpos: "top" });
				containResultHTMl.empty().html(response).trigger("create").fadeIn(2000);
				scrollTeaserPage("&CpId=TOP");
			}
		});
	});
});

$(':jqmData(role=page)').on('pageshow',function (event) {
	scrollTeaserPage(document.URL);
});

</script>