public class Ingredient {
    String name;
<<<<<<< HEAD
    double amount;
=======
    double amountOfIngredient;
>>>>>>> deaf9fece5f331f1dcb45b1c9e91df5a04257ba2

    public Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Nazwa składnika: " + name + ", ilość składnika: " + amount + " ml.";
    }
}
