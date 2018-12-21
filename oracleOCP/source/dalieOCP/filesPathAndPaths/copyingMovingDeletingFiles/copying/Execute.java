package dalieOCP.filesPathAndPaths.copyingMovingDeletingFiles.copying;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path from = Paths.get("C:\\tmp\\Execute.txt");
	    Path to = Paths.get("C:\\tmp\\to.txt");
		Path next = Paths.get("");
		
		try {
			
			
			to = Files.copy(from, to);//copy from.txt to.txt returns the target Path
			
			Files.copy(next, to);//now two copies of the file, ops FileAlreadyExistException
			Files.copy(next, to, StandardCopyOption.REPLACE_EXISTING);//avoid FileAlreadyExistException
		
		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try(FileInputStream is = new FileInputStream(Paths.get("C:\\tmp\\next.txt").toFile());
				OutputStream out = new FileOutputStream(Paths.get("C:\\tmp\\next.txt").toFile())){
			
			long l1 = Files.copy(is, next);//copy all bytes from an input stream to a file
			long l2 = Files.copy(from, out);//copy all bytes from file to an out stream
			
		} catch (FileNotFoundException e) {//is thrown by FileInputStream or FileOutputStream
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}

		try {
			
			CopyOption[] copyOptions = new CopyOption[] {
				StandardCopyOption.REPLACE_EXISTING,
			    StandardCopyOption.COPY_ATTRIBUTES
			}; 
			Files.copy(from, to, copyOptions);//also possible
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
