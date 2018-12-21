package oracel_OcaSe.O92_Temp.foo;

import oracel_OcaSe.O92_Temp.bar.Hello;


public class World extends Hello {
	
	public static void main(String[] args) {
		new Hello().aMethode("Hello");
		System.out.println(Hello.aMethode(false));
		System.out.println(World.aMethode(true));
		System.out.println(World.aMethode(99));
		System.out.println(new World().aMethode());
		Hello.print("2","5","6");
		Hello.print(2,5,6);
		Hello.print(new int[]{1,2,3});
		Hello.print('\u03A6','\t');
		int k = 0;
		int m = 0;
		float u = k;
		double q = k;
		for (int i = 0; i <=3; i++) {
			k++;
			if(i == 2) {
				System.out.println("i is" + i);
				System.out.println("m is" + m);
				i = m++;
				System.out.println("i is " + i);
				System.out.println("m is " + m);
			}
			m++;
		}
		System.out.println("k is:" + k + " m is:" + m);
		char c = "Jena".charAt(0);
		System.out.println("here" + c);
	}

	public String aMethode(){
		String test = "World";
		return test;
	}
	
	static protected String aMethode(boolean check){
		return "override" + Boolean.toString(check);
	}
	
	static protected String aMethode(int test){
		return Integer.toString(test);
	}
}
