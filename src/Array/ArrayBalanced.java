package Array;

public class ArrayBalanced {
    public static boolean perfectlyBalanced(int[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length-1; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int l = 0; l < i; l++) {
                sumLeft += array[l];
            }

            for (int r = i + 1; r < array.length; r++) {
                sumRight += array[r];
            }

            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 5, 4};
        boolean result = perfectlyBalanced(nums);
        System.out.println(result);
       // возвращает "true" т.к сумма чисел слева и справа от "3" равны между собой
       // (1 + 2 + 6 = 9) и (5 + 4 = 9) соответственно
    }
}
