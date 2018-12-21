package dalieOCP.exception.multipleExceptionTypes;

import java.io.IOException;
import java.sql.SQLException;

/**
 * http://www.codejava.net/java-core/the-java-language/improved-exception-handling-in-java-7
 * 
 * */
class A {
	
	/* this is legal since Java SE 7 */
	void aMethod(short s) throws IOException, SQLException, IllegalAccessException {
		
	/* this is legal before Java SE 7 */	
//	void aMethod(short s) throws IOException, SQLException, Exception {
		try {
			if(s < 0 || s >= 0 && s <= 4)
				throw new IOException();
			
			else if(s >= 5 && s <= 10)
				throw new SQLException();
		
			else if(s >= 11 && s <= 20)
				throw new ClassCastException();
			
			else
				throw new IllegalAccessException();
		} catch (Exception e) {
			System.out.println("UD001");
			throw e;
		}	
	}
	
	
}

class Execute {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.aMethod((short) 100);
			
			/* no matter the order is */
		} catch (IOException | SQLException e) {
			System.out.println("UD002");
			e.printStackTrace();
			
		} catch ( IllegalAccessException e ){
			System.out.println("UD003");
//			e = new Exception() is not allowed of multi-catch e is implicit final
	
			/* It is not allowed to specify two or more exceptions of a same hierarchy 
			 * in the multi-catch statement. 
			 * For example, the following code snippet will give a compile error 
			 * because the FileNotFoundException is a subtype of the IOException */
//		} catch (FileNotFoundException | IOException ex) {
			e.printStackTrace();
		}

	}
}
