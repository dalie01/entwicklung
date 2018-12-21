package dalieOCP.filesAndDirectoryAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Execute {

	public static void main(String[] args) {
	    Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
        Path file = Paths.get("Execute.txt");

		Path path = dire.resolve(file);
		
		try{
			System.out.println("size:" + Files.size(path));
			System.out.println("isDirectory:" + Files.isDirectory(path));
			System.out.println("isExecutable:" + Files.isExecutable(path));
			System.out.println("isHidden:" + Files.isHidden(path));
			System.out.println("isReadable:" + Files.isReadable(path));
			System.out.println("isSameFile:" + Files.isSameFile(path, path));
			System.out.println("isDirectory:" + Files.isDirectory(path));
			System.out.println("isSymbolicLink:" + Files.isSymbolicLink(path));
			System.out.println("isWritable:" + Files.isWritable(path));
			System.out.println("getLastModifiedTime:" + Files.getLastModifiedTime(path));
			System.out.println("getOwner:" + Files.getOwner(path));
		
		
			FileTime newTime = FileTime.fromMillis(System.currentTimeMillis());
			Files.setAttribute(path, "creationTime", newTime);
		
			System.out.println("creationTime:" + 
					Files.getAttribute(path, "creationTime"));
			
			System.out.println("creationTime:" +
					Files.getAttribute(path, "creationTime"));
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		/* 
		 * Methods Files.setAttribute() and Files.getAttribute()
		 * can be used to access a file or directory attribute and modify it (if allowed).
		 * The attribute name is passed to these methods as a string value.
		 * 
		 * Rather than accessing individual attributes, you can also access a group of attributes.
		 * 
		 * */
	}
}
