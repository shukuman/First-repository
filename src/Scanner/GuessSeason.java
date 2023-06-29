package Scanner;

import java.util.Scanner;
public class GuessSeason {
    public static void main(String[] args) {
        System.out.print("Угадай время года: ");
        Scanner scan = new Scanner(System.in);
        String season;

        while (true) {
            season = scan.nextLine();
            if (season.equals("Весна")) {
                System.out.println("Вы угадали сезон");
                break;
            } else if (season.equals("end")) {
                System.out.println("До свидания");
                break;
            } else {
                System.out.print("Попробуйте угадать еще раз: ");
            }
        }
    }
}
