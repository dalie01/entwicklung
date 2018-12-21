package loop;

public class Main {
	
	public static void main(String[] args) {
		int i = 0;
		while(i >= 0){
			i++;
		}
		byte b = 0;
		short s = 1;
		int x = 1;
		long l = 10;
		float f = 11.0f;
		double d = 10.0;
		String p = "";
		System.out.println(x + d);
		int e = x += d += f;
		System.out.println(e + " " + d );
		System.out.println(x * 10 / 4.0 - 30);
		char c;
		c = (char) b;
		b = (byte) c;
		c = (char) s;
		s = (short) c;
		c = (char)x;
		x = (char)c;
		c = (char)l;
		p = ""+c;
		//c = p;
		p = Integer.toString(x);
		p = Long.toString(l);
		f = Float.parseFloat(p);
		String t = new String("Hello world");
		System.out.println("Hello World".compareTo(t) + "" + "Hello World".equals(t));
		System.out.println("Hello World" == "Hello World");
	}
	
	
}
