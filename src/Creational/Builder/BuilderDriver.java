package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class BuilderDriver {
    public static void main(String args[]){
        System.out.println("Builder Pattern");
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepVegMeal();
        vegMeal.printItems();
        System.out.println("Total Cost of Veg Meal is "+ vegMeal.getCost());

        Meal meatMeal = mealBuilder.prepMeatMeal();
        meatMeal.printItems();
        System.out.println("Total Cost of Meat Meal is "+ meatMeal.getCost());

    }
}
