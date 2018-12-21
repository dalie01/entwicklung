package oracel_OcaSe.O92_Temp.compare;

class A{}
class B{}

class Compare {

	public static void main(String[] args) {
		int _5 = 5;
		int _4 = 5;
		System.out.println(_4 == _5);
		String _s = "2";
		String s_ = "2";
		System.out.println( _s.equals(s_) );
		A a = new A();
		B b = new B();
		System.out.println(a.equals(b));
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		a1 = a2;
		System.out.println(a1 == a2);
		
		String x = new String("X");
		String z = new String("X");
		System.out.println(x == z);
		System.out.println(x.equals(z));
		String j = "X";
		System.out.println(x == j);
		System.out.println(x.equals(j));
	}
}
