package callByRef;

import java.awt.Point;

public class IntPoint {

	static void clear(Point q){
		q.setLocation(0, 0);
	}
	static void clearCallbyValue(Point q){
		q = new Point();
		q.setLocation(48, 12);
	}
	public static void main(String[] args) {
		Point q = new Point(47,11);
		clearCallbyValue(q);
		System.out.println(q.x);
		clear(q);
		System.out.println(q.x);
	}//main
} //class IntPoint
