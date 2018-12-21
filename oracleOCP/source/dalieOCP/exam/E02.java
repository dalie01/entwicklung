package dalieOCP.exam;

public class E02 {

	private int i1 = 1;
	
	public class E02A {
		private int i2 = 2;
		
	}
	
	public class E02B extends E02A {
		private int i2 = 3;
		
		void aMethod() {
			System.out.format("%d %3$d %d",i1,i2,super.i2);
		}
	}
	
	public static void main(String[] args) {
		new E02().new E02B().aMethod();
	}
}
