package dalieOCP.fileIO.usingCharacterIO.reader._pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

final class P01 {
	
	public static void main(String[] args) {
		Path p = FileSystems.getDefault().getPath("c:\\1.txt");
		
		try (BufferedReader r = Files.newBufferedReader( p, Charset.forName("UTF-8"))) {
			
			String l = null; 
			while (( l = r.readLine()) != null) {  
				System.out.println(l);
				} 
			} catch (IOException e) { 
				e.printStackTrace();
			}
		
		try {
			byte[] fileArray = Files.readAllBytes(p);

			String wikiString = new String(fileArray, "ISO-8859-1");
			System.out.println(wikiString);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
