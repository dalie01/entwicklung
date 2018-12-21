package dalieOCP.fileIO.usingCharacterIO.reader.fileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class Execute {
	
	public static void main(String[] args) {
		Reader fileReader;
		File file = new File("c:\\data\\input-text.txt");
		try {
			fileReader = new FileReader("c:\\data\\input-text.txt");//FileNotFoundException

			int data = fileReader.read();
			while(data != -1) {
				doSomethingWithData(data);

				data = fileReader.read();
			}
			
			while ((data = fileReader.read()) != -1) {//also possible
				doSomethingWithData(data);
			}
		
			  // Create a char array of file length
			 char[] c = new char[(int)file.length()];
			 fileReader.read(c); //read with char[] array
			 for(int i=0; i < c.length; i++) {
			  System.out.print(c[i]);
			 }
			 
			/*
			 * When you are finished reading characters from a Java FileReader 
			 * you should remember to close it.
			 * */
			fileReader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void doSomethingWithData(int data) {
		
	}
}
