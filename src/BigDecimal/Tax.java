package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Добро пожаловать! В ассортименте:\n" +
                "1. Пицца, 3990 тг\n" +
                "2. Сок, 1850 тг\n" +
                "3. Джинсы, 13200 тг\n" +
                "Выберите товар: ");
        String product = scan.nextLine();

        BigDecimal priceFood = new BigDecimal("3990");
        BigDecimal priceDrink = new BigDecimal("1850");
        BigDecimal priceClothes = new BigDecimal("13200");

        BigDecimal VAT = new BigDecimal("0.12"); // НДС

        BigDecimal taxFood = new BigDecimal("0.045"); //налог на еду
        BigDecimal taxDrink = new BigDecimal("0.056"); //налог на напиток
        BigDecimal taxClothes = new BigDecimal("0.098"); //налог на одежду

        BigDecimal sumFood = priceFood.add(priceFood.multiply(VAT)).add(priceFood.multiply(taxFood)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumDrink = priceDrink.add(priceDrink.multiply(VAT)).add(priceDrink.multiply(taxDrink)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumClothes = priceClothes.add(priceClothes.multiply(VAT)).add(priceFood.multiply(taxClothes)).setScale(2, RoundingMode.HALF_UP);

        switch (product) {
            case "1" -> System.out.println("К оплате: " + sumFood + " тг");
            case "2" -> System.out.println("К оплате: " + sumDrink + " тг");
            case "3" -> System.out.println("К оплате: " + sumClothes + " тг");
            default -> System.out.println("Такого товара нет");
        }
    }
}
