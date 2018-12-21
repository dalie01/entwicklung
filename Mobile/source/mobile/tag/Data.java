package mobile.tag;

/**
 * Definition for JQuery-Mobile-DOM-Attributes.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public interface Data extends Attr {
	String DATA = "data-";
	
	String ROLE = DATA.concat("role");
	String POSITION = DATA.concat("position");

	String THEME = DATA.concat("theme");
	String DATAOVERLAYTHEME = DATA.concat("overlay-theme");
	
	String ICON = DATA.concat("icon");
	String ICONPOS = DATA.concat("iconpos");
	
	String FAVTITLE = DATA.concat("favtitle");
	String FAVSUBTITEL = DATA.concat("favsubtitle");
	
	String TRANSITION = DATA.concat("transition");
	String DIRECTION = DATA.concat("direction");
	String CORNERS = DATA.concat("corners");
	
	String DISMISSIBLE = DATA.concat("dismissible");
	
	String HISTORY = DATA.concat("history");
	
}
