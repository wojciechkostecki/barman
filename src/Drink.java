import java.util.ArrayList;
import java.util.List;

public class Drink {
    private List<Ingredient> ingredients = new ArrayList<>();

    public Drink(List<Ingredient> ingredientList) {
        this.ingredients = ingredientList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredients;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredients = ingredientList;
    }

    @Override
    public String toString() {
        return "Na drinka składają się: " + ingredients;
    }

    public int calculateAmount(Drink drink) {
        int amountDrink = 0;
        for (Ingredient ingredient : drink.getIngredientList()) {
            amountDrink += ingredient.getAmount();
        }
        return amountDrink;
    }

    public void calculateProportions(Drink drink){
        StringBuilder stringBuilder = new StringBuilder();
        for (Ingredient ingredient : drink.getIngredientList()) {
            double proportion = ingredient.getAmount()/calculateAmount(drink);
            stringBuilder.append(proportion).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append(". ");
        System.out.print(stringBuilder);
    }

    public static void printDrink(Drink drink) {
        System.out.print("Składniki drinka to:");
        drink.getIngredientList().forEach(x -> System.out.print(" " + x.getName() + ","));
        System.out.print(" w proporcjach ");
        drink.calculateProportions(drink);
        System.out.print("Jego pojemność to " + drink.calculateAmount(drink) + " ml.");
    }
}
