package dalieOCP.filesPathAndPaths.path.comparing;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {

	public static void main(String[] args) {
		Path p1 = new File("B:\\dir1\\dir2\\file.txt").toPath();
		Path p2 = Paths.get("C:\\dir1\\dir2\\file.txt");
		Path p3 = Paths.get("C:\\dir1\\dir2\\file.txt");
		
		System.out.println(p1.compareTo(p2));//return int equals == 0  
		System.out.println(p2.equals(p3));//return boolean   
		
		System.out.println(p1.endsWith("file.txt"));//return boolean true 
		System.out.println(p1.endsWith("\\file.txt"));//return boolean false 
		
		System.out.println(p1.startsWith("\\dir1"));//return boolean false 
		System.out.println(p1.startsWith("B:\\dir1"));//return boolean true 
		
		
		//p1.startsWith(null); compile Error is overload String and Path
	}
}
