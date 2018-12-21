package patterns.builder;

/**
 * Interface is MealBuilder 
 * It features methods used to build a meal a method to retrieve the meal.
 *  
 * @author DV0101
 *
 */
public interface MealBuilder {

	/**
	 * create a Drink for a Meal.
	 */
	public void buildDrink();
	
	/**
	 * create a MainCource for a Meal.
	 */
	public void buildMainCource();
	
	/**
	 * create a Site for a Meal.
	 */
	public void buildSide();
	
	/**
	 * Get the Meal.
	 * 
	 * @return Meal if you like.
	 */
	public Meal getMeal();
	
}
