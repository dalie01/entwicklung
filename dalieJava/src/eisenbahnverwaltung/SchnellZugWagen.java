package eisenbahnverwaltung;
 

class SchnellZugWagen extends PersonenWagen {

		int sitzplaetzeErsterKlasse = 0;	
	
		SchnellZugWagen(int sitzplaetze, int stehplaetze, int sitzplaetzeErsterKlasse){
			super(sitzplaetze,stehplaetze);
			this.sitzplaetzeErsterKlasse = sitzplaetzeErsterKlasse;
		}//constractor mit aufruf der vaterklasse
	
		@Override
		int getAnzahlSitzplaetze(){
			return (sitzplaetze + sitzplaetzeErsterKlasse) - stehplaetze;
		}//getAnzahlSitzplätze	
	
		@Override
		int getAnzahlPlaetze(){
			return (sitzplaetze += stehplaetze) + sitzplaetzeErsterKlasse;
		}// getAnzahlPlätze

}
