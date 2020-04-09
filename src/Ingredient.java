public class Ingredient {
    String name;
    double amountOfIngredient;

    public Ingredient(String ingredientName, double amountOfIngredient) {
        this.ingredientName = ingredientName;
        this.amountOfIngredient = amountOfIngredient;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getAmountOfIngredient() {
        return amountOfIngredient;
    }

    public void setAmountOfIngredient(double amountOfIngredient) {
        this.amountOfIngredient = amountOfIngredient;
    }

    @Override
    public String toString() {
        return "Nazwa składnika: " + ingredientName + ", ilość składnika: " + amountOfIngredient + " ml.";
    }
}
