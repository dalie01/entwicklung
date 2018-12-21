package dalieOCP.fileIO.usingCharacterIO.writer.printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

class Execute {
	
	public static void main(String[] args) {
		
		FileWriter writer;
		try {
			writer = new FileWriter("d:\\data\\report.txt");
			PrintWriter printWriter = new PrintWriter(writer);

			printWriter.print(true);
			printWriter.print((int) 123);
			printWriter.print((float) 123.456);

			printWriter.printf(Locale.UK, "Text + data: %1$", 123);

			printWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
