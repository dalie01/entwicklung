package dalieOCP.operator.modulus;

class Execute {

	public static void main(String[] args) {
		int i1 = 5, i2 = 10, i3 = 0, i4 = -1;
		System.out.println( i1 % 3 );//5 % 3 evaluates to 2 because 5 divided by 3 has a remainder of 2. 
		System.out.println( i2 % 3 );//10 % 3 evaluates to 1 because 10 divided by 3 has a remainder of 1. 
		System.out.println( i3 % 3 );//0 % 3 evaluates to 0 because 0 divided by 3 can't has a remainder. 
		System.out.println( i4 % 3 );//0 % 3 evaluates to -0,3 because -1 divided by 3 has a remainder -1. 
		System.out.println( i2 % 2 == 0 );//is even number 
	}
}
