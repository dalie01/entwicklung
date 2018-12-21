/**
 * 
 */
package model.internal.country;

import java.util.List;

import model.AbstractCountry;
import model.internal.DataUtils;
/**
 * @author DALiEWEB
 *
 */
public class Country extends AbstractCountry {

	
	public Country(List<Object> obj){
		this.setCountryId(obj.get(0).toString());
		this.setDescription(obj.get(1).toString());
		this.setDataUtils(new DataUtils(obj,2));
	}
	
} /* Country */
