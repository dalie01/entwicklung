package dalieOCP.javaDataTypes;

class A {
	/*
	 * 
	 * */
	char c1 = 122;
	char c2 = 'c';
	
	
	byte b1 = 3;
	
	short s1 = 1;
//	short s2 = null; is not allowed for all primitives (method Parameter void aMethod(Integer i) also) 
	
	int baseDecimal = 267; //32 bits -
	int octalValue = 0_3777_7777_770; //leading 0; digits one of 0 1 2 3 4 5 6 7; maximum of 11 characters(without 0)
	int hexValue = 0xAF09; //leading 0x; digits one of 0 1 2 3 4 5 6 7 8 9 a b c d e f A B C D E F
	int binaryValue = 0b01; //leading 0b; digits of of 01 
	
	
	
	float floatValue = 124.000F; //float with dot F is required
	float f1 = 124_000;
	double doubleValue = 123.000; 
	double d1 = 123F;
}

class Execute {

	public static void main(String[] args) {
		long l0 = 1;
		System.out.println(isLong(l0));
		long l1 = 1l;
		System.out.println(l1);
		long l2 = 1L;
		System.out.println(l2);
		
	}
	
	public static boolean isLong(Long l) {
		return l instanceof Long;
	}
}
