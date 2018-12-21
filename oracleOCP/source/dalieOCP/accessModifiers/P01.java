package dalieOCP.accessModifiers;

final class P01 {

	private int i = 0;
	private class A {
		private int i;
	}
	
	public void aMethod(A a, P01 p) {
		a.i = a.i * p.i;
	}
}
