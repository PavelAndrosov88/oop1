package lesson1;

public class ChildensGoods extends Goods {
    public ChildensGoods(String name, Double price, Integer quantity, Integer minAge, Boolean isHypoallergenic) {
        super(name, price, quantity, "шт.");
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Boolean getHypoallergenic() {
        return isHypoallergenic;
    }

    public void setHypoallergenic(Boolean hypoallergenic) {
        isHypoallergenic = hypoallergenic;
    }


    private Integer minAge;

    private Boolean isHypoallergenic;

    @Override
    public String toString() {
        return "ChildensGoods" +
                super.toString().replace("}", ", Минимальный возраст = " + minAge +
                        ", Гипоаллергенность = " + (isHypoallergenic ? "да" : "нет") + "}");
    }
}
