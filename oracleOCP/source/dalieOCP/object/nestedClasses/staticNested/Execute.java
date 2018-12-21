package dalieOCP.object.nestedClasses.staticNested;

import dalieOCP.object.nestedClasses.staticNested.Outer.Inner;

class Outer {
	
	static int i1;
	int s2;
	
	Outer(){
		++i1;
	}
	
//	private	static class Inner {can be restricted by appropriate access modifier
	static class Inner {
		
		static int i1;
		int s4;
		
		Inner(String s){
			++i1;
		}
		
		void aMethod(){
			System.out.println(i1);
			System.out.println(Outer.i1);
			System.out.println(new Outer().s2);
		}
	}
	
}

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Inner i = new Inner("Jena");
		Outer.Inner oI = new Outer.Inner("Inxs");
		
		System.out.println(Outer.i1);
		
		System.out.println(Outer.Inner.i1);
		System.out.println(Inner.i1);
		System.out.println(i.i1);
		
		
	}
}
