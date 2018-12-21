package dalieOCP.assertion;

/*
 * assertion
 * 
 * really simple or simple 
 * 
 * simple assert(boolean) : String -> expression boolean is required : String is required primitive or Object as are allowed
 * simple assert(boolean) -> expression boolean is required
 * don't use assertion on public Methods
 * javac source=1.3 assert as identifier is allowed -> javac source=1.4 > and new assert as identifier not allowed Keyword.
 * assert(boolean) is to read as if() if true -> keep code otherwise throw AssertionError
 * assert is disabled by default -> enable assertion by runtime -ea or -enableassertions tells the JVM to run with assertions
 * -da or -disableassertions tells the JVM run without assertions
 * java -ea -da:dalieOCP.assertion.Execute selective enable 
 * java -ea -da:dalieOCP.assertion... enable assertions in package and all subpackages
 * 
 * */
class A {
	
	int aMethode(int i){
		
		assert(i <= 0) : "positve value is not allowed " + i;
		
			return i;
	}
	

}

class Execute {

	public static void main(String[] args) {
		A a = new A();
		//int assert = a.aMethode(2); not allowed
		int i = a.aMethode(2);
		System.out.println(i);
	}
}
