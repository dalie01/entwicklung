/*
 * Created on 27.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package assoziation;

import java.util.Vector;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Abteilung {
    
    String bezeichung;
    protected Vector Mitarbeiter;
    
    public void link (Angestellter angestellter) {
        Mitarbeiter.addElement(angestellter);
    }//link
    
    void unlink(Angestellter angestellter) {
        Mitarbeiter.removeElement(angestellter);
    }//unlink
    
    Angestellter getlink(int pos) {
        return (Angestellter)Mitarbeiter.elementAt(pos);
    }//getLink
    
}//class Abteilung
