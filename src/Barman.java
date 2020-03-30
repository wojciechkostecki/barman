import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barman {
    public static void main(String[] args) {
        printDrink(createDrink());
    }

    private static Drink createDrink() {
        Scanner scanner = new Scanner(System.in);
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj nazwę składnika: ");
            String name = scanner.nextLine();
            System.out.println("Podaj ilość składnika w mililitrach: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            Ingredient ingredient = new Ingredient(name, amount);
            ingredients.add(ingredient);
        }
        return new Drink(ingredients);
    }

    private static void printDrink(Drink drink) {
        System.out.print("Składniki drinka to:");
        drink.getIngredientList().forEach(x -> System.out.print(" " + x.getIngredientName() + ","));
        System.out.print(" w proporcjach ");
        proportionsIngredients(drink);
        System.out.print("Jego pojemność to " + amountDrink(drink) + " ml.");
    }

    private static int amountDrink(Drink drink) {
        int amountDrink = 0;
        for (Ingredient ingredient : drink.getIngredientList()) {
            amountDrink += ingredient.getAmountOfIngredient();
        }
        return amountDrink;
    }

    private static void proportionsIngredients(Drink drink){
        StringBuilder stringBuilder = new StringBuilder();
        for (Ingredient ingredient : drink.getIngredientList()) {
            double proportion = ingredient.getAmountOfIngredient()/amountDrink(drink);
            stringBuilder.append(proportion).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append(". ");
        System.out.print(stringBuilder);
    }
}
