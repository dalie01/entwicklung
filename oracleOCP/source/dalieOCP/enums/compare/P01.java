package dalieOCP.enums.compare;

enum Type {
	A,B,C
}

public class P01 {

	static Type t;
	
	static {
		t = Type.valueOf("A");
	}
	
	public static void main(String[] args) {
		System.out.println(P01.t == Type.A);
	}
}
