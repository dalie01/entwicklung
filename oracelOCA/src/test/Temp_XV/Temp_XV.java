package test.Temp_XV;

import java.util.ArrayList;
import java.util.List;

public class Temp_XV {
	float f;
	double d;
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][][] iArray = new int[1][10][0];
		System.out.println(iArray.length + "" + iArray[0].length + ""
				+ iArray[0][1].length);
		if (args.length == 0) {
			int index = 10;
			int mArray[] = new int[index];
			for (int i = 0; i < index; ++i) {
				System.out.println(mArray[i]);
			}
		}
		int x0 = -4, x1 = -4;
		int x2 = 0;
		x2 += --x1;
		int x3 = x0 += 5;
		System.out.println(x1 + "" + x2 + "" + x3 + "" + new Temp_XV().f + "" + new Temp_XV().d);
		short s1 = 0;
		int x_0 = 10, x_1 = -2;
		int x_2 = x_0 / x_1;
		System.out.println(x_2);

		List<String> aList = new ArrayList<>();
		aList.add(0, "Hello");
		aList.add(1, "World");
		aList.add(2, "Inxs");
		for (String s : aList) {
			if (s.startsWith("W")) {
				continue;
			}
			System.out.println("UD002" + s);
		}
		// System.out.println(aList.get(1)); java.lang.IndexOutOfBoundsException
		System.out.println(aList.get(0));
		System.out.println("Inxs".charAt(3)); // java.lang.StringIndexOutOfBoundsException
		System.out.println("Inxs".indexOf("s"));
		System.out.println("Inxs".substring(3));// java.lang.StringIndexOutOfBoundsException
		char s = new StringBuilder("Inxs").charAt(3);
		System.out.println("UD001" + (byte) s);// java.lang.StringIndexOutOfBoundsException
		String x = new String("Inxs");
		System.out.println(x.charAt(3));
		System.out.println("UDXX1" + (new Character('s') == new Character('b')));
		char cA[][] = { new char[ ]{ 'a', 'b', 'c' },new char[ ]{ 'a', 'b', 'c' }};
	
		UD001: for (int i = 0; i < 10; ++i) {

			for (int j = 0; j < 10; j++) {
				if (i + j > 10)
					break UD001;
			}
			System.out.println("UD003");
		}

		int c = 0;
		A: for (int i = 0; i < 2; i++) {
			B: for (int j = 0; j < 2; j++) {
				C: for (int k = 0; k < 3; k++) {
					c++;
					if (k > j)
						break;
				}
			}
		}
		System.out.println(c);
	}
}
