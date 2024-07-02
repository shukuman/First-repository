package Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 1-число: ");
        String num1 = scan.nextLine();

        System.out.print("Введите операцию: ");
        String operation = scan.nextLine();

        System.out.print("Введите 2-число: ");
        String num2 = scan.nextLine();

        BigDecimal n1 = new BigDecimal(num1);
        BigDecimal n2 = new BigDecimal(num2);

        switch (operation) {
            case "+":
                System.out.println("Результат сложения: " + n1.add(n2).setScale(10, RoundingMode.HALF_UP));
                break;
            case "-":
                System.out.println("Результат вычитания: " + n1.subtract(n2).setScale(10,RoundingMode.HALF_UP));
                break;
            case "*":
                System.out.println("Результат умножения: " + n1.multiply(n2).setScale(10,RoundingMode.HALF_UP));
                break;
            case "/":
                System.out.println("Результат деления: " + n1.divide(n2, 10,RoundingMode.HALF_UP));
                break;
            default:
                System.out.println("Такой операции не существует");
                break;
        }
    }
}
