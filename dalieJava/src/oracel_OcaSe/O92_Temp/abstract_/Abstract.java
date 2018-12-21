package oracel_OcaSe.O92_Temp.abstract_;

interface Interface {
	
	final static int a = 10;
	void aMethod();
}

public abstract class Abstract implements Interface { // Make Type(Class) abstract

	int r;
	//abstract Modifier
	public abstract void aMethod();
	protected abstract void AMethod();
	
	Abstract(){}
	
	public final synchronized void aTest(){
		
	}
	
	public static void sTest(){
		System.out.println("sTest");
	}
	
	public static void main(String[] args) {
		Abstract a;
		Abstract.sTest();
	}
}

enum AEnum {
	
	TypA {
		@Override
		void aMethod() {
			
		}
	};

	abstract void aMethod();
}