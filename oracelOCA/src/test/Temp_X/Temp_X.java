package test.Temp_X;

interface Flyer { String s = null;}
class Bird implements Flyer{}
class Eagle extends Bird{}
class Bat{}

public class Temp_X {

	public static void main(String[] args) {
		Flyer f = new Eagle();
		Eagle e = new Eagle();
		Bat b = new Bat();
		
		if (f instanceof Flyer) 
			System.out.println("f is Flyer");
		System.out.println(f.s);
		
		if (e instanceof Bird)
			System.out.println("e is Bird");
		
		if (b instanceof Flyer) 
			System.out.println("b is Flyer");	
		
	}
}
