package dalieOCP.fileIO.usingByteStreamIO.outputStream.fileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Execute {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		FileInputStream in;
		OutputStream output;
		OutputStream o;
		OutputStream o1;
		try {
			in = new FileInputStream(new File("Sample.pdf"));
			o = new FileOutputStream(new File("c:\\data\\output-text.pdf"),false);//overwrites file (default)
			o1 = new FileOutputStream(new File("c:\\data\\output-text.pdf"),true);//appends to file
			output = new FileOutputStream("c:\\data\\output-text.pdf");//FileNotFoundException


		while(moreData()) {
		  int data = getMoreData();
			output.write(data);
		}
			
			output.flush();
			output.close();
		
			
			int data;
			byte[] byteArr = new byte[1024];
			while ((data = in.read(byteArr)) != -1) {
				output.write(byteArr, 0, data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static int getMoreData() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean moreData() {
		return false;
	}
}
