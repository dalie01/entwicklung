package dalieOCP.string.exception;

class Execute {
	
	public static void main(String[] args) {
		String s = "INXS";
//		s.substring(10);//StringIndexOutOfBoundsExeception
		System.out.println(s.substring(0));//prints INXS
		System.out.println(s.substring(1));// prints NXS
		System.out.println(s.substring(2));// prints XS
		System.out.println(s.substring(s.length()));//prints noting
		System.out.println(s.substring((s.length()-1)));//prints S
	}
}
