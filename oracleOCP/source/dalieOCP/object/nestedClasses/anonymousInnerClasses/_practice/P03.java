package dalieOCP.object.nestedClasses.anonymousInnerClasses._practice;

interface P03I {
	
}

final class P03 {

	@SuppressWarnings("unused")
	private class P03C implements P03I {
		
	}
	
	@SuppressWarnings("unused")
	private static class P03S implements P03I {
		
	}
	
	P03I p03i = new P03I() {
		
	};
	
	
}
