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
		href : "./theme/css/contact/ContactPage.css"
	});
});