/*
 * @author DALiE am 04.05.2010 um 16:16:12
 * 
 * Listing3901.java
 *
 * no Copyright
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * <b>Class</b>Listing3901:<br>
 * Das folgende Beispiel zeigt ein sehr einfaches Applet, 
 * das den Text »Hello, world« auf dem Bildschirm ausgibt 
 * und in die Statuszeile des Browsers schreibt.<br>
 * 
 * @version 	1.00 04.05.2010 um 16:16:12
 * @author 	    DALiE
 */
public class Listing3901 extends Applet {
	
	@Override
	public void paint(Graphics g){
	    showStatus("Hello, world");
	    g.drawString("Hello, world",10,50);
	}//paint

}//class Listing3901
