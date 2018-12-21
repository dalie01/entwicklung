package dalieOCP.object.nestedClasses.innerClass._pratice;

class A3 {
	
	char c;
	
	A3(char c){
		this.c = c;
	}
}

class B extends A3 {
	
	char c = 'a';
	
	B() {
		super('b');
	}
	
	class C extends A3 {
		
		char c = 'c';
		
		C(){
			super('d');
			System.out.println(B.this.c);
			System.out.println(C.this.c);
			System.out.println(super.c);
		}
	}
}

final class P03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B.C obj = new B().new C();
	}
}
