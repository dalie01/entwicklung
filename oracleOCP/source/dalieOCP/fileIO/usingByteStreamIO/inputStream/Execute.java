package dalieOCP.fileIO.usingByteStreamIO.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Execute {

	public static void main(String[] args) {

		try {
			InputStream inputstream = new FileInputStream("c:\\data\\input-text.txt");
			int data = inputstream.read();//It doesn’t throw an EOFException
			while(data != -1) {

				/* do something with data... */
				doSomethingWithData(data);

		  data = inputstream.read();
		}
			inputstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
		try {
			InputStream inputstream = new FileInputStream("c:\\data\\input-text.txt");

			byte[] data      = new byte[1024];
			int    bytesRead = inputstream.read(data);

			while(bytesRead != -1) {
			  doSomethingWithData(data, bytesRead);

			  bytesRead = inputstream.read(data);
			}
		
			inputstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

	
	private static void doSomethingWithData(byte[] data, int bytesRead) {
		
	}

	private static void doSomethingWithData(int data) {
		
	}
}
