package observable;

public class MainClass {

	public static void main(String[] args) {
		Kellner kellner1 = new Kellner("Kellner 1");
		Kellner kellner2 = new Kellner("Kellner 2");
		
		Gast gast1 = new Gast("Gast 1");
		Gast gast2 = new Gast("Gast 2");
		
		gast1.addObserver(kellner1);
		gast1.addObserver(kellner2);
		
		gast2.addObserver(kellner2);
		
		gast1.kellnerRufen();
		gast2.kellnerRufen();
		
	}//main
	
}//mainClass
