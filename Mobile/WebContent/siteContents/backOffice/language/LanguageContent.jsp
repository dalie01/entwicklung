<!-- siteContents\backOffice\language\LanguageContent.jsp -->
<%@ page language="java" import="mobile.utilities.support.JspSupporter" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>


<% 
  synchronized (pageContext) {
	com.dalie.beehive.localization.internal.LocalInformation current 
	= JspSupporter.getCurrentLocalInformation(pageContext); 
    pageContext.setAttribute("pageLanguageId", current.getLanguageId(), PageContext.PAGE_SCOPE);
  }
%>

<div data-role="fieldcontain">
    <fieldset data-role="controlgroup">
    	<legend>Choose a pet:</legend>
	<c:forEach var='LocalInformations' items='${allLocalInformations}'>
	<c:set var='LocalId' scope="page" value='${LocalInformations.key}'/>
	<c:set var='LocalInformation' scope="page" value='${LocalInformations.value}'/>
    	<input type="radio" name="radio-choice" id="radio-choice-${LocalId}" value="${LocalInformation.locale.language}" 
    	<c:if test="${LocalId eq pageLanguageId}">
    		checked="checked" 
    	</c:if>
    	data-href='./MobileApp?Page=LANGUAGE-SET&SelectedLanguage=${LocalId}' 
    	/>
		<label for="radio-choice-${LocalId}">${LocalId}</label>
	</c:forEach>
</fieldset>
    

</div>
<script type="text/javascript">
	$(":jqmData(role='page')").on("pageshow", function(event) {
		$("input[type='radio']").off("change");
		$("input[type='radio']").on("change", function(event, ui) {
			if (typeof $(this).attr('data-href') !== "undefined") {
				document.location.href = $(this).attr('data-href');
			}
		});
	});
	</script>

	