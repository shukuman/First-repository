package Array;

import java.util.Arrays;

public class ArraySlice {
    public static int[] slice(int[] array, int from, int to) {
        int length = to - from;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[from + i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] slice = slice(numbers, 1, 4); // including "from", not including "to"
        System.out.println(Arrays.toString(slice));
    }
}
