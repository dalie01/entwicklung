package oracel_OcaSe.O92_Temp.go;

/* Explanation: 
 * The class EJavaGuruPassObject1 defines two methods,
 * someMethod and anotherMethod. 
 * The method someMethod modifies the value of the object parameter passed to it. 
 * Hence, the changes are visible within this method and in the calling method (method main). 
 * But the method anotherMethod reassigns the reference variable passed to it. 
 * Changes to any of the values of this object are limited to this method.
 * They aren’t reflected in the calling method (the main method).
 * */ 

class Person {
	public String name;
	public int height;
}

class EJavaGuruPassObject1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "eJava";
		
		anotherMethod(p);
		System.out.println("2" + p.name);
		someMethod(p);
		System.out.println("4" + p.name);
		someMethode(p);
		System.out.println("6" + p.name);
	}
	
	static void someMethode(Person p){
		p.name = "someMethod_x";
		p = new Person();
		System.out.println("5" + p.name);
	}
	
	static void someMethod(Person p){
		p.name = "someMethod";
		System.out.println("3" + p.name);
	}
	
	static void anotherMethod(Person p){
		p = new Person();
		p.name = "anotherMethod";
		System.out.println("1" + p.name);
	}
	
}
