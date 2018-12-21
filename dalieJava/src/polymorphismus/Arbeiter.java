package polymorphismus;

/**
 * @author u.dalies am 14.11.2007 um 20:12:26
 *
 * Arbeiter.java
 * 
 */

public class Arbeiter extends Mitarbeiter{
    
    double stundenlohn = 23.40;
    double anzahlstunden = 40.00;
    double ueberstundenzuschlag = 12.00;
    double anzahlueberstunden = 5;
    double schichtzulage = 15.00;

    /* (non-Javadoc)
     * @see polymorphismus.Mitarbeiter#monatsBrutto()
     */
    @Override
	public double monatsBrutto() {
        
        return stundenlohn*anzahlstunden+
               ueberstundenzuschlag*anzahlueberstunden+
               schichtzulage;
    }

}

