package dalieOCP.enums._practice;


enum A {A,C,D}

final class P01 {

	public static void main(String[] args) {
		A a = A.valueOf("A");
		if(a == A.A)
			System.out.println("001");//prints 001
		
		if(a.equals(A.A))
			System.out.println("002");//prints 002
	}
}
