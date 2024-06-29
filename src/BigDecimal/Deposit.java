package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        String depositSum = scan.nextLine();

        System.out.print("Введите процентную ставку: ");
        String depositRate = scan.nextLine();

        System.out.print("Введите срок вклада в месяцах: ");
        String depositTerm = scan.nextLine();

        BigDecimal dSum = new BigDecimal(depositSum);
        BigDecimal dRate = new BigDecimal(depositRate);
        BigDecimal dTerm = new BigDecimal("12"); // процент годовых - 12 мес. в году

        int month = Integer.parseInt(depositTerm);

        for (int i = month; i > 0; i-- ) {
            dSum = dSum.add(dSum.multiply(dRate).divide(dTerm,2,RoundingMode.HALF_UP));
        }
        System.out.println("Сумма на депозите к концу срока: " + dSum);
    }
}
