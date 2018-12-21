package dalieOCP.abstracts._practice;

abstract class P01 {
	
	/*
	 * 1. You need to have a root class for a hierarchy of related classes.
	 * 	For example, if you have several types of Accounts such as CheckingAccount and SavingsAccount, 
	 * 	you may have an abstract super class Account, which may contain common implementation 
	 *  aspects such as account number and customer information.
	 *  	
	 * 2. You want to pass different implementations for the same abstraction in method calls.
	 *  It is a valid reason for using an interface as well as abstract class. 
	 *  Which one should be used depends on the domain. 
	 * */
	
	String s1;
	
	P01(String s1) { 
		this.s1 = s1;
	}
	
	static void sMethod() {};
	
	abstract void aMethod();
	void bMethod() {};
}

abstract class P02 extends P01 {
	
	P02(String s1) {
		super(s1);
	}
	
}