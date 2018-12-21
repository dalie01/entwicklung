package classVariable;

/**
 * @author DALiE
 * 
 * */
public final class Main {
	
	/**
	 * @param args blank or null is possibly
	 * */
	public static void main(final String[] args) {
		System.out.println("counter is:" + CV.getCounter());
		CV cv1 = new CV();
		System.out.println(CV.class.getSimpleName() + " Number is:"
				+ cv1.getNumber());
		CV cv2 = new CV();
		System.out.println("Number is:" + cv2.getNumber());
		CV cv3 = new CV();
		System.out.println("Number is:" + cv3.getNumber());
		System.out.println("counter is:" + CV.getCounter());
	} // main
	
}
