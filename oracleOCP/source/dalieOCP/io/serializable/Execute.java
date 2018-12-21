package dalieOCP.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A1 {}

class A implements Serializable {
	/* To write objects to a file, their classes should implement java.io.Serializable, 
	 * or the code will throw a java.io.NotSerializable-Exception.
	 * */
	
	private transient String s1;
	private transient int Ii;
	
//	A1 a1; this will throw a NotSerializableException -> Object with NONSERIALIZABLE Data member
	
	String s2;
}

class Execute {
	
	public static void main(String[] args) throws Exception {
		
		try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("object.data"));		
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {
				
			A a1 = new A();
			oos.writeObject(a1);
			oos.flush();
			
			/* 
			 * Retrieve the data (primitive and objects) in the order it was written using object streams, 
			 * or it might throw a runtime exception.
			 * */
			A a2 = (A)ois.readObject();
			System.out.println(a2);
		}
	}
}
