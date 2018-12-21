package mobile.tag.grid.builder;

import mobile.tag.grid.capi.GRID;
import mobile.utilities.support.TagSupporter;

import org.apache.commons.lang3.StringUtils;

/**
 * GridBuilder for Unsematic CSS-Framework.
 * 
 * @author DALiEWEB
 * @since 1.0.0.0
 * 
 */
public class GridBuilder extends TagSupporter {
	
	/**
	 * @param aClass additional content
	 * @return 
	 */
	public String buildContainer(String aClass) {
		
		return new StringBuffer(GRID.Container).append(
				(StringUtils.isEmpty(aClass) ? "" : " ".concat(aClass))).toString();
	}
	
	public String buildGrid(String grid) {
		StringBuilder g = null;
		
		if (isNotEmpty(grid)) {
			g = new StringBuilder(GRID.Grid).append(grid);
		}
		return getString(g);
	}
	
	public String buildGrid(String grid, String mobile) {
		StringBuilder g = new StringBuilder(buildGrid(grid));
		
		if(isNotEmpty(g.toString())) {
			if (isNotEmpty(mobile)) {
				g.append(" ").append(GRID.Mobile).append(mobile);				
			}
		} else {
			if (isNotEmpty(mobile)) {
				g.append(GRID.Mobile).append(mobile);
			}
		}
		
		return getString(g);
	}
	
	public String buildGrid(String grid, String mobile, String tablet) {
		StringBuilder g = new StringBuilder(buildGrid(grid, mobile));
		
		if(isNotEmpty(g.toString())) {
			if (isNotEmpty(tablet)) {
				g.append(" ").append(GRID.Tablet).append(tablet);				
			}
		} else {
			if (isNotEmpty(tablet)) {
				g.append(GRID.Tablet).append(tablet);
			}
		}
		return getString(g);
	}
	
	private static boolean isNotEmpty(String s) {
		return StringUtils.isNotEmpty(s);
	}
	
	private static String getString(StringBuilder g) {
		if(g != null && g.length() > 0)
			return g.toString();
		else
			return "";
	}
}
