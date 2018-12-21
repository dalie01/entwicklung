package dalieOCP.fileIO.usingByteStreamIO.inputStream.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InputStream input;
		InputStream i;
		
		try {
			input = new FileInputStream(new File("c:\\data\\input-text.pdf"));//both is possible
			i = new FileInputStream("c:\\data\\input-text.pdf");//throws FileNotFoundException

		int data = input.read();
		while(data != -1) {
		  //do something with data...
		  doSomethingWithData(data);

		  data = input.read();
		}
		input.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	

		try {
			InputStream inputstream = new FileInputStream("c:\\data\\input-text.pdf");

			byte[] data = new byte[1024];
			int bytesRead = inputstream.read(data);

			while(bytesRead != -1) {
				doSomethingWithData(data, bytesRead);

				bytesRead = inputstream.read(data);//read with byte[] array
			}
	
			inputstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	private static void doSomethingWithData(int data) {
		
	}
	private static void doSomethingWithData(byte[] data, int bytesRead) {
		
	}
}
