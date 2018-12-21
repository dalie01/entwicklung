package dalieOCP.object.nestedClasses.anonymousInnerClasses._practice;

class Module {
	
	void aMethod() {
		
	}
	
	public static void execute(Module m) {
		m.aMethod();
	}
}

final class P01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Module.execute(new Module() {

			@Override
			void aMethod() {
				System.out.println("P01.aMethod");
			}
			
			void bMethod() {//additional method a possible
				System.out.println("P01.bMethod");
			}
			
		});
	}

}
