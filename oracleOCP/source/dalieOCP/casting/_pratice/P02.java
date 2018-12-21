package dalieOCP.casting._pratice;

interface I{}

class A implements I{}
class B extends A{}

final class P02 {

	public static void main(String[] args) {
		I iA = new A();
		I iB = new B();
		iA = iB;
		B c1 = (B)iA;//interface apply needs cast
	
		System.out.println( iA instanceof A); 
		System.out.println( iA instanceof B); 
		System.out.println( iA instanceof I); 
		System.out.println(c1); 
	}
}
