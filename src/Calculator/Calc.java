package Calculator;

public class Calc {
    int sum;

    public int calcMoneyIn(int[] myMoney) {
        for (int i : myMoney) {
            sum+=i;
        }
        return sum;
    }
}
