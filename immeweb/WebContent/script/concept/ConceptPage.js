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

	jQuery("head").append("<link>");
	var css = $("head").children(":last");
	css.attr({
		rel : "stylesheet",
		type : "text/css",
		href : "./theme/css/concept/ConceptPage.css"
	});
	jQuery(".fancybox-effects-c").fancybox({
		wrapCSS    : 'fancybox-custom',
		closeClick : true,

		openEffect : 'none',

		helpers : {
			title : {
				type : 'inside'
			},
			overlay : {
				css : {
					'background' : 'rgba(189,180,141,0.45)'
				}
			}
		}
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