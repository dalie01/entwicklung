package patterns.builder;

/**
 * @author DV0101
 *
 */
public class Meal {
	
	private String drink,mainCource,side;

	/**
	 * drink for a meal.
	 * @return drink
	 */
	public String getDrink() {
		return drink;
	}

	/**
	 * set drink for a meal.
	 * @param drink
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}

	/**
	 * mainCource of a meal.
	 * @return mainCource 
	 */
	public String getMainCource() {
		return mainCource;
	}

	/**
	 * set mainCoucre for a Meal.
	 * @param mainCource
	 */
	public void setMainCource(String mainCource) {
		this.mainCource = mainCource;
	}

	/**
	 * side of Meal.
	 * @return side of Meal
	 */
	public String getSide() {
		return side;
	}

	/**
	 * set Site for a Meal.
	 * @param side of Meal.
	 */
	public void setSide(String side) {
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Meal [drink=" + drink + ", mainCource=" + mainCource
				+ ", side=" + side + "]";
	}
	
	
}
