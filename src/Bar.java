public class Bar {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink.printDrink(barman.createDrink());
    }
}
