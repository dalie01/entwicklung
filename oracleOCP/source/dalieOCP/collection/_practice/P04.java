package dalieOCP.collection._practice;

import java.util.ArrayList;
import java.util.List;

final class P04 {

	public static void main(String[] args) {
		List<Long> l = new ArrayList<>();
//		l.add(1);
		l.add(1l);
		l.add(1L);
		l.add(new Long(1));
		l.add(Long.parseLong("1"));
		System.out.println(l.size());//prints 4
		
		List<Double> d = new ArrayList<>();
//		d.add(1);
		d.add(1.0);
		d.add(1d);
		d.add(1D);
//		d.add(1L);
		d.add(Double.parseDouble("1"));//throws NullpointerException if sting null / NumberFormatExecption
		System.out.println(d.size());//prints 4
	}
}
