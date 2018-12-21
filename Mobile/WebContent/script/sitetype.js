/*
 * @DALiEWeB
 * 
 */
var siteType = {
	
	eHeight : function (element) {
		 return parseInt(element.height(),10) ;
	},
	
	eOuterHeight : function (element) {
		return  parseInt(element.outerHeight(true),10);
	},
	
	sHeight : function (element, nHeight) {
		return  element.height(nHeight);
	},
	
	sResult : function (v1, v2) {
		return ((v1 - v2)).toFixed(0);
	}
	
};