package oracel_OcaSe.O92_Temp.bar;

public class Hello {

	protected static String aMethode(boolean check){
		return String.valueOf(check);
	}
	
	static protected String aMethode(int test){
		return Integer.toString(test);
	}
	
	
	static protected void print(int... nums){
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	static protected void print(char[] nums){
		for (char c : nums) {
			System.out.println(c);
		}
	}
	
	static protected void print(String... args){
		for (String s : args) {
			System.out.println(s);
		}
	}
	
	protected String aMethode(){
		String test = "Hello";
		return test;
	}
	

	public void aMethode(final String test){
		System.out.println(test);
	}
	
	private int aMethode(final int world, final int hello){
		int test = 0;
		return test;
	}
	
	
	protected void aMethode(final String hello, final String world){
		System.out.println(hello + world);
	}

	public String aMethode(final String hello, final int world){
		return hello;
	}

	void aAMethode() {
	}
}
