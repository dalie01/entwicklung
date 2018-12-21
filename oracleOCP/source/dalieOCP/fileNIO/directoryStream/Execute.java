package dalieOCP.fileNIO.directoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {

	public static void main(String[] args) throws IOException {
		Path dire = Paths.get("source\\dalieOCP\\fileNIO\\directoryStream");
		
		try (
				DirectoryStream<Path> stream = 
					/*
					 * Opens or creates a file, returning an output stream that may be 
					 * used to write bytes to the file. The resulting stream will not be buffered. 
					 * The stream will be safe for access by multiple concurrent threads. 
					 * */
					Files.newDirectoryStream(dire)){
				
			for(Path path : stream) {
					System.out.println(path.getFileName());
				}
		}
		
		try (
				DirectoryStream<Path> stream = 
					Files.newDirectoryStream (dire, "e*")){ // show all Files begin with e;
				
				for(Path path : stream) {
					System.out.println(path.getFileName());
				}
		}
		
	}
}
