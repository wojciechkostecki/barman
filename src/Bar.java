import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barman barman = new Barman();

        System.out.println("Podaj nazwę 1 składnika: ");
        String nameIngredient1 = scanner.nextLine();
        System.out.println("Podaj ilość 1 składnika: ");
        int amountIngredient1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj nazwę 2 składnika: ");
        String nameIngredient2 = scanner.nextLine();
        System.out.println("Podaj ilość 2 składnika: ");
        int amountIngredient2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj nazwę 3 składnika: ");
        String nameIngredient3 = scanner.nextLine();
        System.out.println("Podaj ilość 3 składnika: ");
        int amountIngredient3 = scanner.nextInt();
        scanner.nextLine();

        Drink drink = barman.createDrink(nameIngredient1,amountIngredient1,nameIngredient2,amountIngredient2,
                nameIngredient3,amountIngredient3);

       drink.printDrink(drink);
    }
}
