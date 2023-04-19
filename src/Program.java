import lesson1.*;


import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        ArrayList<Goods> goodsM = new ArrayList<>();

        goodsM.add(new Bread("Дарницкий", 35.00, 1, new Date(123, 3, 20), "Пшеничная"));
        goodsM.add(new Eggs("Инские", 814.00, 10, new Date(123, 5, 10), 10));
        goodsM.add(new Milk("Домик в деревне", 1600.40, 20, new Date(123, 3, 25), 3.5));
        goodsM.add(new Lemonade("Бочкари", 39.30, 200, 500.0));
        goodsM.add(new Mask("Ночная", 20.60, 45, 5));
        goodsM.add(new ToiletPaper("Zewa", 150.00, 20, 6, 2));
        goodsM.add(new Diapers("Pampers", 250.00, 8, 0, true, "NB", 0, 5, "Одноразовые"));
        goodsM.add(new Pacifier("Соска", 25.00, 30, 1, false));


        for (Goods goods : goodsM) System.out.println(goods);

    }
}
