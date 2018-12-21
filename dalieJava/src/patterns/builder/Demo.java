package patterns.builder;

/**
 * This Demo class lets demonstrate the builder pattern.
 * 
 * @author DV0101
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new ItalienMealBuilder();
		MealDirector mealDirector = new MealDirector(mealBuilder);
		mealDirector.buildMeal();
		System.out.println(mealDirector.getMeal().toString());
		
		mealBuilder = new JapaneseMealBuilder();
		mealDirector = new MealDirector(mealBuilder);
		mealDirector.buildMeal();
		System.out.println(mealDirector.getMeal().toString());
	}

}
