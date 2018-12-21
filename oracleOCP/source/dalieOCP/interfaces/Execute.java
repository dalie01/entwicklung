package dalieOCP.interfaces;

//final interface I { invalid
//static interface I { 
//transient interface I { 
//synchronized interface I { 
//volatile interface I { 

//public interface I { is valid 
//strictfp interface I { 
//abstract interface I { 
interface I {	
//	int number = 10;
//	int number; it's won't compile must be initialized
	public static final int number = 10;// is the same as one line before
	
//	int getNumber();
	public abstract int getNumber();//is the same as one before
	
}

class Outer{
	/*
	 * A nested interface can be defined using the nonaccess modifier static 
	 * (any other nonaccess modifier isn’t allowed) */
	
	static interface MyInterface{};//Nested interface
}

