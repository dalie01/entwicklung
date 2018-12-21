package oracel_OcaSe.O92_Temp.exepctions;

class MyException extends Throwable { };
class MyException1 extends MyException { };
class MyException2 extends MyException { };
class MyException3 extends MyException2 { };


public class Ex1 {

	final void myMethod() throws MyException, Exception {
		throw new Exception();
	}
	
	public static void main(final String[] args) {
		Ex1 ex = new Ex1();
		try {
			ex.myMethod();
		} catch (MyException | Exception me ) {
			System.out.println(me);
		} finally{
			System.out.println("Done");
		}
	}
	
}
