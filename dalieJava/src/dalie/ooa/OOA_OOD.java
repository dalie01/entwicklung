package dalie.ooa;

/**
 * @author dv0101 am 27.11.2008 um 20:30:26
 *
 * OOA_OOD.java
 * 
 */

public class OOA_OOD {
    
   	public static void main(String[] args) { 
        Kunde k = new Kunde();
        k.setNummer(12345);
        k.setName("Meier");
        
        Kunde k1 = new Kunde();
        k1.setNummer(32323);
        k1.setName("Hauser");
        
        Auftrag a = new Auftrag(6363, "Programmierung", k);
        //k.addAuftrag(a); geschieht schon in Klasse Auftrag
        a.setWert(5000.);
        Auftrag a1 = new Auftrag(8332, "Entwurf", k);
        //k.addAuftrag(a1); 
        a1.setWert(15000.);
        
        a.setKunde(k1); // Kunde ändern k --> k1
        
        k.anzeigen();
        k1.anzeigen();
        
        
        k1.removeAuftrag(a);
        
        k.anzeigen();
        k1.anzeigen();
        
    }//main

    
}//class OOA_OOD

