package test;

import java.util.List;

import model.internal.postalCode.PostalCode;
import database.Database;
import database.factory.postalCode.business.DataSetPostalCode;

public class DBTablePostalCodes {

	public static void main(String[] args) {

		Database mySql = Database.getInstance("mySql");
		try {
			mySql.setUp();
			
			List<PostalCode> postalCodes = DataSetPostalCode.findPostalCodesByPostalCode(mySql, "04711"); 
			for (PostalCode postalCode : postalCodes) {
				System.out.println(postalCode);
			}
			mySql.close();
			
			List<PostalCode> pCodes = DataSetPostalCode.getAllPostalCodes(mySql); 
			for (PostalCode postalCode : pCodes) {
				System.out.println(postalCode);
			}
			mySql.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				mySql.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} /* catch */

	} /* main */
	
} /* DBTablePostalCodes */
