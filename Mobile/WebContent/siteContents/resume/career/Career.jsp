<!--- siteContents\resume\career\Career -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="spacer-t1em border-suround-s-3D">
	<jsp:include page="/dmc" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/judo" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/flex" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/schlecker" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/voigt" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/noba" flush="true"/>
</div>

<div class="spacer-t3em border-suround-s-3D">
	<jsp:include page="/bund" flush="true"/>
</div>

<script type="text/javascript">

	$(document).on("pageinit", function( event, ui ) {
		fileLoader.loadCssToHead("siteContents/resume/career/career");
	});
</script>