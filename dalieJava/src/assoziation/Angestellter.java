/*
 * Created on 27.04.2009
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package assoziation;

/**
 * @author dv0101
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Angestellter {
    
    String name;
    int personalNr;
    float gehalt;
    protected Abteilung arbeitetIn;
    
    public void link(Abteilung abteilung) {
        arbeitetIn = abteilung;
    }//link
    public void unlink() {
        arbeitetIn = null;
    }//unlink
    
    public Abteilung getLink() {
        return arbeitetIn;
    }//getLink
    
}//class Angestellter
