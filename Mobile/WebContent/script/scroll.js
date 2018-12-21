/**
 * 
 */

var scroll = {
	
	getAnchorElement : function(url){
		var parm = url.substr(url.indexOf('CpId')+1);
		var parmValue = parm.substr(parm.indexOf('=')+1);
		return 'span#' + parmValue.substr(parmValue.indexOf('=')+1);
	},	
		
	toElement : function(selector, time, verticalOffset){
		time = typeof(time) != 'undefined' ? time : 1000;
	    verticalOffset = typeof(verticalOffset) != 'undefined' ? verticalOffset : 0;
	    
	    if (utils.isNotEmpty(selector)){
	    	element = $(selector);

	    	if (utils.isNotEmpty(element.offset())) {
				console.log(element.offset());
	    		offset = element.offset();
	    		offsetTop = offset.top + verticalOffset;
	    		$('html, body').animate({
	    			scrollTop: offsetTop
	    		}, time);
			}
	    } 		
	}
};