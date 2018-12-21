package gruppenwechsel;


import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Datei Artikelstamm 
 * 001001Fernseher SW1000-20 00050000
 * 001002Fernseher SW1001-20 00055000
 * 001005Fernseher SW1000-45 00128000
 * 001013Video-Recorder V100S00079000
 * 001013Video-Recorder V100S00079000
 * 001013Video-Recorder V100S00079000
 * 005323Laptop386S/25/40/6  00299000
 * 005323Laptop386S/25/40/6  00299000
 * 005323Laptop386S/25/40/6  00299000
 * 005323Laptop386S/25/40/6  00299000
 * 005434Monitor VGA 13"     00087000
 * 007001Föhn                00001690
 * 007001Föhn                00001690 
 * 007001Föhn                00001690
 * 007001Föhn                00001690
 * 007004Lockenwickler       00001299
 * 008005Waschmaschine Z60   00099995
 * 008005Waschmaschine Z60   00099995
 * 008006Waschmaschine Z70   00119900
 * 008006Waschmaschine Z70   00119900
 * 008006Waschmaschine Z70   00119900
 * 100002CD highway to hell  00001990
 * 
 * 
*/

public class Gruppenwechsel {

	public static void main(String[] args) {

		double grpSumme = 0, preis = 0;
		int grpNr = 0, grpNrL1 = 0, seite = 1, anzahl = 0;

		try {
			BufferedReader edatei =
				new BufferedReader(
					new FileReader("C:\\Dokumente und Einstellungen\\DV0101\\ARTSTAMM.EIN"));
			
			while (0 == 0) {
				String zeile = edatei.readLine();
				//nach lesem ersten Satz -> auch einen Satz gefunden
				if (zeile == null) {
					
					System.out.println("letzter Satz");
						break;
					
					} else {
				
				// Gruppenvorlauf
				grpNr = Integer.parseInt(zeile.substring(0, 3));
				preis = Double.parseDouble(zeile.substring(26, 34)) / 100;

				System.out.println("ersterSatz von\n"+ "Gruppe "+ " Umsatz "+ " Seite:"+ seite);
				System.out.println("  " + grpNr + "      " + preis);
				grpSumme = 0;
				grpNrL1 = grpNr;

				//innerhalb der Gruppe
				while (0 == 0) {
					zeile = edatei.readLine();
					if (zeile == null) {
					
						//letzerSatz
						System.out.println("*****************************");
						System.out.println("  " + grpNrL1 + "     " + grpSumme);
						System.out.println("*****************************");
						grpSumme = 0;
						grpNrL1 = 0;
						anzahl = 0;
						System.out.println("Ende der Liste");
						break;
					
					} else {
						
						grpNr = Integer.parseInt(zeile.substring(0, 3));		
						if(grpNr != grpNrL1){
						//Gruppenwechsel
						System.out.println("*****************************");
						System.out.println("  " + grpNrL1 + "     " + grpSumme);
						System.out.println("*****************************");
						grpSumme = 0;
						grpNrL1 = grpNr;
						anzahl++;
						
						if (anzahl >= 3) {
						System.out.println("dies ist die "+ anzahl+ ". Gruppe auf der Seite : "+ seite);
						seite++;
						anzahl = 0;
						System.out.println("weiter:");
						} //endif anzahl
						
						
						}// endif GruppenNr
						
						preis = Double.parseDouble(zeile.substring(26, 34)) / 100;
						grpSumme += preis;
						grpNrL1 = grpNr;
						System.out.println("  " + grpNr + "      " + preis);
				
					} //endif zeile
				} //while
				
				}//endif erster satz
				
			} //while
			
			edatei.close();
	
			System.out.println("alle Sätze gelesen");
				
	}catch(Exception e){
	} //try
	}//main
}//class


