package interfaces.overriding;

/**
 * <b>Example: overriding interface</b><br>
 * please refer for explanation<br>
 * <a href="http://java.sun.com/docs/books/jls/second_edition/html/interfaces.doc.html">read up</a><br> 
 * */
public class BufferEmpty extends Exception {

	BufferEmpty(){ 
		super(); 
	}//BufferEmty
	BufferEmpty(String s){
		super(s); 
	}//BufferEmty

}//BufferEmty
