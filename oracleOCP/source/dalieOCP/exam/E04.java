package dalieOCP.exam;

class E {
	int i = 0;
}

class E04 {

	int i = 1;
	
	class NE04 extends E {
		
		int i = 2;
		
		public void print() {
			System.out.println(i);
			System.out.println(E04.this.i);
			System.out.println(super.i);
		}
	}
	
	class OE04 extends E04 {
		
		int i = 2;
		
		public void print() {
			System.out.println(i);
			System.out.println(E04.this.i);
			System.out.println(super.i);
		}
	}
	
	public static void main(String[] args) {
		new E04().new OE04().print();
	}
}
