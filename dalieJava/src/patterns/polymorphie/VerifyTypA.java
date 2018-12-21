package patterns.polymorphie;

public class VerifyTypA extends AbstractVerify implements IVerify{

	@Override
	public boolean toVerify() {
		System.out.println(this.getClass().getName());
		return true;
	}//toVerify

}//class VerifyTypA
