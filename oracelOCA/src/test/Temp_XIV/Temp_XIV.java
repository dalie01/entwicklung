package test.Temp_XIV;

public class Temp_XIV {

	public static void main(String[] args) {
		byte b = 3;
		short s = 0;
		int i = 07;
		long l = 0;
		float f =  0b1011;
		double d = 0x1209AaF;
		b = (byte)s;
		char c = 'a';
		b = (byte)c;
		c = (char)(i);
		i = c * s;
		l = i;
		f *= d;
		System.out.println(i + " " + Character.toString(c)+ " " + b + " "+  " " + (long)c + " " +  true + "" + null);
	
	}
}
