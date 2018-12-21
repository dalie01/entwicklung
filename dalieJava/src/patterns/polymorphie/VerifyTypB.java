package patterns.polymorphie;

public class VerifyTypB extends AbstractVerify implements IVerify{

	@Override
	public boolean toVerify() {
		System.out.println(this.getClass().getName());
		return true;
	}//toVerify

}//class VerifyTypB
