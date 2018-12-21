package polymorphie;

public class Angestellter {

	public String name;
	public double gehalt;
	
	Angestellter(String name, Double gehalt){
		this.name = name;
		this.gehalt = gehalt;
	}//Angestellter
	
	public String getPersonenDaten(){
		return name + gehalt;
	}
	
}//class Angestellter
