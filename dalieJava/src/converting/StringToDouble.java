package converting;

public class StringToDouble {

	public static void main(String[] args) {
		try {
			double doublewert = Double.valueOf(59.95).doubleValue();
			System.out.println(doublewert);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}//main
}//main
