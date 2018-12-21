package dalieOCP.filesPathAndPaths.comparing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Execute {

	public static void main(String[] args) {
		try {
			System.out.println(Files.isSameFile(Paths.get("D:\\folder\\folder1"), Paths.get("D:\\folder\\folder1")));
			System.out.println(Files.isSameFile(Paths.get("folder\\folder1\\Execute.txt"), Paths.get("folder\\folder1\\Execute.txt")));
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
