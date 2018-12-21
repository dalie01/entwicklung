package oracel_OcaSe.O92_Temp.go;


class World {
	String name;
	
	void someMethode(World a){
		System.out.println("7" + a.name);
		a.name = "someMetode_";
		System.out.println("8" + a.name);
		a = new World();
		System.out.println("9" + a.name);
	}
	
	void someMethod(World a){
		a.name = "someMethode";
		System.out.println("5" + a.name);
	}
	
	void anotherMethode(World a) {
		System.out.println("1" + a.name);
		a = new World();
		System.out.println("2" + a.name);
		a.name = "anotherMethod";
		System.out.println("3" + a.name);
	}
}

public class EJavaGuruPassObject2 {

	public static void main(String[] args) {
		World a = new World();
		a.name = "eJava";
		System.out.println("0" + a.name);
		a.anotherMethode(a);
		System.out.println("4" + a.name);
		a.someMethod(a);
		System.out.println("6" + a.name);
		a.someMethode(a);
		System.out.println("10" + a.name);
	}
}
