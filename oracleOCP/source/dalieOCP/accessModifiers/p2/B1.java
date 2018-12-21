package dalieOCP.accessModifiers.p2;

import dalieOCP.accessModifiers.p1.A1;

public class B1 extends dalieOCP.accessModifiers.p1.A1 {

	public void process(A1 a) {
		
//		a.i = a.i * 2; it will compile i is invisible
	}
	
	public static void main(String[] args){
		A1 a = new B1(); 
		B1 b = new B1();
		b.process(a); 
		System.out.println(a.getI());
	}
}
