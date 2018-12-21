package dalieOCP.fileIO.usingByteStreamIO.inputStream.objectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class MyClass implements Serializable {
	/* To write objects to a file, their classes should implement java.io.Serializable, 
	 * or the code will throw a java.io.NotSerializableException.*/
	
	public transient int days;
	static int count;
	
	private String Id;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
}

class Execute {
	
	public static void main(String[] args) {
		ObjectInputStream objectInputStream;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("object.data"));

			MyClass object = (MyClass) objectInputStream.readObject();
			System.out.println(object.days);//prints null
			System.out.println(MyClass.count);//0
			System.out.println(object.toString());

			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
