package dalieOCP.exception.multipleResources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * java.lang.AutoClosable allows any Exception
 * 
 * or 
 * 
 * java.lang.Closable (since SE 5) extends AutoClosable
 * allows only IOExceptions
 * 
 * */
interface AutoClosable {

    public void close() throws Exception;
}

class MyAutoClosable implements AutoCloseable {

	/* The doIt() method is not part of the AutoClosable interface. */
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyAutoClosable closed!");
    }
}

public class Execute {

	/*
	 * When the try block finishes the FileInputStream will be closed automatically. 
	 * This is possible because FileInputStream implements the Java interface java.lang.AutoCloseable. 
	 * All classes implementing this interface can be used inside the try-with-resources construct.
	 * */
	@SuppressWarnings("unused")
	private static void printFileJava7() throws IOException {

		/* try with resources it can have neither catch,final or both */
		/* try required catch or finally (only finally is RuntimeException (unchecked)  */
	    try(FileInputStream input = new FileInputStream("file.txt");
	    		BufferedInputStream bufferedInput = new BufferedInputStream(input)) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	
	@SuppressWarnings("unused")
	private static void myAutoClosable() throws Exception {

	    try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
	        myAutoClosable.doIt();
	    }
	}
	
}
