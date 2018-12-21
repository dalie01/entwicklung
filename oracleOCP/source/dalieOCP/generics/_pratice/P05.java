package dalieOCP.generics._pratice;

import java.util.ArrayList;
import java.util.List;

class A1 {}
class B1 extends A1 {}
class C1 extends B1 {}

class P05 {

	public static void main(String[] args) {
		List<A1> l = new ArrayList<>();
//		List<? super A1> l = new ArrayList<>();
		l.add(new A1());
		l.add(new B1());
		l.add(new C1());
	}
}
