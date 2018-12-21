package string;

public class CheckStringOfNull {
	
	public static void main(String[] args) {
		int sitId = 123;
		System.out.println(checkOfNull(sitId));
	}//main
	
	private static String checkOfNull(int argum){
		
		String sitId = new Integer(argum).toString();
		if(sitId != null)
			return sitId;
		
		return null;
	}//checkOfNull
}//class CheckStringOfNull
