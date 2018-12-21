package dalieOCP.object.nestedClasses.staticNested._practice;

import dalieOCP.object.nestedClasses.staticNested._practice.p2.P02.StaticP02;

public final class P02 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StaticP02 sP02 = new StaticP02();
		
		StaticP02 sP021 = 
				new dalieOCP.object.nestedClasses.staticNested._practice.p2.P02.StaticP02();
		StaticP02 sP022 = 
				new StaticP02();
	}
}
