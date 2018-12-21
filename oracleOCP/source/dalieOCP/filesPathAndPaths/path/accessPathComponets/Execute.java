package dalieOCP.filesPathAndPaths.path.accessPathComponets;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {
	
	public static void main(String[] args) {
		
		Path p = FileSystems.getDefault().getPath("C:\\dalie\\entwicklung\\oracleOCP\\source"); 
		Path p1	= 	Paths.get("dalieOCP\\filesPathAndPaths\\path\\accessPathComponets\\Execute.txt");
		
		System.out.println("toString() " + p.toString());
		
		System.out.println("getRoot() " + p.getRoot());// --> C:\\
		System.out.println("getRoot() " + p1.getRoot());//beware returns null on relative paths.
		
		System.out.println("getFileName()" +  p.getFileName());// -> source
		System.out.println("getFileName()" +  p1.getFileName());// -> Execute.txt
		
		System.out.println("getName(\"0\")" + p.getName(0));//here not C: -> dalie
		System.out.println("getName(\"0\")" + p1.getName(0));// -> dalieOCP
		
		System.out.println("getParent()" +  p.getParent());// C:\dalie\entwicklung\oracleOCP
		System.out.println("getParent()" +  p1.getParent());// dalieOCP\filesPathAndPaths\path\accessPathComponets
		
		System.out.println("getsubpath()" + p.subpath(0, 2));// -> dalie\entwicklung
		System.out.println("getsubpath()" + p1.subpath(0, 2));// -> dalieOCP\filesPathAndPaths
//		System.out.println("getsubpath()" + p1.subpath(0, 6));it will throws IllegalArgumentException
	}
}
