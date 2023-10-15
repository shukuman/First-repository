package Array;

public class ArrayStockBuy {
    public static void stockBuy(int m, int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == m) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        // m = 8, array = [8 7 3 1 3 10] -> 1 3 (array[1] = 7; array[3] = 1; 8 = 7 + 1)
        int[] nums = {8, 7, 3, 1, 3, 10};

        stockBuy(8, nums);
    }
}
