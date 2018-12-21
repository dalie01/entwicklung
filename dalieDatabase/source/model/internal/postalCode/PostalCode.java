package model.internal.postalCode;

import java.util.List;

import model.AbstractPostalCode;
import model.internal.DataUtils;

public class PostalCode extends AbstractPostalCode {

	public PostalCode(List<Object> obj){
		this.setPostalId(obj.get(0).toString());
		this.setCountryId(obj.get(1).toString());
		this.setStateId(obj.get(2).toString());
		this.setCityId(obj.get(3).toString());
		this.setPostalCode(obj.get(4).toString());
		this.setDataUtils(new DataUtils(obj,5));
	}
	
} /* PostalCode */
