package dmc;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld dmc = new HelloWorld();
		System.out.println("Hello DMC");
		System.out.println(dmc.toString());
	}//main
	
	@Override
	public String toString(){
		return "Hello World";
	}
}//class HelloWorld
