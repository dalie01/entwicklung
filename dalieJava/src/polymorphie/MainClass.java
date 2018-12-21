package polymorphie;

public class MainClass {

	public static void main(String[] args) {
		Angestellter a = new Angestellter("Hans",1.0);
		
		Angestellter b = new Abteilungsleiter("Glück",2.0,"ChefEtage");
		
		System.out.println(a.getPersonenDaten());
		System.out.println(b.getPersonenDaten());
	}//main
	
}//MainClass
