package patterns.builder;

/**
 * Create a ItalienMeal
 * @author DV0101
 *
 */
public class ItalienMealBuilder implements MealBuilder {

	private Meal meal;
	
	/**
	 * creates a Meal.
	 */
	public ItalienMealBuilder() {
		meal = new Meal();
	}
	@Override
	public void buildDrink() {
		meal.setDrink("red wine");
	}

	@Override
	public void buildMainCource() {
		meal.setMainCource("pizza");
	}

	@Override
	public void buildSide() {
		meal.setSide("bread");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
