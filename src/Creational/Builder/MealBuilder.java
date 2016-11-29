package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class MealBuilder {
    public Meal prepVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;

    }
}
