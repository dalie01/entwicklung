package dalieOCP.fileIO.usingCharacterIO.writer.fileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class Execute {
	
	public static void main(String[] args) {
		
		Writer fileWriter;
		try {
			fileWriter = new FileWriter("data\\filewriter.txt");
//			fileWriter = new FileWriter("data\\filewriter.txt",true);appends to file

			fileWriter.write("data 1");
			fileWriter.write("data 2");
			fileWriter.write("data 3");

			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
