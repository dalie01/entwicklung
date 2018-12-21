package dalieOCP.filesAndDirectoryAttributes.basicAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

class Execute {
	
	public static void main(String[] args) {

		Path dire = Paths.get("source\\dalieOCP\\fileAndDirectoryAttributes");
		Path file = Paths.get("Execute.txt");
		try {
			
			BasicFileAttributes basic = 
					Files.readAttributes(dire.resolve(file),BasicFileAttributes.class); // IOExeception

			/* READ:BasicFileAttribes */
			System.out.println(basic.lastModifiedTime());
			System.out.println(basic.lastAccessTime());
			System.out.println(basic.creationTime());

			/*
			 * If an underlying system doesn’t support all the basic time stamps—that is, 
			 * creationTime, lastAccessTime, and lastModified-Time—it might 
			 * return system-specific information.
			 * 
			 * */
			
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		
		
		Map<String, Object> values;
		try {
			values = Files.readAttributes(dire.resolve(file), "*");

			for (String attribute:values.keySet()) {
				System.out.println(attribute + " : " + values.get(attribute));
			}
			
			values = Files.readAttributes(file,
					"lastModifiedTime,isDirectory");
			
			for (String attribute:values.keySet()) {
				System.out.println(attribute + " : " + values.get(attribute));
			}
			
			
//			System.out.println(Files.getAttribute(dire.resolve(file), "CustomAttribute"));// Files.getAttribute()
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		/* WRITE:BasicFileAttributeView  */
		BasicFileAttributeView basicView = Files.getFileAttributeView(dire.resolve(file),BasicFileAttributeView.class);//no IOExecption
		long now = System.currentTimeMillis();
		FileTime creation = FileTime.fromMillis(now - 60000);
		FileTime lastModified = FileTime.fromMillis(now - 50000);
		FileTime lastAccess = FileTime.fromMillis(now - 30000);
		
		
		try {
			basicView.setTimes(lastModified, lastAccess, creation);// IOException
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		try {
			Files.setAttribute(dire.resolve(file), "CustomAttribute", "Hello");//also possible by Files.setAttribute
			System.out.println(Files.getAttribute(dire.resolve(file), "CustomAttribute"));// Files.getAttribute()
			
			/* 
			 * Methods Files.setAttribute() and Files.getAttribute()
			 * throw an IllegalArgumentException or UnsupportedOperationException
			 * if you pass them an invalid or unsupported attribute.
			 */
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
