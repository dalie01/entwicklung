package dalieOCP.filesPathAndPaths.copyingMovingDeletingFiles.deleting;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * {@link dalieOCP.filesPathAndPaths.copyingMovingDeletingFiles}
 * 
 * @author dalie.de
 *
 */
class Execute {
	
	public static void main(String[] args) {
		
		 Path to = Paths.get("C:\\tmp\\to.txt");
		 try {
				Files.delete(to);//throws NoSuchFileException in case File dosn't exist
			
			} catch (NoSuchFileException | DirectoryNotEmptyException e){
				e.printStackTrace();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Files.deleteIfExists(to);//avoid NoSuchFileException return true is if it exist and deleted
			
			} catch (DirectoryNotEmptyException e) {
				e.printStackTrace();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
