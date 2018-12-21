package dalieOCP.string.subsequent;

class Execute {

	public static void main(String[] args) {
		String s1 = "INXS";
		CharSequence cS = s1.subSequence(1, 3);
		System.out.println(cS.charAt(1));
	}
}
