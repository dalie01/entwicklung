package oracel_OcaSe.O92_Temp.list;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add(s.size(),"Hello");
		s.add(s.size(),"World");
		System.out.println(s.size());
		s.remove(s.size()-1);
		System.out.println(s);
	}
}
