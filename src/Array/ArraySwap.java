package Array;

import java.util.Arrays;

public class ArraySwap {
    public static void swap(int[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            return;
        }
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4};
        swap(nums, 1, 2);
    }
}
