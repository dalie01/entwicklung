<!-- siteContents\main\serviceOption\ServiceOptionsList.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=MAIN" 
	headerTitle="${SiteTitle}" 
	title="Home" 
	transition="fade" 
	favSite="true" 
	favSubTitle="Demo of ServiceOptions" />

<jsp:include page="/MainTeaser" flush="true" />	

<div data-role="content">	
	<p>&nbsp;</p>

<form name="SoWebForm" id="exeWebForm" method="post" data-transiton="pop" action="">
<ul data-role="listview" data-inset="true">
	<c:forEach var="sO" items="${ServiceOptions}">
	<li>
	<div class="ui-grid-a">
		<div class="ui-block-a">
			<div class="ui-grid-a">
				<div class="ui-block-a">
					<span id="${sO.productId}">
						<c:out value="${sO.productId}"/>
					</span>
				</div>
				<div class="ui-block-b">
					ActivationDate:&nbsp;<c:out value="${sO.activationDate}"/>
					<p class="ui-li-desc">&nbsp;</p>
					<div id="Hint_${sO.productId}"><p class="ui-li-desc">Hello</p></div>
					<p class="ui-li-desc"><span class="ui-li-aside">
							<b>Status:&nbsp;</b><c:out value="${sO.status}"/>
					</span>
						</p>
					<p class="ui-li-desc"><b>Installed:&nbsp;</b><c:out value="${sO.installed}"/></p>
					<p class="ui-li-desc"><b>Modifiable:&nbsp;</b><c:out value="${sO.modifiable}"/></p>
				</div>
			</div>
		</div>
		<div class="ui-block-b" align="right">
		<c:choose>
             <c:when test="${sO.installed}">
             	<select data-role="slider" 
                	id="${sO.productId}" 
                	name="isDeActived_${sO.productId}" 
					<c:if test="${sO.modifiable == 'false'}">disabled="disabled"</c:if>
                >
                	<option value="${sO.productId}">O</option>
                	<option selected="selected">O</option>
             	</select>
            </c:when>
			<c:otherwise>
           		<select data-role="slider" 
           			id="${sO.productId}" 
           			name="isActived_${sO.productId}"
           			<c:if test="${sO.modifiable == 'false'}">disabled="disabled"</c:if> 
        		>
               		<option value="${sO.productId}">I</option>
               		<option>O</option>
                </select>
		</c:otherwise>                 
		</c:choose>
		
		</div>
	</div><!-- /grid-a -->
	</li>
	</c:forEach>
</ul>

	<fieldset class="ui-grid-a">
		<div class="ui-block-a">&nbsp;</div>
		<div class="ui-block-b" align="right">
			<input type="button" id="getSoDialog" data-inline="true" value="Übernehmen"/>
		</div>
	</fieldset>		
	<jsp:include page="/ServiceOptionsDialog" flush="true" />	
</form>
</div><!-- PAGE:CONTENT -->
<script type="text/javascript">
		
	$(':jqmData(role=page)').on('pageinit',function (event){
    	$("div[id*=Hint_]").hide();    	
  	});

	function bindEvents() {
		
		var sliders = $("select[name*=isActived]");
		$.each( sliders , function(index, val){
			
			$(this).on('change', function(event){
				console.log(event.target.selectedIndex);
				$('div[id=Hint_' + $(this).attr("id") + ']').fadeToggle("slow", "linear");	
			});
		});
		
		var soDialog = $("input[id=getSoDialog]");
		soDialog.off();
		soDialog.on('click', function(event){
			$("div#" + soDialog.attr("id")).popup("open");
		});
		
		var execWebForm = $("input[name=execWebForm]");
		execWebForm.off();
		execWebForm.on('click', function(event){
			$("#exeWebForm").submit();		
		});
	}
	
	$(':jqmData(role=page)').on('pageshow',function (event){
    	scrollTeaserPage(document.URL);
    	bindEvents();
  	});

	
</script>
