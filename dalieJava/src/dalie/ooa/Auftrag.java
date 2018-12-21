package dalie.ooa;

/**
 * @author dv0101 am 27.11.2008 um 20:31:21
 *
 * Auftrag.java
 * 
 */

public class Auftrag {

    private int nummer;
    private String bezeichnung;
    private double wert;
    private Kunde kunde; // Assoziation (link) zum Kunden-Objekt
    
    
    public Auftrag(int _nummer, String _bezeichnung, Kunde _kunde) {
        setNummer(_nummer);
        setBezeichnung(_bezeichnung);
        setKunde(_kunde);
    }
    
    public void setNummer(int _nummer) {
        nummer = _nummer;
    }
    
    public int getNummer() {
        return nummer;
    }
    
    public void setBezeichnung(String _bezeichnung) {
        bezeichnung = _bezeichnung;
    }
    
    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public void setKunde(Kunde _kunde) { //link()
        if (kunde != _kunde) {
            if (kunde != null) {
                // Auftrag beim alten Kunden entfernen
                kunde.removeAuftrag(this);
            }
            kunde = _kunde;
            // Auftrag beim neuen Kunden dazunehmen
            _kunde.addAuftrag(this);
        }
    }//setKunde
    
    public Kunde getKunde() {
        return kunde;
    }//getKunde
    
    public void anzeigen() {
        System.out.println("Nummer: " + nummer + " Bezeichnung: "
                + bezeichnung + " Wert: " + wert);
    }//anzeigen
    
    public void setWert(double _wert) {
        wert = _wert;
        kunde.auftragChanged();
    }//setWert
    
    public double getWert() {
        return wert;
    }//getWert

    
}//class Auftrag

