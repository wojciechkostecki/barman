import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barman {
    Scanner scanner = new Scanner(System.in);

    public Drink createDrink() {
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Ingredient ingredient = loadIngredient();
            ingredients.add(ingredient);
        }
        return new Drink(ingredients);
    }

    private Ingredient loadIngredient() {
        System.out.println("Podaj nazwę składnika: ");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość składnika w mililitrach: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Ingredient(name, amount);
    }
}
