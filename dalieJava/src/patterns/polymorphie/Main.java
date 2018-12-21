package patterns.polymorphie;

public class Main {

	public static void main(String[] args) {
		IVerify verify = null;
		verify = (VerifyImpl.getInstance()).getVerify("a");
		verify.toVerify();
		verify = (VerifyImpl.getInstance()).getVerify("b");
		verify.toVerify();
	}//main
	
}//class Main
