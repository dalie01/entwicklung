package dalieOCP.fileIO.usingByteStreamIO.inputStream.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

class Execute {

	public static void main(String[] args) {
		
		int bufferSize = 8 * 1024;
	    
		try {
			InputStream input = new BufferedInputStream(
					new FileInputStream("c:\\data\\input-file.txt"),bufferSize);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
