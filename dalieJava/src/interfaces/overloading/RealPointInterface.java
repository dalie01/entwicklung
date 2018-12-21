package interfaces.overloading;

/**
 * 
 * the method name:move is overloaded in interface RealPointInterface 
 * with three different signatures, two of them declared and one inherited. 
 * Any non-abstract class that implements interface RealPointInterface 
 * must provide implementations of all three method signatures<br>
 * 
 * <a href="http://java.sun.com/docs/books/jls/second_edition/html/interfaces.doc.html">read up</a><br>
 *
 * */
public interface RealPointInterface extends PointInterface {

	void move(float dx, float dy);
	void move(double dx, double dy);

}//RealPointInterface
