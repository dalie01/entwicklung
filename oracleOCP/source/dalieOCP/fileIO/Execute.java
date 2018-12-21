package dalieOCP.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.IllegalFormatException;

class Execute {
	public static void main(String[] args) {
		
		String fileName =  File.separator + "source" + 
					File.separator + "dalieOCP" + 
						File.separator + "fileNavigationAndIO" + 
							File.separator + "Execute.txt";
		PrintWriter pW = null;
		try {
			
//			pW = new PrintWriter(new File(fileName));
//			pW = new PrintWriter(new FileWriter(new File(fileName)));
			pW = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
			pW.printf("%1$+-,20.3f %2$+-,30.2f", 123456789F, -123456789F );
			pW.printf("%+-,20.3f", 987654321F);
			
		} catch (IOException | IllegalFormatException e) {
			e.printStackTrace();
		
		} finally {
		
			if(pW != null) {
				try {
					pW.flush();
					pW.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
