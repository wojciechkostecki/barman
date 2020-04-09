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
            Ingredient ingredient = loadIngredient(scanner);
            ingredients.add(ingredient);
        }
        return new Drink(ingredients);
    }

    private static Ingredient loadIngredient(Scanner scanner) {
        System.out.println("Podaj nazwę składnika: ");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość składnika w mililitrach: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Ingredient(name, amount);
    }

    private static void printDrink(Drink drink) {
        System.out.print("Składniki drinka to:");
        drink.getIngredientList().forEach(x -> System.out.print(" " + x.getName() + ","));
        System.out.print(" w proporcjach ");
        proportionsIngredients(drink);
        System.out.print("Jego pojemność to " + amountDrink(drink) + " ml.");
    }

    private static int amountDrink(Drink drink) {
        int amountDrink = 0;
        for (Ingredient ingredient : drink.getIngredientList()) {
            amountDrink += ingredient.getAmount();
        }
        return amountDrink;
    }

    private static void proportionsIngredients(Drink drink){
        StringBuilder stringBuilder = new StringBuilder();
        for (Ingredient ingredient : drink.getIngredientList()) {
            double proportion = ingredient.getAmount()/amountDrink(drink);
            stringBuilder.append(proportion).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append(". ");
        System.out.print(stringBuilder);
    }
}
