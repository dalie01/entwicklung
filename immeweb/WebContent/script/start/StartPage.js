jQuery(document).ready(function() {

	jQuery("#body").ezBgResize({
		img : "theme/images/bg/Background_ScheunenDesign_SiteType_01.png", // Relative path example.  You could also use an absolute url (http://...).
		opacity : 1, // Opacity. 1 = 100%.  This is optional.
		center  : true // Boolean (true or false). This is optional. Default is true.
	});
	
	jQuery("head").append("<link>");
	var css = $("head").children(":last");
	css.attr({
		rel : "stylesheet",
		type : "text/css",
		href : "./theme/css/start/StartPage.css"
	});
	
	jQuery("td[abbr='PRODUCT']").mouseover(function(){
        jQuery("td[abbr='PRODUCT']").css("border-left" , "2px outset #82794A")
        	.css("border-right" , "2px outset #82794A")
        		.css("background-color", "#82794A").mouseout(function(){
              jQuery("td[abbr='PRODUCT']").css("border-left" , "0px solid #FFFFFF")
              	.css("border-right" , "0px solid #FFFFFF").css("background-color", "#82794A");
        });
	});

	jQuery("td[abbr='CONTACT']").mouseover(function(){
        jQuery("td[abbr='CONTACT']").css("border-left" , "2px outset #82794A")
        	.css("border-right" , "2px outset #82794A")
        		.css("background-color", "#82794A").mouseout(function(){
              jQuery("td[abbr='CONTACT']").css("border-left" , "0px solid #FFFFFF")
              	.css("border-right" , "0px solid #FFFFFF").css("background-color", "#82794A");
        });
	});
	
	jQuery("td[abbr='CONCEPT']").mouseover(function(){
        jQuery("td[abbr='CONCEPT']").css("border-left","2px outset #82794A")
        	.css("border-right" , "2px outset #82794A")
        		.css("background-color", "#82794A").mouseout(function(){
              jQuery("td[abbr='CONCEPT']").css("border-left","0px solid #FFFFFF")
              	.css("border-right","0px solid #FFFFFF").css("background-color","#82794A");
        });
	});
	
	jQuery("td[abbr='HISTORY']").mouseover(function(){
        jQuery("td[abbr='HISTORY']").css("border-bottom","2px outset #82794A")
        	.css("border-right","2px outset #82794A")
        		.css("background-color", "#82794A").mouseout(function(){
              jQuery("td[abbr='HISTORY']").css("border-left","0px solid #FFFFFF")
              	.css("border-right","0px solid #FFFFFF").css("background-color","#82794A");
        });
	});
});

