package listing.ListInList;

import java.util.List;

public class Product {
	
	private int sku;
	private String description;
	
	public Product(){	
	}
	public Product(List<Object> argum){
		this.sku = Integer.parseInt(argum.get(0).toString());
		this.description = argum.get(1).toString();
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", description=" + description + "]";
	}
	
}
