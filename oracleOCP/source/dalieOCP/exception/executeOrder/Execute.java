package dalieOCP.exception.executeOrder;

import java.io.Closeable;
import java.io.IOException;

class Execute implements Closeable {

	String header;
	
	public void open() throws IOException {
		header = "open";
		throw new IOException("Execute.open");
	}
	
	public String read() throws IOException {
		return "";
	}
	
	@Override
	public void close() throws IOException {
		header = null;
		throw new RuntimeException("Execute.close");
	}
	
	public static void main(String[] args) throws Exception {
		/*
		 * If an exception is thrown within the try-with-resources block, 
		 * then that is the exception that the caller gets. 
		 * But before the try block returns, the resource's close() method is called and 
		 * if the close() method throws an exception as well, 
		 * then this exception is added to the original exception as a supressed exception.
		 * */
		
		try(Execute e = new Execute()){
			System.out.println("Execute.main");
//			int i = 5/0;
//			e.open();
			throw new Exception("Execute");
		}
	}

}
