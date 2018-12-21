/*
 * @DALiEWeB
 * 
 * 
 */
var	cType = {
	'href': './theme/css/',
	'rel' : 'stylesheet',
	'type': 'text/css'
};

var sType = {
	'src' : './script/',
	'type': 'text/javascript'	
};
var fileLoader = {
	
	loadCssTo : function(selectorTo, fileName){
		
		var link = "<link href='" + cType.href  + fileName +".css' rel='" + cType.rel  +"' type='" + cType.type +"'/>";
		console.info(link); 
		selectorTo.append(link);
	},
	
	loadCssToHead : function(fileName) {
		
		var link = "<link href='" + cType.href  + fileName +".css' rel='" + cType.rel  +"' type='" + cType.type +"'/>";
		console.info(link);
		$('link:last-of-type').append(link);
	},
	
	loadScriptToHead : function(fileName){
		var script = "<script src='"+ sType.src  + fileName +".js' type='" + sType.type +"'></script>";
		console.info(script);
		$('script:last-of-type').append(script);
	}
};