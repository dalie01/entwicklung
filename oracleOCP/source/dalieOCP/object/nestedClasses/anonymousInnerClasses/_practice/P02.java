package dalieOCP.object.nestedClasses.anonymousInnerClasses._practice;

interface Floatable {
	void floating();
}

interface I{}

class P02 {

	Floatable floatable = new Floatable() {
		
		@Override
		public void floating() {
			
		}
	};
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		I i = new I() {
			
		};
	}
}
