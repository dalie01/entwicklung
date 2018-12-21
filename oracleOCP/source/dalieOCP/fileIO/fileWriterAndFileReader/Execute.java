package dalieOCP.fileIO.fileWriterAndFileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import dalieOCP.fileIO.helper.FileHelper;

public class Execute {
	
	public static void main(String[] args) {
		char[] in = new char[50];//to store input
		int size = 0;
		
		try {
			File file = new File(
					FileHelper.getDefaultFileName("file")); //just an object;
			
			/* three things will execute
			 * It created a FileWriter reference variable, fW
			 * It created a FileWriter object an assigned it to fW
			 * It created an actual empty file out on disk */
			FileWriter fW = new FileWriter(file);
			/*
			 * Normally we insert manually line separators
			 * */
			fW.write("howdy\nfolks\n");
			
			/* flush method guarantees that the last 
			 * data gets out to the file. */
			fW.flush();
			
			/* close every time if you use file I/O 
			 * (writing or reading) you should invoke close. 
			 * It will free up the Resources. */
			fW.close();
			
//			FileReader fR = new FileReader(file);
//			size = fR.read(in);
//			System.out.println(size);
			
//			for(char c : in) {
//				System.out.println(c);
//			}
			
//			fR.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
