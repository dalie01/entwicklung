package patterns.test;

import java.util.ArrayList;
import java.util.List;

public class C extends A implements I {

	private String c1;
	
	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}



	@Override
	public void aMethode(I i) {
		C c = (C)i;
		System.out.println(c.getC1());
	}

	public List<I> getAll() {
		List<I> l = new ArrayList<>();
		C c = new C();
		c.setC1("C1");
		l.add(c);
		return l;
	}

}
