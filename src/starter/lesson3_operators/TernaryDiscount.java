package starter.lesson3_operators;

public class TernaryDiscount {
    public static void main(String[] args) {
        double quantity = 10;
        double price = 100;
        double discount = 0.75;
        double cost;

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("total price is: " + cost + " y.e.");
    }
}
