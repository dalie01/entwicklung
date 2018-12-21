package dalieAdressen;

/**
 * @author u.dalies am 06.03.2008 um 21:03:55
 *
 * Ort.java
 * 
 */

public class Ort {
    
	private int idOrt;
    private String plz;
    private String name;
    private Strasse strasse;
    private GeoDaten geo ;
    
    public Ort() {
    }//Ort
    
    
    
	/**
	 * @return Returns the strasse.
	 */
	public Strasse getStrasse() {
		return strasse;
	}//getStrasse
	/**
	 * @param strasse The strasse to set.
	 */
	public void setStrasse(Strasse strasse) {
		this.strasse = strasse;
	}//setStrasse
}//class Ort

