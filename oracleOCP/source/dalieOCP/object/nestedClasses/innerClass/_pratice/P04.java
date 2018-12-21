package dalieOCP.object.nestedClasses.innerClass._pratice;


final class P04 {

	static int si = 10;
	int i1 = 20;
	final int i2 = 30;
	
	@SuppressWarnings("unused")
	public void Inner() {
		
		int iI = 30;
		
		class Inner {
		
			public Inner() {
				System.out.println(P04.this.i1);
				System.out.println(i2);
//				System.out.println(iI);final is need, definition on Method
			}
		}
		
		new Inner();
	}
}
