import java.util.ArrayList;
import java.util.List;

public class Drink {
    List<Ingredient> ingredients = new ArrayList<>();

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
}
