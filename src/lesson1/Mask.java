package lesson1;

public class Mask extends HygieneItems {
    public Mask(String name, Double price, Integer quantity, Integer quantityPerPackage) {
        super(name, price, quantity, quantityPerPackage);
    }

    @Override
    public String toString() {
        return "Mask - " + super.toString();
    }

}
