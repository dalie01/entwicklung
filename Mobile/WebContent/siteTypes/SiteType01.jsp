<!-- siteTypes\SiteType01.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/Hosted_1_3_1" flush="true" />		
<title>${SiteTitle}</title>
</head>
<body>
<script type="text/javascript">
<!-- Hack to disable page caching of jQuery mobile -->
	$(document).off("pagehide");
	$(document).on("pagehide", "div", function(event, ui) {
		$(event.target).remove();
	});
</script>
<div data-role="page" id="jsPage" data-theme="c">

	<dalie:LocalizedInformation selectedLanguageId="${SelectedLanguage}" />
	
	<jsp:include page="${SiteContent}" flush="true" />		
	
	<div data-role="footer" data-id="global-footer" data-position="fixed">
		<jsp:include page="/Footer01" flush="true" />		
	</div><!-- /footer -->
	
</div><!-- /page -->

</body>
</html>