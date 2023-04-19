package lesson1;

public class HygieneItems extends Goods {
    public HygieneItems(String name, Double price, Integer quantity, Integer quantityPerPackage) {
        super(name, price, quantity, "уп.");
        this.quantityPerPackage = quantityPerPackage;
    }

    public Integer getQuantityPerPackage() {
        return quantityPerPackage;
    }

    public void setQuantityPerPackage(Integer quantityPerPackage) {
        this.quantityPerPackage = quantityPerPackage;
    }


    private Integer quantityPerPackage;

    @Override
    public String toString() {
        return "HygieneItems" +
                super.toString().replace("}", ", Количество в упаковке = " + quantityPerPackage + " шт.}");
    }
}
