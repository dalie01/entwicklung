package dalieOCP.fileIO.usingCharacterIO.reader.bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Execute {
	
	public static void main(String[] args) {
	    
		try {
			BufferedReader bufferedWriter = new BufferedReader(
					new FileReader("c:\\data\\output-file.txt"));
		
			String line;
			
			/*
			 * Method readLine() doesn’t include line-feed (\n) 
			 * and carriage-return (\r) characters.
			 * */
			while( (line = bufferedWriter.readLine()) != null  )
				System.out.println(line);
			
			
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
