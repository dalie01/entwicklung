package patterns.test;

import java.util.ArrayList;
import java.util.List;

public class B extends A implements I {
	
	private String b1;

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}


	@Override
	public void aMethode(I i) {
		System.out.println(i instanceof C);
		B b = (B)i;
		System.out.println(b.getB1());
	}

	public List<I> getAll() {
		List<I> l = new ArrayList<>();
		B b = new B();
		b.setB1("B1");
		l.add(b);
		return l;
	}
}
