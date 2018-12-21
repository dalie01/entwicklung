package dalieOCP.filesPathAndPaths.path.iterableAPath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

class Execute {

	public static void main(String[] args) {
		String fPath = "source" + File.separator + 
				"dalieOCP" + File.separator + 
					"filesPathAndPaths" + File.separator + 
						"path" + File.separator +
							"iterableAPath";
		String fName = "Execute.txt";
		
		Path path = Paths.get(fPath, fName);

        Iterator<Path> it = path.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
	
}
