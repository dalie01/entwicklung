package dezimalFormat;

import java.text.DecimalFormat;

public class DoubleFormatieren {

	public static void main(String[] args) {
		
		// mindestens 1 Vorkommastelle, genau 2 Nachkommastellen
		DecimalFormat f = new DecimalFormat("#,##0.000");

		double d1 = 1234.4843;
		double d2 = 0.2;
		System.out.println(f.format(d1));
		System.out.println(f.format(d2));
		
	}//main
	
}//class DoubleFormatieren
