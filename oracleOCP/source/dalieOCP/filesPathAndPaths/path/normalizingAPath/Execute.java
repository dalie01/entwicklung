package dalieOCP.filesPathAndPaths.path.normalizingAPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {
	
	public static void main(String[] args) throws IOException {
		Path f1 = Paths.get("path\\iterableAPath\\Execute.txt");
		
		Path p1 = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path\\normalizingAPath\\", 
				"..\\..",//this will remove path\\normalizingAPath\\ 
				f1.toString());
		
		BufferedReader bR = new BufferedReader(new FileReader(p1.toFile()));
		System.out.println(p1.getNameCount());//no check if path exist
		System.out.println(p1.normalize());//no check if path exist
		System.out.println(p1.toFile().exists());
		String data = bR.readLine();
		System.out.println(data);
		bR.close();//always use
		
		Path p2 = Paths.get("c:/tmp/../tmp1/././././../tmp3/a.txt");
		System.out.format("%d %d%n", p2.getNameCount(),Paths.get("temp\\temp1\\F.txt").getNameCount());
		System.out.format("%s is normalized to %1s%n", p2, p2.normalize());
		
	}
}
