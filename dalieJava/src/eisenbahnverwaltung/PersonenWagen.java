package eisenbahnverwaltung;
 

class PersonenWagen {
	protected int sitzplaetze = 0; 
	int stehplaetze = 0;
	
	PersonenWagen(int sitzplaetze, int stehplaetze){
		this.sitzplaetze = sitzplaetze;
		this.stehplaetze = stehplaetze;
	}//construktor

	int getAnzahlSitzplaetze(){
		return sitzplaetze;
	}//getAnzahlSitzpl�tze	

	
	int getAnzahlPlaetze(){
		return (sitzplaetze += stehplaetze);
	}//getAnzahlPl�tze

}
