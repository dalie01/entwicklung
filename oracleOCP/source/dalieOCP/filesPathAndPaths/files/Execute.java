package dalieOCP.filesPathAndPaths.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

class ListFileNames extends SimpleFileVisitor<Path> {
	
}

class Execute {

	public static void main(String[] args) {

		/*
		 * A directory tree is traversed depth-first. But the order in which
		 * the sub directories are traversed is unpredictable.
		 * */
		try {
			/*
			 * This method traverses through a directory structure, the root of which is specified
			 * by a Path object. The directory tree is traversed depth-first. The traversal is considered
			 * complete when either all the members of a tree are visited, any of method 
			 * File-Visitor returns FileVisitResult.TERMINATE, or if an exception is thrown during the traversal.
			 * 
			 * */
			Files.walkFileTree(Paths.get("dire", "Execute.txt"), new ListFileNames());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
