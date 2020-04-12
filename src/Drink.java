public class Drink {
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;

    public Drink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(Ingredient ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(Ingredient ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public Ingredient getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(Ingredient ingredient3) {
        this.ingredient3 = ingredient3;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredient1=" + ingredient1 +
                ", ingredient2=" + ingredient2 +
                ", ingredient3=" + ingredient3 +
                '}';
    }

    private double calculateAmount(Drink drink) {
        return drink.ingredient1.getAmount() + drink.ingredient2.getAmount() + drink.ingredient3.getAmount();
    }

    private void calculateProportions(Drink drink) {
        double proportion1 = drink.ingredient1.getAmount() / calculateAmount(drink);
        double proportion2 = drink.ingredient2.getAmount() / calculateAmount(drink);
        double proportion3 = drink.ingredient3.getAmount() / calculateAmount(drink);
        System.out.print(proportion1 + ", " + proportion2 + ", " + proportion3 + ". ");
    }

    public void printDrink(Drink drink) {
        System.out.print("Składniki drinka to: " + drink.ingredient1.getName() + ", " + drink.ingredient2.getName() +
                ", " + drink.ingredient3.getName());
        System.out.print(" w proporcjach ");
        drink.calculateProportions(drink);
        System.out.print("Jego pojemność to " + drink.calculateAmount(drink) + " ml.");
    }
}
