<!-- siteTypes\SiteType02.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<jsp:include page="/Hosted_1_4_2" flush="true" />		
<title>${SiteTitle}</title>
</head>
<body>
<div data-role="page">
	
	<jsp:include page="${SiteContent}" flush="true" />	
	
	<div data-role="footer" data-position="fixed" style="background-color:#F8F8F6; border: 0px solid #FFFFFF;">
		<jsp:include page="/Footer02" flush="true" />		
	</div><!-- /footer -->
	
</div><!-- /page -->

</body>

<script type="text/javascript">

	$(document).on("pageinit", function( event, ui ) {
		fileLoader.loadCssToHead("siteType02/SiteType02");
	});

</script>
</html>