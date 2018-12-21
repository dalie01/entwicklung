package dalieOCP.filesPathAndPaths;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path p1 = Paths.get("/tmp/file.txt");//Unix
		Path p2 = Paths.get("c:\\tmp\\file.txt");//Windows
	
		Path longer = FileSystems.getDefault().getPath("c:", "tmp");//only for deeper understood
		Path p3 = Paths.get("/tmp","file.txt"); //the same as p1
		Path p4 = Paths.get("c:","tmp","file.txt"); //the same as p2
		Path p5 = Paths.get("c:\\tmp","file.txt"); //also the same as p2
		Path p6 = Paths.get("tmp","file.txt");//is a relative path, which means Java looks from current directory.
		Path p7 = Paths.get("file:///c:/tmp/test");//file://is a protocol just like http:// -> will give java.nio.file.InvalidPathException
		Path p8 = Paths.get(URI.create("file:///c:/tmp"));//URI(Uniform Resource Identifier)
		
		
		/* for conversions of code as written before Java 7 */
		File file = new File("C:\tmp\file.txt");//see is from package java.io.File
		Path convertedPath = file.toPath();
		File convertedFile = p2.toFile();
	}
}
