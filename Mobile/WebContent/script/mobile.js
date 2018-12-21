/**
 * 
 */
function scrollTeaserPage(url){
	try {
		scroll.toElement(scroll.getAnchorElement(url),7000,-300);	
	} catch (e) {
		return false;
	}
}