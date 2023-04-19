package lesson1;

import java.util.Date;

public class Bread extends Food {
    public Bread(String name, Double price, Integer quantity, Date exDate, String flourType) {
        super(name, price, quantity, "шт.", exDate);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    private String flourType;

    @Override
    public String toString() {
        return "Bread - " +
                super.toString().replace("}", ", Тип муки = " + flourType + "}");
    }
}
