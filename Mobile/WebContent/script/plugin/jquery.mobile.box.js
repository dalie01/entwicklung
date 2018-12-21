
(function($, undefined){

	 $.widget("mobile.box", $.mobile.widget, {
		 options: {
			 theme: "d",
			 initSelector: ":jqmData(role='box')"
		 },
		 
		 _create: function() {
			 var el = this.element;
			 o = this.options;
			 var theme =  (typeof el.data('theme') !== 'undefined' ? el.data('theme') : o.theme);

			 if(typeof el.data('folded') === 'undefined' || el.data('folded') === true){
				 el.css({display:'none'}).before("<div data-role='boxHead' class='ui-body ui-icon-arrow-r ui-btn-icon-right " +
				 		"ui-box-head-" + theme  + "'>" 
						 + (typeof el.data('head') !== 'undefined' ? "<p>" + el.data('head') + "</p>" : "&nbsp;") + "</div>");
			 
			 } else {
				 el.before("<div data-role='boxHead' class='ui-body ui-icon-arrow-d ui-btn-icon-right " +
						 "ui-box-head-" + theme  + " ui-box-head-toggle-" + theme  + "'>" 
						 +  (typeof el.data('head') !== 'undefined' ? "<p>" + el.data('head') + "</p>"  : "&nbsp;") + "</div>");	
			 }
			 el.wrapInner("<div class='ui-body " +
					 "ui-box-context-" + theme  + "'></div>");
			 
		 }
		 
	 });
	 
	 
	 $(document).bind("pageshow", function (e) {
		
		 var mBoxes = $(":jqmData(role='boxHead')");
		 mBoxes.each(function(i) {
			$(this).unbind('click').bind('click', function() {
				var theme =  (typeof $(this).next(":jqmData(role='box')").data('theme') !== 'undefined' ? $(this).next(":jqmData(role='box')").data('theme') : "d");
				
				if ($(this).next(":jqmData(role='box')").is(':visible')) {
					
					$(this).next(":jqmData(role='box')").animate({ height:'toggle'},1000);
					$(this).removeClass('ui-box-head-toggle-' + theme);
					$(this).addClass('ui-box-head-' + theme);
					$(this).removeClass("ui-icon-arrow-d");
					$(this).addClass("ui-icon-arrow-r");

	         	} else {
	         		$(this).next(":jqmData(role='box')").animate({ height:'toggle'},1000);
	              	$(this).addClass('ui-box-head-' + theme);
	              	$(this).addClass('ui-box-head-toggle-' + theme);
	              	$(this).removeClass("ui-icon-arrow-r");
	              	$(this).addClass("ui-icon-arrow-d");
	                
	         	}
				
			});		
		}); 
	 });
	 
})(jQuery);