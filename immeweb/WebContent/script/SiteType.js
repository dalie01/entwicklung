jQuery(window).bind("resize", function() {
	ezBgResize().each(function(){
			if(this.complete || (jQuery.browser.msie && parseInt(jQuery.browser.version) == 6))
			 jQuery(this).trigger("load");
		});
});

jQuery(function() {
	jQuery("#Navigation").ready(loadNavigation);
});

function appendTo(navigation) {
		jQuery('#Navigation').html(navigation);
}

function loadNavigation() {
		jQuery.ajax({
			type: "POST",
			url : "/immeweb/ImmeNavi",
			success : appendTo
		});
}
	
	
