package Array;

import java.util.Arrays;

public class ArrayReverse {
    public static void reverse(int[] array) {
        int first = 0;
        int last = array.length - 1;
        int temp;
        while (last > first) {
            temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            last--;
            first++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {15, 16, 25, 26, 2023, 1993, 1991, 2022};
        reverse(array);
    }
}
