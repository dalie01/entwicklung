package dalieOCP.fileIO.usingByteStreamIO.inputStream.dataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		try {
		DataInputStream input;
			input = new DataInputStream(
			        new FileInputStream("binary.data"));

			char   aChar   = input.readChar();
			boolean aBoolean = input.readBoolean();
			int    aByte   = input.read();
			int    anInt   = input.readInt();
			float  aFloat  = input.readFloat();
			double aDouble = input.readDouble();
			
			/*
			 * Any read operation by DataInputStream 
			 * past the end of the file will throw an EOFException.
			 * */
			
			/*
			 * When you are finished reading data from the DataInputStream you should remember to close it. 
			 * Closing a DataInputStream will also close the InputStream instance 
			 * from which the DataInputStream is reading. 
			 */
			input.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
