package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
//        float wallet = 0.0f;
//        float productPrice = 0.01f;
//
//        for (int i = 1; i <= 100; i++) {
//            wallet += productPrice;

//        BigDecimal wallet = new BigDecimal("0.0");
//        BigDecimal productPrice = new BigDecimal("0.01");
//
//        for (int i = 1; i <= 100; i++) {
//            wallet = wallet.add(productPrice);
//        }
//        System.out.println(wallet);
//
        BigDecimal num1 = new BigDecimal("25");
        BigDecimal num2 = new BigDecimal("7");

        BigDecimal result1 = num1.subtract(num2);
        BigDecimal result2 = num1.multiply(num2);
        BigDecimal result3 = num1.divide(num2, 3, RoundingMode.FLOOR);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

//        Double a = 1.5;
//        Double b = 1.50;
//        System.out.println(a.equals(b));
//
//        BigDecimal x = new BigDecimal("1.5");
//        BigDecimal y = new BigDecimal("1.50");
//        System.out.println(x.equals(y));
    }
}
