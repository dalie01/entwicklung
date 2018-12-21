package test;

import java.util.List;

import model.capi.type.Type;
import database.Database;
import database.factory.type.business.DataSetType;

public class DBTableType {
	
	public static void main(String[] args) {
		Database mySql = Database.getInstance("mySql");
		try {
			mySql.setUp();

			Type shipping = DataSetType.getShippingType(mySql);
			System.out.println(shipping.isShippingTyp());
			System.out.println(shipping.isBillingTyp());
			System.out.println(shipping);
			
			Type billing = DataSetType.getBillingType(mySql);
			System.out.println(billing.isShippingTyp());
			System.out.println(billing.isBillingTyp());
			System.out.println(billing);
			
			List<Type> types = DataSetType.getAllTypes(mySql);
			for (Type type : types) {
				System.out.println(type.isShippingTyp());
				System.out.println(type.isBillingTyp());
				System.out.println(type);
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
	
} /* DBTableType */
