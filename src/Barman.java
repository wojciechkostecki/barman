public class Barman {

    public Drink createDrink(String nameIngredient1, int amountIngredient1, String nameIngredient2, int amountIngredient2,
                            String nameIngredient3, int amountIngredient3) {

        Ingredient ingredient1 = new Ingredient(nameIngredient1,amountIngredient1);
        Ingredient ingredient2 = new Ingredient(nameIngredient2,amountIngredient2);
        Ingredient ingredient3 = new Ingredient(nameIngredient3,amountIngredient3);

        return new Drink(ingredient1, ingredient2, ingredient3);
    }
}
