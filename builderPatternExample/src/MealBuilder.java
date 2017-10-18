
public class MealBuilder  {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new VegPizza());
        return meal;
    }
    public  Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.addItem(new ChickenPizza());
        return meal;
        }

}
