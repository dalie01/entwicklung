package dalieOCP.fileIO.system.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Execute {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String");
		String s1 = br.readLine();
		System.out.println(s1);
	}
}
