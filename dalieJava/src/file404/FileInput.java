package file404;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Demo of File 404.log
 * access_log.1296691200:193.108.224.57  - - [03/Feb/2011:14:20:01 +0100] "GET /mmsflirtdate_tpl.htm HTTP/1.0" 404 18493 "-" 
 * Java run -> new File 404new.log
 * 193.108.224.57 - - [03/Feb/2011:14:20:01 +0100] "GET /mmsflirtdate_tpl.htm HTTP/1.0" 404 18493 "-" 
 * */
public class FileInput {
	
	public static void main(String[] args) {
		try {
			BufferedReader edatei =
				new BufferedReader(
					new FileReader("C:\\404\\404.log"));
				BufferedWriter out = 
					new BufferedWriter(new FileWriter("C:\\404\\404new.log"));
			
			while (0 == 0) {
				String zeile = edatei.readLine();
				//content is found
				if (zeile == null) {
					
					System.out.println("last record");
					break;
					
				} else {
				
				String access_log = zeile.substring(0, 22);
				if (access_log.startsWith("access_log")) {
					zeile = zeile.replaceAll(access_log,"");
					System.out.println(zeile);
				}//endif

				 try{
					 /*write the clean content */ 
					 out.write(zeile+ "\r\n");
					 }catch (Exception e){
						 /*Catch exception if any*/
					      System.err.println("Error: " + e.getMessage());
				    }//catch
					  
				}//first record
				
			} //while
			
			edatei.close();
			out.close();
	
			System.out.println("all records are read");
				
		}catch(Exception e){
			System.out.println(e.getMessage());
		} //try
	}//main
}//FileInput
