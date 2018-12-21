<!-- siteContents\main\ajax\Ajax.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=PAGE" 
	headerTitle="Ajax" 
	title="Page" 
	transition="fade" />

<div data-role="content">	
	<p>&nbsp;</p>
	<span class="ui-li-desc">Ajax</span>

</div><!-- /CONTENT -->

 <script>
$.ajax (
	{ 
		url : "./AjaxDialog", 
		complete : function (xhr, result)
	{	
		if (result != "success") 
			return;
		
		var response = xhr.responseText;
		$("div:jqmData(role=content):last").html(response).trigger("create");
}

});  
</script>