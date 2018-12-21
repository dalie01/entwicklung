<!-- siteTypes/footer/Footer02.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>  

<div class="ui-body dalie-footer">

    <div class="switchView" style="display:none;">
    	<div class="logo" align="right" style="padding-right: 10%;">DALiEWeB.de</div>
    	<div data-role="navbar">
        	<ul>
            	<li><a href="./MobileApp?Page=DALIE" data-icon="grid" rel="external" data-ajax="false">Main</a></li>
            	<li><a href="./MobileApp?Page=MAIN" data-icon="user" rel="external" data-ajax="false" >Backoffice</a></li>
            	<li><a href="#" data-icon="mail" >&#160;</a></li>
        	</ul>
    	</div>
    	<!-- DIV/navbar -->
    </div><!-- DIV/switchView -->
    
    <div class="ui-body switchView switchHover">
    	<div class="logo" align="right">DALiEWeB.de</div>
    </div><!-- DIV/switchView -->
    
</div>
<script type="text/javascript">

	$(document).on("pageload", function( event ) {
	});

	$(document).on("pageinit", function( event ) {
		fileLoader.loadCssToHead("siteType02/Footer02");
		
		$('.switchView').click( function() {
			$('.switchView').animate({
			    height:'toggle'},1000);

		});
		
	});

</script>