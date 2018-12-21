package patterns.builder;

public class JapaneseMealBuilder implements MealBuilder {

private Meal meal;
	
	/**
	 * creates a Meal.
	 */
	public JapaneseMealBuilder() {
		meal = new Meal();
	}
	@Override
	public void buildDrink() {
		meal.setDrink("sake");
	}

	@Override
	public void buildMainCource() {
		meal.setMainCource("fish");
	}

	@Override
	public void buildSide() {
		meal.setSide("soup");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
