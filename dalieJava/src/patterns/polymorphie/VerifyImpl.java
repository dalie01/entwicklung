package patterns.polymorphie;


public class VerifyImpl implements VerifyFactory {

	private static VerifyFactory factory = null;

	/**
	 * default constructor
	 * 
	 * only for use singleton
	 * */
	private VerifyImpl(){
		System.out.println(this.getClass().getName());
	}//VerifyImpl
	
	/** getInstace to retrieve a Instance to VerifyImpl */
	public static VerifyFactory getInstance(){
		if (factory == null) {
			factory = new VerifyImpl();
		}
		return factory;
	}//getInstace
	
	@Override
	public IVerify getVerify(String argum) {
		if (argum != null && argum.equals("a")) 
			return new VerifyTypA();
		else
			return new VerifyTypB();
	}//endif

}//class VerifyImpl
