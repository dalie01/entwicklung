/*
 * Created on 02.08.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package privat.allgemein; 

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DalieWindow extends JFrame{

    /**
     * 
     * @param x Breite
     * @param y Höhe
     * @param name Name des Windows und gleichzeitig Titel des Windows
     * 
     */	
    public DalieWindow( int x, int y , String s){
      //setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setName(s);
      setTitle(s);
      setVisible(true);
      setSize( x, y );
      Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation( (d.width  - getSize().width ) / 2,(d.height - getSize().height) / 2 );//mitte des Bildschirmes
      
    }//DalieWindow
    
    
}//class DalieWindow
