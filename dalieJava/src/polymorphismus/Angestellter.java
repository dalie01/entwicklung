package polymorphismus;

/**
 * @author u.dalies am 14.11.2007 um 20:18:02
 *
 * Angestellter.java
 * 
 */

public class Angestellter extends Mitarbeiter {
    
    double stundenlohn = 45.00;
    double anzahlstunden = 40.45;
    double ueberstundenzuschlag = 25.00;
    double anzahlueberstunden = 10;
    double schichtzulage = 10.00;

    
    
    /* (non-Javadoc)
     * @see polymorphismus.Mitarbeiter#monatsBrutto()
     */
    @Override
	public double monatsBrutto() {
        return stundenlohn*anzahlstunden+
        ueberstundenzuschlag*anzahlueberstunden+
        schichtzulage;
    }

}//Class Angestellter

