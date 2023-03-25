package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите год в формате \"yyyy\": ");

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(year % 400 == 0) {
            System.out.println("Количество дней 366");
        } else if(year % 100 == 0) {
            System.out.println("Количество дней 365");
        } else {
            if(year % 4 == 0) {
                System.out.println("Количество дней 366");
            } else {
                System.out.println("Количество дней 365");
            }
        }
    }
}
