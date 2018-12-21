package dalieOCP.filesPathAndPaths.creatingsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {

	public static void main(String[] args) throws IOException, FileAlreadyExistsException  {
		Path p1 = Paths.get("java/source");
		Path p2 = Paths.get("java/source/directory");
		Path file = Paths.get("java/source/directory/Programm.java");
		Files.createDirectory(p1);
		Files.createDirectory(p2);
		Files.createFile(file);
		
		/* alternative as above and always remember 
		 * that the directory needs to exist by time the file is created */
		Files.createDirectories(p2);//create all levels of directories
		
		/* if the file already exist throws FileAlreadyExistsException */
		Files.createFile(file);//create a file
		
	}
}
