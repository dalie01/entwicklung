package test.Temp_XX;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }

class A{}
class B{}
class C extends A{}

public class Temp_XX {

	public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        A a = new A();
        if(f instanceof Bird) System.out.println("f is a Bird");
        if(e instanceof Flyer) System.out.println("e is a Flyer");
        if(b instanceof Flyer) System.out.println("b is a Flyer");
        if (a instanceof Flyer) {
			
		}
    }
}
