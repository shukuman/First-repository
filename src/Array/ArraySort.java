package Array;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] array) {
        int temp;
        int count = 0;
        while (count < array.length) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,1,3,8,5,-17,25,101,-43};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
