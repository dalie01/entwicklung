package dalieOCP.fileIO.file;

import java.io.File;
import java.io.IOException;

class Execute {
	
	public static void main(String[] args) {
		String fPath = "source" + File.separator + 
				"dalieOCP" + File.separator + 
					"fileNavigationAndIO" + File.separator + 
						"file";
		String fName = "Execute.txt";
		
		File f = new File(
				fPath.concat(File.separator).concat(fName));/* no new File yet */
		System.out.println(f.getAbsolutePath());
		if (f.exists())
			f.delete();
		
			try {
				f.createNewFile(); /* this will create a new File  */
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
