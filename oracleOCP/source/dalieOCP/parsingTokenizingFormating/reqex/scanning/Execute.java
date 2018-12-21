package dalieOCP.parsingTokenizingFormating.reqex.scanning;

import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner("1b2c335f456");
			String token;
			do {
				token = s.findInLine("\\d\\d");
				System.out.println(token);
			} while (token != null);
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (s != null)  s.close() ;
		}
	}
}
