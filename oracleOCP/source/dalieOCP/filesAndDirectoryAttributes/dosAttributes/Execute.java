package dalieOCP.filesAndDirectoryAttributes.dosAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

class Execute {

	public static void main(String[] args) {
		
		 Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
	     Path file = Paths.get("Execute.txt");
		
	     
	     
			/* read:DosFileAttributes */
	     	try {
	     		DosFileAttributes dos = Files.readAttributes(dire.resolve(file),DosFileAttributes.class);
	     		System.out.println(dos.isHidden());
	     		System.out.println(dos.isReadOnly());
	     		System.out.println(dos.isSystem());
	     		System.out.println(dos.isArchive());
	     		
	     	} catch (IOException e) {
	     		e.printStackTrace();
	     		
	     	}
			
	     	DosFileAttributeView dosView = Files.getFileAttributeView(file, DosFileAttributeView.class);
	     	
	     	
	     	
			/* write */
			try {
				Files.setAttribute(dire.resolve(file),"dos:hidden",false);
				Files.setAttribute(dire.resolve(file),"dos:readonly",false);
			
			} catch (ClassCastException | IllegalArgumentException  e) {
				e.printStackTrace();
				
			} catch (IOException e){
				e.printStackTrace();
			
			}
	}
}
