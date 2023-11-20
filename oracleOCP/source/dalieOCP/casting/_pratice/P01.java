package dalieOCP.casting._pratice;

final class P01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object number = new Object();
		float f=((Number)number).floatValue();// java.lang.Object cannot be cast to java.lang.Number
		
		Number nI = Integer.valueOf(1);
		Object o = ((Number)nI).floatValue();//put visa versa
		float o1 = ((Number)nI).floatValue();
	}
}
