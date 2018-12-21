package dalieOCP.assertion.shouldNotBeUsedFor;

class Execute {

	public static void main(String[] args) {
		/*
		 * 1. Validating input parameters of a public method. 
		 * 	Since assertions may not always be executed, the regular exception mechanism should be used. 
		 * 2. Validating constraints on something that is input by the user. Same as above. 
		 * 3. Should not be used for side effects. For example:
		 * */
	}
	
	/*
	 * This is not a proper use because here the assertion is used for its side effect 
	 * of calling of the doSomething() method.
	 * */
	public boolean doSomething() {
		return false;
	}
	
	public void someMethod() {
		assert doSomething(); 
	}
}
