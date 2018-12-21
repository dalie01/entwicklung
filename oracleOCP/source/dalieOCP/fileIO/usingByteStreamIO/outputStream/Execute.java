package dalieOCP.fileIO.usingByteStreamIO.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Execute {
	public static void main(String[] args) {
		
		try {
		OutputStream output = new FileOutputStream("c:\\data\\output-text.txt");//throws FileNotFoundException

		while(hasMoreData()) {
		  int data = getMoreData();
		  output.write(data);
		}
			/*
			 * The OutputStream's flush() method flushes all data written to the OutputStream 
			 * to the underlying data destination.
			 * 
			 * Flushes this output stream and forces any buffered output
			 * bytes to be written out.
			 * */
			output.flush();
			/*
			 * Closes this output stream and releases any system
			 * resources associated with this stream.
			 * */
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int getMoreData() {
		return 0;
	}

	private static boolean hasMoreData() {
		return false;
	}
}
