package dalieOCP.object.nestedClasses.innerClass._pratice;

class A {
	
	final class ByBy {
		/*
		 * Nested final classes are designed to avoid inherited by other inner classes
		 * */
	}
	
	abstract class Hello {
		/*
		 * Nested abstracted classes are designed to be inherited by other inner classes
		 * */
		void SayHello() {
			System.out.println("Hello");
		}
		
		abstract void SayHelloAt();
	}
	
	
	public class HelloWorld extends Hello {

		@Override
		void SayHelloAt() {
			System.out.println("HelloWorld");
		}
		
	}
	
	public class HelloJena extends Hello {

		@Override
		void SayHelloAt() {
			System.out.println("HelloJena");
		}
		
	}
}

final class P02 {

	public static void main(String[] args) {
		
	}
	
}
