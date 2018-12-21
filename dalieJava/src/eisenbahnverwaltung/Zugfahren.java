package eisenbahnverwaltung;

import java.util.ArrayList;

public class Zugfahren {

		public static void main(String[] args){
			
			ArrayList anzahlwagen = new ArrayList();

			Zug N12345 = new Zug(new Lokomotive(100));
			try{
			PersonenWagen pw = new PersonenWagen(50,100);	
			anzahlwagen.add(pw);
			N12345.addWagen(pw);
			}catch(Exception e){System.out.println(e.getMessage());}
			try{
			SchnellZugWagen sw = new SchnellZugWagen(50,100,25);
			anzahlwagen.add(sw);
			N12345.addWagen(new SchnellZugWagen(50,100,25));
			}catch(Exception e){System.out.println(e.getMessage());}
			
			System.out.println("Anzahl Plätze......: " + N12345.getPlatze(anzahlwagen));
			System.out.println("Anzahl Sitzplätze..: " + N12345.getSitzplaetze(anzahlwagen));
			
		}//main

}//class
