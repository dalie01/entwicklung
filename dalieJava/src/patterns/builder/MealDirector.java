package patterns.builder;

/**
 * A different Type of meal will be assembled by MailDirector.
 * In depending on the MealBuilder.
 * 
 * @author DV0101
 *
 */
public class MealDirector {
	private MealBuilder mealBuilder = null;
	
	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	
	public void buildMeal(){
		mealBuilder.buildDrink();
		mealBuilder.buildMainCource();
		mealBuilder.buildSide();
	}
	
	public Meal getMeal() { 
		return mealBuilder.getMeal();
	}
	
}
