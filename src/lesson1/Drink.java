package lesson1;

import java.util.Date;

public class Drink extends Goods {
    public Drink(String name, Double price, Integer quantity, Double volume) {
        super(name, price, quantity, "шт.");
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    private Double volume;

    @Override
    public String toString() {
        return "Drink - " +
                super.toString().replace("}", ", Объём = " + volume + " мл}");
    }
}
