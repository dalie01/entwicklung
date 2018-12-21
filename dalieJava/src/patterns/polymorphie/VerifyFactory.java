package patterns.polymorphie;

public interface VerifyFactory {

	/** getVeriFy: to search with a argument to find the verifyTyp  */
	public abstract IVerify getVerify(String argum);
	
}//interface VerifyFactory
