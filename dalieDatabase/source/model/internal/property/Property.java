package model.internal.property;

import java.io.Serializable;
import java.util.List;

import model.AbstractProperty;
import model.internal.DataUtils;

/**
 * Property hold all Information <br> 
 * to handle LocalizedString.properties Files.
 *
 * @author DALiEWEB
 * @since 1.0.0.0
 */
public class Property extends AbstractProperty 
	implements Comparable<Property>, Serializable {

	/** default Property. */
	public Property(){}
	
	/**
	 * List of types objects, as are results from SQL.
	 * @param obj List<object> 
	 */
	public Property(List<Object> obj){
		this.setPropertId(obj.get(0).toString());
		this.setCountryId(obj.get(1).toString());
		this.setDescription(obj.get(2).toString());
		this.setProjectId(obj.get(3).toString());
		this.setReleaseId(obj.get(4).toString());
		this.setDataUtils(new DataUtils(obj,5));
	} /* Property */
	
	@Override
	public int compareTo(Property p) {
		
		if (p.getPropertId() == null 
				&& this.getPropertId() == null) {
	      return 0;
		}
		if (this.getPropertId() == null) {
		      return 1;
		}
		if (p.getPropertId() == null) {
		 return -1;
		}
		
		return this.getPropertId().compareTo(p.getPropertId());
		
	} /* compareTo */
	
	public String getPropertyEntry(){
		System.out.println(this.getPropertId().toLowerCase().trim() + "=" + this.getDescription().trim());
		return this.getPropertId().toLowerCase().trim() + "=" + this.getDescription().trim(); 
	} 
	
} /* Property */ 
