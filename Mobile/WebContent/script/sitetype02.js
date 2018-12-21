/*
 * @DALiEWeB
 * 
 */

var siteType02 = { 
	
	reload : function(){
		var wHeight = siteType.eHeight($(window));
		console.info("wHeight" + wHeight);
		var fHeight = siteType.eOuterHeight($('div.dalie-footer'));
		console.info("fHeight" + fHeight);
		var rHeight = siteType.sResult(wHeight,fHeight);
		console.info("rHeight" + rHeight);
		siteType.sHeight($('div.dalie-container'),(rHeight - 30));

	}
	
};