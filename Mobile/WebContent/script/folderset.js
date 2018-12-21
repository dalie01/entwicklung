/**
 * FolderSet.
 * 
 * @author DALiEWEB
 * 
 * @since 1.0.0.0
 */
(function ($, undefined ) {
	
	$.widget("mobile.foldercontent", $.mobile.widget, {

		options : {
			initSelector : ":jqmData(folder='content')",
			filterSelector : ":not(:jqmData(folded='false'))"
		}
		
	});
	
	$.widget("mobile.folderset", $.mobile.widget, {

		options : {
			initSelector : ":jqmData(folder='folder-set')"
		},

		_create : function() {
			var $elem = this.element;
			o = this.options;
			//console.log("_createFolderSet");
			
			contentInSet = $elem.find(
					$.mobile.foldercontent.prototype.options.initSelector);
			
			contentFilterSet = contentInSet.filter(
					$.mobile.foldercontent.prototype.options.filterSelector);
			
			contentFilterSet.each(function() {
				
				var content = $(this);
				var contentSet = content.closest(
						$.mobile.folderset.prototype.options.initSelector);
				
				var key = $(contentSet).index()  + ":" + $(content).index();
				
				var show = localStorage.getItem(key);
				content.hide();
				
				if(show === 'visible') {
					content.show();
				}
				
			});
			
		} /* _create */
		
	});

	$.widget("mobile.folderbutton", $.mobile.widget, {

		options : {
			initSelector : ":jqmData(folder='button')",
			clickEvent : 'click'
		},

		_create : function() {
			var $elem = this.element;
			o = this.options;
			//console.log("_createFolderButton");

			$elem.off();
			$elem.on(o.clickEvent, function() {
				var content = $elem.prev();
				var contentSet = content.closest(
						$.mobile.folderset.prototype.options.initSelector);
				
			    var visible = content.animate({
					height : 'toggle'
				}, 1000).height();
							  
			    content.css("cursor","default");
			    
			    var key = $(contentSet).index()  + ":" + $(content).index();
			    
			    
				if (visible === 1) {
					localStorage.setItem(key,'visible');
					$elem.buttonMarkup({
						icon : "arrow-d"
					});
					
				} else {
					localStorage.setItem(key,'hidden');
					$elem.buttonMarkup({
						icon : "arrow-r"
					});
					
				}
				
			});

		} /* _create */
		
	});

	$(document).bind("pagecreate create", function(e) {
		
		$.mobile.folderbutton.prototype.enhanceWithin(e.target);
	});

	$(document).bind("pagecreate create", function(e) {
		
		$.mobile.foldercontent.prototype.enhanceWithin(e.target);
	});

	$(document).bind("pagecreate create", function(e) {

		$.mobile.folderset.prototype.enhanceWithin(e.target);
	});
	
})(jQuery);