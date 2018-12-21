package dalieOCP.enums._practice;

enum N {
	C,B,A;
}

final class P02 {

	public static void main(String[] args) {
		for(N n:N.values())System.out.println(n);
	}
}
