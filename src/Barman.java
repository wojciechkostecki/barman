import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barman {
    public Drink createDrink() {
        Scanner scanner = new Scanner(System.in);
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ingredient ingredient = loadIngredient(scanner);
            ingredients.add(ingredient);
        }
        return new Drink(ingredients);
    }

    private Ingredient loadIngredient(Scanner scanner) {
        System.out.println("Podaj nazwę składnika: ");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość składnika w mililitrach: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Ingredient(name, amount);
    }

    public void printDrink(Drink drink) {
        System.out.print("Składniki drinka to:");
        drink.getIngredientList().forEach(x -> System.out.print(" " + x.getName() + ","));
        System.out.print(" w proporcjach ");
        drink.calculateProportions(drink);
        System.out.print("Jego pojemność to " + drink.calculateAmount(drink) + " ml.");
    }
}
