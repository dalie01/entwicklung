package dalieOCP.filesPathAndPaths.files.bufferedWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Execute {

	public static void main(String[] args) {
		Path dire = Paths.get("source\\dalieOCP\\filesPathAndPaths\\files\\bufferedWriter");
		Path file = Paths.get("Execute.txt");
		
		try(BufferedWriter br = Files.newBufferedWriter(dire.resolve(file),Charset.forName("UTF-8"),
				new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.DSYNC})){
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss", Locale.getDefault());
			DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.GERMAN);
			
			br.write(df.format(now) + System.getProperty("line.separator"));
			br.write(sdf.format(now)+ System.getProperty("line.separator"));
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/*
	 * The following is a list of constants provided by java.nio.file.StandardOpenOption:  
	 * APPEND If the file is opened for WRITE access then bytes will be written to the end of the file rather than the beginning.  
	 * CREATE Create a new file if it does not exist.  
	 * CREATE_NEW Create a new file, failing if the file already exists.  
	 * DELETE_ON_CLOSE Delete on close.  
	 * DSYNC Requires that every update to the file's content be written synchronously to the underlying storage device.  
	 * READ Open for read access.  
	 * SPARSE Sparse file.  
	 * SYNC Requires that every update to the file's content or metadata be written synchronously to the underlying storage device.  
	 * TRUNCATE_EXISTING If the file already exists and it is opened for WRITE access, then its length is truncated to 0.  
	 * WRITE Open for write access. 
	 * */
}
