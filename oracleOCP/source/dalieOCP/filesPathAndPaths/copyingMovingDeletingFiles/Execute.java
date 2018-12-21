package dalieOCP.filesPathAndPaths.copyingMovingDeletingFiles;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class Execute {

	public static void main(String[] args) throws IOException {
		Path from = Paths.get("C:\\tmp\\from.txt");
	    Path to = Paths.get("C:\\tmp\\to.txt");
		Path next = Paths.get("C:\\tmp\\next.txt");
		
		Files.copy(from, to);//copy from.txt to.txt 
		Files.copy(next, to);//now two copies of the file, ops FileAlreadyExistException
		Files.copy(next, to, StandardCopyOption.REPLACE_EXISTING);//avoid FileAlreadyExistException
		
		CopyOption[] copyOptions = new CopyOption[] {
				StandardCopyOption.REPLACE_EXISTING,
			    StandardCopyOption.COPY_ATTRIBUTES
		}; 
		Files.copy(from, to, copyOptions);//also possible
		
		
		
		/* The options array may be used to indicate how symbolic links 
		 * are handled for the case that the file is a symbolic link. 
		 * By default, symbolic links are followed and the file attribute 
		 * of the final target of the link is read. 
		 * If the option NOFOLLOW_LINKS is present 
		 * then symbolic links are not followed.*/
		LinkOption[] linkOptions = new LinkOption[] {
				LinkOption.NOFOLLOW_LINKS
		};
		Files.exists(to, linkOptions);
		Files.notExists(to, linkOptions);
	}
}
