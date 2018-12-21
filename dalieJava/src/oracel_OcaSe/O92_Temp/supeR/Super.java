package oracel_OcaSe.O92_Temp.supeR;


class Sub {
	
	String x = "Jena";
	
	Object get(){
		return "Sub";
	}
}

public class Super extends Sub {
	
	String x = "Stuttgart";
	String s;
	
	String get(){
		return "Super";
	}
	
	void set(String s){
		s = "Hier";
	}
	
	void set(Super s){
		s.s = "Ja";
	}
	
	public static void main(String[] args) {
		Sub s = new Sub();
		Sub s1 = new Super();
		System.out.println(s1.x);
		System.out.println(s1.get() + " " + s.get());
		
		Super s2 = new Super();
		s2.set("Jena");
		System.out.println(s2.s);
		s2.set(s2);
		System.out.println(s2.s);
		
		System.out.println(s2.x);
	}
}
