package dalieOCP.filesPathAndPaths.path.relativizingAPath;

import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//define the fix path
		Path dire = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path");
        Path file = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path\\relativizingAPath\\Execute.txt");
        Path wFile = dire.relativize(file);
        System.out.println(wFile + "" + wFile.toFile().exists());
        
        Path dir = Paths.get("/code");
        Path dirC = Paths.get("C:/code/MyClass.java");
        Path dirD = Paths.get("C:/notes/summary.txt");
//        System.out.println(dir.relativize(dirD));//this will throw Exception relative to absolute
        System.out.println(dirC.relativize(dirD)); //absolute to absolute
	}
}
