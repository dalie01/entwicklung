package dalieOCP.exception.multipleResources;

import java.io.IOException;

class A implements AutoCloseable {
	
	public void close() throws IOException {
		throw new IOException("IOException is thrown");
	}
}

public class Execute_II {
	
	public static void main(String[] args) {
		
		try(A a1 = new A(); A a2 = new A() ) {
		
		} catch (Exception e) {// this catch will reached only one
			System.out.println("UD001: " + e.getMessage());
			
			// the second Message will only added
			for (Throwable t : e.getSuppressed()) {
				System.out.println("UD002: " + t);
			}
			
		}
	}

}
