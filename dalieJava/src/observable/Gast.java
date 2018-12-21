package observable;

public class Gast extends java.util.Observable{
	
	protected String name;
	
	public Gast(String name){
		this.name = name;
	}//Gast

	
	public void notify(Object signal){
		setChanged();
		notifyObservers(signal);
	}//notify
	
	public void kellnerRufen(){
		notify("Kellner!");
	}//kellnerRufen
	
	public String getName(){
		return this.name;
	}//getName
}//class Gast
