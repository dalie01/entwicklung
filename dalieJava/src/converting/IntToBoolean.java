package converting;

/**
 * 
 * */
public class IntToBoolean {

	public static void main(String[] args) {

		boolean isValid = false;

		int intVal = 1;

		isValid = Integer.toString(intVal) != null
				&& Integer.valueOf(intVal).equals(1);

		System.out.println(isValid);

	} /* main */
	
} /* class IntToBoolean */
