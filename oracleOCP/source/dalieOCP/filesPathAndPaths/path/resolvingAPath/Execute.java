package dalieOCP.filesPathAndPaths.path.resolvingAPath;

import java.nio.file.Path;
import java.nio.file.Paths;

class Execute {
	public static void main(String[] args) {
		/*
		 *  Since the argument to resolve starts with \\, the result will be the same as the argument. 
		 *  If the argument doesn't start with a \ and it doesn't start with a root such as c:, 
		 *  the output is the result on appending the argument to the path on which the method is invoked.
		 * */
		Path dire = Paths.get("source\\dalieOCP\\filesPathAndPaths\\path\\resolvingAPath");
        Path file = Paths.get("Execute.txt");
        System.out.println(dire.resolve(file));//whole complete path
        System.out.println(Paths.get("source").resolve("\\file.txt"));
//        System.out.println(dire.resolve((String)null));get a NullPointerException
        
        //resolve Topic.txt file
        Path path_1 = dire.resolve("Topic.txt");
        System.out.println(path_1.toString());

        //resolve Demo.txt file
        Path path_2 = dire.resolve("Demo.txt");
        System.out.println(path_2.toString());
        
        Path path_3 = dire.resolve(file);
        System.out.println(path_3);
        
        System.out.format("%s%n", Paths.get("folder3").resolve("/home/folder1")); 

        
	}
}
