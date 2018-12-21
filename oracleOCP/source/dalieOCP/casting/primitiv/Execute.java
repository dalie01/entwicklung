package dalieOCP.casting.primitiv;

/*
 * 
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
 *
 * */
class Execute {
	
	public static void main(String[] args) {
		
		byte b1 = 0;
		short s1 = 0;
		char c1 = '\u0122';
		int i1 = 0;
		float f1 = 0f;
		double d1 = 0D;
		
		//b1 = s1; //not fitting impossible 
		s1 = b1;// Widening Primitive Conversion no cast required
		s1 = (short)c1; //Narrowing Primitive Conversion
		s1 = (short)i1; //Narrowing get always cast
		c1 = (char) s1; //char get always an cast
		c1 = (char) i1;
		i1 = c1;//widening
		f1 = c1;//widening
		d1 = i1;//Widening
		
		b1 *= b1; // b1 = b1 * b1 -> it will always by an int.
		
		d1 = f1;
		d1 *= d1;
		
	}
}
