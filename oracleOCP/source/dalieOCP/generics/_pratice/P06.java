package dalieOCP.generics._pratice;

import java.util.ArrayList;
import java.util.List;

class A6 {}
class B6 extends A6 {}

final class P06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		List<A6> l1 = new ArrayList<B6>();//won't compile
//		List<B6> l2 = new ArrayList<A6>();//won't compile
		List<A6> l3 = new ArrayList<A6>();
		List<B6> l4 = new ArrayList<B6>();
	}
}
