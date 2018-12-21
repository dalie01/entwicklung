package interfaces.overriding;

/**
 * <b>Example: overriding interface</b><br>
 * please refer for explanation<br>
 * <a href="http://java.sun.com/docs/books/jls/second_edition/html/interfaces.doc.html">read up</a><br> 
 * */
public class BufferError extends Exception {

	BufferError() {
		super();
	}//BufferError

	BufferError(String s) {
		super(s);
	}//BufferError

}//BufferError
