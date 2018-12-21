/**
 * 
 */
jQuery(document).ready(function() {
	jQuery('li.next').dequeue().stop(false, false).hide(999);
	
	jQuery("#body").ezBgResize({
		img : "theme/images/bg/Background_ScheunenDesign_SiteType_02.png", // Relative path example.  You could also use an absolute url (http://...).
		opacity : 1, // Opacity. 1 = 100%.  This is optional.
		center  : true // Boolean (true or false). This is optional. Default is true.
	});
	
	
	var tdWidthLimit = 100;
	tdWidth = parseInt($('body').width(),10) / parseInt(3,10);
	tdWidth = tdWidth - 16;
	if (tdWidth >= tdWidthLimit) {    
		jQuery('.nailthumb-container').nailthumb({width:tdWidth,height:180,preload:false});
	} else{
		jQuery('.nailthumb-container').nailthumb({width:100,height:180,preload:false});
	}
	
	jQuery("head").append("<link>");
	var css = $("head").children(":last");
	css.attr({
		rel : "stylesheet",
		type : "text/css",
		href : "./theme/css/product/ProductPage.css"
	});
	
	jQuery("li[id^='product_']").mouseover(function(){
		
		jQuery("div#"+$(this).attr("id")).css("display", "block").mouseout(function(){ 
			
			jQuery("div#"+$(this).attr("id")).css("display", "none");
		});
	    
	});
	
	jQuery("li[id^='product_']").mouseout(function() {
		
		jQuery("div#" + jQuery(this).attr("id")).css("display", "none").mouseout(function() {
					
			jQuery("div#" + jQuery(this).attr("id")).css("display", "block");
			
		});

	});

	jQuery("div#Navigation").hover(function(){
	    jQuery('li.next').dequeue().stop(false, false).show(300);
	},function(){
		jQuery('li.next').dequeue().stop(false, false).hide(999);
	});

});
jQuery(window).load(function() {
	jQuery('li.next').dequeue().stop(false, false).hide(999);
});