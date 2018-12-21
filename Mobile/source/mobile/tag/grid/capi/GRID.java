package mobile.tag.grid.capi;

import mobile.tag.Attr;
import mobile.tag.Data;

/**
 * Definition for Unsematic CSS-Framework.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public interface GRID extends Attr, Data {
	String Grid = "grid-";	
	String Container = Grid.concat("container");
	
	String Mobile = "mobile-".concat(Grid);
	String Tablet = "tablet-".concat(Grid);
}
