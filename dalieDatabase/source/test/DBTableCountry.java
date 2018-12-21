package test;


import java.util.List;

import model.internal.country.Country;
import database.Database;
import database.factory.country.business.DataSetCountry;

public class DBTableCountry {
	
	public static void main(String[] args) {

		Database mySql = Database.getInstance("mySql");
		try {
			mySql.setUp();
			Country ct = DataSetCountry.getCountryById(mySql, "NZ");
			System.out.println(ct);
			
			List<Country> countries = DataSetCountry.getAllCountries(mySql);
			for (Country country : countries) {
				System.out.println(country);
			}
			
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
	
} /* DBTableCountry */
