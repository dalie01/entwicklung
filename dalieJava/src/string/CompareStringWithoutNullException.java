package string;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * CompareStringWithoutNullException is a ClassDemo.</br>
 * In Case to compare Strings, and it is possibility the String Argument is null or blank.</br>
 * The static Methods <b>checkTerms</b> helps to resolve this Problem.
 *   
 * */
public class CompareStringWithoutNullException {
	/* This Class is only for Demo */
	
	public static final String Error_List_Street = "The Street is not ..."; 
	public static final String Error_List_Id = "The Customer Id is ...";
	public static void main(String[] args) {
		
		List<String> error = new ArrayList<String>();
		
		if (!checkTerms("Street ", "Street")) {
			/* ErrorMessage by Street is not Equal  */
			error.add(Error_List_Street);
		}
		if (!checkTerms(null, "Street")) {
			/* ErrorMessage by Street is not Equal  */
			error.add(Error_List_Street);
		}
		if (!checkTerms("Street", "")) {
			/* ErrorMessage by Street is not Equal  */
			error.add(Error_List_Street);
		}
		if (checkTerms(null, null)) {
			/* ErrorMessage by Customer Id is Equal  */
			error.add(Error_List_Id);
		}
		if (checkTerms("4711", "4711")) {
			/* ErrorMessage by Customer Id is Equal  */
			error.add(Error_List_Id);
		}
		for (String string : error) {
			System.out.println(string);			
		}
	}//main

	/**
	 * compare Strings -> Content null is possibility.
	 * @param
	 * */
	public static boolean checkTerms(String argum1, String argum2) {
		if (StringUtils.isBlank(argum1) && 
				StringUtils.isBlank(argum2)) {
					return true;
		}
		if ((StringUtils.isNotBlank(argum1)) && 
				(StringUtils.isNotBlank(argum2)) && 
					argum1.equals(argum2)) {
						return true;
		}
		return false;
	}//checkTerms
	
}//class CompareStringWithoutNullException
