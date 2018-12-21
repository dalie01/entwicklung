package dalieOCP.filesAndDirectoryAttributes.posixFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Map;
import java.util.Set;

class Execute {
	
	public static void main(String[] args) {
		Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
		Path file = Paths.get("Execute.txt");
		
		try {
			/*Read:PosixFileAttributes */
			PosixFileAttributes posix = Files.readAttributes(dire.resolve(file), PosixFileAttributes.class);
		
			System.out.println(posix.group());
			System.out.println(posix.permissions());
		
			Map<String,Object> values = Files.readAttributes(file, "posix:*");
			for (String attribute:values.keySet()) {
				System.out.println(attribute + " : " + values.get(attribute));
			}
			

		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		/*WRITE:PosixFilePermission*/
		PosixFileAttributeView posixView = Files.getFileAttributeView(dire.resolve(file), PosixFileAttributeView.class);
		try {
			posixView.setPermissions(PosixFilePermissions.fromString("rwxrwxrwx"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
		try {
			Files.setPosixFilePermissions(dire.resolve(file), perms);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
