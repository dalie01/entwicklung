package dalieOCP.filesPathAndPaths.path.convertRelativePathToAbsolutPath;

import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {
	
	public static void main(String[] args) {
		Path relative = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path\\convertRelativePathToAbsolutPath\\Execute.txt");
		Path absolute = relative.toAbsolutePath();//Path is immutable;
		System.out.println(absolute);// Result is D:\entwicklung\oracleOCP\..\convert
		
		Path relative1 = Paths.get("..\\source\\dalieOCP\\filesPathAndPaths\\path\\convertRelativePathToAbsolutPath\\Execute.txt");
		Path absolute1 = relative1.toAbsolutePath();
		absolute1 = absolute1.normalize();
		System.out.println(absolute1);
		
		Path absolut2 = Paths.get("C:\\dalie\\entwicklung\\oracleOCP\\source");
		Path absolut3 = absolut2.toAbsolutePath();
		System.out.println(absolut3);
	}
}
