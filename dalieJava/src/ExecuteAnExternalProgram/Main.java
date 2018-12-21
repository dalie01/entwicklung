package ExecuteAnExternalProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		 try {
             Runtime rt = Runtime.getRuntime();
             //Process pr = rt.exec("cmd /c dir");
             //Process p = Runtime.getRuntime().exec("cmd /c start/wait .\\scripts\\call.bat");
             Process pr = rt.exec("C:\\Program Files (x86)\\Adobe\\Reader 9.0\\Reader\\AcroRd32.exe");
             BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

             String line = null;
             System.out.println("Start");

             while((line = input.readLine()) != null) {
                 System.out.println(line);
             }//while

             int exitVal = pr.waitFor();
             System.out.println("Exited with error code "+exitVal);

             int eventVal = pr.exitValue();
             if(pr.waitFor() !=0 ){
            	 System.out.println("Ende:"+ eventVal);
             }
            	 
         } catch(Exception e) {
             System.out.println(e.toString());
             e.printStackTrace();
         }//catch
	}//main
	
}//class Main
