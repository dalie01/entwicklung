/*
 * Created of DV0101 on 30.04.2010 16:02:46
 *
 * Filename	  ArtikelVerwaltung.java
 */
package patterns.observer;

/**
 * class ArtikelVerwaltung.
 *
 * @version 	1.00 30.04.2010 um 16:02:46
 * @author 		DV0101
 */
public class ArtikelVerwaltung {
     
    /** @param args the command line arguments */
    public static void main(String[] args) {
    	Artikel a = new Artikel();
    	a.setNr(88);
    	a.setBezeichnung("Java Compiler");
		
    	ArtikelView view = new ArtikelView();
		view.setSubject(a);
		view.init();
		view.setVisible(true);
		
		ArtikelView view1 = new ArtikelView();
		view1.setSubject(a);
		view1.init();
		view1.setVisible(true);
	}// main
    
}//class ArtikelVerwaltung

