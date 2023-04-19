package lesson1;

public class Lemonade extends Drink {
    public Lemonade(String name, Double price, Integer quantity, Double volume) {
        super(name, price, quantity, volume);
    }

    @Override
    public String toString() {
        return "Lemonade - " + super.toString();
    }
}
