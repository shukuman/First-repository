package Scanner;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1-число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите 2-число: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("Результат: " + sum);
    }
}
