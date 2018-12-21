package dalieOCP.filesPathAndPaths.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {

	public static void main(String[] args) {
		Path relative = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path");
		Path absolut = relative.toAbsolutePath();
		System.out.println(relative.getParent());
		System.out.println(relative.getRoot());//return null
		System.out.println(relative.getName(0));
		System.out.println(relative.getNameCount());
		System.out.println(relative.subpath(0, 1));
		System.out.println(relative.getFileName());
		
		System.out.println(absolut);
		System.out.println(absolut.getParent());
		System.out.println(absolut.getRoot());//E:
		System.out.println(absolut.getName(0));//throws IllegalArgumtException
		System.out.println(absolut.subpath(0, 1));//throws IllegalArgumtException
	}
}
