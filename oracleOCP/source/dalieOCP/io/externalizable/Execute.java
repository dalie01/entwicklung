package dalieOCP.io.externalizable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

class Execute implements Externalizable {

	String userName;
	String passWord;
	Integer roll;

	public Execute() {

	}

	public Execute(String userName, String passWord, Integer roll) {
		this.userName = userName;
		this.passWord = passWord;
		this.roll = roll;
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(userName);
		oo.writeObject(roll);
	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		userName = (String) oi.readObject();
		roll = (Integer) oi.readObject();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Execute m = new Execute("nikki", "student001", 20);
			System.out.println(m.toString());
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/Desktop/files/temp1.txt"));
			oos.writeObject(m);
			oos.close();

			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/Desktop/files/temp1.txt"));
			Execute mm = (Execute) ois.readObject();
			mm.toString();
			System.out.println(mm.toString());
		
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
