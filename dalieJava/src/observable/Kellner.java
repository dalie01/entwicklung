package observable;

import java.util.Observable;
import java.util.Observer;

public class Kellner implements Observer {

	protected String name;
	public Kellner(String name){
		this.name = name;
	}//Kellner
	
	@Override
	public void update(Observable subject, Object signal) {
		System.out.println(((Gast)subject).getName() + " => " +name+": "+signal );
	}//update

	public String getName(){
		return this.name;
	}//getName
}//class Kellner
