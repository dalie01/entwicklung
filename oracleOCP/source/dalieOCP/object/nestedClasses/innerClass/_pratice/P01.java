package dalieOCP.object.nestedClasses.innerClass._pratice;

class Inner {
	
	static int c;
	int num = 0;
	MyObject o = new MyObject();
	
	Inner(){
		System.out.println( ++c);
		System.out.println(o.num);
	}
	
	class MyObject {
		int num = 10;
		
		protected void aMethod() {
			Inner i = new Inner();
			System.out.println(new Inner().num += 1);
			System.out.println(i.num += 1);
			System.out.println(Inner.this.num += 1);
			System.out.println(num += 1);
		}
	}
}

final class P01 {

	public static void main(String[] args) {
		Inner.MyObject a = new Inner().new MyObject();
		a.aMethod();
		
		Inner i = new Inner();
		i.new MyObject().aMethod();
		
	}
}
