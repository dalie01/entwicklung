package dalieOCP.fileIO.console;

import java.io.Console;

class Execute {

	public static void main(String[] args) {
		String name = "";
		Console c = System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");//return character array
		for(char ch : pw) {
			c.format("%c", ch);
		}
		c.format("\n");
		
		MyUtility mu = new MyUtility();
		while(true) {
			name = c.readLine("%s", "input?: ");//return a simple String value
			
			c.format("output: %s \n", mu.doStuff(name));
		}
	}
}

class MyUtility {
	
	String doStuff(String arg1) {
		return "result is" + arg1;
	}
}