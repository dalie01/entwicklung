package dalieOCP.equals._practice;

final class P01 {

	public static void main(String[] args) {
		Integer I1 = new Integer("2");
		Float F1 = new Float("2");
		Byte B1 = new Byte("2");
		System.out.println(I1.equals(B1));//always false both are different classes
		System.out.println(F1.equals(I1));//always false both are different classes
	}
}
