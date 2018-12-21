package dalieOCP.fileIO._pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.OutputStream;

final class P02 {

	public static void copy(String s1, String s2) throws IOException {
		
		try (InputStream is = new FileInputStream(s1);
				OutputStream os = new FileOutputStream(s2)) {
			
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			
		} catch (FileNotFoundException | InvalidClassException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		copy("c:\\folder1\\1.txt", "c:\\folder2\\2.txt");
	}
}
