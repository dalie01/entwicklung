package eisenbahnverwaltung;

import java.util.ArrayList;

class Zug {

	Lokomotive lok = new Lokomotive(100);
	ArrayList wagen = new ArrayList();
	
		Zug(Lokomotive lok){
			this.lok = lok;		
		}// construktor

		void addWagen(PersonenWagen pw) throws Exception{
			if(wagen.size() < lok.leistungps){
			wagen.add(pw);
			}else{new Exception("Die Leistung der Lokomotive wurde überschrieten");}
		}//Methode addWagen

		void addWagen(SchnellZugWagen sw) throws Exception{
			if (wagen.size() < lok.leistungps){
			wagen.add(sw);
			}else{new Exception("Die Leistung der Lokomotive wurde überschrieten");}
		}//Methode addWagen


		int getSitzplaetze(ArrayList wagen){
			int anzahlsitzplaetze = 0;
			for(int i = 0;i < wagen.size();i++){
				anzahlsitzplaetze += ((PersonenWagen)wagen.get(i)).getAnzahlSitzplaetze(); 
			}//for
			return anzahlsitzplaetze;		
		}//getSitzplaetze

		int getPlatze(ArrayList wagen){
			int anzahlplaetze = 0;
			for(int i = 0;i < wagen.size();i++){
				anzahlplaetze += ((PersonenWagen)wagen.get(i)).getAnzahlPlaetze(); 
			}//for
			return anzahlplaetze;
		}


}//class
