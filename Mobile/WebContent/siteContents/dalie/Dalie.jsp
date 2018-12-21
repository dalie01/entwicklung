<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<div data-role="main" class="ui-body" style="margin-top: 0.1%;">	
	<div class="dalie-container dalie-borderHide" align="center">
<!-- #DACDB9 #9A4141  #993D3D--> 	
   	<div class="grid-container dalie-container" align="center" style="margin-top: -0.5%; padding: 0.3%; background-color: #DACDB9;">
   		<div class="grid-100 border_ spacer-t20">
			<jsp:include page="/Logo" flush="true"/>	
   		</div><!-- DIV:GRID-100 -->
  	</div><!-- DIV:CONTAINER -->

  	</div><!-- DIV:CONTAINER -->
</div><!-- DIV:Main -->

<script type="text/javascript">

	$(document).on("pageload", function( event, ui ) {

	});

	$(document).on("pageinit", function( event, ui ) {
		fileLoader.loadCssToHead("dalie/dalie");
		fileLoader.loadCssToHead("logo/logo");
		fileLoader.loadScriptToHead("logo");
	
	});

	$(document).bind("pageshow", function(event, ui) {
		siteType02.reload();
		
		var elements = $('img.LogoImg, img.LogoArrow');
		elements.each(function(index) {
			logo.setImageSize($(this),siteType.eHeight($(window)));
			
		});
		
		var elements = $('img.LogoImg');
		elements.each(function(index) {
			logo.setRandomImageSize($(this),siteType.eHeight($(window)));
			
		});
		
		var elements = $('img.LogoArrow');
		elements.each(function(index) {
			logo.arrowRandomEndWithFirst($(this),siteType.eHeight($(window)));
			
		});
		
		$('img.LogoArrow').hover(function( ) {
			logo.arrowRandom($(this),siteType.eHeight($(window)));
		
		}, function() {
			logo.arrowRandomEndWithFirst($(this),siteType.eHeight($(window)));
		
		});
		
		$('img.LogoLink').hover(function() {			
			logo.setMouseOverImageLink($(this),siteType.eHeight($(window)));
			var containResultHtml = $('#logo_table_1 tr:nth-last-child(2) td:eq(0)');
			logo.getBanner(containResultHtml, $(this).data('page'));
			
		}, function() {
			logo.removeMouseOverImageLink($(this),siteType.eHeight($(window)));
			var containResultHtml = $('#logo_table_1 tr:nth-last-child(2) td:eq(0)');
			logo.getDefaultBanner(containResultHtml);
			
		});
	});
	
	$(document).unbind('Dalieweb.Logo.Notification.Refresh').bind('Dalieweb.Logo.Notification.Refresh', function(event) {
		var elements = $('img.LogoImg, img.LogoArrow');
		elements.each(function(index) {
			logo.conclusion($(this),siteType.eHeight($(window)));
	
		}); 
    });
	
	$(document).bind("pagechange", function(event, ui) {
	
	});
	
	$(window).bind("resize", function(event, ui) {
		siteType02.reload();
		clearTimeout(this.id);
        this.id = setTimeout(readyResizing, 200);		
	
	});

	
	function readyResizing(){
		
		var elements = $('img.LogoImg');
		elements.each(function(index) {
			logo.setRandomImageSize($(this),siteType.eHeight($(window)));
			
		});
		
		var elements = $('img.LogoArrow');
		elements.each(function(index) {
			logo.arrowRandomEndWithFirst($(this),siteType.eHeight($(window)));	
	
		});
		
	}
	
</script>