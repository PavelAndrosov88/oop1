package lesson1;

import java.util.Date;

public class Milk extends Food {
    public Milk(String name, Double price, Integer quantity, Date exDate, Double fatPercent) {
        super(name, price, quantity, "шт.", exDate);
        this.fatPercent = fatPercent;
    }

    public Double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(Double fatPercent) {
        this.fatPercent = fatPercent;
    }


    private Double fatPercent;

    @Override
    public String toString() {
        return "Milk - " +
                super.toString().replace("}", ", Жирность = " + fatPercent + " %}");
    }
}
