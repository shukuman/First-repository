package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalComparison {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("67891");
        BigDecimal b2 = new BigDecimal("67891.000");

        if (b1.compareTo(b2) == 0) {
            System.out.println(b1 + " и " + b2 + " равны");
        } else if (b1.compareTo(b2) > 0) {
            System.out.println(b1 + " больше чем " + b2);
        } else {
            System.out.println(b1 + " меньше чем " + b2);
        }
    }
}
