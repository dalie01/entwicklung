package database.factory.country.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.Database;
import database.factory.country.DataTableCountry;
import model.internal.country.Country;


public class DataSetCountry extends DataTableCountry {

	public static Country getCountryById(Database db, String countryId) throws Exception {
		Country ct = null;

		List<List<Object>> rows = db.executeQuery("select * from "+db.getDbSchema()+ "."  + DataTableCountry.Id +
				" where countryId = '" + countryId + "'");
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			ct = new Country(rows.get(i));
		}//for

		return ct;
	} /* getCountryById */
	 
	 
	public static List<Country> getAllCountries(Database db) throws Exception {
		List<Country> countries = Collections.synchronizedList(new ArrayList<Country>());

		List<List<Object>> rows = db.executeQuery("select * from " + db.getDbSchema() + "." + DataTableCountry.Id);
		if(rows.size() == 0)
			throw new Exception("Record not Found");

		for(int i = 0;i < rows.size();i++) {
			countries.add(new Country(rows.get(i)));
		}//for


		if(countries.size() == 0)
			throw new Exception("Records not Found");

		return countries;
	} /* getAllCountries */
	
} /* DataSetCountry */
