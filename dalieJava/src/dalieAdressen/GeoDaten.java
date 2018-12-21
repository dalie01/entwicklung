/*
 * Created on 30.05.2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package dalieAdressen;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class GeoDaten {

	public int idGeoDaten, x = 0/**beschreibt die x-Kordinate*/, y = 0;/**beschreibt die y-Kordinate*/

	GeoDaten(int idGeoDaten) {
		this.idGeoDaten = idGeoDaten;
	}//construktor GeoDaten

}//class GeoDaten
