package dalieOCP.fileIO.helper;

import java.io.File;
import java.io.IOException;

public class FileHelper {
	
	static String fPath, fName;
	
	static {
		fPath = "source" + File.separator + 
					"dalieOCP" + File.separator + 
						"fileNavigationAndIO";
		
		fName = "Execute.txt"; 
	}
	
	/**
	 * creates a fileName by default Execute.txt
	 * 
	 * @param packageId package where file located
	 * @return
	 */
	public static String getDefaultFileName(String packageId) {
		return fPath.concat(File.separator).concat(packageId).concat(File.separator).concat(fName);
	}
	
	public static String getFileName(String packageId, String fName) {
		return getDefaultFileName(
				packageId != null && packageId.length() > 0 ? packageId : FileHelper.fPath)
					.concat(File.separator).concat(
							fName != null && fName.length() > 0 ? fName : FileHelper.fName);
	}

	/**
	 * Check if file exist, it will delete and create a new file.
	 * 
	 * @param file
	 * @return true is created a new File
	 * 
	 * @throws IOException
	 */
	public static boolean tempFile(File file) throws IOException {
		if(file.exists())
			file.delete();
		
		return file.createNewFile();
	}
}
