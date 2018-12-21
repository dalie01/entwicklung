package reflect;

public class Artikel {
 
	private int number;
	private String descripten;
	private double price;
	private boolean available;
    
	public int getNumber() {
		return number;
	}//getNumber
	public void setNumber(int number) {
		this.number = number;
	}//setNumber
	public String getDescripten() {
		return descripten;
	}//getDescripten
	public void setDescripten(String descripten) {
		this.descripten = descripten;
	}//setDescripten
	public Double getPrice() {
		return price;
	}//getPrice
	public void setPrice(final Double price) {
		this.price = price;
	}//setPrice
	public boolean isAvailable() {
		return available;
	}//isAvaible
	public void setAvailable(boolean available) {
		this.available = available;
	}//setAvailable
	
}//class Artikel
