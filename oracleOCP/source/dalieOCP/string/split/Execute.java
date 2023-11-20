package dalieOCP.string.split;

class Execute {

	public static void main(String[] args) {
		String s1 = "Hello,   World";
		for(String s : s1.split(",\\s*"))//the argument will be removed
			System.out.println(s);
		
		String s2 = "Jena";
		for(String s : s2.split(","))
			System.out.println(s);

		String s3 = "Jena?INXS";
		for(String s : s3.split("\\?"))
			System.out.println(s);
		
		String s4 = null;
		for(String s : s4 != null && s3.length() > 0 ? s4.split(";") : new String[]{})//throws NullPointerException
			System.out.println(s);
		
		String s5 = ";";
		for(String s : s5.split(";"))//prints nothing
			System.out.println(s);
		
		String s6 = "Hello-to-the-World-and-World-to-the-Hello";
		for(String s: s6.split("t.e"))
			System.out.println("s6" + s);
		
		String s7 = "Hello-to-the-World-and-World-to-the-Hello-and-the-Jena";
		for(String s: s7.split("t.e",2))//can limit the maximum number of tokens
			System.out.println(s);
	}
}
