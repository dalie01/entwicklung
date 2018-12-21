package dalieOCP.fileIO.usingCharacterIO.writer._pratice;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

final class P01 {
	
	public static void main(String[] args){
		
		try (PrintWriter pw = new PrintWriter("out.txt")){
			pw.print("pw");
			pw.println("pw");
			pw.write(new char[]{'c','h','a','r'}, 1, 1);
			
			pw.format("%s","pw");
			pw.format(Locale.ENGLISH, "%s", "10");
			
			pw.printf("%s", "pw");
			pw.printf(Locale.CANADA, "%s", "pw");
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		try (FileWriter fw = new FileWriter("out.txt")){
			fw.write("pw");
			
//			fw.printf("%s", "pw");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
