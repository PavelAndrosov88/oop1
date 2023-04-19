package lesson1;

public class Goods {
    public Goods(String name, Double price, Object quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    private String name;
    private Double price;
    private Object quantity;
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getQuantity() {
        return quantity;
    }

    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "{" +
                "Название = " + name +
                ", Цена = " + price +
                ", Количество = " + quantity +
                ", Единица измерения = " + unit +
                '}';
    }
}
