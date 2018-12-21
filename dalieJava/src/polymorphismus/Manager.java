package polymorphismus;

/**
 * @author u.dalies am 14.11.2007 um 20:21:46
 *
 * Manager.java
 * 
 */

public class Manager extends Mitarbeiter {
    
    double fixgehalt = 100.00;
    double provision1 = 20.00;
    double provision2 = 30.00;
    double umsatz1 = 10000.00;
    double umsatz2 = 15000.00;
    
    /* (non-Javadoc)
     * @see polymorphismus.Mitarbeiter#monatsBrutto()
     */
    @Override
	public double monatsBrutto() {
        return 	fixgehalt+
        umsatz1*provision1/100+
        umsatz2*provision2/100;
    }//monatsBrutto

}//class Manager

