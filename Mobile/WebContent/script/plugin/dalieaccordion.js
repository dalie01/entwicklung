(function( $, undefined ) {

$.widget( "mobile.accordion", $.mobile.widget, {
	options: {
		expandCueText: " click to expand contents",
		collapseCueText: " click to collapse contents",
		collapsed: true,
		heading: "h1,h2,h3,h4,h5,h6",
		theme: null,
		contentTheme: null,
		inset: true,
		mini: false,
		initSelector: ":jqmData(role='accordion')",
		clickEvent: 'vclick'
	},
	
	_create: function() {
		var $el = this.element,
		o = this.options;
		
	
		var dts = $el.children(o.heading).first();
		alert(dts);
		//dts.click(onClick);
		//dts.each(hidden);
		    
	
		
		$el.on(o.clickEvent, function(e) {
	        e.preventDefault();
	        alert("UD001");
	      });
	}
	
});

	//auto self-init widgets
	$( document ).bind( "pagecreate create", function( e ) {
		$.mobile.accordion.prototype.enhanceWithin( e.target );
	});

})( jQuery );