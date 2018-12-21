package english;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Explorer {

	public File sFolder;
	public File tFolder;
	
	public Explorer(String pathToSourceFolder, String pathToTargetFolder) {
		sFolder = new File(pathToSourceFolder);
		tFolder = new File(pathToTargetFolder);
	}
	
	public Explorer() {
		
	}
	
	
	public synchronized static String buildSourcePath(Computer c) throws Exception {
		Folder folder = Computer.getPC(c);
		return buildPath(folder.getsDrive(),folder.getsFolder());
	}
	
	public synchronized static String buildTargetPath(Computer c) throws Exception {
		Folder folder = Computer.getPC(c);
		return buildPath(folder.gettDrive(),folder.gettFolder());
	}
	
	public synchronized static String buildPath(String drive,String[] folders) throws Exception {
		return new StringBuilder(drive).append(Explorer.buildPath(folders)).toString();
	}
	
	public synchronized static String buildPath(String[] folders) throws Exception {
		String path = "";
		
		if(folders.length <= 0)
			throw new Exception("minimum one Foldername is required");
	
		for (int i = 0; i < folders.length; i++) {
			path += File.separator + folders[i];
		}
			
		return path;
	}
	
	protected File[] getFilesListOfFolder(File f){
		return f.listFiles();
	}
	
	protected File getTargetFile(String fileName) {
		System.out.println(this.tFolder.getAbsolutePath() + File.separator + fileName);
		String newFolder = this.tFolder.getAbsolutePath() + File.separator + this.getNewTargetFolderName(fileName) + File.separator + fileName;
		return new File(newFolder);
	}
	
	protected File getTargetDescriptionFile(String fName, String description) {
		return new File(this.tFolder.getAbsolutePath() + File.separator + this.getNewTargetFolderName(fName) + File.separator + description + ".txt");
	}
	
	protected String getNewTargetFolderName(String s) {
		return s.substring(0,s.indexOf("."));
	}
	
	protected File getTargetFolder(String folderName) {
		
		return new File(this.tFolder.getAbsolutePath() + File.separator + this.getNewTargetFolderName(folderName));
	}
	
	protected boolean prepareTargetFolder(File folder) throws SecurityException {
		
		if(folder.exists() && folder.isDirectory()) 
			return true;
		else {
			return folder.mkdirs();
		}
		
	}
	
	protected boolean isFileSkipped(File file) {
		String fName = file.getName();
		if(fName.indexOf(".") == -1)
			return true;
		
		return false;
	}
	
	public static synchronized void copyFile(File sourceFile, File targetFile) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(sourceFile);
	        os = new FileOutputStream(targetFile);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
	public static synchronized void writeFile(File newFile) throws IOException {
		OutputStream os = null;
		try {
			os = new BufferedOutputStream(new FileOutputStream(newFile));
			os.flush();
		} finally {
			os.close();
		}
	}
	
}
