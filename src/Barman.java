public class Barman {
    public static void main(String[] args) {
    }

    public static Drink createDrink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3){
        return new Drink(ingredient1,ingredient2,ingredient3);
    }

    public static void printDrink(Drink drink){
        double sum = drink.ingredient1.amountOfIngredient + drink.ingredient2.amountOfIngredient +
                drink.ingredient3.amountOfIngredient;

        double proportion1 = drink.ingredient1.amountOfIngredient/sum;
        double proportion2 = drink.ingredient2.amountOfIngredient/sum;
        double proportion3 = drink.ingredient3.amountOfIngredient/sum;

        System.out.println("Składniki drinka to: " + drink.ingredient1.ingredientName + ", " +
                drink.ingredient2.ingredientName + ", " + drink.ingredient3.ingredientName +
                " w proporcjach " + proportion1 + ", " + proportion2 + ", " + proportion3 + "." +
                " Jego pojemność to " + sum + "ml.");
    }

}
