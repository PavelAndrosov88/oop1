package lesson1;

public class Diapers extends ChildensGoods {
    public Diapers(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic, String size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, quantity, minAge, isHypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    private String size;

    private Integer minWeight;

    private Integer maxWeight;


    private String type;

    @Override
    public String toString() {
        return "Diapers - " +
                super.toString().replace("}", ", Размер = " + size +
                        ", Минимальный вес = " + minWeight +
                        "кг, Максимальный вес = " + maxWeight +
                        "кг, Тип = " + type + "}");
    }
}
