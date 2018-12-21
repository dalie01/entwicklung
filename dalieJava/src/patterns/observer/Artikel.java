/*
 * Created of DV0101 on 30.04.2010 15:25:01
 *
 * Filename	  Artikel.java
 */
package patterns.observer;

/**
 * class Artikel.
 *
 * @version 	1.00 30.04.2010 um 15:25:01
 * @author 		DV0101
 */
public class Artikel extends Subject {
    
	/** nr: ArikelNr 4711 */
    private int nr;
    /** bezeichnung: Arikelbezeichnung Wasser */
    private String bezeichnung;
    
    /** Creates 
     *  a new instance of Artikel */
    public Artikel() {
    }//Artikel
  
    /** setNr: set Number of Artikel <br> notifyOberser */
    public void setNr(int _nr) {
        nr = _nr;
        notifyObserver();
    }//setNr
    /** getNr: return Number of Artikel */
    public int getNr() {
        return nr;
    }//getNr

    /** setBezeichung: set Artikelbezeichnung <br> notifyObserver */
    public void setBezeichnung(String _bezeichnung) {
        bezeichnung = _bezeichnung;
        notifyObserver();
    }//setBezeichung
    /** getBezeichung: return Bezeichnung of Artikel */
    public String getBezeichnung() {
        return bezeichnung;
    }//getBezeichung
}//class Artikel