package dalieOCP.fileIO.usingByteStreamIO.outputStream._pratice;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

final class P01 {

	public static void main(String[] args) {
		Path p = FileSystems.getDefault().getPath("c:\\1.txt");
		
		try (OutputStream out = new BufferedOutputStream(
				Files.newOutputStream(p))) {
			
			String s = "hello";
			byte data[] = s.getBytes();
			out.write(data, 0, data.length);
			
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
