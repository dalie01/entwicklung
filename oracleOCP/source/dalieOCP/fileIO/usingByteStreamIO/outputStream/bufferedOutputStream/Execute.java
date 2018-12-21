package dalieOCP.fileIO.usingByteStreamIO.outputStream.bufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Execute {
	
	public static void main(String[] args) {
		
		int bufferSize = 8 * 1024;
		try {
			OutputStream output = new BufferedOutputStream(
					new FileOutputStream(new File("c:\\data\\output-file.pdf")),bufferSize);//FileNotFoundException
//			new FileOutputStream("c:\\data\\output-file.pdf"),bufferSize); is also possible
			
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
