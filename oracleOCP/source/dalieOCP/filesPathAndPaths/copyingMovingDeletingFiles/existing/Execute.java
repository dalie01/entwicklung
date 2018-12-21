package dalieOCP.filesPathAndPaths.copyingMovingDeletingFiles.existing;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {
	
	public static void main(String[] args) {
		
		Path to = Paths.get("C:\\dalie\\entwicklung\\oracleOCP\\source\\Execute.txt");
		 
		/* The options array may be used to indicate how symbolic links 
		 * are handled for the case that the file is a symbolic link. 
		 * By default, symbolic links are followed and the file attribute 
		 * of the final target of the link is read. 
		 * If the option NOFOLLOW_LINKS is present 
		 * then symbolic links are not followed.
		 * */
		LinkOption[] linkOptions = new LinkOption[] {
					LinkOption.NOFOLLOW_LINKS
		};
		
		
		/*
		 * Watch out for questions that state that exists() and 
		 * not-Exists() will never return the same boolean value 
		 * for the same Path object. 
		 * Both methods exists() and notExists() would return false 
		 * if they can’t determine the existence of the target file or directory.
		 * 
		 * */
		
		System.out.println(Files.exists(to, linkOptions));//check if a file or a directory exist it returns true if the file or directory exist
		System.out.println(Files.notExists(to, linkOptions));//it returns true if the target not exist.
	}

}
