package dalieOCP.fileNIO.pathMatcher;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class Execute {

	public static void main(String[] args) throws IOException {
		Path dire = Paths.get("Execute.txt");
		Path dire1 = Paths.get("source\\dalieOCP\\fileNIO\\pathMatcher\\Execute.txt");
		Path dire2 = Paths.get("source\\dalieOCP\\fileNIO\\pathMatcher\\package-info.java");
		matches(dire, "glob:*.txt");/* true -> one asterisk means match any character except for directory boundary */ 
		matches(dire1, "glob:**.txt");/* true -> two asterisk means match any character including a directory boundary */

		matches(dire2, "glob:*.java");/* false */
		matches(dire2, "glob:**/*.java");/* true */
		matches(dire2, "glob:*");/* false */
		matches(dire2, "glob:**");/* true */
	
		Path dire3 = Paths.get("Bert-book");
		Path dire4 = Paths.get("Kathy-horse");
		matches(dire3, "glob:{Bert*,Kathy*}");/* true */
		matches(dire4, "glob:{Bert,Kath}*");/* true */
		matches(dire3, "glob:{Bert,Kathy}");/* false */
		
		Files.walkFileTree(Paths.get("source\\dalieOCP"), new MyPathMatcher());
	}
	
	public static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		out.println(matcher.matches(path));	
	}
}


class MyPathMatcher extends SimpleFileVisitor<Path> {
	
	private PathMatcher matcher = 
			FileSystems.getDefault().getPathMatcher("glob:**dalieOCP**.txt");
	
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(matcher.matches(file))
			System.out.println(file);
		
		return FileVisitResult.CONTINUE;
	}
}
