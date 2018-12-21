package dalieOCP.assertion.shouldBeUsedFor;

class Execute {

	public static void main(String[] args) {
		
		int i = 0;
		/*
		 * 1. Validating input parameters of a private method.
		 * 		[But NOT for public methods. public methods should throw regular exceptions when passed bad parameters.) 
		 * 2. Anywhere in the program to ensure the validity of a fact which is almost certainly true.
		 * */
		if(i == 1) {
			
		} else if (i == 2) {
			
		} else 
			assert false : "cannot be happend" + 1;
		
		/*
		 * 3. Validating post conditions at the end of any method. 
		 * 		This means, after executing the business logic, 
		 * 		you can use assertions to ensure that the internal state 
		 * 		of your variables or results is consistent with what you expect. 
		 * 		For example, a method that opens a socket or a file 
		 * 		can use an assertion at the end to ensure that 
		 * 		the socket or the file is indeed opened.
		 * */
//		 Socket s; //valid code to open socket here     ...     assert s != null;
	
	
	}
	
	// also valid use
	public void aMethod() {
		int code = 0; // getCode(); returns 0 or 1       
		switch (code) {
		case 0: // deal with 0 ... 
			break;
		case 1: // deal with 1 ... 
			break;
		default: 
			assert false : "Can't process because code is out of range -" + code; 
		}
	}
}


