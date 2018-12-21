package dalieOCP.comparing.primitives;


/**
 * The operators == (equal to) and != (not equal to) can be used to compare all types of
 * primitives: char, byte, short, int, long, float, double, and boolean.
 *
 */
class Execute {

	public static void main(String[] args) {
		
		int i1 = 5;
		int i2 = 6;
		System.out.println(i1 == i2);
//		System.out.println(i1.equals); impossible
		
		Integer I1 = new Integer(2);
		Integer I2 = new Integer(2);
		System.out.println(I1 == I2);//false
		System.out.println(I1.equals(I2));//true
		
		boolean b1 = new Boolean(false);
		boolean b2 = new Boolean(true);
		boolean b3 = false;
		System.out.println(b1 == b2);//false
		System.out.println(b1 == b3);//true
	}
}
