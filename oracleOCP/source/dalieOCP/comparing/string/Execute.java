package dalieOCP.comparing.string;

class Execute {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = s1;
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s1.equals(s2));
		
	}
}
