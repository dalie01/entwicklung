/**
 * 
 */
jQuery(document).ready(function() {
	
	
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
		href : "./theme/css/product/ProductDetailPage.css"
	});
	
	/* set TAB2 and TAB3 invisible */
	jQuery('#fragment_tag_2, #fragment_tag_3').css("display","none"); 
	/* set class On */
	jQuery("li#tag_1.tab").children().addClass("on");
	
	jQuery("li[id^='tag_']").click(function() {
		 
		jQuery("div[id^='fragment_tag_']").each(function() {
			 jQuery(this).css("display","none");
		 });
		 
		jQuery("li[id^='tag_']").each(function(){
			 jQuery(this).children().removeClass("on");
		 });
		 jQuery("div#fragment_" + jQuery(this).attr("id")).css("display","block");
		 
		 jQuery("li#" + jQuery(this).attr("id")+ ".tab").addClass("on");
		 jQuery("li#" + jQuery(this).attr("id")+ ".tab").children().addClass("on");
	 });
	
	var docHeight = parseInt(jQuery(window).height(),10) - Math.round(0.18 * jQuery(window).height());
	var docWidth = parseInt(jQuery(window).width(),10) - Math.round(0.18 * jQuery(window).width());
	jQuery('#doc').height(docHeight);
	jQuery('#doc').width(docWidth);
	
	var peakImageHeight = docHeight - 10;
	var peakImageWidth = (docWidth - parseInt($('#docLeft').width(),10)) - 9;
	jQuery('.product-medium').nailthumb({width:peakImageWidth,height:peakImageHeight,preload:true});
	
	jQuery(".fancybox-effects-c").fancybox({
		
		maxWidth: peakImageWidth,
		minHeight: peakImageHeight,
		maxHeight: peakImageHeight,
		padding : 4,
		wrapCSS    : 'fancybox-custom',
		closeClick : true,
		openEffect : 'none',
		helpers : {
			 title : null      
			,
			overlay : {
				css : {
					'background' : 'rgba(189,180,141,0.45)'
				}
			}
		}
	});
	
});

function test(iCount, docHeight, docWidth) {
	
	var row = 1;
	if (iCount <= 3) {
		row = 1;
	} else if  (iCount <= 6) {
		row = 2;
	} else if  (iCount <= 9) {
		row = 3;
	} else if (iCount <= 12) {
		row = 4;
	}
	
	var docLeftTop = parseInt(jQuery('#docLeftTop').height(), 10);
	var tdHeight = (docHeight - docLeftTop);
	tdHeight = Math.round((tdHeight - 135) / row);
	
	var docProductMedium = parseInt($('.product-medium').width(), 10);
	var tdWidth = (docWidth - docProductMedium) / parseInt(3, 10);
	tdWidth = tdWidth - 12;
	
	jQuery('.product-image').nailthumb({
		width : tdWidth,
		height : tdHeight,
		preload : false
	});
	
	var sHeight = parseInt(jQuery('#tabs').height(), 10) - 75;
	jQuery('#docLeftBottom').height(sHeight);
}
