package model.internal.type;

import java.util.List;


import model.AbstractType;
import model.capi.type.Type;
import model.internal.DataUtils;

public class BillingType extends AbstractType implements Type {
	
	private Boolean billingType = true;
	
	public BillingType(List<Object> obj){
		
		this.setTypeId(obj.get(0).toString());
		this.setDescription(obj.get(1).toString());
		this.setDataUtils(new DataUtils(obj,2));
	}
	
	@Override
	public boolean isShippingTyp() {
		return false;
	}

	@Override
	public boolean isBillingTyp() {
		return billingType;		
	}
	
	
}
