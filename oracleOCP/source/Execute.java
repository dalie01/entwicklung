import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class O1 {
	static int count = 0;
	O1(){
		count++;
		System.out.println("1");
	}
}

class Execute {

	
	public static void main(String[] args) {
		O1[] os = new O1[2];
		
		String s1 = "Hello";
		System.out.println(s1.length());
		String s2 = " ";
		String s3 = s1 + s2;
		System.out.println(s3.length());
		String s4 = s3.trim();
		System.out.println(s4.length());
		aTest("o brother, where art thou! boo man!", "\\bo", "x");
		aTest("wow wwiots cool", "[wow]+");
		
		Path p1 = Paths.get("photos\\goa");
		Path p2 = Paths.get("index.html");
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
	}
	
	static void aTest(String a, String p1) {
		
		Pattern p = Pattern.compile(p1);
		Matcher m = p.matcher(a);
		while(m.find()) {
			System.out.println(m.start() + "," + m.group() + "," + m.end());
		}
	}
	
	static void aTest(String a, String p1, String r) {
		
		Pattern p = Pattern.compile(p1);
		Matcher m = p.matcher(a);
		while(m.find()) {
			System.out.println(m.start() + "," + m.group() + "," + m.end());
		}
		String val = m.replaceAll(r);
		System.out.println(val);
	}
}