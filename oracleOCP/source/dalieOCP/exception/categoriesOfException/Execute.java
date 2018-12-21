package dalieOCP.exception.categoriesOfException;

/**
 * ExecuteException is checked Exception
 * @author dalie.de
 */
class ExecuteException extends Exception {
	
	ExecuteException(){
		super();
	}
	
	ExecuteException(String m){
		super(m);
	}
}

class Execute {
	/*
	 * RuntimeExcection as unchecked Exceptions
	 * * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Arithmetic error, such as divide-by-zero.*/
		RuntimeException e1 = new ArithmeticException();
		/* Array index is out-of-bounds. */
		RuntimeException e2 = new ArrayIndexOutOfBoundsException();
		/* Assignment to an array element of an incompatible type. */
		RuntimeException e3 = new ArrayStoreException();
		/* Invalid cast */
		RuntimeException e4 = new ClassCastException();
		
		/* Illegal argument used to invoke a method */
		RuntimeException e5 = new IllegalArgumentException();
		/* Illegal Monitor operation, such as waiting on a unlocked thread */
		RuntimeException e6 = new IllegalMonitorStateException();
		/* Environment or application is in illegal state */
		RuntimeException e7 = new IllegalStateException();
		/* Request operation not compatible with current thread safe */
		RuntimeException e8 = new IllegalThreadStateException();
		
		/* Some type of index is out-of-bounds. */
		RuntimeException e9 = new IndexOutOfBoundsException();
		/* Array created with a negative size. */
		RuntimeException e10 = new NegativeArraySizeException();
		/* Invalid use of a null reference. */
		RuntimeException e11 = new NullPointerException();
		/* Invalid conversion of a string to a numeric format. */
		RuntimeException e12 = new NumberFormatException();
		/* Attempt to violate security. */
		RuntimeException e13 = new SecurityException();
		/* Attempt to index outside the bounds of a string. */
		RuntimeException e14 = new StringIndexOutOfBoundsException();
		/* An unsupported operation was encountered. */
		RuntimeException e15 = new UnsupportedOperationException();

		
		
		Exception cE10 = new ExecuteException("as are checked Exception");
		Exception cE11 = new ExecuteException();
		Exception cE12 = new Exception("");
		
		aMethod();//no ErrorHandling (unchecked or Runtime Error) is required
		
		try {
			aMethod(null); // try/catch is required (checked Error)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void aMethod() {
		throw new SecurityException();
	}
	
	private static void aMethod(String s) throws ExecuteException {
		throw new ExecuteException();
	}
}



