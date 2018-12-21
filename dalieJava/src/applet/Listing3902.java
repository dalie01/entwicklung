/*
 * @author DALiE am 04.05.2010 um 16:27:38
 * 
 * Listing3902.java
 *
 * no Copyright
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * <b>Class</b> Listing3902:<br>
 * Das folgende Beispiel zeigt ein Demo:<p><b> Life Cycle of an Applet</b></p><br>
 * 
 * @version 	1.00 04.05.2010 um 16:27:38
 * @author 	    DALiE
 */
public class Listing3902 extends Applet {
	
	StringBuffer buffer;

    @Override
	public void init() {
	buffer = new StringBuffer();
        addItem("initializing... ");
    }//init

    @Override
	public void start() {
        addItem("starting... ");
    }//start

    @Override
	public void stop() {
        addItem("stopping... ");
    }//stop

    @Override
	public void destroy() {
        addItem("preparing for unloading...");
    }//destroy

    void addItem(String newWord) {
        System.out.println(newWord);
        buffer.append(newWord);
        repaint();
    }//addItem

    @Override
	public void paint(Graphics g) {
        /*Draw a Rectangle around the applet's display area.*/
        g.drawRect(0, 0, size().width - 1, size().height - 1);

        /*Draw the current string inside the rectangle.*/
        g.drawString(buffer.toString(), 5, 15);
    }//paint


}//class Listing3902
