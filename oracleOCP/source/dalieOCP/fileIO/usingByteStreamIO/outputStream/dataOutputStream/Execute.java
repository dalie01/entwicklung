package dalieOCP.fileIO.usingByteStreamIO.outputStream.dataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Execute {
	
	public static void main(String[] args) {
		DataOutputStream dataOutputStream;
		try {
//			dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("binary.data")));//also possible
			dataOutputStream = new DataOutputStream((new FileOutputStream("binary.data")));//throws FileNotFoundException
		
				dataOutputStream.write(45);//byte data
				dataOutputStream.writeInt(4545);//int data
				dataOutputStream.writeDouble(109.123); //double data
				
				dataOutputStream.flush();
				dataOutputStream.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
