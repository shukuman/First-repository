package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result1 = c.sumWithReturn(5, 4);
        int result2 = c.minusWithReturn(10, 9);
        int result3 = c.multiplyWithReturn(7, 8);
        int result4 = c.divideWithReturn(16, 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println(result1 + result2 + result3 + result4);
    }
}
