package dalieOCP.fileIO.usingCharacterIO.writer.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Execute {

	public static void main(String[] args) {
		int bufferSize = 8 * 1024;
	    
		try {
			BufferedWriter bufferedWriter =  new BufferedWriter(
					new FileWriter("c:\\data\\output-file.txt"),bufferSize);
			
			String s = "Hello";
			bufferedWriter.write(s);
			
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
