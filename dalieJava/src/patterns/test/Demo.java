package patterns.test;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<I> l = new B().getAll();
		for (I i : l) {
			i.aMethode(i);
		}
		l = new C().getAll();
		for (I i : l) {
			i.aMethode(i);
		}
	}
}
