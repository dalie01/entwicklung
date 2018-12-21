package interfaces.overriding;

/**
 * <b>Example: overriding interface</b><br>
 * please refer for explanation<br>
 * <a href="http://java.sun.com/docs/books/jls/second_edition/html/interfaces.doc.html">read up</a><br> 
 * */
public interface InfiniteBuffer extends Buffer {

	@Override
	char get() throws BufferError;
	
}//InfiniteBuffer
