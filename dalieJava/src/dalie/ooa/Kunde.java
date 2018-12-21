package dalie.ooa;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author dv0101 am 27.11.2008 um 20:32:02
 *
 * Kunde.java
 * 
 */

public class Kunde {

    private int nummer;
    private String name;
    private double umsatz;
    private ArrayList auftraege = new ArrayList();
    
    /** Creates a new instance of Kunde */
    public Kunde() {
    }//Kunde
    
    public void setNummer(int _nummer) {
        nummer = _nummer;
    }
    
    public int getNummer() {
        return nummer;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public String getName() {
        return name;
    }
    
    // einen Auftrag hinzufügen (link())
    public void addAuftrag(Auftrag auftrag) {
        // Nur wenn dieser Auftrag nicht schon in der Liste
        // vorhanden ist!!!
        if (!auftraege.contains(auftrag) ) {
            auftraege.add(auftrag);
            auftrag.setKunde(this);
            berechneUmsatz();
        }
    }
    
    // einen Auftrag aus der Liste löschen
    
    public void removeAuftrag(Auftrag auftrag) {
        auftraege.remove(auftrag);
        berechneUmsatz();
    }//removeAuftrag
    
    public void anzeigen() {
        System.out.println("Nummer: " + nummer + " Name: " + name +
                " Umsatz: " + getUmsatz());
        System.out.println("Auftraege:");
        Iterator itAuftraege = auftraege.iterator();
        while ( itAuftraege.hasNext() ) {
            Auftrag a = (Auftrag)itAuftraege.next();
            a.anzeigen();
        }//while
    }//anzeigen
    
    public double getUmsatz() {
        return umsatz;
    }//getUmsatz
    
    private void berechneUmsatz() {
        umsatz = 0.;
        Iterator itAuftraege = auftraege.iterator();
        while ( itAuftraege.hasNext() ) {
            Auftrag a = (Auftrag)itAuftraege.next();
            umsatz += a.getWert();
        }//while
    }//berechneUmsatz
    
    public void auftragChanged() {
        berechneUmsatz();
    }//auftragChanged

    
}//class Kunde

