package Array;

public class ArrayMedian {
    public static int median(int[] array) {
        int count = 0;
        int temp;
        while (count <= array.length) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            count++;
        }
        int length = array.length;
        if (length != 0) {
            if (length % 2 == 0) {
                return array[(length / 2) - 1];
            } else {
                return array[length / 2];
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int array[] = {7, 5, 9, 1, 4};
        System.out.println(median(array));
    }
}
