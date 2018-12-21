package polymorphie;

public class Abteilungsleiter extends Angestellter {
	
	public String abteilung;
	Abteilungsleiter(String name, Double gehalt, String abteilung) {
		super(name, gehalt);
		this.abteilung = abteilung;
	}//Abteilungsleiter

	
	@Override
	public String getPersonenDaten(){
		return this.name + this.gehalt + abteilung;
	}//getPersonenDaten
	
}//class Abteilungsleiter
